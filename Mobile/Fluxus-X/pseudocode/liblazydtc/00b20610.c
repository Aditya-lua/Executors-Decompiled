/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b20610
 */

void ossl_prov_digest_fetch
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  EVP_MD_free(param_1[1]);
  uVar1 = EVP_MD_fetch(param_2,param_3,param_4);
  *param_1 = uVar1;
  param_1[1] = uVar1;
  return;
}

