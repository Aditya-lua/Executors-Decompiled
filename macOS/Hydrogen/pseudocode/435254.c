
void FUN_00435254(long param_1)

{
  char cVar1;
  ushort *puVar2;
  long lVar3;
  ushort uVar4;
  char *pcVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 extraout_x1;
  long *plVar11;
  ulong uVar12;
  undefined8 *unaff_x22;
  long lVar13;
  undefined8 *puVar14;
  undefined8 uVar15;
  char *pcVar16;
  ulong uVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  long unaff_x29;
  long lVar21;
  undefined8 uVar22;
  long lVar23;
  undefined1 auVar24 [16];
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  undefined4 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 *in_stack_000000d0;
  long in_stack_000000d8;
  
  do {
    uVar15 = *(undefined8 *)(param_1 + 8);
    uVar10 = *(ulong *)(param_1 + 0x10);
    lStack0000000000000018 = in_stack_00000048;
    lVar13 = in_stack_00000048;
    puVar14 = unaff_x22;
    while( true ) {
      uVar12 = (ulong)*(ushort *)((long)puVar14 + 0x21a);
      lVar18 = uVar12 * 0x18;
      puVar9 = puVar14 + 1;
      lVar8 = 0x43;
      do {
        lVar19 = lVar8;
        if (lVar18 == 0) goto LAB_004352cc;
        uVar20 = puVar9[2];
        uVar17 = uVar10;
        if (uVar20 <= uVar10) {
          uVar17 = uVar20;
        }
        iVar7 = _memcmp(uVar15,puVar9[1],uVar17);
        lVar8 = uVar10 - uVar20;
        if (iVar7 != 0) {
          lVar8 = (long)iVar7;
        }
        cVar1 = 0 < lVar8;
        if (lVar8 < 0) {
          cVar1 = -1;
        }
        lVar18 = lVar18 + -0x18;
        puVar9 = puVar9 + 3;
        lVar8 = lVar19 + 1;
      } while (cVar1 == '\x01');
      if (cVar1 == '\0') break;
      uVar12 = lVar19 - 0x43;
LAB_004352cc:
      if (lVar13 == 0) goto LAB_00435230;
      puVar14 = (undefined8 *)puVar14[uVar12 + 0x44];
      lVar13 = lVar13 + -1;
    }
    *(undefined1 *)(unaff_x29 + -0xf1) = 0;
    if (lVar13 == 0) {
      *(undefined8 **)(unaff_x29 + -0xf0) = puVar14;
      *(undefined8 *)(unaff_x29 + -0xe8) = 0;
      *(long *)(unaff_x29 + -0xe0) = lVar19 + -0x43;
      func_0x00403244(unaff_x29 + -0xc0,unaff_x29 + -0xf0,unaff_x29 + -0xf1);
    }
    else {
      lVar8 = puVar14[lVar19 + 1];
      while (lVar13 = lVar13 + -1, lVar13 != 0) {
        lVar8 = *(long *)(lVar8 + (ulong)*(ushort *)(lVar8 + 0x21a) * 8 + 0x220);
      }
      uVar4 = *(ushort *)(lVar8 + 0x21a);
      *(long *)(unaff_x29 + -0x70) = lVar8;
      *(undefined8 *)(unaff_x29 + -0x68) = 0;
      *(ulong *)(unaff_x29 + -0x60) = (ulong)uVar4 - 1;
      func_0x00403244(unaff_x29 + -0xc0,unaff_x29 + -0x70,unaff_x29 + -0xf1);
      plVar11 = *(long **)(unaff_x29 + -0x90);
      uVar10 = *(ulong *)(unaff_x29 + -0x80);
      if (*(ushort *)((long)plVar11 + 0x21a) <= uVar10) {
        do {
          puVar2 = (ushort *)(plVar11 + 0x43);
          uVar10 = (ulong)*puVar2;
          plVar11 = (long *)*plVar11;
        } while (*(ushort *)((long)plVar11 + 0x21a) <= *puVar2);
      }
      lVar18 = *(long *)(unaff_x29 + -0xb8);
      lVar13 = *(long *)(unaff_x29 + -0xb0);
      lVar19 = *(long *)(unaff_x29 + -0xa8);
      lVar8 = *(long *)(unaff_x29 + -0xa0);
      lVar3 = *(long *)(unaff_x29 + -0x98);
      *(long *)(unaff_x29 + -0xe0) = plVar11[uVar10 * 3 + 3];
      lVar23 = plVar11[uVar10 * 3 + 2];
      lVar21 = plVar11[uVar10 * 3 + 1];
      *(long *)(unaff_x29 + -0xe8) = lVar23;
      *(long *)(unaff_x29 + -0xf0) = lVar21;
      plVar11[uVar10 * 3 + 1] = *(long *)(unaff_x29 + -0xc0);
      plVar11[uVar10 * 3 + 2] = lVar18;
      plVar11[uVar10 * 3 + 3] = lVar13;
      lVar13 = plVar11[uVar10 * 3 + 0x22];
      *(long *)(unaff_x29 + -0xd0) = plVar11[uVar10 * 3 + 0x23];
      *(long *)(unaff_x29 + -0xd8) = lVar13;
      *(long *)(unaff_x29 + -200) = plVar11[uVar10 * 3 + 0x24];
      plVar11[uVar10 * 3 + 0x22] = lVar19;
      plVar11[uVar10 * 3 + 0x23] = lVar8;
      plVar11[uVar10 * 3 + 0x24] = lVar3;
      *(undefined8 *)(unaff_x29 + -0xa8) = *(undefined8 *)(unaff_x29 + -0xd8);
      *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(unaff_x29 + -0xe0);
      *(undefined8 *)(unaff_x29 + -0x98) = *(undefined8 *)(unaff_x29 + -200);
      *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0xd0);
      *(long *)(unaff_x29 + -0xb8) = lVar23;
      *(long *)(unaff_x29 + -0xc0) = lVar21;
    }
    *(undefined8 *)(unaff_x29 + -0xe8) = *(undefined8 *)(unaff_x29 + -0xb8);
    *(undefined8 *)(unaff_x29 + -0xf0) = *(undefined8 *)(unaff_x29 + -0xc0);
    *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(unaff_x29 + -0xa8);
    *(undefined8 *)(unaff_x29 + -0xe0) = *(undefined8 *)(unaff_x29 + -0xb0);
    *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0xa0);
    in_stack_00000050 = in_stack_00000050 - 1;
    if (*(char *)(unaff_x29 + -0xf1) == '\x01') {
      if (lStack0000000000000018 == 0) {
        func_0x007a247c(&UNK_00885311,0x21,&UNK_009d9530);
        goto code_r0x00435984;
      }
      uStack0000000000000040 = (undefined8 *)unaff_x22[0x44];
      in_stack_00000048 = lStack0000000000000018 + -1;
      *uStack0000000000000040 = 0;
      func_0x00187bd4(unaff_x22,0x280,8);
    }
    lVar13 = *(long *)(unaff_x29 + -0xf0);
    if (lVar13 != -0x8000000000000000) {
      uVar10 = *(ulong *)(unaff_x29 + -0xd8);
      uVar15 = *(undefined8 *)(unaff_x29 + -0xd0);
      if (lVar13 != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),lVar13,1);
      }
      if ((uVar10 | 0x8000000000000000) != 0x8000000000000000) goto LAB_00435228;
    }
