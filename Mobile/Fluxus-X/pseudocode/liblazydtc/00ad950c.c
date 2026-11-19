/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad950c
 */

int RSA_sign(int type,uchar *m,uint m_length,uchar *sigret,uint *siglen,RSA *rsa)

{
  ulong uVar1;
  int iVar2;
  uint uVar3;
  uchar *puVar4;
  long lVar5;
  uchar *local_58;
  long local_48;
  
  local_48 = 0;
  local_58 = (uchar *)0x0;
  if (*(code **)(rsa->engine + 0x58) != (code *)0x0) {
    iVar2 = (**(code **)(rsa->engine + 0x58))(type,m,m_length,sigret,siglen,rsa);
    return (uint)(0 < iVar2);
  }
  if (type == 0x72) {
    if (m_length != 0x24) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sign.c",0x126,"RSA_sign");
      ERR_set_error(4,0x83,0);
      return 0;
    }
    local_48 = 0x24;
LAB_00ad95b8:
    lVar5 = local_48;
    puVar4 = local_58;
    uVar1 = local_48 + 0xb;
    iVar2 = RSA_size(rsa);
    if ((ulong)(long)iVar2 < uVar1) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sign.c",0x132,"RSA_sign");
      ERR_set_error(4,0x70,0);
    }
    else {
      uVar3 = RSA_private_encrypt((int)lVar5,m,sigret,rsa,1);
      if (0 < (int)uVar3) {
        *siglen = uVar3;
        iVar2 = 1;
        goto LAB_00ad962c;
      }
    }
  }
  else {
    iVar2 = FUN_00ad9698(&local_58,&local_48,type,m,m_length);
    puVar4 = local_58;
    lVar5 = local_48;
    if (iVar2 != 0) {
      m = local_58;
      goto LAB_00ad95b8;
    }
  }
  iVar2 = 0;
LAB_00ad962c:
  CRYPTO_clear_free(puVar4,lVar5,"crypto/rsa/rsa_sign.c",0x13e);
  return iVar2;
}

