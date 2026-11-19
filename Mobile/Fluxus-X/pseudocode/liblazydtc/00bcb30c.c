/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb30c
 */

/* std::__ndk1::system_error::system_error(std::__ndk1::error_code, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::system_error::system_error
          (system_error *this,undefined8 param_2,undefined8 param_3,ulong *param_4)

{
  ulong local_60;
  ulong uStack_58;
  void *local_50;
  basic_string_conflict local_48;
  undefined7 uStack_47;
  void *local_38;
  undefined8 local_30;
  undefined8 uStack_28;
  
  local_30 = param_2;
  uStack_28 = param_3;
  if ((*param_4 & 1) == 0) {
    uStack_58 = param_4[1];
    local_60 = *param_4;
    local_50 = (void *)param_4[2];
  }
  else {
    FUN_007ff40c(&local_60,param_4[2],param_4[1]);
  }
                    /* try { // try from 00bcb350 to 00bcb35f has its CatchHandler @ 00bcb400 */
  FUN_00bcb424(&local_48,&local_30,&local_60);
                    /* try { // try from 00bcb360 to 00bcb36b has its CatchHandler @ 00bcb3c8 */
  runtime_error::runtime_error((runtime_error *)this,&local_48);
  if (((byte)local_48 & 1) != 0) {
    operator_delete(local_38,CONCAT71(uStack_47,local_48) & 0xfffffffffffffffe);
  }
  if ((local_60 & 1) != 0) {
    operator_delete(local_50,local_60 & 0xfffffffffffffffe);
  }
  *(undefined ***)this = &PTR__system_error_00cac9e0;
  *(undefined8 *)(this + 0x18) = uStack_28;
  *(undefined8 *)(this + 0x10) = local_30;
  return;
}

