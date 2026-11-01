
long FUN_000f7bf8(void)

{
  char cVar1;
  short sVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  int in_w8;
  undefined8 *puVar6;
  int in_w9;
  long lVar7;
  long lVar8;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *plVar9;
  char *pcVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  if (in_w8 <= in_w9) {
    in_w8 = in_w9;
  }
  lVar4 = func_0x000b810c((long)in_w8 * 0x90);
  if (*(long *)(unaff_x19 + 0x80) != 0) {
    _memcpy(lVar4,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) * 0x90);
    func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  }
  *(long *)(unaff_x19 + 0x80) = lVar4;
  *(int *)(unaff_x19 + 0x7c) = in_w8;
  puVar6 = (undefined8 *)(lVar4 + (long)*(int *)(unaff_x19 + 0x78) * 0x90);
  uVar5 = *unaff_x20;
  puVar6[1] = unaff_x20[1];
  *puVar6 = uVar5;
  uVar11 = unaff_x20[3];
  uVar5 = unaff_x20[2];
  uVar13 = unaff_x20[5];
  uVar12 = unaff_x20[4];
  uVar14 = unaff_x20[6];
  uVar16 = unaff_x20[9];
  uVar15 = unaff_x20[8];
  puVar6[7] = unaff_x20[7];
  puVar6[6] = uVar14;
  puVar6[9] = uVar16;
  puVar6[8] = uVar15;
  puVar6[3] = uVar11;
  puVar6[2] = uVar5;
  puVar6[5] = uVar13;
  puVar6[4] = uVar12;
  uVar11 = unaff_x20[0xb];
  uVar5 = unaff_x20[10];
  uVar13 = unaff_x20[0xd];
  uVar12 = unaff_x20[0xc];
  uVar14 = unaff_x20[0xe];
  uVar16 = unaff_x20[0x11];
  uVar15 = unaff_x20[0x10];
  puVar6[0xf] = unaff_x20[0xf];
  puVar6[0xe] = uVar14;
  puVar6[0x11] = uVar16;
  puVar6[0x10] = uVar15;
  puVar6[0xb] = uVar11;
  puVar6[10] = uVar5;
  puVar6[0xd] = uVar13;
  puVar6[0xc] = uVar12;
  iVar3 = *(int *)(unaff_x19 + 0x78);
  *(int *)(unaff_x19 + 0x78) = iVar3 + 1;
  lVar7 = *(long *)(unaff_x19 + 0x80);
  puVar6 = (undefined8 *)(lVar7 + (long)iVar3 * 0x90);
  plVar9 = puVar6 + 0x11;
  lVar4 = *plVar9;
  if (lVar4 == 0) {
    lVar4 = *(long *)(*(long *)(unaff_x19 + 0x60) + (long)*(int *)(unaff_x19 + 0x58) * 8 + -8);
    *plVar9 = lVar4;
    pcVar10 = (char *)(lVar7 + (long)iVar3 * 0x90 + 0xc);
    cVar1 = *pcVar10;
  }
  else {
    pcVar10 = (char *)(lVar7 + (long)iVar3 * 0x90 + 0xc);
    cVar1 = *pcVar10;
  }
  if (cVar1 == '\0') {
    lVar7 = lVar7 + (long)iVar3 * 0x90;
    uVar5 = func_0x000b810c((long)*(int *)(lVar7 + 8));
    *puVar6 = uVar5;
    *pcVar10 = '\x01';
    _memcpy(uVar5,*unaff_x20,(long)*(int *)(lVar7 + 8));
    lVar4 = *plVar9;
    sVar2 = *(short *)(lVar4 + 0x54);
  }
  else {
    sVar2 = *(short *)(lVar4 + 0x54);
  }
  if (sVar2 == -1) {
    *(undefined2 *)(lVar4 + 0x54) = *(undefined2 *)(unaff_x20 + 0xb);
    iVar3 = *(int *)(unaff_x19 + 0x78);
  }
  else {
    iVar3 = *(int *)(unaff_x19 + 0x78);
  }
  if (iVar3 != 0) {
    lVar4 = *(long *)(unaff_x19 + 0x80);
    lVar7 = (long)iVar3 * 0x90;
    do {
      while (lVar8 = *(long *)(lVar4 + 0x88), *(char *)(lVar4 + 0x48) != '\0') {
        *(short *)(lVar8 + 0x50) = *(short *)(lVar8 + 0x50) + 1;
        lVar4 = lVar4 + 0x90;
        lVar7 = lVar7 + -0x90;
        if (lVar7 == 0) goto LAB_000f7e4c;
      }
      *(long *)(lVar8 + 0x48) = lVar4;
      *(undefined2 *)(lVar8 + 0x50) = 1;
      lVar4 = lVar4 + 0x90;
      lVar7 = lVar7 + -0x90;
    } while (lVar7 != 0);
  }
LAB_000f7e4c:
  *(undefined1 *)(unaff_x19 + 0x28) = 0;
  if (*(long *)(unaff_x19 + 0x30) != 0) {
    func_0x000b83d4();
  }
  if (*(long *)(unaff_x19 + 0x38) != 0) {
    func_0x000b83d4();
  }
  *(undefined1 *)(unaff_x19 + 0x29) = 0;
  *(long *)(unaff_x19 + 0x30) = 0;
  *(undefined8 *)(unaff_x19 + 0x38) = 0;
  return *plVar9;
}

