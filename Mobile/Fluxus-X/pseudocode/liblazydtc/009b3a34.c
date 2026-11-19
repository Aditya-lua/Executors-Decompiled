/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3a34
 */

void SSL_set0_wbio(long param_1,BIO *param_2)

{
  BIO *pBVar1;
  
  pBVar1 = *(BIO **)(param_1 + 0x18);
  if (*(long *)(param_1 + 0x20) != 0) {
    pBVar1 = BIO_pop(pBVar1);
    *(BIO **)(param_1 + 0x18) = pBVar1;
  }
  BIO_free_all(pBVar1);
  *(BIO **)(param_1 + 0x18) = param_2;
  if (*(BIO **)(param_1 + 0x20) != (BIO *)0x0) {
    pBVar1 = BIO_push(*(BIO **)(param_1 + 0x20),param_2);
    *(BIO **)(param_1 + 0x18) = pBVar1;
  }
  return;
}

