/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f08c
 */

undefined8 OSSL_DECODER_get_params(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(code **)(param_1 + 0x48) == (code *)0x0)) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a4f09c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x48))(param_2);
  return uVar1;
}

