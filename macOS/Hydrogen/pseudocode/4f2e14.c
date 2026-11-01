
undefined8 FUN_004f2e14(ulong param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long unaff_x21;
  long lVar11;
  long lVar12;
  long *plVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  long lVar16;
  ulong *unaff_x24;
  undefined8 uVar17;
  ulong unaff_x25;
  long lVar18;
  ulong unaff_x27;
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
  ulong in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  
code_r0x004f2e14:
  _memcpy(param_1,param_2,unaff_x25);
  *unaff_x24 = unaff_x25;
  unaff_x24[1] = unaff_x27;
  unaff_x24[2] = unaff_x25;
  uStack0000000000000060 = 1;
  in_stack_00000070 = 1;
  in_stack_00000068 = unaff_x24;
  func_0x004f17d0(unaff_x29 + -0xa8,in_stack_00000020,3,0,unaff_x21,&uStack0000000000000060,0);
  if (*(long *)(unaff_x29 + -0xa8) == -0x7ffffffffffffff7) {
LAB_004f2f0c:
    return *(undefined8 *)(unaff_x29 + -0xa0);
  }
  in_stack_00000098 = *(undefined8 *)(unaff_x29 + -0xa0);
  in_stack_00000090 = *(ulong *)(unaff_x29 + -0xa8);
  in_stack_000000a8 = *(long *)(unaff_x29 + -0x90);
  in_stack_000000a0 = *(undefined8 *)(unaff_x29 + -0x98);
  in_stack_000000b8 = *(undefined8 *)(unaff_x29 + -0x80);
  in_stack_000000b0 = *(undefined8 *)(unaff_x29 + -0x88);
  in_stack_000000c8 = *(undefined8 *)(unaff_x29 + -0x70);
  in_stack_000000c0 = *(undefined8 *)(unaff_x29 + -0x78);
  in_stack_000000d0 = *(undefined8 *)(unaff_x29 + -0x68);
  uVar4 = in_stack_00000090 ^ 0x8000000000000000;
  if (8 < uVar4) {
    uVar4 = 4;
  }
  plVar5 = in_stack_00000030;
  if (uVar4 - 6 < 2) goto LAB_004f2eec;
  if (uVar4 != 4) goto LAB_004f2c98;
code_r0x004f2ebc:
  if (in_stack_00000090 != 0) {
    func_0x00187bd4(in_stack_00000098,in_stack_00000090,1);
  }
  plVar5 = in_stack_00000018;
  if (in_stack_000000a8 != 0) {
    func_0x00187bd4(in_stack_000000b0,in_stack_000000a8 << 4,8);
    plVar5 = in_stack_00000018;
  }
LAB_004f2eec:
  do {
    if (*plVar5 != 0) {
      func_0x00187bd4(plVar5[1],*plVar5,1);
    }
LAB_004f2b20:
    do {
      do {
        lVar10 = unaff_x21;
        unaff_x21 = lVar10 + 600;
        if (unaff_x21 == in_stack_00000038) {
          return 0;
        }
        lVar6 = *(long *)(lVar10 + 0x3f0);
        if ((lVar6 != 0) && (*(long *)(in_stack_00000058 + 0x50) != 0)) {
          lVar16 = *(long *)(lVar10 + 0x478);
          uVar17 = *(undefined8 *)(lVar10 + 0x470);
          plVar5 = (long *)(*(long *)(in_stack_00000058 + 0x48) + 8);
          lVar9 = *(long *)(in_stack_00000058 + 0x50) << 4;
          lVar11 = lVar9;
          plVar13 = plVar5;
          do {
            if ((*plVar13 == lVar16) && (iVar3 = _memcmp(plVar13[-1],uVar17,lVar16), iVar3 == 0))
            goto code_r0x004f2b94;
            plVar13 = plVar13 + 2;
            lVar11 = lVar11 + -0x10;
          } while (lVar11 != 0);
          puVar14 = *(undefined8 **)(lVar10 + 1000);
          lVar11 = *(long *)(in_stack_00000058 + 0x60);
          uVar4 = *(ulong *)(in_stack_00000058 + 0x68);
          puVar15 = puVar14;
          do {
            unaff_x25 = 0;
            puVar1 = puVar15 + 6;
            uVar17 = *puVar15;
            lVar16 = puVar15[1];
            plVar7 = (long *)(lVar11 + 0x58);
            lVar8 = lVar9;
            plVar13 = plVar5;
            do {
              if ((*plVar13 == lVar16) && (iVar3 = _memcmp(plVar13[-1],uVar17,lVar16), iVar3 == 0))
              {
                if (uVar4 <= unaff_x25) goto code_r0x004f2f3c;
                unaff_x25 = puVar15[2];
                if (unaff_x25 == 0) goto code_r0x004f2dac;
                if (*plVar7 != 0) {
                  lVar16 = plVar7[-1];
                  lVar8 = lVar16 + *plVar7 * 0x18;
                  do {
                    if (*(long *)(lVar16 + 0x10) != 0) {
                      lVar18 = puVar15[3];
                      lVar12 = *(long *)(lVar16 + 0x10) * 0x18;
                      plVar13 = (long *)(*(long *)(lVar16 + 8) + 0x10);
                      do {
                        if ((lVar18 == *plVar13) &&
                           (iVar3 = _memcmp(unaff_x25,plVar13[-1],lVar18), iVar3 == 0))
                        goto code_r0x004f2dac;
                        lVar12 = lVar12 + -0x18;
                        plVar13 = plVar13 + 3;
                      } while (lVar12 != 0);
                    }
                    lVar16 = lVar16 + 0x18;
                  } while (lVar16 != lVar8);
                }
                break;
              }
              plVar13 = plVar13 + 2;
              plVar7 = plVar7 + 0xd;
              unaff_x25 = unaff_x25 + 1;
              lVar8 = lVar8 + -0x10;
            } while (lVar8 != 0);
            puVar15 = puVar1;
          } while (puVar1 != puVar14 + lVar6 * 6);
        }
code_r0x004f2b94:
        lVar6 = *(long *)(lVar10 + 0x3d8);
      } while (lVar6 == 0);
      if (*(long *)(in_stack_00000058 + 0x50) != 0) {
        lVar9 = *(long *)(lVar10 + 0x478);
        uVar17 = *(undefined8 *)(lVar10 + 0x470);
        plVar5 = (long *)(*(long *)(in_stack_00000058 + 0x48) + 8);
        lVar11 = *(long *)(in_stack_00000058 + 0x50) << 4;
        do {
          if (*plVar5 == lVar9) {
            iVar3 = _memcmp(plVar5[-1],uVar17,lVar9);
            if (iVar3 == 0) goto LAB_004f2b20;
          }
          plVar5 = plVar5 + 2;
          lVar11 = lVar11 + -0x10;
        } while (lVar11 != 0);
      }
      func_0x004e8a1c(&uStack0000000000000078,*(long *)(lVar10 + 0x3d0),
                      *(long *)(lVar10 + 0x3d0) + lVar6 * 0x10,&UNK_009e8050);
      func_0x004f17d0(unaff_x29 + -0xa8,in_stack_00000020,3,0,unaff_x21,&uStack0000000000000078,0);
      if (*(long *)(unaff_x29 + -0xa8) == -0x7ffffffffffffff7) goto LAB_004f2f0c;
      in_stack_00000098 = *(undefined8 *)(unaff_x29 + -0xa0);
      in_stack_00000090 = *(ulong *)(unaff_x29 + -0xa8);
      in_stack_000000a8 = *(long *)(unaff_x29 + -0x90);
      in_stack_000000a0 = *(undefined8 *)(unaff_x29 + -0x98);
      in_stack_000000b8 = *(undefined8 *)(unaff_x29 + -0x80);
      in_stack_000000b0 = *(undefined8 *)(unaff_x29 + -0x88);
      in_stack_000000c8 = *(undefined8 *)(unaff_x29 + -0x70);
      in_stack_000000c0 = *(undefined8 *)(unaff_x29 + -0x78);
      in_stack_000000d0 = *(undefined8 *)(unaff_x29 + -0x68);
      uVar4 = in_stack_00000090 ^ 0x8000000000000000;
      if (8 < uVar4) {
        uVar4 = 4;
      }
      plVar5 = in_stack_00000030;
      if (uVar4 - 6 < 2) break;
      if (uVar4 == 4) goto code_r0x004f2ebc;
LAB_004f2c98:
      plVar5 = in_stack_00000030;
    } while (uVar4 != 0);
  } while( true );
code_r0x004f2dac:
  if (puVar15[4] == 0) goto LAB_004f2b20;
  unaff_x24 = (ulong *)func_0x00187bd0(0x18,8);
  if (unaff_x24 == (ulong *)0x0) {
    func_0x007a1f18(8,0x18);
code_r0x004f2f3c:
    func_0x007a2570(unaff_x25,uVar4,&UNK_009e9b68);
  }
  else {
    unaff_x25 = puVar15[5];
    if (-1 < (long)unaff_x25) {
      param_2 = puVar15[4];
      if (unaff_x25 == 0) {
        param_1 = 1;
code_r0x004f2e0c:
        unaff_x27 = param_1;
        goto code_r0x004f2e14;
      }
      param_1 = func_0x00187bd0(unaff_x25,1);
      if (param_1 != 0) goto code_r0x004f2e0c;
      goto code_r0x004f2f54;
    }
  }
  in_stack_00000010 = 0;
code_r0x004f2f54:
  func_0x007a1f00(in_stack_00000010,unaff_x25,&UNK_009e8da8);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4f2f6c);
  (*pcVar2)();
}

