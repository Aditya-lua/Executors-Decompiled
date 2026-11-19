/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a68928
 */

undefined8 EVP_MAC_CTX_set_params(long *param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(*param_1 + 0x88) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a68938. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x88))(param_1[1]);
  return uVar1;
}

