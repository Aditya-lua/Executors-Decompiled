
void FUN_005d1894(long param_1,undefined8 *param_2)

{
  code *pcVar1;
  int iVar2;
  long *unaff_x19;
  long unaff_x22;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  while( true ) {
    iVar2 = func_0x005ca2ec(param_1,param_2);
    if (iVar2 != 0) {
      func_0x007a2810(&UNK_008b5ba0,0x37);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5d1910);
      (*pcVar1)();
    }
    func_0x005bc4c4();
    if (unaff_x27 == unaff_x22) break;
    *unaff_x19 = unaff_x27 + 8;
    param_2 = &uStack0000000000000038;
    param_1 = unaff_x27;
    unaff_x27 = unaff_x27 + 8;
    uStack0000000000000038 = unaff_x25;
    in_stack_00000040 = unaff_x26;
    in_stack_00000048 = unaff_x24;
  }
  return;
}

