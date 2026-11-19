/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097b7d4
 */

/* ix::gzipCompress(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::gzipCompress(ix *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  long lVar2;
  int iVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  long lVar4;
  ix *local_80c8;
  uint local_80c0;
  char *local_80b0;
  undefined4 local_80a8;
  ulong local_80a0;
  char acStack_8058 [32776];
  
  lVar2 = tpidr_el0;
  lVar4 = *(long *)(lVar2 + 0x28);
  memset(&local_80c8,0,0x70);
  deflateInit2_(&local_80c8,0xffffffff,8,0x1f,8,0,"1.3.1",0x70);
  if (((byte)*this & 1) == 0) {
    local_80c8 = this + 1;
    local_80c0 = (uint)((byte)*this >> 1);
  }
  else {
    local_80c8 = *(ix **)(this + 0x10);
    local_80c0 = (uint)*(undefined8 *)(this + 8);
  }
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  do {
    local_80a8 = 0x8000;
                    /* try { // try from 0097b884 to 0097b8bf has its CatchHandler @ 0097b904 */
    local_80b0 = acStack_8058;
    iVar3 = deflate(&local_80c8,4);
    uVar1 = (ulong)((byte)*in_x8 >> 1);
    if (((byte)*in_x8 & 1) != 0) {
      uVar1 = *(ulong *)(in_x8 + 8);
    }
    if (uVar1 <= local_80a0 && local_80a0 - uVar1 != 0) {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,acStack_8058,local_80a0 - uVar1);
    }
  } while (iVar3 == 0);
                    /* try { // try from 0097b8c4 to 0097b8cb has its CatchHandler @ 0097b900 */
  deflateEnd(&local_80c8);
  if (*(long *)(lVar2 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