LAB_00435230:
    do {
      auVar24 = func_0x003f3480(&uStack00000000000000b0);
      uVar10 = in_stack_00000050;
      lVar13 = in_stack_00000048;
      puVar14 = uStack0000000000000040;
      plVar11 = auVar24._8_8_;
      param_1 = auVar24._0_8_;
      if (param_1 == 0) {
        uVar12 = in_stack_00000050 * 0x10;
        if (in_stack_00000050 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar12) {
          uVar15 = 0;
code_r0x00435954:
          func_0x007a1f00(uVar15,uVar12,&UNK_009dbda0);
          goto code_r0x00435984;
        }
        if (uVar12 == 0) {
          uVar12 = 0;
          lVar8 = 8;
        }
        else {
          uVar15 = 8;
          lVar8 = func_0x00187bd0(uVar12,8);
          if (lVar8 == 0) goto code_r0x00435954;
          uVar12 = uVar10;
        }
        *(ulong *)(unaff_x29 + -0xc0) = uVar12;
        *(long *)(unaff_x29 + -0xb8) = lVar8;
        *(undefined8 *)(unaff_x29 + -0xb0) = 0;
        lVar8 = uVar10 + 1;
        lVar18 = lVar8 * 8;
        if (uVar10 < 0xfffffffffffffff) {
          uVar15 = 8;
          puVar9 = (undefined8 *)func_0x00187bd0(lVar18,8);
          if (puVar9 != (undefined8 *)0x0) {
            in_stack_000000b8 = *(long *)(unaff_x29 + -0xb8);
            uStack00000000000000b0 = *(long *)(unaff_x29 + -0xc0);
            in_stack_000000c0 = *(long *)(unaff_x29 + -0xb0);
            *puVar9 = 0;
            in_stack_000000d8 = 1;
            if (puVar14 == (undefined8 *)0x0) {
              uVar10 = 0;
            }
            uVar12 = (ulong)(puVar14 != (undefined8 *)0x0);
            *(ulong *)(unaff_x29 + -0xc0) = uVar12;
            *(undefined8 *)(unaff_x29 + -0xb8) = 0;
            *(undefined8 **)(unaff_x29 + -0xb0) = puVar14;
            *(long *)(unaff_x29 + -0xa8) = lVar13;
            *(undefined8 **)(unaff_x29 + -0x90) = puVar14;
            *(long *)(unaff_x29 + -0x88) = lVar13;
            *(ulong *)(unaff_x29 + -0x80) = uVar10;
            *(ulong *)(unaff_x29 + -0xa0) = uVar12;
            *(undefined8 *)(unaff_x29 + -0x98) = 0;
            uStack00000000000000c8 = lVar8;
            in_stack_000000d0 = puVar9;
            goto code_r0x00435630;
          }
        }
        else {
          uVar15 = 0;
        }
        func_0x007a1f00(uVar15,lVar18,&UNK_009dbdb8);
code_r0x00435984:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x435988);
        (*pcVar6)();
      }
      if (*plVar11 != -0x8000000000000000) {
        lVar13 = *(long *)(param_1 + 0x10);
        if (lVar13 < 0) {
          in_stack_00000000 = 0;
code_r0x00435908:
          func_0x007a1f00(in_stack_00000000,lVar13,&UNK_009d9be8);
          goto code_r0x00435984;
        }
        uVar15 = *(undefined8 *)(param_1 + 8);
        if (lVar13 == 0) {
          lVar8 = 1;
        }
        else {
          lVar8 = func_0x00187bd0(lVar13,1);
          if (lVar8 == 0) goto code_r0x00435908;
        }
        _memcpy(lVar8,uVar15,lVar13);
        *(long *)(unaff_x29 + -0xf0) = lVar13;
        *(long *)(unaff_x29 + -0xe8) = lVar8;
        *(long *)(unaff_x29 + -0xe0) = lVar13;
        lVar13 = plVar11[2];
        if (lVar13 < 0) {
          in_stack_00000000 = 0;
code_r0x00435924:
          func_0x007a1f00(in_stack_00000000,lVar13,&UNK_009d9be8);
          goto code_r0x00435984;
        }
        lVar8 = plVar11[1];
        if (lVar13 == 0) {
          lVar18 = 1;
        }
        else {
          lVar18 = func_0x00187bd0(lVar13,1);
          if (lVar18 == 0) goto code_r0x00435924;
        }
        _memcpy(lVar18,lVar8,lVar13);
        *(long *)(unaff_x29 + -0xc0) = lVar13;
        *(long *)(unaff_x29 + -0xb8) = lVar18;
        *(long *)(unaff_x29 + -0xb0) = lVar13;
        func_0x00400230(unaff_x29 + -0x70,&uStack0000000000000040,unaff_x29 + -0xf0,
                        unaff_x29 + -0xc0);
        uVar10 = *(ulong *)(unaff_x29 + -0x70);
        if ((uVar10 | 0x8000000000000000) != 0x8000000000000000) {
          uVar15 = *(undefined8 *)(unaff_x29 + -0x68);
LAB_00435228:
          func_0x00187bd4(uVar15,uVar10,1);
        }
        goto LAB_00435230;
      }
      unaff_x22 = uStack0000000000000040;
    } while (uStack0000000000000040 == (undefined8 *)0x0);
  } while( true );
