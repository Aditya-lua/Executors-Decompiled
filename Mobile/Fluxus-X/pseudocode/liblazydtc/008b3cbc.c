/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3cbc
 */

void FUN_008b3cbc(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  
  uVar1 = FUN_008be244();
                    /* WARNING: Subroutine does not return */
  FUN_008b39cc(param_1,"attempt to call missing method \'%s\' of %s",param_3 + 0x18,uVar1);
}

