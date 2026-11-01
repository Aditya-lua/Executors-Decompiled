
/* WARNING: Removing unreachable block (ram,0x0013f300) */

void FUN_0013effc(undefined8 *param_1)

{
  uint uVar1;
  undefined1 uVar2;
  int iVar3;
  undefined *puVar4;
  code *pcVar5;
  undefined1 in_ZR;
  undefined1 in_CY;
  long lVar6;
  long lVar7;
  uint uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long *plVar11;
  undefined8 *puVar12;
  uint uVar13;
  ulong in_x9;
  undefined8 uVar14;
  undefined8 *puVar15;
  ulong uVar16;
  int iVar17;
  ulong in_x12;
  long in_x13;
  byte bVar18;
  long in_x14;
  int iVar19;
  long *in_x17;
  long *unaff_x19;
  int iVar20;
  long unaff_x20;
  long *unaff_x21;
  int unaff_w23;
  long lVar21;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *puVar22;
  long *unaff_x26;
  byte *unaff_x27;
  ulong unaff_x28;
  long in_stack_00000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 *in_stack_00000020;
  int in_stack_00000028;
  long in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  int *in_stack_00000048;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  
code_r0x0013effc:
  if ((bool)in_CY && !(bool)in_ZR) {
    func_0x00017f90(in_x17);
code_r0x001402dc:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x1402e0);
    (*pcVar5)();
  }
  uVar9 = ((long)param_1 - (long)unaff_x24 >> 2) * in_x14;
  uVar16 = uVar9 * 2;
  if (uVar16 <= in_x9) {
    uVar16 = in_x9;
  }
  if (0xaaaaaaaaaaaaaa9 < uVar9) {
    uVar16 = in_x12;
  }
  if (uVar16 == 0) {
    lVar6 = 0;
  }
  else {
    if (in_x12 < uVar16) {
      func_0x00017514();
      goto code_r0x001402dc;
    }
    lVar6 = __Znwm(uVar16 * 0xc);
    in_x13 = 0xc;
    in_x17 = in_stack_00000040;
  }
  uVar14 = *(undefined8 *)unaff_x27;
  puVar10 = (undefined8 *)(lVar6 + unaff_x20 * in_x13);
  *(undefined4 *)(puVar10 + 1) = *(undefined4 *)(unaff_x27 + 8);
  *puVar10 = uVar14;
  puVar12 = puVar10;
  puVar15 = puVar10;
  if (unaff_x25 != unaff_x24) {
    do {
      puVar22 = (undefined8 *)((long)unaff_x25 + -0xc);
      uVar2 = *(undefined1 *)((long)unaff_x25 + -4);
      puVar15 = (undefined8 *)((long)puVar12 + -0xc);
      *puVar15 = *puVar22;
      *(undefined1 *)((long)puVar12 + -4) = uVar2;
      puVar12 = puVar15;
      unaff_x25 = puVar22;
    } while (puVar22 != unaff_x24);
    unaff_x25 = (undefined8 *)*in_x17;
  }
  *in_x17 = (long)puVar15;
  lVar7 = (long)puVar10 + 0xc;
  *unaff_x21 = lVar7;
  *unaff_x19 = lVar6 + uVar16 * in_x13;
  if (unaff_x25 != (undefined8 *)0x0) {
    __ZdlPv(unaff_x25);
    in_x13 = 0xc;
    in_x17 = in_stack_00000040;
  }
  puVar4 = PTR___DefaultRuneLocale_009b0028;
  in_x12 = 0x1555555555555555;
  in_x14 = -0x5555555555555555;
  do {
    *unaff_x21 = lVar7;
    unaff_x28 = unaff_x28 + 1;
    if ((ulong)((*in_stack_00000038 - *unaff_x26 >> 2) * -0x5555555555555555) <= unaff_x28) {
code_r0x0013f124:
      lVar6 = *(long *)(in_stack_00000008 + in_stack_00000018 * 0x18 + 8);
      if ((ulong)((*(long *)(in_stack_00000030 + 0x10) - *(long *)(in_stack_00000030 + 8) >> 3) *
                 -0x5555555555555555) <= in_stack_00000010) {
        uVar16 = 0xffffffffffffffff;
        goto code_r0x0013f284;
      }
      plVar11 = (long *)(*(long *)(in_stack_00000030 + 8) + (long)(int)in_stack_00000010 * 0x18);
      lVar7 = *plVar11;
      lVar21 = plVar11[1] - lVar7;
      uVar16 = 0;
      if (lVar21 == 0 || unaff_w23 < 1) goto code_r0x0013f284;
      iVar20 = 0;
      goto code_r0x0013f1c4;
    }
    unaff_x27 = (byte *)(*unaff_x26 + unaff_x28 * in_x13);
    if (((char)*unaff_x27 < '\0') ||
       ((*(uint *)(puVar4 + (ulong)*unaff_x27 * 4 + 0x3c) >> 0x11 & 1) == 0)) goto code_r0x0013f124;
    unaff_x25 = (undefined8 *)*unaff_x21;
    param_1 = (undefined8 *)*unaff_x19;
    if (param_1 <= unaff_x25) break;
    uVar14 = *(undefined8 *)unaff_x27;
    *(undefined4 *)(unaff_x25 + 1) = *(undefined4 *)(unaff_x27 + 8);
    *unaff_x25 = uVar14;
    lVar7 = (long)unaff_x25 + 0xc;
  } while( true );
  unaff_x24 = (undefined8 *)*in_x17;
  unaff_x20 = ((long)unaff_x25 - (long)unaff_x24 >> 2) * -0x5555555555555555;
  in_x9 = unaff_x20 + 1;
  in_CY = 0x1555555555555554 < in_x9;
  in_ZR = in_x9 == 0x1555555555555555;
  goto code_r0x0013effc;
  while ((uVar16 = (ulong)uVar8, uVar16 < (ulong)((lVar21 >> 2) * -0x5555555555555555) &&
         (iVar20 < unaff_w23))) {
code_r0x0013f1c4:
    bVar18 = *(byte *)(lVar7 + uVar16 * 0xc);
    iVar19 = (int)uVar16;
    if (bVar18 == 9) {
      iVar17 = *(int *)(in_stack_00000030 + 0x54);
      iVar3 = 0;
      if (iVar17 != 0) {
        iVar3 = iVar20 / iVar17;
      }
      iVar20 = iVar17 + iVar3 * iVar17;
      bVar18 = 0;
code_r0x0013f1f0:
      iVar17 = 1;
      if ((bVar18 & 0xe0) == 0xc0) {
        iVar17 = 2;
      }
      uVar8 = iVar17 + iVar19;
    }
    else {
      iVar20 = iVar20 + 1;
      if ((bVar18 & 0xfe) == 0xfc) {
        uVar8 = iVar19 + 6;
      }
      else if ((bVar18 & 0xfc) == 0xf8) {
        uVar8 = iVar19 + 5;
      }
      else if ((bVar18 & 0xf8) == 0xf0) {
        uVar8 = iVar19 + 4;
      }
      else {
        if ((bVar18 & 0xf0) != 0xe0) goto code_r0x0013f1f0;
        uVar8 = iVar19 + 3;
      }
    }
  }
