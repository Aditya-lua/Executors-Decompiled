/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008450ec
 */

byte * FUN_008450ec(long param_1,byte *param_2,byte *param_3)

{
  byte bVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  byte *pbVar6;
  
  if (param_2 != param_3) {
    bVar1 = *param_2;
    uVar4 = (uint)bVar1;
    uVar3 = bVar1 - 0x30;
    if (uVar3 == 0) {
      FUN_00845824();
      return param_2 + 1;
    }
    if (bVar1 - 0x31 < 9) {
      pbVar6 = param_2 + 1;
      if ((pbVar6 != param_3) && (uVar5 = (uint)param_2[1], param_2[1] - 0x30 < 10)) {
        pbVar2 = param_2 + 2;
        do {
          pbVar6 = pbVar2;
          if (0x19999998 < uVar3) goto LAB_008451b8;
          uVar4 = uVar5 + uVar3 * 10;
          uVar3 = uVar4 - 0x30;
          if (pbVar6 == param_3) {
            pbVar6 = param_3;
            goto LAB_00845194;
          }
          uVar5 = (uint)*pbVar6;
          pbVar2 = pbVar6 + 1;
        } while (uVar5 - 0x30 < 10);
      }
LAB_00845194:
      if (uVar4 - 0x31 < *(uint *)(param_1 + 0x1c)) {
        FUN_008459b0();
        return pbVar6;
      }
LAB_008451b8:
                    /* WARNING: Subroutine does not return */
      FUN_00845964();
    }
  }
  return param_2;
}

