
bool FUN_0019b2ec(long param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uStack0000000000000008;
  
  if (param_1 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19b37c);
    (*pcVar1)();
  }
  uStack0000000000000008 = param_1;
  iVar2 = _CFEqual();
  func_0x0019e6a4(&uStack0000000000000008);
  func_0x0019e6a4();
  return iVar2 != 0;
}

