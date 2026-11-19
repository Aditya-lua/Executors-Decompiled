/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e5fc
 */

int EVP_PKEY_get_default_digest_nid(EVP_PKEY *pkey,int *pnid)

{
  int iVar1;
  
  if (pkey == (EVP_PKEY *)0x0) {
    return 0;
  }
  iVar1 = FUN_00a6e614((int)pkey,3,0,pnid);
  return iVar1;
}

