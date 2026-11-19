/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00861848
 */

void FUN_00861848(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  do {
    local_40 = FUN_0086060c(param_1,0);
    FUN_00872064(*param_2,&local_40);
    param_2[2] = param_2[2] + 1;
    if (*(int *)(param_1 + 0x90) != 0x2c) goto LAB_008618f4;
    if (param_3 != (undefined8 *)0x0) {
      FUN_00870ce4(*param_3,param_1 + 0x94);
      param_3[2] = param_3[2] + 1;
    }
    FUN_00858f2c(param_1);
  } while (*(int *)(param_1 + 0x90) != 0x29);
  FUN_00860ecc(param_1,param_1 + 0x94,"Expected expression after \',\' but got \')\' instead");
LAB_008618f4:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