code_r0x00435630:
  do {
    func_0x004015e4(unaff_x29 + -0xf0,unaff_x29 + -0xc0);
    if (*(long *)(unaff_x29 + -0xf0) == 0) {
code_r0x0043585c:
      while( true ) {
        func_0x004015e4(unaff_x29 + -0xf0,unaff_x29 + -0xc0);
        if (*(long *)(unaff_x29 + -0xf0) == 0) break;
        lVar13 = *(long *)(unaff_x29 + -0xf0) + *(long *)(unaff_x29 + -0xe0) * 0x18;
        if (*(long *)(lVar13 + 8) != 0) {
          func_0x00187bd4(*(undefined8 *)(lVar13 + 0x10),*(long *)(lVar13 + 8),1);
        }
        if (*(long *)(lVar13 + 0x110) != 0) {
          func_0x00187bd4(*(undefined8 *)(lVar13 + 0x118),*(long *)(lVar13 + 0x110),1);
        }
      }
      in_stack_00000008[1] = in_stack_000000b8;
      *in_stack_00000008 = uStack00000000000000b0;
      in_stack_00000008[3] = uStack00000000000000c8;
      in_stack_00000008[2] = in_stack_000000c0;
      in_stack_00000008[5] = in_stack_000000d8;
      in_stack_00000008[4] = (long)in_stack_000000d0;
      return;
    }
    lVar13 = *(long *)(unaff_x29 + -0xf0) + *(long *)(unaff_x29 + -0xe0) * 0x18;
    uVar10 = *(ulong *)(lVar13 + 8);
    if (uVar10 == 0x8000000000000000) goto code_r0x0043585c;
    lVar8 = *(long *)(lVar13 + 0x110);
    uVar15 = *(undefined8 *)(lVar13 + 0x118);
    uVar17 = *(ulong *)(lVar13 + 0x120);
    *(ulong *)(unaff_x29 + -0x70) = uVar10;
    uVar22 = *(undefined8 *)(lVar13 + 0x10);
    *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(lVar13 + 0x18);
    *(undefined8 *)(unaff_x29 + -0x68) = uVar22;
    uVar12 = uVar17 + 2;
    uVar20 = *(ulong *)(unaff_x29 + -0x60);
    if (uVar10 - uVar20 < uVar12) {
      if ((CARRY8(uVar20,uVar12)) || (uVar12 = uVar20 + uVar12, (long)uVar12 < 0)) {
        uVar15 = 0;
        uVar22 = extraout_x1;
      }
      else {
        if (uVar10 != 0) {
          *(undefined8 *)(unaff_x29 + -0xf0) = *(undefined8 *)(unaff_x29 + -0x68);
          *(ulong *)(unaff_x29 + -0xe0) = uVar10;
        }
        *(ulong *)(unaff_x29 + -0xe8) = (ulong)(uVar10 != 0);
        func_0x0079a108(&uStack0000000000000058,1,uVar12,unaff_x29 + -0xf0);
        if (uStack0000000000000058 != 1) {
          *(ulong *)(unaff_x29 + -0x70) = uVar12;
          *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000060;
          uVar10 = uVar12;
          goto joined_r0x00435800;
        }
        uVar15 = in_stack_00000060;
        uVar22 = in_stack_00000068;
      }
      func_0x007a1f00(uVar15,uVar22,&UNK_009daad0);
      goto code_r0x00435984;
    }
joined_r0x00435800:
    if (uVar10 == uVar20) {
      func_0x007a0000(unaff_x29 + -0x70,uVar20,1,1,1);
      uVar20 = *(ulong *)(unaff_x29 + -0x60);
      uVar10 = *(ulong *)(unaff_x29 + -0x70);
    }
    pcVar16 = *(char **)(unaff_x29 + -0x68);
    pcVar16[uVar20] = '=';
    lVar13 = uVar20 + 1;
    *(long *)(unaff_x29 + -0x60) = lVar13;
    if (uVar10 - lVar13 < uVar17) {
      func_0x007a0000(unaff_x29 + -0x70,lVar13,uVar17,1,1);
      pcVar16 = *(char **)(unaff_x29 + -0x68);
      lVar13 = *(long *)(unaff_x29 + -0x60);
      uVar10 = *(ulong *)(unaff_x29 + -0x70);
    }
    _memcpy(pcVar16 + lVar13,uVar15,uVar17);
    uVar17 = lVar13 + uVar17;
    auVar24._8_8_ = uVar17;
    auVar24._0_8_ = pcVar16;
    *(ulong *)(unaff_x29 + -0x60) = uVar17;
    uVar12 = uVar17;
    pcVar5 = pcVar16;
    if (0xf < uVar17) goto code_r0x004356e8;
    while( true ) {
      if (uVar12 == 0) goto code_r0x0043572c;
      if (*pcVar5 == '\0') break;
      uVar12 = uVar12 - 1;
      pcVar5 = pcVar5 + 1;
    }
code_r0x004356fc:
    if (uVar10 == 0x8000000000000000) goto code_r0x00435748;
    if (uVar10 != 0) {
      func_0x00187bd4(pcVar16,uVar10,1);
    }
    *(undefined1 *)(in_stack_00000010 + 200) = 1;
  } while (lVar8 == 0);
  goto code_r0x00435620;
