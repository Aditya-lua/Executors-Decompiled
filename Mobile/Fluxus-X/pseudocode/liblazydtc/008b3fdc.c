/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3fdc
 */

void FUN_008b3fdc(long param_1,int param_2,int param_3)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  undefined4 *puVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  undefined1 auVar11 [16];
  
  if (0x4000000 < param_2) {
    if (param_3 != 0) {
      auVar11 = *(undefined1 (*) [16])(*(long *)(param_1 + 0x50) + -0x20);
      *(long *)(param_1 + 0x50) = *(long *)(param_1 + 0x50) + -0x30;
      auVar11 = NEON_ext(auVar11,auVar11,8,1);
      *(long *)(param_1 + 0x70) = auVar11._8_8_;
      *(long *)(param_1 + 0x68) = auVar11._0_8_;
    }
                    /* WARNING: Subroutine does not return */
    FUN_008b3f9c(param_1,4);
  }
  if (param_2 < -5) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  lVar9 = *(long *)(param_1 + 0x58);
  uVar1 = param_2 + 5;
  uVar10 = (ulong)uVar1;
  lVar2 = FUN_008b8498(param_1,lVar9,(long)*(int *)(param_1 + 0x40) << 4,uVar10 << 4,
                       *(undefined1 *)(param_1 + 1));
  lVar7 = (long)*(int *)(param_1 + 0x40);
  *(long *)(param_1 + 0x58) = lVar2;
  if (*(int *)(param_1 + 0x40) < (int)uVar1) {
    uVar3 = uVar10 - lVar7;
    if (1 < uVar3) {
      lVar5 = lVar7 * 0x10;
      uVar6 = uVar3 & 0xfffffffffffffffe;
      lVar7 = uVar6 + lVar7;
      puVar4 = (undefined4 *)(lVar2 + lVar5 + 0x1c);
      uVar8 = uVar6;
      do {
        uVar8 = uVar8 - 2;
        puVar4[-4] = 0;
        *puVar4 = 0;
        puVar4 = puVar4 + 8;
      } while (uVar8 != 0);
      if (uVar3 == uVar6) goto LAB_008b4094;
    }
    lVar5 = uVar10 - lVar7;
    puVar4 = (undefined4 *)(lVar2 + lVar7 * 0x10 + 0xc);
    do {
      lVar5 = lVar5 + -1;
      *puVar4 = 0;
      puVar4 = puVar4 + 4;
    } while (lVar5 != 0);
  }
LAB_008b4094:
  *(uint *)(param_1 + 0x40) = uVar1;
  lVar7 = *(long *)(param_1 + 0x30);
  *(long *)(param_1 + 0x48) = lVar2 + (long)param_2 * 0x10;
  *(long *)(param_1 + 0x68) = lVar2 + (*(long *)(param_1 + 0x68) - lVar9);
  for (; lVar7 != 0; lVar7 = *(long *)(lVar7 + 0x20)) {
    *(long *)(lVar7 + 8) = lVar2 + (*(long *)(lVar7 + 8) - lVar9);
  }
  uVar3 = *(ulong *)(param_1 + 0x50);
  for (uVar10 = *(ulong *)(param_1 + 0x20); uVar10 <= uVar3; uVar10 = uVar10 + 0x30) {
    *(long *)(uVar10 + 0x10) = lVar2 + (*(long *)(uVar10 + 0x10) - lVar9);
    *(long *)(uVar10 + 0x18) = lVar2 + (*(long *)(uVar10 + 0x18) - lVar9);
    *(long *)(uVar10 + 8) = lVar2 + (*(long *)(uVar10 + 8) - lVar9);
  }
  *(long *)(param_1 + 0x70) = lVar2 + (*(long *)(param_1 + 0x70) - lVar9);
  return;
}

