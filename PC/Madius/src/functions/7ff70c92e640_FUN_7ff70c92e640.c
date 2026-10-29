/* 7ff70c92e640 FUN_7ff70c92e640 */

void FUN_7ff70c92e640(undefined8 *param_1)

{
  byte *pbVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  int iVar5;
  byte *pbVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  uint uVar12;
  longlong lVar13;
  byte *pbVar14;
  int iVar15;
  longlong *plVar16;
  int iVar17;
  longlong lVar18;
  bool bVar19;
  bool bVar20;
  undefined8 in_stack_ffffffffffffffd8;
  undefined4 uVar22;
  undefined8 uVar21;
  
  uVar22 = (undefined4)((ulonglong)in_stack_ffffffffffffffd8 >> 0x20);
  iVar5 = *(int *)(param_1 + 0xe);
  iVar17 = 0;
  if (iVar5 < 0x3f) {
    if (iVar5 != 0x2a) {
      if (iVar5 != 0x2b) {
        return;
      }
      iVar17 = 1;
    }
LAB_7ff70c92e7ba:
    iVar15 = -1;
LAB_7ff70c92e7bf:
    pbVar6 = (byte *)*param_1;
    pbVar14 = (byte *)param_1[1];
    if (pbVar6 != pbVar14) {
LAB_7ff70c92e7e7:
      if ((((*pbVar6 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar1 = pbVar6 + 1, pbVar1 != pbVar14)) &&
         ((((param_1[0xc] & 8) == 0 && ((*pbVar1 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10) == 0 && ((*pbVar1 == 0x7d || (*pbVar1 == 0x7b)))))))) {
        pbVar6 = pbVar1;
      }
      *param_1 = pbVar6 + 1;
    }
  }
  else {
    if (iVar5 != 0x3f) {
      if (iVar5 != 0x7b) {
        return;
      }
      pbVar6 = (byte *)*param_1;
      if (pbVar6 != (byte *)param_1[1]) {
        if ((((*pbVar6 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
            (pbVar14 = pbVar6 + 1, pbVar14 != (byte *)param_1[1])) &&
           ((((param_1[0xc] & 8) == 0 && ((*pbVar14 & 0xfe) == 0x28)) ||
            (((param_1[0xc] & 0x10) == 0 && ((*pbVar14 == 0x7d || (*pbVar14 == 0x7b)))))))) {
          pbVar6 = pbVar14;
        }
        *param_1 = pbVar6 + 1;
      }
      FUN_7ff70c92d1b0(param_1);
      uVar21 = CONCAT44(uVar22,7);
      iVar5 = FUN_7ff70c92ee70(param_1,10,0,0x7fffffff,uVar21);
      uVar22 = (undefined4)((ulonglong)uVar21 >> 0x20);
      if (iVar5 == 0x7fffffff) {
LAB_7ff70c92e7b0:
        FUN_7ff70cb12980(7);
        goto LAB_7ff70c92e7ba;
      }
      iVar17 = *(int *)((longlong)param_1 + 0x6c);
      iVar5 = *(int *)(param_1 + 0xe);
      iVar15 = iVar17;
      if (iVar5 == 0x2c) {
        pbVar6 = (byte *)*param_1;
        if (pbVar6 != (byte *)param_1[1]) {
          if ((((*pbVar6 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
              (pbVar14 = pbVar6 + 1, pbVar14 != (byte *)param_1[1])) &&
             ((((param_1[0xc] & 8) == 0 && ((*pbVar14 & 0xfe) == 0x28)) ||
              (((param_1[0xc] & 0x10) == 0 && ((*pbVar14 == 0x7d || (*pbVar14 == 0x7b)))))))) {
            pbVar6 = pbVar14;
          }
          *param_1 = pbVar6 + 1;
        }
        FUN_7ff70c92d1b0(param_1);
        if (*(int *)(param_1 + 0xe) == 0x7d) goto LAB_7ff70c92e7ba;
        iVar5 = FUN_7ff70c92ee70(param_1,10,0,0x7fffffff,CONCAT44(uVar22,7));
        if (iVar5 == 0x7fffffff) goto LAB_7ff70c92e7b0;
        iVar15 = *(int *)((longlong)param_1 + 0x6c);
        iVar5 = *(int *)(param_1 + 0xe);
      }
      if (iVar5 != 0x7d) goto LAB_7ff70c92e7b0;
      if (iVar15 == -1) goto LAB_7ff70c92e7ba;
      if (iVar15 < iVar17) goto LAB_7ff70c92e7b0;
      goto LAB_7ff70c92e7bf;
    }
    iVar15 = 1;
    pbVar6 = (byte *)*param_1;
    pbVar14 = (byte *)param_1[1];
    if (pbVar6 != pbVar14) goto LAB_7ff70c92e7e7;
  }
  FUN_7ff70c92d1b0(param_1);
  uVar2 = param_1[0xc];
  bVar19 = (uVar2 & 0x200) == 0;
  bVar20 = *(int *)(param_1 + 0xe) != 0x3f;
  if (!bVar20 && !bVar19) {
    pbVar6 = (byte *)*param_1;
    if (pbVar6 != (byte *)param_1[1]) {
      if ((((*pbVar6 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar14 = pbVar6 + 1, pbVar14 != (byte *)param_1[1])) &&
         ((((uVar2 & 8) == 0 && ((*pbVar14 & 0xfe) == 0x28)) ||
          (((uVar2 & 0x10) == 0 && ((*pbVar14 == 0x7d || (*pbVar14 == 0x7b)))))))) {
        pbVar6 = pbVar14;
      }
      *param_1 = pbVar6 + 1;
    }
    FUN_7ff70c92d1b0(param_1);
  }
  plVar16 = param_1 + 7;
  lVar18 = param_1[8];
  iVar5 = *(int *)(lVar18 + 8);
  if (iVar5 == 6) {
    if (*(int *)(lVar18 + 0x24) != 1) {
      puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
      *(undefined4 *)(puVar7 + 1) = 6;
      *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
      *(undefined4 *)((longlong)puVar7 + 0x14) = 0;
      *puVar7 = &UNK_7ff70cb46928;
      puVar7[4] = 0;
      puVar7[5] = 0;
      puVar7[3] = lVar18;
      lVar3 = *(longlong *)(lVar18 + 0x10);
      lVar13 = lVar18;
      if (lVar3 != 0) {
        puVar7[2] = lVar3;
        *(undefined8 **)(lVar3 + 0x18) = puVar7;
        lVar13 = param_1[8];
      }
      *(undefined8 **)(lVar13 + 0x10) = puVar7;
      param_1[8] = puVar7;
      uVar12 = *(int *)(lVar18 + 0x24) - 1;
      *(uint *)(lVar18 + 0x24) = uVar12;
      FUN_7ff70c92e540(plVar16,*(undefined1 *)(*(longlong *)(lVar18 + 0x28) + (ulonglong)uVar12));
      lVar18 = param_1[8];
      iVar5 = *(int *)(lVar18 + 8);
      goto LAB_7ff70c9312b3;
    }
  }
  else {
LAB_7ff70c9312b3:
    if ((iVar5 == 0xe) || (iVar5 == 9)) {
      lVar3 = *(longlong *)(lVar18 + 0x20);
      iVar5 = *(int *)(*plVar16 + 0x24);
      goto joined_r0x7ff70c93151f;
    }
  }
  if (iVar15 == 1 && iVar17 == 0) {
    puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *(undefined4 *)(puVar7 + 1) = 0x11;
    *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
    *(undefined8 *)((longlong)puVar7 + 0x14) = 0;
    *(undefined4 *)((longlong)puVar7 + 0x1c) = 0;
    *puVar7 = &UNK_7ff70cb46998;
    puVar8 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
    *(undefined4 *)(puVar8 + 1) = 0x10;
    *(undefined8 *)((longlong)puVar8 + 0xc) = 0;
    *(undefined8 *)((longlong)puVar8 + 0x14) = 0;
    *(undefined4 *)((longlong)puVar8 + 0x1c) = 0;
    *puVar8 = &UNK_7ff70cb46a08;
    puVar8[4] = puVar7;
    puVar8[5] = 0;
    puVar9 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
    *(undefined4 *)(puVar9 + 1) = 0x10;
    *(undefined8 *)((longlong)puVar9 + 0xc) = 0;
    *(undefined8 *)((longlong)puVar9 + 0x14) = 0;
    *(undefined4 *)((longlong)puVar9 + 0x1c) = 0;
    *puVar9 = &UNK_7ff70cb46a08;
    puVar9[4] = puVar7;
    puVar9[5] = 0;
    puVar10 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *puVar10 = &UNK_7ff70cb46710;
    *(undefined4 *)(puVar10 + 1) = 8;
    *(undefined8 *)((longlong)puVar10 + 0xc) = 0;
    *(undefined8 *)((longlong)puVar10 + 0x14) = 0;
    *(undefined4 *)((longlong)puVar10 + 0x1c) = 0;
    puVar11 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
    puVar11[1] = 9;
    *puVar11 = &UNK_7ff70cb46a78;
    puVar11[4] = puVar10;
    puVar9[2] = puVar10;
    puVar10[3] = puVar9;
    puVar10[2] = puVar11;
    puVar11[3] = puVar10;
    puVar11[2] = puVar7;
    puVar8[5] = puVar9;
    puVar7[3] = lVar18;
    lVar3 = *(longlong *)(lVar18 + 0x10);
    lVar13 = lVar18;
    if (lVar3 != 0) {
      puVar7[2] = lVar3;
      *(undefined8 **)(lVar3 + 0x18) = puVar7;
      lVar13 = param_1[8];
    }
    *(undefined8 **)(lVar13 + 0x10) = puVar7;
    param_1[8] = puVar7;
    *(undefined8 **)(*(longlong *)(lVar18 + 0x18) + 0x10) = puVar8;
    puVar8[3] = *(undefined8 *)(lVar18 + 0x18);
    *(undefined8 **)(lVar18 + 0x18) = puVar8;
    puVar8[2] = lVar18;
    if (bVar20 || bVar19) {
      return;
    }
    lVar3 = puVar9[2];
    *(undefined8 *)(lVar18 + 0x18) = *(undefined8 *)(lVar3 + 0x18);
    *(undefined8 **)(lVar3 + 0x18) = puVar8;
    uVar21 = puVar8[2];
    puVar8[2] = puVar9[2];
    puVar9[2] = uVar21;
    return;
  }
  iVar5 = *(int *)(*plVar16 + 0x24);
  lVar3 = lVar18;
joined_r0x7ff70c93151f:
  if (iVar5 != -1) {
    puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
    *(undefined4 *)(puVar7 + 1) = 0x13;
    *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar7 + 0x14) = 0;
    *puVar7 = &UNK_7ff70cb46ae8;
    puVar7[4] = 0;
    puVar7[3] = lVar18;
    lVar13 = *(longlong *)(lVar18 + 0x10);
    if (lVar13 != 0) {
      puVar7[2] = lVar13;
      *(undefined8 **)(lVar13 + 0x18) = puVar7;
      lVar18 = param_1[8];
    }
    *(undefined8 **)(lVar18 + 0x10) = puVar7;
    param_1[8] = puVar7;
    puVar8 = (undefined8 *)FUN_7ff70ca8ff40(0x38);
    iVar5 = *(int *)(*plVar16 + 0x24);
    *(int *)(*plVar16 + 0x24) = iVar5 + 1;
    *(undefined4 *)(puVar8 + 1) = 0x12;
    *(uint *)((longlong)puVar8 + 0xc) = (uint)(bVar20 || bVar19) * 2;
    puVar8[2] = 0;
    puVar8[3] = 0;
    *puVar8 = &UNK_7ff70cb46b58;
    *(int *)(puVar8 + 4) = iVar17;
    *(int *)((longlong)puVar8 + 0x24) = iVar15;
    puVar8[5] = puVar7;
    *(int *)(puVar8 + 6) = iVar5;
    *(undefined4 *)((longlong)puVar8 + 0x34) = 0xffffffff;
    puVar7[4] = puVar8;
    *(undefined8 **)(*(longlong *)(lVar3 + 0x18) + 0x10) = puVar8;
    puVar8[3] = *(undefined8 *)(lVar3 + 0x18);
    *(undefined8 **)(lVar3 + 0x18) = puVar8;
    puVar8[2] = lVar3;
    return;
  }
  FUN_7ff70cb12980(9);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


