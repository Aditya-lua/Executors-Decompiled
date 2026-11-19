/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc61e4
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::assign(std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&, unsigned long,
   unsigned long) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::assign(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,basic_string_conflict *param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  basic_string_conflict *pbVar3;
  basic_string_conflict bVar4;
  
  bVar4 = *param_1;
  uVar1 = (ulong)((byte)bVar4 >> 1);
  if (((byte)bVar4 & 1) != 0) {
    uVar1 = *(ulong *)(param_1 + 8);
  }
  if (uVar1 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  uVar2 = uVar1 - param_2;
  if (param_3 <= uVar1 - param_2) {
    uVar2 = param_3;
  }
  pbVar3 = param_1 + 4;
  if (((byte)bVar4 & 1) != 0) {
    pbVar3 = *(basic_string_conflict **)(param_1 + 0x10);
  }
  FUN_00bc5e50(this,pbVar3 + param_2 * 4,uVar2);
  return;
}

