
/* WARNING: Type propagation algorithm not settling */

void FUN_0006e50c(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  code *pcVar3;
  byte bVar4;
  int iVar5;
  long *plVar6;
  undefined8 uVar7;
  undefined1 *puVar8;
  long *plVar9;
  undefined1 *puVar10;
  undefined4 uVar11;
  long lVar12;
  ulong uVar13;
  long *unaff_x19;
  bool bVar14;
  long *unaff_x21;
  undefined1 *puVar15;
  long *plVar16;
  long unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  long *in_stack_00000040;
  long lStack0000000000000048;
  long *in_stack_00000060;
  long lStack0000000000000068;
  long *in_stack_00000080;
  long lStack0000000000000088;
  undefined1 uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  
  iVar5 = func_0x000692e4(param_1 + 0x48);
  if (iVar5 == 0) {
    lVar12 = *unaff_x19;
    in_stack_000000b8._7_1_ = '\x0e';
    uVar7 = CONCAT26(s_Content_Length_008d1a55._6_2_,s_Content_Length_008d1a55._0_6_);
    *(undefined8 *)(unaff_x23 + 0x20) = uVar7;
    uVar2 = CONCAT62(s_Content_Length_008d1a55._8_6_,s_Content_Length_008d1a55._6_2_);
    *(undefined8 *)(unaff_x23 + 0x26) = uVar2;
    in_stack_000000b0._6_1_ = 0;
    lVar12 = func_0x00063e9c(lVar12 + 0x48,&uStack00000000000000a8);
    if (in_stack_000000b8._7_1_ < '\0') {
      __ZdlPv(*(undefined8 *)(unaff_x23 + 0x20));
    }
    if (lVar12 == 0) {
      plVar16 = (long *)unaff_x19[1];
      plVar6 = (long *)unaff_x21[3];
      if (plVar6 == (long *)0x0) {
        in_stack_00000080 = (long *)0x0;
      }
      else if (plVar6 == unaff_x21) {
        in_stack_00000080 = &lStack0000000000000068;
        (**(code **)(*unaff_x21 + 0x18))();
      }
      else {
        in_stack_00000080 = (long *)(**(code **)(*plVar6 + 0x10))();
      }
      puVar8 = (undefined1 *)(**(code **)(*plVar16 + 0x28))(plVar16,&uStack00000000000000a8,0x4000);
      bVar4 = puVar8 == (undefined1 *)0x0;
      if (0 < (long)puVar8) {
        bVar4 = false;
        puVar15 = (undefined1 *)0x0;
        do {
          uStack0000000000000008 = (undefined1 *)0x0;
          uStack0000000000000010 = puVar15;
          uStack0000000000000018 = puVar8;
          uStack0000000000000020 = &uStack00000000000000a8;
          if (in_stack_00000080 == (long *)0x0) {
            func_0x00056004();
            goto code_r0x0006e9e4;
          }
          uVar13 = (**(code **)(*in_stack_00000080 + 0x30))
                             (in_stack_00000080,&uStack0000000000000020,&uStack0000000000000018,
                              &uStack0000000000000010,&uStack0000000000000008);
          if ((uVar13 & 1) == 0) break;
          puVar10 = (undefined1 *)
                    (**(code **)(*plVar16 + 0x28))(plVar16,&uStack00000000000000a8,0x4000);
          puVar15 = puVar15 + (long)puVar8;
          bVar4 = puVar10 == (undefined1 *)0x0;
          puVar8 = puVar10;
        } while (0 < (long)puVar10);
      }
      plVar6 = in_stack_00000080;
      if (in_stack_00000080 != &lStack0000000000000068) goto joined_r0x0006e7e0;
      (**(code **)(lStack0000000000000068 + 0x20))();
      goto joined_r0x0006e67c;
    }
    uStack0000000000000000._7_1_ = '\0';
    lVar12 = *unaff_x19;
    in_stack_000000b8._7_1_ = '\x0e';
    *(undefined8 *)(unaff_x23 + 0x20) = uVar7;
    *(undefined8 *)(unaff_x23 + 0x26) = uVar2;
    in_stack_000000b0._6_1_ = 0;
    puVar8 = (undefined1 *)
             func_0x00069608(lVar12 + 0x48,&uStack00000000000000a8,0xffffffffffffffff,0,
                             (long)&uStack0000000000000000 + 7);
    if (in_stack_000000b8._7_1_ < '\0') {
      __ZdlPv(*(undefined8 *)(unaff_x23 + 0x20));
      if (uStack0000000000000000._7_1_ == '\0') goto code_r0x0006e694;
      goto LAB_0006e808;
    }
    if (uStack0000000000000000._7_1_ != '\0') goto LAB_0006e808;
code_r0x0006e694:
    if (puVar8 <= *(undefined1 **)unaff_x19[2]) {
      if (puVar8 != (undefined1 *)0x0) {
        plVar16 = (long *)unaff_x19[1];
        plVar6 = (long *)unaff_x19[3] + 3;
        in_stack_00000060 = (long *)*plVar6;
        if (in_stack_00000060 == (long *)0x0) {
          in_stack_00000060 = (long *)0x0;
        }
        else if (in_stack_00000060 == (long *)unaff_x19[3]) {
          in_stack_00000060 = &lStack0000000000000048;
          (**(code **)(*(long *)*plVar6 + 0x18))((long *)*plVar6,&lStack0000000000000048);
        }
        else {
          *plVar6 = 0;
        }
        plVar9 = (long *)unaff_x21[3];
        plVar6 = (long *)0x0;
        if (plVar9 == (long *)0x0) {
code_r0x0006e894:
          in_stack_00000040 = plVar6;
        }
        else {
          if (plVar9 != unaff_x21) {
            plVar6 = (long *)(**(code **)(*plVar9 + 0x10))();
            goto code_r0x0006e894;
          }
          in_stack_00000040 = &lStack0000000000000028;
          (**(code **)(*unaff_x21 + 0x18))();
        }
        puVar15 = (undefined1 *)0x0;
        do {
          uVar13 = (long)puVar8 - (long)puVar15;
          if (0x3fff < uVar13) {
            uVar13 = 0x4000;
          }
          puVar10 = (undefined1 *)
                    (**(code **)(*plVar16 + 0x28))(plVar16,&uStack00000000000000a8,uVar13);
          if ((long)puVar10 < 1) {
code_r0x0006e954:
            bVar14 = false;
            if (in_stack_00000040 != &lStack0000000000000028) goto code_r0x0006e968;
            goto code_r0x0006e988;
          }
          uStack0000000000000008 = puVar8;
          uStack0000000000000010 = puVar15;
          uStack0000000000000018 = puVar10;
          uStack0000000000000020 = &uStack00000000000000a8;
          if (in_stack_00000040 == (long *)0x0) goto code_r0x0006e9e0;
          iVar5 = (**(code **)(*in_stack_00000040 + 0x30))
                            (in_stack_00000040,&uStack0000000000000020,&uStack0000000000000018,
                             &uStack0000000000000010,&uStack0000000000000008);
          if ((iVar5 == 0) ||
             ((puVar15 = puVar10 + (long)puVar15, in_stack_00000060 != (long *)0x0 &&
              (uStack0000000000000018 = puVar8, uStack0000000000000020 = puVar15,
              iVar5 = (**(code **)(*in_stack_00000060 + 0x30))
                                (in_stack_00000060,&uStack0000000000000020,&uStack0000000000000018),
              iVar5 == 0)))) goto code_r0x0006e954;
        } while (puVar15 < puVar8);
        bVar14 = true;
        if (in_stack_00000040 == &lStack0000000000000028) {
code_r0x0006e988:
          lVar12 = 4;
          plVar6 = &lStack0000000000000028;
code_r0x0006e990:
          (**(code **)(*plVar6 + lVar12 * 8))();
        }
        else {
code_r0x0006e968:
          if (in_stack_00000040 != (long *)0x0) {
            lVar12 = 5;
            plVar6 = in_stack_00000040;
            goto code_r0x0006e990;
          }
        }
        if (in_stack_00000060 == &lStack0000000000000048) {
          lVar12 = 4;
          plVar6 = &lStack0000000000000048;
code_r0x0006e9c0:
          (**(code **)(*plVar6 + lVar12 * 8))();
        }
        else if (in_stack_00000060 != (long *)0x0) {
          lVar12 = 5;
          plVar6 = in_stack_00000060;
          goto code_r0x0006e9c0;
        }
        if (!bVar14) goto LAB_0006e808;
      }
      goto LAB_0006e7e8;
    }
    puVar15 = (undefined1 *)0x0;
    plVar6 = (long *)unaff_x19[1];
    do {
      uVar13 = (long)puVar8 - (long)puVar15;
      if (puVar8 < puVar15 || uVar13 == 0) break;
      if (0x3fff < uVar13) {
        uVar13 = 0x4000;
      }
      lVar12 = (**(code **)(*plVar6 + 0x28))(plVar6,&uStack00000000000000a8,uVar13);
      puVar15 = puVar15 + lVar12;
    } while (0 < lVar12);
    uVar11 = 0x19d;
  }
  else {
    lVar12 = *unaff_x19;
    lVar1 = unaff_x19[1];
    plVar6 = (long *)unaff_x21[3];
    if (plVar6 == (long *)0x0) {
      *(undefined8 *)(unaff_x23 + 0x18) = 0;
    }
    else if (plVar6 == unaff_x21) {
      *(long **)(unaff_x23 + 0x18) = &lStack0000000000000088;
      (**(code **)(*unaff_x21 + 0x18))();
    }
    else {
      uVar7 = (**(code **)(*plVar6 + 0x10))();
      *(undefined8 *)(unaff_x23 + 0x18) = uVar7;
    }
    bVar4 = func_0x0006eb0c(lVar1,lVar12,&lStack0000000000000088);
    plVar6 = *(long **)(unaff_x23 + 0x18);
    if (*(long **)(unaff_x23 + 0x18) == &lStack0000000000000088) {
      (**(code **)(lStack0000000000000088 + 0x20))();
    }
    else {
joined_r0x0006e7e0:
      if (plVar6 != (long *)0x0) {
        (**(code **)(*plVar6 + 0x28))();
      }
    }
    bVar4 = bVar4 & 1;
joined_r0x0006e67c:
    if ((bool)bVar4 != false) {
LAB_0006e7e8:
      uVar7 = 1;
      goto LAB_0006e818;
    }
LAB_0006e808:
    uVar11 = 400;
  }
  uVar7 = 0;
  *(undefined4 *)unaff_x19[4] = uVar11;
LAB_0006e818:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  ___stack_chk_fail(uVar7);
code_r0x0006e9e0:
  func_0x00056004();
code_r0x0006e9e4:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x6e9e8);
  (*pcVar3)();
}

