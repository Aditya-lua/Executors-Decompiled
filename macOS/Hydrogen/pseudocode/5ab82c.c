
undefined8 FUN_005ab82c(int *param_1)

{
  bool bVar1;
  bool bVar2;
  long in_x9;
  int in_w10;
  int in_w11;
  int in_w12;
  uint in_w13;
  ulong in_x14;
  ulong in_x15;
  
  if (in_x14 == (in_x15 & 0xffff | 0x6e6f6974636e0000)) {
    return 0;
  }
  if (in_w12 == 0) {
    bVar1 = false;
    bVar2 = false;
    if ((in_w13 & 1) == 0) goto joined_r0x005ab8c8;
  }
  else {
    if ((short)*param_1 == 0x6669) {
      return 0;
    }
    if ((short)*param_1 == 0x6e69) {
      return 0;
    }
    bVar1 = true;
    if (in_w13 == 0) {
      bVar2 = false;
      goto joined_r0x005ab8c8;
    }
  }
  if (*param_1 == 0x61636f6c && (char)param_1[1] == 'l') {
    return 0;
  }
  bVar2 = true;
joined_r0x005ab8c8:
  if ((((((in_x9 == 3) &&
         (((short)*param_1 == 0x696e && *(char *)((long)param_1 + 2) == 'l' ||
          ((short)*param_1 == 0x6f6e && *(char *)((long)param_1 + 2) == 't')))) ||
        ((bVar1 && ((short)*param_1 == 0x726f)))) ||
       ((in_w11 != 0 &&
        ((*param_1 == 0x65706572 && (short)param_1[1] == 0x7461 ||
         (*param_1 == 0x75746572 && (short)param_1[1] == 0x6e72)))))) ||
      ((in_w10 != 0 && ((*param_1 == 0x6e656874 || (*param_1 == 0x65757274)))))) ||
     ((bVar2 && ((*param_1 == 0x69746e75 && (char)param_1[1] == 'l' ||
                 (*param_1 == 0x6c696877 && (char)param_1[1] == 'e')))))) {
    return 0;
  }
  return 1;
}

