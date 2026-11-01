
/* WARNING: Removing unreachable block (ram,0x0013f300) */

void FUN_0013f05c(undefined8 *param_1,long param_2)

{
  uint uVar1;
  undefined1 uVar2;
  int iVar3;
  undefined *puVar4;
  code *pcVar5;
  uint uVar6;
  undefined8 uVar7;
  long lVar8;
  long *plVar9;
  undefined8 *puVar10;
  uint uVar11;
  undefined8 in_x9;
  undefined8 *puVar12;
  undefined4 in_w10;
  int iVar13;
  long in_x13;
  byte bVar14;
  int iVar15;
  long *in_x17;
  long *unaff_x19;
  int iVar16;
  long lVar17;
  long *unaff_x21;
  ulong uVar18;
  ulong unaff_x22;
  int unaff_w23;
  long lVar19;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *puVar20;
  long *unaff_x26;
  byte *pbVar21;
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
  
code_r0x0013f05c:
  *(undefined4 *)(param_1 + 1) = in_w10;
  *param_1 = in_x9;
  puVar10 = param_1;
  puVar12 = param_1;
  if (unaff_x25 != unaff_x24) {
    do {
      puVar20 = (undefined8 *)((long)unaff_x25 + -0xc);
      uVar2 = *(undefined1 *)((long)unaff_x25 + -4);
      puVar12 = (undefined8 *)((long)puVar10 + -0xc);
      *puVar12 = *puVar20;
      *(undefined1 *)((long)puVar10 + -4) = uVar2;
      puVar10 = puVar12;
      unaff_x25 = puVar20;
    } while (puVar20 != unaff_x24);
    unaff_x25 = (undefined8 *)*in_x17;
  }
  *in_x17 = (long)puVar12;
  lVar17 = (long)param_1 + 0xc;
  *unaff_x21 = lVar17;
  *unaff_x19 = param_2 + unaff_x22 * in_x13;
  if (unaff_x25 != (undefined8 *)0x0) {
    __ZdlPv(unaff_x25);
    in_x13 = 0xc;
    in_x17 = in_stack_00000040;
  }
  puVar4 = PTR___DefaultRuneLocale_009b0028;
  do {
    *unaff_x21 = lVar17;
    unaff_x28 = unaff_x28 + 1;
    if ((ulong)((*in_stack_00000038 - *unaff_x26 >> 2) * -0x5555555555555555) <= unaff_x28) {
code_r0x0013f124:
      lVar17 = *(long *)(in_stack_00000008 + in_stack_00000018 * 0x18 + 8);
      if ((ulong)((*(long *)(in_stack_00000030 + 0x10) - *(long *)(in_stack_00000030 + 8) >> 3) *
                 -0x5555555555555555) <= in_stack_00000010) {
        uVar18 = 0xffffffffffffffff;
        goto code_r0x0013f284;
      }
      plVar9 = (long *)(*(long *)(in_stack_00000030 + 8) + (long)(int)in_stack_00000010 * 0x18);
      lVar8 = *plVar9;
      lVar19 = plVar9[1] - lVar8;
      uVar18 = 0;
      if (lVar19 == 0 || unaff_w23 < 1) goto code_r0x0013f284;
      iVar16 = 0;
      goto code_r0x0013f1c4;
    }
    pbVar21 = (byte *)(*unaff_x26 + unaff_x28 * in_x13);
    if (((char)*pbVar21 < '\0') ||
       ((*(uint *)(puVar4 + (ulong)*pbVar21 * 4 + 0x3c) >> 0x11 & 1) == 0)) goto code_r0x0013f124;
    unaff_x25 = (undefined8 *)*unaff_x21;
    if ((undefined8 *)*unaff_x19 <= unaff_x25) break;
    uVar7 = *(undefined8 *)pbVar21;
    *(undefined4 *)(unaff_x25 + 1) = *(undefined4 *)(pbVar21 + 8);
    *unaff_x25 = uVar7;
    lVar17 = (long)unaff_x25 + 0xc;
  } while( true );
  unaff_x24 = (undefined8 *)*in_x17;
  lVar17 = ((long)unaff_x25 - (long)unaff_x24 >> 2) * -0x5555555555555555;
  uVar18 = lVar17 + 1;
  if (0x1555555555555555 < uVar18) {
    func_0x00017f90(in_x17);
    goto code_r0x001402dc;
  }
  lVar8 = *unaff_x19 - (long)unaff_x24 >> 2;
  unaff_x22 = lVar8 * 0x5555555555555556;
  if (unaff_x22 <= uVar18) {
    unaff_x22 = uVar18;
  }
  if (0xaaaaaaaaaaaaaa9 < (ulong)(lVar8 * -0x5555555555555555)) {
    unaff_x22 = 0x1555555555555555;
  }
  if (unaff_x22 == 0) {
    param_2 = 0;
  }
  else {
    if (0x1555555555555555 < unaff_x22) {
      func_0x00017514();
code_r0x001402dc:
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x1402e0);
      (*pcVar5)();
    }
    param_2 = __Znwm(unaff_x22 * 0xc);
    in_x13 = 0xc;
    in_x17 = in_stack_00000040;
  }
  in_x9 = *(undefined8 *)pbVar21;
  in_w10 = *(undefined4 *)(pbVar21 + 8);
  param_1 = (undefined8 *)(param_2 + lVar17 * in_x13);
  goto code_r0x0013f05c;
  while ((uVar18 = (ulong)uVar6, uVar18 < (ulong)((lVar19 >> 2) * -0x5555555555555555) &&
         (iVar16 < unaff_w23))) {
code_r0x0013f1c4:
    bVar14 = *(byte *)(lVar8 + uVar18 * 0xc);
    iVar15 = (int)uVar18;
    if (bVar14 == 9) {
      iVar13 = *(int *)(in_stack_00000030 + 0x54);
      iVar3 = 0;
      if (iVar13 != 0) {
        iVar3 = iVar16 / iVar13;
      }
      iVar16 = iVar13 + iVar3 * iVar13;
      bVar14 = 0;
code_r0x0013f1f0:
      iVar13 = 1;
      if ((bVar14 & 0xe0) == 0xc0) {
        iVar13 = 2;
      }
      uVar6 = iVar13 + iVar15;
    }
    else {
      iVar16 = iVar16 + 1;
      if ((bVar14 & 0xfe) == 0xfc) {
        uVar6 = iVar15 + 6;
      }
      else if ((bVar14 & 0xfc) == 0xf8) {
        uVar6 = iVar15 + 5;
      }
      else if ((bVar14 & 0xf8) == 0xf0) {
        uVar6 = iVar15 + 4;
      }
      else {
        if ((bVar14 & 0xf0) != 0xe0) goto code_r0x0013f1f0;
        uVar6 = iVar15 + 3;
      }
    }
  }
