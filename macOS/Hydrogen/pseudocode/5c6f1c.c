
void FUN_005c6f1c(void)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long extraout_x8;
  
  uVar3 = func_0x007a23bc();
  uVar1 = 0x380;
  if (extraout_x8 != 0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(uVar3,uVar1,8);
  func_0x007a23bc(&UNK_009f2768);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5c6f48);
  (*pcVar2)();
}

