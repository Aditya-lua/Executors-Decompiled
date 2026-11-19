/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64dc8
 */

void ossl_DER_w_algorithmIdentifier_RSA(undefined8 param_1,undefined4 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  undefined8 uVar2;
  
  uVar1 = RSA_test_flags(param_3,0xf000);
  uVar2 = ossl_rsa_get0_pss_params_30(param_3);
  ossl_DER_w_algorithmIdentifier_RSA_PSS(param_1,param_2,uVar1,uVar2);
  return;
}

