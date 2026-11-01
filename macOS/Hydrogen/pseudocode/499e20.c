
/* WARNING: Possible PIC construction at 0x0049a420: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0049a480: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0049a0a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0049a458: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0049a4a8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0049a45c) */
/* WARNING: Removing unreachable block (ram,0x0049a484) */
/* WARNING: Removing unreachable block (ram,0x0049a424) */
/* WARNING: Removing unreachable block (ram,0x0049a4ac) */
/* WARNING: Removing unreachable block (ram,0x0049a4b0) */
/* WARNING: Removing unreachable block (ram,0x0049a568) */
/* WARNING: Removing unreachable block (ram,0x0049a4bc) */
/* WARNING: Removing unreachable block (ram,0x0049a4c8) */
/* WARNING: Removing unreachable block (ram,0x0049a578) */
/* WARNING: Removing unreachable block (ram,0x0049a4d4) */
/* WARNING: Removing unreachable block (ram,0x0049a0a4) */
/* WARNING: Removing unreachable block (ram,0x0049a0a8) */
/* WARNING: Removing unreachable block (ram,0x0049a4f4) */
/* WARNING: Removing unreachable block (ram,0x00499f84) */
/* WARNING: Removing unreachable block (ram,0x00499f14) */
/* WARNING: Removing unreachable block (ram,0x00499f8c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00499e20(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined1 *puVar3;
  long lVar4;
  byte bVar5;
  int iVar6;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong extraout_x1_01;
  ulong extraout_x1_02;
  ulong extraout_x1_03;
  ulong extraout_x1_04;
  ulong extraout_x1_05;
  ulong extraout_x1_06;
  ulong extraout_x1_07;
  ulong extraout_x1_08;
  ulong extraout_x1_09;
  ulong extraout_x1_10;
  ulong extraout_x1_11;
  ulong extraout_x1_12;
  ulong extraout_x1_13;
  ulong extraout_x1_14;
  ulong extraout_x1_15;
  ulong extraout_x1_16;
  ulong extraout_x1_17;
  ulong extraout_x1_18;
  ulong extraout_x1_19;
  ulong extraout_x1_20;
  ulong extraout_x1_21;
  ulong extraout_x1_22;
  ulong extraout_x1_23;
  ulong uVar7;
  ulong extraout_x1_24;
  ulong extraout_x1_25;
  long lVar8;
  undefined8 *extraout_x8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 *unaff_x19;
  long unaff_x20;
  char *pcVar11;
  long unaff_x21;
  long unaff_x22;
  char *unaff_x23;
  undefined8 *puVar12;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined *unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar13;
  char cVar14;
  undefined8 in_xzr;
  undefined8 uVar15;
  undefined8 uVar16;
  long lVar17;
  undefined1 auVar18 [16];
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000080;
  
  do {
    cVar14 = (char)in_xzr;
    do {
      unaff_x24 = unaff_x24 + 1;
      unaff_x20 = unaff_x20 + -1;
      if (unaff_x20 == 0) {
        if (*(long *)(unaff_x21 + 0x10) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x21 + 0x18),*(long *)(unaff_x21 + 0x10) << 3,8);
        }
        uVar9 = *(undefined8 *)(unaff_x28 + 0x50);
        *(undefined8 *)(unaff_x21 + 0x18) = *(undefined8 *)(unaff_x28 + 0x58);
        *(undefined8 *)(unaff_x21 + 0x10) = uVar9;
        *(undefined8 *)(unaff_x21 + 0x20) = *(undefined8 *)(unaff_x29 + -0xe0);
        if (*unaff_x23 == '\x01') {
          *unaff_x23 = cVar14;
        }
        else {
          func_0x007b05dc();
        }
        puVar12 = (undefined8 *)0x0;
        func_0x00490cc8(&uStack0000000000000080);
        if (in_stack_00000010 < 3) {
          if (uStack0000000000000050 != 2) {
            func_0x005ec378(&uStack0000000000000050,&uStack0000000000000068);
          }
          func_0x00492ef0(&uStack0000000000000050);
        }
        func_0x00493cec(in_stack_00000018);
        pcVar11 = (char *)((long)&MACH_HEADER.magic + 1);
        lVar4 = *uStack0000000000000048;
        *uStack0000000000000048 = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          func_0x005d2b20(&uStack0000000000000048);
        }
        __Unwind_Resume();
        puVar13 = &DAT_00499fc8;
        auVar18 = func_0x007a2668();
        puVar3 = (undefined1 *)register0x00000008;
        goto code_r0x00499fc8;
      }
      lVar4 = *(long *)*unaff_x24;
      *(long *)*unaff_x24 = lVar4 + unaff_x25;
      LORelease();
    } while (lVar4 != 1);
    in_xzr = *(undefined8 *)*unaff_x24;
    func_0x005d2ac4(unaff_x24);
  } while( true );
code_r0x00499fc8:
  uVar1 = ___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E;
  uVar7 = auVar18._8_8_;
  *(long *)(puVar3 + -0x60) = unaff_x28;
  *(undefined8 *)(puVar3 + -0x58) = unaff_x27;
  *(undefined **)(puVar3 + -0x50) = unaff_x26;
  *(long *)(puVar3 + -0x48) = unaff_x25;
  *(undefined8 **)(puVar3 + -0x40) = unaff_x24;
  *(undefined8 **)(puVar3 + -0x38) = puVar12;
  *(long *)(puVar3 + -0x30) = unaff_x22;
  *(long *)(puVar3 + -0x28) = unaff_x21;
  *(char **)(puVar3 + -0x20) = pcVar11;
  *(undefined8 **)(puVar3 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
  *(undefined **)(puVar3 + -8) = puVar13;
  unaff_x29 = puVar3 + -0x10;
  *(undefined1 (*) [16])(puVar3 + -0x150) = auVar18;
  if (2 < ___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E) goto code_r0x0049a048;
  if (___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) {
    uVar7 = (ulong)bRam0000000000a2a6a8;
    if (1 < bRam0000000000a2a6a8 - 1) {
      if (bRam0000000000a2a6a8 != 0) {
        bVar5 = func_0x007b1274(0xa2a698);
        uVar7 = (ulong)bVar5;
        if (bVar5 != 0) goto code_r0x0049a624;
      }
      goto code_r0x0049a010;
    }
code_r0x0049a624:
    iVar6 = func_0x005e7964(lRam0000000000a2a698);
    uVar7 = extraout_x1_24;
    if (iVar6 == 0) goto code_r0x0049a010;
    lVar4 = *(long *)(lRam0000000000a2a698 + 0x38);
    if (lVar4 == 0) {
code_r0x0049a6f4:
      uVar9 = func_0x007a23d8(&UNK_0089f1aa,0x22,&UNK_009e2750);
      func_0x00493e08(puVar3 + -0x100);
      __Unwind_Resume(uVar9);
      puVar12 = (undefined8 *)func_0x007a2668();
      uVar9 = *puVar12;
      extraout_x8[1] = puVar12[1];
      *extraout_x8 = uVar9;
      extraout_x8[2] = puVar12[2];
      return;
    }
    uVar9 = *(undefined8 *)(lRam0000000000a2a698 + 0x30);
    uVar16 = *(undefined8 *)(lRam0000000000a2a698 + 0x48);
    uVar15 = *(undefined8 *)(lRam0000000000a2a698 + 0x40);
    lVar17 = *(long *)(lRam0000000000a2a698 + 0x38);
    *(undefined8 *)(puVar3 + -0xb8) = *(undefined8 *)(lRam0000000000a2a698 + 0x40);
    *(long *)(puVar3 + -0xc0) = lVar17;
    uVar10 = *(undefined8 *)(lRam0000000000a2a698 + 0x48);
    *(undefined8 *)(puVar3 + -200) = uVar9;
    *(undefined8 *)(puVar3 + -0xb0) = uVar10;
    *(undefined8 *)(puVar3 + -0xa8) = 0;
    *(undefined1 **)(puVar3 + -0xa0) = puVar3 + -0x150;
    if (lVar4 == 1) goto code_r0x0049a6f4;
    *(undefined8 *)(puVar3 + -0x98) = uVar9;
    *(long *)(puVar3 + -0x90) = lVar4;
    *(undefined8 *)(puVar3 + -0x80) = uVar16;
    *(undefined8 *)(puVar3 + -0x88) = uVar15;
    *(undefined8 *)(puVar3 + -0x78) = 1;
    *(undefined1 **)(puVar3 + -0x70) = puVar3 + -0x148;
    *(undefined1 **)(puVar3 + -0x100) = puVar3 + -200;
    *(undefined1 **)(puVar3 + -0xf8) = puVar3 + -0xa0;
    *(undefined **)(puVar3 + -0xf0) = &UNK_009e2768;
    *(undefined1 **)(puVar3 + -0xe8) = puVar3 + -0x98;
    *(undefined1 **)(puVar3 + -0xe0) = puVar3 + -0x70;
    *(undefined **)(puVar3 + -0xd8) = &UNK_009e2788;
    *(undefined1 **)(puVar3 + -0x118) = puVar3 + -0x100;
    *(undefined8 *)(puVar3 + -0x110) = 2;
    *(undefined8 **)(puVar3 + -0x108) = (undefined8 *)(lRam0000000000a2a698 + 0x30);
    func_0x005e699c(puVar3 + -0x140,lRam0000000000a2a698,puVar3 + -0x118);
    uVar7 = extraout_x1_25;
  }
  else {
code_r0x0049a010:
    *(undefined8 *)(puVar3 + -0x140) = 2;
    *(undefined8 *)(puVar3 + -0x120) = 0;
  }
  *(undefined8 *)(puVar3 + -0xf8) = *(undefined8 *)(puVar3 + -0x138);
  *(undefined8 *)(puVar3 + -0x100) = *(undefined8 *)(puVar3 + -0x140);
  *(undefined8 *)(puVar3 + -0xe8) = *(undefined8 *)(puVar3 + -0x128);
  *(undefined8 *)(puVar3 + -0xf0) = *(undefined8 *)(puVar3 + -0x130);
  *(undefined8 *)(puVar3 + -0xe0) = *(undefined8 *)(puVar3 + -0x120);
  if (*(long *)(puVar3 + -0x100) != 2) {
    func_0x005ec344(puVar3 + -0x100,puVar3 + -0xe8);
    uVar7 = extraout_x1;
  }
code_r0x0049a048:
  *(ulong *)(puVar3 + -0x158) = uVar1;
  lVar4 = *(long *)(*(long *)(puVar3 + -0x150) + 0x10);
  if (lVar4 == 0) {
code_r0x0049a58c:
    if (*(ulong *)(puVar3 + -0x158) < 3 && *(long *)(puVar3 + -0x100) != 2) {
      func_0x005ec378(puVar3 + -0x100,puVar3 + -0xe8);
      lVar4 = *(long *)(puVar3 + -0x100);
      if ((lVar4 != 2) &&
         (func_0x005ec3ac(puVar3 + -0x100,*(undefined8 *)(puVar3 + -0xe8)), lVar4 != 0)) {
        lVar4 = **(long **)(puVar3 + -0xf8);
        **(long **)(puVar3 + -0xf8) = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          DataMemoryBarrier(2,1);
          func_0x005e80f0((ulong)(puVar3 + -0x100) | 8);
        }
      }
    }
    return;
  }
  unaff_x19 = *(undefined8 **)(*(long *)(puVar3 + -0x150) + 8);
  unaff_x24 = unaff_x19 + lVar4 * 0x21;
  unaff_x27 = 1;
  unaff_x28 = 0x108;
  puVar2 = unaff_x19 + 0x21;
  do {
    puVar12 = puVar2;
    *(undefined8 *)(puVar3 + -200) = *(undefined8 *)(puVar3 + -0x148);
    switch(unaff_x19[3]) {
    case 0xc:
    case 0x11:
    case 0x12:
    case 0x1c:
    case 0x1d:
    case 0x1e:
    case 0x20:
      goto code_r0x0049a3dc;
    case 0xd:
      func_0x005ce834(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_00;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004b27b8(puVar3 + -200,unaff_x21);
        func_0x004b23e4(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_01;
      }
      break;
    case 0xe:
      func_0x005cea94(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_12;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004b27b8(puVar3 + -200,unaff_x21);
        func_0x004b23e4(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_13;
      }
      break;
    case 0xf:
      func_0x004adf08(unaff_x19 + 4,puVar3 + -200);
      uVar7 = extraout_x1_06;
      goto code_r0x0049a3dc;
    case 0x10:
      func_0x005cefd0(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_10;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004aff18(puVar3 + -200,unaff_x21);
        func_0x004af888(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_11;
      }
      break;
    case 0x13:
      func_0x005cf868(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_02;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004a3004(puVar3 + -200,unaff_x21);
        func_0x004a2784(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_03;
      }
      break;
    case 0x14:
      func_0x005cf868(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_04;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004ad4c8(puVar3 + -200,unaff_x21);
        func_0x004aceb8(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_05;
      }
      break;
    default:
      func_0x004a7280(unaff_x19,puVar3 + -200);
      uVar7 = extraout_x1_09;
      goto code_r0x0049a3dc;
    case 0x16:
      func_0x004a7958(unaff_x19 + 4,puVar3 + -200);
      uVar7 = extraout_x1_19;
      goto code_r0x0049a3dc;
    case 0x17:
      func_0x005db648(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_07;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004aa3a8(puVar3 + -200,unaff_x21);
        func_0x004a9af0(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_08;
      }
      break;
    case 0x18:
      func_0x004a7610(unaff_x19 + 4,puVar3 + -200);
      uVar7 = extraout_x1_23;
      goto code_r0x0049a3dc;
    case 0x19:
      func_0x004a7448(unaff_x19 + 4,puVar3 + -200);
      uVar7 = extraout_x1_14;
      goto code_r0x0049a3dc;
    case 0x1a:
      func_0x005dc67c(puVar3 + -0x98,unaff_x19 + 4);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_17;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004aa3a8(puVar3 + -200,unaff_x21);
        func_0x004a9af0(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_18;
      }
      break;
    case 0x1b:
      func_0x005d7448(puVar3 + -0x98,unaff_x19);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_20;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004a3004(puVar3 + -200,unaff_x21);
        func_0x004a2784(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_21;
      }
      break;
    case 0x1f:
      func_0x005cf5a0(puVar3 + -0x98,unaff_x19 + 4,uVar7);
      unaff_x22 = *(long *)(puVar3 + -0x98);
      lVar17 = *(long *)(puVar3 + -0x90);
      lVar8 = *(long *)(puVar3 + -0x88);
      uVar7 = extraout_x1_15;
      for (lVar4 = 0; lVar8 * 8 != lVar4; lVar4 = lVar4 + 8) {
        unaff_x21 = *(long *)(lVar17 + lVar4);
        func_0x004ad4c8(puVar3 + -200,unaff_x21);
        func_0x004aceb8(unaff_x21,puVar3 + -200);
        uVar7 = extraout_x1_16;
      }
    }
    if (unaff_x22 != 0) {
      func_0x00187bd4(lVar17,unaff_x22 << 3,8);
      uVar7 = extraout_x1_22;
    }
code_r0x0049a3dc:
    unaff_x26 = &UNK_0089ed30;
    unaff_x25 = 9;
    lVar4 = unaff_x19[3];
    if (lVar4 < 0x14) {
      if (lVar4 == 0x10) {
        unaff_x21 = unaff_x19[0xc];
        pcVar11 = (char *)(unaff_x21 + 8);
        if (*pcVar11 == '\0') {
          *pcVar11 = '\x01';
        }
        else {
          func_0x007aff64(pcVar11,uVar7,1000000000);
        }
        auVar18._8_8_ = *(undefined8 *)(puVar3 + -0x148);
        auVar18._0_8_ = unaff_x21 + 0x10;
        puVar13 = &UNK_0049a4ac;
        puVar3 = puVar3 + -0x160;
        goto code_r0x00499fc8;
      }
      if (lVar4 == 0x13) {
        unaff_x19 = (undefined8 *)unaff_x19[0xc];
        pcVar11 = (char *)(unaff_x19 + 1);
        if (*pcVar11 == '\0') {
          *pcVar11 = '\x01';
        }
        else {
          func_0x007aff64(pcVar11,uVar7,1000000000);
        }
        auVar18._8_8_ = *(undefined8 *)(puVar3 + -0x148);
        auVar18._0_8_ = unaff_x19 + 2;
        puVar13 = &UNK_0049a45c;
        puVar3 = puVar3 + -0x160;
        goto code_r0x00499fc8;
      }
    }
    else {
      if (lVar4 == 0x14) {
        unaff_x19 = (undefined8 *)unaff_x19[0xc];
        pcVar11 = (char *)(unaff_x19 + 1);
        if (*pcVar11 == '\0') {
          *pcVar11 = '\x01';
        }
        else {
          func_0x007aff64(pcVar11,uVar7,1000000000);
        }
        auVar18._8_8_ = *(undefined8 *)(puVar3 + -0x148);
        auVar18._0_8_ = unaff_x19 + 2;
        puVar13 = &UNK_0049a0a4;
        puVar3 = puVar3 + -0x160;
        goto code_r0x00499fc8;
      }
      if (lVar4 == 0x17) {
        unaff_x19 = (undefined8 *)unaff_x19[0x1d];
        pcVar11 = (char *)(unaff_x19 + 1);
        if (*pcVar11 == '\0') {
          *pcVar11 = '\x01';
        }
        else {
          func_0x007aff64(pcVar11,uVar7,1000000000);
        }
        auVar18._8_8_ = *(undefined8 *)(puVar3 + -0x148);
        auVar18._0_8_ = unaff_x19 + 2;
        puVar13 = &UNK_0049a484;
        puVar3 = puVar3 + -0x160;
        goto code_r0x00499fc8;
      }
      if (lVar4 == 0x1a) break;
    }
    lVar4 = 0;
    if (puVar12 != unaff_x24) {
      lVar4 = 0x108;
    }
    puVar2 = (undefined8 *)((long)puVar12 + lVar4);
    unaff_x19 = puVar12;
    if (puVar12 == unaff_x24) goto code_r0x0049a58c;
  } while( true );
  unaff_x19 = (undefined8 *)unaff_x19[10];
  pcVar11 = (char *)(unaff_x19 + 1);
  if (*pcVar11 == '\0') {
    *pcVar11 = '\x01';
  }
  else {
    func_0x007aff64(pcVar11,uVar7,1000000000);
  }
  auVar18._8_8_ = *(undefined8 *)(puVar3 + -0x148);
  auVar18._0_8_ = unaff_x19 + 2;
  puVar13 = &UNK_0049a424;
  puVar3 = puVar3 + -0x160;
  goto code_r0x00499fc8;
}

