
/* WARNING: Removing unreachable block (ram,0x0050ddb4) */

void FUN_0050da08(undefined8 param_1)

{
  undefined1 *puVar1;
  undefined *puVar2;
  undefined1 *puVar3;
  code *pcVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined1 *puVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  undefined8 *puVar14;
  long lVar15;
  ulong unaff_x19;
  uint unaff_w20;
  uint uVar16;
  undefined8 *puVar17;
  ulong unaff_x21;
  ulong unaff_x22;
  uint unaff_w23;
  ulong uVar18;
  undefined1 *puVar19;
  long unaff_x24;
  undefined8 uVar20;
  int unaff_w25;
  ulong uVar21;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined8 uVar22;
  undefined8 uVar25;
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  uint uStack0000000000000024;
  int iStack0000000000000034;
  long in_stack_00000038;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined1 uStack0000000000000060;
  undefined *in_stack_00000068;
  undefined1 *in_stack_00000070;
  undefined1 uStack0000000000000078;
  undefined *puStack0000000000000080;
  undefined1 *puStack0000000000000088;
  undefined *puStack0000000000000090;
  undefined1 uStack0000000000000098;
  long lStack00000000000000a0;
  undefined1 *in_stack_000000a8;
  
  _uStack0000000000000098 = &UNK_008a50ad;
  lStack00000000000000a0 = 2;
  _uStack0000000000000078 = &uStack0000000000000060;
  puStack0000000000000080 = &DAT_00524378;
  puStack0000000000000088 = &uStack0000000000000098;
  puStack0000000000000090 = &DAT_00519924;
  *(undefined **)(unaff_x29 + -0x88) = &UNK_008a50b0;
  *(undefined8 *)(unaff_x29 + -0x80) = 3;
  *(undefined **)(unaff_x29 + -0x68) = &UNK_008a5018;
  *(undefined8 *)(unaff_x29 + -0x60) = 3;
  *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000078;
  *(undefined8 *)(unaff_x29 + -0x70) = 2;
  _uStack0000000000000060 = (undefined1 *)param_1;
  func_0x0046849c(&uStack0000000000000048,&UNK_009e8fe8,unaff_x29 + -0x88);
  uVar16 = *(uint *)(unaff_x24 + 0x250);
  if ((unaff_w20 & 0xff) != 2) {
    uVar16 = unaff_w20;
  }
  _uStack0000000000000098 = (undefined1 *)0x0;
  lStack00000000000000a0 = 1;
  in_stack_000000a8 = (undefined1 *)0x0;
  if ((unaff_x19 & 1) == 0) {
    unaff_x21 = 1;
    unaff_x22 = 1;
  }
  uVar21 = *(ulong *)(unaff_x24 + 0x168);
  uStack0000000000000024 = unaff_w23;
  iStack0000000000000034 = unaff_w25;
  if (uVar21 == 0) {
    puVar5 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar5 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x10);
      goto LAB_0050e294;
    }
    uVar22 = *(undefined8 *)(unaff_x24 + 0x218);
    uVar6 = *(ulong *)(unaff_x24 + 0x220);
    *puVar5 = uVar22;
    puVar5[1] = uVar6;
LAB_0050dbec:
    uVar20 = 0;
    uVar10 = unaff_x21 - 1;
    uVar21 = unaff_x21;
    if (unaff_x21 == 0 || uVar10 == 0) {
      uVar21 = 1;
    }
    uVar18 = uVar21 * 0x10;
    if ((unaff_x21 >> 0x3c == 0) && (uVar18 < 0x7ffffffffffffff9)) {
      uVar20 = 8;
      puVar17 = (undefined8 *)func_0x00187bd0(uVar18,8);
      if (puVar17 != (undefined8 *)0x0) {
        if (unaff_x21 < 2) {
          *puVar17 = uVar22;
          puVar17[1] = uVar6;
        }
        else {
          if (unaff_x21 < 9) {
            uVar11 = 1;
            puVar8 = puVar17;
LAB_0050dcb0:
            lVar12 = unaff_x21 - uVar11;
            puVar7 = puVar8;
            do {
              puVar8 = puVar7 + 2;
              *puVar7 = uVar22;
              puVar7[1] = uVar6;
              lVar12 = lVar12 + -1;
              puVar7 = puVar8;
            } while (lVar12 != 0);
          }
          else {
            uVar13 = uVar10 & 0xfffffffffffffff8;
            puVar8 = puVar17 + uVar13 * 2;
            uVar11 = uVar13 | 1;
            auVar23._8_8_ = 0;
            auVar23._0_8_ = uVar6;
            auVar24._8_8_ = uVar22;
            auVar24._0_8_ = uVar22;
            auVar24 = NEON_ext(auVar24,auVar23,8,1);
            puVar7 = puVar17 + 8;
            uVar18 = uVar13;
            do {
              puVar7[-7] = uVar6;
              puVar7[-8] = uVar22;
              uVar25 = auVar24._8_8_;
              puVar7[-5] = uVar25;
              uVar20 = auVar24._0_8_;
              puVar7[-6] = uVar20;
              puVar7[-3] = uVar6;
              puVar7[-4] = uVar22;
              puVar7[-1] = uVar25;
              puVar7[-2] = uVar20;
              puVar7[1] = uVar6;
              *puVar7 = uVar22;
              puVar7[3] = uVar25;
              puVar7[2] = uVar20;
              puVar7[5] = uVar6;
              puVar7[4] = uVar22;
              puVar7[7] = uVar25;
              puVar7[6] = uVar20;
              puVar7 = puVar7 + 0x10;
              uVar18 = uVar18 - 8;
            } while (uVar18 != 0);
            if (uVar10 != uVar13) goto LAB_0050dcb0;
          }
          *puVar8 = uVar22;
          puVar8[1] = uVar6;
        }
        func_0x00187bd4(puVar5,0x10,8);
        puVar7 = puVar17 + uVar21 * 2;
        puVar5 = puVar17;
        goto LAB_0050dce8;
      }
    }
    func_0x007a1f00(uVar20,uVar18,&UNK_009e90e8);
