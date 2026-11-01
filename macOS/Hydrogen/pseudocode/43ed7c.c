
undefined1  [16] FUN_0043ed7c(long param_1,long *param_2,ulong param_3)

{
  ulong uVar1;
  byte bVar2;
  bool bVar3;
  undefined8 uVar4;
  ulong in_x9;
  ulong uVar5;
  uint uVar6;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long lVar7;
  undefined1 auVar8 [16];
  
  uVar6 = (uint)in_x10;
  uVar1 = in_x9 & 0x7f | (in_x10 & 0x7f) << 7;
  uVar5 = in_x9 & 0xffffffffffffc000 | uVar1;
  if ((uVar6 >> 7 & 1) == 0) {
    bVar3 = false;
    lVar7 = 0xe;
  }
  else {
    if (in_x12 == 0) {
LAB_0043eef8:
      uVar4 = 1;
      *param_2 = 1;
      param_2[1] = 0;
      goto LAB_0043ef00;
    }
    *param_2 = in_x11 + 3;
    param_2[1] = param_1 + -3;
    bVar2 = *(byte *)(in_x11 + 2);
    uVar6 = (uint)bVar2;
    uVar1 = uVar1 | ((ulong)bVar2 & 0x7f) << 0xe;
    uVar5 = in_x9 & 0xffffffffffe00000 | uVar1;
    if ((char)bVar2 < '\0') {
      if (param_1 + -3 == 0) goto LAB_0043eef8;
      *param_2 = in_x11 + 4;
      param_2[1] = param_1 + -4;
      bVar2 = *(byte *)(in_x11 + 3);
      uVar6 = (uint)bVar2;
      uVar1 = uVar1 | ((ulong)bVar2 & 0x7f) << 0x15;
      uVar5 = in_x9 & 0xfffffffff0000000 | uVar1;
      if ((char)bVar2 < '\0') {
        if (param_1 + -4 == 0) goto LAB_0043eef8;
        *param_2 = in_x11 + 5;
        param_2[1] = param_1 + -5;
        bVar2 = *(byte *)(in_x11 + 4);
        uVar6 = (uint)bVar2;
        uVar5 = in_x9 & 0xfffffff800000000 | uVar1 | ((ulong)bVar2 & 0x7f) << 0x1c;
        if ((char)bVar2 < '\0') {
          if (param_1 + -5 == 0) goto LAB_0043eef8;
          *param_2 = in_x11 + 6;
          param_2[1] = param_1 + -6;
          bVar2 = *(byte *)(in_x11 + 5);
          uVar5 = uVar5 | (ulong)((int)(char)bVar2 & 0x7f) << 0x23;
          if ((char)bVar2 < 0) {
            if (param_1 + -6 == 0) goto LAB_0043eef8;
            *param_2 = in_x11 + 7;
            param_2[1] = param_1 + -7;
            bVar2 = *(byte *)(in_x11 + 6);
            uVar5 = uVar5 | (ulong)((int)(char)bVar2 & 0x7f) << 0x2a;
            if ((char)bVar2 < 0) {
              if (param_1 + -7 == 0) goto LAB_0043eef8;
              *param_2 = in_x11 + 8;
              param_2[1] = param_1 + -8;
              bVar2 = *(byte *)(in_x11 + 7);
              uVar5 = uVar5 | (ulong)((int)(char)bVar2 & 0x7f) << 0x31;
              if ((char)bVar2 < 0) {
                if (param_1 + -8 == 0) goto LAB_0043eef8;
                *param_2 = in_x11 + 9;
                param_2[1] = param_1 + -9;
                bVar2 = *(byte *)(in_x11 + 8);
                uVar5 = uVar5 | (ulong)((int)(char)bVar2 & 0x7f) << 0x38;
                if ((char)bVar2 < 0) {
                  if (param_1 + -9 == 0) goto LAB_0043eef8;
                  *param_2 = in_x11 + 10;
                  param_2[1] = param_1 + -10;
                  bVar2 = *(byte *)(in_x11 + 9);
                  uVar6 = (uint)bVar2;
                  if ((bVar2 != 0x7f) && (bVar2 != 0)) {
                    uVar4 = 1;
                    goto LAB_0043ef00;
                  }
                  uVar5 = uVar5 | (ulong)bVar2 << 0x3f;
                  bVar3 = true;
                  lVar7 = 6;
                }
                else {
                  bVar3 = false;
                  uVar6 = (uint)bVar2;
                  lVar7 = 0x3f;
                }
              }
              else {
                bVar3 = false;
                uVar6 = (uint)bVar2;
                lVar7 = 0x38;
              }
            }
            else {
              bVar3 = false;
              uVar6 = (uint)bVar2;
              lVar7 = 0x31;
            }
          }
          else {
            bVar3 = false;
            uVar6 = (uint)bVar2;
            lVar7 = 0x2a;
          }
        }
        else {
          bVar3 = false;
          lVar7 = 0x23;
        }
      }
      else {
        bVar3 = false;
        lVar7 = 0x1c;
      }
    }
    else {
      bVar3 = false;
      lVar7 = 0x15;
    }
  }
  uVar4 = 0;
  if (uVar6 < 0x40) {
    bVar3 = true;
  }
  param_3 = 0;
  if (!bVar3) {
    param_3 = -1L << lVar7;
  }
  param_3 = param_3 | uVar5;
LAB_0043ef00:
  auVar8._8_8_ = param_3;
  auVar8._0_8_ = uVar4;
  return auVar8;
}

