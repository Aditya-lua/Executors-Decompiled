/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b979c
 */

undefined8 ssl_evp_md_up_ref(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = EVP_MD_get0_provider();
  if (lVar1 == 0) {
    return 1;
  }
  uVar2 = EVP_MD_up_ref(param_1);
  return uVar2;
}

