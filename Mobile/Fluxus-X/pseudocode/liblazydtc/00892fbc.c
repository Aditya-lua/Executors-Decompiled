/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00892fbc
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00892fbc(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  ulong uVar5;
  ulong *puVar6;
  undefined8 uVar7;
  int *piVar8;
  int *piVar9;
  
  lVar1 = *(long *)(param_2 + 0x20);
  iVar4 = *(int *)(lVar1 + 8);
  while ((lVar1 == 0 || (iVar4 != DAT_00d1b010))) {
    if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
      return 0;
    }
    lVar1 = *(long *)(lVar1 + 0x20);
    iVar4 = *(int *)(lVar1 + 8);
  }
  if (*(long *)(param_1 + 0x138) == 0) {
    return 0;
  }
  uVar2 = *(ulong *)(lVar1 + 0x20);
  uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
  uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
  uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63;
  uVar5 = uVar3 >> ((ulong)*(byte *)(param_1 + 0x140) & 0x3f);
  if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) == 0) {
    return 0;
  }
  while (puVar6 = (ulong *)(*(long *)(param_1 + 0x110) + uVar5 * 0x28), *puVar6 != uVar2) {
    uVar5 = uVar5 + 1 & *(long *)(param_1 + 0x130) - 1U;
    if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) == 0) {
      return 0;
    }
  }
  if ((puVar6[4] & 1) != 0) {
    return 0;
  }
  uVar5 = puVar6[1];
  if (uVar5 == 0 || *(long *)(param_1 + 0x1e0) == 0) {
    return 0;
  }
  uVar3 = uVar3 >> ((ulong)*(byte *)(param_1 + 0x1e8) & 0x3f);
  if ((*(ulong *)(*(long *)(param_1 + 0x1d0) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) == 0) {
    return 0;
  }
  while (*(ulong *)(*(long *)(param_1 + 0x1b8) + uVar3 * 0x10) != uVar2) {
    uVar3 = uVar3 + 1 & *(long *)(param_1 + 0x1d8) - 1U;
    if ((*(ulong *)(*(long *)(param_1 + 0x1d0) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) == 0) {
      return 0;
    }
  }
  if (*(int *)(*(long *)(param_1 + 0x1b8) + uVar3 * 0x10 + 8) != 0) {
    return 0;
  }
  iVar4 = *(int *)(uVar5 + 8);
  while (iVar4 != DAT_00d1b080) {
    do {
      if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
        return 0;
      }
      uVar5 = *(ulong *)(uVar5 + 0x20);
      iVar4 = *(int *)(uVar5 + 8);
    } while (uVar5 == 0);
  }
  if (*(long *)(uVar5 + 0x28) == 0) {
    return 0;
  }
  piVar8 = *(int **)(uVar5 + 0x20);
  uVar7 = 0;
  piVar9 = piVar8 + *(long *)(uVar5 + 0x28) * 6;
  do {
    if (*piVar8 - 1U < 2) {
      if (*(long *)(param_1 + 0x170) != 0) {
        uVar2 = *(ulong *)(piVar8 + 2);
        uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
        uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
        uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x178) & 0x3f);
        if ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0)
        {
          do {
            puVar6 = (ulong *)(*(long *)(param_1 + 0x148) + uVar3 * 0x30);
            if (*puVar6 == uVar2) {
              if ((((int)puVar6[1] == 6) && (*(int *)((long)puVar6 + 0xc) != 0)) &&
                 (lVar1 = FUN_008530cc(*(undefined8 *)(param_1 + 0x638),puVar6[2]),
                 *(long *)(param_2 + 0x28) == lVar1)) {
                uVar7 = *(undefined8 *)(piVar8 + 4);
              }
              goto LAB_008931dc;
            }
            uVar3 = uVar3 + 1 & *(long *)(param_1 + 0x168) - 1U;
          } while ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1)
                   != 0);
        }
      }
      uVar7 = 0;
    }
LAB_008931dc:
    piVar8 = piVar8 + 6;
    if (piVar8 == piVar9) {
      return uVar7;
    }
  } while( true );
}

