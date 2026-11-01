
void FUN_0055f15c(undefined8 *param_1,ulong *param_2,long param_3)

{
  ulong *puVar1;
  undefined8 in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong *in_x15;
  long in_x16;
  char cVar2;
  ulong in_x17;
  ulong uVar3;
  
  do {
    cVar2 = in_x17 < in_x12;
    if (in_x12 < in_x17) {
      cVar2 = -1;
    }
LAB_0055f168:
    do {
      in_x16 = in_x16 + -0x18;
      in_x13 = in_x13 + 1;
      puVar1 = in_x15;
      if (cVar2 != '\x01') {
        if (cVar2 != '\0') goto LAB_0055f1bc;
        in_x9 = 0;
LAB_0055f1d4:
        param_1[2] = param_3;
        param_1[3] = in_x13;
        *param_1 = in_x9;
        param_1[1] = param_2;
        return;
      }
      while (in_x15 = puVar1 + 3, in_x16 == 0) {
        in_x13 = in_x14;
LAB_0055f1bc:
        if (param_3 == 0) goto LAB_0055f1d4;
        param_2 = (ulong *)param_2[in_x13 + 0x2e];
        param_3 = param_3 + -1;
        in_x14 = (ulong)*(ushort *)((long)param_2 + 0x16a);
        in_x13 = 0xffffffffffffffff;
        puVar1 = param_2;
        in_x16 = in_x14 * 0x18;
      }
      uVar3 = puVar1[1];
      cVar2 = uVar3 < in_x10;
      if (in_x10 < uVar3) {
        cVar2 = -1;
      }
    } while (in_x10 != uVar3);
    uVar3 = puVar1[2];
    if (in_x11 != uVar3) {
      cVar2 = (long)uVar3 <= (long)in_x11;
      if ((long)in_x11 < (long)uVar3) {
        cVar2 = -1;
      }
      goto LAB_0055f168;
    }
    in_x17 = *in_x15;
  } while( true );
}

