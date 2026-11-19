/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087251c
 */

void FUN_0087251c(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined4 uVar2;
  void *__dest;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  void *__src;
  ulong uVar6;
  size_t __n;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar10 = param_2[1];
    uVar9 = *param_2;
    uVar8 = param_2[3];
    uVar7 = param_2[2];
    lVar3 = (long)puVar1 + 0x24;
    *(undefined4 *)(puVar1 + 4) = *(undefined4 *)(param_2 + 4);
    puVar1[1] = uVar10;
    *puVar1 = uVar9;
    puVar1[3] = uVar8;
    puVar1[2] = uVar7;
LAB_00872628:
    param_1[1] = lVar3;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar1 - (long)__src;
  uVar4 = ((long)__n >> 2) * -0x71c71c71c71c71c7 + 1;
  if (uVar4 < 0x71c71c71c71c71d) {
    uVar6 = (long)param_1[2] - (long)__src;
    lVar3 = (long)uVar6 >> 2;
    uVar5 = lVar3 * 0x1c71c71c71c71c72;
    if (uVar5 <= uVar4) {
      uVar5 = uVar4;
    }
    if (0x38e38e38e38e38d < (ulong)(lVar3 * -0x71c71c71c71c71c7)) {
      uVar5 = 0x71c71c71c71c71c;
    }
    if (uVar5 < 0x71c71c71c71c71d) {
      __dest = operator_new(uVar5 * 0x24);
      uVar7 = *param_2;
      uVar9 = param_2[3];
      uVar8 = param_2[2];
      puVar1 = (undefined8 *)((long)__dest + __n);
      uVar2 = *(undefined4 *)(param_2 + 4);
      lVar3 = (long)puVar1 + 0x24;
      puVar1[1] = param_2[1];
      *puVar1 = uVar7;
      puVar1[3] = uVar9;
      puVar1[2] = uVar8;
      *(undefined4 *)(puVar1 + 4) = uVar2;
      memcpy(__dest,__src,__n);
      *param_1 = __dest;
      param_1[1] = lVar3;
      param_1[2] = (void *)((long)__dest + uVar5 * 0x24);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar6);
      }
      goto LAB_00872628;
    }
  }
  else {
    FUN_0087264c();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

