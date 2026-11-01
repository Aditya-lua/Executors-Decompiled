
void FUN_00198800(undefined4 param_1)

{
  uint uVar1;
  uint *unaff_x19;
  undefined8 uStack0000000000000008;
  
  uVar1 = _AuthorizationCreateFromExternalForm(param_1,&uStack0000000000000008);
  if (uVar1 == 0) {
    *(undefined8 *)(unaff_x19 + 2) = uStack0000000000000008;
    unaff_x19[4] = 0;
  }
  else {
    unaff_x19[1] = uVar1;
  }
  *unaff_x19 = (uint)(uVar1 != 0);
  return;
}

