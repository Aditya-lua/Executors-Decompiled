/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9d84
 */

int RSA_verify(int type,uchar *m,uint m_length,uchar *sigbuf,uint siglen,RSA *rsa)

{
  int iVar1;
  
  if (*(code **)(rsa->engine + 0x60) == (code *)0x0) {
    iVar1 = ossl_rsa_verify(type,m,m_length,0,0,sigbuf,siglen);
    return iVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x00ad9da0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(rsa->engine + 0x60))();
  return iVar1;
}

