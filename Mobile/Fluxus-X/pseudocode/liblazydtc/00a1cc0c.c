/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1cc0c
 */

undefined8 FUN_00a1cc0c(long *param_1,uint param_2,ulong *param_3,uint param_4,uint param_5)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  uint uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  uint uVar10;
  
  lVar4 = bn_wexpand();
  uVar5 = 0;
  if (lVar4 != 0) {
    uVar2 = 1 << (ulong)(param_5 & 0x1f);
    if ((int)param_5 < 4) {
      if (0 < (int)param_2) {
        uVar8 = 0;
        do {
          lVar4 = 0;
          uVar9 = 0;
          do {
            uVar10 = (uint)lVar4;
            puVar7 = param_3 + lVar4;
            lVar4 = lVar4 + 1;
            uVar9 = *puVar7 & -(ulong)(((uVar10 ^ param_4) - 1 & (param_4 ^ 0x80000000)) >> 0x1f) |
                    uVar9;
          } while (lVar4 < (int)uVar2);
          param_3 = (ulong *)((long)param_3 +
                             (-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3));
          *(ulong *)(*param_1 + uVar8 * 8) = uVar9;
          uVar8 = uVar8 + 1;
        } while (uVar8 != param_2);
      }
    }
    else if (0 < (int)param_2) {
      param_5 = param_5 - 2;
      iVar3 = 1 << (ulong)(param_5 & 0x1f);
      uVar10 = (int)param_4 >> (param_5 & 0x1f);
      uVar1 = uVar10 ^ 0x80000000;
      param_4 = iVar3 - 1U & param_4;
      uVar8 = 0;
      do {
        uVar9 = 0;
        if (param_5 != 0x1f) {
          lVar4 = 0;
          uVar9 = 0;
          puVar7 = param_3;
          do {
            uVar6 = (uint)lVar4;
            lVar4 = lVar4 + 1;
            uVar9 = (puVar7[iVar3] & -(ulong)(((uVar10 ^ 1) - 1 & uVar1) >> 0x1f) |
                     *puVar7 & -(ulong)((uVar10 - 1 & uVar1) >> 0x1f) |
                     puVar7[iVar3 << 1] & -(ulong)(((uVar10 ^ 2) - 1 & uVar1) >> 0x1f) |
                    puVar7[3 << (ulong)(param_5 & 0x1f)] &
                    -(ulong)(((uVar10 ^ 3) - 1 & uVar1) >> 0x1f)) &
                    -(ulong)(((param_4 ^ uVar6) - 1 & (param_4 ^ 0x80000000)) >> 0x1f) | uVar9;
            puVar7 = puVar7 + 1;
          } while (lVar4 < iVar3);
        }
        param_3 = (ulong *)((long)param_3 +
                           (-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3));
        *(ulong *)(*param_1 + uVar8 * 8) = uVar9;
        uVar8 = uVar8 + 1;
      } while (uVar8 != param_2);
    }
    uVar5 = 1;
    *(uint *)(param_1 + 1) = param_2;
  }
  return uVar5;
}

