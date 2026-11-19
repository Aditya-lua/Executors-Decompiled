/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086e950
 */

void FUN_0086e950(undefined8 *param_1,undefined8 *param_2)

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
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar8 = param_2[1];
    uVar7 = *param_2;
    lVar3 = (long)puVar1 + 0x14;
    *(undefined4 *)(puVar1 + 2) = *(undefined4 *)(param_2 + 2);
    puVar1[1] = uVar8;
    *puVar1 = uVar7;
LAB_0086ea44:
    param_1[1] = lVar3;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar1 - (long)__src;
  uVar4 = ((long)__n >> 2) * -0x3333333333333333 + 1;
  if (uVar4 < 0xccccccccccccccd) {
    uVar6 = (long)param_1[2] - (long)__src;
    lVar3 = (long)uVar6 >> 2;
    uVar5 = lVar3 * -0x6666666666666666;
    if (uVar5 <= uVar4) {
      uVar5 = uVar4;
    }
    if (0x666666666666665 < (ulong)(lVar3 * -0x3333333333333333)) {
      uVar5 = 0xccccccccccccccc;
    }
    if (uVar5 < 0xccccccccccccccd) {
      __dest = operator_new(uVar5 * 0x14);
      uVar7 = *param_2;
      uVar2 = *(undefined4 *)(param_2 + 2);
      puVar1 = (undefined8 *)((long)__dest + __n);
      puVar1[1] = param_2[1];
      *puVar1 = uVar7;
      lVar3 = (long)puVar1 + 0x14;
      *(undefined4 *)(puVar1 + 2) = uVar2;
      memcpy(__dest,__src,__n);
      *param_1 = __dest;
      param_1[1] = lVar3;
      param_1[2] = (void *)((long)__dest + uVar5 * 0x14);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar6);
      }
      goto LAB_0086ea44;
    }
  }
  else {
    FUN_008704dc();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

