
void FUN_00595e98(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *unaff_x20;
  long lVar1;
  undefined8 unaff_x21;
  ulong uVar2;
  undefined1 auVar3 [16];
  
  *unaff_x20 = unaff_x21;
  func_0x0057eb88();
  __Unwind_Resume();
  func_0x007a2668();
  auVar3 = func_0x007a2668();
  lVar1 = auVar3._0_8_;
  if (lVar1 != auVar3._8_8_) {
    uVar2 = (ulong)(auVar3._8_8_ - lVar1) / 0x48;
    do {
      func_0x00563b2c(param_3,lVar1);
      lVar1 = lVar1 + 0x48;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  return;
}

