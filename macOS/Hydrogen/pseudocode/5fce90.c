
void FUN_005fce90(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong in_x9;
  ulong uVar3;
  long in_x10;
  ulong *in_x11;
  ulong uVar4;
  ulong uVar5;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  while( true ) {
    uVar4 = *(ulong *)(unaff_x20 + in_x10);
    uVar2 = *in_x11;
    uVar5 = (ulong)CARRY8(uVar4 + uVar2,in_x9);
    *in_x11 = uVar4 + uVar2 + in_x9;
    uVar3 = ((ulong *)(unaff_x20 + in_x10))[1];
    uVar1 = uVar3 + in_x11[1];
    in_x9 = (ulong)(CARRY8(uVar1,uVar5) || CARRY8(uVar1 + uVar5,(ulong)CARRY8(uVar4,uVar2)));
    if (CARRY8(uVar3,in_x11[1])) {
      in_x9 = in_x9 + 1;
    }
    in_x11[1] = uVar1 + uVar5 + (ulong)CARRY8(uVar4,uVar2);
    param_1 = param_1 + 2;
    if (unaff_x19 <= param_1) break;
    in_x10 = param_1 * 8;
    in_x11 = (ulong *)(unaff_x21 + in_x10);
  }
  return;
}

