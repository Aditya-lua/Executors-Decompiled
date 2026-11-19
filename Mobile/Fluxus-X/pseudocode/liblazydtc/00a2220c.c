/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2220c
 */

int DSA_verify(int type,uchar *dgst,int dgst_len,uchar *sigbuf,int siglen,DSA *dsa)

{
  int iVar1;
  int iVar2;
  DSA_SIG *pDVar3;
  uchar *local_58;
  uchar *puStack_50;
  DSA_SIG *local_48;
  
  local_58 = (uchar *)0x0;
  puStack_50 = sigbuf;
  local_48 = (DSA_SIG *)CRYPTO_zalloc(0x10,"crypto/dsa/dsa_sign.c",0x24);
  if (local_48 == (DSA_SIG *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_sign.c",0x26,"DSA_SIG_new");
    ERR_set_error(10,0xc0100,0);
    iVar2 = -1;
  }
  else {
    pDVar3 = d2i_DSA_SIG(&local_48,&puStack_50,(long)siglen);
    if (pDVar3 == (DSA_SIG *)0x0) {
      iVar1 = -1;
      iVar2 = -1;
    }
    else {
      iVar1 = i2d_DSA_SIG(local_48,&local_58);
      if (iVar1 == siglen) {
        iVar2 = memcmp(sigbuf,local_58,(long)siglen);
        iVar1 = siglen;
        if (iVar2 == 0) {
          iVar2 = DSA_do_verify(dgst,dgst_len,local_48,dsa);
        }
        else {
          iVar2 = -1;
        }
      }
      else {
        iVar2 = -1;
      }
    }
    CRYPTO_clear_free(local_58,(long)iVar1,"crypto/dsa/dsa_sign.c",0xd3);
    pDVar3 = local_48;
    if (local_48 != (DSA_SIG *)0x0) {
      BN_clear_free(local_48->r);
      BN_clear_free(pDVar3->s);
      CRYPTO_free(pDVar3);
    }
  }
  return iVar2;
}

