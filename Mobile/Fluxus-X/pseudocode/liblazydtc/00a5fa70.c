/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa70
 */

long EVP_MD_CTX_get1_md(long *param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  
  if ((param_1 == (long *)0x0) || (lVar3 = *param_1, lVar3 == 0)) {
    lVar2 = 0;
  }
  else {
    iVar1 = EVP_MD_up_ref(lVar3);
    lVar2 = 0;
    if (iVar1 != 0) {
      lVar2 = lVar3;
    }
  }
  return lVar2;
}

