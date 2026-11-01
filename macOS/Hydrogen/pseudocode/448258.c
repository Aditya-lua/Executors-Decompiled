
undefined1  [16] FUN_00448258(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int *unaff_x19;
  undefined1 auVar4 [16];
  
  if (*unaff_x19 == 0x33315277) {
    uVar2 = 1;
    uVar3 = 0x7d;
  }
  else if (*unaff_x19 == 0x34315277) {
    uVar2 = 1;
    uVar3 = 0x7e;
  }
  else if (*unaff_x19 == 0x35315277) {
    uVar2 = 1;
    uVar3 = 0x7f;
  }
  else if (*unaff_x19 == 0x52535053) {
    uVar2 = 1;
    uVar3 = 0x80;
  }
  else {
    iVar1 = _memcmp();
    if (iVar1 == 0) {
      uVar2 = 1;
      uVar3 = 0x68;
    }
    else {
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
    }
  }
  auVar4._8_8_ = uVar3;
  auVar4._0_8_ = uVar2;
  return auVar4;
}

