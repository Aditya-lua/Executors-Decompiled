/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf3324
 */

/* std::__ndk1::messages<wchar_t>::do_get(long, int, int, std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&) const */

void std::__ndk1::messages<wchar_t>::do_get
               (long param_1,int param_2,int param_3,basic_string_conflict *param_4)

{
  byte *in_x4;
  undefined8 *in_x8;
  undefined8 uVar1;
  undefined8 uVar2;
  
  if ((*in_x4 & 1) == 0) {
    uVar2 = *(undefined8 *)in_x4;
    uVar1 = *(undefined8 *)(in_x4 + 0x10);
    in_x8[1] = *(undefined8 *)(in_x4 + 8);
    *in_x8 = uVar2;
    in_x8[2] = uVar1;
    return;
  }
  FUN_00bc5654();
  return;
}

