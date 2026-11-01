
void FUN_00050818(undefined8 param_1)

{
  code *pcVar1;
  char in_NG;
  char in_OV;
  undefined8 in_x9;
  undefined8 uStack0000000000000000;
  
  uStack0000000000000000 = in_x9;
  if (in_NG == in_OV) {
    uStack0000000000000000 = param_1;
  }
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x50834);
  (*pcVar1)();
}

