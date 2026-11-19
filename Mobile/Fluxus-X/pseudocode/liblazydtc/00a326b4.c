/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a326b4
 */

EC_GROUP * EC_GROUP_new_from_params(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  void *__src;
  size_t __n;
  EC_POINT *generator;
  bool bVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  BN_CTX *ctx;
  EC_GROUP *pEVar5;
  void *__dest;
  EC_POINT *p;
  EC_GROUP *pEVar6;
  undefined8 uVar7;
  byte *buf;
  BIGNUM *order;
  EC_GROUP *pEVar8;
  int local_98;
  int local_94;
  BIGNUM *local_90;
  BIGNUM *local_88;
  BIGNUM *local_80;
  BIGNUM *local_78;
  BIGNUM *local_70;
  long local_68;
  
  local_78 = (BIGNUM *)0x0;
  local_70 = (BIGNUM *)0x0;
  local_88 = (BIGNUM *)0x0;
  local_80 = (BIGNUM *)0x0;
  local_90 = (BIGNUM *)0x0;
  local_94 = -1;
  lVar4 = OSSL_PARAM_locate_const(param_1,"group");
  if (lVar4 != 0) {
    local_98 = 0;
    local_68 = 0;
    if (*(int *)(lVar4 + 8) == 6) {
      iVar2 = OSSL_PARAM_get_utf8_ptr(lVar4,&local_68);
      if (iVar2 == 0) {
        return (EC_GROUP *)0x0;
      }
    }
    else {
      if (*(int *)(lVar4 + 8) != 4) {
        return (EC_GROUP *)0x0;
      }
      local_68 = *(long *)(lVar4 + 0x10);
      if (local_68 == 0) {
        return (EC_GROUP *)0x0;
      }
    }
    iVar2 = ossl_ec_curve_name2nid(local_68);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x5d4,"group_new_from_name");
      ERR_set_error(0x10,0x8d,0);
      return (EC_GROUP *)0x0;
    }
    pEVar5 = (EC_GROUP *)EC_GROUP_new_by_curve_name_ex(param_2,param_3,iVar2);
    if (pEVar5 == (EC_GROUP *)0x0) {
      return (EC_GROUP *)0x0;
    }
    iVar2 = ossl_ec_group_set_params(pEVar5,param_1);
    if (iVar2 != 0) {
      lVar4 = OSSL_PARAM_locate_const(param_1,"decoded-from-explicit");
      if ((lVar4 == 0) || (iVar2 = OSSL_PARAM_get_int(lVar4,&local_98), iVar2 != 0)) {
        *(uint *)(pEVar5 + 0x28) = (uint)(0 < local_98);
        return pEVar5;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x623,"EC_GROUP_new_from_params");
      ERR_set_error(0x10,0x91,0);
    }
    EC_GROUP_free(pEVar5);
    return (EC_GROUP *)0x0;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(param_2);
  if (ctx == (BN_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x631,"EC_GROUP_new_from_params");
    ERR_set_error(0x10,0xc0100,0);
    return (EC_GROUP *)0x0;
  }
  BN_CTX_start(ctx);
  local_70 = BN_CTX_get(ctx);
  local_78 = BN_CTX_get(ctx);
  local_80 = BN_CTX_get(ctx);
  local_88 = BN_CTX_get(ctx);
  if (local_88 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x63b,"EC_GROUP_new_from_params");
    uVar7 = 0xc0100;
LAB_00a32924:
    ERR_set_error(0x10,uVar7,0);
    pEVar5 = (EC_GROUP *)0x0;
  }
  else {
    lVar4 = OSSL_PARAM_locate_const(param_1,"field-type");
    if ((lVar4 == 0) || (*(int *)(lVar4 + 8) != 4)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x641,"EC_GROUP_new_from_params");
      uVar7 = 0x67;
      goto LAB_00a32924;
    }
    iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar4 + 0x10),"prime-field");
    if (iVar2 == 0) {
      bVar1 = true;
    }
    else {
      iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar4 + 0x10),"characteristic-two-field");
      if (iVar2 != 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x64b,"EC_GROUP_new_from_params");
        uVar7 = 0x83;
        goto LAB_00a32924;
      }
      bVar1 = false;
    }
    uVar7 = OSSL_PARAM_locate_const(param_1,&DAT_002a374f);
    iVar2 = OSSL_PARAM_get_BN(uVar7,&local_78);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x651,"EC_GROUP_new_from_params");
      uVar7 = 0xa8;
      goto LAB_00a32924;
    }
    uVar7 = OSSL_PARAM_locate_const(param_1,&DAT_002adabd);
    iVar2 = OSSL_PARAM_get_BN(uVar7,&local_80);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x656,"EC_GROUP_new_from_params");
      uVar7 = 0xa9;
      goto LAB_00a32924;
    }
    uVar7 = OSSL_PARAM_locate_const(param_1,&DAT_002a38e7);
    iVar2 = OSSL_PARAM_get_BN(uVar7,&local_70);
    if (iVar2 == 0) {
      ERR_new();
      uVar7 = 0x65d;
LAB_00a32aac:
      ERR_set_debug("crypto/ec/ec_lib.c",uVar7,"EC_GROUP_new_from_params");
      uVar7 = 0xac;
      goto LAB_00a32924;
    }
    if (bVar1) {
      iVar2 = BN_is_negative();
      if ((iVar2 != 0) || (iVar2 = BN_is_zero(local_70), iVar2 != 0)) {
        ERR_new();
        uVar7 = 0x663;
        goto LAB_00a32aac;
      }
      iVar2 = BN_num_bits(local_70);
      if (0x295 < iVar2) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x668,"EC_GROUP_new_from_params");
        uVar7 = 0x8f;
        goto LAB_00a32924;
      }
      pEVar5 = EC_GROUP_new_curve_GFp(local_70,local_78,local_80,ctx);
      if (pEVar5 != (EC_GROUP *)0x0) goto LAB_00a32bac;
