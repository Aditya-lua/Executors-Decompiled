/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4438
 */

undefined8 ossl_provider_query_operation(long param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0x98) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00aa4444. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x98))(*(undefined8 *)(param_1 + 0xd0));
  return uVar1;
}

