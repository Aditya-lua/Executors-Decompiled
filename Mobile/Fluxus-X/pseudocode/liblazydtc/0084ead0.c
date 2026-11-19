/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084ead0
 */

void FUN_0084ead0(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  
  uVar1 = (**(code **)(*param_2 + 0x28))(param_2,param_1);
  if (((uVar1 & 1) == 0) || (puVar2 = *(undefined8 **)(param_1 + 0x28), puVar2 == (undefined8 *)0x0)
     ) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0084eb18. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)*puVar2)(puVar2,param_2);
  return;
}

