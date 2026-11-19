/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e62c
 */

void FUN_0084e62c(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  void *__src;
  void *pvVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  void *__dest;
  long lVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar9 = param_2[1];
    uVar3 = *param_2;
    puVar8 = puVar1 + 3;
    puVar1[2] = param_2[2];
    puVar1[1] = uVar9;
    *puVar1 = uVar3;
    param_2[1] = 0;
    param_2[2] = 0;
    *param_2 = 0;
LAB_0084e738:
    param_1[1] = (long)puVar8;
    return;
  }
  lVar7 = (long)puVar1 - *param_1;
  uVar5 = (lVar7 >> 3) * -0x5555555555555555 + 1;
  if (uVar5 < 0xaaaaaaaaaaaaaab) {
    lVar4 = param_1[2] - *param_1 >> 3;
    uVar6 = lVar4 * 0x5555555555555556;
    if (uVar6 <= uVar5) {
      uVar6 = uVar5;
    }
    if (0x555555555555554 < (ulong)(lVar4 * -0x5555555555555555)) {
      uVar6 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar6 < 0xaaaaaaaaaaaaaab) {
      pvVar2 = operator_new(uVar6 * 0x18);
      uVar10 = param_2[1];
      uVar9 = *param_2;
      *param_2 = 0;
      param_2[1] = 0;
      puVar1 = (undefined8 *)((long)pvVar2 + lVar7);
      uVar3 = param_2[2];
      param_2[2] = 0;
      __src = (void *)*param_1;
      lVar7 = param_1[1];
      puVar8 = puVar1 + 3;
      puVar1[1] = uVar10;
      *puVar1 = uVar9;
      puVar1[2] = uVar3;
      __dest = (void *)((long)puVar1 - (lVar7 - (long)__src));
      memcpy(__dest,__src,lVar7 - (long)__src);
      lVar7 = param_1[2];
      *param_1 = (long)__dest;
      param_1[1] = (long)puVar8;
      param_1[2] = (long)((long)pvVar2 + uVar6 * 0x18);
      if (__src != (void *)0x0) {
        operator_delete(__src,lVar7 - (long)__src);
      }
      goto LAB_0084e738;
    }
  }
  else {
    FUN_00849168();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

