
void FUN_005fc1a4(long param_1)

{
  ulong uVar1;
  undefined1 in_CY;
  int in_w9;
  ulong uVar2;
  int in_w10;
  ulong uVar3;
  ulong in_x11;
  long *in_x12;
  long *plVar4;
  ulong *in_x13;
  long in_x15;
  ulong uVar5;
  ulong in_x16;
  ulong unaff_x19;
  ulong *unaff_x23;
  
  while( true ) {
    if ((bool)in_CY) {
      in_x16 = in_x16 + 1;
    }
    plVar4 = in_x12 + 2;
    *in_x12 = in_x15;
    in_x11 = in_x11 + 2;
    if (unaff_x19 <= in_x11) break;
    uVar2 = in_x13[-1];
    uVar5 = *(ulong *)((long)plVar4 + param_1 + -8);
    uVar3 = (ulong)CARRY8(uVar5 + uVar2,in_x16);
    in_x12[1] = uVar5 + uVar2 + in_x16;
    uVar1 = plVar4[unaff_x19] + *in_x13;
    in_x15 = uVar1 + uVar3 + (ulong)CARRY8(uVar5,uVar2);
    in_x16 = (ulong)(CARRY8(uVar1,uVar3) || CARRY8(uVar1 + uVar3,(ulong)CARRY8(uVar5,uVar2)));
    in_CY = CARRY8(plVar4[unaff_x19],*in_x13);
    in_x12 = plVar4;
    in_x13 = in_x13 + 2;
  }
  uVar2 = *unaff_x23;
  uVar1 = (ulong)(in_w9 + in_w10 + (int)in_x16);
  *unaff_x23 = uVar2 + uVar1;
  if (CARRY8(uVar2,uVar1)) {
    uVar1 = 2;
    uVar2 = 1;
    do {
      uVar5 = uVar1;
      uVar3 = unaff_x23[uVar2];
      unaff_x23[uVar2] = uVar3 + 1;
      uVar1 = (ulong)((int)uVar5 + 1);
      uVar2 = uVar5;
    } while ((uVar3 == 0xffffffffffffffff && uVar5 <= unaff_x19) &&
             (uVar3 != 0xffffffffffffffff || unaff_x19 != uVar5));
  }
  return;
}

