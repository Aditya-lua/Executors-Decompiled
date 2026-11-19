/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc7578
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::insert(unsigned long, std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&, unsigned long,
   unsigned long) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::insert(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,ulong param_1,basic_string_conflict *param_2,ulong param_3,ulong param_4)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  ulong uVar3;
  basic_string_conflict bVar4;
  
  bVar4 = *param_2;
  uVar1 = (ulong)((byte)bVar4 >> 1);
  if (((byte)bVar4 & 1) != 0) {
    uVar1 = *(ulong *)(param_2 + 8);
  }
  if (uVar1 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  pbVar2 = param_2 + 4;
  if (((byte)bVar4 & 1) != 0) {
    pbVar2 = *(basic_string_conflict **)(param_2 + 0x10);
  }
  uVar3 = uVar1 - param_3;
  if (param_4 <= uVar1 - param_3) {
    uVar3 = param_4;
  }
  insert(this,param_1,(wchar_t *)(pbVar2 + param_3 * 4),uVar3);
  return;
}

