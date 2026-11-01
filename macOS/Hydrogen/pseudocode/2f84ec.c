
long FUN_002f84ec(long param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 *puVar4;
  
  if (param_1 != 0) {
    if (unaff_x20 == 0) {
      func_0x0028f83c(4,0,0x43,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",0x59);
    }
    else {
      puVar4 = *(undefined8 **)(unaff_x19 + 0x18);
      if (puVar4 != (undefined8 *)0x0) {
        uVar1 = *(uint *)((long)puVar4 + 0x14);
        if ((uVar1 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar4);
          uVar1 = *(uint *)((long)puVar4 + 0x14);
        }
        if ((uVar1 & 1) == 0) {
          *puVar4 = 0;
        }
        else {
          func_0x0036e3d8(puVar4);
        }
      }
      lVar3 = func_0x0029bca4();
      *(long *)(unaff_x19 + 0x18) = lVar3;
      if ((lVar3 != 0) && (iVar2 = func_0x002f77a0(), iVar2 != 0)) {
        return unaff_x19;
      }
    }
  }
  func_0x002f7efc();
  return 0;
}

