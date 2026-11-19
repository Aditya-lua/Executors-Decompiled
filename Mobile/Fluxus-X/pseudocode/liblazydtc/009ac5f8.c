/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac5f8
 */

undefined8 ssl_cert_set1_chain(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if (param_3 == 0) {
    uVar3 = ssl_cert_set0_chain(param_1,param_2);
    return uVar3;
  }
  lVar2 = X509_chain_up_ref(param_3);
  uVar3 = 0;
  if (lVar2 != 0) {
    iVar1 = ssl_cert_set0_chain(param_1,param_2,lVar2);
    if (iVar1 == 0) {
      OPENSSL_sk_pop_free(lVar2,X509_free);
      uVar3 = 0;
    }
    else {
      uVar3 = 1;
    }
  }
  return uVar3;
}

