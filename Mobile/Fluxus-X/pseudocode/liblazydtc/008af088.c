/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008af088
 */

void FUN_008af088(undefined8 param_1,undefined4 param_2,int param_3)

{
  int iVar1;
  
  iVar1 = FUN_008ab0e0();
  if (iVar1 != param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_008af05c(param_1,param_2,param_3);
  }
  return;
}

