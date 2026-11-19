/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab1b8
 */

bool ssl3_init_finished_mac(long param_1)

{
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_mem();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/s3_enc.c",0x144,"ssl3_init_finished_mac");
    ossl_statem_fatal(param_1,0x50,0xc0100,0);
  }
  else {
    BIO_free(*(BIO **)(param_1 + 0x188));
    *(undefined8 *)(param_1 + 0x188) = 0;
    EVP_MD_CTX_free(*(undefined8 *)(param_1 + 400));
    *(BIO **)(param_1 + 0x188) = bp;
    *(undefined8 *)(param_1 + 400) = 0;
    BIO_ctrl(bp,9,1,(void *)0x0);
  }
  return bp != (BIO *)0x0;
}

