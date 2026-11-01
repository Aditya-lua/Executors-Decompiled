
void FUN_0055f034(undefined8 *param_1,long param_2,long param_3)

{
  char cVar1;
  ulong uVar2;
  undefined8 in_x9;
  ulong in_x10;
  ulong uVar3;
  ulong *in_x12;
  long lVar4;
  
  while( true ) {
    lVar4 = (ulong)*(ushort *)(param_2 + 0x1c2) * 0x18;
    uVar3 = 0xffffffffffffffff;
    do {
      uVar2 = (ulong)*(ushort *)(param_2 + 0x1c2);
      if (lVar4 == 0) goto joined_r0x0055f07c;
      cVar1 = *in_x12 < in_x10;
      if (in_x10 < *in_x12) {
        cVar1 = -1;
      }
      lVar4 = lVar4 + -0x18;
      uVar3 = uVar3 + 1;
      in_x12 = in_x12 + 3;
    } while (cVar1 == '\x01');
    uVar2 = uVar3;
    if (cVar1 == '\0') break;
joined_r0x0055f07c:
    uVar3 = uVar2;
    if (param_3 == 0) goto LAB_0055f094;
    param_2 = *(long *)(param_2 + uVar3 * 8 + 0x1c8);
    param_3 = param_3 + -1;
    in_x12 = (ulong *)(param_2 + 0xb8);
  }
  in_x9 = 0;
LAB_0055f094:
  param_1[2] = param_3;
  param_1[3] = uVar3;
  *param_1 = in_x9;
  param_1[1] = param_2;
  return;
}

