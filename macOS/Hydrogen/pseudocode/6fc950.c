
void FUN_006fc950(void)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined1 *puVar6;
  bool bVar7;
  int iVar8;
  int iVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  double *pdVar13;
  long lVar14;
  undefined1 *puVar15;
  double dVar16;
  uint uVar17;
  long lVar18;
  undefined4 *puVar19;
  ulong uVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  long unaff_x19;
  undefined8 unaff_x20;
  double *unaff_x21;
  undefined1 *unaff_x22;
  undefined1 *unaff_x23;
  int unaff_w24;
  double *pdVar24;
  long unaff_x25;
  int unaff_w26;
  long lVar25;
  int unaff_w27;
  long unaff_x29;
  undefined1 auVar26 [16];
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
  
  auVar26._8_8_ = unaff_x19;
  auVar26._0_8_ = unaff_x20;
  while( true ) {
    lVar14 = func_0x006fb65c();
    if (*(int *)(lVar14 + 0xc) == 0) break;
    do {
      unaff_w26 = unaff_w24;
      unaff_w24 = unaff_w26 + 1;
    } while (unaff_w27 == unaff_w26);
  }
  iVar9 = unaff_w26 - (int)unaff_x22;
  if (iVar9 == 0) goto LAB_006fca0c;
  uVar2 = iVar9 + unaff_w26;
  lVar25 = *(long *)(unaff_x19 + 0x20);
  lVar14 = __dyld_get_image_header(0);
  if (lVar25 == lVar14 + unaff_x25) {
    bVar7 = (int)uVar2 < *(int *)(unaff_x19 + 8);
    unaff_x23 = (undefined1 *)(ulong)(uint)((int)unaff_x23 - iVar9);
    if (unaff_x21 != (double *)0x0) goto LAB_006fc9a4;
LAB_006fc9d8:
    uVar17 = 0xffffffff;
  }
  else {
    bVar7 = true;
    unaff_x23 = (undefined1 *)(ulong)(uint)((int)unaff_x23 - iVar9);
    if (unaff_x21 == (double *)0x0) goto LAB_006fc9d8;
LAB_006fc9a4:
    if (*(int *)((long)unaff_x21 + 0xc) != 3) goto LAB_006fc9d8;
    uVar17 = (uint)*unaff_x21;
    if (*unaff_x21 != (double)(int)uVar17) {
      uVar17 = 0xffffffff;
    }
  }
  if (bVar7) {
    do {
      do {
        unaff_x22 = (undefined1 *)(ulong)uVar2;
        uVar1 = uVar2 + 1;
        bVar7 = uVar17 - 1 == uVar2;
        uVar2 = uVar1;
      } while (bVar7);
      lVar14 = func_0x006fb65c();
    } while (*(int *)(lVar14 + 0xc) != 0);
  }
  else {
    if (uVar2 + 1 != uVar17) {
      uVar17 = uVar2;
    }
    unaff_x22 = (undefined1 *)(ulong)uVar17;
  }
