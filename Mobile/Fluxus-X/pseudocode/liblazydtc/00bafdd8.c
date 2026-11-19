/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafdd8
 */

long ZSTD_frameHeaderSize(long param_1,ulong param_2)

{
  long lVar1;
  byte bVar2;
  
  if (param_2 < 5) {
    return -0x48;
  }
  bVar2 = *(byte *)(param_1 + 4);
  lVar1 = *(long *)(&DAT_00364d50 + ((ulong)bVar2 & 3) * 8) +
          *(long *)(&DAT_00364e90 + (ulong)(bVar2 >> 6) * 8);
  if ((bVar2 & 0x20) == 0) {
    lVar1 = lVar1 + 1;
  }
  return lVar1 + (ulong)((uint)(bVar2 < 0x40) & (bVar2 & 0x20) >> 5) + 5;
}

