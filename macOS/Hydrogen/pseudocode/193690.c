
void FUN_00193690(void)

{
  code *pcVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  undefined1 uStack0000000000000008;
  
  if (unaff_x20 == 0) {
    lVar2 = 1;
  }
  else {
    lVar2 = func_0x00187bd0();
    if (lVar2 == 0) {
      func_0x007a1f00(1);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x193734);
      (*pcVar1)();
    }
  }
  _memcpy(lVar2);
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = lVar2;
  unaff_x19[2] = unaff_x20;
  func_0x0019fb28(&uStack0000000000000008);
  return;
}

