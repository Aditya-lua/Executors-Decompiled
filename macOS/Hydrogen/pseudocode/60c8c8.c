
void FUN_0060c8c8(ulong param_1,long param_2)

{
  ulong *puVar1;
  ulong *puVar2;
  long *plVar3;
  ulong uVar4;
  ulong in_x9;
  long lVar5;
  ulong uVar6;
  long in_x10;
  long lVar7;
  ulong uVar8;
  ulong in_x11;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x19;
  long unaff_x20;
  
  while (in_x9 = in_x9 + 2, in_x9 < param_1) {
    puVar1 = (ulong *)(param_2 + in_x9 * 8);
    puVar2 = (ulong *)(in_x10 + in_x9 * 8);
    uVar11 = *puVar2;
    uVar6 = *puVar1;
    uVar4 = uVar6 - uVar11;
    *puVar1 = uVar4 - in_x11;
    uVar8 = puVar2[1];
    uVar10 = puVar1[1] - uVar8;
    uVar6 = (-(ulong)(uVar4 < in_x11) - (ulong)(uVar6 < uVar11)) + uVar10;
    in_x11 = (ulong)(uVar10 < uVar6);
    if (puVar1[1] < uVar8) {
      in_x11 = in_x11 + 1;
    }
    puVar1[1] = uVar6;
  }
  if (in_x11 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x18);
    plVar3 = (long *)(param_2 + lVar5 * 8);
    lVar7 = *(long *)(unaff_x20 + 0x30);
    lVar9 = *plVar3;
    *plVar3 = lVar9 + -1;
    if ((lVar9 == 0) && (uVar6 = lVar7 - lVar5, 1 < uVar6)) {
      uVar4 = 2;
      uVar10 = 1;
      do {
        uVar8 = uVar4;
        lVar5 = plVar3[uVar10];
        plVar3[uVar10] = lVar5 + -1;
        uVar4 = (ulong)((int)uVar8 + 1);
        uVar10 = uVar8;
      } while ((lVar5 == 0 && uVar8 <= uVar6) && (lVar5 != 0 || uVar6 != uVar8));
    }
  }
  return;
}

