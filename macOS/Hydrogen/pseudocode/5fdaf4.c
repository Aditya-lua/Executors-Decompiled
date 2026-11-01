
void FUN_005fdaf4(byte *param_1,byte *param_2,long param_3)

{
  ulong *puVar1;
  ulong *puVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x19;
  long unaff_x20;
  
  if (param_1 != param_2) {
    _memcpy(param_1,param_2,unaff_x19 << 3);
  }
  if ((param_3 != 0) && (unaff_x19 != 0)) {
    lVar3 = (unaff_x19 - 1) * 8;
    do {
      if ((*param_1 & 1) == 0) {
        uVar4 = 0;
        uVar6 = unaff_x19;
        do {
          uVar7 = *(ulong *)(param_1 + uVar6 * 8 + -8);
          *(ulong *)(param_1 + uVar6 * 8 + -8) = uVar4 | uVar7 >> 1;
          uVar4 = uVar7 << 0x3f;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      else {
        uVar4 = 0;
        uVar6 = 0;
        do {
          puVar1 = (ulong *)(param_1 + uVar6 * 8);
          puVar2 = (ulong *)(unaff_x20 + uVar6 * 8);
          uVar8 = *puVar2;
          uVar9 = *puVar1;
          uVar10 = (ulong)CARRY8(uVar8 + uVar9,uVar4);
          *puVar1 = uVar8 + uVar9 + uVar4;
          uVar5 = puVar2[1];
          uVar7 = uVar5 + puVar1[1];
          uVar4 = (ulong)(CARRY8(uVar7,uVar10) || CARRY8(uVar7 + uVar10,(ulong)CARRY8(uVar8,uVar9)))
          ;
          if (CARRY8(uVar5,puVar1[1])) {
            uVar4 = uVar4 + 1;
          }
          puVar1[1] = uVar7 + uVar10 + (ulong)CARRY8(uVar8,uVar9);
          uVar6 = uVar6 + 2;
        } while (uVar6 < unaff_x19);
        uVar7 = 0;
        uVar6 = unaff_x19;
        do {
          uVar9 = *(ulong *)(param_1 + uVar6 * 8 + -8);
          *(ulong *)(param_1 + uVar6 * 8 + -8) = uVar7 | uVar9 >> 1;
          uVar7 = uVar9 << 0x3f;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
        *(ulong *)(param_1 + lVar3) = *(long *)(param_1 + lVar3) + (uVar4 << 0x3f);
      }
      param_3 = param_3 + -1;
    } while (param_3 != 0);
  }
  return;
}

