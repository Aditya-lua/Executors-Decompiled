/* 7ff70c927b80 FUN_7ff70c927b80 */

void FUN_7ff70c927b80(undefined4 *param_1,longlong param_2)

{
  code *pcVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  longlong lVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  longlong lVar11;
  undefined4 uVar12;
  undefined4 uStack_38;
  undefined4 uStack_34;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  undefined4 uStack_24;
  undefined4 uStack_20;
  undefined4 uStack_1c;
  undefined8 uStack_10;
  
  uStack_10 = 0xfffffffffffffffe;
  if (0x20 < param_2 - (longlong)param_1) {
    uStack_38 = *(undefined4 *)(param_2 + -0x20);
    uStack_34 = *(undefined4 *)(param_2 + -0x1c);
    uStack_30 = *(undefined4 *)(param_2 + -0x18);
    uStack_2c = *(undefined4 *)(param_2 + -0x14);
    uStack_28 = *(undefined4 *)(param_2 + -0x10);
    uStack_24 = *(undefined4 *)(param_2 + -0xc);
    uStack_20 = *(undefined4 *)(param_2 + -8);
    uStack_1c = *(undefined4 *)(param_2 + -4);
    *(undefined8 *)(param_2 + -0x10) = 0;
    *(undefined8 *)(param_2 + -8) = 0xf;
    *(undefined1 *)(param_2 + -0x20) = 0;
    lVar11 = (param_2 + -0x20) - (longlong)param_1;
    uVar12 = uStack_38;
    if (lVar11 != 0) {
      *(undefined8 *)(param_2 + -0x10) = 0;
      *(undefined8 *)(param_2 + -8) = 0xf;
      *(undefined1 *)(param_2 + -0x20) = 0;
      uVar12 = *param_1;
      uVar2 = param_1[1];
      uVar3 = param_1[2];
      uVar4 = param_1[3];
      uVar5 = param_1[5];
      uVar6 = param_1[6];
      uVar7 = param_1[7];
      *(undefined4 *)(param_2 + -0x10) = param_1[4];
      *(undefined4 *)(param_2 + -0xc) = uVar5;
      *(undefined4 *)(param_2 + -8) = uVar6;
      *(undefined4 *)(param_2 + -4) = uVar7;
      *(undefined4 *)(param_2 + -0x20) = uVar12;
      *(undefined4 *)(param_2 + -0x1c) = uVar2;
      *(undefined4 *)(param_2 + -0x18) = uVar3;
      *(undefined4 *)(param_2 + -0x14) = uVar4;
      *(undefined8 *)(param_1 + 4) = 0;
      *(undefined8 *)(param_1 + 6) = 0xf;
      *(undefined1 *)param_1 = 0;
    }
    FUN_7ff70c927780(uVar12,0,lVar11 >> 5,&uStack_38);
    uVar9 = CONCAT44(uStack_1c,uStack_20);
    if (0xf < uVar9) {
      lVar8 = CONCAT44(uStack_34,uStack_38);
      uVar10 = uVar9 + 1;
      lVar11 = lVar8;
      if (0xfff < uVar10) {
        lVar11 = *(longlong *)(lVar8 + -8);
        if (0x1f < (ulonglong)((lVar8 + -8) - lVar11)) {
                    /* WARNING: Does not return */
          pcVar1 = (code *)invalidInstructionException();
          (*pcVar1)();
        }
        uVar10 = uVar9 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar11,uVar10);
    }
  }
  return;
}


