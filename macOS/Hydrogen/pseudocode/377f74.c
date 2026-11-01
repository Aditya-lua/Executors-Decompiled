
void FUN_00377f74(ulong param_1)

{
  ulong uVar1;
  byte in_CY;
  long *in_x5;
  long in_x9;
  ulong uVar2;
  ulong uVar3;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong uVar4;
  ulong in_x14;
  ulong uVar5;
  ulong uVar6;
  long in_x15;
  long in_x17;
  ulong in_d27;
  long in_register_00005368;
  
  uVar5 = in_x14 + param_1 + (ulong)in_CY;
  uVar1 = in_x13 + uVar5;
  uVar6 = in_x10 * in_x17 + in_x9 +
          (ulong)(CARRY8(in_x14,param_1) || CARRY8(in_x14 + param_1,(ulong)in_CY)) +
          (ulong)CARRY8(in_x13,uVar5);
  uVar4 = uVar1 >> 2 | uVar6 << 0x3e;
  uVar5 = (uVar1 & 0xfffffffffffffffc) + in_x11;
  uVar2 = uVar6 + (uVar6 >> 2) + (ulong)CARRY8(uVar1 & 0xfffffffffffffffc,in_x11);
  uVar6 = uVar5 + uVar4;
  uVar3 = uVar2 + in_x12 + (ulong)CARRY8(uVar5,uVar4);
  uVar4 = (uVar1 & 3) +
          (ulong)(CARRY8(uVar2,in_x12) || CARRY8(uVar2 + in_x12,(ulong)CARRY8(uVar5,uVar4)));
  uVar1 = ~-in_x15;
  uVar5 = uVar3 - (-in_x15 + (ulong)(0xfffffffffffffffa >= uVar6));
  uVar2 = uVar6 + 5;
  if (uVar4 < 4 &&
      !CARRY8(uVar4 - 4,
              (ulong)(CARRY8(uVar3,uVar1) ||
                     CARRY8(uVar3 + uVar1,(ulong)(0xfffffffffffffffa < uVar6))))) {
    uVar5 = uVar3;
    uVar2 = uVar6;
  }
  *in_x5 = uVar2 + in_d27;
  in_x5[1] = uVar5 + in_register_00005368 + (ulong)CARRY8(uVar2,in_d27);
  return;
}

