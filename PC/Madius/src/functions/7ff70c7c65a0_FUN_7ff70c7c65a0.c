/* 7ff70c7c65a0 FUN_7ff70c7c65a0 */

void FUN_7ff70c7c65a0(longlong param_1,undefined8 param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  longlong lVar7;
  undefined8 *puVar8;
  ulonglong uVar9;
  
  iVar1 = *(int *)(param_1 + 8);
  if (iVar1 < (int)param_3) {
    if (*(int *)(param_1 + 0xc) < (int)param_3) {
      uVar6 = FUN_7ff70c802100((longlong)(int)param_3 << 5);
      if (*(longlong *)(param_1 + 0x10) != 0) {
        FUN_7ff70cb12b60(uVar6,*(longlong *)(param_1 + 0x10),(longlong)*(int *)(param_1 + 8) << 5);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x10));
      }
      *(undefined8 *)(param_1 + 0x10) = uVar6;
      *(uint *)(param_1 + 0xc) = param_3;
    }
    *(uint *)(param_1 + 8) = param_3;
  }
  *(uint *)(param_1 + 4) = param_3;
  puVar3 = *(undefined8 **)(param_1 + 0x10);
  puVar3[2] = 0;
  puVar3[3] = 0;
  *puVar3 = 0;
  puVar3[1] = 0;
  if (1 < (int)param_3) {
    uVar9 = 1;
    lVar7 = 0x38;
    do {
      while( true ) {
        lVar4 = *(longlong *)(param_1 + 0x10);
        puVar3 = (undefined8 *)(lVar7 + lVar4);
        puVar8 = puVar3 + -3;
        if ((longlong)iVar1 <= (longlong)uVar9) break;
        if (*(int *)(lVar4 + -0x14 + lVar7) < 0) {
          uVar6 = FUN_7ff70c802100(0);
          lVar5 = *(longlong *)(lVar4 + -0x10 + lVar7);
          if (lVar5 != 0) {
            FUN_7ff70cb12b60(uVar6,lVar5,(longlong)*(int *)(lVar4 + -0x18 + lVar7) * 0x48);
            FUN_7ff70c802510();
          }
          *(undefined8 *)(lVar4 + -0x10 + lVar7) = uVar6;
          *(undefined4 *)(lVar4 + -0x14 + lVar7) = 0;
          *(undefined4 *)puVar8 = 0;
          lVar4 = *(longlong *)(param_1 + 0x10);
          iVar2 = *(int *)(lVar4 + -4 + lVar7);
        }
        else {
          *(undefined4 *)puVar8 = 0;
          lVar4 = *(longlong *)(param_1 + 0x10);
          iVar2 = *(int *)(lVar4 + -4 + lVar7);
        }
        if (iVar2 < 0) {
          uVar6 = FUN_7ff70c802100(0);
          if (*(longlong *)(lVar4 + lVar7) != 0) {
            FUN_7ff70cb12b60(uVar6,*(longlong *)(lVar4 + lVar7),
                             (longlong)*(int *)(lVar4 + -8 + lVar7) * 2);
            FUN_7ff70c802510();
          }
          *(undefined8 *)(lVar4 + lVar7) = uVar6;
          *(undefined4 *)(lVar4 + -4 + lVar7) = 0;
        }
        *(undefined4 *)(lVar4 + -8 + lVar7) = 0;
        uVar9 = uVar9 + 1;
        lVar7 = lVar7 + 0x20;
        if (param_3 == uVar9) {
          return;
        }
      }
      puVar3[-1] = 0;
      *puVar3 = 0;
      *puVar8 = 0;
      puVar3[-2] = 0;
      uVar9 = uVar9 + 1;
      lVar7 = lVar7 + 0x20;
    } while (param_3 != uVar9);
  }
  return;
}


