/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6890c
 */

undefined8 EVP_MAC_CTX_get_params(long *param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(*param_1 + 0x80) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a6891c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x80))(param_1[1]);
  return uVar1;
}

