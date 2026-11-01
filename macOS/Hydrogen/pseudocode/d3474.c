
void FUN_000d3474(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  int *piVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  int iVar10;
  long lVar11;
  long unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  undefined8 uVar12;
  
  func_0x000cef5c();
  *(long *)(*(long *)(&UNK_00004a98 + unaff_x21) + (long)*unaff_x20 * 8) = unaff_x19;
  *unaff_x20 = *unaff_x20 + 1;
  piVar6 = *(int **)(*(long *)(unaff_x21 + 0x4000) + 0x2a8);
  uVar8 = *(undefined8 *)(*(long *)(unaff_x19 + 0x40) + 8);
  iVar10 = piVar6[0x1a];
  if (iVar10 == piVar6[0x1b]) {
    iVar2 = iVar10;
    if (iVar10 < 0) {
      iVar2 = iVar10 + 1;
    }
    uVar4 = 8;
    if (iVar10 != 0) {
      uVar4 = iVar10 + (iVar2 >> 1);
    }
    if ((int)uVar4 <= (int)(iVar10 + 1U)) {
      uVar4 = iVar10 + 1U;
    }
    lVar7 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar4 << 3);
    if (*(long *)(piVar6 + 0x1c) != 0) {
      _memcpy(lVar7,*(long *)(piVar6 + 0x1c),(long)piVar6[0x1a] << 3);
      func_0x000b83d4(*(undefined8 *)(piVar6 + 0x1c));
    }
    *(long *)(piVar6 + 0x1c) = lVar7;
    piVar6[0x1b] = uVar4;
    iVar10 = piVar6[0x1a];
  }
  else {
    lVar7 = *(long *)(piVar6 + 0x1c);
  }
  *(undefined8 *)(lVar7 + (long)iVar10 * 8) = uVar8;
  piVar6[0x1a] = piVar6[0x1a] + 1;
  *(undefined8 *)(piVar6 + 0x26) = uVar8;
  lVar7 = *(long *)(piVar6 + 2);
  iVar10 = *piVar6;
  iVar2 = iVar10 + -1;
  lVar11 = lVar7 + (long)iVar2 * 0x38;
  if (*(int *)(lVar11 + 0x20) == 0) {
    if ((((1 < iVar10) &&
         (((*(long *)(piVar6 + 0x22) == *(long *)(lVar11 + -0x38) &&
           *(long *)(piVar6 + 0x24) == *(long *)(lVar11 + -0x30)) &&
          *(long *)(piVar6 + 0x26) == *(long *)(lVar11 + -0x28)) &&
          piVar6[0x28] == *(int *)(lVar11 + -0x20))) &&
        (*(int *)(lVar11 + -0x18) + *(int *)(lVar11 + -0x1c) ==
         *(int *)(lVar7 + (long)iVar2 * 0x38 + 0x1c))) && (*(long *)(lVar11 + -0x10) == 0)) {
      *piVar6 = iVar2;
      return;
    }
  }
  else {
    lVar11 = *(long *)(piVar6 + 0x26);
    if (*(long *)(lVar7 + (long)iVar2 * 0x38 + 0x10) != lVar11) {
      uVar12 = *(undefined8 *)(piVar6 + 0x24);
      uVar8 = *(undefined8 *)(piVar6 + 0x22);
      iVar2 = piVar6[0x28];
      iVar5 = piVar6[4];
      if (iVar10 == piVar6[1]) {
        iVar1 = iVar10;
        if (iVar10 < 0) {
          iVar1 = iVar10 + 1;
        }
        iVar3 = 8;
        if (iVar10 != 0) {
          iVar3 = iVar10 + (iVar1 >> 1);
        }
        if (iVar3 <= iVar10 + 1) {
          iVar3 = iVar10 + 1;
        }
        lVar7 = func_0x000b810c((long)iVar3 * 0x38);
        if (*(long *)(piVar6 + 2) != 0) {
          _memcpy(lVar7,*(long *)(piVar6 + 2),(long)*piVar6 * 0x38);
          func_0x000b83d4(*(undefined8 *)(piVar6 + 2));
        }
        *(long *)(piVar6 + 2) = lVar7;
        piVar6[1] = iVar3;
        iVar10 = *piVar6;
      }
      puVar9 = (undefined8 *)(lVar7 + (long)iVar10 * 0x38);
      puVar9[1] = uVar12;
      *puVar9 = uVar8;
      puVar9[2] = lVar11;
      *(int *)(puVar9 + 3) = iVar2;
      *(int *)((long)puVar9 + 0x1c) = iVar5;
      puVar9[5] = 0;
      puVar9[6] = 0;
      puVar9[4] = 0;
      *piVar6 = *piVar6 + 1;
      return;
    }
  }
  *(undefined8 *)(lVar7 + (long)iVar2 * 0x38 + 0x10) = *(undefined8 *)(piVar6 + 0x26);
  return;
}