code_r0x0013f284:
  lVar19 = *in_x17;
  lVar8 = *unaff_x26 + uVar18 * 0xc;
  plVar9 = (long *)(in_stack_00000008 + (long)(int)in_stack_00000010 * 0x18 + 8);
  func_0x00149130(in_x17,lVar17,lVar8,*plVar9,(*plVar9 - lVar8 >> 2) * -0x5555555555555555);
  iVar16 = (int)(lVar17 - lVar19 >> 2) * -0x55555555;
  if ((*plVar9 - *unaff_x26 >> 2) * -0x5555555555555555 != uVar18) {
    *plVar9 = *unaff_x26 + uVar18 * 0xc;
  }
  uVar18 = (*(long *)(in_stack_00000030 + 0x10) - *(long *)(in_stack_00000030 + 8) >> 3) *
           -0x5555555555555555;
  if ((iVar16 >= 1 && in_stack_00000018 <= uVar18) && (iVar16 < 1 || uVar18 != in_stack_00000018)) {
    uVar6 = 0;
    uVar11 = 0;
    plVar9 = (long *)(*(long *)(in_stack_00000030 + 8) + in_stack_00000018 * 0x18);
    lVar17 = *plVar9;
    do {
      while( true ) {
        if ((int)((ulong)(plVar9[1] - lVar17) >> 2) * -0x55555555 <= (int)uVar11)
        goto code_r0x0013f33c;
        bVar14 = *(byte *)(lVar17 + (ulong)uVar11 * 0xc);
        iVar15 = 1;
        if ((bVar14 & 0xe0) == 0xc0) {
          iVar15 = 2;
        }
        iVar13 = 3;
        if ((bVar14 & 0xf0) != 0xe0) {
          iVar13 = iVar15;
        }
        iVar15 = 4;
        if ((bVar14 & 0xf8) != 0xf0) {
          iVar15 = iVar13;
        }
        iVar13 = 5;
        if ((bVar14 & 0xfc) != 0xf8) {
          iVar13 = iVar15;
        }
        iVar15 = 6;
        if ((bVar14 & 0xfe) != 0xfc) {
          iVar15 = iVar13;
        }
        if (bVar14 != 9) break;
        iVar13 = *(int *)(in_stack_00000030 + 0x54);
        iVar3 = 0;
        if (iVar13 != 0) {
          iVar3 = (int)uVar6 / iVar13;
        }
        uVar6 = iVar13 + iVar3 * iVar13;
        uVar11 = iVar15 + uVar11;
        if (iVar16 <= (int)uVar11) goto code_r0x0013f33c;
      }
      uVar6 = uVar6 + 1;
      uVar11 = iVar15 + uVar11;
    } while ((int)uVar11 < iVar16);
  }
  else {
    uVar6 = 0;
  }
