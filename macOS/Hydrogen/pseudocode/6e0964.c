
ulong * FUN_006e0964(long param_1)

{
  ulong uVar1;
  long in_x9;
  ulong uVar2;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  long in_x14;
  ulong uVar3;
  ulong *puVar4;
  ulong in_x15;
  long lVar5;
  long *unaff_x19;
  ulong *unaff_x20;
  
  for (; lVar5 = *(long *)(in_x13 + in_x15 * in_x14), lVar5 != in_x9;
      in_x15 = in_x11 + in_x15 & in_x12) {
    in_x11 = in_x11 + 1;
    if (lVar5 == in_x10 || in_x12 < in_x11) {
      func_0x006e0a14();
      param_1 = unaff_x19[1];
      break;
    }
  }
  uVar2 = 0;
  uVar1 = *unaff_x20;
  uVar3 = uVar1 >> 4 ^ uVar1 >> 9;
  do {
    uVar3 = uVar3 & param_1 - 1U;
    puVar4 = (ulong *)(*unaff_x19 + uVar3 * 0x18);
    if (*puVar4 == unaff_x19[3]) {
      *puVar4 = uVar1;
      unaff_x19[2] = unaff_x19[2] + 1;
      return puVar4 + 1;
    }
    if (*puVar4 == uVar1) goto LAB_006e09e4;
    uVar2 = uVar2 + 1;
    uVar3 = uVar2 + uVar3;
  } while (uVar2 <= param_1 - 1U);
  puVar4 = (ulong *)0x0;
LAB_006e09e4:
  return puVar4 + 1;
}

