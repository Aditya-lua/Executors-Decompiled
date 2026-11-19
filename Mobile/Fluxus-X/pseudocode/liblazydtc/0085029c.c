/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085029c
 */

void FUN_0085029c(long param_1,long *param_2)

{
  ulong uVar1;
  
  uVar1 = (**(code **)(*param_2 + 0x140))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  (**(code **)**(undefined8 **)(param_1 + 0x28))(*(undefined8 **)(param_1 + 0x28),param_2);
                    /* WARNING: Could not recover jumptable at 0x008502f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x30))(*(undefined8 **)(param_1 + 0x30),param_2);
  return;
}