code_r0x0013f284:
  lVar21 = *in_x17;
  lVar7 = *unaff_x26 + uVar16 * 0xc;
  plVar11 = (long *)(in_stack_00000008 + (long)(int)in_stack_00000010 * 0x18 + 8);
  func_0x00149130(in_x17,lVar6,lVar7,*plVar11,(*plVar11 - lVar7 >> 2) * -0x5555555555555555);
  iVar20 = (int)(lVar6 - lVar21 >> 2) * -0x55555555;
  if ((*plVar11 - *unaff_x26 >> 2) * -0x5555555555555555 != uVar16) {
    *plVar11 = *unaff_x26 + uVar16 * 0xc;
  }
  uVar16 = (*(long *)(in_stack_00000030 + 0x10) - *(long *)(in_stack_00000030 + 8) >> 3) *
           -0x5555555555555555;
  if ((iVar20 >= 1 && in_stack_00000018 <= uVar16) && (iVar20 < 1 || uVar16 != in_stack_00000018)) {
    uVar8 = 0;
    uVar13 = 0;
    plVar11 = (long *)(*(long *)(in_stack_00000030 + 8) + in_stack_00000018 * 0x18);
    lVar6 = *plVar11;
    do {
      while( true ) {
        if ((int)((ulong)(plVar11[1] - lVar6) >> 2) * -0x55555555 <= (int)uVar13)
        goto code_r0x0013f33c;
        bVar18 = *(byte *)(lVar6 + (ulong)uVar13 * 0xc);
        iVar19 = 1;
        if ((bVar18 & 0xe0) == 0xc0) {
          iVar19 = 2;
        }
        iVar17 = 3;
        if ((bVar18 & 0xf0) != 0xe0) {
          iVar17 = iVar19;
        }
        iVar19 = 4;
        if ((bVar18 & 0xf8) != 0xf0) {
          iVar19 = iVar17;
        }
        iVar17 = 5;
        if ((bVar18 & 0xfc) != 0xf8) {
          iVar17 = iVar19;
        }
        iVar19 = 6;
        if ((bVar18 & 0xfe) != 0xfc) {
          iVar19 = iVar17;
        }
        if (bVar18 != 9) break;
        iVar17 = *(int *)(in_stack_00000030 + 0x54);
        iVar3 = 0;
        if (iVar17 != 0) {
          iVar3 = (int)uVar8 / iVar17;
        }
        uVar8 = iVar17 + iVar3 * iVar17;
        uVar13 = iVar19 + uVar13;
        if (iVar20 <= (int)uVar13) goto code_r0x0013f33c;
      }
      uVar8 = uVar8 + 1;
      uVar13 = iVar19 + uVar13;
    } while ((int)uVar13 < iVar20);
  }
  else {
    uVar8 = 0;
  }
