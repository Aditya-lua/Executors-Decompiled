
undefined8 * FUN_002cba94(undefined8 *param_1)

{
  undefined8 *unaff_x20;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  if (param_1 == (undefined8 *)0x0) {
    func_0x0028f83c(0xf,0,0x41,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0x24d);
    return (undefined8 *)0x0;
  }
  if (unaff_x20 != (undefined8 *)0x0) {
    uVar2 = unaff_x20[1];
    uVar1 = *unaff_x20;
    uVar4 = unaff_x20[3];
    uVar3 = unaff_x20[2];
    param_1[4] = unaff_x20[4];
    param_1[1] = uVar2;
    *param_1 = uVar1;
    param_1[3] = uVar4;
    param_1[2] = uVar3;
  }
  return param_1;
}

