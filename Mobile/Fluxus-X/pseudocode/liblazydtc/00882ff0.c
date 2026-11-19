/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00882ff0
 */

/* WARNING: Removing unreachable block (ram,0x008830dc) */

void FUN_00882ff0(long *param_1)

{
  void *pvVar1;
  ulong *puVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  uVar4 = param_1[2];
  if (uVar4 != 0) {
    puVar2 = (ulong *)param_1[3];
    uVar8 = *puVar2;
    if (uVar8 == 0) {
      uVar5 = 0;
      do {
        if (uVar4 - 1 == uVar5) goto LAB_008830e0;
        uVar8 = puVar2[uVar5 + 1];
        uVar5 = uVar5 + 1;
      } while (uVar8 == 0);
    }
    else {
      uVar5 = 0;
    }
    uVar9 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
    uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
    uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
    uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
    uVar9 = LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) | uVar5 << 6;
    do {
      do {
        lVar3 = *param_1 + uVar9 * 0x50;
        pvVar1 = *(void **)(lVar3 + 0x10);
        if (pvVar1 != (void *)0x0) {
          *(void **)(lVar3 + 0x18) = pvVar1;
          operator_delete(pvVar1,*(long *)(lVar3 + 0x20) - (long)pvVar1);
        }
        uVar8 = uVar8 - 1 & uVar8;
        if (uVar8 == 0) {
          uVar6 = uVar5;
          uVar7 = uVar4;
          if (uVar4 <= uVar5 + 1) {
            uVar7 = uVar5 + 1;
          }
          do {
            uVar5 = uVar6 + 1;
            if (uVar4 <= uVar5) {
              uVar8 = 0;
              goto LAB_008830c4;
            }
            uVar8 = puVar2[uVar6 + 1];
            uVar6 = uVar5;
          } while (uVar8 == 0);
        }
        uVar9 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
        uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
        uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar9 = LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) | uVar5 << 6;
        uVar7 = uVar5;
      } while (uVar8 != 0);
LAB_008830c4:
      uVar5 = uVar7;
    } while (uVar7 != uVar4);
  }
LAB_008830e0:
  operator_delete((void *)*param_1);
  *param_1 = 0;
  operator_delete((void *)param_1[3]);
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[4] = 0;
  *(undefined1 *)(param_1 + 6) = 0x40;
  return;
}

