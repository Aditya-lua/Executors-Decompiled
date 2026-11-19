/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4420
 */

undefined8 ossl_provider_get_capabilities(long param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0x88) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00aa442c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x88))(*(undefined8 *)(param_1 + 0xd0));
  return uVar1;
}

