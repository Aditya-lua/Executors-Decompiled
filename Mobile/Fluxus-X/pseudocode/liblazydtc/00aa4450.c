/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4450
 */

void ossl_provider_unquery_operation(long param_1)

{
  if (*(code **)(param_1 + 0xa0) == (code *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00aa445c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 0xa0))(*(undefined8 *)(param_1 + 0xd0));
  return;
}