LAB_0050e294:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x50e298);
    (*pcVar4)();
  }
  puVar17 = *(undefined8 **)(unaff_x24 + 0x160);
  puVar5 = (undefined8 *)func_0x00187bd0(uVar21 * 0x10,8);
  if (puVar5 == (undefined8 *)0x0) {
    func_0x007a1f00(8,uVar21 * 0x10,&UNK_009e7fc8);
    goto LAB_0050e294;
  }
  uVar10 = uVar21 - 1;
  uVar6 = uVar21;
  if (uVar10 <= uVar21) {
    uVar6 = uVar10;
  }
  if (uVar6 < 8) {
LAB_0050db24:
    lVar12 = 0;
    uVar6 = uVar21;
    puVar7 = puVar17;
  }
  else {
    uVar18 = uVar21;
    if (uVar10 <= uVar21) {
      uVar18 = uVar10;
    }
    if ((puVar5 < puVar17 + uVar18 * 2 + 2) && (puVar17 < puVar5 + uVar18 * 2 + 2))
    goto LAB_0050db24;
    uVar10 = uVar6 + 1 & 3;
    uVar18 = 4;
    if (uVar10 != 0) {
      uVar18 = uVar10;
    }
    lVar12 = (uVar6 + 1) - uVar18;
    uVar6 = uVar21 - lVar12;
    puVar7 = puVar17 + lVar12 * 2;
    puVar8 = puVar5 + 4;
    puVar14 = puVar17 + 4;
    lVar15 = lVar12;
    do {
      uVar20 = puVar14[-3];
      uVar22 = puVar14[-2];
      uVar25 = puVar14[-1];
      uVar26 = *puVar14;
      uVar28 = puVar14[1];
      uVar27 = puVar14[2];
      uVar29 = puVar14[3];
      puVar8[-4] = puVar14[-4];
      puVar8[-3] = uVar20;
      puVar8[-2] = uVar22;
      puVar8[-1] = uVar25;
      *puVar8 = uVar26;
      puVar8[1] = uVar28;
      puVar8[2] = uVar27;
      puVar8[3] = uVar29;
      puVar8 = puVar8 + 8;
      puVar14 = puVar14 + 8;
      lVar15 = lVar15 + -4;
    } while (lVar15 != 0);
  }
  puVar8 = puVar5 + lVar12 * 2 + 1;
  do {
    if (puVar7 == puVar17 + uVar21 * 2) break;
    uVar22 = puVar7[1];
    puVar8[-1] = *puVar7;
    *puVar8 = uVar22;
    puVar8 = puVar8 + 2;
    uVar6 = uVar6 - 1;
    puVar7 = puVar7 + 2;
  } while (uVar6 != 0);
  if (uVar21 == 1) {
    uVar22 = *puVar5;
    uVar6 = puVar5[1];
    goto LAB_0050dbec;
  }
  puVar7 = puVar5 + uVar21 * 2;
