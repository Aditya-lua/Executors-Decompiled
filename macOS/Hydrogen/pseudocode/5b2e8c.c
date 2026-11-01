
void FUN_005b2e8c(void)

{
  long lVar1;
  long *in_x9;
  undefined8 uStack0000000000000008;
  
  lVar1 = *in_x9;
  *in_x9 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2ac4(&uStack0000000000000008);
  }
  return;
}

