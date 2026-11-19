/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b36d4
 */

undefined8 ssl_free_wbio_buffer(long param_1)

{
  BIO *pBVar1;
  
  if (*(long *)(param_1 + 0x20) != 0) {
    pBVar1 = BIO_pop(*(BIO **)(param_1 + 0x18));
    *(BIO **)(param_1 + 0x18) = pBVar1;
    BIO_free(*(BIO **)(param_1 + 0x20));
    *(undefined8 *)(param_1 + 0x20) = 0;
  }
  return 1;
}

