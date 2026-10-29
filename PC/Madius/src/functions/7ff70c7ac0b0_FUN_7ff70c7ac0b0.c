/* 7ff70c7ac0b0 FUN_7ff70c7ac0b0 */

void FUN_7ff70c7ac0b0(longlong *param_1,ulonglong param_2,undefined8 param_3)

{
  undefined4 *puVar1;
  longlong lVar2;
  undefined4 *puVar3;
  code *pcVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined4 uVar9;
  undefined4 uVar11;
  ulonglong uVar10;
  undefined4 *puVar12;
  
  uVar11 = (undefined4)((ulonglong)param_3 >> 0x20);
  uVar9 = (undefined4)param_3;
  puVar12 = (undefined4 *)*param_1;
  puVar3 = (undefined4 *)param_1[1];
  if (param_2 <= (ulonglong)((longlong)puVar3 - (longlong)puVar12 >> 3)) {
    if (puVar12 == puVar3) {
      return;
    }
    uVar7 = ((longlong)puVar3 - (longlong)puVar12) - 8;
    if (0x17 < uVar7) {
      uVar7 = (uVar7 >> 3) + 1;
      uVar8 = uVar7 & 0xfffffffffffffffc;
      uVar10 = 0;
      do {
        puVar1 = puVar12 + uVar10 * 2;
        *puVar1 = uVar9;
        puVar1[1] = uVar11;
        puVar1[2] = uVar9;
        puVar1[3] = uVar11;
        puVar1 = puVar12 + uVar10 * 2 + 4;
        *puVar1 = uVar9;
        puVar1[1] = uVar11;
        puVar1[2] = uVar9;
        puVar1[3] = uVar11;
        uVar10 = uVar10 + 4;
      } while (uVar8 != uVar10);
      puVar12 = puVar12 + uVar8 * 2;
      if (uVar7 == uVar8) {
        return;
      }
    }
    do {
      *puVar12 = uVar9;
      puVar12[1] = uVar11;
      puVar12 = puVar12 + 2;
    } while (puVar12 != puVar3);
    return;
  }
  if (param_2 >> 0x3d == 0) {
    lVar2 = param_2 * 8;
    if (param_2 < 0x200) {
      puVar12 = (undefined4 *)FUN_7ff70ca8ff40(lVar2);
      lVar5 = *param_1;
      uVar7 = param_1[2] - lVar5;
    }
    else {
      if (0x1ffffffffffffffb < param_2) goto LAB_7ff70c7ac256;
      lVar5 = FUN_7ff70ca8ff40(lVar2 + 0x27);
      puVar12 = (undefined4 *)(lVar5 + 0x27U & 0xffffffffffffffe0);
      *(longlong *)(puVar12 + -2) = lVar5;
      lVar5 = *param_1;
      uVar7 = param_1[2] - lVar5;
    }
    if (uVar7 != 0) {
      lVar6 = lVar5;
      if (0xfff < uVar7) {
        lVar6 = *(longlong *)(lVar5 + -8);
        if (0x1f < (ulonglong)((lVar5 + -8) - lVar6)) goto LAB_7ff70c7ac25b;
        uVar7 = uVar7 + 0x27;
      }
      thunk_FUN_7ff70ca90250(lVar6,uVar7);
    }
    *param_1 = (longlong)puVar12;
    puVar3 = puVar12 + param_2 * 2;
    param_1[1] = (longlong)puVar3;
    param_1[2] = (longlong)puVar3;
    if (0x17 < lVar2 - 8U) {
      uVar8 = (lVar2 - 8U >> 3) + 1;
      uVar7 = uVar8 & 0xfffffffffffffffc;
      uVar10 = 0;
      do {
        puVar1 = puVar12 + uVar10 * 2;
        *puVar1 = uVar9;
        puVar1[1] = uVar11;
        puVar1[2] = uVar9;
        puVar1[3] = uVar11;
        puVar1 = puVar12 + uVar10 * 2 + 4;
        *puVar1 = uVar9;
        puVar1[1] = uVar11;
        puVar1[2] = uVar9;
        puVar1[3] = uVar11;
        uVar10 = uVar10 + 4;
      } while (uVar7 != uVar10);
      puVar12 = puVar12 + uVar7 * 2;
      if (uVar8 == uVar7) {
        return;
      }
    }
    do {
      *puVar12 = uVar9;
      puVar12[1] = uVar11;
      puVar12 = puVar12 + 2;
    } while (puVar12 != puVar3);
    return;
  }
LAB_7ff70c7ac256:
  FUN_7ff70ca007a0();
LAB_7ff70c7ac25b:
                    /* WARNING: Does not return */
  pcVar4 = (code *)invalidInstructionException();
  (*pcVar4)();
}


