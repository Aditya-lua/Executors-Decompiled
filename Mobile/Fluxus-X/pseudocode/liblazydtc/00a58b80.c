/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58b80
 */

undefined8 EVP_MD_get_params(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(code **)(param_1 + 0xc0) == (code *)0x0)) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a58b90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xc0))(param_2);
  return uVar1;
}

