
undefined8 FUN_0041aeb0(void)

{
  uint uVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long unaff_x23;
  
  func_0x007a1368();
  uVar1 = func_0x007a1140();
  uVar2 = func_0x0041ba84();
  if (((((uVar1 ^ 1) & 1) == 0) && ((*(ulong *)(unaff_x23 + 0x548) & 0x7fffffffffffffff) != 0)) &&
     (uVar3 = func_0x007a1140(), (uVar3 & 1) == 0)) {
    *(undefined1 *)(unaff_x19 + 1) = 1;
  }
  _pthread_mutex_unlock(*unaff_x19);
  return uVar2;
}

