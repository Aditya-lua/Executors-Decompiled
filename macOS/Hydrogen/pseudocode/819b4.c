
undefined8 FUN_000819b4(ulong param_1)

{
  undefined1 uVar1;
  byte bVar2;
  long *plVar3;
  code *pcVar4;
  bool bVar5;
  long lVar6;
  undefined8 uVar7;
  long *plVar8;
  char *pcVar9;
  undefined8 *puVar10;
  undefined8 extraout_x1;
  ulong uVar11;
  ulong uVar12;
  undefined1 *puVar13;
  long lVar14;
  long in_x9;
  long lVar15;
  undefined8 *puVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  long unaff_x19;
  ulong unaff_x20;
  ulong *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *puVar22;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined1 auVar29 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined1 auStack_110 [8];
  undefined8 uStack_108;
  ulong uStack_100;
  undefined8 *puStack_f8;
  undefined1 uStack_e9;
  undefined8 *puStack_e8;
  undefined8 *puStack_e0;
  byte *pbStack_b0;
  long *plStack_a8;
  long lStack_a0;
  long lStack_98;
  char *pcStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  byte *pbStack_70;
  long *plStack_68;
  long lStack_60;
  long lStack_58;
  undefined1 auStack_50 [8];
  undefined8 uStack_48;
  undefined8 *puStack_40;
  undefined8 uStack_38;
  undefined8 *puStack_30;
  
  if (param_1 == in_x9 * 0x40) {
    if (-1 < (long)(param_1 + 1)) {
      uVar11 = (param_1 & 0xffffffffffffffc0) + 0x40;
      uVar19 = in_x9 * 0x80;
      if ((ulong)(in_x9 * 0x80) <= uVar11) {
        uVar19 = uVar11;
      }
      uVar11 = 0x7fffffffffffffff;
      if (param_1 < 0x3fffffffffffffff) {
        uVar11 = uVar19;
      }
      func_0x0008184c(unaff_x19 + 0x20,uVar11);
      param_1 = *(ulong *)(unaff_x19 + 0x28);
      goto LAB_000819f4;
    }
    func_0x00017f90(unaff_x19 + 0x20);
LAB_00081c48:
    func_0x00017f90();
LAB_00081c50:
    uVar7 = func_0x00017514();
    if (in_stack_00000028._7_1_ < '\0') {
      __ZdlPv(CONCAT71(uStack0000000000000018._1_7_,(undefined1)uStack0000000000000018));
    }
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
      if ((unaff_x20 & 1) != 0) {
code_r0x00081ca4:
        ___cxa_free_exception();
      }
    }
    else if ((int)unaff_x20 != 0) goto code_r0x00081ca4;
    lVar15 = __Unwind_Resume(uVar7);
    puStack_40 = unaff_x24;
    uStack_38 = unaff_x23;
    puStack_30 = unaff_x22;
    if (*(long *)(*(long *)(lVar15 + 0x10) + -8) != 0) {
      pbStack_70 = (byte *)CONCAT44(pbStack_70._4_4_,
                                    (int)((ulong)(*(long *)(lVar15 + 0x10) - *(long *)(lVar15 + 8))
                                         >> 3) + -1);
      pcStack_90 = (char *)CONCAT71(pcStack_90._1_7_,1);
      plVar8 = *(long **)(lVar15 + 0x78);
      if (plVar8 == (long *)0x0) {
        func_0x00056004();
        auVar29 = func_0x0001753c();
        puVar16 = auVar29._8_8_;
        lVar15 = auVar29._0_8_;
        puStack_f8 = (undefined8 *)0x0;
        uStack_100 = 3;
        puStack_e0 = unaff_x22;
        puVar10 = (undefined8 *)__Znwm(0x18);
        if (*(char *)((long)puVar16 + 0x17) < '\0') {
          func_0x00017634(puVar10,*puVar16,puVar16[1]);
        }
        else {
          uVar7 = *puVar16;
          puVar10[1] = puVar16[1];
          *puVar10 = uVar7;
          puVar10[2] = puVar16[2];
        }
        puStack_e8 = (undefined8 *)
                     CONCAT44(puStack_e8._4_4_,
                              (int)((ulong)(*(long *)(lVar15 + 0x10) - *(long *)(lVar15 + 8)) >> 3))
        ;
        uStack_e9 = 4;
        plVar8 = *(long **)(lVar15 + 0x78);
        puStack_f8 = puVar10;
        if (plVar8 == (long *)0x0) {
          func_0x00056004();
code_r0x00082108:
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x8210c);
          (*pcVar4)();
        }
        uVar19 = (**(code **)(*plVar8 + 0x30))(plVar8,&puStack_e8,&uStack_e9,&uStack_100);
        uVar11 = *(ulong *)(lVar15 + 0x40);
        if (uVar11 == *(long *)(lVar15 + 0x48) * 0x40) {
          if ((long)(uVar11 + 1) < 0) {
            func_0x00017f90(lVar15 + 0x38);
            goto code_r0x00082108;
          }
          uVar17 = *(long *)(lVar15 + 0x48) * 0x80;
          uVar12 = (uVar11 & 0xffffffffffffffc0) + 0x40;
          if (uVar17 <= uVar12) {
            uVar17 = uVar12;
          }
          uVar12 = 0x7fffffffffffffff;
          if (uVar11 < 0x3fffffffffffffff) {
            uVar12 = uVar17;
          }
          func_0x0008184c(lVar15 + 0x38,uVar12);
          uVar11 = *(ulong *)(lVar15 + 0x40);
        }
        *(ulong *)(lVar15 + 0x40) = uVar11 + 1;
        lVar18 = *(long *)(lVar15 + 0x38);
        uVar12 = 1L << (uVar11 & 0x3f);
        lVar14 = (uVar11 >> 6) * 8;
        if ((uVar19 & 1) == 0) {
          *(ulong *)(lVar18 + lVar14) = *(ulong *)(lVar18 + lVar14) & (uVar12 ^ 0xffffffffffffffff);
        }
        else {
          *(ulong *)(lVar18 + lVar14) = *(ulong *)(lVar18 + lVar14) | uVar12;
          if (*(long *)(*(long *)(lVar15 + 0x10) + -8) != 0) {
            func_0x000796dc(auStack_110,lVar15 + 0x88);
            puStack_e8 = puVar16;
            lVar18 = func_0x00083a6c(*(undefined8 *)(*(long *)(*(long *)(lVar15 + 0x10) + -8) + 8),
                                     puVar16,&UNK_0080364f,&puStack_e8,&uStack_e9);
            puVar13 = (undefined1 *)(lVar18 + 0x38);
            uVar1 = *puVar13;
            *puVar13 = auStack_110[0];
            uVar7 = *(undefined8 *)(lVar18 + 0x40);
            *(undefined8 *)(lVar18 + 0x40) = uStack_108;
            *(undefined1 **)(lVar15 + 0x50) = puVar13;
            auStack_110[0] = uVar1;
            uStack_108 = uVar7;
            func_0x00078220(&uStack_108);
          }
        }
        func_0x00078220(&puStack_f8,uStack_100 & 0xff);
        return 1;
      }
      uVar11 = (**(code **)(*plVar8 + 0x30))(plVar8,&pbStack_70,&pcStack_90);
      if ((uVar11 & 1) == 0) {
        func_0x000796dc(auStack_50,lVar15 + 0x88);
        puVar13 = *(undefined1 **)(*(long *)(lVar15 + 0x10) + -8);
        uVar1 = *puVar13;
        *puVar13 = auStack_50[0];
        uVar7 = *(undefined8 *)(puVar13 + 8);
        *(undefined8 *)(puVar13 + 8) = uStack_48;
        auStack_50[0] = uVar1;
        uStack_48 = uVar7;
        func_0x00078220(&uStack_48);
      }
    }
    lVar18 = *(long *)(lVar15 + 0x10);
    lVar14 = lVar18 + -8;
    *(long *)(lVar15 + 0x10) = lVar14;
    *(long *)(lVar15 + 0x28) = *(long *)(lVar15 + 0x28) + -1;
    if ((*(long *)(lVar15 + 8) != lVar14) &&
       (pbStack_70 = *(byte **)(lVar18 + -0x10), pbStack_70 != (byte *)0x0)) {
      bVar2 = *pbStack_70;
      if (bVar2 - 1 < 2) {
        plStack_68 = (long *)0x0;
        lStack_60 = 0;
        lStack_58 = -0x8000000000000000;
        if (bVar2 == 2) {
          lStack_60 = **(long **)(pbStack_70 + 8);
        }
        else if (bVar2 == 1) {
          plStack_68 = (long *)**(long **)(pbStack_70 + 8);
        }
        else {
          lStack_58 = 0;
        }
        while( true ) {
          pcStack_90 = *(char **)(lVar14 + -8);
          lStack_88 = 0;
          uStack_80 = 0;
          uStack_78 = 0x8000000000000000;
          if (*pcStack_90 == '\x02') {
            uStack_80 = *(undefined8 *)(*(long *)(pcStack_90 + 8) + 8);
            uVar11 = func_0x000833fc(&pbStack_70,&pcStack_90);
          }
          else if (*pcStack_90 == '\x01') {
            lStack_88 = *(long *)(pcStack_90 + 8) + 8;
            uVar11 = func_0x000833fc(&pbStack_70,&pcStack_90);
          }
          else {
            uStack_78 = 1;
            uVar11 = func_0x000833fc(&pbStack_70,&pcStack_90);
          }
          if ((uVar11 & 1) != 0) {
            return 1;
          }
          pcVar9 = (char *)func_0x00082fd4(&pbStack_70);
          if (*pcVar9 == '\t') break;
          if (*pbStack_70 == 2) {
            lStack_60 = lStack_60 + 0x10;
            lVar14 = *(long *)(lVar15 + 0x10);
          }
          else if (*pbStack_70 == 1) {
            plVar8 = plStack_68;
            plVar3 = (long *)plStack_68[1];
            if ((long *)plStack_68[1] == (long *)0x0) {
              do {
                plStack_68 = (long *)plVar8[2];
                bVar5 = (long *)*plStack_68 != plVar8;
                plVar8 = plStack_68;
              } while (bVar5);
            }
            else {
              do {
                plStack_68 = plVar3;
                plVar3 = (long *)*plStack_68;
              } while ((long *)*plStack_68 != (long *)0x0);
            }
            lVar14 = *(long *)(lVar15 + 0x10);
          }
          else {
            lStack_58 = lStack_58 + 1;
            lVar14 = *(long *)(lVar15 + 0x10);
          }
        }
        pbStack_b0 = pbStack_70;
        lStack_a0 = lStack_60;
        plStack_a8 = plStack_68;
        lStack_98 = lStack_58;
        func_0x000830d4(&pcStack_90,*(undefined8 *)(*(long *)(lVar15 + 0x10) + -8),&pbStack_b0);
      }
    }
    return 1;
  }
