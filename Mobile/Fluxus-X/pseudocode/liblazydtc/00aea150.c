/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea150
 */

ulong OSSL_STORE_error(long *param_1)

{
  ulong uVar1;
  
  if (param_1[1] == 0) {
                    /* WARNING: Could not recover jumptable at 0x00aea16c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*param_1 + 0x48))(param_1[2]);
    return uVar1;
  }
  return (ulong)*(uint *)((long)param_1 + 0x3c);
}

