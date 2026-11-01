
void FUN_004bd238(undefined8 param_1)

{
  code *pcVar1;
  long in_x9;
  undefined8 *unaff_x19;
  
  if (in_x9 < 0) {
    func_0x007a05dc();
    func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4bd5e0);
    (*pcVar1)();
  }
  *unaff_x19 = 0;
  unaff_x19[1] = param_1;
  return;
}

