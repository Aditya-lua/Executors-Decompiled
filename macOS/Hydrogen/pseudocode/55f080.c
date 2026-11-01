
void FUN_0055f080(undefined8 *param_1,long param_2,long param_3)

{
  char cVar1;
  ulong uVar2;
  undefined8 in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong *puVar3;
  long lVar4;
  
  while( true ) {
    param_2 = *(long *)(param_2 + in_x11 * 8 + 0x1c8);
    param_3 = param_3 + -1;
    lVar4 = (ulong)*(ushort *)(param_2 + 0x1c2) * 0x18;
    in_x11 = 0xffffffffffffffff;
    puVar3 = (ulong *)(param_2 + 0xb8);
    do {
      uVar2 = (ulong)*(ushort *)(param_2 + 0x1c2);
      if (lVar4 == 0) goto joined_r0x0055f07c;
      cVar1 = *puVar3 < in_x10;
      if (in_x10 < *puVar3) {
        cVar1 = -1;
      }
      lVar4 = lVar4 + -0x18;
      in_x11 = in_x11 + 1;
      puVar3 = puVar3 + 3;
    } while (cVar1 == '\x01');
    uVar2 = in_x11;
    if (cVar1 == '\0') break;
joined_r0x0055f07c:
    in_x11 = uVar2;
    if (param_3 == 0) {
code_r0x0055f094:
      param_1[2] = param_3;
      param_1[3] = in_x11;
      *param_1 = in_x9;
      param_1[1] = param_2;
      return;
    }
  }
  in_x9 = 0;
  goto code_r0x0055f094;
}

