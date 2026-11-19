/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb680
 */

/* std::__ndk1::system_error::system_error(std::__ndk1::error_code) */

void __thiscall
std::__ndk1::system_error::system_error(system_error *this,ulong param_2,long *param_3)

{
  ulong local_48 [2];
  void *local_38;
  
  if ((int)param_2 == 0) {
    local_48[0] = 0;
    local_48[1] = 0;
    local_38 = (void *)0x0;
  }
  else {
    (**(code **)(*param_3 + 0x30))(local_48,param_3,param_2 & 0xffffffff);
  }
                    /* try { // try from 00bcb6cc to 00bcb6d7 has its CatchHandler @ 00bcb71c */
  runtime_error::runtime_error((runtime_error *)this,(basic_string_conflict *)local_48);
  if ((local_48[0] & 1) != 0) {
    operator_delete(local_38,local_48[0] & 0xfffffffffffffffe);
  }
  *(undefined ***)this = &PTR__system_error_00cac9e0;
  *(ulong *)(this + 0x10) = param_2;
  *(long **)(this + 0x18) = param_3;
  return;
}

