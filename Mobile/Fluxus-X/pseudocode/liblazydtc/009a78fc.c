/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a78fc
 */

undefined8 dtls1_query_mtu(SSL *param_1)

{
  uint uVar1;
  BIO *pBVar2;
  ulong uVar3;
  ulong uVar4;
  long larg;
  X509_EXTENSIONS *pXVar5;
  char **ppcVar6;
  
  pXVar5 = param_1[1].tlsext_ocsp_exts;
  ppcVar6 = pXVar5[9].stack.data;
  if (ppcVar6 == (char **)0x0) {
    uVar3._0_4_ = pXVar5[9].stack.sorted;
    uVar3._4_4_ = pXVar5[9].stack.num_alloc;
  }
  else {
    pBVar2 = SSL_get_wbio(param_1);
    uVar3 = BIO_ctrl(pBVar2,0x31,0,(void *)0x0);
    pXVar5 = param_1[1].tlsext_ocsp_exts;
    uVar3 = (long)ppcVar6 - (uVar3 & 0xffffffff);
    pXVar5[9].stack.data = (char **)0x0;
    *(ulong *)&pXVar5[9].stack.sorted = uVar3;
  }
  pBVar2 = SSL_get_wbio(param_1);
  uVar4 = BIO_ctrl(pBVar2,0x31,0,(void *)0x0);
  if (uVar3 < 0x100 - (uVar4 & 0xffffffff)) {
    uVar1 = SSL_get_options(param_1);
    if ((uVar1 >> 0xc & 1) != 0) {
      return 0;
    }
    pBVar2 = SSL_get_wbio(param_1);
    uVar3 = BIO_ctrl(pBVar2,0x28,0,(void *)0x0);
    pXVar5 = param_1[1].tlsext_ocsp_exts;
    pXVar5[9].stack.sorted = (int)uVar3;
    pXVar5[9].stack.num_alloc = (int)(uVar3 >> 0x20);
    pBVar2 = SSL_get_wbio(param_1);
    uVar4 = BIO_ctrl(pBVar2,0x31,0,(void *)0x0);
    if (uVar3 < 0x100 - (uVar4 & 0xffffffff)) {
      pBVar2 = SSL_get_wbio(param_1);
      uVar3 = BIO_ctrl(pBVar2,0x31,0,(void *)0x0);
      *(ulong *)&param_1[1].tlsext_ocsp_exts[9].stack.sorted = 0x100 - (uVar3 & 0xffffffff);
      pBVar2 = SSL_get_wbio(param_1);
      larg._0_4_ = param_1[1].tlsext_ocsp_exts[9].stack.sorted;
      larg._4_4_ = param_1[1].tlsext_ocsp_exts[9].stack.num_alloc;
      BIO_ctrl(pBVar2,0x2a,larg,(void *)0x0);
    }
  }
  return 1;
}