LAB_006fca0c:
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    if (((bRam0000000000a278d0 & 1) != 0) || (iVar9 = ___cxa_guard_acquire(0xa278d0), iVar9 == 0)) {
      return;
    }
    if (((bRam0000000000a28b60 & 1) == 0) && (iVar9 = ___cxa_guard_acquire(0xa28b60), iVar9 != 0)) {
      lRam0000000000a28b58 = __dyld_get_image_header(0);
      ___cxa_guard_release(0xa28b60);
    }
    lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
    return;
  }
  puVar6 = &uStack00000000000000e0;
  do {
    lVar14 = auVar26._8_8_;
    uVar10 = auVar26._0_8_;
    *(long *)(puVar6 + -0x60) = in_stack_00000080;
    *(ulong *)(puVar6 + -0x58) = in_stack_00000088;
    *(long *)(puVar6 + -0x50) = in_stack_00000090;
    *(long *)(puVar6 + -0x48) = in_stack_00000098;
    *(ulong *)(puVar6 + -0x40) = in_stack_000000a0;
    *(undefined1 **)(puVar6 + -0x38) = in_stack_000000a8;
    *(undefined1 **)(puVar6 + -0x30) = in_stack_000000b0;
    *(long *)(puVar6 + -0x28) = in_stack_000000b8;
    *(long *)(puVar6 + -0x20) = in_stack_000000c0;
    *(undefined8 *)(puVar6 + -0x18) = in_stack_000000c8;
    *(undefined1 **)(puVar6 + -0x10) = in_stack_000000d0;
    *(undefined **)(puVar6 + -8) = in_stack_000000d8;
    in_stack_000000d0 = puVar6 + -0x10;
    iVar9 = (int)unaff_x22;
    iVar8 = (int)unaff_x23;
    puVar15 = unaff_x22;
    if (iVar9 < 0x4000001 && iVar8 < 0x4000001) {
      iVar4 = *(int *)(lVar14 + 8);
      in_stack_00000090 = (long)iVar4;
      bVar3 = *(byte *)(lVar14 + 6);
      in_stack_000000a0 = (ulong)bVar3;
      in_stack_000000b8 = *(long *)(lVar14 + 0x20);
      in_stack_000000b0 = unaff_x22;
      in_stack_000000a8 = unaff_x23;
      if (iVar4 < iVar9) {
        if (-1 < iVar9) {
          puVar15 = (undefined1 *)(in_stack_00000090 << 4);
          lVar25 = func_0x006f3d14(uVar10,*(undefined8 *)(lVar14 + 0x18),puVar15,
                                   ((ulong)unaff_x22 & 0xffffffff) << 4,*(undefined1 *)(lVar14 + 2))
          ;
          *(long *)(lVar14 + 0x18) = lVar25;
          lVar22 = (long)*(int *)(lVar14 + 8);
          if (*(int *)(lVar14 + 8) < iVar9) {
            uVar20 = ((ulong)unaff_x22 & 0xffffffff) - lVar22;
            lVar18 = lVar22;
            if (3 < uVar20) {
              uVar21 = uVar20 & 0xfffffffffffffffc;
              lVar18 = uVar21 + lVar22;
              puVar19 = (undefined4 *)(lVar25 + lVar22 * 0x10 + 0x2c);
              uVar23 = uVar21;
              do {
                puVar19[-8] = 0;
                puVar19[-4] = 0;
                *puVar19 = 0;
                puVar19[4] = 0;
                puVar19 = puVar19 + 0x10;
                uVar23 = uVar23 - 4;
              } while (uVar23 != 0);
              if (uVar20 == uVar21) goto code_r0x006fb1c0;
            }
            lVar22 = ((ulong)unaff_x22 & 0xffffffff) - lVar18;
            puVar19 = (undefined4 *)(lVar25 + lVar18 * 0x10 + 0xc);
            do {
              *puVar19 = 0;
              lVar22 = lVar22 + -1;
              puVar19 = puVar19 + 4;
            } while (lVar22 != 0);
          }
code_r0x006fb1c0:
          *(int *)(lVar14 + 8) = iVar9;
          goto code_r0x006fb1c4;
        }
      }
      else {
code_r0x006fb1c4:
        in_stack_00000098 = 0x4e8dec0;
        if (iVar8 == 0) {
          lVar25 = __dyld_get_image_header(0);
          in_stack_00000088 = 0;
          *(long *)(lVar14 + 0x20) = lVar25 + 0x4e8dec0;
        }
        else {
          iVar8 = func_0x006f4b48(iVar8 + -1);
          in_stack_000000c0 = lVar14;
          if (0x19 < iVar8) goto code_r0x006fb3e4;
          unaff_x23 = (undefined1 *)(ulong)(iVar8 + 1U);
          in_stack_00000088 = (ulong)(uint)(1 << (ulong)(iVar8 + 1U & 0x1f));
          puVar15 = (undefined1 *)(ulong)*(byte *)(lVar14 + 2);
          uVar11 = func_0x006f3708(uVar10,in_stack_00000088 << 5);
          lVar25 = 0;
          *(undefined8 *)(lVar14 + 0x20) = uVar11;
          uVar20 = in_stack_00000088;
          do {
            lVar22 = *(long *)(lVar14 + 0x20) + lVar25;
            *(undefined4 *)(lVar22 + 0x1c) = 0;
            *(undefined4 *)(lVar22 + 0xc) = 0;
            lVar25 = lVar25 + 0x20;
            uVar20 = uVar20 - 1;
          } while (uVar20 != 0);
        }
        *(char *)(lVar14 + 6) = (char)unaff_x23;
        *(byte *)(lVar14 + 7) = ~(byte)(-1 << (ulong)((uint)unaff_x23 & 0x1f));
        *(int *)(lVar14 + 0xc) = (int)in_stack_00000088;
        if (iVar4 <= iVar9) goto code_r0x006fb2f0;
        *(int *)(lVar14 + 8) = iVar9;
        in_stack_000000a8 = (undefined1 *)((long)&MACH_HEADER.magic + 3);
        uVar20 = (long)iVar9;
        do {
          while( true ) {
            uVar23 = uVar20;
            in_stack_00000080 = *(long *)(lVar14 + 0x18);
            if (*(int *)(in_stack_00000080 + uVar23 * 0x10 + 0xc) == 0) break;
            in_stack_00000088 = uVar23 + 1;
            *(double *)(puVar6 + -0x70) = (double)(int)in_stack_00000088;
            *(undefined4 *)(puVar6 + -100) = 3;
            puVar15 = puVar6 + -0x70;
            puVar12 = (undefined8 *)func_0x006fbc58(uVar10,lVar14);
            puVar5 = (undefined8 *)(in_stack_00000080 + uVar23 * 0x10);
            uVar11 = *puVar5;
            puVar12[1] = puVar5[1];
            *puVar12 = uVar11;
            uVar20 = in_stack_00000088;
            if ((int)in_stack_00000088 == iVar4) goto code_r0x006fb2c8;
          }
          uVar20 = uVar23 + 1;
        } while ((int)(uVar23 + 1) != iVar4);
code_r0x006fb2c8:
        in_stack_00000098 = uVar23 + 1;
        if (-1 < iVar9) {
          uVar11 = func_0x006f3d14(uVar10,*(undefined8 *)(lVar14 + 0x18),in_stack_00000090 << 4,
                                   ((ulong)unaff_x22 & 0xffffffff) << 4,*(undefined1 *)(lVar14 + 2))
          ;
          *(undefined8 *)(lVar14 + 0x18) = uVar11;
code_r0x006fb2f0:
          uVar2 = 1 << (ulong)(bVar3 & 0x1f);
          if (bVar3 != 0x1f) {
            iVar9 = uVar2 + 1;
            pdVar24 = (double *)(in_stack_000000b8 + (ulong)(uVar2 - 1) * 0x20 + 0x10);
            do {
              if (*(int *)((long)pdVar24 + -4) != 0) {
                dVar16 = *pdVar24;
                *(double *)(puVar6 + -0x70) = dVar16;
                *(undefined4 *)(puVar6 + -0x68) = *(undefined4 *)(pdVar24 + 1);
                uVar17 = *(uint *)((long)pdVar24 + 0xc) & 0xf;
                *(uint *)(puVar6 + -100) = uVar17;
                if (((uVar17 == 3) && (dVar16 == (double)(int)dVar16)) &&
                   (uVar17 = (int)dVar16 - 1, uVar17 < *(uint *)(lVar14 + 8))) {
                  pdVar13 = (double *)(*(long *)(lVar14 + 0x18) + (long)(int)uVar17 * 0x10);
                }
                else {
                  pdVar13 = (double *)func_0x006fbc58(uVar10,lVar14,puVar6 + -0x70);
                }
                dVar16 = pdVar24[-2];
                pdVar13[1] = pdVar24[-1];
                *pdVar13 = dVar16;
              }
              iVar9 = iVar9 + -1;
              pdVar24 = pdVar24 + -4;
            } while (1 < iVar9);
          }
          lVar25 = __dyld_get_image_header(0);
          if (in_stack_000000b8 != lVar25 + 0x4e8dec0) {
            func_0x006f3a2c(uVar10,in_stack_000000b8,
                            -(ulong)(uVar2 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar2 << 5,
                            *(undefined1 *)(lVar14 + 2));
          }
          return;
        }
      }
    }
    else {
code_r0x006fb3e4:
      lVar14 = in_stack_000000c0;
      func_0x006eceb0(uVar10,"table overflow");
    }
    in_stack_000000d8 = &DAT_006fb3fc;
    auVar26 = func_0x006f36f4(uVar10);
    unaff_x22 = (undefined1 *)(ulong)*(uint *)(auVar26._8_8_ + 8);
    puVar6 = puVar6 + -0x70;
    unaff_x23 = puVar15;
    in_stack_000000c8 = uVar10;
    in_stack_000000c0 = lVar14;
  } while( true );
}

