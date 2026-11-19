/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98bcc
 */

int FUN_00a98bcc(void)

{
  int iVar1;
  RIPEMD160_CTX *c;
  
  c = (RIPEMD160_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = RIPEMD160_Init(c);
  return iVar1;
}

