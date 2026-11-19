/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6697c
 */

undefined8 evp_keymgmt_gen_init(long param_1,undefined4 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  uVar1 = ossl_provider_ctx(*(undefined8 *)(param_1 + 0x18));
  if (*(code **)(param_1 + 0x60) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a669bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x60))(uVar1,param_2,param_3);
  return uVar1;
}