code_r0x0013f33c:
  if ((*in_stack_00000048 != (int)in_stack_00000018) ||
     (*(uint *)(in_stack_00000030 + 0x34) != uVar8)) {
    *(ulong *)(in_stack_00000030 + 0x30) = in_stack_00000018 & 0xffffffff | (ulong)uVar8 << 0x20;
    *(undefined1 *)(in_stack_00000030 + 0x68) = 1;
    func_0x001420d0(in_stack_00000030);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    in_stack_00000088 = 1;
    puVar12 = uStack0000000000000080;
  }
  else {
    in_stack_00000090._7_1_ = '\x01';
    puVar12 = &uStack0000000000000080;
  }
  *(undefined2 *)puVar12 = 10;
  *(undefined1 *)(in_stack_00000030 + 0x5d) = 1;
  in_stack_000000a0 = func_0x00137dcc(in_stack_00000030,in_stack_00000048);
  in_stack_000000f0 = in_stack_00000020[1];
  in_stack_000000e8 = *in_stack_00000020;
  in_stack_000000f8 = in_stack_00000020[2];
  func_0x00139988(in_stack_00000030,&uStack0000000000000080);
  uVar13 = (int)((ulong)(*(long *)(in_stack_00000030 + 0x10) - *(long *)(in_stack_00000030 + 8)) >>
                3) * -0x55555555;
  uVar8 = in_stack_00000028 + 2U;
  if ((int)uVar13 <= (int)(in_stack_00000028 + 2U)) {
    uVar8 = uVar13;
  }
  uVar13 = *(uint *)(in_stack_00000030 + 0x6c);
  if ((int)(in_stack_00000028 - 1U) <= (int)*(uint *)(in_stack_00000030 + 0x6c)) {
    uVar13 = in_stack_00000028 - 1U;
  }
  uVar1 = *(uint *)(in_stack_00000030 + 0x70);
  if ((int)*(uint *)(in_stack_00000030 + 0x70) <= (int)uVar8) {
    uVar1 = uVar8;
  }
  uVar13 = uVar13 & ((int)uVar13 >> 0x1f ^ 0xffffffffU);
  uVar8 = uVar13;
  if ((int)uVar13 <= (int)uVar1) {
    uVar8 = uVar1;
  }
  *(uint *)(in_stack_00000030 + 0x6c) = uVar13;
  *(uint *)(in_stack_00000030 + 0x70) = uVar8;
  *(undefined1 *)(in_stack_00000030 + 0x248) = 1;
  func_0x001420d0(in_stack_00000030);
  if (in_stack_000000b8._7_1_ < '\0') {
    __ZdlPv(in_stack_000000a8);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000080);
  }
  return;
}

