/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851308
 */

void FUN_00851308(long param_1,long *param_2)

{
  ulong uVar1;
  
  uVar1 = (**(code **)(*param_2 + 0x200))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0085134c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
  return;
}

