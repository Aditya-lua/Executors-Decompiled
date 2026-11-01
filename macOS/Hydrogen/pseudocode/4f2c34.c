
undefined8 FUN_004f2c34(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  ulong *puVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long unaff_x21;
  long lVar12;
  long lVar13;
  long *plVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  long lVar17;
  undefined8 uVar18;
  ulong uVar19;
  long lVar20;
  long unaff_x29;
  undefined8 in_stack_00000010;
  long *in_stack_00000018;
  undefined8 in_stack_00000020;
  long *in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined1 uStack0000000000000078;
  ulong uStack0000000000000090;
  undefined8 uStack0000000000000098;
  undefined8 uStack00000000000000a0;
  long lStack00000000000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  
code_r0x004f2c34:
  if (*(long *)(unaff_x29 + -0xa8) == -0x7ffffffffffffff7) {
LAB_004f2f0c:
    return *(undefined8 *)(unaff_x29 + -0xa0);
  }
  uStack0000000000000098 = *(undefined8 *)(unaff_x29 + -0xa0);
  uStack0000000000000090 = *(ulong *)(unaff_x29 + -0xa8);
  lStack00000000000000a8 = *(long *)(unaff_x29 + -0x90);
  uStack00000000000000a0 = *(undefined8 *)(unaff_x29 + -0x98);
  uStack00000000000000b8 = *(undefined8 *)(unaff_x29 + -0x80);
  uStack00000000000000b0 = *(undefined8 *)(unaff_x29 + -0x88);
  uStack00000000000000c8 = *(undefined8 *)(unaff_x29 + -0x70);
  uStack00000000000000c0 = *(undefined8 *)(unaff_x29 + -0x78);
  uStack00000000000000d0 = *(undefined8 *)(unaff_x29 + -0x68);
  uVar5 = uStack0000000000000090 ^ 0x8000000000000000;
  if (8 < uVar5) {
    uVar5 = 4;
  }
  plVar6 = in_stack_00000030;
  if (uVar5 - 6 < 2) goto LAB_004f2eec;
  if (uVar5 == 4) goto LAB_004f2ebc;
code_r0x004f2c98:
  plVar6 = in_stack_00000030;
  if (uVar5 == 0) goto LAB_004f2eec;
LAB_004f2b20:
  do {
    lVar11 = unaff_x21;
    unaff_x21 = lVar11 + 600;
    if (unaff_x21 == in_stack_00000038) {
      return 0;
    }
    lVar7 = *(long *)(lVar11 + 0x3f0);
    if ((lVar7 != 0) && (*(long *)(in_stack_00000058 + 0x50) != 0)) {
      lVar17 = *(long *)(lVar11 + 0x478);
      uVar18 = *(undefined8 *)(lVar11 + 0x470);
      plVar6 = (long *)(*(long *)(in_stack_00000058 + 0x48) + 8);
      lVar10 = *(long *)(in_stack_00000058 + 0x50) << 4;
      lVar12 = lVar10;
      plVar14 = plVar6;
      do {
        if ((*plVar14 == lVar17) && (iVar3 = _memcmp(plVar14[-1],uVar18,lVar17), iVar3 == 0))
        goto code_r0x004f2b94;
        plVar14 = plVar14 + 2;
        lVar12 = lVar12 + -0x10;
      } while (lVar12 != 0);
      puVar15 = *(undefined8 **)(lVar11 + 1000);
      lVar12 = *(long *)(in_stack_00000058 + 0x60);
      uVar5 = *(ulong *)(in_stack_00000058 + 0x68);
      puVar16 = puVar15;
      do {
        uVar19 = 0;
        puVar1 = puVar16 + 6;
        uVar18 = *puVar16;
        lVar17 = puVar16[1];
        plVar8 = (long *)(lVar12 + 0x58);
        lVar9 = lVar10;
        plVar14 = plVar6;
        do {
          if ((*plVar14 == lVar17) && (iVar3 = _memcmp(plVar14[-1],uVar18,lVar17), iVar3 == 0)) {
            if (uVar5 <= uVar19) goto code_r0x004f2f3c;
            uVar19 = puVar16[2];
            if (uVar19 == 0) goto code_r0x004f2dac;
            if (*plVar8 != 0) {
              lVar17 = plVar8[-1];
              lVar9 = lVar17 + *plVar8 * 0x18;
              do {
                if (*(long *)(lVar17 + 0x10) != 0) {
                  lVar20 = puVar16[3];
                  lVar13 = *(long *)(lVar17 + 0x10) * 0x18;
                  plVar14 = (long *)(*(long *)(lVar17 + 8) + 0x10);
                  do {
                    if ((lVar20 == *plVar14) &&
                       (iVar3 = _memcmp(uVar19,plVar14[-1],lVar20), iVar3 == 0))
                    goto code_r0x004f2dac;
                    lVar13 = lVar13 + -0x18;
                    plVar14 = plVar14 + 3;
                  } while (lVar13 != 0);
                }
                lVar17 = lVar17 + 0x18;
              } while (lVar17 != lVar9);
            }
            break;
          }
          plVar14 = plVar14 + 2;
          plVar8 = plVar8 + 0xd;
          uVar19 = uVar19 + 1;
          lVar9 = lVar9 + -0x10;
        } while (lVar9 != 0);
        puVar16 = puVar1;
      } while (puVar1 != puVar15 + lVar7 * 6);
    }
code_r0x004f2b94:
    lVar7 = *(long *)(lVar11 + 0x3d8);
  } while (lVar7 == 0);
  if (*(long *)(in_stack_00000058 + 0x50) != 0) {
    lVar10 = *(long *)(lVar11 + 0x478);
    uVar18 = *(undefined8 *)(lVar11 + 0x470);
    plVar6 = (long *)(*(long *)(in_stack_00000058 + 0x48) + 8);
    lVar12 = *(long *)(in_stack_00000058 + 0x50) << 4;
    do {
      if (*plVar6 == lVar10) {
        iVar3 = _memcmp(plVar6[-1],uVar18,lVar10);
        if (iVar3 == 0) goto LAB_004f2b20;
      }
      plVar6 = plVar6 + 2;
      lVar12 = lVar12 + -0x10;
      if (lVar12 == 0) break;
    } while( true );
  }
  func_0x004e8a1c(&uStack0000000000000078,*(long *)(lVar11 + 0x3d0),
                  *(long *)(lVar11 + 0x3d0) + lVar7 * 0x10,&UNK_009e8050);
  func_0x004f17d0(unaff_x29 + -0xa8,in_stack_00000020,3,0,unaff_x21,&uStack0000000000000078,0);
  goto code_r0x004f2c34;
code_r0x004f2dac:
  if (puVar16[4] == 0) goto LAB_004f2b20;
  puVar4 = (ulong *)func_0x00187bd0(0x18,8);
  if (puVar4 == (ulong *)0x0) {
    func_0x007a1f18(8,0x18);
code_r0x004f2f3c:
    func_0x007a2570(uVar19,uVar5,&UNK_009e9b68);
  }
  else {
    uVar19 = puVar16[5];
    if (-1 < (long)uVar19) {
      uVar18 = puVar16[4];
      if (uVar19 == 0) {
        uVar5 = 1;
code_r0x004f2e0c:
        _memcpy(uVar5,uVar18,uVar19);
        *puVar4 = uVar19;
        puVar4[1] = uVar5;
        puVar4[2] = uVar19;
        uStack0000000000000060 = 1;
        in_stack_00000070 = 1;
        in_stack_00000068 = puVar4;
        func_0x004f17d0(unaff_x29 + -0xa8,in_stack_00000020,3,0,unaff_x21,&uStack0000000000000060,0)
        ;
        if (*(long *)(unaff_x29 + -0xa8) == -0x7ffffffffffffff7) goto LAB_004f2f0c;
        uStack0000000000000098 = *(undefined8 *)(unaff_x29 + -0xa0);
        uStack0000000000000090 = *(ulong *)(unaff_x29 + -0xa8);
        lStack00000000000000a8 = *(long *)(unaff_x29 + -0x90);
        uStack00000000000000a0 = *(undefined8 *)(unaff_x29 + -0x98);
        uStack00000000000000b8 = *(undefined8 *)(unaff_x29 + -0x80);
        uStack00000000000000b0 = *(undefined8 *)(unaff_x29 + -0x88);
        uStack00000000000000c8 = *(undefined8 *)(unaff_x29 + -0x70);
        uStack00000000000000c0 = *(undefined8 *)(unaff_x29 + -0x78);
        uStack00000000000000d0 = *(undefined8 *)(unaff_x29 + -0x68);
        uVar5 = uStack0000000000000090 ^ 0x8000000000000000;
        if (8 < uVar5) {
          uVar5 = 4;
        }
        plVar6 = in_stack_00000030;
        if (1 < uVar5 - 6) {
          if (uVar5 != 4) goto code_r0x004f2c98;
LAB_004f2ebc:
          if (uStack0000000000000090 != 0) {
            func_0x00187bd4(uStack0000000000000098,uStack0000000000000090,1);
          }
          plVar6 = in_stack_00000018;
          if (lStack00000000000000a8 != 0) {
            func_0x00187bd4(uStack00000000000000b0,lStack00000000000000a8 << 4,8);
          }
        }
LAB_004f2eec:
        if (*plVar6 != 0) {
          func_0x00187bd4(plVar6[1],*plVar6,1);
        }
        goto LAB_004f2b20;
      }
      uVar5 = func_0x00187bd0(uVar19,1);
      if (uVar5 != 0) goto code_r0x004f2e0c;
      goto code_r0x004f2f54;
    }
  }
  in_stack_00000010 = 0;
code_r0x004f2f54:
  func_0x007a1f00(in_stack_00000010,uVar19,&UNK_009e8da8);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4f2f6c);
  (*pcVar2)();
}

