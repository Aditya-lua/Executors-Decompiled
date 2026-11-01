
void FUN_006b6164(void)

{
  uint uVar1;
  char cVar2;
  uint uVar3;
  code *pcVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long unaff_x19;
  long lVar11;
  long unaff_x21;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong unaff_x26;
  long *unaff_x28;
  undefined1 uStack0000000000000044;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
  do {
    func_0x00798b54();
    unaff_x26 = unaff_x26 + 1;
  } while (unaff_x26 < (ulong)(*(long *)(unaff_x21 + 0x1f8) - *(long *)(unaff_x21 + 0x1f0) >> 4));
  lVar10 = *(long *)(unaff_x21 + 0x28);
  lVar11 = *(long *)(unaff_x21 + 0x30);
  in_stack_00000050 = 0;
  in_stack_00000058 = 0;
  uStack0000000000000048 = 0;
  uVar13 = lVar11 - lVar10;
  uVar12 = (long)uVar13 >> 2;
  if (uVar13 == 0) {
    lVar8 = 0;
    uVar9 = 0;
    lVar10 = lVar11;
  }
  else {
    if ((long)uVar13 < 0) {
      func_0x00017f90(&uStack0000000000000048);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x6b65f8);
      (*pcVar4)();
    }
    lVar8 = __Znwm(uVar13);
    lVar11 = lVar8 + uVar12 * 4;
    uStack0000000000000048 = lVar8;
    in_stack_00000058 = lVar11;
    _memset(lVar8,0xff,uVar13 & 0xfffffffffffffffc);
    uVar14 = 0;
    in_stack_00000050 = lVar11;
    do {
      uVar1 = *(uint *)(lVar10 + uVar14 * 4);
      uVar5 = uVar1 & 0xff;
      uVar3 = uVar5 - 0x17;
      if (uVar3 < 0x3a) {
        if ((1L << ((ulong)uVar3 & 0x3f) & 0x3e0005e000003ffU) != 0) {
          uVar3 = (int)uVar1 >> 0x10;
          goto joined_r0x006b6248;
        }
        if ((1L << ((ulong)uVar3 & 0x3f) & 0x1c202000000000U) == 0) goto LAB_006b6274;
        uVar1 = (int)uVar14 + (uVar1 >> 0x18) + 2;
        if ((int)uVar1 < 0) goto LAB_006b61fc;
LAB_006b61f0:
        *(undefined4 *)(lVar8 + (ulong)uVar1 * 4) = 0;
        uVar5 = (uint)*(byte *)(lVar10 + uVar14 * 4);
      }
      else {
LAB_006b6274:
        uVar3 = uVar1 >> 0x18;
        if (uVar3 == 0 || uVar5 != 3) {
          if (uVar5 == 0x43) {
            uVar3 = (int)uVar1 >> 8;
            goto joined_r0x006b6248;
          }
        }
        else {
joined_r0x006b6248:
          uVar1 = (int)uVar14 + uVar3 + 1;
          if (-1 < (int)uVar1) goto LAB_006b61f0;
        }
      }
LAB_006b61fc:
      iVar6 = func_0x0008a21c(uVar5);
      uVar14 = uVar14 + (long)iVar6;
      lVar10 = *(long *)(unaff_x21 + 0x28);
      lVar11 = *(long *)(unaff_x21 + 0x30);
      uVar9 = lVar11 - lVar10 >> 2;
    } while (uVar14 < uVar9);
    if (uVar13 < 4) {
    }
    else {
      uVar13 = 0;
      iVar6 = 0;
      if (uVar12 < 2) {
        uVar12 = 1;
      }
      do {
        if (*(int *)(lVar8 + uVar13 * 4) == 0) {
          *(int *)(lVar8 + uVar13 * 4) = iVar6;
          iVar6 = iVar6 + 1;
        }
        uVar13 = uVar13 + 1;
      } while (uVar12 != uVar13);
    }
  }
  uVar9 = uVar9 + 1;
  _uStack0000000000000044 = 0xffffffff;
  uVar12 = unaff_x28[1] - *unaff_x28 >> 2;
  if (uVar9 < uVar12 || uVar9 - uVar12 == 0) {
    if (uVar9 < uVar12) {
      unaff_x28[1] = *unaff_x28 + uVar9 * 4;
    }
  }
  else {
    func_0x006b89e8(unaff_x28,uVar9 - uVar12,&uStack0000000000000044);
    lVar10 = *(long *)(unaff_x21 + 0x28);
    lVar11 = *(long *)(unaff_x21 + 0x30);
  }
  if (lVar11 == lVar10) {
    uVar12 = 0;
  }
  else {
    uVar9 = 0;
    uVar13 = 0;
    iVar6 = -1;
    do {
      while( true ) {
        cVar2 = *(char *)(lVar10 + uVar13 * 4);
        uVar5 = (uint)*(undefined8 *)(unaff_x19 + 8);
        if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
          uVar5 = (uint)*(byte *)(unaff_x19 + 0x17);
        }
        *(uint *)(*unaff_x28 + uVar13 * 4) = uVar5;
        if (cVar2 == 'A') break;
        uVar5 = *(uint *)(unaff_x21 + 0x2d0);
        if (((uVar5 >> 4 & 1) != 0) &&
           (lVar10 = *(long *)(unaff_x21 + 0x280),
           uVar9 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar10 >> 3))) {
          lVar11 = uVar9 << 3;
          do {
            if (uVar13 != *(uint *)(lVar10 + lVar11)) break;
            func_0x00798b54();
            uVar9 = uVar9 + 1;
            lVar10 = *(long *)(unaff_x21 + 0x280);
            lVar11 = lVar11 + 8;
          } while (uVar9 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar10 >> 3));
          uVar5 = *(uint *)(unaff_x21 + 0x2d0);
        }
        if (((uVar5 >> 2 & 1) != 0) &&
           (iVar7 = *(int *)(*(long *)(unaff_x21 + 0x40) + uVar13 * 4), 0 < iVar7 && iVar7 != iVar6)
           ) {
          func_0x00798b54();
          uVar5 = *(uint *)(unaff_x21 + 0x2d0);
          iVar6 = iVar7;
        }
        if ((uVar5 >> 1 & 1) != 0) {
          func_0x00798b54();
        }
        lVar8 = uStack0000000000000048;
        if (*(int *)(uStack0000000000000048 + uVar13 * 4) != -1) {
          func_0x00798b54();
        }
        func_0x006b53d4();
        iVar7 = func_0x0008a21c(cVar2);
        uVar13 = uVar13 + (long)iVar7;
        lVar10 = *(long *)(unaff_x21 + 0x28);
        lVar11 = *(long *)(unaff_x21 + 0x30);
        uVar12 = lVar11 - lVar10 >> 2;
        if (uVar12 <= uVar13) goto code_r0x006b6568;
      }
      uVar13 = uVar13 + 1;
      uVar12 = lVar11 - lVar10 >> 2;
    } while (uVar13 < uVar12);
  }
code_r0x006b6568:
  uVar5 = (uint)*(undefined8 *)(unaff_x19 + 8);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
    uVar5 = (uint)*(byte *)(unaff_x19 + 0x17);
  }
  *(uint *)(*unaff_x28 + uVar12 * 4) = uVar5;
  if (lVar8 != 0) {
    in_stack_00000050 = lVar8;
    __ZdlPv(lVar8);
  }
  return;
}

