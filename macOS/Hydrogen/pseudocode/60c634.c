
void FUN_0060c634(long param_1,undefined8 param_2,long param_3)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong in_x9;
  ulong uVar5;
  ulong in_x10;
  ulong uVar6;
  ulong *in_x11;
  long lVar7;
  ulong *in_x12;
  ulong uVar8;
  ulong uVar9;
  ulong *in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong uVar10;
  ulong uVar11;
  long unaff_x20;
  
  while( true ) {
    *in_x11 = in_x15;
    if (in_x9 <= in_x10) break;
    uVar8 = in_x13[-1];
    uVar11 = in_x12[-1];
    uVar5 = uVar8 - uVar11;
    in_x11[1] = uVar5 - in_x14;
    uVar6 = *in_x13 - *in_x12;
    in_x15 = (-(ulong)(uVar5 < in_x14) - (ulong)(uVar8 < uVar11)) + uVar6;
    in_x14 = (ulong)(uVar6 < in_x15);
    if (*in_x13 < *in_x12) {
      in_x14 = in_x14 + 1;
    }
    in_x10 = in_x10 + 2;
    in_x11 = in_x11 + 2;
    in_x12 = in_x12 + 2;
    in_x13 = in_x13 + 2;
  }
  if ((in_x14 != 0) && (uVar5 = *(ulong *)(param_3 + 0x18), uVar5 != 0)) {
    uVar8 = 0;
    uVar6 = 0;
    lVar7 = *(long *)(unaff_x20 + 0x38);
    do {
      puVar1 = (ulong *)(param_1 + uVar6 * 8);
      puVar2 = (ulong *)(lVar7 + uVar6 * 8);
      uVar10 = *puVar2;
      uVar3 = *puVar1;
      uVar4 = (ulong)CARRY8(uVar10 + uVar3,uVar8);
      *puVar1 = uVar10 + uVar3 + uVar8;
      uVar9 = puVar2[1];
      uVar11 = uVar9 + puVar1[1];
      uVar8 = (ulong)(CARRY8(uVar11,uVar4) || CARRY8(uVar11 + uVar4,(ulong)CARRY8(uVar10,uVar3)));
      if (CARRY8(uVar9,puVar1[1])) {
        uVar8 = uVar8 + 1;
      }
      puVar1[1] = uVar11 + uVar4 + (ulong)CARRY8(uVar10,uVar3);
      uVar6 = uVar6 + 2;
    } while (uVar6 < uVar5);
  }
  return;
}