code_r0x0013f33c:
  if ((*in_stack_00000048 != (int)in_stack_00000018) ||
     (*(uint *)(in_stack_00000030 + 0x34) != uVar6)) {
    *(ulong *)(in_stack_00000030 + 0x30) = in_stack_00000018 & 0xffffffff | (ulong)uVar6 << 0x20;
    *(undefined1 *)(in_stack_00000030 + 0x68) = 1;
    func_0x001420d0(in_stack_00000030);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    in_stack_00000088 = 1;
    puVar10 = uStack0000000000000080;
  }
  else {
    in_stack_00000090._7_1_ = '\x01';
    puVar10 = &uStack0000000000000080;
  }
  *(undefined2 *)puVar10 = 10;
  *(undefined1 *)(in_stack_00000030 + 0x5d) = 1;
  in_stack_000000a0 = func_0x00137dcc(in_stack_00000030,in_stack_00000048);
  in_stack_000000f0 = in_stack_00000020[1];
  in_stack_000000e8 = *in_stack_00000020;
  in_stack_000000f8 = in_stack_00000020[2];
  func_0x00139988(in_stack_00000030,&uStack0000000000000080);
  uVar11 = (int)((ulong)(*(long *)(in_stack_00000030 + 0x10) - *(long *)(in_stack_00000030 + 8)) >>
                3) * -0x55555555;
  uVar6 = in_stack_00000028 + 2U;
  if ((int)uVar11 <= (int)(in_stack_00000028 + 2U)) {
    uVar6 = uVar11;
  }
  uVar11 = *(uint *)(in_stack_00000030 + 0x6c);
  if ((int)(in_stack_00000028 - 1U) <= (int)*(uint *)(in_stack_00000030 + 0x6c)) {
    uVar11 = in_stack_00000028 - 1U;
  }
  uVar1 = *(uint *)(in_stack_00000030 + 0x70);
  if ((int)*(uint *)(in_stack_00000030 + 0x70) <= (int)uVar6) {
    uVar1 = uVar6;
  }
  uVar11 = uVar11 & ((int)uVar11 >> 0x1f ^ 0xffffffffU);
  uVar6 = uVar11;
  if ((int)uVar11 <= (int)uVar1) {
    uVar6 = uVar1;
  }
  *(uint *)(in_stack_00000030 + 0x6c) = uVar11;
  *(uint *)(in_stack_00000030 + 0x70) = uVar6;
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

