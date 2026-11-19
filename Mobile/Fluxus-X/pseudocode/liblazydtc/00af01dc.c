/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af01dc
 */

int WHIRLPOOL_Update(WHIRLPOOL_CTX *c,void *inp,size_t bytes)

{
  ulong uVar1;
  void *inp_00;
  ulong uVar2;
  
  if (bytes >> 0x3c != 0) {
    uVar1 = bytes + 0xf000000000000000;
    uVar2 = uVar1 & 0xf000000000000000;
    inp_00 = inp;
    do {
      WHIRLPOOL_BitUpdate(c,inp_00,0x8000000000000000);
      bytes = bytes + 0xf000000000000000;
      inp_00 = (void *)((long)inp_00 + 0x1000000000000000);
    } while (bytes >> 0x3c != 0);
    bytes = uVar1 - uVar2;
    inp = (void *)((long)inp + uVar2 + 0x1000000000000000);
  }
  if (bytes != 0) {
    WHIRLPOOL_BitUpdate(c,inp,bytes << 3);
  }
  return 1;
}

