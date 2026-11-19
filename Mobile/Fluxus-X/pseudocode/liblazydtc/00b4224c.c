/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4224c
 */

undefined8 FUN_00b4224c(BIO *param_1,long param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int param2;
  uint param2_00;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  char *pcVar9;
  char *pcVar10;
  char *pcVar11;
  undefined8 uVar12;
  undefined8 local_78;
  BIGNUM *local_70;
  undefined8 local_68;
  
  local_70 = (BIGNUM *)0x0;
  local_68 = 0;
  local_78 = 0;
  uVar5 = ossl_rsa_get0_pss_params_30(param_2);
  if ((param_1 == (BIO *)0x0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x283,"rsa_to_text");
    ERR_set_error(0x39,0xc0102,0);
    lVar8 = 0;
    lVar7 = 0;
    uVar12 = 0;
    lVar6 = 0;
    goto LAB_00b42358;
  }
  lVar6 = OPENSSL_sk_new_null();
  lVar7 = OPENSSL_sk_new_null();
  lVar8 = OPENSSL_sk_new_null();
  if (((lVar6 == 0) || (lVar7 == 0)) || (lVar8 == 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x28c,"rsa_to_text");
    ERR_set_error(0x39,0xc0100,0);
  }
  else {
    if ((param_3 & 1) == 0) {
      if ((param_3 >> 1 & 1) == 0) {
        pcVar9 = (char *)0x0;
        pcVar10 = (char *)0x0;
        pcVar11 = "RSA key";
      }
      else {
        pcVar11 = "Public-Key";
        pcVar10 = "Modulus:";
        pcVar9 = "Exponent:";
      }
    }
    else {
      pcVar11 = "Private-Key";
      pcVar10 = "modulus:";
      pcVar9 = "publicExponent:";
    }
    RSA_get0_key(param_2,&local_70,&local_78,&local_68);
    ossl_rsa_get0_all_params(param_2,lVar6,lVar7,lVar8);
    iVar1 = OPENSSL_sk_num(lVar6);
    iVar2 = BN_num_bits(local_70);
    if ((param_3 & 1) == 0) {
      iVar1 = BIO_printf(param_1,"%s: (%d bit)\n",pcVar11,iVar2);
    }
    else {
      iVar1 = BIO_printf(param_1,"%s: (%d bit, %d primes)\n",pcVar11,iVar2,iVar1);
    }
    if (((0 < iVar1) && (iVar1 = FUN_00b41650(param_1,pcVar10,local_70), iVar1 != 0)) &&
       (iVar1 = FUN_00b41650(param_1,pcVar9,local_78), iVar1 != 0)) {
      if ((param_3 & 1) == 0) {
LAB_00b4262c:
        if ((param_3 >> 7 & 1) != 0) {
          iVar1 = RSA_test_flags(param_2,0xf000);
          if (iVar1 == 0x1000) {
            iVar1 = ossl_rsa_pss_params_30_is_unrestricted(uVar5);
            if (iVar1 == 0) {
              iVar1 = ossl_rsa_pss_params_30_hashalg(uVar5);
              iVar2 = ossl_rsa_pss_params_30_maskgenalg(uVar5);
              iVar3 = ossl_rsa_pss_params_30_maskgenhashalg(uVar5);
              param2 = ossl_rsa_pss_params_30_saltlen(uVar5);
              param2_00 = ossl_rsa_pss_params_30_trailerfield(uVar5);
              iVar4 = BIO_printf(param_1,"PSS parameter restrictions:\n");
              if (0 < iVar4) {
                pcVar10 = (char *)ossl_rsa_oaeppss_nid2name(iVar1);
                pcVar9 = " (default)";
                if (iVar1 != 0x40) {
                  pcVar9 = "";
                }
                iVar1 = BIO_printf(param_1,"  Hash Algorithm: %s%s\n",pcVar10,pcVar9);
                if (0 < iVar1) {
                  pcVar10 = (char *)ossl_rsa_mgf_nid2name(iVar2);
                  pcVar11 = (char *)ossl_rsa_oaeppss_nid2name(iVar3);
                  pcVar9 = " (default)";
                  if (iVar3 != 0x40 || iVar2 != 0x38f) {
                    pcVar9 = "";
                  }
                  iVar1 = BIO_printf(param_1,"  Mask Algorithm: %s with %s%s\n",pcVar10,pcVar11,
                                     pcVar9);
                  if (0 < iVar1) {
                    pcVar9 = " (default)";
                    if (param2 != 0x14) {
                      pcVar9 = "";
                    }
                    iVar1 = BIO_printf(param_1,"  Minimum Salt Length: %d%s\n",param2,pcVar9);
                    if (0 < iVar1) {
                      pcVar9 = " (default)";
                      if (param2_00 != 1) {
                        pcVar9 = "";
                      }
                      iVar1 = BIO_printf(param_1,"  Trailer Field: 0x%x%s\n",param2_00,pcVar9);
                      if (0 < iVar1) goto LAB_00b42688;
                    }
                  }
                }
              }
              goto LAB_00b42354;
            }
            pcVar9 = "No PSS parameter restrictions\n";
          }
          else {
            if ((iVar1 != 0) || (iVar1 = ossl_rsa_pss_params_30_is_unrestricted(uVar5), iVar1 != 0))
            goto LAB_00b42688;
            pcVar9 = "(INVALID PSS PARAMETERS)\n";
          }
          iVar1 = BIO_printf(param_1,pcVar9);
          if (iVar1 < 1) goto LAB_00b42354;
        }
LAB_00b42688:
        uVar12 = 1;
        goto LAB_00b42358;
      }
      iVar1 = FUN_00b41650(param_1,"privateExponent:",local_68);
      if (iVar1 != 0) {
        uVar12 = OPENSSL_sk_value(lVar6,0);
        iVar1 = FUN_00b41650(param_1,"prime1:",uVar12);
        if (iVar1 != 0) {
          uVar12 = OPENSSL_sk_value(lVar6,1);
          iVar1 = FUN_00b41650(param_1,"prime2:",uVar12);
          if (iVar1 != 0) {
            uVar12 = OPENSSL_sk_value(lVar7,0);
            iVar1 = FUN_00b41650(param_1,"exponent1:",uVar12);
            if (iVar1 != 0) {
              uVar12 = OPENSSL_sk_value(lVar7,1);
              iVar1 = FUN_00b41650(param_1,"exponent2:",uVar12);
              if (iVar1 != 0) {
                uVar12 = OPENSSL_sk_value(lVar8,0);
                iVar1 = FUN_00b41650(param_1,"coefficient:",uVar12);
                if (iVar1 != 0) {
                  iVar1 = 2;
                  do {
                    iVar2 = OPENSSL_sk_num(lVar6);
                    if (iVar2 <= iVar1) goto LAB_00b4262c;
                    iVar2 = BIO_printf(param_1,"prime%d:",iVar1 + 1);
                    if (iVar2 < 1) goto LAB_00b42354;
                    uVar12 = OPENSSL_sk_value(lVar6,iVar1);
                    iVar2 = FUN_00b41650(param_1,0,uVar12);
                    if ((iVar2 == 0) ||
                       (iVar2 = BIO_printf(param_1,"exponent%d:",iVar1 + 1), iVar2 < 1))
                    goto LAB_00b42354;
                    uVar12 = OPENSSL_sk_value(lVar7,iVar1);
                    iVar2 = FUN_00b41650(param_1,0,uVar12);
                    if (iVar2 == 0) goto LAB_00b42354;
                    iVar2 = BIO_printf(param_1,"coefficient%d:",iVar1 + 1);
                    if (iVar2 < 1) goto LAB_00b42354;
                    uVar12 = OPENSSL_sk_value(lVar8,iVar1 + -1);
                    iVar2 = FUN_00b41650(param_1,0,uVar12);
                    uVar12 = 0;
                    iVar1 = iVar1 + 1;
                  } while (iVar2 != 0);
                  goto LAB_00b42358;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_00b42354:
  uVar12 = 0;
LAB_00b42358:
  OPENSSL_sk_free(lVar6);
  OPENSSL_sk_free(lVar7);
  OPENSSL_sk_free(lVar8);
  return uVar12;
}

