/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6cdc
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::compare(unsigned long, unsigned long, wchar_t const*, unsigned
   long) const */

uint __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::compare(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
          *this,ulong param_1,ulong param_2,wchar_t *param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  size_t __n;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar4;
  uint uVar5;
  
  bVar4 = *this;
  uVar1 = (ulong)((byte)bVar4 >> 1);
  if (((byte)bVar4 & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
  }
  if ((param_4 == 0xffffffffffffffff) || (uVar1 < param_1)) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  uVar2 = uVar1 - param_1;
  if (param_2 <= uVar1 - param_1) {
    uVar2 = param_2;
  }
  __n = param_4;
  if (uVar2 <= param_4) {
    __n = uVar2;
  }
  if (__n != 0) {
    pbVar3 = this + 4;
    if (((byte)bVar4 & 1) != 0) {
      pbVar3 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    uVar5 = wmemcmp((wchar_t *)(pbVar3 + param_1 * 4),param_3,__n);
    if (uVar5 != 0) {
      return uVar5;
    }
  }
  uVar5 = (uint)(param_4 < uVar2);
  if (uVar2 < param_4) {
    uVar5 = 0xffffffff;
  }
  return uVar5;
}

