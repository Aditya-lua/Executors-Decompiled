/* 7ff70c9e7d70 FUN_7ff70c9e7d70 */

/* WARNING: Removing unreachable block (ram,0x7ff70c9e803a) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c9e7d70(float *param_1,longlong *param_2,byte *param_3)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  undefined8 *puVar7;
  longlong *plVar8;
  longlong lVar9;
  undefined8 *puVar10;
  ulonglong uVar11;
  longlong lVar12;
  undefined1 auVar13 [16];
  float fVar14;
  
  uVar11 = ((ulonglong)param_3[7] ^
           ((ulonglong)param_3[6] ^
           ((ulonglong)param_3[5] ^
           ((ulonglong)param_3[4] ^
           ((ulonglong)param_3[3] ^
           ((ulonglong)param_3[2] ^
           ((ulonglong)param_3[1] ^ ((ulonglong)*param_3 ^ 0xcbf29ce484222325) * 0x100000001b3) *
           0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) *
           0x100000001b3) * 0x100000001b3;
  lVar9 = (*(ulonglong *)(param_1 + 0xc) & uVar11) * 0x10;
  puVar3 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar9);
  puVar10 = *(undefined8 **)(param_1 + 2);
  if (puVar3 != *(undefined8 **)(param_1 + 2)) {
    if (*(longlong *)param_3 != puVar3[2]) {
      do {
        puVar10 = puVar3;
        if (puVar3 == *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar9)) goto LAB_7ff70c9e7e5e;
        puVar3 = (undefined8 *)puVar3[1];
      } while (*(longlong *)param_3 != puVar3[2]);
    }
    *param_2 = (longlong)puVar3;
    *(undefined1 *)(param_2 + 1) = 0;
    return param_2;
  }
LAB_7ff70c9e7e5e:
  if (*(longlong *)(param_1 + 4) == 0x666666666666666) {
    FUN_7ff70cb12520(&UNK_7ff70cb8573f);
    pcVar1 = (code *)swi(3);
    plVar8 = (longlong *)(*pcVar1)();
    return plVar8;
  }
  puVar3 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
  uVar2 = *(undefined8 *)(param_3 + 8);
  param_3[8] = 0;
  param_3[9] = 0;
  param_3[10] = 0;
  param_3[0xb] = 0;
  param_3[0xc] = 0;
  param_3[0xd] = 0;
  param_3[0xe] = 0;
  param_3[0xf] = 0;
  puVar3[2] = *(undefined8 *)param_3;
  puVar3[3] = uVar2;
  *(byte *)(puVar3 + 4) = param_3[0x10];
  *(byte *)((longlong)puVar3 + 0x21) = param_3[0x11];
  uVar4 = *(longlong *)(param_1 + 4) + 1;
  if ((longlong)uVar4 < 0) {
    auVar13 = ZEXT416((uint)(float)uVar4);
    fVar14 = *param_1;
    uVar4 = *(ulonglong *)(param_1 + 0xe);
    if ((longlong)uVar4 < 0) goto LAB_7ff70c9e7ec9;
LAB_7ff70c9e7f16:
    if (fVar14 < auVar13._0_4_ / (float)(longlong)uVar4) {
LAB_7ff70c9e7f2b:
      auVar13._0_4_ = auVar13._0_4_ / fVar14;
      auVar13 = roundss(auVar13,auVar13,10);
      uVar5 = (ulonglong)auVar13._0_4_;
      uVar5 = (longlong)(auVar13._0_4_ - _DAT_7ff70cb14c58) & (longlong)uVar5 >> 0x3f | uVar5;
      uVar6 = 8;
      if (8 < uVar5) {
        uVar6 = uVar5;
      }
      uVar5 = uVar4;
      if (uVar4 < uVar6) {
        uVar5 = uVar4 * 8;
        if (uVar5 < uVar6 || uVar5 - uVar6 == 0) {
          uVar5 = uVar6;
        }
        if (0x1ff < uVar4) {
          uVar5 = uVar6;
        }
      }
      FUN_7ff70c99e100(param_1,uVar5);
      lVar9 = (*(ulonglong *)(param_1 + 0xc) & uVar11) * 0x10;
      puVar7 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar9);
      puVar10 = *(undefined8 **)(param_1 + 2);
      if (puVar7 != *(undefined8 **)(param_1 + 2)) {
        if (puVar3[2] != puVar7[2]) {
          do {
            puVar10 = puVar7;
            if (puVar7 == *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar9))
            goto LAB_7ff70c9e7fd7;
            puVar7 = (undefined8 *)puVar7[1];
          } while (puVar3[2] != puVar7[2]);
        }
        puVar10 = (undefined8 *)*puVar7;
      }
    }
  }
  else {
    auVar13 = ZEXT416((uint)(float)(longlong)uVar4);
    fVar14 = *param_1;
    uVar4 = *(ulonglong *)(param_1 + 0xe);
    if (-1 < (longlong)uVar4) goto LAB_7ff70c9e7f16;
LAB_7ff70c9e7ec9:
    if (fVar14 < auVar13._0_4_ / (float)uVar4) goto LAB_7ff70c9e7f2b;
  }
LAB_7ff70c9e7fd7:
  puVar7 = (undefined8 *)puVar10[1];
  *(longlong *)(param_1 + 4) = *(longlong *)(param_1 + 4) + 1;
  *puVar3 = puVar10;
  puVar3[1] = puVar7;
  *puVar7 = puVar3;
  puVar10[1] = puVar3;
  lVar9 = *(longlong *)(param_1 + 6);
  lVar12 = (uVar11 & *(ulonglong *)(param_1 + 0xc)) * 0x10;
  if (*(undefined8 **)(lVar9 + lVar12) == *(undefined8 **)(param_1 + 2)) {
    *(undefined8 **)(lVar9 + lVar12) = puVar3;
  }
  else {
    if (*(undefined8 **)(lVar9 + lVar12) == puVar10) {
      *(undefined8 **)(lVar9 + lVar12) = puVar3;
      goto LAB_7ff70c9e802a;
    }
    if (*(undefined8 **)(lVar9 + 8 + lVar12) != puVar7) goto LAB_7ff70c9e802a;
  }
  *(undefined8 **)(lVar9 + 8 + lVar12) = puVar3;
LAB_7ff70c9e802a:
  *param_2 = (longlong)puVar3;
  *(undefined1 *)(param_2 + 1) = 1;
  return param_2;
}


