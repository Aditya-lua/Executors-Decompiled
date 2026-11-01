
void FUN_0006e5d8(void)

{
  code *pcVar1;
  bool bVar2;
  int iVar3;
  long *plVar4;
  undefined1 *puVar5;
  ulong uVar6;
  undefined1 *puVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined4 uVar10;
  long lVar11;
  long *unaff_x19;
  long unaff_x20;
  long *plVar12;
  long *unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined1 *puVar13;
  undefined8 unaff_x24;
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
  undefined1 uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  
  __ZdlPv(*(undefined8 *)(unaff_x23 + 0x20));
  if (unaff_x20 == 0) {
    plVar12 = (long *)unaff_x19[1];
    plVar4 = (long *)unaff_x21[3];
    if (plVar4 == (long *)0x0) {
      in_stack_00000080 = (long *)0x0;
    }
    else if (plVar4 == unaff_x21) {
      in_stack_00000080 = &lStack0000000000000068;
      (**(code **)(*unaff_x21 + 0x18))();
    }
    else {
      in_stack_00000080 = (long *)(**(code **)(*plVar4 + 0x10))();
    }
    puVar5 = (undefined1 *)(**(code **)(*plVar12 + 0x28))(plVar12,&uStack00000000000000a8,0x4000);
    bVar2 = puVar5 == (undefined1 *)0x0;
    if (0 < (long)puVar5) {
      bVar2 = false;
      puVar13 = (undefined1 *)0x0;
      do {
        uStack0000000000000008 = (undefined1 *)0x0;
        uStack0000000000000010 = puVar13;
        uStack0000000000000018 = puVar5;
        uStack0000000000000020 = &uStack00000000000000a8;
        if (in_stack_00000080 == (long *)0x0) {
          func_0x00056004();
          goto code_r0x0006e9e4;
        }
        uVar6 = (**(code **)(*in_stack_00000080 + 0x30))
                          (in_stack_00000080,&uStack0000000000000020,&uStack0000000000000018,
                           &uStack0000000000000010,&uStack0000000000000008);
        if ((uVar6 & 1) == 0) break;
        puVar7 = (undefined1 *)
                 (**(code **)(*plVar12 + 0x28))(plVar12,&uStack00000000000000a8,0x4000);
        puVar13 = puVar13 + (long)puVar5;
        bVar2 = puVar7 == (undefined1 *)0x0;
        puVar5 = puVar7;
      } while (0 < (long)puVar7);
    }
    if (in_stack_00000080 == &lStack0000000000000068) {
      (**(code **)(lStack0000000000000068 + 0x20))();
    }
    else if (in_stack_00000080 != (long *)0x0) {
      (**(code **)(*in_stack_00000080 + 0x28))();
    }
    if (!bVar2) goto LAB_0006e808;
LAB_0006e7e8:
    uVar8 = 1;
    goto LAB_0006e818;
  }
  uStack0000000000000000._7_1_ = '\0';
  lVar11 = *unaff_x19;
  in_stack_000000b8._7_1_ = '\x0e';
  *(undefined8 *)(unaff_x23 + 0x20) = unaff_x22;
  *(undefined8 *)(unaff_x23 + 0x26) = unaff_x24;
  in_stack_000000b0._6_1_ = 0;
  puVar5 = (undefined1 *)
           func_0x00069608(lVar11 + 0x48,&uStack00000000000000a8,0xffffffffffffffff,0,
                           (long)&uStack0000000000000000 + 7);
  if (in_stack_000000b8._7_1_ < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x23 + 0x20));
    if (uStack0000000000000000._7_1_ == '\0') goto code_r0x0006e694;
