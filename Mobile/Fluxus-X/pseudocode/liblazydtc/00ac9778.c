/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9778
 */

undefined8 EVP_RAND_get_params(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0xa0) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00ac9784. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xa0))(param_2);
  return uVar1;
}

