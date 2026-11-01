
undefined1  [16] FUN_004482d0(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  
  iVar1 = _memcmp();
  if (iVar1 == 0) {
    uVar2 = 1;
    uVar3 = 0x69;
  }
  else {
    iVar1 = _memcmp();
    if (iVar1 == 0) {
      uVar2 = 1;
      uVar3 = 0x6a;
    }
    else {
      iVar1 = _memcmp();
      if (iVar1 == 0) {
        uVar2 = 1;
        uVar3 = 0x6b;
      }
      else {
        iVar1 = _memcmp();
        if (iVar1 == 0) {
          uVar2 = 1;
          uVar3 = 0x6c;
        }
        else {
          iVar1 = _memcmp();
          if (iVar1 == 0) {
            uVar2 = 1;
            uVar3 = 0x6d;
          }
          else {
            iVar1 = _memcmp();
            if (iVar1 == 0) {
              uVar2 = 1;
              uVar3 = 0x6e;
            }
            else {
              iVar1 = _memcmp();
              if (iVar1 == 0) {
                uVar2 = 1;
                uVar3 = 0x6f;
              }
              else {
                uVar2 = 0;
                uVar3 = 0x10f;
              }
            }
          }
        }
      }
    }
  }
  auVar4._8_8_ = uVar3;
  auVar4._0_8_ = uVar2;
  return auVar4;
}

