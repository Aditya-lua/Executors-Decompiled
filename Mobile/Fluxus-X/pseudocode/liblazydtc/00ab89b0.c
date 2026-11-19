/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab89b0
 */

EVP_PKEY * PEM_read_bio_Parameters(BIO *bp,EVP_PKEY **x)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = (EVP_PKEY *)FUN_00ab7f64(bp,x,&LAB_00ab89a8,0,0,0,0x84);
  return pEVar1;
}

