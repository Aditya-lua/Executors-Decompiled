/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcda68
 */

/* std::__ndk1::ios_base::failure::failure(char const*, std::__ndk1::error_code const&) */

void __thiscall
std::__ndk1::ios_base::failure::failure(failure *this,char *param_1,error_code *param_2)

{
  system_error::system_error
            ((system_error *)this,*(undefined8 *)param_2,*(undefined8 *)(param_2 + 8),param_1);
  *(undefined ***)this = &PTR__failure_00cacbf0;
  return;
}

