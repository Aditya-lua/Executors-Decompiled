
undefined8 FUN_00741598(void)

{
  int iVar1;
  undefined4 *unaff_x19;
  undefined8 uStack0000000000000008;
  
  puRam0000000000a2b600 = PTR__strdup_009b0468;
  puRam0000000000a2b608 = PTR__calloc_009b0210;
  iVar1 = func_0x0015e2a8();
  if ((((iVar1 != 0) || (iVar1 = func_0x00793850(), iVar1 == 0)) ||
      (iVar1 = func_0x0075e74c(), iVar1 != 0)) || (iVar1 = func_0x0015e2a8(), iVar1 != 0)) {
    unaff_x19[1] = unaff_x19[1] + -1;
    *unaff_x19 = 0;
    return 0;
  }
  *unaff_x19 = 0;
  iVar1 = func_0x00784984(&uStack0000000000000008);
  if (iVar1 != 0) {
    uStack0000000000000008 = 0;
  }
  return uStack0000000000000008;
}

