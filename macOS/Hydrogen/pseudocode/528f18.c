
void FUN_00528f18(long param_1)

{
  long *plVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  undefined8 *puVar14;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  long lVar15;
  long unaff_x27;
  undefined8 uVar16;
  long unaff_x29;
  undefined8 uVar17;
  undefined8 *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong in_stack_00000028;
  undefined8 *in_stack_00000058;
  long in_stack_00000060;
  long *plStack0000000000000068;
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
  
  puVar14 = unaff_x23 + param_1 * 2;
  plStack0000000000000068 = *(long **)(in_stack_00000010 + 8);
LAB_00528f30:
  if ((unaff_x23 == (undefined8 *)0x0) || (unaff_x23 == puVar14)) {
    if (unaff_x22 == in_stack_00000058) goto LAB_00529124;
    lVar9 = *(long *)(unaff_x27 + 0x90);
    puVar3 = (undefined8 *)0x0;
    puVar4 = unaff_x22 + 2;
    puVar2 = unaff_x22;
  }
  else {
    lVar9 = *(long *)(unaff_x27 + 0x90);
    puVar3 = unaff_x23 + 2;
    puVar4 = unaff_x22;
    puVar2 = unaff_x23;
  }
  unaff_x22 = puVar4;
  unaff_x23 = puVar3;
  if (lVar9 != 0) {
    lVar11 = 0;
    lVar15 = *(long *)(unaff_x27 + 0x88);
    uVar17 = *puVar2;
    lVar10 = puVar2[1];
    do {
      unaff_x27 = in_stack_00000060;
      if (*(long *)(lVar15 + lVar11 + 0x220) == lVar10) {
        uVar16 = *(undefined8 *)(lVar15 + lVar11 + 0x218);
        iVar6 = _memcmp(uVar16,uVar17,lVar10);
        if (iVar6 == 0) {
          if (in_stack_000000b8 == 0) goto LAB_00529010;
          plVar12 = (long *)(in_stack_000000b0 + 8);
          lVar9 = in_stack_000000b8 << 4;
          goto LAB_00528fe8;
        }
      }
      lVar11 = lVar11 + 600;
    } while (lVar9 * 600 != lVar11);
  }
  goto LAB_00528f30;
  while( true ) {
    plVar12 = plVar12 + 2;
    lVar9 = lVar9 + -0x10;
    if (lVar9 == 0) break;
LAB_00528fe8:
    if ((*plVar12 == lVar10) && (iVar6 = _memcmp(plVar12[-1],uVar16,lVar10), iVar6 == 0))
    goto LAB_00528f30;
  }
LAB_00529010:
  if ((in_stack_00000070 == 0) ||
     (uVar7 = func_0x005175a8(in_stack_00000070,puVar2,&UNK_008a7e90), (uVar7 & 1) == 0)) {
    func_0x0050d6e0(unaff_x29 + -200,lVar15 + lVar11,plStack0000000000000068,1);
    lVar15 = lVar15 + lVar11;
    if (*(int *)(lVar15 + 0x28) == 1) {
      uVar7 = *(ulong *)(lVar15 + 0x30);
      if (((in_stack_00000028 & 0x100000000) == 0) && ((*(uint *)(lVar15 + 0x250) >> 8 & 1) != 0)) {
        if (*(long *)(unaff_x29 + -200) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xc0),*(long *)(unaff_x29 + -200),1);
        }
      }
      else {
        uVar8 = *(ulong *)(unaff_x29 + -0xd0);
        if (uVar8 < uVar7 + 1) {
          *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
          func_0x004e0e50(unaff_x29 + -0xe0,uVar7 + 1,unaff_x29 + -0xb0,&UNK_009ea900);
          uVar8 = *(ulong *)(unaff_x29 + -0xd0);
        }
        lVar9 = *(long *)(unaff_x29 + -200);
        lVar11 = *(long *)(unaff_x29 + -0xc0);
        if (uVar8 <= uVar7) {
          func_0x007a2570(uVar7,uVar8,&UNK_009ea918);
                    /* WARNING: Does not return */
          pcVar5 = (code *)SoftwareBreakpoint(1,0x5293d4);
          (*pcVar5)();
        }
        lVar10 = *(long *)(unaff_x29 + -0xb8);
        plVar12 = (long *)(*(long *)(unaff_x29 + -0xd8) + uVar7 * 0x18);
        lVar15 = *plVar12;
        if (lVar15 != -0x8000000000000000 && lVar15 != 0) {
          func_0x00187bd4(plVar12[1],lVar15,1);
        }
        *plVar12 = lVar9;
        plVar12[1] = lVar11;
        plVar12[2] = lVar10;
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
LAB_00529124:
  lVar9 = 0;
  lVar11 = *(long *)(unaff_x29 + -0xf8);
  lVar10 = *(long *)(unaff_x29 + -0xf0);
  lVar13 = *(long *)(unaff_x29 + -0xe8);
  *(long *)(unaff_x29 + -0xa0) = lVar11;
  *(long *)(unaff_x29 + -0x98) = lVar10 + lVar13 * 0x18;
  lVar15 = 8;
  *(undefined8 *)(unaff_x29 + -200) = 0;
  *(undefined8 *)(unaff_x29 + -0xc0) = 8;
  *(undefined8 *)(unaff_x29 + -0xb8) = 0;
  *(long *)(unaff_x29 + -0xb0) = lVar10;
  *(long *)(unaff_x29 + -0xa8) = lVar10;
  if (lVar13 != 0) {
    func_0x007a5594(unaff_x29 + -200,0,lVar13,8,0x18);
    lVar15 = *(long *)(unaff_x29 + -0xc0);
    lVar9 = *(long *)(unaff_x29 + -0xb8);
  }
  _memcpy(lVar15 + lVar9 * 0x18,lVar10,lVar13 * 0x18);
  lVar9 = lVar9 + lVar13;
  *(long *)(unaff_x29 + -0xb8) = lVar9;
  if (lVar11 != 0) {
    func_0x00187bd4(lVar10,lVar11 * 0x18,8);
    lVar9 = *(long *)(unaff_x29 + -0xb8);
  }
  *(long *)(unaff_x29 + -0xb0) = in_stack_000000c8;
  *(long *)(unaff_x29 + -0xa8) = in_stack_000000c8;
  *(long *)(unaff_x29 + -0xa0) = in_stack_000000c0;
  *(ulong *)(unaff_x29 + -0x98) = in_stack_000000c8 + in_stack_000000d0 * 0x18;
  if ((ulong)(*(long *)(unaff_x29 + -200) - lVar9) < in_stack_000000d0) {
    func_0x007a5594(unaff_x29 + -200,lVar9,in_stack_000000d0,8,0x18);
    lVar9 = *(long *)(unaff_x29 + -0xb8);
  }
  _memcpy(*(long *)(unaff_x29 + -0xc0) + lVar9 * 0x18,in_stack_000000c8,in_stack_000000d0 * 0x18);
  *(ulong *)(unaff_x29 + -0xb8) = lVar9 + in_stack_000000d0;
  if (in_stack_000000c0 != 0) {
    func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
  }
  plVar12 = *(long **)(unaff_x29 + -0xd8);
  lVar9 = *(long *)(unaff_x29 + -0xd0);
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar12;
  *(long **)(unaff_x29 + -0x78) = plVar12;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xe0);
  *(long **)(unaff_x29 + -0x68) = plVar12 + lVar9 * 3;
  if (lVar9 != 0) {
    lVar11 = lVar9 * 0x18;
    plVar1 = plVar12;
    plStack0000000000000068 = plVar12 + lVar9 * 3;
    do {
      lVar11 = lVar11 + -0x18;
      lVar9 = *plVar1;
      plVar12 = plStack0000000000000068;
      if (lVar9 != -0x8000000000000000) {
        plVar12 = plVar1 + 3;
        if (lVar9 == -0x7fffffffffffffff) break;
        lVar15 = plVar1[1];
        lVar10 = plVar1[2];
        lVar13 = *(long *)(unaff_x29 + -0xb8);
        if (lVar13 == *(long *)(unaff_x29 + -200)) {
          func_0x0050c174(unaff_x29 + -200,&UNK_009ea8e8);
        }
        plVar12 = (long *)(*(long *)(unaff_x29 + -0xc0) + lVar13 * 0x18);
        *plVar12 = lVar9;
        plVar12[1] = lVar15;
        plVar12[2] = lVar10;
        *(long *)(unaff_x29 + -0xb8) = lVar13 + 1;
        plVar12 = plStack0000000000000068;
      }
      plStack0000000000000068 = plVar12;
      if (lVar11 == 0) break;
      plVar1 = plVar1 + 3;
    } while( true );
  }
  *(long **)(unaff_x29 + -0x78) = plVar12;
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

