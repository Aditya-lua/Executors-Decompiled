
void FUN_005290e4(void)

{
  long lVar1;
  long *plVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  undefined8 *puVar14;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long lVar15;
  long unaff_x26;
  long unaff_x27;
  undefined8 uVar16;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar17;
  undefined8 *in_stack_00000008;
  long in_stack_00000018;
  ulong in_stack_00000028;
  undefined8 *in_stack_00000058;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  long in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  long in_stack_000000c8;
  ulong in_stack_000000d0;
  
code_r0x005290e4:
  lVar10 = *(long *)(unaff_x29 + -0xb8);
  plVar12 = (long *)(*(long *)(unaff_x29 + -0xd8) + unaff_x28 * 0x18);
  lVar8 = *plVar12;
  if (lVar8 != -0x8000000000000000 && lVar8 != 0) {
    func_0x00187bd4(plVar12[1],lVar8,1);
  }
  *plVar12 = unaff_x26;
  plVar12[1] = unaff_x27;
  plVar12[2] = lVar10;
LAB_00528f30:
  do {
    if ((unaff_x23 == (undefined8 *)0x0) || (unaff_x23 == unaff_x24)) {
      if (unaff_x22 == in_stack_00000058) {
        lVar8 = 0;
        lVar10 = *(long *)(unaff_x29 + -0xf8);
        lVar1 = *(long *)(unaff_x29 + -0xf0);
        lVar13 = *(long *)(unaff_x29 + -0xe8);
        *(long *)(unaff_x29 + -0xa0) = lVar10;
        *(long *)(unaff_x29 + -0x98) = lVar1 + lVar13 * 0x18;
        lVar15 = 8;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xc0) = 8;
        *(undefined8 *)(unaff_x29 + -0xb8) = 0;
        *(long *)(unaff_x29 + -0xb0) = lVar1;
        *(long *)(unaff_x29 + -0xa8) = lVar1;
        if (lVar13 != 0) {
          func_0x007a5594(unaff_x29 + -200,0,lVar13,8,0x18);
          lVar15 = *(long *)(unaff_x29 + -0xc0);
          lVar8 = *(long *)(unaff_x29 + -0xb8);
        }
        _memcpy(lVar15 + lVar8 * 0x18,lVar1,lVar13 * 0x18);
        lVar8 = lVar8 + lVar13;
        *(long *)(unaff_x29 + -0xb8) = lVar8;
        if (lVar10 != 0) {
          func_0x00187bd4(lVar1,lVar10 * 0x18,8);
          lVar8 = *(long *)(unaff_x29 + -0xb8);
        }
        *(long *)(unaff_x29 + -0xb0) = in_stack_000000c8;
        *(long *)(unaff_x29 + -0xa8) = in_stack_000000c8;
        *(long *)(unaff_x29 + -0xa0) = in_stack_000000c0;
        *(ulong *)(unaff_x29 + -0x98) = in_stack_000000c8 + in_stack_000000d0 * 0x18;
        if ((ulong)(*(long *)(unaff_x29 + -200) - lVar8) < in_stack_000000d0) {
          func_0x007a5594(unaff_x29 + -200,lVar8,in_stack_000000d0,8,0x18);
          lVar8 = *(long *)(unaff_x29 + -0xb8);
        }
        _memcpy(*(long *)(unaff_x29 + -0xc0) + lVar8 * 0x18,in_stack_000000c8,
                in_stack_000000d0 * 0x18);
        *(ulong *)(unaff_x29 + -0xb8) = lVar8 + in_stack_000000d0;
        if (in_stack_000000c0 != 0) {
          func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
        }
        plVar12 = *(long **)(unaff_x29 + -0xd8);
        lVar8 = *(long *)(unaff_x29 + -0xd0);
        *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
        *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
        *(long **)(unaff_x29 + -0x80) = plVar12;
        *(long **)(unaff_x29 + -0x78) = plVar12;
        *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xe0);
        *(long **)(unaff_x29 + -0x68) = plVar12 + lVar8 * 3;
        plVar9 = plVar12;
        if (lVar8 == 0) goto code_r0x0052929c;
        lVar10 = lVar8 * 0x18;
        plVar2 = plVar12;
        goto code_r0x00529248;
      }
      lVar8 = *(long *)(in_stack_00000060 + 0x90);
      puVar3 = unaff_x22 + 2;
      puVar4 = (undefined8 *)0x0;
      puVar14 = unaff_x22;
    }
    else {
      lVar8 = *(long *)(in_stack_00000060 + 0x90);
      puVar3 = unaff_x22;
      puVar4 = unaff_x23 + 2;
      puVar14 = unaff_x23;
    }
    unaff_x23 = puVar4;
    unaff_x22 = puVar3;
    if (lVar8 != 0) {
      lVar10 = 0;
      lVar15 = *(long *)(in_stack_00000060 + 0x88);
      uVar17 = *puVar14;
      lVar1 = puVar14[1];
      do {
        if (*(long *)(lVar15 + lVar10 + 0x220) == lVar1) {
          uVar16 = *(undefined8 *)(lVar15 + lVar10 + 0x218);
          iVar6 = _memcmp(uVar16,uVar17,lVar1);
          if (iVar6 == 0) {
            if (in_stack_000000b8 == 0) goto code_r0x00529010;
            plVar12 = (long *)(in_stack_000000b0 + 8);
            lVar8 = in_stack_000000b8 << 4;
            goto code_r0x00528fe8;
          }
        }
        lVar10 = lVar10 + 600;
      } while (lVar8 * 600 != lVar10);
    }
  } while( true );
  while( true ) {
    plVar12 = plVar12 + 2;
    lVar8 = lVar8 + -0x10;
    if (lVar8 == 0) break;
code_r0x00528fe8:
    if ((*plVar12 == lVar1) && (iVar6 = _memcmp(plVar12[-1],uVar16,lVar1), iVar6 == 0))
    goto LAB_00528f30;
  }
