/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6f98
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::compare(unsigned long, unsigned long,
   std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&, unsigned long, unsigned long) const */

int __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::compare(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
          *this,ulong param_1,ulong param_2,basic_string_conflict *param_3,ulong param_4,
         ulong param_5)

{
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  ulong uVar3;
  ulong uVar4;
  size_t __n;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar5;
  basic_string_conflict *pbVar6;
  int iVar7;
  int iVar8;
  
  bVar5 = *this;
  uVar1 = (ulong)((byte)*param_3 >> 1);
  pbVar6 = param_3 + 4;
  if (((byte)*param_3 & 1) != 0) {
    uVar1 = *(ulong *)(param_3 + 8);
    pbVar6 = *(basic_string_conflict **)(param_3 + 0x10);
  }
  uVar4 = (ulong)((byte)bVar5 >> 1);
  if (((byte)bVar5 & 1) != 0) {
    uVar4 = *(ulong *)(this + 8);
  }
  if (param_1 <= uVar4) {
    pbVar2 = this + 4;
    if (((byte)bVar5 & 1) != 0) {
      pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    uVar3 = uVar4 - param_1;
    if (param_2 <= uVar4 - param_1) {
      uVar3 = param_2;
    }
    if (param_4 <= uVar1) {
      uVar4 = uVar1 - param_4;
      if (param_5 <= uVar1 - param_4) {
        uVar4 = param_5;
      }
      __n = uVar4;
      if (uVar3 <= uVar4) {
        __n = uVar3;
      }
      if ((__n == 0) ||
         (iVar7 = wmemcmp((wchar_t *)(pbVar2 + param_1 * 4),(wchar_t *)(pbVar6 + param_4 * 4),__n),
         iVar7 == 0)) {
        iVar8 = 1;
        if (uVar3 < uVar4) {
          iVar8 = -1;
        }
        iVar7 = 0;
        if (uVar3 != uVar4) {
          iVar7 = iVar8;
        }
      }
      return iVar7;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0080c8d0("string_view::substr");
}

