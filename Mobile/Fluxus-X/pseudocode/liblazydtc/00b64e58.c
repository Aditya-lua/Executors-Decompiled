/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64e58
 */

void ossl_prov_ctx_set0_core_bio_method(long param_1,undefined8 param_2)

{
  if (param_1 != 0) {
    *(undefined8 *)(param_1 + 0x10) = param_2;
  }
  return;
}