LAB_0050dce8:
  puVar17 = puVar5 + 2;
  *(undefined8 **)(unaff_x29 + -0x90) = puVar5;
  if (((in_stack_00000038 == 0) && (iStack0000000000000034 == 0x110000)) &&
     ((unaff_x21 != 0 & uVar16) == 0)) {
    _uStack0000000000000060 = (undefined1 *)(unaff_x29 + -0x90);
    in_stack_00000068 = &DAT_00507bec;
    *(undefined **)(unaff_x29 + -0x88) = &UNK_009e9100;
    *(undefined8 *)(unaff_x29 + -0x80) = 2;
    *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000060;
    *(undefined8 *)(unaff_x29 + -0x70) = 1;
    *(undefined8 *)(unaff_x29 + -0x68) = 0;
    func_0x00459f08(&uStack0000000000000078,unaff_x29 + -0x88);
    puVar19 = puStack0000000000000088;
    puVar2 = puStack0000000000000080;
    puVar1 = _uStack0000000000000078;
    if (puStack0000000000000088 == (undefined1 *)0x0) {
      lVar15 = 0;
      lVar12 = 1;
    }
    else {
      func_0x007a5594(&uStack0000000000000098,0,puStack0000000000000088,1,1);
      lVar15 = (long)in_stack_000000a8;
      lVar12 = lStack00000000000000a0;
    }
    _memcpy(lVar12 + lVar15,puVar2,puVar19);
    puVar19 = puVar19 + lVar15;
    in_stack_000000a8 = puVar19;
    if (puVar1 != (undefined1 *)0x0) {
      func_0x00187bd4(puVar2,puVar1,1);
    }
    if (uVar21 == 1) {
      iStack0000000000000034 = 0x110000;
    }
    else {
      do {
        _uStack0000000000000060 = (undefined1 *)(unaff_x29 + -0x90);
        in_stack_00000068 = &DAT_00507bec;
        *(undefined8 **)(unaff_x29 + -0x90) = puVar17;
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009e9100;
        *(undefined8 *)(unaff_x29 + -0x80) = 2;
        *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000060;
        *(undefined8 *)(unaff_x29 + -0x70) = 1;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        func_0x00459f08(&uStack0000000000000078,unaff_x29 + -0x88);
        puVar3 = puStack0000000000000088;
        puVar2 = puStack0000000000000080;
        puVar1 = _uStack0000000000000078;
        puVar9 = puVar19;
        if (_uStack0000000000000098 == puVar19) {
          func_0x007a5594(&uStack0000000000000098,puVar19,1,1,1);
          puVar9 = in_stack_000000a8;
          lVar12 = lStack00000000000000a0;
        }
        puVar9[lVar12] = 0x20;
        in_stack_000000a8 = puVar19 + 1;
        if (_uStack0000000000000098 + -(long)in_stack_000000a8 < puVar3) {
          func_0x007a5594(&uStack0000000000000098,in_stack_000000a8,puVar3,1,1);
        }
        puVar19 = in_stack_000000a8;
        lVar12 = lStack00000000000000a0;
        _memcpy(in_stack_000000a8 + lStack00000000000000a0,puVar2,puVar3);
        puVar19 = puVar19 + (long)puVar3;
        in_stack_000000a8 = puVar19;
        if (puVar1 != (undefined1 *)0x0) {
          func_0x00187bd4(puVar2,puVar1,1);
        }
        puVar17 = puVar17 + 2;
      } while (puVar17 != puVar7);
      iStack0000000000000034 = 0x110000;
    }
LAB_0050e07c:
    if ((iStack0000000000000034 != 0x110000) ||
       (uVar16 = uStack0000000000000024, *(char *)(unaff_x24 + 0x254) != '\x01')) goto LAB_0050e094;
  }
  else {
    _uStack0000000000000060 = (undefined1 *)(unaff_x29 + -0x90);
    in_stack_00000068 = &DAT_00507bec;
    *(undefined **)(unaff_x29 + -0x88) = &UNK_009e9120;
    *(undefined8 *)(unaff_x29 + -0x80) = 2;
    *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000060;
    *(undefined8 *)(unaff_x29 + -0x70) = 1;
    *(undefined8 *)(unaff_x29 + -0x68) = 0;
    func_0x00459f08(&uStack0000000000000078,unaff_x29 + -0x88);
    puVar19 = puStack0000000000000088;
    puVar2 = puStack0000000000000080;
    puVar1 = _uStack0000000000000078;
    if (puStack0000000000000088 == (undefined1 *)0x0) {
      lVar15 = 0;
      lVar12 = 1;
    }
    else {
      func_0x007a5594(&uStack0000000000000098,0,puStack0000000000000088,1,1);
      lVar15 = (long)in_stack_000000a8;
      lVar12 = lStack00000000000000a0;
    }
    _memcpy(lVar12 + lVar15,puVar2,puVar19);
    puVar19 = puVar19 + lVar15;
    in_stack_000000a8 = puVar19;
    if (puVar1 != (undefined1 *)0x0) {
      func_0x00187bd4(puVar2,puVar1,1);
    }
    if (uVar21 != 1) {
      do {
        _uStack0000000000000060 = (undefined1 *)(unaff_x29 + -0x90);
        in_stack_00000068 = &DAT_00507bec;
        *(undefined8 **)(unaff_x29 + -0x90) = puVar17;
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009e9120;
        *(undefined8 *)(unaff_x29 + -0x80) = 2;
        *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000060;
        *(undefined8 *)(unaff_x29 + -0x70) = 1;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        func_0x00459f08(&uStack0000000000000078,unaff_x29 + -0x88);
        puVar3 = puStack0000000000000088;
        puVar2 = puStack0000000000000080;
        puVar1 = _uStack0000000000000078;
        puVar9 = puVar19;
        if (_uStack0000000000000098 == puVar19) {
          func_0x007a5594(&uStack0000000000000098,puVar19,1,1,1);
          puVar9 = in_stack_000000a8;
          lVar12 = lStack00000000000000a0;
        }
        puVar9[lVar12] = 0x20;
        in_stack_000000a8 = puVar19 + 1;
        if (_uStack0000000000000098 + -(long)in_stack_000000a8 < puVar3) {
          func_0x007a5594(&uStack0000000000000098,in_stack_000000a8,puVar3,1,1);
        }
        puVar19 = in_stack_000000a8;
        lVar12 = lStack00000000000000a0;
        _memcpy(in_stack_000000a8 + lStack00000000000000a0,puVar2,puVar3);
        puVar19 = puVar19 + (long)puVar3;
        in_stack_000000a8 = puVar19;
        if (puVar1 != (undefined1 *)0x0) {
          func_0x00187bd4(puVar2,puVar1,1);
        }
        puVar17 = puVar17 + 2;
      } while (puVar17 != puVar7);
    }
    if (in_stack_00000038 == 0) goto LAB_0050e07c;
LAB_0050e094:
    uVar16 = uStack0000000000000024;
    if (unaff_x22 <= uVar21) goto LAB_0050e0c8;
  }
  if ((ulong)((long)_uStack0000000000000098 - (long)puVar19) < 3) {
    func_0x007a5594(&uStack0000000000000098,puVar19,3,1,1);
    lVar12 = lStack00000000000000a0;
    puVar19 = in_stack_000000a8;
  }
  *(undefined1 *)((long)(puVar19 + lVar12) + 2) = 0x2e;
  *(undefined2 *)(puVar19 + lVar12) = 0x2e2e;
  in_stack_000000a8 = puVar19 + 3;
