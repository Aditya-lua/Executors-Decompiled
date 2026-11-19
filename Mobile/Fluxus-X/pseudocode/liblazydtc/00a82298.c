/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82298
 */

void FUN_00a82298(undefined8 param_1,undefined8 *param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  
  lVar1 = (**(code **)(*(long *)(param_4 + 0x18) + 0x28))
                    (param_2,param_1,*(undefined8 *)(param_4 + 0x20));
  if (lVar1 == 0) {
    return;
  }
  (**(code **)(*(long *)(param_4 + 0x18) + 0x20))
            (*(undefined8 *)(param_4 + 8),lVar1,param_1,*param_2,param_2[1],
             *(undefined8 *)(param_4 + 0x20));
                    /* WARNING: Could not recover jumptable at 0x00a82304. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_4 + 0x18) + 0x30))(lVar1,*(undefined8 *)(param_4 + 0x20));
  return;
}