LAB_0006e808:
    uVar10 = 400;
  }
  else {
    if (uStack0000000000000000._7_1_ != '\0') goto LAB_0006e808;
code_r0x0006e694:
    if (puVar5 <= *(undefined1 **)unaff_x19[2]) {
      if (puVar5 == (undefined1 *)0x0) goto LAB_0006e7e8;
      plVar12 = (long *)unaff_x19[1];
      plVar4 = (long *)unaff_x19[3] + 3;
      in_stack_00000060 = (long *)*plVar4;
      if (in_stack_00000060 == (long *)0x0) {
        in_stack_00000060 = (long *)0x0;
      }
      else if (in_stack_00000060 == (long *)unaff_x19[3]) {
        in_stack_00000060 = &lStack0000000000000048;
        (**(code **)(*(long *)*plVar4 + 0x18))((long *)*plVar4,&lStack0000000000000048);
      }
      else {
        *plVar4 = 0;
      }
      plVar9 = (long *)unaff_x21[3];
      plVar4 = (long *)0x0;
      if (plVar9 == (long *)0x0) {
code_r0x0006e894:
        in_stack_00000040 = plVar4;
      }
      else {
        if (plVar9 != unaff_x21) {
          plVar4 = (long *)(**(code **)(*plVar9 + 0x10))();
          goto code_r0x0006e894;
        }
        in_stack_00000040 = &lStack0000000000000028;
        (**(code **)(*unaff_x21 + 0x18))();
      }
      puVar13 = (undefined1 *)0x0;
      do {
        uVar6 = (long)puVar5 - (long)puVar13;
        if (0x3fff < uVar6) {
          uVar6 = 0x4000;
        }
        puVar7 = (undefined1 *)(**(code **)(*plVar12 + 0x28))(plVar12,&uStack00000000000000a8,uVar6)
        ;
        if ((long)puVar7 < 1) {
code_r0x0006e954:
          bVar2 = false;
          if (in_stack_00000040 != &lStack0000000000000028) goto code_r0x0006e968;
          goto code_r0x0006e988;
        }
        uStack0000000000000008 = puVar5;
        uStack0000000000000010 = puVar13;
        uStack0000000000000018 = puVar7;
        uStack0000000000000020 = &uStack00000000000000a8;
        if (in_stack_00000040 == (long *)0x0) goto code_r0x0006e9e0;
        iVar3 = (**(code **)(*in_stack_00000040 + 0x30))
                          (in_stack_00000040,&uStack0000000000000020,&uStack0000000000000018,
                           &uStack0000000000000010,&uStack0000000000000008);
        if ((iVar3 == 0) ||
           ((puVar13 = puVar7 + (long)puVar13, in_stack_00000060 != (long *)0x0 &&
            (uStack0000000000000018 = puVar5, uStack0000000000000020 = puVar13,
            iVar3 = (**(code **)(*in_stack_00000060 + 0x30))
                              (in_stack_00000060,&uStack0000000000000020,&uStack0000000000000018),
            iVar3 == 0)))) goto code_r0x0006e954;
      } while (puVar13 < puVar5);
      bVar2 = true;
      if (in_stack_00000040 == &lStack0000000000000028) {
code_r0x0006e988:
        lVar11 = 4;
        plVar4 = &lStack0000000000000028;
code_r0x0006e990:
        (**(code **)(*plVar4 + lVar11 * 8))();
      }
      else {
code_r0x0006e968:
        if (in_stack_00000040 != (long *)0x0) {
          lVar11 = 5;
          plVar4 = in_stack_00000040;
          goto code_r0x0006e990;
        }
      }
      if (in_stack_00000060 == &lStack0000000000000048) {
        lVar11 = 4;
        plVar4 = &lStack0000000000000048;
code_r0x0006e9c0:
        (**(code **)(*plVar4 + lVar11 * 8))();
      }
      else if (in_stack_00000060 != (long *)0x0) {
        lVar11 = 5;
        plVar4 = in_stack_00000060;
        goto code_r0x0006e9c0;
      }
      if (bVar2) goto LAB_0006e7e8;
      goto LAB_0006e808;
    }
    puVar13 = (undefined1 *)0x0;
    plVar4 = (long *)unaff_x19[1];
    do {
      uVar6 = (long)puVar5 - (long)puVar13;
      if (puVar5 < puVar13 || uVar6 == 0) break;
      if (0x3fff < uVar6) {
        uVar6 = 0x4000;
      }
      lVar11 = (**(code **)(*plVar4 + 0x28))(plVar4,&uStack00000000000000a8,uVar6);
      puVar13 = puVar13 + lVar11;
    } while (0 < lVar11);
    uVar10 = 0x19d;
  }
  uVar8 = 0;
  *(undefined4 *)unaff_x19[4] = uVar10;
LAB_0006e818:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  ___stack_chk_fail(uVar8);
code_r0x0006e9e0:
  func_0x00056004();
code_r0x0006e9e4:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x6e9e8);
  (*pcVar1)();
}