code_r0x00529010:
  if ((in_stack_00000070 == 0) ||
     (uVar7 = func_0x005175a8(in_stack_00000070,puVar14,&UNK_008a7e90), (uVar7 & 1) == 0)) {
    func_0x0050d6e0(unaff_x29 + -200,lVar15 + lVar10,in_stack_00000068,1);
    lVar15 = lVar15 + lVar10;
    if (*(int *)(lVar15 + 0x28) == 1) {
      unaff_x28 = *(ulong *)(lVar15 + 0x30);
      if (((in_stack_00000028 & 0x100000000) != 0) || ((*(uint *)(lVar15 + 0x250) >> 8 & 1) == 0))
      goto code_r0x005290a4;
      if (*(long *)(unaff_x29 + -200) != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xc0),*(long *)(unaff_x29 + -200),1);
      }
    }
    else {
      *(undefined8 *)(unaff_x29 + -0xa8) = *(undefined8 *)(unaff_x29 + -0xc0);
      *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(unaff_x29 + -200);
      *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0xb8);
      func_0x0050b430(unaff_x29 + -0xf8,unaff_x29 + -0xb0);
    }
  }
  goto LAB_00528f30;
code_r0x005290a4:
  uVar7 = *(ulong *)(unaff_x29 + -0xd0);
  if (uVar7 < unaff_x28 + 1) {
    *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
    func_0x004e0e50(unaff_x29 + -0xe0,unaff_x28 + 1,unaff_x29 + -0xb0,&UNK_009ea900);
    uVar7 = *(ulong *)(unaff_x29 + -0xd0);
  }
  unaff_x26 = *(long *)(unaff_x29 + -200);
  unaff_x27 = *(long *)(unaff_x29 + -0xc0);
  if (uVar7 <= unaff_x28) {
    func_0x007a2570(unaff_x28,uVar7,&UNK_009ea918);
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x5293d4);
    (*pcVar5)();
  }
  goto code_r0x005290e4;
code_r0x00529248:
  do {
    lVar10 = lVar10 + -0x18;
    lVar15 = *plVar2;
    if (lVar15 != -0x8000000000000000) {
      plVar9 = plVar2 + 3;
      if (lVar15 == -0x7fffffffffffffff) goto code_r0x0052929c;
      lVar1 = plVar2[1];
      lVar13 = plVar2[2];
      lVar11 = *(long *)(unaff_x29 + -0xb8);
      if (lVar11 == *(long *)(unaff_x29 + -200)) {
        func_0x0050c174(unaff_x29 + -200,&UNK_009ea8e8);
      }
      plVar9 = (long *)(*(long *)(unaff_x29 + -0xc0) + lVar11 * 0x18);
      *plVar9 = lVar15;
      plVar9[1] = lVar1;
      plVar9[2] = lVar13;
      *(long *)(unaff_x29 + -0xb8) = lVar11 + 1;
    }
    plVar2 = plVar2 + 3;
  } while (lVar10 != 0);
  plVar9 = plVar12 + lVar8 * 3;
code_r0x0052929c:
  *(long **)(unaff_x29 + -0x78) = plVar9;
  func_0x00524a34(unaff_x29 + -0xb0);
  uVar17 = *(undefined8 *)(unaff_x29 + -200);
  in_stack_00000008[1] = *(undefined8 *)(unaff_x29 + -0xc0);
  *in_stack_00000008 = uVar17;
  in_stack_00000008[2] = *(undefined8 *)(unaff_x29 + -0xb8);
  if (in_stack_000000a8 != 0) {
    func_0x00187bd4(in_stack_000000b0,in_stack_000000a8 << 4,8);
  }
  if (in_stack_00000090 != 0) {
    func_0x00187bd4(in_stack_00000098,in_stack_00000090 << 4,8);
  }
  if (in_stack_00000018 == 0) {
    if (in_stack_00000088 != 0) {
      puVar14 = (undefined8 *)(in_stack_00000080 + 8);
      do {
        if (puVar14[-1] != 0) {
          func_0x00187bd4(*puVar14,puVar14[-1] << 3,8);
        }
        puVar14 = puVar14 + 5;
        in_stack_00000088 = in_stack_00000088 + -1;
      } while (in_stack_00000088 != 0);
    }
    if (in_stack_00000078 != 0) {
      func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x28,8);
    }
  }
  return;
}

