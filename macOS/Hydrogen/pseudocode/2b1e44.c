
undefined8 FUN_002b1e44(undefined8 param_1,byte *param_2,undefined8 param_3,ulong param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  
  if (*param_2 == param_4) {
    *unaff_x19 = param_2;
    if (*(code **)(param_2 + 0x10) == (code *)0x0) {
      uVar2 = (**(code **)(param_2 + 0x18))();
      iVar1 = (int)uVar2;
    }
    else {
      uVar2 = (**(code **)(param_2 + 0x10))();
      iVar1 = (int)uVar2;
    }
    if (iVar1 != 0) {
      return uVar2;
    }
  }
  else {
    func_0x0028f83c(0x1e,0,0x78,"/aws-lc/crypto/fipsmodule/cipher/aead.c",0x54);
  }
  *unaff_x19 = 0;
  return 0;
}

