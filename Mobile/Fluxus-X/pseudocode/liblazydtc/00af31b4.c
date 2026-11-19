/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af31b4
 */

int X509_signature_print(BIO *bp,X509_ALGOR *alg,ASN1_STRING *sig)

{
  int iVar1;
  uint uVar2;
  EVP_PKEY_ASN1_METHOD *pEVar3;
  int iStack_28;
  int local_24;
  
  iVar1 = BIO_printf(bp,"%*sSignature Algorithm: ",4,"");
  if (((iVar1 < 1) || (iVar1 = i2a_ASN1_OBJECT(bp,alg->algorithm), iVar1 < 1)) ||
     ((sig != (ASN1_STRING *)0x0 && (iVar1 = BIO_printf(bp,"\n%*sSignature Value:",4,""), iVar1 < 1)
      ))) {
    uVar2 = 0;
  }
  else {
    iVar1 = OBJ_obj2nid(alg->algorithm);
    if ((((iVar1 == 0) || (iVar1 = OBJ_find_sigid_algs(iVar1,&iStack_28,&local_24), iVar1 == 0)) ||
        (pEVar3 = EVP_PKEY_asn1_find((ENGINE **)0x0,local_24), pEVar3 == (EVP_PKEY_ASN1_METHOD *)0x0
        )) || (*(code **)(pEVar3 + 0xa0) == (code *)0x0)) {
      iVar1 = BIO_write(bp,&DAT_002c4dae,1);
      uVar2 = (uint)(iVar1 == 1);
      if ((iVar1 == 1) && (sig != (ASN1_STRING *)0x0)) {
        uVar2 = X509_signature_dump(bp,sig,8);
      }
    }
    else {
      uVar2 = (**(code **)(pEVar3 + 0xa0))(bp,alg,sig,8,0);
    }
  }
  return uVar2;
}

