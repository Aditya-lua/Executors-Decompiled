
long FUN_0066c908(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  long lVar2;
  ulong unaff_x21;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  if ((unaff_x21 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar4 = __Unwind_Resume();
  lVar2 = auVar4._0_8_;
  uVar3 = 0;
  if ((auVar4._8_8_ != 0) && (*(long *)(lVar2 + 0x18) != 0)) {
    uVar1 = *(ulong *)(lVar2 + 0x28);
    uVar3 = 0;
    if (uVar1 <= *(ulong *)(lVar2 + 0x20)) {
      uVar3 = *(ulong *)(lVar2 + 0x20) - uVar1;
    }
    if (param_3 <= uVar3) {
      uVar3 = param_3;
    }
    func_0x006853f4(*(long *)(lVar2 + 0x18) + uVar1,auVar4._8_8_,uVar3);
  }
  *(ulong *)(lVar2 + 0x28) = *(long *)(lVar2 + 0x28) + uVar3;
  return param_3 - uVar3;
}

