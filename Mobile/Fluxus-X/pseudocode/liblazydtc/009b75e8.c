/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b75e8
 */

undefined8 ssl_init_wbio_buffer(long param_1)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *pBVar2;
  long lVar3;
  
  if (*(long *)(param_1 + 0x20) == 0) {
    type = BIO_f_buffer();
    pBVar2 = BIO_new(type);
    if ((pBVar2 == (BIO *)0x0) || (lVar3 = BIO_int_ctrl(pBVar2,0x75,1,0), lVar3 < 1)) {
      iVar1 = BIO_free(pBVar2);
      ERR_new(iVar1);
      ERR_set_debug("ssl/ssl_lib.c",0x10ac,"ssl_init_wbio_buffer");
      ERR_set_error(0x14,0x80007,0);
      return 0;
    }
    *(BIO **)(param_1 + 0x20) = pBVar2;
    pBVar2 = BIO_push(pBVar2,*(BIO **)(param_1 + 0x18));
    *(BIO **)(param_1 + 0x18) = pBVar2;
  }
  return 1;
}

