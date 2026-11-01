
undefined8 FUN_0028ba3c(void)

{
  int iVar1;
  long lVar2;
  uint *unaff_x20;
  undefined8 uVar3;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000038;
  
  iVar1 = func_0x0029c378();
  if ((((iVar1 == 0) && (iVar1 = func_0x0029ad7c(*unaff_x21,unaff_x22[1]), iVar1 < 0)) &&
      (iVar1 = func_0x0029b308(unaff_x21[1]), iVar1 == 0)) &&
     ((iVar1 = func_0x0029c378(unaff_x21[1]), iVar1 == 0 &&
      (iVar1 = func_0x0029ad7c(unaff_x21[1],unaff_x22[1]), iVar1 < 0)))) {
    lVar2 = func_0x002a5960(&uStack0000000000000020,unaff_x21[1],unaff_x22[1]);
    if (lVar2 != 0) {
      func_0x0029bf0c(unaff_x22[1]);
      lVar2 = func_0x0029c764();
      if (((lVar2 != 0) &&
          (iVar1 = func_0x002a06a4(&uStack0000000000000038,&uStack0000000000000038,
                                   &uStack0000000000000020,unaff_x22[1]), iVar1 != 0)) &&
         ((iVar1 = func_0x002a06a4(&uStack0000000000000020,*unaff_x21,&uStack0000000000000020,
                                   unaff_x22[1]), iVar1 != 0 &&
          (((iVar1 = func_0x002aad18(unaff_x22 + 0x1e,unaff_x22 + 5,*unaff_x22), iVar1 != 0 &&
            (iVar1 = func_0x002a4e9c(&uStack0000000000000008,unaff_x22[2],&uStack0000000000000038,
                                     unaff_x22[3],&uStack0000000000000020,*unaff_x22), iVar1 != 0))
           && (iVar1 = func_0x0029e4fc(0,&uStack0000000000000038,&uStack0000000000000008,
                                       unaff_x22[1]), iVar1 != 0)))))) {
        iVar1 = func_0x0029ad7c(&uStack0000000000000038,*unaff_x21);
        *unaff_x20 = (uint)(iVar1 == 0);
        uVar3 = 1;
        goto LAB_0028bbbc;
      }
    }
    func_0x0028f83c(10,0,3,"/aws-lc/crypto/dsa/dsa.c",0x32a);
    uVar3 = 0;
  }
  else {
    uVar3 = 1;
  }
LAB_0028bbbc:
  func_0x0029e220();
  func_0x0029bc0c(&uStack0000000000000038);
  func_0x0029bc0c(&uStack0000000000000020);
  func_0x0029bc0c(&uStack0000000000000008);
  return uVar3;
}

