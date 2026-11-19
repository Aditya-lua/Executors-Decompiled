/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b36068
 */

EVP_PKEY * b2i_PVK_bio(BIO *in,undefined1 *cb,void *u)

{
  undefined8 uVar1;
  EVP_PKEY *pEVar2;
  
  uVar1 = FUN_00b35a9c();
  pEVar2 = (EVP_PKEY *)FUN_00b34ee4(uVar1,0);
  return pEVar2;
}

