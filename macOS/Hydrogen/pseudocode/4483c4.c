
undefined1  [16] FUN_004483c4(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long *unaff_x19;
  undefined1 auVar4 [16];
  
  if (*unaff_x19 == 0x444e555f52535053) {
    uVar2 = 1;
    uVar3 = 0x84;
  }
  else if (*unaff_x19 == 0x4356535f52535053) {
    uVar2 = 1;
    uVar3 = 0x85;
  }
  else {
    iVar1 = _memcmp();
    if (iVar1 == 0) {
      uVar2 = 1;
      uVar3 = 0x140;
    }
    else {
      iVar1 = _memcmp();
      if (iVar1 == 0) {
        uVar2 = 1;
        uVar3 = 0x141;
      }
      else {
        uVar2 = 0;
        uVar3 = 0x10f;
      }
    }
  }
  auVar4._8_8_ = uVar3;
  auVar4._0_8_ = uVar2;
  return auVar4;
}

