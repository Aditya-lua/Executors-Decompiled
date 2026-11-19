/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad6784
 */

uint FUN_00ad6784(long param_1,uchar *param_2,long *param_3,uchar *param_4,size_t param_5)

{
  int iVar1;
  uint m_length;
  int iVar2;
  RSA *rsa;
  undefined8 uVar3;
  long lVar4;
  uint local_58;
  uint local_54;
  
  lVar4 = *(long *)(param_1 + 0x98);
  rsa = (RSA *)EVP_PKEY_get0_RSA(*(undefined8 *)(param_1 + 0x88));
  m_length = (uint)param_5;
  if (*(long *)(lVar4 + 0x20) == 0) {
    iVar1 = *(int *)(lVar4 + 0x1c);
LAB_00ad6838:
    local_58 = RSA_private_encrypt(m_length,param_4,param_2,rsa,iVar1);
  }
  else {
    iVar1 = EVP_MD_get_size(*(long *)(lVar4 + 0x20));
    if ((long)iVar1 != param_5) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x94,"pkey_rsa_sign");
      uVar3 = 0x8f;
      goto LAB_00ad687c;
    }
    iVar1 = EVP_MD_get_type(*(undefined8 *)(lVar4 + 0x20));
    if (iVar1 == 0x5f) {
      if (*(int *)(lVar4 + 0x1c) != 1) {
        return -1;
      }
      iVar1 = RSA_sign_ASN1_OCTET_STRING(0,param_4,m_length,param_2,&local_54,rsa);
      local_58 = local_54;
    }
    else {
      iVar1 = *(int *)(lVar4 + 0x1c);
      if (iVar1 != 1) {
        if (iVar1 == 6) {
          iVar1 = FUN_00ad789c(lVar4,param_1);
          if (iVar1 == 0) {
            return -1;
          }
          iVar1 = RSA_padding_add_PKCS1_PSS_mgf1
                            (rsa,*(uchar **)(lVar4 + 0x38),param_4,*(EVP_MD **)(lVar4 + 0x20),
                             *(EVP_MD **)(lVar4 + 0x28),*(int *)(lVar4 + 0x30));
          if (iVar1 == 0) {
            return -1;
          }
          m_length = RSA_size(rsa);
          param_4 = *(uchar **)(lVar4 + 0x38);
          iVar1 = 3;
        }
        else {
          if (iVar1 != 5) {
            return -1;
          }
          iVar1 = RSA_size(rsa);
          if ((ulong)(long)iVar1 < param_5 + 1) {
            ERR_new();
            ERR_set_debug("crypto/rsa/rsa_pmeth.c",0xa3,"pkey_rsa_sign");
            uVar3 = 0x78;
LAB_00ad687c:
            ERR_set_error(4,uVar3,0);
            return -1;
          }
          iVar1 = FUN_00ad789c(lVar4,param_1);
          if (iVar1 == 0) {
            ERR_new();
            ERR_set_debug("crypto/rsa/rsa_pmeth.c",0xa7,"pkey_rsa_sign");
            uVar3 = 0xc0100;
            goto LAB_00ad687c;
          }
          memcpy(*(void **)(lVar4 + 0x38),param_4,param_5);
          iVar1 = EVP_MD_get_type(*(undefined8 *)(lVar4 + 0x20));
          iVar2 = RSA_X931_hash_id(iVar1);
          iVar1 = 5;
          *(char *)(*(long *)(lVar4 + 0x38) + param_5) = (char)iVar2;
          param_4 = *(uchar **)(lVar4 + 0x38);
          m_length = (uint)(param_5 + 1);
        }
        goto LAB_00ad6838;
      }
      iVar1 = EVP_MD_get_type(*(undefined8 *)(lVar4 + 0x20));
      iVar1 = RSA_sign(iVar1,param_4,m_length,param_2,&local_58,rsa);
    }
    if (iVar1 < 1) {
      return iVar1;
    }
  }
  if (-1 < (int)local_58) {
    lVar4 = (long)(int)local_58;
    local_58 = 1;
    *param_3 = lVar4;
  }
  return local_58;
}

