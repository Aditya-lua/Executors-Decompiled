
void FUN_00606bf8(ulong param_1)

{
  ulong *puVar1;
  long lVar2;
  ulong in_x9;
  long lVar3;
  ulong uVar4;
  long in_x10;
  ulong *in_x11;
  ulong uVar5;
  long *in_x12;
  ulong uVar6;
  ulong *in_x13;
  ulong in_x14;
  ulong uVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  
  while( true ) {
    uVar7 = in_x11[-1];
    uVar8 = (ulong)CARRY8(uVar7 + in_x14,unaff_x23);
    in_x12[-1] = uVar7 + in_x14 + unaff_x23;
    uVar5 = *in_x11 + *in_x13;
    unaff_x23 = (ulong)(CARRY8(uVar5,uVar8) || CARRY8(uVar5 + uVar8,(ulong)CARRY8(uVar7,in_x14)));
    if (CARRY8(*in_x11,*in_x13)) {
      unaff_x23 = unaff_x23 + 1;
    }
    param_1 = param_1 + 2;
    *in_x12 = uVar5 + uVar8 + (ulong)CARRY8(uVar7,in_x14);
    if (in_x9 <= param_1) break;
    in_x14 = in_x13[1];
    in_x11 = in_x11 + 2;
    in_x12 = in_x12 + 2;
    in_x13 = in_x13 + 2;
  }
  lVar3 = *(long *)(unaff_x21 + 0x18);
  lVar2 = *(long *)(unaff_x22 + 0x18);
  if (unaff_x20 != in_x10) {
    _memcpy(unaff_x20 + lVar3 * 8,in_x10 + lVar3 * 8,(lVar2 - lVar3) * 8);
    unaff_x20 = *(long *)(unaff_x19 + 0x20);
    lVar3 = *(long *)(unaff_x21 + 0x18);
    lVar2 = *(long *)(unaff_x22 + 0x18);
  }
  puVar1 = (ulong *)(unaff_x20 + lVar3 * 8);
  uVar5 = *puVar1;
  *puVar1 = uVar5 + unaff_x23;
  if (!CARRY8(uVar5,unaff_x23)) {
LAB_00606bb0:
    *(undefined4 *)(unaff_x19 + 0x28) = 0;
    return;
  }
  uVar5 = lVar2 - lVar3;
  if (1 < uVar5) {
    uVar7 = 2;
    uVar8 = 1;
    do {
      uVar4 = uVar7;
      uVar6 = puVar1[uVar8];
      puVar1[uVar8] = uVar6 + 1;
      uVar7 = (ulong)((int)uVar4 + 1);
      uVar8 = uVar4;
    } while ((uVar6 == 0xffffffffffffffff && uVar4 <= uVar5) &&
             (uVar6 != 0xffffffffffffffff || uVar5 != uVar4));
    if (uVar6 + 1 != 0) goto LAB_00606bb0;
  }
  uVar5 = *(ulong *)(unaff_x19 + 0x18);
  if (0 < (long)uVar5) {
    uVar7 = uVar5 * 2;
    func_0x006108a0(uVar7);
    lVar2 = func_0x006115d0(uVar5 << 4);
    if (lVar2 != 0) {
      uVar8 = uVar7;
      if (uVar5 <= uVar7) {
        uVar8 = uVar5;
      }
      _memcpy(lVar2,unaff_x20,uVar8 << 3);
    }
    do {
      *(undefined8 *)(unaff_x20 + uVar5 * 8 + -8) = 0;
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
    func_0x00611644(unaff_x20);
    *(long *)(unaff_x19 + 0x20) = lVar2;
    _bzero(lVar2 + *(long *)(unaff_x19 + 0x18) * 8,(uVar7 - *(long *)(unaff_x19 + 0x18)) * 8);
    unaff_x20 = *(long *)(unaff_x19 + 0x20);
    *(ulong *)(unaff_x19 + 0x18) = uVar7;
    uVar5 = uVar7;
  }
  *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
  *(undefined8 *)(unaff_x20 + (uVar5 & 0x3ffffffffffffffe) * 4) = 1;
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  return;
}

