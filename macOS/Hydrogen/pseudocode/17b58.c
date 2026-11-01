
void FUN_00017b58(undefined8 *param_1,long param_2,long param_3,int param_4,uint param_5)

{
  long in_x9;
  long in_x10;
  undefined8 *in_x11;
  int in_w12;
  long lVar1;
  
  if (in_w12 < 0) {
    in_x11 = (undefined8 *)*in_x11;
  }
  if (param_4 != 0) {
    lVar1 = in_x9 - (long)in_x11;
    if (param_4 != 2) {
      if (param_4 != 1) {
        lVar1 = -1;
        goto LAB_00017b98;
      }
      if ((param_5 >> 3 & 1) == 0) {
        param_3 = (in_x10 - *(long *)(param_2 + 0x28)) + param_3;
        goto joined_r0x00017bdc;
      }
      lVar1 = *(long *)(param_2 + 0x18) - *(long *)(param_2 + 0x10);
    }
    param_3 = lVar1 + param_3;
  }
joined_r0x00017bdc:
  lVar1 = -1;
  if (((-1 < param_3) && (lVar1 = -1, param_3 <= in_x9 - (long)in_x11)) &&
     ((param_3 == 0 ||
      ((((param_5 >> 3 & 1) == 0 || (*(long *)(param_2 + 0x18) != 0)) &&
       (((param_5 >> 4 & 1) == 0 || (in_x10 != 0)))))))) {
    if ((param_5 >> 3 & 1) != 0) {
      *(long *)(param_2 + 0x18) = *(long *)(param_2 + 0x10) + param_3;
      *(long *)(param_2 + 0x20) = in_x9;
    }
    if ((param_5 >> 4 & 1) != 0) {
      *(long *)(param_2 + 0x30) = *(long *)(param_2 + 0x28) + param_3;
    }
    lVar1 = param_3;
  }
LAB_00017b98:
  param_1[0xd] = 0;
  param_1[0xc] = 0;
  param_1[0xf] = 0;
  param_1[0xe] = 0;
  param_1[9] = 0;
  param_1[8] = 0;
  param_1[0xb] = 0;
  param_1[10] = 0;
  param_1[5] = 0;
  param_1[4] = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  param_1[0x10] = lVar1;
  return;
}

