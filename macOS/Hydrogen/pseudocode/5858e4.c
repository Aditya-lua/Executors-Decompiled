
void FUN_005858e4(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16])

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  uVar9 = param_3._8_8_;
  uVar8 = param_3._0_8_;
  uVar7 = param_2._8_8_;
  uVar6 = param_2._0_8_;
  uVar5 = param_1._8_8_;
  uVar4 = param_1._0_8_;
  while( true ) {
    unaff_x24[5] = uVar7;
    unaff_x24[4] = uVar6;
    unaff_x24[7] = uVar9;
    unaff_x24[6] = uVar8;
    unaff_x24[3] = uVar5;
    unaff_x24[2] = uVar4;
    unaff_x21 = unaff_x21 + 1;
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) {
      *unaff_x20 = unaff_x21;
      return;
    }
    plVar3 = *(long **)(unaff_x19 + 0x40);
    lVar2 = *plVar3;
    *plVar3 = lVar2 + unaff_x25;
    if (lVar2 < 0) break;
    func_0x005882f4(unaff_x23 + 8,unaff_x19 + 0x48);
    unaff_x24[10] = in_stack_00000010;
    unaff_x24[9] = plVar3;
    unaff_x24[0x11] = in_stack_00000048;
    unaff_x19 = unaff_x19 + 0x48;
    unaff_x24 = unaff_x24 + 9;
    uVar4 = in_stack_00000018;
    uVar5 = in_stack_00000020;
    uVar6 = in_stack_00000028;
    uVar7 = in_stack_00000030;
    uVar8 = in_stack_00000038;
    uVar9 = in_stack_00000040;
  }
  func_0x007a05dc();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x585928);
  (*pcVar1)();
}

