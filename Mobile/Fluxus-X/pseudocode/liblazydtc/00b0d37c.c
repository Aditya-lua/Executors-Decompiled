/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d37c
 */

int X509v3_get_ext_by_critical(stack_st_X509_EXTENSION *x,int crit,int lastpos)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  
  if (x != (stack_st_X509_EXTENSION *)0x0) {
    iVar2 = OPENSSL_sk_num();
    for (uVar1 = lastpos + 1U & ((int)(lastpos + 1U) >> 0x1f ^ 0xffffffffU); (int)uVar1 < iVar2;
        uVar1 = uVar1 + 1) {
      lVar3 = OPENSSL_sk_value(x,uVar1);
      if ((crit != 0) == 0 < *(int *)(lVar3 + 8)) {
        return uVar1;
      }
    }
  }
  return -1;
}

