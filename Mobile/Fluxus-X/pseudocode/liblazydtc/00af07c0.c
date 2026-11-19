/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af07c0
 */

uchar * WHIRLPOOL(void *inp,size_t bytes,uchar *md)

{
  ulong uVar1;
  uchar *md_00;
  void *inp_00;
  ulong uVar2;
  WHIRLPOOL_CTX WStack_108;
  
  md_00 = (uchar *)0xd22791;
  if (md != (uchar *)0x0) {
    md_00 = md;
  }
  memset(&WStack_108,0,0xa8);
  if (bytes >> 0x3c != 0) {
    uVar1 = bytes + 0xf000000000000000;
    uVar2 = uVar1 & 0xf000000000000000;
    inp_00 = inp;
    do {
      WHIRLPOOL_BitUpdate(&WStack_108,inp_00,0x8000000000000000);
      bytes = bytes + 0xf000000000000000;
      inp_00 = (void *)((long)inp_00 + 0x1000000000000000);
    } while (bytes >> 0x3c != 0);
    bytes = uVar1 - uVar2;
    inp = (void *)((long)inp + uVar2 + 0x1000000000000000);
  }
  if (bytes != 0) {
    WHIRLPOOL_BitUpdate(&WStack_108,inp,bytes << 3);
  }
  WHIRLPOOL_Final(md_00,&WStack_108);
  return md_00;
}

