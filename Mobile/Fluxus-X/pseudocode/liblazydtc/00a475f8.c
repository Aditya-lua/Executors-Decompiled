/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a475f8
 */

bool ossl_ed448_public_from_private(void)

{
  int iVar1;
  
  iVar1 = ossl_c448_ed448_derive_public_key();
  return iVar1 == -1;
}

