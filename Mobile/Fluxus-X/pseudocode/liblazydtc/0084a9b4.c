/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a9b4
 */

byte * FUN_0084a9b4(long param_1,byte *param_2,byte *param_3)

{
  long lVar1;
  byte bVar2;
  uint uVar3;
  byte *pbVar4;
  ulong uVar5;
  
  if (((param_2 != param_3) && (pbVar4 = param_2 + 1, pbVar4 != param_3)) && (*param_2 == 0x5c)) {
    bVar2 = *pbVar4;
    uVar3 = bVar2 - 0x24;
    if (((uVar3 < 0x3b) && ((1L << ((ulong)uVar3 & 0x3f) & 0x5800000080004f1U) != 0)) ||
       (bVar2 - 0x7b < 3)) {
      FUN_00845824(param_1,bVar2);
      param_2 = param_2 + 2;
    }
    else {
      if ((*(uint *)(param_1 + 0x18) & 0x1f0) == 0x40) {
        pbVar4 = (byte *)FUN_008481f4(param_1,pbVar4,param_3,0);
        return pbVar4;
      }
      uVar5 = FUN_0084a664(param_1,bVar2);
      lVar1 = 2;
      if ((uVar5 & 1) == 0) {
        lVar1 = 0;
      }
      param_2 = param_2 + lVar1;
    }
  }
  return param_2;
}

