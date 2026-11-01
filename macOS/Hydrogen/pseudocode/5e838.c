
undefined8 FUN_0005e838(long *param_1,undefined8 param_2)

{
  long *plVar1;
  long *in_x9;
  long in_x10;
  ulong in_x11;
  long in_x12;
  long in_x13;
  long lVar2;
  long in_x14;
  long in_x16;
  
  do {
    in_x11 = in_x11 + 1;
    plVar1 = param_1;
    lVar2 = in_x14;
    if (2 < in_x11) {
      return 1;
    }
    do {
      if (in_x13 <= in_x16) {
        in_x13 = in_x16;
      }
      param_1 = plVar1 + 2;
      if (param_1 == in_x9) {
        return 0;
      }
      in_x14 = *param_1;
      in_x16 = plVar1[3];
      if (in_x14 == -1 && in_x16 == -1) {
        in_x14 = 0;
        *param_1 = 0;
code_r0x0005e7ec:
        plVar1[3] = in_x12;
        in_x16 = in_x12;
      }
      else if (in_x14 == -1) {
        in_x14 = in_x10 - in_x16;
        *param_1 = in_x14;
        plVar1[3] = in_x12;
        in_x16 = in_x12;
        if (in_x12 == -1 || in_x10 <= in_x12) goto code_r0x0005e7ec;
      }
      else if (in_x16 == -1 || in_x10 <= in_x16) goto code_r0x0005e7ec;
      if (in_x14 < 0) {
        return 1;
      }
      if (((in_x14 <= lVar2) || (in_x16 < in_x14)) || (in_x10 <= in_x16)) {
        return param_2;
      }
      plVar1 = param_1;
      lVar2 = in_x14;
    } while (in_x13 < in_x14);
  } while( true );
}

