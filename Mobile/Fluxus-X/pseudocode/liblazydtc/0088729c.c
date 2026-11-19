/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088729c
 */

void FUN_0088729c(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  ulong uVar3;
  void *pvVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *__src;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  puVar9 = (undefined8 *)param_1[2];
  if (puVar9 == (undefined8 *)param_1[3]) {
    puVar2 = (undefined8 *)*param_1;
    __src = (undefined8 *)param_1[1];
    if (__src < puVar2 || (long)__src - (long)puVar2 == 0) {
      uVar3 = (long)puVar9 - (long)puVar2;
      uVar6 = (long)uVar3 >> 4;
      if (uVar3 == 0) {
        uVar6 = 1;
      }
      if (uVar6 >> 0x3b != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      pvVar4 = operator_new(uVar6 * 0x20);
      lVar7 = (long)puVar9 - (long)__src;
      puVar1 = (undefined8 *)((long)pvVar4 + (uVar6 >> 2) * 0x20);
      puVar9 = puVar1;
      if (lVar7 != 0) {
        puVar9 = (undefined8 *)((long)puVar1 + lVar7);
        puVar8 = puVar1;
        do {
          uVar12 = *__src;
          uVar11 = __src[3];
          uVar10 = __src[2];
          lVar7 = lVar7 + -0x20;
          puVar8[1] = __src[1];
          *puVar8 = uVar12;
          puVar8[3] = uVar11;
          puVar8[2] = uVar10;
          puVar8 = puVar8 + 4;
          __src = __src + 4;
        } while (lVar7 != 0);
      }
      *param_1 = pvVar4;
      param_1[1] = puVar1;
      param_1[2] = puVar9;
      param_1[3] = (void *)((long)pvVar4 + uVar6 * 0x20);
      if (puVar2 != (undefined8 *)0x0) {
        operator_delete(puVar2,uVar3);
        puVar9 = (undefined8 *)param_1[2];
      }
    }
    else {
      lVar7 = (long)puVar9 - (long)__src;
      lVar5 = (((long)__src - (long)puVar2 >> 5) + 1) / 2;
      puVar9 = __src + lVar5 * -4;
      if (lVar7 != 0) {
        memmove(puVar9,__src,lVar7 - 7);
        __src = (undefined8 *)param_1[1];
      }
      puVar9 = (undefined8 *)((long)puVar9 + lVar7);
      param_1[1] = __src + lVar5 * -4;
      param_1[2] = puVar9;
    }
  }
  uVar12 = *param_2;
  uVar11 = param_2[3];
  uVar10 = param_2[2];
  puVar9[1] = param_2[1];
  *puVar9 = uVar12;
  puVar9[3] = uVar11;
  puVar9[2] = uVar10;
  param_1[2] = param_1[2] + 0x20;
  return;
}

