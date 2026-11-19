/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00888244
 */

void FUN_00888244(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  void *pvVar4;
  void *__src;
  ulong uVar5;
  size_t __n;
  undefined8 *puVar6;
  undefined8 uVar7;
  
  puVar3 = (undefined8 *)param_1[1];
  if (puVar3 < (undefined8 *)param_1[2]) {
    uVar7 = *param_2;
    puVar6 = puVar3 + 2;
    puVar3[1] = param_2[1];
    *puVar3 = uVar7;
LAB_0088830c:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar3 - (long)__src;
  uVar1 = ((long)__n >> 4) + 1;
  if (uVar1 >> 0x3c == 0) {
    uVar5 = (long)param_1[2] - (long)__src;
    uVar2 = (long)uVar5 >> 3;
    if ((ulong)((long)uVar5 >> 3) <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x7fffffffffffffef < uVar5) {
      uVar2 = 0xfffffffffffffff;
    }
    if (uVar2 >> 0x3c == 0) {
      pvVar4 = operator_new(uVar2 * 0x10);
      puVar3 = (undefined8 *)((long)pvVar4 + __n);
      uVar7 = *param_2;
      puVar3[1] = param_2[1];
      *puVar3 = uVar7;
      puVar6 = puVar3 + 2;
      memcpy(puVar3 + ((long)__n >> 4) * -2,__src,__n);
      *param_1 = puVar3 + ((long)__n >> 4) * -2;
      param_1[1] = puVar6;
      param_1[2] = (void *)((long)pvVar4 + uVar2 * 0x10);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar5);
      }
      goto LAB_0088830c;
    }
  }
  else {
    FUN_00894bb8();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

