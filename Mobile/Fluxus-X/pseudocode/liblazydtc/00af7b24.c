/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af7b24
 */

undefined8 X509v3_addr_inherits(long param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  
  if ((param_1 != 0) && (iVar1 = OPENSSL_sk_num(), 0 < iVar1)) {
    iVar1 = 0;
    do {
      lVar3 = OPENSSL_sk_value(param_1,iVar1);
      if (**(int **)(lVar3 + 8) == 0) {
        return 1;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_1);
    } while (iVar1 < iVar2);
  }
  return 0;
}

