
void FUN_00210b38(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  
  lVar2 = func_0x00187bd0(param_1,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1a8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x210ee0);
    (*pcVar1)();
  }
  _memcpy();
  func_0x00211e94(lVar2);
  func_0x00187bd4();
  return;
}

