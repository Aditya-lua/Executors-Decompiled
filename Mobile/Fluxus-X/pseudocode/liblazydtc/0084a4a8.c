/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a4a8
 */

byte * FUN_0084a4a8(long param_1,byte *param_2,byte *param_3)

{
  undefined8 *puVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  byte *pbVar5;
  
  if (param_2 != param_3) {
    pbVar5 = param_2 + 1;
    uVar2 = (uint)*param_2;
    if ((pbVar5 != param_3) || (uVar2 != 0x24)) {
      if ((uVar2 - 0x2e < 0x2f) && ((1L << ((ulong)(uVar2 - 0x2e) & 0x3f) & 0x600000000001U) != 0))
      {
        if ((pbVar5 != param_3) && (uVar2 == 0x5c)) {
          uVar2 = *pbVar5 - 0x24;
          if ((uVar2 < 0x3b) && ((1L << ((ulong)uVar2 & 0x3f) & 0x580000000000441U) != 0)) {
            FUN_00845824(param_1,(uint)*pbVar5);
            return param_2 + 2;
          }
        }
        if (*param_2 != 0x2e) goto LAB_0084a4d4;
        puVar1 = operator_new(0x10);
        lVar3 = *(long *)(param_1 + 0x38);
        *(undefined8 **)(param_1 + 0x38) = puVar1;
        uVar4 = *(undefined8 *)(lVar3 + 8);
        *puVar1 = &PTR_LAB_00c49100;
        puVar1[1] = uVar4;
        *(undefined8 **)(lVar3 + 8) = puVar1;
      }
      else {
        FUN_00845824(param_1,*param_2);
      }
      return param_2 + 1;
    }
  }
LAB_0084a4d4:
  pbVar5 = (byte *)FUN_00844e3c();
  return pbVar5;
}

