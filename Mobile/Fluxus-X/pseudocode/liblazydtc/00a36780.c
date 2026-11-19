/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36780
 */

int ossl_ecdsa_verify(undefined8 param_1,uchar *param_2,int param_3,uchar *param_4,int param_5,
                     EC_KEY *param_6)

{
  int iVar1;
  ECDSA_SIG *pEVar2;
  uchar *local_58;
  uchar *puStack_50;
  ECDSA_SIG *local_48;
  
  local_58 = (uchar *)0x0;
  puStack_50 = param_4;
  local_48 = ECDSA_SIG_new();
  if (local_48 == (ECDSA_SIG *)0x0) {
    iVar1 = -1;
  }
  else {
    pEVar2 = d2i_ECDSA_SIG(&local_48,&puStack_50,(long)param_5);
    if (((pEVar2 == (ECDSA_SIG *)0x0) ||
        (iVar1 = i2d_ECDSA_SIG(local_48,&local_58), iVar1 != param_5)) ||
       (iVar1 = memcmp(param_4,local_58,(long)param_5), iVar1 != 0)) {
      iVar1 = -1;
    }
    else {
      iVar1 = ECDSA_do_verify(param_2,param_3,local_48,param_6);
    }
    CRYPTO_free(local_58);
    ECDSA_SIG_free(local_48);
  }
  return iVar1;
}

