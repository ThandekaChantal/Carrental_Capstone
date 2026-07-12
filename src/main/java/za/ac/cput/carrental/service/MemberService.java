/*MemberService.java
Author: Stephanie Tola Oluwafemi Lewu
Student Number: 230211216
07 July 2026
 */

package za.ac.cput.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.carrental.domain.Member;
import za.ac.cput.carrental.factory.MemberFactory;
import za.ac.cput.carrental.repository.MemberRepository;

import java.util.List;

@Service
public class MemberService implements IMemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public Member create(String memberId,
                         String name,
                         String licenseNumber,
                         String phoneNumber,
                         String accountStatus) {

        Member member = MemberFactory.createMember(memberId, name, licenseNumber, phoneNumber, accountStatus);
        return memberRepository.save(member);
    }

    @Override
    public Member read(String memberId){return memberRepository.findById(memberId).orElse(null);}

    @Override
    public Member update(Member member){
    return memberRepository.save(member);
    }

    @Override
    public boolean delete(String memberId){
        if (memberRepository.existsById(memberId)) {
            memberRepository.deleteById(memberId);
            return true;
        }
        return false;
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }
}



