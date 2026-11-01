
void FUN_00528d68(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  undefined8 uVar9;
  long *plVar10;
  undefined8 *in_x9;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  undefined8 *puVar15;
  long *plVar16;
  undefined8 *unaff_x21;
  long lVar17;
  undefined8 *puVar18;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  ulong uVar19;
  long unaff_x27;
  undefined8 uVar20;
  long unaff_x29;
  undefined8 *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined8 *in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 *in_stack_00000098;
  long in_stack_000000a0;
  undefined8 uStack00000000000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  undefined8 uStack00000000000000c0;
  long in_stack_000000c8;
  ulong in_stack_000000d0;
  undefined8 uStack00000000000000d8;
  undefined8 *in_stack_000000e0;
  long in_stack_000000e8;
  undefined1 uStack00000000000000f0;
  
code_r0x00528d68:
  lVar11 = *(long *)(unaff_x27 + 0xd8);
  puVar18 = in_x9;
  do {
    if (lVar11 != 0) {
      uVar9 = *puVar18;
      lVar8 = puVar18[1];
      plVar16 = (long *)(*(long *)(unaff_x27 + 0xd0) + 0x50);
      lVar11 = lVar11 * 0x60;
LAB_00528da4:
      if ((*plVar16 != lVar8) || (iVar6 = _memcmp(plVar16[-1],uVar9,lVar8), iVar6 != 0)) break;
      func_0x00505704(&uStack00000000000000d8,unaff_x27,puVar18);
      puVar4 = in_stack_000000e0;
      unaff_x21 = in_stack_00000030;
      unaff_x22 = in_stack_00000038;
      if (((in_stack_00000070 != 0) && (in_stack_000000e8 != 0)) &&
         (lVar11 = *(long *)(in_stack_00000070 + 0x50), lVar11 != 0)) {
        puVar1 = in_stack_000000e0 + in_stack_000000e8 * 2;
        lVar8 = *(long *)(in_stack_00000070 + 0x48);
        puVar15 = in_stack_000000e0;
        do {
          uVar19 = 0;
          uVar9 = *puVar15;
          lVar13 = puVar15[1];
          lVar12 = 0x61;
          lVar17 = lVar11 << 4;
          plVar16 = (long *)(lVar8 + 8);
          do {
            if ((*plVar16 == lVar13) && (iVar6 = _memcmp(plVar16[-1],uVar9,lVar13), iVar6 == 0)) {
              if (*(ulong *)(in_stack_00000070 + 0x68) <= uVar19) {
                func_0x007a2570(uVar19,*(ulong *)(in_stack_00000070 + 0x68),&UNK_009e9b68);
                goto code_r0x005293d0;
              }
              if (*(char *)(*(long *)(in_stack_00000070 + 0x60) + lVar12) != '\0') {
                unaff_x27 = in_stack_00000060;
                if (uStack00000000000000d8 != 0) {
                  func_0x00187bd4(puVar4,uStack00000000000000d8 << 4,8);
                }
                goto LAB_00528d30;
              }
              break;
            }
            plVar16 = plVar16 + 2;
            lVar12 = lVar12 + 0x68;
            uVar19 = uVar19 + 1;
            lVar17 = lVar17 + -0x10;
          } while (lVar17 != 0);
          puVar15 = puVar15 + 2;
        } while (puVar15 != puVar1);
      }
      func_0x00504f80(&uStack00000000000000f0,in_stack_00000060,puVar18);
      func_0x0050b430(&uStack00000000000000c0,&uStack00000000000000f0);
      func_0x0050b5b4(&uStack00000000000000a8,&uStack00000000000000d8);
      unaff_x27 = in_stack_00000060;
    }
LAB_00528d30:
    if ((unaff_x23 == (undefined8 *)0x0) || (unaff_x23 == unaff_x21)) goto code_r0x00528d58;
    lVar11 = *(long *)(unaff_x27 + 0xd8);
    puVar18 = unaff_x23;
    unaff_x23 = unaff_x23 + 2;
  } while( true );
  plVar16 = plVar16 + 0xc;
  lVar11 = lVar11 + -0x60;
  if (lVar11 == 0) goto LAB_00528d30;
  goto LAB_00528da4;
code_r0x00528d58:
  if (in_x9 + 2 == in_stack_00000058) goto code_r0x00528f04;
  unaff_x23 = (undefined8 *)0x0;
  in_x9 = in_x9 + 2;
  goto code_r0x00528d68;
code_r0x00528f04:
  *(undefined8 *)(unaff_x29 + -0xf8) = 0;
  *(undefined8 *)(unaff_x29 + -0xf0) = 8;
  *(undefined8 *)(unaff_x29 + -0xe8) = 0;
  *(undefined8 *)(unaff_x29 + -0xe0) = 0;
  *(undefined8 *)(unaff_x29 + -0xd8) = 8;
  *(undefined8 *)(unaff_x29 + -0xd0) = 0;
  uVar9 = *(undefined8 *)(in_stack_00000010 + 8);
  puVar18 = in_stack_00000098;
LAB_00528f30:
  if ((puVar18 == (undefined8 *)0x0) || (puVar18 == in_stack_00000098 + in_stack_000000a0 * 2)) {
    if (unaff_x22 == in_stack_00000058) goto LAB_00529124;
    lVar11 = *(long *)(unaff_x27 + 0x90);
    puVar15 = (undefined8 *)0x0;
    puVar1 = unaff_x22 + 2;
    puVar4 = unaff_x22;
  }
  else {
    lVar11 = *(long *)(unaff_x27 + 0x90);
    puVar15 = puVar18 + 2;
    puVar1 = unaff_x22;
    puVar4 = puVar18;
  }
  unaff_x22 = puVar1;
  puVar18 = puVar15;
  if (lVar11 != 0) {
    lVar8 = 0;
    lVar12 = *(long *)(unaff_x27 + 0x88);
    uVar2 = *puVar4;
    lVar13 = puVar4[1];
    do {
      if (*(long *)(lVar12 + lVar8 + 0x220) == lVar13) {
        uVar20 = *(undefined8 *)(lVar12 + lVar8 + 0x218);
        iVar6 = _memcmp(uVar20,uVar2,lVar13);
        if (iVar6 == 0) {
          if (in_stack_000000b8 == 0) goto LAB_00529010;
          plVar16 = (long *)(in_stack_000000b0 + 8);
          lVar11 = in_stack_000000b8 << 4;
          goto LAB_00528fe8;
        }
      }
      lVar8 = lVar8 + 600;
    } while (lVar11 * 600 != lVar8);
    unaff_x27 = in_stack_00000060;
  }
  goto LAB_00528f30;
  while( true ) {
    plVar16 = plVar16 + 2;
    lVar11 = lVar11 + -0x10;
    if (lVar11 == 0) break;
LAB_00528fe8:
    if ((*plVar16 == lVar13) && (iVar6 = _memcmp(plVar16[-1],uVar20,lVar13), iVar6 == 0)) {
      unaff_x27 = in_stack_00000060;
      goto LAB_00528f30;
    }
  }
LAB_00529010:
  if (in_stack_00000070 != 0) {
    uVar19 = func_0x005175a8(in_stack_00000070,puVar4,&UNK_008a7e90);
    unaff_x27 = in_stack_00000060;
    if ((uVar19 & 1) != 0) goto LAB_00528f30;
  }
  func_0x0050d6e0(unaff_x29 + -200,lVar12 + lVar8,uVar9,1);
  lVar12 = lVar12 + lVar8;
  if (*(int *)(lVar12 + 0x28) == 1) {
    uVar19 = *(ulong *)(lVar12 + 0x30);
    if (((in_stack_00000028 & 0x100000000) == 0) && ((*(uint *)(lVar12 + 0x250) >> 8 & 1) != 0)) {
      unaff_x27 = in_stack_00000060;
      if (*(long *)(unaff_x29 + -200) != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xc0),*(long *)(unaff_x29 + -200),1);
      }
    }
    else {
      uVar7 = *(ulong *)(unaff_x29 + -0xd0);
      if (uVar7 < uVar19 + 1) {
        *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
        func_0x004e0e50(unaff_x29 + -0xe0,uVar19 + 1,unaff_x29 + -0xb0,&UNK_009ea900);
        uVar7 = *(ulong *)(unaff_x29 + -0xd0);
      }
      lVar11 = *(long *)(unaff_x29 + -200);
      lVar8 = *(long *)(unaff_x29 + -0xc0);
      if (uVar7 <= uVar19) {
        func_0x007a2570(uVar19,uVar7,&UNK_009ea918);
code_r0x005293d0:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x5293d4);
        (*pcVar5)();
      }
      lVar13 = *(long *)(unaff_x29 + -0xb8);
      plVar16 = (long *)(*(long *)(unaff_x29 + -0xd8) + uVar19 * 0x18);
      lVar12 = *plVar16;
      if (lVar12 != -0x8000000000000000 && lVar12 != 0) {
        func_0x00187bd4(plVar16[1],lVar12,1);
      }
      *plVar16 = lVar11;
      plVar16[1] = lVar8;
      plVar16[2] = lVar13;
      unaff_x27 = in_stack_00000060;
    }
  }
  else {
    *(undefined8 *)(unaff_x29 + -0xa8) = *(undefined8 *)(unaff_x29 + -0xc0);
    *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(unaff_x29 + -200);
    *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0xb8);
    func_0x0050b430(unaff_x29 + -0xf8,unaff_x29 + -0xb0);
    unaff_x27 = in_stack_00000060;
  }
  goto LAB_00528f30;
