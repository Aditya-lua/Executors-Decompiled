/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1fee0
 */

int FUN_00a1fee0(EVP_PKEY *param_1,long param_2)

{
  int iVar1;
  DSA *r;
  
  if (*(long *)(param_2 + 0x20) == 0) {
    r = (DSA *)0x0;
  }
  else {
    r = (DSA *)ossl_dsa_dup(*(long *)(param_2 + 0x20),0x87);
    if (r == (DSA *)0x0) {
      return 0;
    }
  }
  iVar1 = EVP_PKEY_assign(param_1,0x74,r);
  if (iVar1 == 0) {
    DSA_free(r);
    iVar1 = 0;
  }
  return iVar1;
}

