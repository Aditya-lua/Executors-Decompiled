/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac1628
 */

int FUN_00ac1628(BIO *param_1,uchar *param_2,int param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int *outl;
  BIO *b;
  int iVar4;
  
  outl = (int *)BIO_get_data();
  b = BIO_next(param_1);
  iVar4 = 0;
  if ((outl != (int *)0x0) && (b != (BIO *)0x0)) {
    BIO_clear_flags(param_1,0xf);
    iVar4 = outl[1];
    for (iVar1 = *outl - iVar4; 0 < iVar1; iVar1 = iVar1 - iVar2) {
      iVar2 = BIO_write(b,(void *)((long)outl + (long)iVar4 + 0x30),iVar1);
      if (iVar2 < 1) {
        BIO_copy_next_retry(param_1);
        return iVar2;
      }
      iVar4 = outl[1] + iVar2;
      outl[1] = iVar4;
    }
    if (param_2 == (uchar *)0x0) {
      iVar4 = 0;
    }
    else {
      iVar4 = 0;
      if (0 < param_3) {
        outl[1] = 0;
        iVar4 = param_3;
        do {
          iVar1 = iVar4;
          if (0xfff < iVar4) {
            iVar1 = 0x1000;
          }
          iVar2 = EVP_CipherUpdate(*(EVP_CIPHER_CTX **)(outl + 6),(uchar *)(outl + 0xc),outl,param_2
                                   ,iVar1);
          if (iVar2 == 0) {
            BIO_clear_flags(param_1,0xf);
            outl[4] = 0;
            return 0;
          }
          iVar2 = *outl;
          iVar4 = iVar4 - iVar1;
          outl[1] = 0;
          if (0 < iVar2) {
            iVar3 = 0;
            do {
              iVar3 = BIO_write(b,(uchar *)((long)(outl + 0xc) + (long)iVar3),iVar2);
              if (iVar3 < 1) {
                BIO_copy_next_retry(param_1);
                if (iVar4 != param_3) {
                  iVar3 = param_3 - iVar4;
                }
                return iVar3;
              }
              iVar2 = iVar2 - iVar3;
              iVar3 = outl[1] + iVar3;
              outl[1] = iVar3;
            } while (0 < iVar2);
          }
          param_2 = param_2 + iVar1;
          outl[0] = 0;
          outl[1] = 0;
        } while (0 < iVar4);
        BIO_copy_next_retry(param_1);
        iVar4 = param_3;
      }
    }
  }
  return iVar4;
}

