/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6f04
 */

undefined8 dtls1_check_timeout_num(SSL *param_1)

{
  uint uVar1;
  BIO *bp;
  ulong uVar2;
  X509_EXTENSIONS *pXVar3;
  ulong uVar4;
  undefined8 uVar5;
  
  pXVar3 = param_1[1].tlsext_ocsp_exts;
  uVar1 = *(int *)&pXVar3[0xf].stack.data + 1;
  *(uint *)&pXVar3[0xf].stack.data = uVar1;
  if (2 < uVar1) {
    uVar1 = SSL_get_options(param_1);
    if ((uVar1 >> 0xc & 1) == 0) {
      bp = SSL_get_wbio(param_1);
      uVar2 = BIO_ctrl(bp,0x2f,0,(void *)0x0);
      pXVar3 = param_1[1].tlsext_ocsp_exts;
      uVar4._0_4_ = pXVar3[9].stack.sorted;
      uVar4._4_4_ = pXVar3[9].stack.num_alloc;
      if (uVar2 < uVar4) {
        pXVar3[9].stack.sorted = (int)uVar2;
        pXVar3[9].stack.num_alloc = (int)(uVar2 >> 0x20);
      }
    }
    else {
      pXVar3 = param_1[1].tlsext_ocsp_exts;
    }
  }
  uVar5 = 0;
  if (0xc < *(uint *)&pXVar3[0xf].stack.data) {
    ERR_new();
    ERR_set_debug("ssl/d1_lib.c",0x18e,"dtls1_check_timeout_num");
    uVar5 = 0xffffffff;
    ossl_statem_fatal(param_1,0xffffffff,0x138,0);
  }
  return uVar5;
}

