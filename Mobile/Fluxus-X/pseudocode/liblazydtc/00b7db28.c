/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7db28
 */

long mbedtls_mpi_lsb(long *param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  
  if ((ulong)*(ushort *)((long)param_1 + 10) != 0) {
    lVar1 = 0;
    uVar2 = 0;
    do {
      uVar3 = *(ulong *)(*param_1 + uVar2 * 8);
      if (uVar3 != 0) {
        uVar2 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
        uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
        uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
        uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
        return LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) + lVar1;
      }
      uVar2 = uVar2 + 1;
      lVar1 = lVar1 + 0x40;
    } while (uVar2 < *(ushort *)((long)param_1 + 10));
  }
  return 0;
}

