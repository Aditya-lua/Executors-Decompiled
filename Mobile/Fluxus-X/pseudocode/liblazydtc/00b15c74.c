/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15c74
 */

int NETSCAPE_SPKI_sign(NETSCAPE_SPKI *x,EVP_PKEY *pkey,EVP_MD *md)

{
  undefined4 uVar1;
  int iVar2;
  
  uVar1 = NETSCAPE_SPKAC_it();
  iVar2 = ASN1_item_sign_ex(uVar1,&x->sig_algor,0,x[1].spkac,x->spkac,0,pkey,md,0,0);
  return iVar2;
}

