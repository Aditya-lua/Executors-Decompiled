/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a8a0
 */

byte * FUN_0084a8a0(long param_1,byte *param_2,byte *param_3)

{
  uint uVar1;
  byte *pbVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  
  if (param_2 == param_3) {
    pbVar2 = (byte *)FUN_0084a9b4(param_1,param_2,param_3);
    if (pbVar2 != param_2) {
      return pbVar2;
    }
    goto LAB_0084a95c;
  }
  uVar1 = *param_2 - 0x24;
  if (uVar1 < 0x3b) {
    if ((1L << ((ulong)uVar1 & 0x3f) & 0x5800000080004d1U) == 0) {
      if ((ulong)uVar1 != 5) goto LAB_0084a98c;
      if (*(int *)(param_1 + 0x24) != 0) goto LAB_0084a8f0;
      goto LAB_0084a998;
    }
  }
  else {
LAB_0084a98c:
    if (1 < *param_2 - 0x7b) {
LAB_0084a998:
      FUN_00845824(param_1);
      goto LAB_0084a9a0;
    }
  }
LAB_0084a8f0:
  pbVar2 = (byte *)FUN_0084a9b4(param_1,param_2,param_3);
  if (pbVar2 != param_2) {
    return pbVar2;
  }
  if (*pbVar2 != 0x2e) {
LAB_0084a95c:
    pbVar2 = (byte *)FUN_00844e3c(param_1,param_2,param_3);
    return pbVar2;
  }
  puVar3 = operator_new(0x10);
  lVar4 = *(long *)(param_1 + 0x38);
  *(undefined8 **)(param_1 + 0x38) = puVar3;
  uVar5 = *(undefined8 *)(lVar4 + 8);
  *puVar3 = &PTR_LAB_00c49100;
  puVar3[1] = uVar5;
  *(undefined8 **)(lVar4 + 8) = puVar3;
  param_2 = pbVar2;
LAB_0084a9a0:
  return param_2 + 1;
}

