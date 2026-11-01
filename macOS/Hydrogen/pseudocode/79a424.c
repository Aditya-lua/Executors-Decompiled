
void FUN_0079a424(int param_1)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if (param_1 != 0) {
    func_0x007a2810(&UNK_00819869,0x37,unaff_x29 + -0x11,&UNK_009c0460,&UNK_009c0448);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x79a470);
    (*pcVar1)();
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