LAB_000819f4:
  *(ulong *)(unaff_x19 + 0x28) = param_1 + 1;
  lVar15 = *(long *)(unaff_x19 + 0x20);
  uVar19 = param_1 >> 6;
  uVar11 = 1L << (param_1 & 0x3f);
  if ((int)unaff_x22 == 0) {
    uVar11 = *(ulong *)(lVar15 + uVar19 * 8) & (uVar11 ^ 0xffffffffffffffff);
  }
  else {
    uVar11 = *(ulong *)(lVar15 + uVar19 * 8) | uVar11;
  }
  *(ulong *)(lVar15 + uVar19 * 8) = uVar11;
  uStack0000000000000018._0_1_ = 1;
  func_0x0008295c();
  unaff_x22 = *(undefined8 **)(unaff_x19 + 0x10);
  if (unaff_x22 < *(undefined8 **)(unaff_x19 + 0x18)) {
    puVar10 = unaff_x22 + 1;
    *unaff_x22 = extraout_x1;
    goto LAB_00081b78;
  }
  unaff_x24 = (undefined8 *)*unaff_x21;
  lVar15 = (long)unaff_x22 - (long)unaff_x24 >> 3;
  uVar11 = lVar15 + 1;
  unaff_x23 = extraout_x1;
  if (uVar11 >> 0x3d != 0) goto LAB_00081c48;
  uVar12 = (long)*(undefined8 **)(unaff_x19 + 0x18) - (long)unaff_x24;
  uVar19 = (long)uVar12 >> 2;
  if (uVar19 <= uVar11) {
    uVar19 = uVar11;
  }
  if (0x7ffffffffffffff7 < uVar12) {
    uVar19 = 0x1fffffffffffffff;
  }
  if (uVar19 == 0) {
    lVar6 = 0;
    puVar16 = (undefined8 *)(lVar15 * 8);
    lVar18 = 0;
    puVar10 = puVar16 + 1;
    *puVar16 = extraout_x1;
    lVar14 = (long)unaff_x22 - (long)unaff_x24;
    if (lVar14 == 0) goto LAB_00081b64;
LAB_00081ae0:
    puVar22 = unaff_x22;
    if ((lVar14 - 8U < 0x58) ||
       ((ulong)((long)unaff_x22 + (-((long)unaff_x22 - (long)unaff_x24) - lVar6)) < 0x40)) {
LAB_00081b50:
      do {
        puVar22 = puVar22 + -1;
        puVar16 = puVar16 + -1;
        *puVar16 = *puVar22;
      } while (puVar22 != unaff_x24);
    }
    else {
      uVar11 = (lVar14 - 8U >> 3) + 1;
      uVar12 = uVar11 & 0x3ffffffffffffff8;
      puVar22 = unaff_x22 + -uVar12;
      puVar16 = puVar16 + -uVar12;
      puVar20 = unaff_x22 + -4;
      puVar21 = (undefined8 *)(lVar6 + lVar15 * 8 + -0x20);
      uVar19 = uVar12;
      do {
        uVar24 = *puVar20;
        uVar23 = puVar20[3];
        uVar7 = puVar20[2];
        uVar28 = puVar20[-3];
        uVar27 = puVar20[-4];
        uVar26 = puVar20[-1];
        uVar25 = puVar20[-2];
        puVar21[1] = puVar20[1];
        *puVar21 = uVar24;
        puVar21[3] = uVar23;
        puVar21[2] = uVar7;
        puVar21[-3] = uVar28;
        puVar21[-4] = uVar27;
        puVar21[-1] = uVar26;
        puVar21[-2] = uVar25;
        puVar20 = puVar20 + -8;
        puVar21 = puVar21 + -8;
        uVar19 = uVar19 - 8;
      } while (uVar19 != 0);
      if (uVar11 != uVar12) goto LAB_00081b50;
    }
    unaff_x22 = (undefined8 *)*unaff_x21;
  }
  else {
    if (uVar19 >> 0x3d != 0) goto LAB_00081c50;
    lVar6 = __Znwm(uVar19 << 3);
    puVar16 = (undefined8 *)(lVar6 + lVar15 * 8);
    lVar18 = lVar6 + uVar19 * 8;
    puVar10 = puVar16 + 1;
    *puVar16 = extraout_x1;
    lVar14 = (long)unaff_x22 - (long)unaff_x24;
    if (lVar14 != 0) goto LAB_00081ae0;
  }