LAB_00529124:
  lVar11 = 0;
  lVar8 = *(long *)(unaff_x29 + -0xf8);
  lVar13 = *(long *)(unaff_x29 + -0xf0);
  lVar17 = *(long *)(unaff_x29 + -0xe8);
  *(long *)(unaff_x29 + -0xa0) = lVar8;
  *(long *)(unaff_x29 + -0x98) = lVar13 + lVar17 * 0x18;
  lVar12 = 8;
  *(undefined8 *)(unaff_x29 + -200) = 0;
  *(undefined8 *)(unaff_x29 + -0xc0) = 8;
  *(undefined8 *)(unaff_x29 + -0xb8) = 0;
  *(long *)(unaff_x29 + -0xb0) = lVar13;
  *(long *)(unaff_x29 + -0xa8) = lVar13;
  if (lVar17 != 0) {
    func_0x007a5594(unaff_x29 + -200,0,lVar17,8,0x18);
    lVar12 = *(long *)(unaff_x29 + -0xc0);
    lVar11 = *(long *)(unaff_x29 + -0xb8);
  }
  _memcpy(lVar12 + lVar11 * 0x18,lVar13,lVar17 * 0x18);
  lVar11 = lVar11 + lVar17;
  *(long *)(unaff_x29 + -0xb8) = lVar11;
  if (lVar8 != 0) {
    func_0x00187bd4(lVar13,lVar8 * 0x18,8);
    lVar11 = *(long *)(unaff_x29 + -0xb8);
  }
  uVar19 = in_stack_000000d0;
  lVar12 = in_stack_000000c8;
  lVar8 = uStack00000000000000c0;
  lVar13 = in_stack_000000d0 * 0x18;
  *(long *)(unaff_x29 + -0xb0) = in_stack_000000c8;
  *(long *)(unaff_x29 + -0xa8) = in_stack_000000c8;
  *(long *)(unaff_x29 + -0xa0) = uStack00000000000000c0;
  *(long *)(unaff_x29 + -0x98) = in_stack_000000c8 + lVar13;
  if ((ulong)(*(long *)(unaff_x29 + -200) - lVar11) < in_stack_000000d0) {
    func_0x007a5594(unaff_x29 + -200,lVar11,in_stack_000000d0,8,0x18);
    lVar11 = *(long *)(unaff_x29 + -0xb8);
  }
  _memcpy(*(long *)(unaff_x29 + -0xc0) + lVar11 * 0x18,lVar12,lVar13);
  *(ulong *)(unaff_x29 + -0xb8) = lVar11 + uVar19;
  if (lVar8 != 0) {
    func_0x00187bd4(lVar12,lVar8 * 0x18,8);
  }
  plVar16 = *(long **)(unaff_x29 + -0xd8);
  lVar11 = *(long *)(unaff_x29 + -0xd0);
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar16;
  *(long **)(unaff_x29 + -0x78) = plVar16;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xe0);
  *(long **)(unaff_x29 + -0x68) = plVar16 + lVar11 * 3;
  plVar10 = plVar16;
  if (lVar11 != 0) {
    lVar8 = lVar11 * 0x18;
    plVar3 = plVar16;
    while( true ) {
      lVar8 = lVar8 + -0x18;
      lVar12 = *plVar3;
      if (lVar12 != -0x8000000000000000) {
        plVar10 = plVar3 + 3;
        if (lVar12 == -0x7fffffffffffffff) goto code_r0x0052929c;
        lVar13 = plVar3[1];
        lVar17 = plVar3[2];
        lVar14 = *(long *)(unaff_x29 + -0xb8);
        if (lVar14 == *(long *)(unaff_x29 + -200)) {
          func_0x0050c174(unaff_x29 + -200,&UNK_009ea8e8);
        }
        plVar10 = (long *)(*(long *)(unaff_x29 + -0xc0) + lVar14 * 0x18);
        *plVar10 = lVar12;
        plVar10[1] = lVar13;
        plVar10[2] = lVar17;
        *(long *)(unaff_x29 + -0xb8) = lVar14 + 1;
      }
      if (lVar8 == 0) break;
      plVar3 = plVar3 + 3;
    }
    plVar10 = plVar16 + lVar11 * 3;
  }
