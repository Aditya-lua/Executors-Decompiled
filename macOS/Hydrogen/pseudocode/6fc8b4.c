
void FUN_006fc8b4(void)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  int iVar4;
  undefined8 *puVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  double *pdVar12;
  long lVar13;
  undefined1 *puVar14;
  double dVar15;
  uint uVar16;
  long lVar17;
  undefined4 *puVar18;
  ulong uVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  long unaff_x19;
  undefined8 unaff_x20;
  double *unaff_x21;
  undefined1 *unaff_x22;
  int unaff_w23;
  undefined1 *puVar23;
  double *pdVar24;
  long lVar25;
  undefined1 *puVar26;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar27 [16];
  long in_stack_00000080;
  ulong in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  ulong in_stack_000000a0;
  undefined1 *in_stack_000000a8;
  undefined1 *in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined1 *in_stack_000000d0;
  undefined *in_stack_000000d8;
  undefined1 uStack00000000000000e0;
  
  auVar27._8_8_ = unaff_x19;
  auVar27._0_8_ = unaff_x20;
  lVar25 = *(long *)(unaff_x19 + 0x20);
  lVar13 = __dyld_get_image_header(0);
  iVar8 = (int)unaff_x22;
  if (lVar25 == lVar13 + unaff_x25) {
    bVar6 = iVar8 < *(int *)(unaff_x19 + 8);
    puVar23 = (undefined1 *)(ulong)(unaff_w23 + 1);
    if (unaff_x21 != (double *)0x0) goto LAB_006fc8f0;
LAB_006fc924:
    iVar7 = -1;
  }
  else {
    bVar6 = true;
    puVar23 = (undefined1 *)(ulong)(unaff_w23 + 1);
    if (unaff_x21 == (double *)0x0) goto LAB_006fc924;
LAB_006fc8f0:
    if (*(int *)((long)unaff_x21 + 0xc) != 3) goto LAB_006fc924;
    iVar7 = (int)*unaff_x21;
    if (*unaff_x21 != (double)iVar7) {
      iVar7 = -1;
    }
  }
  if (bVar6) {
    iVar4 = iVar7 + -1;
    puVar26 = unaff_x22;
    do {
      do {
        iVar7 = (int)puVar26;
        puVar26 = (undefined1 *)(ulong)(iVar7 + 1);
      } while (iVar4 == iVar7);
      lVar13 = func_0x006fb65c();
    } while (*(int *)(lVar13 + 0xc) != 0);
  }
  else if (iVar8 + 1 != iVar7) goto code_r0x006fca0c;
  iVar8 = iVar7 - iVar8;
  if (iVar8 == 0) goto code_r0x006fca0c;
  uVar2 = iVar8 + iVar7;
  lVar25 = *(long *)(unaff_x19 + 0x20);
  lVar13 = __dyld_get_image_header(0);
  if (lVar25 == lVar13 + unaff_x25) {
    bVar6 = (int)uVar2 < *(int *)(unaff_x19 + 8);
    puVar23 = (undefined1 *)(ulong)(uint)((int)puVar23 - iVar8);
    if (unaff_x21 != (double *)0x0) goto code_r0x006fc9a4;
code_r0x006fc9d8:
    uVar16 = 0xffffffff;
  }
  else {
    bVar6 = true;
    puVar23 = (undefined1 *)(ulong)(uint)((int)puVar23 - iVar8);
    if (unaff_x21 == (double *)0x0) goto code_r0x006fc9d8;
code_r0x006fc9a4:
    if (*(int *)((long)unaff_x21 + 0xc) != 3) goto code_r0x006fc9d8;
    uVar16 = (uint)*unaff_x21;
    if (*unaff_x21 != (double)(int)uVar16) {
      uVar16 = 0xffffffff;
    }
  }
  if (bVar6) {
    do {
      do {
        unaff_x22 = (undefined1 *)(ulong)uVar2;
        uVar1 = uVar2 + 1;
        bVar6 = uVar16 - 1 == uVar2;
        uVar2 = uVar1;
      } while (bVar6);
      lVar13 = func_0x006fb65c();
    } while (*(int *)(lVar13 + 0xc) != 0);
  }
  else {
    if (uVar2 + 1 != uVar16) {
      uVar16 = uVar2;
    }
    unaff_x22 = (undefined1 *)(ulong)uVar16;
  }
