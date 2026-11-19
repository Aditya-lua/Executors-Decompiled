/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb740
 */

/* std::__ndk1::system_error::system_error(int, std::__ndk1::error_category const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&) */

void __thiscall
std::__ndk1::system_error::system_error
          (system_error *this,int param_1,error_category *param_2,basic_string_conflict *param_3)

{
  ulong local_70;
  undefined8 uStack_68;
  void *local_60;
  int local_58 [2];
  error_category *local_50;
  basic_string_conflict local_48;
  undefined7 uStack_47;
  void *local_38;
  
  local_58[0] = param_1;
  local_50 = param_2;
  if (((byte)*param_3 & 1) == 0) {
    uStack_68 = *(undefined8 *)(param_3 + 8);
    local_70 = *(ulong *)param_3;
    local_60 = *(void **)(param_3 + 0x10);
  }
  else {
    FUN_007ff40c(&local_70,*(undefined8 *)(param_3 + 0x10),*(undefined8 *)(param_3 + 8));
  }
                    /* try { // try from 00bcb794 to 00bcb7a3 has its CatchHandler @ 00bcb848 */
  FUN_00bcb424(&local_48,local_58,&local_70);
                    /* try { // try from 00bcb7a4 to 00bcb7af has its CatchHandler @ 00bcb810 */
  runtime_error::runtime_error((runtime_error *)this,&local_48);
  if (((byte)local_48 & 1) != 0) {
    operator_delete(local_38,CONCAT71(uStack_47,local_48) & 0xfffffffffffffffe);
  }
  if ((local_70 & 1) != 0) {
    operator_delete(local_60,local_70 & 0xfffffffffffffffe);
  }
  *(int *)(this + 0x10) = param_1;
  *(undefined ***)this = &PTR__system_error_00cac9e0;
  *(error_category **)(this + 0x18) = param_2;
  return;
}

