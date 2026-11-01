
undefined8 FUN_0028de54(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x20;
  undefined1 uStack0000000000000030;
  
  iVar1 = func_0x00281e30();
  if (iVar1 != 0) {
    if (*(char *)(unaff_x20 + 0x20d) == '\0') {
      func_0x0028f83c(0xf,0,0x7b,"/aws-lc/crypto/ec_extra/ec_asn1.c",0x165);
    }
    else {
      iVar1 = func_0x002823f4();
      if (((iVar1 != 0) &&
          (iVar1 = func_0x00282698(&uStack0000000000000030,unaff_x20 + 0x204,
                                   *(undefined1 *)(unaff_x20 + 0x20d)), iVar1 != 0)) &&
         (iVar1 = func_0x00281fbc(), iVar1 != 0)) {
        uVar2 = func_0x00281d3c();
        return uVar2;
      }
    }
  }
  func_0x00281ecc();
  return 0xffffffff;
}

