
void FUN_006ee010(long param_1)

{
  uint uVar1;
  long lVar2;
  long *plVar3;
  ulong uVar4;
  undefined4 *puVar5;
  long *plVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long unaff_x22;
  uint unaff_w23;
  
  *(long *)(unaff_x19 + 0x30) = param_1;
  uVar1 = *(uint *)(unaff_x19 + 0x48) ^ unaff_w23;
  if ((int)uVar1 < (int)(uint)unaff_x22) {
    lVar8 = (long)(int)uVar1;
    uVar4 = unaff_x22 - lVar8;
    lVar2 = lVar8;
    if (3 < uVar4) {
      uVar7 = uVar4 & 0xfffffffffffffffc;
      lVar2 = uVar7 + lVar8;
      puVar5 = (undefined4 *)(param_1 + lVar8 * 0x10 + 0x2c);
      uVar9 = uVar7;
      do {
        puVar5[-8] = 0;
        puVar5[-4] = 0;
        *puVar5 = 0;
        puVar5[4] = 0;
        puVar5 = puVar5 + 0x10;
        uVar9 = uVar9 - 4;
      } while (uVar9 != 0);
      if (uVar4 == uVar7) goto LAB_006ee088;
    }
    lVar8 = unaff_x22 - lVar2;
    puVar5 = (undefined4 *)(param_1 + lVar2 * 0x10 + 0xc);
    do {
      *puVar5 = 0;
      lVar8 = lVar8 + -1;
      puVar5 = puVar5 + 4;
    } while (lVar8 != 0);
  }
LAB_006ee088:
  *(uint *)(unaff_x19 + 0x48) = (uint)unaff_x22 ^ unaff_w23;
  *(long *)(unaff_x19 + 0x28) = param_1 + (long)unaff_w21 * 0x10;
  *(long *)(unaff_x19 + 8) = param_1 + (*(long *)(unaff_x19 + 8) - unaff_x20);
  for (lVar2 = *(long *)(unaff_x19 + 0x60); lVar2 != 0; lVar2 = *(long *)(lVar2 + 0x20)) {
    *(long *)(lVar2 + 8) = param_1 + (*(long *)(lVar2 + 8) - unaff_x20);
  }
  plVar6 = *(long **)(unaff_x19 + 0x20);
  for (plVar3 = *(long **)(unaff_x19 + 0x40); plVar3 <= plVar6; plVar3 = plVar3 + 5) {
    plVar3[2] = param_1 + (plVar3[2] - unaff_x20);
    *plVar3 = param_1 + (*plVar3 - unaff_x20);
    plVar3[1] = param_1 + (plVar3[1] - unaff_x20);
  }
  *(long *)(unaff_x19 + 0x10) = param_1 + (*(long *)(unaff_x19 + 0x10) - unaff_x20);
  return;
}

