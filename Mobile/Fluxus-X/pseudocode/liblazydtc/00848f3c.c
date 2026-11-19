/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00848f3c
 */

undefined8 * FUN_00848f3c(long *param_1,byte *param_2)

{
  undefined8 *puVar1;
  long lVar2;
  void *pvVar3;
  void *pvVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  size_t __n;
  undefined8 uVar10;
  
  lVar2 = tpidr_el0;
  lVar5 = *(long *)(lVar2 + 0x28);
  pvVar4 = (void *)*param_1;
  __n = param_1[1] - (long)pvVar4;
  uVar7 = ((long)__n >> 3) * -0x5555555555555555 + 1;
  if (uVar7 < 0xaaaaaaaaaaaaaab) {
    lVar8 = param_1[2] - (long)pvVar4 >> 3;
    uVar9 = lVar8 * 0x5555555555555556;
    if (uVar9 <= uVar7) {
      uVar9 = uVar7;
    }
    if (0x555555555555554 < (ulong)(lVar8 * -0x5555555555555555)) {
      uVar9 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar9 == 0) {
      pvVar3 = (void *)0x0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < uVar9) goto LAB_008490b4;
      pvVar3 = operator_new(uVar9 * 0x18);
    }
    puVar1 = (undefined8 *)((long)pvVar3 + __n);
    if ((*param_2 & 1) == 0) {
      uVar10 = *(undefined8 *)param_2;
      uVar6 = *(undefined8 *)(param_2 + 0x10);
      puVar1[1] = *(undefined8 *)(param_2 + 8);
      *puVar1 = uVar10;
      puVar1[2] = uVar6;
    }
    else {
                    /* try { // try from 00849028 to 0084902b has its CatchHandler @ 008490c8 */
      FUN_007ff40c(puVar1,*(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 8));
      pvVar4 = (void *)*param_1;
      __n = param_1[1] - (long)pvVar4;
    }
    memcpy((void *)((long)puVar1 - __n),pvVar4,__n);
    pvVar4 = (void *)*param_1;
    lVar8 = param_1[2];
    *param_1 = (long)((long)puVar1 - __n);
    param_1[1] = (long)(puVar1 + 3);
    param_1[2] = (long)((long)pvVar3 + uVar9 * 0x18);
    if (pvVar4 != (void *)0x0) {
      operator_delete(pvVar4,lVar8 - (long)pvVar4);
    }
    if (*(long *)(lVar2 + 0x28) == lVar5) {
      return puVar1 + 3;
    }
  }
  else {
    if (*(long *)(lVar2 + 0x28) != lVar5) goto LAB_008490ec;
    FUN_00849168();
LAB_008490b4:
    if (*(long *)(lVar2 + 0x28) == lVar5) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_008490ec:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

