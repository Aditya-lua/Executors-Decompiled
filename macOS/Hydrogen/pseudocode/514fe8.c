
void FUN_00514fe8(long param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  ulong *puVar7;
  long *plVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  double *unaff_x19;
  long lVar12;
  double unaff_x20;
  long lVar13;
  long lVar14;
  long unaff_x21;
  undefined8 *puVar15;
  long unaff_x23;
  ulong unaff_x24;
  long lVar16;
  double unaff_x25;
  long unaff_x26;
  undefined8 uVar17;
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
  
  while( true ) {
    if ((bool)in_CY && !(bool)in_ZR) {
      _memmove(unaff_x19 + 4,unaff_x19,param_1 << 5);
    }
    *unaff_x19 = unaff_d8;
    unaff_x19[1] = unaff_x25;
    unaff_x19[2] = unaff_x28;
    unaff_x19[3] = unaff_x25;
    in_stack_00000080 = unaff_x24 + 1;
    lVar4 = unaff_x27;
    do {
      unaff_x27 = lVar4 + 0x18;
      if (unaff_x27 == unaff_x26) {
        *(long *)(unaff_x29 + -0xd8) = in_stack_00000078;
        *(long *)(unaff_x29 + -0xd0) = in_stack_00000078;
        *(ulong *)(unaff_x29 + -200) = uStack0000000000000070;
        *(ulong *)(unaff_x29 + -0xc0) = in_stack_00000078 + in_stack_00000080 * 0x20;
        func_0x0051601c(&uStack0000000000000058,unaff_x29 + -0xd8,&UNK_009e7fb0);
        lVar4 = in_stack_00000060;
        if (in_stack_00000068 != 0) {
          lVar16 = in_stack_00000068 + -1;
          puVar7 = (ulong *)(in_stack_00000060 + lVar16 * 0x18);
          uVar10 = *puVar7;
          in_stack_00000020[1] = puVar7[1];
          *in_stack_00000020 = uVar10;
          in_stack_00000020[2] = puVar7[2];
          in_stack_00000020[3] = 0x8000000000000000;
          if (lVar16 != 0) {
            puVar15 = (undefined8 *)(in_stack_00000060 + 8);
            do {
              if (puVar15[-1] != 0) {
                func_0x00187bd4(*puVar15,puVar15[-1],1);
              }
              puVar15 = puVar15 + 3;
              lVar16 = lVar16 + -1;
            } while (lVar16 != 0);
          }
          goto joined_r0x005153b0;
        }
        if (unaff_x21 == in_stack_00000048) goto code_r0x00515274;
        if (in_stack_00000018 == 0) goto code_r0x005152e0;
        uStack0000000000000008 = 1;
        lVar4 = unaff_x23;
        goto code_r0x005150d4;
      }
      uVar17 = *(undefined8 *)(lVar4 + 0x20);
      unaff_x25 = *(double *)(lVar4 + 0x28);
      unaff_d8 = (double)func_0x005320d4(in_stack_00000050);
      lVar4 = unaff_x27;
    } while (unaff_d8 <= unaff_x20);
    if ((long)unaff_x25 < 0) break;
    if (unaff_x25 == 0.0) {
      unaff_x28 = 4.94065645841247e-324;
      _memcpy(1,uVar17,0);
      if (in_stack_00000080 == 0) goto code_r0x00514f70;
code_r0x00514f44:
      if (in_stack_00000080 == 1) {
        uVar10 = 0;
      }
      else {
        uVar10 = 0;
        uVar11 = in_stack_00000080;
        do {
          uVar1 = (uVar11 >> 1) + uVar10;
          if (*(double *)(in_stack_00000078 + uVar1 * 0x20) <= unaff_d8) {
            uVar10 = uVar1;
          }
          uVar11 = uVar11 - (uVar11 >> 1);
        } while (1 < uVar11);
      }
      if (*(double *)(in_stack_00000078 + uVar10 * 0x20) <= unaff_d8) {
        uVar10 = uVar10 + 1;
      }
      unaff_x24 = in_stack_00000080;
      if (in_stack_00000080 == uStack0000000000000070) {
code_r0x00514fcc:
        unaff_x24 = in_stack_00000080;
        func_0x0050c2ec(&uStack0000000000000070,&UNK_009e9850);
      }
    }
    else {
      unaff_x28 = (double)func_0x00187bd0(unaff_x25,1);
      if (unaff_x28 == 0.0) {
        unaff_x28 = unaff_x25;
code_r0x005153c4:
        func_0x007a1f00(in_stack_00000040,unaff_x28,&UNK_009e9838);
FUN_005153fc:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x515400);
        (*pcVar2)();
      }
      _memcpy(unaff_x28,uVar17,unaff_x25);
      if (in_stack_00000080 != 0) goto code_r0x00514f44;
code_r0x00514f70:
      uVar10 = in_stack_00000080;
      unaff_x24 = in_stack_00000080;
      if (in_stack_00000080 == uStack0000000000000070) goto code_r0x00514fcc;
    }
    unaff_x19 = (double *)(in_stack_00000078 + uVar10 * 0x20);
    in_CY = uVar10 <= unaff_x24;
    param_1 = unaff_x24 - uVar10;
    in_ZR = param_1 == 0;
  }
  in_stack_00000040 = 0;
  goto code_r0x005153c4;
