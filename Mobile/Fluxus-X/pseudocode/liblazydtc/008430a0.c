/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008430a0
 */

byte * FUN_008430a0(long param_1,byte *param_2,byte *param_3)

{
  byte bVar1;
  undefined8 *puVar2;
  byte *pbVar3;
  uint uVar4;
  long lVar5;
  undefined8 uVar6;
  byte *unaff_x19;
  long unaff_x20;
  int iVar7;
  byte *unaff_x21;
  byte *unaff_x22;
  
  if (param_2 == param_3) {
    return param_2;
  }
  bVar1 = *param_2;
  uVar4 = (uint)bVar1;
  if (bVar1 < 0x3f) {
    if (uVar4 == 0x28) {
      pbVar3 = param_2 + 1;
      if (pbVar3 == param_3) {
LAB_0084332c:
                    /* WARNING: Subroutine does not return */
        FUN_008437a0();
      }
      if (((param_2 + 2 == param_3) || (*pbVar3 != 0x3f)) || (param_2[2] != 0x3a)) {
        if ((*(byte *)(param_1 + 0x18) >> 1 & 1) == 0) {
          puVar2 = operator_new(0x18);
          lVar5 = *(long *)(param_1 + 0x38);
          iVar7 = *(int *)(param_1 + 0x1c) + 1;
          uVar6 = *(undefined8 *)(lVar5 + 8);
          *(int *)(param_1 + 0x1c) = iVar7;
          *(int *)(puVar2 + 2) = iVar7;
          *puVar2 = &PTR_LAB_00c48f08;
          puVar2[1] = uVar6;
          *(undefined8 **)(lVar5 + 8) = puVar2;
          *(undefined8 **)(param_1 + 0x38) = puVar2;
        }
        else {
          iVar7 = *(int *)(param_1 + 0x1c);
        }
        *(int *)(param_1 + 0x24) = *(int *)(param_1 + 0x24) + 1;
        param_2 = (byte *)FUN_008422f0(param_1,pbVar3);
        if ((param_2 == param_3) || (*param_2 != 0x29)) goto LAB_0084332c;
        if ((*(byte *)(param_1 + 0x18) >> 1 & 1) == 0) {
          puVar2 = operator_new(0x18);
          lVar5 = *(long *)(param_1 + 0x38);
          *(int *)(puVar2 + 2) = iVar7;
          uVar6 = *(undefined8 *)(lVar5 + 8);
          *(undefined8 **)(param_1 + 0x38) = puVar2;
          *puVar2 = &PTR_LAB_00c48f50;
          puVar2[1] = uVar6;
          *(undefined8 **)(lVar5 + 8) = puVar2;
        }
        *(int *)(param_1 + 0x24) = *(int *)(param_1 + 0x24) + -1;
      }
      else {
        *(int *)(param_1 + 0x24) = *(int *)(param_1 + 0x24) + 1;
        param_2 = (byte *)FUN_008422f0(param_1,param_2 + 3);
        if ((param_2 == param_3) || (*param_2 != 0x29)) goto LAB_0084332c;
        *(int *)(param_1 + 0x24) = *(int *)(param_1 + 0x24) + -1;
      }
LAB_008432dc:
      return param_2 + 1;
    }
    if (uVar4 == 0x2e) {
      puVar2 = operator_new(0x10);
      lVar5 = *(long *)(param_1 + 0x38);
      *(undefined8 **)(param_1 + 0x38) = puVar2;
      uVar6 = *(undefined8 *)(lVar5 + 8);
      *puVar2 = &PTR_LAB_00c48cc8;
      puVar2[1] = uVar6;
      *(undefined8 **)(lVar5 + 8) = puVar2;
      goto LAB_008432dc;
    }
    if (1 < uVar4 - 0x2a) goto LAB_0084324c;
  }
  else if (bVar1 < 0x5c) {
    if (bVar1 == 0x5b) {
      pbVar3 = (byte *)FUN_00844e3c();
      return pbVar3;
    }
    if (uVar4 != 0x3f) {
LAB_0084324c:
      pbVar3 = (byte *)FUN_00844fec();
      return pbVar3;
    }
  }
  else {
    if (bVar1 == 0x5c) {
      unaff_x19 = param_2 + 1;
      if (unaff_x19 == param_3) {
                    /* WARNING: Subroutine does not return */
        FUN_008450a0();
      }
      pbVar3 = (byte *)FUN_008450ec(param_1,unaff_x19);
      if ((pbVar3 != unaff_x19) ||
         (pbVar3 = (byte *)FUN_008451bc(param_1,unaff_x19,param_3), pbVar3 != unaff_x19)) {
        return pbVar3;
      }
      goto LAB_0084330c;
    }
    if (bVar1 != 0x7b) goto LAB_0084324c;
  }
  FUN_00844fa0();
  param_1 = unaff_x20;
  param_3 = unaff_x21;
  param_2 = unaff_x22;
LAB_0084330c:
  pbVar3 = (byte *)FUN_008453c8(param_1,unaff_x19,param_3,0);
  if (pbVar3 != unaff_x19) {
    param_2 = pbVar3;
  }
  return param_2;
}