code_r0x004356e8:
  uVar12 = func_0x0046b0fc(0,pcVar16,uVar17);
  if ((uVar12 & 1) != 0) goto code_r0x004356fc;
code_r0x0043572c:
  *(ulong *)(unaff_x29 + -0xf0) = uVar10;
  *(char **)(unaff_x29 + -0xe8) = pcVar16;
  *(ulong *)(unaff_x29 + -0xe0) = uVar17;
  auVar24 = func_0x004596b8(unaff_x29 + -0xf0);
code_r0x00435748:
  lVar13 = in_stack_000000d8;
  if (in_stack_000000d8 == 0) {
    func_0x007a2570(0xffffffffffffffff,0,&UNK_009dbdd0);
    goto code_r0x00435984;
  }
  in_stack_000000d0[in_stack_000000d8 + -1] = auVar24._0_8_;
  if (in_stack_000000d8 == uStack00000000000000c8) {
    func_0x00404210(&uStack00000000000000c8,&UNK_009dbde8);
  }
  lVar18 = in_stack_000000c0;
  in_stack_000000d0[lVar13] = 0;
  in_stack_000000d8 = lVar13 + 1;
  if (in_stack_000000c0 == uStack00000000000000b0) {
    func_0x00403e60(&uStack00000000000000b0,&UNK_009dbe00);
  }
  *(undefined1 (*) [16])(in_stack_000000b8 + lVar18 * 0x10) = auVar24;
  in_stack_000000c0 = lVar18 + 1;
  if (lVar8 != 0) {
code_r0x00435620:
    func_0x00187bd4(uVar15,lVar8,1);
  }
  goto code_r0x00435630;
}

