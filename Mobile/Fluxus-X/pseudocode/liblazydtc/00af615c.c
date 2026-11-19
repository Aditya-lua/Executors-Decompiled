/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af615c
 */

long FUN_00af615c(undefined8 param_1,int param_2)

{
  long lVar1;
  undefined1 *puVar2;
  int *piVar3;
  long lVar4;
  undefined4 *puVar5;
  long lVar6;
  
  lVar1 = FUN_00af5f98();
  if ((lVar1 == 0) || (piVar3 = *(int **)(lVar1 + 8), piVar3 == (int *)0x0)) {
    return 0;
  }
  if (*piVar3 == 1) {
    lVar6 = *(long *)(piVar3 + 2);
    lVar4 = lVar6;
joined_r0x00af61c0:
    if (lVar4 != 0) {
      return lVar6;
    }
  }
  else if (*piVar3 == 0) {
    lVar4 = *(long *)(piVar3 + 2);
    lVar6 = 0;
    goto joined_r0x00af61c0;
  }
  lVar6 = OPENSSL_sk_new_null();
  if (lVar6 == 0) {
    return 0;
  }
  if (param_2 == 2) {
    puVar2 = &LAB_00af83f0;
  }
  else {
    if (param_2 != 1) goto LAB_00af61fc;
    puVar2 = &LAB_00af83e0;
  }
  OPENSSL_sk_set_cmp_func(lVar6,puVar2);
LAB_00af61fc:
  puVar5 = *(undefined4 **)(lVar1 + 8);
  *puVar5 = 1;
  *(long *)(puVar5 + 2) = lVar6;
  return lVar6;
}

