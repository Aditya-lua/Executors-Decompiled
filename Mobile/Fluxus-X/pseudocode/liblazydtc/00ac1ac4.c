/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac1ac4
 */

long FUN_00ac1ac4(BIO *param_1,int param_2,long param_3,BIO *param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int *outl;
  BIO *bp;
  EVP_CIPHER_CTX *pEVar4;
  long lVar5;
  int iVar6;
  
  outl = (int *)BIO_get_data();
  bp = BIO_next(param_1);
  if (outl == (int *)0x0) {
    return 0;
  }
  if (param_2 < 0x65) {
    switch(param_2) {
    case 1:
      pEVar4 = *(EVP_CIPHER_CTX **)(outl + 6);
      outl[3] = 0;
      outl[4] = 1;
      iVar3 = EVP_CIPHER_CTX_is_encrypting(pEVar4);
      iVar3 = EVP_CipherInit_ex(pEVar4,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,
                                iVar3);
      if (iVar3 == 0) {
        return 0;
      }
      param_2 = 1;
      break;
    case 2:
      if (outl[2] < 1) {
        return 1;
      }
      param_2 = 2;
      break;
    default:
      goto switchD_00ac1b28_caseD_3;
    case 10:
      if (0 < (int)((long)*outl - (long)outl[1])) {
        return (long)*outl - (long)outl[1];
      }
      param_2 = 10;
      break;
    case 0xb:
      while( true ) {
        iVar3 = *outl;
        iVar6 = outl[1];
        while (iVar1 = iVar3 - iVar6, iVar3 != iVar6) {
          iVar2 = FUN_00ac1628(param_1,0,0);
          if (iVar2 < 0) goto LAB_00ac1c30;
          iVar3 = *outl;
          iVar6 = outl[1];
          if (iVar3 - iVar6 == iVar1) goto LAB_00ac1c30;
        }
        if (outl[3] != 0) break;
        outl[3] = 1;
        outl[1] = 0;
        iVar2 = EVP_CipherFinal_ex(*(EVP_CIPHER_CTX **)(outl + 6),(uchar *)(outl + 0xc),outl);
        outl[4] = iVar2;
        if (iVar2 < 1) {
LAB_00ac1c30:
          return (long)iVar2;
        }
      }
      param_2 = 0xb;
      break;
    case 0xc:
      lVar5 = BIO_get_data(param_4);
      pEVar4 = EVP_CIPHER_CTX_new();
      *(EVP_CIPHER_CTX **)(lVar5 + 0x18) = pEVar4;
      if ((pEVar4 == (EVP_CIPHER_CTX *)0x0) ||
         (iVar3 = EVP_CIPHER_CTX_copy(pEVar4,*(EVP_CIPHER_CTX **)(outl + 6)), iVar3 == 0)) {
        return 0;
      }
      lVar5 = (long)iVar3;
      goto LAB_00ac1c68;
    case 0xd:
      if (0 < (int)((long)*outl - (long)outl[1])) {
        return (long)*outl - (long)outl[1];
      }
      param_2 = 0xd;
    }
  }
  else {
    if (param_2 == 0x65) {
      BIO_clear_flags(param_1,0xf);
      lVar5 = BIO_ctrl(bp,0x65,param_3,param_4);
      BIO_copy_next_retry(param_1);
      return lVar5;
    }
    if (param_2 == 0x71) {
      return (long)outl[4];
    }
    if (param_2 == 0x81) {
      lVar5 = 1;
      param_4->method = *(BIO_METHOD **)(outl + 6);
      param_4 = param_1;
LAB_00ac1c68:
      BIO_set_init(param_4,1);
      return lVar5;
    }
switchD_00ac1b28_caseD_3:
  }
  lVar5 = BIO_ctrl(bp,param_2,param_3,param_4);
  return lVar5;
}

