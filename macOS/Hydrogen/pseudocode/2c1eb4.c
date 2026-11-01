
undefined8 FUN_002c1eb4(void)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  
  puVar2 = (undefined8 *)unaff_x19[4];
  lVar1 = unaff_x19[3];
  while (lVar1 != 0) {
    if (puVar2 != (undefined8 *)0x0) goto LAB_002c1ef8;
    func_0x0079e5f4();
    func_0x0028f83c(0x1d,0,0x42,"/aws-lc/crypto/fipsmodule/digest/digest.c",0x11d);
    unaff_x20 = 0;
    func_0x0036e3d8(unaff_x19[1]);
    puVar2 = (undefined8 *)unaff_x19[4];
    lVar1 = unaff_x19[3];
  }
  if (puVar2 != (undefined8 *)0x0) {
LAB_002c1ef8:
    if ((*(byte *)((long)unaff_x19 + 0x29) >> 2 & 1) == 0) {
      (*(code *)*puVar2)();
    }
  }
  unaff_x19[3] = 0;
  unaff_x19[2] = 0;
  unaff_x19[5] = 0;
  unaff_x19[4] = 0;
  unaff_x19[1] = 0;
  *unaff_x19 = 0;
  return unaff_x20;
}