code_r0x0052929c:
  *(long **)(unaff_x29 + -0x78) = plVar10;
  func_0x00524a34(unaff_x29 + -0xb0);
  uVar9 = *(undefined8 *)(unaff_x29 + -200);
  in_stack_00000008[1] = *(undefined8 *)(unaff_x29 + -0xc0);
  *in_stack_00000008 = uVar9;
  in_stack_00000008[2] = *(undefined8 *)(unaff_x29 + -0xb8);
  if (uStack00000000000000a8 != 0) {
    func_0x00187bd4(in_stack_000000b0,uStack00000000000000a8 << 4,8);
  }
  if (in_stack_00000090 != 0) {
    func_0x00187bd4(in_stack_00000098,in_stack_00000090 << 4,8);
  }
  if (in_stack_00000018 == 0) {
    if (in_stack_00000088 != 0) {
      puVar18 = (undefined8 *)(in_stack_00000080 + 8);
      do {
        if (puVar18[-1] != 0) {
          func_0x00187bd4(*puVar18,puVar18[-1] << 3,8);
        }
        puVar18 = puVar18 + 5;
        in_stack_00000088 = in_stack_00000088 + -1;
      } while (in_stack_00000088 != 0);
    }
    if (in_stack_00000078 != 0) {
      func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x28,8);
    }
  }
  return;
}

