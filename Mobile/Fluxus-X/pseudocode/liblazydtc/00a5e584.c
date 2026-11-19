/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e584
 */

uint evp_cipher_asn1_to_param_ex
               (EVP_CIPHER_CTX *param_1,ASN1_TYPE *param_2,void *param_3,void *param_4)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  EVP_CIPHER *pEVar4;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  uchar *local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  pEVar4 = param_1->cipher;
  if (pEVar4->ctrl == (_func_1094 *)0x0) {
    uVar1 = (uint)pEVar4->flags;
    if ((uVar1 >> 0x18 & 1) == 0) {
      uVar1 = uVar1 & 0xf0007;
      if (uVar1 < 0x10001) {
        if (uVar1 == 6) {
          if (param_2 == (ASN1_TYPE *)0x0) {
            uVar1 = 0;
            goto LAB_00a5e7c8;
          }
          uVar1 = 0;
          if (param_3 != (void *)0x0) {
            uVar1 = ossl_asn1_type_get_octetstring_int(param_2,&local_e0,0,0x10);
            if ((int)uVar1 < 1) {
              uVar1 = 0xffffffff;
              goto LAB_00a5e7c8;
            }
            ossl_asn1_type_get_octetstring_int(param_2,&local_e0,&local_b0,uVar1);
            memcpy(param_3,&local_b0,(long)(int)uVar1);
            *(uint *)((long)param_3 + 0x10) = uVar1;
          }
          goto joined_r0x00a5e7ac;
        }
        if (uVar1 == 7) goto LAB_00a5e5c4;
      }
      else {
        if (uVar1 == 0x10001) {
LAB_00a5e5c4:
          ERR_new();
          ERR_set_debug("crypto/evp/evp_lib.c",0xea,"evp_cipher_asn1_to_param_ex");
          ERR_set_error(6,0x6b,0);
          return 0xffffffff;
        }
        if (uVar1 == 0x10002) {
          return 1;
        }
        if (uVar1 == 0x10003) goto LAB_00a5e5c4;
      }
      if (param_2 == (ASN1_TYPE *)0x0) {
        uVar1 = 0;
      }
      else {
        uVar1 = EVP_CIPHER_CTX_get_iv_length(param_1);
        if (((0x10 < uVar1) ||
            (uVar2 = ASN1_TYPE_get_octetstring(param_2,(uchar *)&local_b0,uVar1), uVar2 != uVar1))
           || (iVar3 = EVP_CipherInit_ex(param_1,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,
                                         (uchar *)&local_b0,-1), iVar3 == 0)) {
          uVar1 = 0xffffffff;
        }
      }
      uVar1 = (int)uVar1 >> 0x1f | 1;
    }
    else {
      if (pEVar4[1].do_cipher == (_func_1090 *)0x0) goto LAB_00a5e5c4;
      local_b8 = (uchar *)0x0;
      iVar3 = i2d_ASN1_TYPE(param_2,&local_b8);
      uVar1 = 0xffffffff;
      if (-1 < iVar3) {
        OSSL_PARAM_construct_octet_string(&local_e0,"alg_id_param",local_b8,(long)iVar3);
        local_90 = local_c0;
        uStack_a8 = uStack_d8;
        local_b0 = local_e0;
        uStack_98 = uStack_c8;
        uStack_a0 = uStack_d0;
        OSSL_PARAM_construct_end(&local_e0);
        local_68 = local_c0;
        uStack_70 = uStack_c8;
        local_78 = uStack_d0;
        uStack_80 = uStack_d8;
        local_88 = local_e0;
        iVar3 = EVP_CIPHER_CTX_set_params(param_1,&local_b0);
        uVar1 = 1;
        if (iVar3 == 0) {
          uVar1 = 0xffffffff;
        }
        CRYPTO_free(local_b8);
      }
    }
  }
  else {
    uVar1 = (*pEVar4->ctrl)(param_1,(int)param_2,(int)param_3,param_4);
    if (uVar1 == 0xfffffffe) goto LAB_00a5e5c4;
  }
joined_r0x00a5e7ac:
  if (0 < (int)uVar1) {
    return uVar1;
  }
LAB_00a5e7c8:
  ERR_new();
  ERR_set_debug("crypto/evp/evp_lib.c",0xec,"evp_cipher_asn1_to_param_ex");
  ERR_set_error(6,0x7a,0);
  if ((int)uVar1 < -1) {
    return 0xffffffff;
  }
  return uVar1;
}

