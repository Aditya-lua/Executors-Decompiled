/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acfbc0
 */

undefined8
ossl_rsa_pss_get_param_unverified
          (undefined8 *param_1,long *param_2,long *param_3,undefined4 *param_4,undefined4 *param_5)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auStack_58 [24];
  
  ossl_rsa_pss_params_30_set_defaults(auStack_58);
  if (param_1 == (undefined8 *)0x0) {
    uVar3 = 0;
  }
  else {
    lVar2 = ossl_x509_algor_get_md(*param_1);
    *param_2 = lVar2;
    uVar3 = 0;
    if (lVar2 != 0) {
      lVar2 = ossl_x509_algor_get_md(param_1[4]);
      *param_3 = lVar2;
      uVar3 = 0;
      if (lVar2 != 0) {
        if ((ASN1_INTEGER *)param_1[2] == (ASN1_INTEGER *)0x0) {
          uVar1 = ossl_rsa_pss_params_30_saltlen(auStack_58);
        }
        else {
          lVar2 = ASN1_INTEGER_get((ASN1_INTEGER *)param_1[2]);
          uVar1 = (undefined4)lVar2;
        }
        *param_4 = uVar1;
        if ((ASN1_INTEGER *)param_1[3] == (ASN1_INTEGER *)0x0) {
          uVar1 = ossl_rsa_pss_params_30_trailerfield(auStack_58);
        }
        else {
          lVar2 = ASN1_INTEGER_get((ASN1_INTEGER *)param_1[3]);
          uVar1 = (undefined4)lVar2;
        }
        *param_5 = uVar1;
        uVar3 = 1;
      }
    }
  }
  return uVar3;
}

