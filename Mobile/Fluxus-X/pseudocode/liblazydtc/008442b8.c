/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008442b8
 */

void FUN_008442b8(undefined8 *param_1,ulong param_2,undefined8 *param_3)

{
  undefined1 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  
  lVar7 = param_1[2];
  puVar6 = (undefined8 *)*param_1;
  if ((ulong)((lVar7 - (long)puVar6 >> 3) * -0x5555555555555555) < param_2) {
    if (puVar6 != (undefined8 *)0x0) {
      param_1[1] = puVar6;
      operator_delete(puVar6,lVar7 - (long)puVar6);
      lVar7 = 0;
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
    }
    if (0xaaaaaaaaaaaaaaa < param_2) {
LAB_0084447c:
      FUN_00844480();
                    /* WARNING: Subroutine does not return */
      FUN_007fe138("vector");
    }
    uVar8 = (lVar7 >> 3) * 0x5555555555555556;
    if (uVar8 <= param_2) {
      uVar8 = param_2;
    }
    if (0x555555555555554 < (ulong)((lVar7 >> 3) * -0x5555555555555555)) {
      uVar8 = 0xaaaaaaaaaaaaaaa;
    }
    if (0xaaaaaaaaaaaaaaa < uVar8) goto LAB_0084447c;
    puVar3 = operator_new(uVar8 * 0x18);
    *param_1 = puVar3;
    param_1[1] = puVar3;
    param_1[2] = puVar3 + uVar8 * 3;
    lVar7 = param_2 * 0x18;
    puVar6 = puVar3 + param_2 * 3;
    do {
      uVar14 = *param_3;
      uVar9 = param_3[2];
      lVar7 = lVar7 + -0x18;
      puVar3[1] = param_3[1];
      *puVar3 = uVar14;
      puVar3[2] = uVar9;
      puVar3 = puVar3 + 3;
    } while (lVar7 != 0);
    goto LAB_00844458;
  }
  puVar3 = (undefined8 *)param_1[1];
  lVar7 = (long)puVar3 - (long)puVar6 >> 3;
  uVar10 = lVar7 * -0x5555555555555555;
  uVar8 = uVar10;
  if (param_2 <= uVar10) {
    uVar8 = param_2;
  }
  if (uVar8 != 0) {
    uVar9 = *param_3;
    uVar14 = param_3[1];
    uVar1 = *(undefined1 *)(param_3 + 2);
    uVar11 = 1;
    puVar4 = puVar6;
    if (uVar8 != 1) {
      uVar12 = uVar8 & 0xfffffffffffffffe;
      puVar13 = puVar6 + 3;
      puVar4 = puVar6 + uVar12 * 3;
      uVar11 = uVar8 & 1;
      uVar5 = uVar12;
      do {
        puVar13[-3] = uVar9;
        puVar13[-2] = uVar14;
        uVar5 = uVar5 - 2;
        *puVar13 = uVar9;
        puVar13[1] = uVar14;
        *(undefined1 *)(puVar13 + -1) = uVar1;
        *(undefined1 *)(puVar13 + 2) = uVar1;
        puVar13 = puVar13 + 6;
      } while (uVar5 != 0);
      if (uVar8 == uVar12) goto LAB_00844424;
    }
    do {
      *puVar4 = uVar9;
      puVar4[1] = uVar14;
      uVar11 = uVar11 - 1;
      *(undefined1 *)(puVar4 + 2) = uVar1;
      puVar4 = puVar4 + 3;
    } while (uVar11 != 0);
  }
LAB_00844424:
  lVar2 = param_2 + lVar7 * 0x5555555555555555;
  if (param_2 < uVar10 || lVar2 == 0) {
    param_1[1] = puVar6 + param_2 * 3;
    return;
  }
  puVar6 = puVar3 + lVar2 * 3;
  lVar7 = lVar7 * -8 + param_2 * 0x18;
  do {
    uVar14 = param_3[1];
    uVar9 = *param_3;
    lVar7 = lVar7 + -0x18;
    puVar3[2] = param_3[2];
    puVar3[1] = uVar14;
    *puVar3 = uVar9;
    puVar3 = puVar3 + 3;
  } while (lVar7 != 0);
LAB_00844458:
  param_1[1] = puVar6;
  return;
}

