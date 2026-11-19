/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00861094
 */

undefined8 FUN_00861094(long param_1,int param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  
  if (*(int *)(param_1 + 0x90) != param_2) {
    uVar1 = FUN_0086e504();
    return uVar1;
  }
  if (((*(uint *)(param_1 + 0x94) != *(uint *)((long)param_3 + 4)) &&
      (*(int *)(param_1 + 0x98) != *(int *)(param_3 + 1))) &&
     (*(uint *)(param_1 + 0x14c) < *(uint *)((long)param_3 + 4))) {
    uVar1 = *param_3;
    *(undefined4 *)(param_1 + 0x150) = *(undefined4 *)(param_3 + 1);
    *(undefined8 *)(param_1 + 0x148) = uVar1;
  }
  FUN_00858f2c();
  return 1;
}

