
void FUN_005fc19c(long param_1,ulong param_2)

{
  byte in_CY;
  int in_w9;
  ulong uVar1;
  int in_w10;
  ulong uVar2;
  ulong in_x11;
  long *in_x12;
  long *plVar3;
  ulong *in_x13;
  ulong in_x14;
  long in_x15;
  ulong uVar4;
  ulong uVar5;
  ulong unaff_x19;
  ulong *unaff_x23;
  
  while( true ) {
    uVar5 = (ulong)in_CY;
    if (CARRY8(in_x14,param_2)) {
      uVar5 = uVar5 + 1;
    }
    plVar3 = in_x12 + 2;
    *in_x12 = in_x15;
    in_x11 = in_x11 + 2;
    if (unaff_x19 <= in_x11) break;
    uVar1 = in_x13[-1];
    uVar4 = *(ulong *)((long)plVar3 + param_1 + -8);
    uVar2 = (ulong)CARRY8(uVar4 + uVar1,uVar5);
    in_x12[1] = uVar4 + uVar1 + uVar5;
    in_x14 = plVar3[unaff_x19];
    param_2 = *in_x13;
    uVar5 = in_x14 + param_2;
    in_CY = CARRY8(uVar5,uVar2) || CARRY8(uVar5 + uVar2,(ulong)CARRY8(uVar4,uVar1));
    in_x15 = uVar5 + uVar2 + (ulong)CARRY8(uVar4,uVar1);
    in_x12 = plVar3;
    in_x13 = in_x13 + 2;
  }
  uVar1 = *unaff_x23;
  uVar5 = (ulong)(in_w9 + in_w10 + (int)uVar5);
  *unaff_x23 = uVar1 + uVar5;
  if (CARRY8(uVar1,uVar5)) {
    uVar5 = 2;
    uVar1 = 1;
    do {
      uVar4 = uVar5;
      uVar2 = unaff_x23[uVar1];
      unaff_x23[uVar1] = uVar2 + 1;
      uVar5 = (ulong)((int)uVar4 + 1);
      uVar1 = uVar4;
    } while ((uVar2 == 0xffffffffffffffff && uVar4 <= unaff_x19) &&
             (uVar2 != 0xffffffffffffffff || unaff_x19 != uVar4));
  }
  return;
}

