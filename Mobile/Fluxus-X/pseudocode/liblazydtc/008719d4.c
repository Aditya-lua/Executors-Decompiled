/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008719d4
 */

void FUN_008719d4(undefined8 *param_1)

{
  int iVar1;
  void *pvVar2;
  long lVar3;
  long lVar4;
  
  lVar4 = param_1[1];
  while (lVar3 = param_1[2], lVar4 != lVar3) {
    iVar1 = *(int *)(lVar3 + -0x58);
    param_1[2] = (int *)(lVar3 + -0x58);
                    /* try { // try from 00871a0c to 00871a13 has its CatchHandler @ 00871a48 */
    (*(code *)(&PTR_LAB_00c4a6d8)[iVar1])(lVar3 + -0x50);
  }
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[3] - (long)pvVar2);
  return;
}

