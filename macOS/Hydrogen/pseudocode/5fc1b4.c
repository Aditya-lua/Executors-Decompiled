
void FUN_005fc1b4(long param_1)

{
  ulong uVar1;
  undefined1 in_CY;
  int in_w9;
  ulong uVar2;
  int in_w10;
  ulong uVar3;
  ulong in_x11;
  long *in_x12;
  ulong *in_x13;
  ulong in_x14;
  ulong uVar4;
  ulong unaff_x19;
  ulong *unaff_x23;
  
  while (!(bool)in_CY) {
    uVar2 = in_x13[-1];
    uVar4 = *(ulong *)((long)in_x12 + param_1 + -8);
    uVar3 = (ulong)CARRY8(uVar4 + uVar2,in_x14);
    in_x12[-1] = uVar4 + uVar2 + in_x14;
    uVar1 = in_x12[unaff_x19] + *in_x13;
    in_x14 = (ulong)(CARRY8(uVar1,uVar3) || CARRY8(uVar1 + uVar3,(ulong)CARRY8(uVar4,uVar2)));
    if (CARRY8(in_x12[unaff_x19],*in_x13)) {
      in_x14 = in_x14 + 1;
    }
    *in_x12 = uVar1 + uVar3 + (ulong)CARRY8(uVar4,uVar2);
    in_x11 = in_x11 + 2;
    in_x12 = in_x12 + 2;
    in_x13 = in_x13 + 2;
    in_CY = unaff_x19 <= in_x11;
  }
  uVar2 = *unaff_x23;
  uVar1 = (ulong)(in_w9 + in_w10 + (int)in_x14);
  *unaff_x23 = uVar2 + uVar1;
  if (CARRY8(uVar2,uVar1)) {
    uVar1 = 2;
    uVar2 = 1;
    do {
      uVar4 = uVar1;
      uVar3 = unaff_x23[uVar2];
      unaff_x23[uVar2] = uVar3 + 1;
      uVar1 = (ulong)((int)uVar4 + 1);
      uVar2 = uVar4;
    } while ((uVar3 == 0xffffffffffffffff && uVar4 <= unaff_x19) &&
             (uVar3 != 0xffffffffffffffff || unaff_x19 != uVar4));
  }
  return;
}