LAB_0050e0c8:
  in_stack_00000068 = (undefined *)lStack00000000000000a0;
  _uStack0000000000000060 = _uStack0000000000000098;
  in_stack_00000070 = in_stack_000000a8;
  func_0x00187bd4(puVar5,uVar21 << 4,8);
  _uStack0000000000000078 = &uStack0000000000000040;
  puStack0000000000000080 = &DAT_00524378;
  puStack0000000000000088 = &uStack0000000000000060;
  puStack0000000000000090 = &DAT_0050c808;
  *(undefined **)(unaff_x29 + -0x88) = &UNK_008a50b0;
  *(undefined8 *)(unaff_x29 + -0x80) = 3;
  *(undefined **)(unaff_x29 + -0x68) = &UNK_008a5018;
  *(undefined8 *)(unaff_x29 + -0x60) = 3;
  *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000078;
  *(undefined8 *)(unaff_x29 + -0x70) = 2;
  func_0x0046849c(&uStack0000000000000048,&UNK_009e8fe8,unaff_x29 + -0x88);
  if (_uStack0000000000000060 != (undefined1 *)0x0) {
    func_0x00187bd4(in_stack_00000068,_uStack0000000000000060,1);
  }
  if ((uVar16 & 1) != 0) {
    _uStack0000000000000078 = &uStack0000000000000040;
    puStack0000000000000080 = &DAT_00524378;
    *(undefined **)(unaff_x29 + -0x88) = &UNK_009e90c8;
    *(undefined8 *)(unaff_x29 + -0x80) = 2;
    *(undefined **)(unaff_x29 + -0x68) = &UNK_008a50e8;
    *(undefined8 *)(unaff_x29 + -0x60) = 2;
    *(undefined1 **)(unaff_x29 + -0x78) = &uStack0000000000000078;
    *(undefined8 *)(unaff_x29 + -0x70) = 1;
    func_0x0046849c(&uStack0000000000000048,&UNK_009e8fe8,unaff_x29 + -0x88);
  }
  unaff_x28[1] = in_stack_00000050;
  *unaff_x28 = uStack0000000000000048;
  unaff_x28[2] = in_stack_00000058;
  return;
}

