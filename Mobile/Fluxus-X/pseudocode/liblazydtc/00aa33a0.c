/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa33a0
 */

void ossl_provider_teardown(long param_1)

{
  if ((*(code **)(param_1 + 0x70) == (code *)0x0) || ((*(byte *)(param_1 + 200) & 1) != 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00aa33b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 0x70))(*(undefined8 *)(param_1 + 0xd0));
  return;
}

