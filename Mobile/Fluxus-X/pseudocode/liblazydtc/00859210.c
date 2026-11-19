/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00859210
 */

void FUN_00859210(undefined8 *param_1)

{
  int *piVar1;
  int *piVar2;
  
  piVar1 = (int *)*param_1;
  if (piVar1 == (int *)0x0) {
    return;
  }
  piVar2 = (int *)param_1[1];
  while (piVar2 != piVar1) {
                    /* try { // try from 00859248 to 0085924f has its CatchHandler @ 00859284 */
    (*(code *)(&PTR_LAB_00c4a6d8)[piVar2[-0x16]])(piVar2 + -0x14);
    piVar2 = piVar2 + -0x16;
  }
  param_1[1] = piVar1;
  operator_delete((void *)*param_1,param_1[2] - (long)*param_1);
  return;
}

