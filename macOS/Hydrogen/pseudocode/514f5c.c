
void FUN_00514f5c(undefined8 param_1)

{
  ulong uVar1;
  double *pdVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong *puVar8;
  long *plVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 unaff_x19;
  long lVar13;
  double unaff_x20;
  long lVar14;
  long lVar15;
  long unaff_x21;
  undefined8 *puVar16;
  long unaff_x23;
  long lVar17;
  double unaff_x25;
  long unaff_x26;
  undefined8 uVar18;
  long unaff_x27;
  double unaff_x28;
  long unaff_x29;
  double unaff_d8;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  undefined8 in_stack_00000040;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  ulong in_stack_000000c0;
  ulong in_stack_000000c8;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  
code_r0x00514f5c:
  _memcpy(param_1,unaff_x19,unaff_x25);
  if (in_stack_00000080 != 0) goto LAB_00514f44;
  do {
    uVar11 = in_stack_00000080;
    uVar12 = in_stack_00000080;
    if (in_stack_00000080 == uStack0000000000000070) goto LAB_00514fcc;
LAB_00514fe0:
    pdVar2 = (double *)(in_stack_00000078 + uVar11 * 0x20);
    if (uVar11 <= uVar12 && uVar12 - uVar11 != 0) {
      _memmove(pdVar2 + 4,pdVar2,(uVar12 - uVar11) * 0x20);
    }
    *pdVar2 = unaff_d8;
    pdVar2[1] = unaff_x25;
    pdVar2[2] = unaff_x28;
    pdVar2[3] = unaff_x25;
    in_stack_00000080 = uVar12 + 1;
    lVar5 = unaff_x27;
    do {
      unaff_x27 = lVar5 + 0x18;
      if (unaff_x27 == unaff_x26) {
        *(long *)(unaff_x29 + -0xd8) = in_stack_00000078;
        *(long *)(unaff_x29 + -0xd0) = in_stack_00000078;
        *(ulong *)(unaff_x29 + -200) = uStack0000000000000070;
        *(ulong *)(unaff_x29 + -0xc0) = in_stack_00000078 + in_stack_00000080 * 0x20;
        func_0x0051601c(&uStack0000000000000058,unaff_x29 + -0xd8,&UNK_009e7fb0);
        lVar5 = in_stack_00000060;
        if (in_stack_00000068 != 0) {
          lVar17 = in_stack_00000068 + -1;
          puVar8 = (ulong *)(in_stack_00000060 + lVar17 * 0x18);
          uVar11 = *puVar8;
          in_stack_00000020[1] = puVar8[1];
          *in_stack_00000020 = uVar11;
          in_stack_00000020[2] = puVar8[2];
          in_stack_00000020[3] = 0x8000000000000000;
          if (lVar17 != 0) {
            puVar16 = (undefined8 *)(in_stack_00000060 + 8);
            do {
              if (puVar16[-1] != 0) {
                func_0x00187bd4(*puVar16,puVar16[-1],1);
              }
              puVar16 = puVar16 + 3;
              lVar17 = lVar17 + -1;
            } while (lVar17 != 0);
          }
          goto joined_r0x005153b0;
        }
        if (unaff_x21 == in_stack_00000048) goto code_r0x00515274;
        if (in_stack_00000018 == 0) goto code_r0x005152e0;
        uStack0000000000000008 = 1;
        lVar5 = unaff_x23;
        goto code_r0x005150d4;
      }
      unaff_x19 = *(undefined8 *)(lVar5 + 0x20);
      unaff_x25 = *(double *)(lVar5 + 0x28);
      unaff_d8 = (double)func_0x005320d4(in_stack_00000050);
      lVar5 = unaff_x27;
    } while (unaff_d8 <= unaff_x20);
    if ((long)unaff_x25 < 0) {
      in_stack_00000040 = 0;
code_r0x005153c4:
      func_0x007a1f00(in_stack_00000040,unaff_x28,&UNK_009e9838);
      goto FUN_005153fc;
    }
    if (unaff_x25 == 0.0) {
      unaff_x28 = 4.94065645841247e-324;
      param_1 = 1;
      goto code_r0x00514f5c;
    }
    unaff_x28 = (double)func_0x00187bd0(unaff_x25,1);
    if (unaff_x28 == 0.0) {
      unaff_x28 = unaff_x25;
      goto code_r0x005153c4;
    }
    _memcpy(unaff_x28,unaff_x19,unaff_x25);
  } while (in_stack_00000080 == 0);
LAB_00514f44:
  if (in_stack_00000080 == 1) {
    uVar11 = 0;
  }
  else {
    uVar11 = 0;
    uVar12 = in_stack_00000080;
    do {
      uVar1 = (uVar12 >> 1) + uVar11;
      if (*(double *)(in_stack_00000078 + uVar1 * 0x20) <= unaff_d8) {
        uVar11 = uVar1;
      }
      uVar12 = uVar12 - (uVar12 >> 1);
    } while (1 < uVar12);
  }
  if (*(double *)(in_stack_00000078 + uVar11 * 0x20) <= unaff_d8) {
    uVar11 = uVar11 + 1;
  }
  uVar12 = in_stack_00000080;
  if (in_stack_00000080 == uStack0000000000000070) {
LAB_00514fcc:
    uVar12 = in_stack_00000080;
    func_0x0050c2ec(&uStack0000000000000070,&UNK_009e9850);
  }
  goto LAB_00514fe0;
code_r0x005152e0:
  do {
    func_0x00500450(unaff_x21,0);
    func_0x00514b20(unaff_x29 + -0x98,in_stack_00000050);
    if (*(long *)(unaff_x29 + -0x88) == 0) {
      if (*(long *)(unaff_x29 + -0x98) != 0) {
        lVar17 = *(long *)(unaff_x29 + -0x90);
        lVar5 = *(long *)(unaff_x29 + -0x98) * 0x18;
        uVar18 = 8;
        goto code_r0x005152cc;
      }
    }
    else {
      lVar7 = *(long *)(unaff_x29 + -0x98);
      lVar6 = *(long *)(unaff_x29 + -0x90);
      lVar13 = *(long *)(unaff_x29 + -0x88) + -1;
      plVar9 = (long *)(lVar6 + lVar13 * 0x18);
      lVar5 = *plVar9;
      lVar17 = plVar9[1];
      if (lVar13 != 0) {
        puVar16 = (undefined8 *)(lVar6 + 8);
        do {
          if (puVar16[-1] != 0) {
            func_0x00187bd4(*puVar16,puVar16[-1],1);
          }
          puVar16 = puVar16 + 3;
          lVar13 = lVar13 + -1;
        } while (lVar13 != 0);
      }
      func_0x00187bd4(lVar6,lVar7 * 0x18,8);
      if (lVar5 != 0) {
        uVar18 = 1;
code_r0x005152cc:
        func_0x00187bd4(lVar17,lVar5,uVar18);
      }
    }
    unaff_x21 = unaff_x21 + 0x2c8;
  } while (unaff_x21 != in_stack_00000048);
  goto code_r0x00515274;
code_r0x005150d4:
  do {
    func_0x00500450(unaff_x21,0);
    uVar18 = *(undefined8 *)(unaff_x21 + 0x230);
    lVar17 = *(long *)(unaff_x21 + 0x238);
    func_0x00514b20(unaff_x29 + -0x98,in_stack_00000050);
    unaff_x21 = unaff_x21 + 0x2c8;
    if (*(long *)(unaff_x29 + -0x88) == 0) {
      if (*(long *)(unaff_x29 + -0x98) != 0) {
        lVar6 = *(long *)(unaff_x29 + -0x90);
        lVar7 = *(long *)(unaff_x29 + -0x98) * 0x18;
        uVar18 = 8;
        goto code_r0x005150c4;
      }
    }
    else {
      lVar13 = *(long *)(unaff_x29 + -0x98);
      lVar15 = *(long *)(unaff_x29 + -0x90);
      lVar14 = *(long *)(unaff_x29 + -0x88) + -1;
      plVar9 = (long *)(lVar15 + lVar14 * 0x18);
      lVar7 = *plVar9;
      lVar6 = plVar9[1];
      lVar10 = plVar9[2];
      if (lVar14 != 0) {
        puVar16 = (undefined8 *)(lVar15 + 8);
        do {
          if (puVar16[-1] != 0) {
            func_0x00187bd4(*puVar16,puVar16[-1],1);
          }
          puVar16 = puVar16 + 3;
          lVar14 = lVar14 + -1;
        } while (lVar14 != 0);
      }
      func_0x00187bd4(lVar15,lVar13 * 0x18,8);
      lVar13 = 0;
      lVar15 = in_stack_00000018 << 4;
      plVar9 = (long *)(in_stack_00000010 + 8);
      do {
        if ((*plVar9 == lVar17) && (iVar4 = _memcmp(plVar9[-1],uVar18,lVar17), iVar4 == 0)) {
          if (lVar17 < 0) {
            uStack0000000000000008 = 0;
code_r0x005153e8:
            func_0x007a1f00(uStack0000000000000008,lVar5,&UNK_009e9838);
FUN_005153fc:
                    /* WARNING: Does not return */
            pcVar3 = (code *)SoftwareBreakpoint(1,0x515400);
            (*pcVar3)();
          }
          if (lVar17 == 0) {
            lVar5 = 1;
          }
          else {
            lVar5 = func_0x00187bd0(lVar17,1);
            if (lVar5 == 0) {
              lVar5 = lVar17;
              goto code_r0x005153e8;
            }
          }
          _memcpy(lVar5,uVar18,lVar17);
          if (lVar7 == -0x8000000000000000) goto code_r0x005150c8;
          *(long *)(unaff_x29 + -0xd8) = lVar13;
          *(long *)(unaff_x29 + -0xd0) = lVar13;
          *(long *)(unaff_x29 + -200) = lVar7;
          *(long *)(unaff_x29 + -0xc0) = lVar6;
          *(long *)(unaff_x29 + -0xb8) = lVar10;
          *(long *)(unaff_x29 + -0xb0) = lVar17;
          *(long *)(unaff_x29 + -0xa8) = lVar5;
          *(long *)(unaff_x29 + -0xa0) = lVar17;
          *(long *)(unaff_x29 + -0x98) = unaff_x21;
          *(long *)(unaff_x29 + -0x90) = in_stack_00000048;
          *(undefined8 *)(unaff_x29 + -0x88) = in_stack_00000050;
          *(long *)(unaff_x29 + -0x80) = unaff_x23;
          *(long *)(unaff_x29 + -0x78) = in_stack_00000010;
          *(long *)(unaff_x29 + -0x70) = in_stack_00000018;
          func_0x0051ebd4(&uStack0000000000000070,unaff_x29 + -0x98,unaff_x29 + -0xd8);
          if (in_stack_00000080 == 0x8000000000000000) goto code_r0x00515274;
          in_stack_00000020[1] = in_stack_00000088;
          *in_stack_00000020 = in_stack_00000080;
          in_stack_00000020[3] = in_stack_00000098;
          in_stack_00000020[2] = in_stack_00000090;
          in_stack_00000020[5] = in_stack_000000a8;
          in_stack_00000020[4] = in_stack_000000a0;
          in_stack_000000b8 = in_stack_00000078;
          in_stack_000000b0 = uStack0000000000000070;
          in_stack_000000c8 = in_stack_00000088;
          in_stack_000000c0 = in_stack_00000080;
          in_stack_000000d8 = in_stack_00000098;
          in_stack_000000d0 = in_stack_00000090;
          in_stack_000000e8 = in_stack_000000a8;
          in_stack_000000e0 = in_stack_000000a0;
          lVar5 = in_stack_00000060;
          goto joined_r0x005153b0;
        }
        lVar13 = lVar13 + 1;
        lVar15 = lVar15 + -0x10;
        plVar9 = plVar9 + 2;
      } while (lVar15 != 0);
      if (lVar7 != 0) {
        uVar18 = 1;
code_r0x005150c4:
        func_0x00187bd4(lVar6,lVar7,uVar18);
      }
    }
code_r0x005150c8:
  } while (unaff_x21 != in_stack_00000048);
code_r0x00515274:
  *in_stack_00000020 = 0x8000000000000000;
  lVar5 = in_stack_00000060;
joined_r0x005153b0:
  if (uStack0000000000000058 != 0) {
    func_0x00187bd4(lVar5,uStack0000000000000058 * 0x18,8);
  }
  return;
}

