
bool FUN_00284888(undefined8 param_1)

{
  byte bVar1;
  byte bVar2;
  byte *pbVar3;
  long lVar4;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 auVar5 [16];
  
  *unaff_x19 = param_1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return true;
  }
  ___stack_chk_fail(1);
  auVar5 = func_0x0079d424();
  lVar4 = auVar5._0_8_[1];
  if (lVar4 != 0) {
    pbVar3 = (byte *)*auVar5._0_8_;
    bVar1 = *pbVar3;
    if (auVar5._8_8_ != (uint *)0x0) {
      *auVar5._8_8_ = (uint)(bVar1 >> 7);
    }
    if (lVar4 == 1) {
      return true;
    }
    bVar2 = pbVar3[1];
    if ((bVar1 != 0) || ((char)bVar2 < '\0')) {
      return bVar1 != 0xff || -1 < (char)bVar2;
    }
  }
  return false;
}

