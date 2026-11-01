
/* WARNING: Removing unreachable block (ram,0x000355f8) */

undefined8 FUN_0003548c(long param_1,undefined8 param_2,undefined1 param_3 [16])

{
  uint uVar1;
  code *pcVar2;
  bool bVar3;
  bool bVar4;
  long *plVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  ulong uVar8;
  long unaff_x19;
  long lVar9;
  long lVar10;
  undefined8 *unaff_x22;
  long lVar11;
  long unaff_x24;
  undefined1 *unaff_x25;
  long unaff_x26;
  int unaff_w27;
  long unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long *in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined4 uStack000000000000003c;
  long in_stack_00000040;
  undefined1 uStack00000000000000c0;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f8;
  long in_stack_00000100;
  
  *(long *)(param_1 + 0x18) = param_3._8_8_;
  *(long *)(param_1 + 0x10) = param_3._0_8_;
  _uStack00000000000000c0 = param_2;
  if (&uStack00000000000000c0 != unaff_x25) {
    func_0x0003655c(in_stack_00000010,*(long *)(unaff_x19 + -0x40),*(long *)(unaff_x19 + -0x38),
                    (*(long *)(unaff_x19 + -0x38) - *(long *)(unaff_x19 + -0x40) >> 3) *
                    -0x5555555555555555);
    func_0x00036758(in_stack_00000008,*(long *)(unaff_x19 + -0x28),*(long *)(unaff_x19 + -0x20),
                    *(long *)(unaff_x19 + -0x20) - *(long *)(unaff_x19 + -0x28) >> 4);
  }
  uVar6 = *unaff_x22;
  *(undefined8 *)((long)in_stack_00000020 + 5) = *(undefined8 *)((long)unaff_x22 + 5);
  *in_stack_00000020 = uVar6;
  lVar9 = *(long *)(unaff_x29 + -0x70);
  if (unaff_x24 == unaff_x28) {
    lVar11 = *(long *)(unaff_x29 + -0x78);
    for (; lVar9 != lVar11; lVar9 = lVar9 + -0x60) {
      if (*(long *)(lVar9 + -0x28) != 0) {
        *(long *)(lVar9 + -0x20) = *(long *)(lVar9 + -0x28);
        __ZdlPv();
      }
      if (*(long *)(lVar9 + -0x40) != 0) {
        *(long *)(lVar9 + -0x38) = *(long *)(lVar9 + -0x40);
        __ZdlPv();
      }
    }
    *(long *)(unaff_x29 + -0x70) = lVar11;
    unaff_x24 = unaff_x28;
  }
  else {
    if (*(long *)(lVar9 + -0x28) != 0) {
      *(long *)(lVar9 + -0x20) = *(long *)(lVar9 + -0x28);
      __ZdlPv();
    }
    if (*(long *)(lVar9 + -0x40) != 0) {
      *(long *)(lVar9 + -0x38) = *(long *)(lVar9 + -0x40);
      __ZdlPv();
    }
    *(long *)(unaff_x29 + -0x70) = lVar9 + -0x60;
  }
  uStack000000000000003c = 1;
  lVar9 = *(long *)(unaff_x29 + -0x70);
  if (*(long *)(unaff_x29 + -0x78) != lVar9) {
    uVar1 = unaff_w27 + 1U >> 0xc;
    bVar3 = true;
    bVar4 = false;
    if ((unaff_w27 + 1U & 0xfff) == 0) {
      bVar4 = SBORROW4(uVar1,(int)unaff_x28);
      bVar3 = (int)(uVar1 - (int)unaff_x28) < 0;
    }
    if (bVar3 == bVar4) {
      func_0x0002d458();
    }
    else {
      plVar5 = *(long **)(lVar9 + -0x10);
      if (plVar5 != (long *)0x0) {
        (**(code **)(*plVar5 + 0x10))(plVar5,(int *)(lVar9 + -0x60));
      }
      uVar1 = *(int *)(lVar9 + -0x60) + 1000;
      if (uVar1 < 10) {
                    /* WARNING: Could not recover jumptable at 0x0003532c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar6 = (*(code *)(&LAB_000352cc + (ulong)*(byte *)(unaff_x26 + (ulong)uVar1) * 4))();
        return uVar6;
      }
      func_0x0002d4a4();
    }
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x356a8);
    (*pcVar2)();
  }
  in_stack_00000018 = (long *)*in_stack_00000018;
  *in_stack_00000018 = in_stack_00000040;
  in_stack_00000018[1] = in_stack_00000040 + unaff_x24;
  *(undefined1 *)(in_stack_00000018 + 2) = 1;
  if (in_stack_000000e8 - in_stack_000000e0 != 0) {
    puVar7 = (undefined1 *)(in_stack_000000e0 + 0x10);
    uVar8 = 1;
    do {
      plVar5 = in_stack_00000018 + uVar8 * 3;
      lVar9 = *(long *)(puVar7 + -0x10);
      plVar5[1] = *(long *)(puVar7 + -8);
      *plVar5 = lVar9;
      *(undefined1 *)(plVar5 + 2) = *puVar7;
      bVar3 = uVar8 < (ulong)((in_stack_000000e8 - in_stack_000000e0 >> 3) * -0x5555555555555555);
      puVar7 = puVar7 + 0x18;
      uVar8 = (ulong)((int)uVar8 + 1);
    } while (bVar3);
  }
  if (in_stack_000000f8 != 0) {
    in_stack_00000100 = in_stack_000000f8;
    __ZdlPv();
  }
  if (in_stack_000000e0 != 0) {
    in_stack_000000e8 = in_stack_000000e0;
    __ZdlPv();
  }
  lVar9 = *(long *)(unaff_x29 + -0x78);
  if (lVar9 != 0) {
    lVar10 = *(long *)(unaff_x29 + -0x70);
    lVar11 = lVar9;
    if (lVar10 != lVar9) {
      do {
        if (*(long *)(lVar10 + -0x28) != 0) {
          *(long *)(lVar10 + -0x20) = *(long *)(lVar10 + -0x28);
          __ZdlPv();
        }
        if (*(long *)(lVar10 + -0x40) != 0) {
          *(long *)(lVar10 + -0x38) = *(long *)(lVar10 + -0x40);
          __ZdlPv();
        }
        lVar10 = lVar10 + -0x60;
      } while (lVar10 != lVar9);
      lVar11 = *(long *)(unaff_x29 + -0x78);
    }
    *(long *)(unaff_x29 + -0x70) = lVar9;
    __ZdlPv(lVar11);
  }
  return 1;
}

