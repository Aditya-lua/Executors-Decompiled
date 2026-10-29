/* 7ff70c96bff0 FUN_7ff70c96bff0 */

longlong FUN_7ff70c96bff0(ulonglong *param_1,ulonglong param_2,undefined4 *param_3)

{
  undefined4 *puVar1;
  ulonglong uVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  
  uVar2 = *param_1;
  uVar11 = ((longlong)(param_1[1] - uVar2) >> 3) * -0x5555555555555555 + 1;
  uVar8 = ((longlong)(param_1[2] - uVar2) >> 3) * -0x5555555555555555;
  uVar10 = 0xaaaaaaaaaaaaaaa - (uVar8 >> 1);
  uVar12 = (uVar8 >> 1) + uVar8;
  if (uVar12 <= uVar11) {
    uVar12 = uVar11;
  }
  if (uVar10 <= uVar8 && uVar8 - uVar10 != 0) {
    uVar12 = 0xaaaaaaaaaaaaaaa;
  }
  if (uVar12 < 0xaaaaaaaaaaaaaab) {
    if (uVar12 == 0) {
      uVar8 = 0;
    }
    else if (uVar12 < 0xab) {
      uVar8 = FUN_7ff70ca8ff40(uVar12 * 0x18);
    }
    else {
      if (uVar12 == 0xaaaaaaaaaaaaaaa) goto LAB_7ff70c96c183;
      lVar7 = FUN_7ff70ca8ff40(uVar12 * 0x18 + 0x27);
      uVar8 = lVar7 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar8 - 8) = lVar7;
    }
    lVar7 = param_2 - uVar2;
    *(undefined8 *)(uVar8 + 0x10 + lVar7) = *(undefined8 *)(param_3 + 4);
    uVar4 = param_3[1];
    uVar5 = param_3[2];
    uVar6 = param_3[3];
    puVar1 = (undefined4 *)(uVar8 + lVar7);
    *puVar1 = *param_3;
    puVar1[1] = uVar4;
    puVar1[2] = uVar5;
    puVar1[3] = uVar6;
    if (param_2 == param_1[1]) {
      FUN_7ff70cb12b60(uVar8,*param_1,param_2 - *param_1);
      uVar2 = *param_1;
    }
    else {
      FUN_7ff70cb12b60(uVar8,*param_1,param_2 - *param_1);
      FUN_7ff70cb12b60(uVar8 + lVar7 + 0x18,param_2,param_1[1] - param_2);
      uVar2 = *param_1;
    }
    if (uVar2 != 0) {
      uVar9 = param_1[2] - uVar2;
      uVar10 = uVar2;
      if (0xfff < uVar9) {
        uVar10 = *(ulonglong *)(uVar2 - 8);
        if (0x1f < (uVar2 - 8) - uVar10) goto LAB_7ff70c96c188;
        uVar9 = uVar9 + 0x27;
      }
      thunk_FUN_7ff70ca90250(uVar10,uVar9);
    }
    *param_1 = uVar8;
    param_1[1] = uVar8 + uVar11 * 0x18;
    param_1[2] = uVar8 + uVar12 * 0x18;
    return uVar8 + lVar7;
  }
LAB_7ff70c96c183:
  FUN_7ff70ca007a0();
LAB_7ff70c96c188:
                    /* WARNING: Does not return */
  pcVar3 = (code *)invalidInstructionException();
  (*pcVar3)();
}


