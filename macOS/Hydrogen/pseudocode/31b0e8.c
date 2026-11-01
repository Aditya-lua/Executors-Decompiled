
undefined8 FUN_0031b0e8(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long *unaff_x19;
  bool bVar4;
  long unaff_x22;
  long unaff_x27;
  long in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  lVar2 = func_0x0036e274();
  *(long *)(unaff_x27 + 0x30) = lVar2;
  uVar3 = 0;
  if ((lVar2 != 0) &&
     (uVar3 = func_0x002f9804(&uStack0000000000000018,&uStack0000000000000010,
                              (long)&uStack0000000000000008 + 4,**(undefined4 **)(unaff_x27 + 0x18),
                              &UNK_00877bc0), (int)uVar3 != 0)) {
    iVar1 = func_0x002fa0c0();
    if ((iVar1 == 0) ||
       ((in_stack_00000000 != uStack0000000000000010 ||
        (iVar1 = func_0x0036e62c(*(undefined8 *)(unaff_x27 + 0x30),uStack0000000000000018,
                                 in_stack_00000000 - unaff_x22), iVar1 != 0)))) {
      bVar4 = true;
    }
    else {
      bVar4 = false;
    }
    if (uStack0000000000000008._4_4_ != 0) {
      func_0x0036e3d8(uStack0000000000000018);
    }
    if (bVar4) {
      uVar3 = 0;
    }
    else {
      if ((int)unaff_x22 != 0) {
        _memcpy();
      }
      *unaff_x19 = unaff_x22;
      uVar3 = 1;
    }
  }
  return uVar3;
}

