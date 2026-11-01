
void FUN_0055f0f0(undefined8 *param_1,long param_2,long param_3)

{
  undefined8 in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong *in_x15;
  long in_x16;
  char cVar1;
  ulong uVar2;
  
code_r0x0055f0f0:
  if (in_x16 != 0) goto code_r0x0055f0f4;
  in_x13 = in_x14;
  goto code_r0x0055f12c;
code_r0x0055f0f4:
  uVar2 = in_x15[-2];
  cVar1 = uVar2 < in_x10;
  if (in_x10 < uVar2) {
    cVar1 = -1;
  }
  if (in_x10 == uVar2) {
    uVar2 = in_x15[-1];
    if (in_x11 == uVar2) {
      cVar1 = *in_x15 < in_x12;
      if (in_x12 < *in_x15) {
        cVar1 = -1;
      }
    }
    else {
      cVar1 = (long)uVar2 <= (long)in_x11;
      if ((long)in_x11 < (long)uVar2) {
        cVar1 = -1;
      }
    }
  }
  in_x15 = in_x15 + 3;
  in_x16 = in_x16 + -0x18;
  in_x13 = in_x13 + 1;
  if (cVar1 != '\x01') {
    if (cVar1 == '\0') {
      in_x9 = 0;
LAB_0055f1d4:
      param_1[2] = param_3;
      param_1[3] = in_x13;
      *param_1 = in_x9;
      param_1[1] = param_2;
      return;
    }
code_r0x0055f12c:
    if (param_3 == 0) goto LAB_0055f1d4;
    param_2 = *(long *)(param_2 + in_x13 * 8 + 0x170);
    param_3 = param_3 + -1;
    in_x14 = (ulong)*(ushort *)(param_2 + 0x16a);
    in_x15 = (ulong *)(param_2 + 0x18);
    in_x16 = in_x14 * 0x18;
    in_x13 = 0xffffffffffffffff;
  }
  goto code_r0x0055f0f0;
}

