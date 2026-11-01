
undefined * FUN_00184b5c(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  long *unaff_x20;
  undefined1 auStack_7ffffffe [2147483646];
  
  lVar2 = func_0x00187bd0(param_1,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x490);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x184ba4);
    (*pcVar1)();
  }
  _memcpy(lVar2,auStack_7ffffffe + 0x800009de,0x490);
  *unaff_x20 = lVar2;
  return &UNK_00001b58;
}

