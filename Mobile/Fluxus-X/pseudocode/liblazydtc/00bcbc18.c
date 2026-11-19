/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbc18
 */

/* std::__ndk1::error_category::equivalent(int, std::__ndk1::error_condition const&) const */

bool __thiscall
std::__ndk1::error_category::equivalent(error_category *this,int param_1,error_condition *param_2)

{
  int iVar1;
  long extraout_x1;
  
  iVar1 = (**(code **)(*(long *)this + 0x18))(this,param_1);
  return *(long *)(param_2 + 8) == extraout_x1 && *(int *)param_2 == iVar1;
}

