/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00871de4
 */

void FUN_00871de4(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  void *__dest;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  void *__src;
  ulong uVar6;
  undefined8 *puVar7;
  size_t __n;
  undefined8 uVar8;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar8 = param_2[1];
    uVar3 = *param_2;
    puVar7 = puVar1 + 3;
    puVar1[2] = param_2[2];
    puVar1[1] = uVar8;
    *puVar1 = uVar3;
LAB_00871ed8:
    param_1[1] = puVar7;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar1 - (long)__src;
  uVar4 = ((long)__n >> 3) * -0x5555555555555555 + 1;
  if (uVar4 < 0xaaaaaaaaaaaaaab) {
    uVar6 = (long)param_1[2] - (long)__src;
    lVar2 = (long)uVar6 >> 3;
    uVar5 = lVar2 * 0x5555555555555556;
    if (uVar5 <= uVar4) {
      uVar5 = uVar4;
    }
    if (0x555555555555554 < (ulong)(lVar2 * -0x5555555555555555)) {
      uVar5 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar5 < 0xaaaaaaaaaaaaaab) {
      __dest = operator_new(uVar5 * 0x18);
      uVar8 = *param_2;
      uVar3 = param_2[2];
      puVar1 = (undefined8 *)((long)__dest + __n);
      puVar1[1] = param_2[1];
      *puVar1 = uVar8;
      puVar7 = puVar1 + 3;
      puVar1[2] = uVar3;
      memcpy(__dest,__src,__n);
      *param_1 = __dest;
      param_1[1] = puVar7;
      param_1[2] = (void *)((long)__dest + uVar5 * 0x18);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar6);
      }
      goto LAB_00871ed8;
    }
  }
  else {
    FUN_00871efc();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

