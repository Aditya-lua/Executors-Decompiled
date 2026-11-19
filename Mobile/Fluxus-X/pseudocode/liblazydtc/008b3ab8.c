/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3ab8
 */

void FUN_008b3ab8(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar1 = FUN_008be244();
  uVar2 = FUN_008be244(param_1,param_3);
                    /* WARNING: Subroutine does not return */
  FUN_008b39cc(param_1,"attempt to concatenate %s with %s",uVar1,uVar2);
}