LAB_00081b64:
  *(undefined8 **)(unaff_x19 + 8) = puVar16;
  *(undefined8 **)(unaff_x19 + 0x10) = puVar10;
  *(long *)(unaff_x19 + 0x18) = lVar18;
  if (unaff_x22 != (undefined8 *)0x0) {
    __ZdlPv(unaff_x22);
  }
LAB_00081b78:
  *(undefined8 **)(unaff_x19 + 0x10) = puVar10;
  if ((unaff_x20 != 0xffffffffffffffff) && ((char *)puVar10[-1] != (char *)0x0)) {
    uVar11 = (ulong)*(char *)puVar10[-1];
    if (uVar11 < 3) {
      uVar11 = *(ulong *)(&UNK_0080ba98 + uVar11 * 8);
    }
    else {
      uVar11 = 1;
    }
    if (uVar11 < unaff_x20) {
      uVar7 = ___cxa_allocate_exception(0x20);
      __ZNSt3__19to_stringEm();
      func_0x00082ddc(&uStack0000000000000018,"excessive object size: ");
      func_0x00082c0c(uVar7,0x198,&uStack0000000000000018,
                      *(undefined8 *)(*(long *)(unaff_x19 + 0x10) + -8));
      ___cxa_throw(uVar7,&UNK_009b9520,&DAT_0008292c);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x81c40);
      (*pcVar4)();
    }
  }
  return 1;
}

