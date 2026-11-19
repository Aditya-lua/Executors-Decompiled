/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6d04
 */

void dtls1_start_timer(SSL *param_1)

{
  _func_257 *p_Var1;
  uint uVar2;
  int iVar3;
  BIO *bp;
  X509_EXTENSIONS *pXVar4;
  long lVar5;
  char **ppcVar6;
  
  pXVar4 = param_1[1].tlsext_ocsp_exts;
  lVar5._0_4_ = pXVar4[0xf].stack.sorted;
  lVar5._4_4_ = pXVar4[0xf].stack.num_alloc;
  if ((lVar5 == 0) && (pXVar4[0xf].stack.comp == (_func_257 *)0x0)) {
    ppcVar6 = pXVar4[0x10].stack.data;
    if (ppcVar6 == (char **)0x0) {
      pXVar4[0x10].stack.num = 1000000;
    }
    else {
      iVar3 = (*(code *)ppcVar6)(param_1,0);
      pXVar4 = param_1[1].tlsext_ocsp_exts;
      pXVar4[0x10].stack.num = iVar3;
    }
  }
  gettimeofday((timeval *)&pXVar4[0xf].stack.sorted,(__timezone_ptr_t)0x0);
  pXVar4 = param_1[1].tlsext_ocsp_exts;
  uVar2 = pXVar4[0x10].stack.num;
  lVar5 = *(long *)&pXVar4[0xf].stack.sorted + (ulong)(uVar2 / 1000000);
  p_Var1 = pXVar4[0xf].stack.comp + uVar2 % 1000000;
  *(long *)&pXVar4[0xf].stack.sorted = lVar5;
  pXVar4[0xf].stack.comp = p_Var1;
  if (999999 < (long)p_Var1) {
    *(long *)&pXVar4[0xf].stack.sorted = lVar5 + 1;
    pXVar4[0xf].stack.comp = p_Var1 + -1000000;
  }
  bp = SSL_get_rbio(param_1);
  BIO_ctrl(bp,0x2d,0,&param_1[1].tlsext_ocsp_exts[0xf].stack.sorted);
  return;
}

