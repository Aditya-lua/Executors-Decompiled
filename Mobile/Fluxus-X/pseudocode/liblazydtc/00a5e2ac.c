/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e2ac
 */

int evp_cipher_param_to_asn1_ex(EVP_CIPHER_CTX *param_1,ASN1_TYPE *param_2,long param_3)

{
  int iVar1;
  int iVar2;
  uchar *ptr;
  ASN1_TYPE *pAVar3;
  char *pcVar4;
  EVP_CIPHER *pEVar5;
  uint uVar6;
  uchar *local_c8;
  undefined8 uStack_c0;
  uchar *local_b8;
  long lStack_b0;
  long local_a8;
  uchar *local_a0;
  undefined8 uStack_98;
  uchar *local_90;
  long lStack_88;
  long local_80;
  uchar *local_78;
  undefined8 uStack_70;
  uchar *local_68;
  long lStack_60;
  long local_58;
  ASN1_TYPE *local_28;
  
  pEVar5 = param_1->cipher;
  local_28 = param_2;
  if (pEVar5->get_asn1_parameters == (_func_1093 *)0x0) {
    uVar6 = (uint)pEVar5->flags;
    if ((uVar6 >> 0x18 & 1) == 0) {
      uVar6 = uVar6 & 0xf0007;
      if (uVar6 < 0x10001) {
        if (uVar6 == 6) {
          if (param_2 == (ASN1_TYPE *)0x0) {
            iVar1 = 0;
            goto LAB_00a5e4bc;
          }
          iVar1 = 0;
          if (param_3 == 0) goto LAB_00a5e4bc;
          iVar1 = ossl_asn1_type_set_octetstring_int
                            (param_2,*(undefined4 *)(param_3 + 0x14),param_3,
                             *(undefined4 *)(param_3 + 0x10));
          goto LAB_00a5e2e0;
        }
        if (uVar6 == 7) goto LAB_00a5e2ec;
      }
      else {
        if ((uVar6 == 0x10001) || (uVar6 == 0x10003)) goto LAB_00a5e2ec;
        if (uVar6 == 0x10002) {
          if (pEVar5[1].do_cipher == (_func_1090 *)0x0) {
            pcVar4 = (char *)pEVar5[1].flags;
            if (pcVar4 == (char *)0x0) {
              pcVar4 = OBJ_nid2sn(pEVar5->nid);
            }
            iVar1 = evp_is_a(0,0,pcVar4,"id-smime-alg-CMS3DESwrap");
          }
          else {
            iVar1 = evp_is_a(pEVar5[1].do_cipher,pEVar5[1].key_len,0,"id-smime-alg-CMS3DESwrap");
          }
          if (iVar1 != 0) {
            ASN1_TYPE_set(param_2,5,(void *)0x0);
          }
          return 1;
        }
      }
      iVar1 = EVP_CIPHER_set_asn1_iv(param_1,param_2);
      goto LAB_00a5e2e0;
    }
    if (pEVar5[1].do_cipher == (_func_1090 *)0x0) goto LAB_00a5e2ec;
    OSSL_PARAM_construct_octet_string(&local_c8,"alg_id_param",0,0);
    local_80 = local_a8;
    uStack_98 = uStack_c0;
    local_a0 = local_c8;
    lStack_88 = lStack_b0;
    local_90 = local_b8;
    OSSL_PARAM_construct_end(&local_c8);
    local_58 = local_a8;
    lStack_60 = lStack_b0;
    local_68 = local_b8;
    uStack_70 = uStack_c0;
    local_78 = local_c8;
    iVar1 = EVP_CIPHER_CTX_get_params(param_1,&local_a0);
    if (iVar1 == 0) {
      iVar1 = -1;
    }
    else {
      iVar1 = OSSL_PARAM_modified(&local_a0);
      if (((iVar1 == 0) || (local_80 == 0)) ||
         (ptr = CRYPTO_malloc((int)local_80,"crypto/evp/evp_lib.c",0x90), ptr == (uchar *)0x0)) {
        iVar1 = -1;
        goto LAB_00a5e4bc;
      }
      lStack_88 = local_80;
      local_90 = ptr;
      OSSL_PARAM_set_all_unmodified(&local_a0);
      local_c8 = ptr;
      iVar1 = EVP_CIPHER_CTX_get_params(param_1,&local_a0);
      if (iVar1 == 0) {
        iVar1 = -1;
      }
      else {
        iVar2 = OSSL_PARAM_modified(&local_a0);
        iVar1 = -1;
        if (iVar2 != 0) {
          pAVar3 = d2i_ASN1_TYPE(&local_28,&local_c8,local_80);
          iVar1 = 1;
          if (pAVar3 == (ASN1_TYPE *)0x0) {
            iVar1 = -1;
          }
        }
      }
      CRYPTO_free(ptr);
    }
  }
  else {
    iVar1 = (*pEVar5->get_asn1_parameters)(param_1,param_2);
LAB_00a5e2e0:
    if (iVar1 == -2) {
LAB_00a5e2ec:
      ERR_new();
      ERR_set_debug("crypto/evp/evp_lib.c",0xa3,"evp_cipher_param_to_asn1_ex");
      ERR_set_error(6,0x6b,0);
      return -1;
    }
  }
  if (0 < iVar1) {
    return iVar1;
  }
LAB_00a5e4bc:
  ERR_new();
  ERR_set_debug("crypto/evp/evp_lib.c",0xa5,"evp_cipher_param_to_asn1_ex");
  ERR_set_error(6,0x7a,0);
  if (iVar1 < -1) {
    return -1;
  }
  return iVar1;
}

