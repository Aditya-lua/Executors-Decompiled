
void FUN_00270c58(uint param_1)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *unaff_x19;
  undefined1 *unaff_x20;
  ulong uVar4;
  
  uVar4 = (ulong)param_1;
  if (param_1 == 0) {
    uVar2 = 1;
  }
  else {
    uVar2 = func_0x00187bd0(uVar4,1);
    if (uVar2 == 0) {
      func_0x007a1f00(1,uVar4,&UNK_009cc668);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x270cf0);
      (*pcVar1)();
    }
    _memcpy();
    uVar3 = uVar4;
    do {
      *unaff_x20 = 0;
      uVar3 = uVar3 - 1;
      unaff_x20 = unaff_x20 + 1;
    } while (uVar3 != 0);
  }
  *unaff_x19 = uVar4;
  unaff_x19[1] = uVar2;
  unaff_x19[2] = uVar4;
  func_0x0036e3d8();
  return;
}

