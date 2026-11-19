/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968260
 */

void FUN_00968260(long param_1,uint param_2)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  byte bVar4;
  long lVar5;
  long lVar6;
  
  lVar6 = *(long *)(param_1 + 0x20);
  if (lVar6 != 0) {
    lVar3 = lVar6 + 800;
    lVar5 = param_1 + 0x5f8;
    if ((param_2 & 1) == 0) {
      lVar3 = lVar6 + 0x2a0;
      lVar5 = param_1 + 0x530;
    }
    bVar4 = *(byte *)(lVar3 + 0x79);
    bVar1 = (*(byte *)(lVar5 + 0x79) >> 1 & 1) << 1;
    *(byte *)(lVar3 + 0x79) = bVar4 & 0xfc | bVar4 & 1 | bVar1;
    bVar2 = *(byte *)(lVar5 + 0x79) & 1;
    *(byte *)(lVar3 + 0x79) = bVar4 & 0xfc | bVar1 | bVar2;
    *(byte *)(lVar3 + 0x79) = bVar4 & 0xf8 | bVar1 | bVar2 | *(byte *)(lVar5 + 0x79) & 4;
  }
  return;
}

