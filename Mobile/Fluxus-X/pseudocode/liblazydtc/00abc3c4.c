/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc3c4
 */

PKCS8_PRIV_KEY_INFO * PKCS8_decrypt(X509_SIG *p8,char *pass,int passlen)

{
  undefined8 uVar1;
  PKCS8_PRIV_KEY_INFO *pPVar2;
  undefined8 local_38;
  undefined8 local_28;
  
  X509_SIG_get0(p8,&local_28,&local_38);
  uVar1 = PKCS8_PRIV_KEY_INFO_it();
  pPVar2 = (PKCS8_PRIV_KEY_INFO *)
           PKCS12_item_decrypt_d2i_ex(local_28,uVar1,pass,passlen,local_38,1,0,0);
  return pPVar2;
}

