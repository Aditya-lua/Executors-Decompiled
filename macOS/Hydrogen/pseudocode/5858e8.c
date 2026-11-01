
void FUN_005858e8(undefined1 param_1 [16])

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
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  uVar5 = param_1._8_8_;
  uVar4 = param_1._0_8_;
  while( true ) {
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
    unaff_x24[0xe] = in_stack_00000030;
    unaff_x24[0xd] = in_stack_00000028;
    unaff_x24[0x10] = in_stack_00000040;
    unaff_x24[0xf] = in_stack_00000038;
    unaff_x19 = unaff_x19 + 0x48;
    unaff_x24 = unaff_x24 + 9;
    uVar4 = in_stack_00000018;
    uVar5 = in_stack_00000020;
  }
  func_0x007a05dc();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x585928);
  (*pcVar1)();
}

