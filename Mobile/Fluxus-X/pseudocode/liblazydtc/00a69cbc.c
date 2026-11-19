/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69cbc
 */

int EVP_PBE_alg_add(int nid,EVP_CIPHER *cipher,EVP_MD *md,undefined1 *keygen)

{
  int iVar1;
  int md_nid;
  
  if (cipher == (EVP_CIPHER *)0x0) {
    iVar1 = -1;
  }
  else {
    iVar1 = EVP_CIPHER_get_nid(cipher);
  }
  if (md == (EVP_MD *)0x0) {
    md_nid = -1;
  }
  else {
    md_nid = EVP_MD_get_type(md);
  }
  iVar1 = EVP_PBE_alg_add_type(0,nid,iVar1,md_nid,keygen);
  return iVar1;
}

