/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e468
 */

int EVP_PKEY_print_params(BIO *out,EVP_PKEY *pkey,int indent,ASN1_PCTX *pctx)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(long *)&pkey->references == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = *(undefined8 *)(*(long *)&pkey->references + 0x98);
  }
  iVar1 = FUN_00a6e250(pkey,out,indent,0x84,uVar2,pctx);
  return iVar1;
}