code_r0x006fca0c:
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    if (((bRam0000000000a278d0 & 1) != 0) || (iVar8 = ___cxa_guard_acquire(0xa278d0), iVar8 == 0)) {
      return;
    }
    if (((bRam0000000000a28b60 & 1) == 0) && (iVar8 = ___cxa_guard_acquire(0xa28b60), iVar8 != 0)) {
      lRam0000000000a28b58 = __dyld_get_image_header(0);
      ___cxa_guard_release(0xa28b60);
    }
    lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
    return;
  }
  puVar26 = &uStack00000000000000e0;
  do {
    lVar13 = auVar27._8_8_;
    uVar9 = auVar27._0_8_;
    *(long *)(puVar26 + -0x60) = in_stack_00000080;
    *(ulong *)(puVar26 + -0x58) = in_stack_00000088;
    *(long *)(puVar26 + -0x50) = in_stack_00000090;
    *(long *)(puVar26 + -0x48) = in_stack_00000098;
    *(ulong *)(puVar26 + -0x40) = in_stack_000000a0;
    *(undefined1 **)(puVar26 + -0x38) = in_stack_000000a8;
    *(undefined1 **)(puVar26 + -0x30) = in_stack_000000b0;
    *(long *)(puVar26 + -0x28) = in_stack_000000b8;
    *(long *)(puVar26 + -0x20) = in_stack_000000c0;
    *(undefined8 *)(puVar26 + -0x18) = in_stack_000000c8;
    *(undefined1 **)(puVar26 + -0x10) = in_stack_000000d0;
    *(undefined **)(puVar26 + -8) = in_stack_000000d8;
    in_stack_000000d0 = puVar26 + -0x10;
    iVar8 = (int)unaff_x22;
    iVar7 = (int)puVar23;
    puVar14 = unaff_x22;
    if (iVar8 < 0x4000001 && iVar7 < 0x4000001) {
      iVar4 = *(int *)(lVar13 + 8);
      in_stack_00000090 = (long)iVar4;
      bVar3 = *(byte *)(lVar13 + 6);
      in_stack_000000a0 = (ulong)bVar3;
      in_stack_000000b8 = *(long *)(lVar13 + 0x20);
      in_stack_000000b0 = unaff_x22;
      in_stack_000000a8 = puVar23;
      if (iVar4 < iVar8) {
        if (-1 < iVar8) {
          puVar14 = (undefined1 *)(in_stack_00000090 << 4);
          lVar25 = func_0x006f3d14(uVar9,*(undefined8 *)(lVar13 + 0x18),puVar14,
                                   ((ulong)unaff_x22 & 0xffffffff) << 4,*(undefined1 *)(lVar13 + 2))
          ;
          *(long *)(lVar13 + 0x18) = lVar25;
          lVar21 = (long)*(int *)(lVar13 + 8);
          if (*(int *)(lVar13 + 8) < iVar8) {
            uVar19 = ((ulong)unaff_x22 & 0xffffffff) - lVar21;
            lVar17 = lVar21;
            if (3 < uVar19) {
              uVar20 = uVar19 & 0xfffffffffffffffc;
              lVar17 = uVar20 + lVar21;
              puVar18 = (undefined4 *)(lVar25 + lVar21 * 0x10 + 0x2c);
              uVar22 = uVar20;
              do {
                puVar18[-8] = 0;
                puVar18[-4] = 0;
                *puVar18 = 0;
                puVar18[4] = 0;
                puVar18 = puVar18 + 0x10;
                uVar22 = uVar22 - 4;
              } while (uVar22 != 0);
              if (uVar19 == uVar20) goto code_r0x006fb1c0;
            }
            lVar21 = ((ulong)unaff_x22 & 0xffffffff) - lVar17;
            puVar18 = (undefined4 *)(lVar25 + lVar17 * 0x10 + 0xc);
            do {
              *puVar18 = 0;
              lVar21 = lVar21 + -1;
              puVar18 = puVar18 + 4;
            } while (lVar21 != 0);
          }
code_r0x006fb1c0:
          *(int *)(lVar13 + 8) = iVar8;
          goto code_r0x006fb1c4;
        }
      }
      else {
code_r0x006fb1c4:
        in_stack_00000098 = 0x4e8dec0;
        if (iVar7 == 0) {
          lVar25 = __dyld_get_image_header(0);
          in_stack_00000088 = 0;
          *(long *)(lVar13 + 0x20) = lVar25 + 0x4e8dec0;
        }
        else {
          iVar7 = func_0x006f4b48(iVar7 + -1);
          in_stack_000000c0 = lVar13;
          if (0x19 < iVar7) goto code_r0x006fb3e4;
          puVar23 = (undefined1 *)(ulong)(iVar7 + 1U);
          in_stack_00000088 = (ulong)(uint)(1 << (ulong)(iVar7 + 1U & 0x1f));
          puVar14 = (undefined1 *)(ulong)*(byte *)(lVar13 + 2);
          uVar10 = func_0x006f3708(uVar9,in_stack_00000088 << 5);
          lVar25 = 0;
          *(undefined8 *)(lVar13 + 0x20) = uVar10;
          uVar19 = in_stack_00000088;
          do {
            lVar21 = *(long *)(lVar13 + 0x20) + lVar25;
            *(undefined4 *)(lVar21 + 0x1c) = 0;
            *(undefined4 *)(lVar21 + 0xc) = 0;
            lVar25 = lVar25 + 0x20;
            uVar19 = uVar19 - 1;
          } while (uVar19 != 0);
        }
        *(char *)(lVar13 + 6) = (char)puVar23;
        *(byte *)(lVar13 + 7) = ~(byte)(-1 << (ulong)((uint)puVar23 & 0x1f));
        *(int *)(lVar13 + 0xc) = (int)in_stack_00000088;
        if (iVar4 <= iVar8) goto code_r0x006fb2f0;
        *(int *)(lVar13 + 8) = iVar8;
        in_stack_000000a8 = (undefined1 *)((long)&MACH_HEADER.magic + 3);
        uVar19 = (long)iVar8;
        do {
          while( true ) {
            uVar22 = uVar19;
            in_stack_00000080 = *(long *)(lVar13 + 0x18);
            if (*(int *)(in_stack_00000080 + uVar22 * 0x10 + 0xc) == 0) break;
            in_stack_00000088 = uVar22 + 1;
            *(double *)(puVar26 + -0x70) = (double)(int)in_stack_00000088;
            *(undefined4 *)(puVar26 + -100) = 3;
            puVar14 = puVar26 + -0x70;
            puVar11 = (undefined8 *)func_0x006fbc58(uVar9,lVar13);
            puVar5 = (undefined8 *)(in_stack_00000080 + uVar22 * 0x10);
            uVar10 = *puVar5;
            puVar11[1] = puVar5[1];
            *puVar11 = uVar10;
            uVar19 = in_stack_00000088;
            if ((int)in_stack_00000088 == iVar4) goto code_r0x006fb2c8;
          }
          uVar19 = uVar22 + 1;
        } while ((int)(uVar22 + 1) != iVar4);
code_r0x006fb2c8:
        in_stack_00000098 = uVar22 + 1;
        if (-1 < iVar8) {
          uVar10 = func_0x006f3d14(uVar9,*(undefined8 *)(lVar13 + 0x18),in_stack_00000090 << 4,
                                   ((ulong)unaff_x22 & 0xffffffff) << 4,*(undefined1 *)(lVar13 + 2))
          ;
          *(undefined8 *)(lVar13 + 0x18) = uVar10;
code_r0x006fb2f0:
          uVar2 = 1 << (ulong)(bVar3 & 0x1f);
          if (bVar3 != 0x1f) {
            iVar8 = uVar2 + 1;
            pdVar24 = (double *)(in_stack_000000b8 + (ulong)(uVar2 - 1) * 0x20 + 0x10);
            do {
              if (*(int *)((long)pdVar24 + -4) != 0) {
                dVar15 = *pdVar24;
                *(double *)(puVar26 + -0x70) = dVar15;
                *(undefined4 *)(puVar26 + -0x68) = *(undefined4 *)(pdVar24 + 1);
                uVar16 = *(uint *)((long)pdVar24 + 0xc) & 0xf;
                *(uint *)(puVar26 + -100) = uVar16;
                if (((uVar16 == 3) && (dVar15 == (double)(int)dVar15)) &&
                   (uVar16 = (int)dVar15 - 1, uVar16 < *(uint *)(lVar13 + 8))) {
                  pdVar12 = (double *)(*(long *)(lVar13 + 0x18) + (long)(int)uVar16 * 0x10);
                }
                else {
                  pdVar12 = (double *)func_0x006fbc58(uVar9,lVar13,puVar26 + -0x70);
                }
                dVar15 = pdVar24[-2];
                pdVar12[1] = pdVar24[-1];
                *pdVar12 = dVar15;
              }
              iVar8 = iVar8 + -1;
              pdVar24 = pdVar24 + -4;
            } while (1 < iVar8);
          }
          lVar25 = __dyld_get_image_header(0);
          if (in_stack_000000b8 != lVar25 + 0x4e8dec0) {
            func_0x006f3a2c(uVar9,in_stack_000000b8,
                            -(ulong)(uVar2 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar2 << 5,
                            *(undefined1 *)(lVar13 + 2));
          }
          return;
        }
      }
    }
    else {
code_r0x006fb3e4:
      lVar13 = in_stack_000000c0;
      func_0x006eceb0(uVar9,"table overflow");
    }
    in_stack_000000d8 = &DAT_006fb3fc;
    auVar27 = func_0x006f36f4(uVar9);
    unaff_x22 = (undefined1 *)(ulong)*(uint *)(auVar27._8_8_ + 8);
    puVar26 = puVar26 + -0x70;
    puVar23 = puVar14;
    in_stack_000000c8 = uVar9;
    in_stack_000000c0 = lVar13;
  } while( true );
}

