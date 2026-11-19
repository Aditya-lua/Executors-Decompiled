/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83b50
 */

void * CRYPTO_get_ex_data(CRYPTO_EX_DATA *ad,int idx)

{
  int iVar1;
  void *pvVar2;
  
  if ((*(long *)&ad->dummy == 0) || (iVar1 = OPENSSL_sk_num(), iVar1 <= idx)) {
    return (void *)0x0;
  }
  pvVar2 = (void *)OPENSSL_sk_value(*(undefined8 *)&ad->dummy,idx);
  return pvVar2;
}

