
undefined1  [16] FUN_001ac610(short *param_1,undefined8 param_2,ulong param_3)

{
  short *psVar1;
  byte bVar2;
  undefined1 auVar3 [16];
  undefined1 in_CY;
  long in_x9;
  uint in_w10;
  
  do {
    if ((bool)in_CY) {
      if (in_w10 != 0x10) {
        if (*(long *)(param_1 + -4) == 1) {
          return *(undefined1 (*) [16])(*(long *)(param_1 + -8) + 8);
        }
LAB_001ac648:
        auVar3._8_8_ = 0;
        auVar3._0_8_ = param_3;
        return auVar3 << 0x40;
      }
      if (*param_1 == 0x10 || in_x9 == 0) goto LAB_001ac648;
    }
    else if (in_x9 == 0) goto LAB_001ac648;
    psVar1 = param_1 + 0x14;
    in_x9 = in_x9 + -0x28;
    bVar2 = *(byte *)(param_1 + 4);
    in_w10 = (uint)bVar2;
    in_CY = false;
    param_1 = psVar1;
    if (10 < bVar2 - 5) {
      in_CY = 3 < bVar2;
    }
  } while( true );
}

