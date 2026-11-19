/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008497f0
 */

void FUN_008497f0(undefined8 *param_1,undefined2 *param_2)

{
  ulong uVar1;
  undefined2 *puVar2;
  void *pvVar3;
  void *__src;
  ulong uVar4;
  size_t __n;
  undefined2 *puVar5;
  long lVar6;
  
  puVar2 = (undefined2 *)param_1[1];
  if (puVar2 < (undefined2 *)param_1[2]) {
    puVar5 = puVar2 + 1;
    *puVar2 = *param_2;
LAB_008498a8:
    param_1[1] = puVar5;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar2 - (long)__src;
  lVar6 = (long)__n >> 1;
  if (lVar6 < -1) {
    FUN_008498cc();
  }
  else {
    uVar4 = (long)param_1[2] - (long)__src;
    uVar1 = uVar4;
    if (uVar4 <= lVar6 + 1U) {
      uVar1 = lVar6 + 1;
    }
    if (0x7ffffffffffffffd < uVar4) {
      uVar1 = 0x7fffffffffffffff;
    }
    if (-1 < (long)uVar1) {
      pvVar3 = operator_new(uVar1 * 2);
      puVar2 = (undefined2 *)((long)pvVar3 + __n);
      puVar5 = puVar2 + 1;
      *puVar2 = *param_2;
      memcpy(puVar2 + -lVar6,__src,__n);
      *param_1 = puVar2 + -lVar6;
      param_1[1] = puVar5;
      param_1[2] = (void *)((long)pvVar3 + uVar1 * 2);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar4);
      }
      goto LAB_008498a8;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

