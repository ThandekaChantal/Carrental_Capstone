/*IMemberService.java
Author: Stephanie Tola Oluwafemi Lewu
Student Number: 230211216
07 July 2026
 */

package za.ac.cput.carrental.service;

import za.ac.cput.carrental.domain.Member;

import java.util.List;

public interface IMemberService {
    Member create(String memberId,
                  String name,
                  String licenseNumber,
                  String phoneNumber,
                  String accountStatus);

    Member read(String memberId);

    Member update(Member member);

    boolean delete(String memberId);

    List<Member> getAll();
}
