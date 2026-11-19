/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008546cc
 */

void FUN_008546cc(undefined8 *param_1,undefined4 *param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined4 *puVar3;
  void *pvVar4;
  void *__src;
  ulong uVar5;
  size_t __n;
  undefined4 *puVar6;
  
  puVar3 = (undefined4 *)param_1[1];
  if (puVar3 < (undefined4 *)param_1[2]) {
    puVar6 = puVar3 + 1;
    *puVar3 = *param_2;
LAB_0085478c:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar3 - (long)__src;
  uVar1 = ((long)__n >> 2) + 1;
  if (uVar1 >> 0x3e == 0) {
    uVar5 = (long)param_1[2] - (long)__src;
    uVar2 = (long)uVar5 >> 1;
    if ((ulong)((long)uVar5 >> 1) <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x7ffffffffffffffb < uVar5) {
      uVar2 = 0x3fffffffffffffff;
    }
    if (uVar2 >> 0x3e == 0) {
      pvVar4 = operator_new(uVar2 * 4);
      puVar3 = (undefined4 *)((long)pvVar4 + __n);
      puVar6 = puVar3 + 1;
      *puVar3 = *param_2;
      memcpy(puVar3 + -((long)__n >> 2),__src,__n);
      *param_1 = puVar3 + -((long)__n >> 2);
      param_1[1] = puVar6;
      param_1[2] = (void *)((long)pvVar4 + uVar2 * 4);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar5);
      }
      goto LAB_0085478c;
    }
  }
  else {
    FUN_0085532c();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

