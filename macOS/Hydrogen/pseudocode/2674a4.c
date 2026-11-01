
void FUN_002674a4(long param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long extraout_x8;
  
  uVar3 = func_0x007a23bc(param_1 + 0x330);
  uVar1 = 0x380;
  if (extraout_x8 != 0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(uVar3,uVar1,8);
  func_0x007a23bc(&UNK_009cb318);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x2674d4);
  (*pcVar2)();
}

