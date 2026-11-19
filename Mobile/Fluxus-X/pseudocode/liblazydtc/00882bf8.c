/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00882bf8
 */

/* WARNING: Removing unreachable block (ram,0x00882d00) */

void FUN_00882bf8(long *param_1)

{
  long lVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  uVar3 = param_1[2];
  if (uVar3 != 0) {
    puVar2 = (ulong *)param_1[3];
    uVar7 = *puVar2;
    if (uVar7 == 0) {
      uVar4 = 0;
      do {
        if (uVar3 - 1 == uVar4) goto LAB_00882d04;
        uVar7 = puVar2[uVar4 + 1];
        uVar4 = uVar4 + 1;
      } while (uVar7 == 0);
    }
    else {
      uVar4 = 0;
    }
    uVar8 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) | uVar4 << 6;
    do {
      do {
        lVar1 = *param_1 + uVar8 * 0x40;
        if (*(void **)(lVar1 + 8) != (void *)0x0) {
          operator_delete(*(void **)(lVar1 + 8));
          *(undefined8 *)(lVar1 + 8) = 0;
          operator_delete(*(void **)(lVar1 + 0x20));
          *(undefined8 *)(lVar1 + 0x10) = 0;
          *(undefined8 *)(lVar1 + 0x18) = 0;
          *(undefined8 *)(lVar1 + 0x20) = 0;
          operator_delete((void *)0x0);
          *(undefined8 *)(lVar1 + 0x28) = 0;
          *(undefined1 *)(lVar1 + 0x38) = 0x40;
        }
        operator_delete(*(void **)(lVar1 + 0x20));
        uVar7 = uVar7 - 1 & uVar7;
        if (uVar7 == 0) {
          uVar5 = uVar4;
          uVar6 = uVar3;
          if (uVar3 <= uVar4 + 1) {
            uVar6 = uVar4 + 1;
          }
          do {
            uVar4 = uVar5 + 1;
            if (uVar3 <= uVar4) {
              uVar7 = 0;
              goto LAB_00882ce8;
            }
            uVar7 = puVar2[uVar5 + 1];
            uVar5 = uVar4;
          } while (uVar7 == 0);
        }
        uVar8 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
        uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
        uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) | uVar4 << 6;
        uVar6 = uVar4;
      } while (uVar7 != 0);
LAB_00882ce8:
      uVar4 = uVar6;
    } while (uVar6 != uVar3);
  }
LAB_00882d04:
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