LAB_00a32cf4:
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x680,"EC_GROUP_new_from_params");
      uVar7 = 0x80010;
      goto LAB_00a32924;
    }
    pEVar5 = (EC_GROUP *)EC_GROUP_new_curve_GF2m(local_70,local_78,local_80,0);
    if (pEVar5 == (EC_GROUP *)0x0) goto LAB_00a32cf4;
    if (*(code **)(*(long *)pEVar5 + 0x38) == (code *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x25e,"EC_GROUP_get_degree");
      ERR_set_error(0x10,0xc0101,0);
      iVar2 = 0;
LAB_00a32bac:
      lVar4 = OSSL_PARAM_locate_const(param_1,&DAT_002bb864);
      if (lVar4 != 0) {
        if (*(int *)(lVar4 + 8) != 5) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_lib.c",0x688,"EC_GROUP_new_from_params");
          uVar7 = 0xaf;
          goto LAB_00a32d6c;
        }
        __src = *(void **)(lVar4 + 0x10);
        __n = *(size_t *)(lVar4 + 0x18);
        pEVar8 = pEVar5 + 0x30;
        CRYPTO_free(*(void **)pEVar8);
        *(undefined8 *)pEVar8 = 0;
        *(undefined8 *)(pEVar5 + 0x38) = 0;
        if ((__src != (void *)0x0) && (__n != 0)) {
          __dest = CRYPTO_malloc((int)__n,"crypto/ec/ec_lib.c",0x217);
          *(void **)pEVar8 = __dest;
          if (__dest == (void *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_lib.c",0x218,"EC_GROUP_set_seed");
            uVar7 = 0xc0100;
            goto LAB_00a32d6c;
          }
          memcpy(__dest,__src,__n);
          *(size_t *)(pEVar5 + 0x38) = __n;
        }
      }
      lVar4 = OSSL_PARAM_locate_const(param_1,"generator");
      if ((lVar4 == 0) || (*(int *)(lVar4 + 8) != 5)) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x693,"EC_GROUP_new_from_params");
        uVar7 = 0xad;
        goto LAB_00a32d6c;
      }
      buf = *(byte **)(lVar4 + 0x10);
      p = EC_POINT_new(pEVar5);
      if (p != (EC_POINT *)0x0) {
        *(uint *)(pEVar5 + 0x2c) = *buf & 0xfe;
        iVar3 = EC_POINT_oct2point(pEVar5,p,buf,*(size_t *)(lVar4 + 0x18),ctx);
        if (iVar3 == 0) {
          ERR_new();
          uVar7 = 0x69c;
LAB_00a32dbc:
          ERR_set_debug("crypto/ec/ec_lib.c",uVar7,"EC_GROUP_new_from_params");
          uVar7 = 0xad;
LAB_00a32dc8:
          ERR_set_error(0x10,uVar7,0);
          EC_GROUP_free(pEVar5);
          pEVar5 = (EC_GROUP *)0x0;
        }
        else {
          uVar7 = OSSL_PARAM_locate_const(param_1,"order");
          iVar3 = OSSL_PARAM_get_BN(uVar7,&local_88);
          if ((((iVar3 == 0) || (iVar3 = BN_is_negative(local_88), iVar3 != 0)) ||
              (iVar3 = BN_is_zero(local_88), iVar3 != 0)) ||
             (iVar3 = BN_num_bits(local_88), iVar2 + 1 < iVar3)) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_lib.c",0x6a5,"EC_GROUP_new_from_params");
            uVar7 = 0x7a;
            goto LAB_00a32dc8;
          }
          lVar4 = OSSL_PARAM_locate_const(param_1,"cofactor");
          if ((lVar4 != 0) &&
             ((local_90 = BN_CTX_get(ctx), local_90 == (BIGNUM *)0x0 ||
              (iVar2 = OSSL_PARAM_get_BN(lVar4,&local_90), iVar2 == 0)))) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_lib.c",0x6ae,"EC_GROUP_new_from_params");
            uVar7 = 0xab;
            goto LAB_00a32dc8;
          }
          iVar2 = EC_GROUP_set_generator(pEVar5,p,local_88,local_90);
          if (iVar2 == 0) {
            ERR_new();
            uVar7 = 0x6b5;
            goto LAB_00a32dbc;
          }
          generator = *(EC_POINT **)(pEVar5 + 8);
          order = *(BIGNUM **)(pEVar5 + 0x10);
          lVar4 = *(long *)(pEVar5 + 0x30);
          pEVar8 = (EC_GROUP *)
                   ossl_ec_group_new_ex
                             (*(undefined8 *)(pEVar5 + 0xa8),*(undefined8 *)(pEVar5 + 0xb0),
                              *(undefined8 *)pEVar5);
          if (pEVar8 == (EC_GROUP *)0x0) {
LAB_00a32f68:
            EC_GROUP_free(pEVar8);
            ERR_new();
            ERR_set_debug("crypto/ec/ec_lib.c",0x6bb,"EC_GROUP_new_from_params");
            uVar7 = 0xae;
            goto LAB_00a32dc8;
          }
          iVar2 = EC_GROUP_copy(pEVar8,pEVar5);
          if (iVar2 == 0) {
            EC_GROUP_free(pEVar8);
            pEVar8 = (EC_GROUP *)0x0;
            goto LAB_00a32f68;
          }
          CRYPTO_free(*(void **)(pEVar8 + 0x30));
          *(undefined8 *)(pEVar8 + 0x30) = 0;
          *(undefined8 *)(pEVar8 + 0x38) = 0;
          iVar2 = EC_GROUP_set_generator(pEVar8,generator,order,(BIGNUM *)0x0);
          if (iVar2 == 0) goto LAB_00a32f68;
          iVar2 = ossl_ec_curve_nid_from_params(pEVar8,ctx);
          if (iVar2 == 0) {
            EC_GROUP_free(pEVar8);
LAB_00a32fa0:
            lVar4 = OSSL_PARAM_locate_const(param_1,"encoding");
            if ((lVar4 == 0) || (iVar2 = ossl_ec_encoding_param2id(lVar4,&local_94), iVar2 != 0)) {
              if (local_94 != 1) {
                *(undefined4 *)(pEVar5 + 0x24) = 0;
                goto LAB_00a32fec;
              }
              ERR_new();
              uVar7 = 0x6ca;
            }
            else {
              ERR_new();
              uVar7 = 0x6c6;
            }
            ERR_set_debug("crypto/ec/ec_lib.c",uVar7,"EC_GROUP_new_from_params");
            uVar7 = 0x66;
            goto LAB_00a32dc8;
          }
          pEVar6 = (EC_GROUP *)EC_GROUP_new_by_curve_name_ex(param_2,param_3,iVar2);
          if (pEVar6 == (EC_GROUP *)0x0) goto LAB_00a32f68;
          *(undefined4 *)(pEVar6 + 0x24) = 0;
          if (lVar4 == 0) {
            CRYPTO_free(*(void **)(pEVar6 + 0x30));
            *(undefined8 *)(pEVar6 + 0x30) = 0;
            *(undefined8 *)(pEVar6 + 0x38) = 0;
          }
          EC_GROUP_free(pEVar8);
          if (pEVar6 == pEVar5) goto LAB_00a32fa0;
          EC_GROUP_free(pEVar5);
          pEVar5 = pEVar6;
LAB_00a32fec:
          *(undefined4 *)(pEVar5 + 0x28) = 1;
        }
        if (*(code **)(*(long *)p + 0x58) != (code *)0x0) {
          (**(code **)(*(long *)p + 0x58))(p);
        }
        CRYPTO_free(p);
        goto LAB_00a3293c;
      }
    }
    else {
      iVar2 = (**(code **)(*(long *)pEVar5 + 0x38))(pEVar5);
      if (iVar2 < 0x296) goto LAB_00a32bac;
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x678,"EC_GROUP_new_from_params");
      uVar7 = 0x8f;
LAB_00a32d6c:
      ERR_set_error(0x10,uVar7,0);
    }
  }
  EC_GROUP_free(pEVar5);
  pEVar5 = (EC_GROUP *)0x0;
LAB_00a3293c:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return pEVar5;
}

