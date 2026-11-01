
long * FUN_0036f184(void)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  lVar1 = func_0x0036e814();
  if (lVar1 == 0) {
    func_0x0036e3d8();
    func_0x0036e3d8(0);
    func_0x0036e3d8(0);
    func_0x0036e3d8();
    return (long *)0x0;
  }
  *unaff_x19 = lVar1;
  unaff_x19[1] = unaff_x21;
  *(uint *)(unaff_x19 + 4) = *(uint *)(unaff_x20 + 0x20) | 0xd;
  return unaff_x19;
}

