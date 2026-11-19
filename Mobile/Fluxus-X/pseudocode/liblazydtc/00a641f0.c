/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a641f0
 */

void EVP_KDF_CTX_reset(long *param_1)

{
  if (param_1 != (long *)0x0) {
    if (*(code **)(*param_1 + 0x48) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a64204. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*param_1 + 0x48))(param_1[1]);
      return;
    }
  }
  return;
}

