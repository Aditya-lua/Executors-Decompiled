/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e23c
 */

undefined8 X509_PUBKEY_eq(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  
  if (param_1 == param_2) {
    uVar2 = 1;
  }
  else if (param_1 == (undefined8 *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0;
    if (param_2 != (undefined8 *)0x0) {
      if (((X509_ALGOR *)*param_1 != (X509_ALGOR *)0x0) &&
         ((X509_ALGOR *)*param_2 != (X509_ALGOR *)0x0)) {
        iVar1 = X509_ALGOR_cmp((X509_ALGOR *)*param_1,(X509_ALGOR *)*param_2);
        if (iVar1 != 0) {
          return 0;
        }
        lVar3 = X509_PUBKEY_get0(param_1);
        if ((lVar3 != 0) && (lVar4 = X509_PUBKEY_get0(param_2), lVar4 != 0)) {
          uVar2 = EVP_PKEY_eq(lVar3,lVar4);
          return uVar2;
        }
      }
      uVar2 = 0xfffffffe;
    }
  }
  return uVar2;
}

