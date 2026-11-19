/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904728
 */

undefined8 FUN_00904728(long *param_1,char *param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  size_t __n;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  
  __n = strlen(param_2);
  lVar8 = param_1[1];
  uVar7 = param_1[3];
  lVar2 = lVar8 + __n;
  uVar1 = lVar2 + 1;
  if (uVar7 < uVar1) {
    (*(code *)PTR_free_00cc4678)(*param_1);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    return 100;
  }
  uVar5 = param_1[2];
  if (uVar5 == 0) {
    if (0x1f < uVar7) {
      if (uVar1 < 0x21) {
        uVar1 = 0x20;
      }
      uVar7 = uVar1;
    }
    if (uVar7 == 0) goto LAB_009047fc;
  }
  else {
    uVar3 = uVar5;
    do {
      uVar6 = uVar3;
      uVar3 = uVar6 << 1;
    } while (uVar6 < uVar1);
    if (uVar6 <= uVar7) {
      uVar7 = uVar6;
    }
    if (uVar7 == uVar5) goto LAB_009047fc;
  }
  lVar4 = (*(code *)PTR_realloc_00cc4680)(*param_1,uVar7);
  if (lVar4 == 0) {
    (*(code *)PTR_free_00cc4678)(*param_1);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    return 0x1b;
  }
  *param_1 = lVar4;
  param_1[2] = uVar7;
LAB_009047fc:
  if (__n != 0) {
    memcpy((void *)(*param_1 + lVar8),param_2,__n);
  }
  param_1[1] = lVar2;
  *(undefined1 *)(*param_1 + lVar2) = 0;
  return 0;
}

