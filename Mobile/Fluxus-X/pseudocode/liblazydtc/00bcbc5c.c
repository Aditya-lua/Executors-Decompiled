/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbc5c
 */

/* std::__ndk1::error_category::equivalent(std::__ndk1::error_code const&, int) const */

bool __thiscall
std::__ndk1::error_category::equivalent(error_category *this,error_code *param_1,int param_2)

{
  return this == *(error_category **)(param_1 + 8) && *(int *)param_1 == param_2;
}

