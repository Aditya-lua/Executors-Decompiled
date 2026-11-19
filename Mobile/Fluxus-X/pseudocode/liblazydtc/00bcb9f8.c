/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb9f8
 */

/* std::__ndk1::system_error::system_error(int, std::__ndk1::error_category const&) */

void __thiscall
std::__ndk1::system_error::system_error(system_error *this,int param_1,error_category *param_2)

{
  ulong local_48 [2];
  void *local_38;
  
  if (param_1 == 0) {
    local_48[0] = 0;
    local_48[1] = 0;
    local_38 = (void *)0x0;
  }
  else {
    (**(code **)(*(long *)param_2 + 0x30))(local_48,param_2,param_1);
  }
                    /* try { // try from 00bcba44 to 00bcba4f has its CatchHandler @ 00bcba98 */
  runtime_error::runtime_error((runtime_error *)this,(basic_string_conflict *)local_48);
  if ((local_48[0] & 1) != 0) {
    operator_delete(local_38,local_48[0] & 0xfffffffffffffffe);
  }
  *(int *)(this + 0x10) = param_1;
  *(undefined ***)this = &PTR__system_error_00cac9e0;
  *(error_category **)(this + 0x18) = param_2;
  return;
}

