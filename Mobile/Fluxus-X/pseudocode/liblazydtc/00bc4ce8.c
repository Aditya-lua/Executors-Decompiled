/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4ce8
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::compare(unsigned long, unsigned long, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long, unsigned
   long) const */

int __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,basic_string_conflict *param_3,ulong param_4,ulong param_5)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  size_t __n;
  ulong uVar4;
  basic_string_conflict *pbVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar6;
  int iVar7;
  int iVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar9;
  
  bVar6 = *this;
  uVar4 = *(ulong *)(param_3 + 8);
  pbVar5 = *(basic_string_conflict **)(param_3 + 0x10);
  if (((byte)*param_3 & 1) == 0) {
    pbVar5 = param_3 + 1;
    uVar4 = (ulong)((byte)*param_3 >> 1);
  }
  uVar3 = (ulong)((byte)bVar6 >> 1);
  if (((byte)bVar6 & 1) != 0) {
    uVar3 = *(ulong *)(this + 8);
  }
  if (param_1 <= uVar3) {
    uVar2 = uVar3 - param_1;
    if (param_2 <= uVar3 - param_1) {
      uVar2 = param_2;
    }
    if (param_4 <= uVar4) {
      pbVar9 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
      if (((byte)bVar6 & 1) == 0) {
        pbVar9 = this + 1;
      }
      uVar3 = uVar4 - param_4;
      if (param_5 <= uVar4 - param_4) {
        uVar3 = param_5;
      }
      __n = uVar3;
      if (uVar2 <= uVar3) {
        __n = uVar2;
      }
      iVar7 = memcmp(pbVar9 + param_1,pbVar5 + param_4,__n);
      iVar8 = 1;
      if (uVar2 < uVar3) {
        iVar8 = -1;
      }
      iVar1 = 0;
      if (uVar2 != uVar3) {
        iVar1 = iVar8;
      }
      if (iVar7 == 0) {
        iVar7 = iVar1;
      }
      return iVar7;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0080c8d0("string_view::substr");
}

