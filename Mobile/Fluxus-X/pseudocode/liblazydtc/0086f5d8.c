/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f5d8
 */

/* WARNING: Removing unreachable block (ram,0x0086f754) */

void FUN_0086f5d8(long *param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  void *pvVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 uVar13;
  
  param_1[4] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  lVar1 = param_2[4];
  lVar2 = param_2[5];
  *(char *)(param_1 + 6) = (char)param_2[6];
  param_1[5] = lVar2;
  if (lVar1 != 0) {
                    /* try { // try from 0086f618 to 0086f61b has its CatchHandler @ 0086f778 */
    pvVar5 = operator_new(lVar1 << 4);
    uVar11 = param_2[4];
    *param_1 = (long)pvVar5;
    if (uVar11 == 0) {
      uVar12 = 0;
      pvVar5 = (void *)0x0;
    }
    else {
      uVar12 = uVar11;
      if (uVar11 < 0x41) {
        uVar12 = 0x40;
      }
      uVar12 = uVar12 >> 6;
                    /* try { // try from 0086f63c to 0086f643 has its CatchHandler @ 0086f774 */
      pvVar5 = operator_new(uVar12 << 3);
      memset(pvVar5,0,uVar12 << 3);
    }
    operator_delete((void *)param_1[3]);
    param_1[2] = uVar12;
    param_1[3] = (long)pvVar5;
    param_1[1] = uVar11;
    operator_delete((void *)0x0);
    uVar11 = param_2[2];
    if (uVar11 != 0) {
      puVar8 = (ulong *)param_2[3];
      uVar12 = *puVar8;
      if (uVar12 == 0) {
        uVar6 = 0;
        do {
          if (uVar11 - 1 == uVar6) goto LAB_0086f758;
          uVar12 = puVar8[uVar6 + 1];
          uVar6 = uVar6 + 1;
        } while (uVar12 == 0);
      }
      else {
        uVar6 = 0;
      }
      uVar9 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
      uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
      uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
      uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
      uVar9 = LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) | uVar6 << 6;
      do {
        do {
          puVar3 = (undefined8 *)(*param_2 + uVar9 * 0x10);
          uVar13 = *puVar3;
          uVar12 = uVar12 - 1 & uVar12;
          puVar4 = (undefined8 *)(*param_1 + uVar9 * 0x10);
          puVar4[1] = puVar3[1];
          *puVar4 = uVar13;
          uVar10 = uVar9 >> 3 & 0x1ffffffffffffff8;
          *(ulong *)(param_1[3] + uVar10) = *(ulong *)(param_1[3] + uVar10) | 1L << (uVar9 & 0x3f);
          if (uVar12 == 0) {
            uVar7 = uVar6;
            uVar10 = uVar11;
            if (uVar11 <= uVar6 + 1) {
              uVar10 = uVar6 + 1;
            }
            do {
              uVar6 = uVar7 + 1;
              if (uVar11 <= uVar6) {
                uVar12 = 0;
                goto LAB_0086f73c;
              }
              uVar12 = puVar8[uVar7 + 1];
              uVar7 = uVar6;
            } while (uVar12 == 0);
          }
          uVar9 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
          uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
          uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
          uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
          uVar9 = LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) | uVar6 << 6;
          uVar10 = uVar6;
        } while (uVar12 != 0);
LAB_0086f73c:
        uVar6 = uVar10;
      } while (uVar10 != uVar11);
    }
LAB_0086f758:
    param_1[4] = param_2[4];
  }
  return;
}

