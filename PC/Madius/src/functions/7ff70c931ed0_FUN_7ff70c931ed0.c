/* 7ff70c931ed0 FUN_7ff70c931ed0 */

/* WARNING: Removing unreachable block (ram,0x7ff70c93212b) */
/* WARNING: Removing unreachable block (ram,0x7ff70c932134) */
/* WARNING: Removing unreachable block (ram,0x7ff70c932144) */
/* WARNING: Removing unreachable block (ram,0x7ff70c932155) */
/* WARNING: Removing unreachable block (ram,0x7ff70c93215c) */
/* WARNING: Removing unreachable block (ram,0x7ff70c93217c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c931ed0(float *param_1,longlong *param_2,byte *param_3)

{
  code *pcVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  undefined8 *puVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 *puVar9;
  undefined8 extraout_XMM0_Qb;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  float fVar13;
  undefined1 auStack_40 [8];
  undefined8 *puStack_38;
  undefined8 uStack_30;
  
  uStack_30 = 0xfffffffffffffffe;
  uVar7 = ((ulonglong)param_3[3] ^
          ((ulonglong)param_3[2] ^
          ((ulonglong)param_3[1] ^ ((ulonglong)*param_3 ^ 0xcbf29ce484222325) * 0x100000001b3) *
          0x100000001b3) * 0x100000001b3) * 0x100000001b3;
  lVar6 = (*(ulonglong *)(param_1 + 0xc) & uVar7) * 0x10;
  puVar5 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar6);
  puVar9 = *(undefined8 **)(param_1 + 2);
  if (puVar5 != *(undefined8 **)(param_1 + 2)) {
    if (*(int *)param_3 != *(int *)(puVar5 + 2)) {
      do {
        puVar9 = puVar5;
        if (puVar5 == *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar6)) goto LAB_7ff70c931f7d;
        puVar5 = (undefined8 *)puVar5[1];
      } while (*(int *)param_3 != *(int *)(puVar5 + 2));
    }
    *param_2 = (longlong)puVar5;
    *(undefined1 *)(param_2 + 1) = 0;
    return param_2;
  }
LAB_7ff70c931f7d:
  if (*(longlong *)(param_1 + 4) == 0x555555555555555) {
    FUN_7ff70cb12520(&UNK_7ff70cb8573f);
                    /* WARNING: Does not return */
    pcVar1 = (code *)invalidInstructionException();
    (*pcVar1)();
  }
  auVar12._0_8_ = FUN_7ff70c9321e0(auStack_40,param_1 + 2);
  auVar12._8_8_ = extraout_XMM0_Qb;
  uVar2 = *(longlong *)(param_1 + 4) + 1;
  auVar10._4_12_ = auVar12._4_12_;
  if ((longlong)uVar2 < 0) {
    auVar10._0_4_ = (float)uVar2;
    fVar13 = *param_1;
    uVar2 = *(ulonglong *)(param_1 + 0xe);
    if ((longlong)uVar2 < 0) goto LAB_7ff70c931fb9;
LAB_7ff70c932003:
    if (fVar13 < auVar10._0_4_ / (float)(longlong)uVar2) {
LAB_7ff70c932018:
      auVar11._4_12_ = auVar10._4_12_;
      auVar11._0_4_ = auVar10._0_4_ / fVar13;
      auVar12 = roundss(auVar11,auVar11,10);
      uVar3 = (ulonglong)auVar12._0_4_;
      uVar3 = (longlong)(auVar12._0_4_ - _DAT_7ff70cb14c58) & (longlong)uVar3 >> 0x3f | uVar3;
      uVar4 = 8;
      if (8 < uVar3) {
        uVar4 = uVar3;
      }
      uVar3 = uVar2;
      if (uVar2 < uVar4) {
        uVar3 = uVar2 * 8;
        if (uVar3 < uVar4 || uVar3 - uVar4 == 0) {
          uVar3 = uVar4;
        }
        if (0x1ff < uVar2) {
          uVar3 = uVar4;
        }
      }
      FUN_7ff70c932390(param_1,uVar3);
      lVar6 = (*(ulonglong *)(param_1 + 0xc) & uVar7) * 0x10;
      puVar5 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar6);
      puVar9 = *(undefined8 **)(param_1 + 2);
      if (puVar5 != *(undefined8 **)(param_1 + 2)) {
        if (*(int *)(puStack_38 + 2) != *(int *)(puVar5 + 2)) {
          do {
            puVar9 = puVar5;
            if (puVar5 == *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar6))
            goto LAB_7ff70c9320c6;
            puVar5 = (undefined8 *)puVar5[1];
          } while (*(int *)(puStack_38 + 2) != *(int *)(puVar5 + 2));
        }
        puVar9 = (undefined8 *)*puVar5;
      }
    }
  }
  else {
    auVar10._0_4_ = (float)(longlong)uVar2;
    fVar13 = *param_1;
    uVar2 = *(ulonglong *)(param_1 + 0xe);
    if (-1 < (longlong)uVar2) goto LAB_7ff70c932003;
LAB_7ff70c931fb9:
    if (fVar13 < auVar10._0_4_ / (float)uVar2) goto LAB_7ff70c932018;
  }
LAB_7ff70c9320c6:
  puVar5 = (undefined8 *)puVar9[1];
  *(longlong *)(param_1 + 4) = *(longlong *)(param_1 + 4) + 1;
  *puStack_38 = puVar9;
  puStack_38[1] = puVar5;
  *puVar5 = puStack_38;
  puVar9[1] = puStack_38;
  lVar6 = *(longlong *)(param_1 + 6);
  lVar8 = (uVar7 & *(ulonglong *)(param_1 + 0xc)) * 0x10;
  if (*(undefined8 **)(lVar6 + lVar8) == *(undefined8 **)(param_1 + 2)) {
    *(undefined8 **)(lVar6 + lVar8) = puStack_38;
  }
  else {
    if (*(undefined8 **)(lVar6 + lVar8) == puVar9) {
      *(undefined8 **)(lVar6 + lVar8) = puStack_38;
      goto LAB_7ff70c93211b;
    }
    if (*(undefined8 **)(lVar6 + 8 + lVar8) != puVar5) goto LAB_7ff70c93211b;
  }
  *(undefined8 **)(lVar6 + 8 + lVar8) = puStack_38;
LAB_7ff70c93211b:
  *param_2 = (longlong)puStack_38;
  *(undefined1 *)(param_2 + 1) = 1;
  return param_2;
}


