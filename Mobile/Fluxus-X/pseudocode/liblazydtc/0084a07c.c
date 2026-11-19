/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a07c
 */

byte * FUN_0084a07c(long param_1,byte *param_2,byte *param_3)

{
  int iVar1;
  byte bVar2;
  bool bVar3;
  byte *pbVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  undefined8 uVar7;
  long lVar8;
  int iVar9;
  
  pbVar4 = (byte *)FUN_0084a4a8();
  if ((((param_2 == pbVar4) && (pbVar4 != param_3)) && (pbVar4 + 1 != param_3)) && (*pbVar4 == 0x5c)
     ) {
    if (pbVar4[1] == 0x28) {
      pbVar4 = pbVar4 + (ulong)(pbVar4[1] == 0x28) * 2;
      if ((*(byte *)(param_1 + 0x18) >> 1 & 1) == 0) {
        puVar5 = operator_new(0x18);
        lVar8 = *(long *)(param_1 + 0x38);
        *(undefined8 **)(param_1 + 0x38) = puVar5;
        iVar9 = *(int *)(param_1 + 0x1c) + 1;
        uVar7 = *(undefined8 *)(lVar8 + 8);
        *(int *)(param_1 + 0x1c) = iVar9;
        *(int *)(puVar5 + 2) = iVar9;
        *puVar5 = &PTR_LAB_00c48f08;
        puVar5[1] = uVar7;
        *(undefined8 **)(lVar8 + 8) = puVar5;
      }
      else {
        iVar9 = *(int *)(param_1 + 0x1c);
      }
      do {
        if (pbVar4 == param_3) {
LAB_0084a1d4:
          pbVar6 = pbVar4;
          break;
        }
        uVar7 = *(undefined8 *)(param_1 + 0x38);
        iVar1 = *(int *)(param_1 + 0x1c);
        pbVar6 = (byte *)FUN_0084a07c(param_1,pbVar4,param_3);
        if (pbVar6 == pbVar4) goto LAB_0084a1d4;
        pbVar6 = (byte *)FUN_0084a268(param_1,pbVar6,param_3,uVar7,iVar1 + 1,
                                      *(int *)(param_1 + 0x1c) + 1);
        bVar3 = pbVar6 != pbVar4;
        pbVar4 = pbVar6;
      } while (bVar3);
      if (((pbVar6 == param_3) || (pbVar6 + 1 == param_3)) ||
         ((*pbVar6 != 0x5c || (pbVar6[1] != 0x29)))) {
                    /* WARNING: Subroutine does not return */
        FUN_008437a0();
      }
      pbVar4 = pbVar6 + (ulong)(pbVar6[1] == 0x29) * 2;
      if ((*(byte *)(param_1 + 0x18) >> 1 & 1) == 0) {
        puVar5 = operator_new(0x18);
        lVar8 = *(long *)(param_1 + 0x38);
        *(int *)(puVar5 + 2) = iVar9;
        uVar7 = *(undefined8 *)(lVar8 + 8);
        *(undefined8 **)(param_1 + 0x38) = puVar5;
        *puVar5 = &PTR_LAB_00c48f50;
        puVar5[1] = uVar7;
        *(undefined8 **)(lVar8 + 8) = puVar5;
      }
    }
    else if (((*pbVar4 == 0x5c) &&
             ((bVar2 = pbVar4[1], (bVar2 & 0xf8) == 0x30 || ((bVar2 & 0xfe) == 0x38)))) &&
            (bVar2 - 0x31 < 9)) {
      if (*(uint *)(param_1 + 0x1c) < bVar2 - 0x30) {
                    /* WARNING: Subroutine does not return */
        FUN_00845964();
      }
      FUN_008459b0(param_1);
      pbVar4 = pbVar4 + 2;
    }
  }
  return pbVar4;
}

