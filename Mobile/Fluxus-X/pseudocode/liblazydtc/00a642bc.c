/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a642bc
 */

void EVP_KDF_derive(long *param_1)

{
  if (param_1 == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00a642c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x50))(param_1[1]);
  return;
}

