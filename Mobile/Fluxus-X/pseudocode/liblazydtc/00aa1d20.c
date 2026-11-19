/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1d20
 */

void ossl_provider_deinit_child(undefined8 param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)ossl_lib_ctx_get_data(param_1,0x12,&DAT_00c6d498);
  if (puVar1 == (undefined8 *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00aa1d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)puVar1[5])(*puVar1);
  return;
}

