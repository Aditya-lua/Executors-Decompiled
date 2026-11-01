
/* WARNING: Removing unreachable block (ram,0x0041fe0c) */
/* WARNING: Removing unreachable block (ram,0x0041fe10) */

void FUN_0041fbd4(undefined8 param_1)

{
  dword *pdVar1;
  long lVar2;
  long lVar3;
  ushort uVar4;
  undefined2 uVar5;
  code *pcVar6;
  undefined8 *puVar7;
  dword *pdVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined *puVar11;
  long lVar12;
  undefined2 uVar13;
  int iVar14;
  dword unaff_w21;
  long lVar15;
  undefined *puVar16;
  ushort unaff_w23;
  ushort uVar17;
  dword unaff_w24;
  short sVar18;
  long unaff_x27;
  ushort uVar19;
  undefined1 auVar20 [16];
  dword dStack_88;
  dword dStack_84;
  long lStack_78;
  dword *pdStack_70;
  long lStack_68;
  
  if (*(long *)(unaff_x27 + 8) != 0) {
    func_0x00187bd4();
  }
  func_0x00187bd4();
  auVar20 = __Unwind_Resume(param_1);
  puVar9 = auVar20._8_8_;
  puVar7 = auVar20._0_8_;
  uVar10 = *puVar9;
  if (puVar9[1] == 0) {
LAB_0041fc54:
    _freeaddrinfo(uVar10);
    lVar15 = 0;
    lStack_78 = 0;
    pdStack_70 = &MACH_HEADER.cputype;
  }
  else {
    uVar4 = *(ushort *)(puVar9 + 2);
    lVar15 = puVar9[1];
    while( true ) {
      lVar12 = *(long *)(lVar15 + 0x20);
      lVar3 = *(long *)(lVar15 + 0x28);
      if (*(char *)(lVar12 + 1) == '\x1e') break;
      if (*(char *)(lVar12 + 1) == '\x02') {
        if (*(uint *)(lVar15 + 0x10) < 0x10) {
          puVar11 = &UNK_009dbbe8;
          uVar10 = 0x34;
          puVar16 = &UNK_008874bb;
          goto code_r0x0041fedc;
        }
        sVar18 = 0;
        iVar14 = *(int *)(lVar12 + 4);
        uVar19 = *(ushort *)(lVar12 + 2) >> 8 | *(ushort *)(lVar12 + 2) << 8;
        puVar16 = &UNK_009dbc18;
        goto code_r0x0041fccc;
      }
      lVar15 = lVar3;
      if (lVar3 == 0) goto LAB_0041fc54;
    }
    if (*(uint *)(lVar15 + 0x10) < 0x1c) {
      puVar11 = &UNK_009dbc00;
      uVar10 = 0x35;
      puVar16 = &UNK_0088751b;
code_r0x0041fedc:
      func_0x007a247c(puVar16,uVar10,puVar11);
      goto code_r0x0041fef8;
    }
    unaff_w23 = *(ushort *)(lVar12 + 2) >> 8 | *(ushort *)(lVar12 + 2) << 8;
    dStack_84 = *(dword *)(lVar12 + 4);
    iVar14 = *(int *)(lVar12 + 8) << 0x10;
    puVar16 = *(undefined **)(lVar12 + 0xc);
    unaff_w21 = *(dword *)(lVar12 + 0x14);
    unaff_w24 = *(dword *)(lVar12 + 0x18);
    uVar19 = (ushort)((uint)*(int *)(lVar12 + 8) >> 0x10);
    sVar18 = 1;
code_r0x0041fccc:
    pdVar8 = (dword *)func_0x00187bd0(0x80,4);
    if (pdVar8 == (dword *)0x0) {
      func_0x007a1f00(4,0x80,&UNK_009d92e8);
      goto code_r0x0041fef8;
    }
    *(short *)pdVar8 = sVar18;
    uVar17 = uVar4;
    if (sVar18 == 0) {
      uVar17 = unaff_w23;
      uVar19 = uVar4;
    }
    *(int *)((long)pdVar8 + 2) = iVar14;
    *(ushort *)((long)pdVar8 + 6) = uVar19;
    *(undefined **)(pdVar8 + 2) = puVar16;
    pdVar8[4] = unaff_w21;
    pdVar8[5] = dStack_84;
    pdVar8[6] = unaff_w24;
    *(ushort *)(pdVar8 + 7) = uVar17;
    lStack_78 = 4;
    lStack_68 = 1;
    pdStack_70 = pdVar8;
    lVar15 = lStack_68;
    while (lStack_68 = lVar15, lVar3 != 0) {
      lVar12 = lVar3;
      while( true ) {
        lVar2 = *(long *)(lVar12 + 0x20);
        lVar3 = *(long *)(lVar12 + 0x28);
        if (*(char *)(lVar2 + 1) == '\x1e') break;
        if (*(char *)(lVar2 + 1) == '\x02') {
          if (*(uint *)(lVar12 + 0x10) < 0x10) {
            puVar11 = &UNK_009dbbe8;
            puVar16 = &UNK_008874bb;
            uVar10 = 0x34;
            goto code_r0x0041fea4;
          }
          iVar14 = *(int *)(lVar2 + 4);
          uVar19 = *(ushort *)(lVar2 + 2);
          puVar16 = &UNK_009dbc18;
          uVar13 = 0;
          uVar17 = uVar4;
          uVar5 = 0;
          if (lVar15 != lStack_78) goto LAB_0041fd30;
          goto code_r0x0041fe20;
        }
        lVar12 = lVar3;
        if (lVar3 == 0) goto code_r0x0041fe40;
      }
      if (*(uint *)(lVar12 + 0x10) < 0x1c) {
        puVar16 = &UNK_0088751b;
        uVar10 = 0x35;
        puVar11 = &UNK_009dbc00;
code_r0x0041fea4:
        func_0x007a247c(puVar16,uVar10,puVar11);
code_r0x0041fef8:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x41fefc);
        (*pcVar6)();
      }
      dStack_84 = *(dword *)(lVar2 + 4);
      iVar14 = *(int *)(lVar2 + 8) << 0x10;
      puVar16 = *(undefined **)(lVar2 + 0xc);
      unaff_w24 = *(dword *)(lVar2 + 0x14);
      dStack_88 = *(dword *)(lVar2 + 0x18);
      uVar17 = (ushort)((uint)*(int *)(lVar2 + 8) >> 0x10);
      uVar13 = 1;
      uVar19 = uVar4;
      uVar5 = 1;
      if (lVar15 == lStack_78) {
code_r0x0041fe20:
        uVar13 = uVar5;
        func_0x007a0000(&lStack_78,lVar15,1,4,0x20);
        pdVar8 = pdStack_70;
      }
LAB_0041fd30:
      pdVar1 = pdVar8 + lVar15 * 8;
      *(undefined2 *)pdVar1 = uVar13;
      *(int *)((long)pdVar1 + 2) = iVar14;
      *(ushort *)((long)pdVar1 + 6) = uVar17;
      *(undefined **)(pdVar1 + 2) = puVar16;
      pdVar1[4] = unaff_w24;
      pdVar1[5] = dStack_84;
      pdVar1[6] = dStack_88;
      *(ushort *)(pdVar1 + 7) = uVar19;
      lVar15 = lVar15 + 1;
    }
code_r0x0041fe40:
    _freeaddrinfo(uVar10);
  }
  *puVar7 = pdStack_70;
  puVar7[1] = pdStack_70;
  puVar7[2] = lStack_78;
  puVar7[3] = pdStack_70 + lVar15 * 8;
  return;
}

