/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984ac4
 */

/* ix::Socket::writeBytes(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::function<bool ()> const&) */

undefined8 __thiscall
ix::Socket::writeBytes(Socket *this,basic_string_conflict *param_1,function *param_2)

{
  basic_string_conflict *pbVar1;
  ulong uVar2;
  long lVar3;
  int *piVar4;
  int iVar5;
  uint uVar6;
  
  iVar5 = 0;
  uVar6 = (uint)((byte)*param_1 >> 1);
  if (((byte)*param_1 & 1) != 0) {
    uVar6 = *(uint *)(param_1 + 8);
  }
  do {
    while( true ) {
      if ((*(long **)(param_2 + 0x20) != (long *)0x0) &&
         (uVar2 = (**(code **)(**(long **)(param_2 + 0x20) + 0x30))(), (uVar2 & 1) != 0)) {
        return 0;
      }
      pbVar1 = param_1 + 1;
      if (((byte)*param_1 & 1) != 0) {
        pbVar1 = *(basic_string_conflict **)(param_1 + 0x10);
      }
      lVar3 = (**(code **)(*(long *)this + 0x28))(this,pbVar1 + iVar5,(long)(int)uVar6);
      if (0 < lVar3) break;
      if (-1 < lVar3) {
        return 0;
      }
      piVar4 = (int *)__errno();
      if ((*piVar4 != 0xb) && (*piVar4 != 0x73)) {
        return 0;
      }
    }
    if (lVar3 == (int)uVar6) {
      return 1;
    }
    iVar5 = iVar5 + (int)lVar3;
    uVar6 = uVar6 - (int)lVar3;
  } while( true );
}

