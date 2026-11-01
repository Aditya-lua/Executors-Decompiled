
void FUN_0020ad50(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  
  lVar2 = func_0x00187bd0();
  if (lVar2 == 0) {
    func_0x007a1f00(1);
    func_0x007a1f00(0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x20aec8);
    (*pcVar1)();
  }
  _memcpy(lVar2);
  unaff_x19[2] = lVar2;
  unaff_x19[3] = unaff_x20;
  *unaff_x19 = 0x8000000000000005;
  unaff_x19[1] = unaff_x20;
  return;
}

