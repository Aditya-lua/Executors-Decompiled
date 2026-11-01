
long FUN_0029e3a4(void)

{
  uint uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *unaff_x19;
  long lVar4;
  
  lVar4 = unaff_x19[4];
  lVar2 = func_0x00373458();
  if (lVar4 == lVar2) {
    puVar3 = (undefined8 *)func_0x0036e31c(0x18);
    if (puVar3 == (undefined8 *)0x0) {
      func_0x0028f83c(3,0,0x74,"/aws-lc/crypto/fipsmodule/bn/ctx.c",0xaa);
      *(undefined1 *)(unaff_x19 + 5) = 1;
      return 0;
    }
    *(undefined4 *)((long)puVar3 + 0x14) = 1;
    lVar2 = func_0x00373b60(*unaff_x19,puVar3);
    if (lVar2 == 0) {
      func_0x0028f83c(3,0,0x74,"/aws-lc/crypto/fipsmodule/bn/ctx.c",0xaa);
      uVar1 = *(uint *)((long)puVar3 + 0x14);
      if ((uVar1 >> 1 & 1) == 0) {
        func_0x0036e3d8(*puVar3);
        uVar1 = *(uint *)((long)puVar3 + 0x14);
      }
      if ((uVar1 & 1) == 0) {
        *puVar3 = 0;
        *(undefined1 *)(unaff_x19 + 5) = 1;
        return 0;
      }
      func_0x0036e3d8(puVar3);
      *(undefined1 *)(unaff_x19 + 5) = 1;
      return 0;
    }
  }
  lVar2 = func_0x003734a4(*unaff_x19,unaff_x19[4]);
  *(undefined4 *)(lVar2 + 0x10) = 0;
  *(undefined4 *)(lVar2 + 8) = 0;
  unaff_x19[4] = unaff_x19[4] + 1;
  return lVar2;
}

