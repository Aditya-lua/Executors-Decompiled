/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2fc70
 */

undefined8 EC_KEY_set_method(long *param_1,long param_2)

{
  undefined8 uVar1;
  
  if (*(code **)(*param_1 + 0x18) != (code *)0x0) {
    (**(code **)(*param_1 + 0x18))(param_1);
  }
  ENGINE_finish((ENGINE *)param_1[1]);
  *param_1 = param_2;
  param_1[1] = 0;
  if (*(code **)(param_2 + 0x10) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a2fcb8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_2 + 0x10))(param_1);
  return uVar1;
}

