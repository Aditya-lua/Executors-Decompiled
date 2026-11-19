/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4ab88
 */

undefined8 FUN_00b4ab88(undefined8 *param_1,long param_2)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined *puVar7;
  
  uVar3 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    uVar4 = ossl_prov_digest_load_from_params(param_1 + 1,param_2,uVar3);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"secret");
    if ((((lVar5 != 0) || (lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e), lVar5 != 0)) &&
        (*(long *)(lVar5 + 0x18) != 0)) && (*(long *)(lVar5 + 0x10) != 0)) {
      puVar1 = param_1 + 4;
      CRYPTO_free((void *)*puVar1);
      *puVar1 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar1,0,param_1 + 5);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"acvp-info");
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x18) != 0)) && (*(long *)(lVar5 + 0x10) != 0)) {
      puVar1 = param_1 + 6;
      CRYPTO_free((void *)*puVar1);
      *puVar1 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar1,0,param_1 + 7);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"partyu-info");
    if (((lVar5 != 0) || (lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002bbce2), lVar5 != 0)) &&
       ((*(long *)(lVar5 + 0x18) != 0 && (*(long *)(lVar5 + 0x10) != 0)))) {
      puVar1 = param_1 + 8;
      CRYPTO_free((void *)*puVar1);
      *puVar1 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar1,0,param_1 + 0xc);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"partyv-info");
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x18) != 0)) && (*(long *)(lVar5 + 0x10) != 0)) {
      puVar1 = param_1 + 9;
      CRYPTO_free((void *)*puVar1);
      *puVar1 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar1,0,param_1 + 0xd);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"use-keybits");
    if ((lVar5 != 0) && (uVar4 = OSSL_PARAM_get_int(lVar5,param_1 + 0x13), (int)uVar4 == 0)) {
      return uVar4;
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"supp-pubinfo");
    if (lVar5 != 0) {
      if ((*(long *)(lVar5 + 0x18) != 0) && (*(long *)(lVar5 + 0x10) != 0)) {
        puVar1 = param_1 + 10;
        CRYPTO_free((void *)*puVar1);
        *puVar1 = 0;
        uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar1,0,param_1 + 0xe);
        if ((int)uVar4 == 0) {
          return uVar4;
        }
      }
      *(undefined4 *)(param_1 + 0x13) = 0;
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"supp-privinfo");
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x18) != 0)) && (*(long *)(lVar5 + 0x10) != 0)) {
      puVar1 = param_1 + 0xb;
      CRYPTO_free((void *)*puVar1);
      *puVar1 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar1,0,param_1 + 0xf);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"cekalg");
    if (lVar5 != 0) {
      if (*(int *)(lVar5 + 8) != 4) {
        return 0;
      }
      lVar6 = OSSL_PARAM_locate_const(param_2,"properties");
      uVar4 = 0;
      if (lVar6 != 0) {
        uVar4 = *(undefined8 *)(lVar5 + 0x10);
      }
      lVar5 = EVP_CIPHER_fetch(uVar3,*(undefined8 *)(lVar5 + 0x10),uVar4);
      if (lVar5 == 0) {
LAB_00b4af54:
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x5d,"find_alg_id");
        ERR_set_error(0x39,0x91,0);
        EVP_CIPHER_free(lVar5);
        return 0;
      }
      iVar2 = EVP_CIPHER_is_a(lVar5,"AES-128-WRAP");
      lVar6 = 0;
      if (iVar2 == 0) {
        iVar2 = EVP_CIPHER_is_a(lVar5,"AES-192-WRAP");
        if (iVar2 == 0) {
          iVar2 = EVP_CIPHER_is_a(lVar5,"AES-256-WRAP");
          if (iVar2 == 0) {
            iVar2 = EVP_CIPHER_is_a(lVar5,"DES3-WRAP");
            if (iVar2 == 0) goto LAB_00b4af54;
            lVar6 = 3;
          }
          else {
            lVar6 = 2;
          }
        }
        else {
          lVar6 = 1;
        }
      }
      EVP_CIPHER_free(lVar5);
      puVar7 = (&PTR_ossl_der_oid_id_aes128_wrap_00c9d8f0)[lVar6 * 4];
      uVar3 = *(undefined8 *)(&UNK_00c9d900 + lVar6 * 0x20);
      param_1[0x12] = *(undefined8 *)(&UNK_00c9d8f8 + lVar6 * 0x20);
      param_1[0x11] = puVar7;
      param_1[0x10] = uVar3;
    }
  }
  return 1;
}

