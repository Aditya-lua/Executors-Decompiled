
undefined8 FUN_000352d4(void)

{
  bool bVar1;
  uint uVar2;
  code *pcVar3;
  bool in_ZR;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong uVar8;
  long unaff_x19;
  long lVar9;
  long lVar10;
  long unaff_x24;
  long unaff_x26;
  int unaff_w27;
  int unaff_w28;
  long unaff_x29;
  long *in_stack_00000018;
  ulong in_stack_00000038;
  long in_stack_00000040;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f8;
  
  if (in_ZR) {
    if ((in_stack_00000038 & 0x100000000) == 0) {
      uVar5 = 0;
    }
    else {
      in_stack_00000018 = (long *)*in_stack_00000018;
      *in_stack_00000018 = in_stack_00000040;
      in_stack_00000018[1] = in_stack_00000040 + unaff_x24;
      *(undefined1 *)(in_stack_00000018 + 2) = 1;
      if (in_stack_000000e8 - in_stack_000000e0 != 0) {
        puVar7 = (undefined1 *)(in_stack_000000e0 + 0x10);
        uVar8 = 1;
        do {
          plVar4 = in_stack_00000018 + uVar8 * 3;
          lVar9 = *(long *)(puVar7 + -0x10);
          plVar4[1] = *(long *)(puVar7 + -8);
          *plVar4 = lVar9;
          *(undefined1 *)(plVar4 + 2) = *puVar7;
          bVar1 = uVar8 < (ulong)((in_stack_000000e8 - in_stack_000000e0 >> 3) * -0x5555555555555555
                                 );
          puVar7 = puVar7 + 0x18;
          uVar8 = (ulong)((int)uVar8 + 1);
        } while (bVar1);
      }
      uVar5 = 1;
    }
    if (in_stack_000000f8 != 0) {
      __ZdlPv();
    }
    if (in_stack_000000e0 != 0) {
      __ZdlPv();
    }
    lVar9 = *(long *)(unaff_x29 + -0x78);
    if (lVar9 != 0) {
      lVar10 = *(long *)(unaff_x29 + -0x70);
      lVar6 = lVar9;
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
        lVar6 = *(long *)(unaff_x29 + -0x78);
      }
      *(long *)(unaff_x29 + -0x70) = lVar9;
      __ZdlPv(lVar6);
    }
    return uVar5;
  }
  if ((unaff_w27 + 1U & 0xfff) == 0 && unaff_w28 <= (int)(unaff_w27 + 1U >> 0xc)) {
    func_0x0002d458();
  }
  else {
    plVar4 = *(long **)(unaff_x19 + -0x10);
    if (plVar4 != (long *)0x0) {
      (**(code **)(*plVar4 + 0x10))(plVar4,(int *)(unaff_x19 + -0x60));
    }
    uVar2 = *(int *)(unaff_x19 + -0x60) + 1000;
    if (uVar2 < 10) {
                    /* WARNING: Could not recover jumptable at 0x0003532c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar5 = (*(code *)(&LAB_000352cc + (ulong)*(byte *)(unaff_x26 + (ulong)uVar2) * 4))();
      return uVar5;
    }
    func_0x0002d4a4();
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x356a8);
  (*pcVar3)();
}

