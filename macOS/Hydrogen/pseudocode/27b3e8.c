
void FUN_0027b3e8(ulong param_1,undefined8 param_2,undefined8 param_3,long param_4,ulong param_5)

{
  code *pcVar1;
  undefined *puVar2;
  undefined1 *extraout_x8;
  long unaff_x19;
  long lVar3;
  undefined1 auVar4 [16];
  
  if ((param_1 & 1) == 0) {
    func_0x0023fb18(unaff_x19 + 1);
  }
  __Unwind_Resume();
  auVar4 = func_0x007a2668();
  if (*auVar4._8_8_ == '\x01') {
    if (*auVar4._0_8_ != '\x03') {
      if ((param_5 & 0xfffffffffffffff0) != 0) {
        lVar3 = -(param_5 & 0xfffffffffffffff0);
        do {
          func_0x002998c0(param_4,param_4,auVar4._0_8_ + 4,1);
          lVar3 = lVar3 + 0x10;
          param_4 = param_4 + 0x10;
        } while (lVar3 != 0);
      }
      *extraout_x8 = 1;
      return;
    }
    puVar2 = &UNK_009cda40;
  }
  else {
    puVar2 = &UNK_009cda58;
  }
  func_0x007a247c(&UNK_0082e2a6,0x28,puVar2);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x27b4ac);
  (*pcVar1)();
}

