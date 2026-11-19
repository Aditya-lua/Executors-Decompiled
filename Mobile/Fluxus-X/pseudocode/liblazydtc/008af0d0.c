/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008af0d0
 */

void FUN_008af0d0(undefined8 param_1,undefined4 param_2)

{
  int iVar1;
  
  iVar1 = FUN_008ab0e0();
  if (iVar1 == -1) {
                    /* WARNING: Subroutine does not return */
    FUN_008aecb4(param_1,"missing argument #%d",param_2);
  }
  return;
}

