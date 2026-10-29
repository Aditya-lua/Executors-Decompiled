/* 7ff70c8c35a0 FUN_7ff70c8c35a0 */

undefined8 *
FUN_7ff70c8c35a0(undefined8 *param_1,undefined4 param_2,longlong *param_3,undefined8 param_4)

{
  undefined8 *puVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  longlong lVar9;
  ulonglong uVar10;
  longlong lVar11;
  undefined8 uStack_48;
  longlong *plStack_40;
  undefined8 *puStack_38;
  undefined8 uStack_30;
  
  uStack_30 = 0xfffffffffffffffe;
  *param_1 = &UNK_7ff70cb21e98;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 2;
  param_1[4] = 0xf;
  *(undefined2 *)(param_1 + 1) = 0x2b25;
  param_1[7] = 0;
  param_1[8] = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  lVar3 = *param_3;
  uVar5 = *(undefined4 *)((longlong)param_3 + 4);
  lVar11 = param_3[1];
  uVar6 = *(undefined4 *)((longlong)param_3 + 0xc);
  uVar7 = *(undefined4 *)((longlong)param_3 + 0x14);
  lVar9 = param_3[3];
  uVar8 = *(undefined4 *)((longlong)param_3 + 0x1c);
  *(int *)(param_1 + 7) = (int)param_3[2];
  *(undefined4 *)((longlong)param_1 + 0x3c) = uVar7;
  *(int *)(param_1 + 8) = (int)lVar9;
  *(undefined4 *)((longlong)param_1 + 0x44) = uVar8;
  *(int *)(param_1 + 5) = (int)lVar3;
  *(undefined4 *)((longlong)param_1 + 0x2c) = uVar5;
  *(int *)(param_1 + 6) = (int)lVar11;
  *(undefined4 *)((longlong)param_1 + 0x34) = uVar6;
  param_3[2] = 0;
  param_3[3] = 0xf;
  *(undefined1 *)param_3 = 0;
  *(undefined4 *)(param_1 + 9) = param_2;
  *(undefined1 *)((longlong)param_1 + 0x4c) = 1;
  param_1[0xf] = 0;
  param_1[0x10] = 0;
  param_1[0x11] = 0;
  param_1[0x12] = 0;
  puStack_38 = (undefined8 *)((ulonglong)puStack_38 & 0xffffffff00000000);
  plStack_40 = param_3;
  FUN_7ff70c8db210(param_1 + 0x13,&puStack_38,&uStack_48,param_4,param_1 + 1,param_1 + 5,
                   param_1 + 0x10,param_1 + 0x13);
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  *(undefined4 *)(param_1 + 0xe) = 0;
  puStack_38 = (undefined8 *)FUN_7ff70ca8ff40(0x58);
  puStack_38[1] = 0;
  puStack_38[2] = 0;
  *puStack_38 = &UNK_7ff70cb22068;
  puStack_38[3] = 0;
  puStack_38[4] = 0;
  puStack_38[5] = 0;
  puStack_38[6] = 0;
  puStack_38[7] = 0xf;
  puStack_38[9] = 0;
  puStack_38[10] = 0;
  puStack_38[8] = &UNK_7ff70cb22128;
  uStack_48 = 0;
  puVar1 = (undefined8 *)param_1[0x11];
  if (puVar1 == (undefined8 *)param_1[0x12]) {
    FUN_7ff70c8ce5f0(param_1 + 0x10,puVar1,&puStack_38);
    if (puStack_38 != (undefined8 *)0x0) {
      (**(code **)*puStack_38)(puStack_38,1);
    }
  }
  else {
    *puVar1 = puStack_38;
    param_1[0x11] = param_1[0x11] + 8;
  }
  uVar2 = plStack_40[3];
  if (0xf < uVar2) {
    lVar3 = *plStack_40;
    uVar10 = uVar2 + 1;
    lVar11 = lVar3;
    if (0xfff < uVar10) {
      lVar11 = *(longlong *)(lVar3 + -8);
      if (0x1f < (ulonglong)((lVar3 + -8) - lVar11)) {
                    /* WARNING: Does not return */
        pcVar4 = (code *)invalidInstructionException();
        (*pcVar4)();
      }
      uVar10 = uVar2 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar11,uVar10);
  }
  return param_1;
}