code_r0x005152e0:
  do {
    func_0x00500450(unaff_x21,0);
    func_0x00514b20(unaff_x29 + -0x98,in_stack_00000050);
    if (*(long *)(unaff_x29 + -0x88) == 0) {
      if (*(long *)(unaff_x29 + -0x98) != 0) {
        lVar16 = *(long *)(unaff_x29 + -0x90);
        lVar4 = *(long *)(unaff_x29 + -0x98) * 0x18;
        uVar17 = 8;
        goto code_r0x005152cc;
      }
    }
    else {
      lVar6 = *(long *)(unaff_x29 + -0x98);
      lVar5 = *(long *)(unaff_x29 + -0x90);
      lVar12 = *(long *)(unaff_x29 + -0x88) + -1;
      plVar8 = (long *)(lVar5 + lVar12 * 0x18);
      lVar4 = *plVar8;
      lVar16 = plVar8[1];
      if (lVar12 != 0) {
        puVar15 = (undefined8 *)(lVar5 + 8);
        do {
          if (puVar15[-1] != 0) {
            func_0x00187bd4(*puVar15,puVar15[-1],1);
          }
          puVar15 = puVar15 + 3;
          lVar12 = lVar12 + -1;
        } while (lVar12 != 0);
      }
      func_0x00187bd4(lVar5,lVar6 * 0x18,8);
      if (lVar4 != 0) {
        uVar17 = 1;
code_r0x005152cc:
        func_0x00187bd4(lVar16,lVar4,uVar17);
      }
    }
    unaff_x21 = unaff_x21 + 0x2c8;
  } while (unaff_x21 != in_stack_00000048);
  goto code_r0x00515274;
code_r0x005150d4:
  do {
    func_0x00500450(unaff_x21,0);
    uVar17 = *(undefined8 *)(unaff_x21 + 0x230);
    lVar16 = *(long *)(unaff_x21 + 0x238);
    func_0x00514b20(unaff_x29 + -0x98,in_stack_00000050);
    unaff_x21 = unaff_x21 + 0x2c8;
    if (*(long *)(unaff_x29 + -0x88) == 0) {
      if (*(long *)(unaff_x29 + -0x98) != 0) {
        lVar5 = *(long *)(unaff_x29 + -0x90);
        lVar6 = *(long *)(unaff_x29 + -0x98) * 0x18;
        uVar17 = 8;
        goto code_r0x005150c4;
      }
    }
    else {
      lVar12 = *(long *)(unaff_x29 + -0x98);
      lVar14 = *(long *)(unaff_x29 + -0x90);
      lVar13 = *(long *)(unaff_x29 + -0x88) + -1;
      plVar8 = (long *)(lVar14 + lVar13 * 0x18);
      lVar6 = *plVar8;
      lVar5 = plVar8[1];
      lVar9 = plVar8[2];
      if (lVar13 != 0) {
        puVar15 = (undefined8 *)(lVar14 + 8);
        do {
          if (puVar15[-1] != 0) {
            func_0x00187bd4(*puVar15,puVar15[-1],1);
          }
          puVar15 = puVar15 + 3;
          lVar13 = lVar13 + -1;
        } while (lVar13 != 0);
      }
      func_0x00187bd4(lVar14,lVar12 * 0x18,8);
      lVar12 = 0;
      lVar14 = in_stack_00000018 << 4;
      plVar8 = (long *)(in_stack_00000010 + 8);
      do {
        if ((*plVar8 == lVar16) && (iVar3 = _memcmp(plVar8[-1],uVar17,lVar16), iVar3 == 0)) {
          if (lVar16 < 0) {
            uStack0000000000000008 = 0;
code_r0x005153e8:
            func_0x007a1f00(uStack0000000000000008,lVar4,&UNK_009e9838);
            goto FUN_005153fc;
          }
          if (lVar16 == 0) {
            lVar4 = 1;
          }
          else {
            lVar4 = func_0x00187bd0(lVar16,1);
            if (lVar4 == 0) {
              lVar4 = lVar16;
              goto code_r0x005153e8;
            }
          }
          _memcpy(lVar4,uVar17,lVar16);
          if (lVar6 == -0x8000000000000000) goto code_r0x005150c8;
          *(long *)(unaff_x29 + -0xd8) = lVar12;
          *(long *)(unaff_x29 + -0xd0) = lVar12;
          *(long *)(unaff_x29 + -200) = lVar6;
          *(long *)(unaff_x29 + -0xc0) = lVar5;
          *(long *)(unaff_x29 + -0xb8) = lVar9;
          *(long *)(unaff_x29 + -0xb0) = lVar16;
          *(long *)(unaff_x29 + -0xa8) = lVar4;
          *(long *)(unaff_x29 + -0xa0) = lVar16;
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
          lVar4 = in_stack_00000060;
          goto joined_r0x005153b0;
        }
        lVar12 = lVar12 + 1;
        lVar14 = lVar14 + -0x10;
        plVar8 = plVar8 + 2;
      } while (lVar14 != 0);
      if (lVar6 != 0) {
        uVar17 = 1;
code_r0x005150c4:
        func_0x00187bd4(lVar5,lVar6,uVar17);
      }
    }
code_r0x005150c8:
  } while (unaff_x21 != in_stack_00000048);
code_r0x00515274:
  *in_stack_00000020 = 0x8000000000000000;
  lVar4 = in_stack_00000060;
joined_r0x005153b0:
  if (uStack0000000000000058 != 0) {
    func_0x00187bd4(lVar4,uStack0000000000000058 * 0x18,8);
  }
  return;
}

