/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64d04
 */

ulong ossl_DER_w_algorithmIdentifier_RSA_PSS
                (undefined8 param_1,undefined4 param_2,int param_3,undefined8 param_4)

{
  int iVar1;
  ulong uVar2;
  undefined1 *puVar3;
  
  if (param_3 == 0) {
    puVar3 = ossl_der_oid_rsaEncryption;
    iVar1 = 6;
  }
  else {
    if (param_3 != 0x1000) {
      return 0;
    }
    puVar3 = ossl_der_oid_id_RSASSA_PSS;
    iVar1 = 0x390;
  }
  uVar2 = ossl_DER_w_begin_sequence(param_1,param_2);
  if ((((int)uVar2 != 0) &&
      (((iVar1 != 0x390 || (iVar1 = ossl_rsa_pss_params_30_is_unrestricted(param_4), iVar1 != 0)) ||
       (uVar2 = ossl_DER_w_RSASSA_PSS_params(param_1,0xffffffff,param_4), (int)uVar2 != 0)))) &&
     (uVar2 = ossl_DER_w_precompiled(param_1,0xffffffff,puVar3,0xb), (int)uVar2 != 0)) {
    iVar1 = ossl_DER_w_end_sequence(param_1,param_2);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

