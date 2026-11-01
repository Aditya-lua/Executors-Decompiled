
void FUN_001ebea4(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 in_stack_00000008;
  
  lVar2 = func_0x00187bd0();
  if (lVar2 == 0) {
    func_0x007a1f00();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1ebf7c);
    (*pcVar1)();
  }
  _memcpy(lVar2);
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = lVar2;
  unaff_x19[2] = unaff_x20;
  unaff_x19[3] = 0;
  func_0x002d8de8(in_stack_00000008);
  return;
}

