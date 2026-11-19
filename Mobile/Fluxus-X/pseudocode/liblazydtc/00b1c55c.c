/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1c55c
 */

undefined8 FUN_00b1c55c(undefined8 *param_1)

{
  bool bVar1;
  uchar **out;
  uchar uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  undefined8 *puVar8;
  ASN1_VALUE *val;
  ASN1_OBJECT *pAVar9;
  ulong uVar10;
  undefined8 uVar11;
  long lVar12;
  ASN1_STRING *dst;
  int iVar13;
  ASN1_STRING *str;
  uchar *puVar14;
  uchar *puVar15;
  uchar *local_70;
  ASN1_VALUE *local_68;
  
  CRYPTO_free((void *)param_1[3]);
  param_1[3] = 0;
  iVar3 = OPENSSL_sk_num(*param_1);
  if (iVar3 == 0) {
    *(undefined4 *)(param_1 + 4) = 0;
    return 1;
  }
  lVar7 = OPENSSL_sk_new_null();
  if (lVar7 == 0) {
    ERR_new();
    uVar11 = 0x141;
LAB_00b1c840:
    ERR_set_debug("crypto/x509/x_name.c",uVar11,"x509_name_canon");
    ERR_set_error(0xb,0xc0100,0);
  }
  else {
    iVar3 = OPENSSL_sk_num(*param_1);
    if (0 < iVar3) {
      iVar3 = 0;
      lVar12 = 0;
      iVar4 = -1;
      do {
        puVar8 = (undefined8 *)OPENSSL_sk_value(*param_1,iVar3);
        if (*(int *)(puVar8 + 2) != iVar4) {
          lVar12 = OPENSSL_sk_new_null();
          if (lVar12 == 0) goto LAB_00b1c858;
          iVar4 = OPENSSL_sk_push(lVar7,lVar12);
          if (iVar4 == 0) {
            OPENSSL_sk_free(lVar12);
            ERR_new();
            uVar11 = 0x14c;
            goto LAB_00b1c840;
          }
          iVar4 = *(int *)(puVar8 + 2);
        }
        val = ASN1_item_new((ASN1_ITEM *)&DAT_00c82478);
        if (val == (ASN1_VALUE *)0x0) {
          ERR_new();
          uVar11 = 0x153;
LAB_00b1c940:
          ERR_set_debug("crypto/x509/x_name.c",uVar11,"x509_name_canon");
          ERR_set_error(0xb,0xc0100,0);
          goto LAB_00b1c958;
        }
        pAVar9 = OBJ_dup((ASN1_OBJECT *)*puVar8);
        *(ASN1_OBJECT **)val = pAVar9;
        if (pAVar9 == (ASN1_OBJECT *)0x0) {
          ERR_new();
          uVar11 = 0x158;
          goto LAB_00b1c940;
        }
        str = (ASN1_STRING *)puVar8[1];
        dst = *(ASN1_STRING **)(val + 8);
        uVar10 = ASN1_tag2bit(str->type);
        if ((uVar10 & 0x2956) == 0) {
          iVar5 = ASN1_STRING_copy(dst,str);
          if (iVar5 == 0) goto LAB_00b1c958;
        }
        else {
          out = &dst->data;
          dst->type = 0xc;
          iVar5 = ASN1_STRING_to_UTF8(out,str);
          dst->length = iVar5;
          if (iVar5 == -1) goto LAB_00b1c958;
          puVar14 = *out;
          if (iVar5 < 1) {
            puVar15 = puVar14;
          }
          else {
            do {
              iVar6 = ossl_ctype_check(*puVar14,8);
              puVar15 = puVar14;
              iVar13 = iVar5;
              if (iVar6 == 0) break;
              iVar13 = iVar5 + -1;
              puVar14 = puVar14 + 1;
              bVar1 = 0 < iVar5;
              puVar15 = puVar14;
              iVar5 = iVar13;
            } while (iVar13 != 0 && bVar1);
            if (iVar13 < 1) {
              puVar14 = *out;
              puVar15 = puVar14;
            }
            else {
              puVar14 = puVar15 + iVar13;
              do {
                puVar14 = puVar14 + -1;
                iVar6 = ossl_ctype_check(*puVar14,8);
                iVar5 = iVar13;
                if (iVar6 == 0) break;
                iVar5 = iVar13 + -1;
                bVar1 = 0 < iVar13;
                iVar13 = iVar5;
              } while (iVar5 != 0 && bVar1);
              puVar14 = *out;
              if (iVar5 < 1) {
                puVar15 = puVar14;
              }
              else {
                iVar13 = 0;
                do {
                  uVar2 = *puVar15;
                  if ((char)uVar2 < '\0') {
LAB_00b1c724:
                    puVar15 = puVar15 + 1;
                    iVar13 = iVar13 + 1;
                    *puVar14 = uVar2;
                  }
                  else {
                    iVar6 = ossl_ctype_check(uVar2,8);
                    if (iVar6 == 0) {
                      uVar2 = ossl_tolower(*puVar15);
                      goto LAB_00b1c724;
                    }
                    *puVar14 = ' ';
                    do {
                      puVar15 = puVar15 + 1;
                      iVar13 = iVar13 + 1;
                      iVar6 = ossl_ctype_check(*puVar15,8);
                    } while (iVar6 != 0);
                  }
                  puVar14 = puVar14 + 1;
                } while (iVar13 < iVar5);
                puVar15 = *out;
              }
            }
          }
          dst->length = (int)puVar14 - (int)puVar15;
        }
        iVar5 = OPENSSL_sk_push(lVar12,val);
        if (iVar5 == 0) {
          ERR_new();
          uVar11 = 0x15e;
          goto LAB_00b1c940;
        }
        iVar3 = iVar3 + 1;
        iVar5 = OPENSSL_sk_num(*param_1);
      } while (iVar3 < iVar5);
    }
    iVar3 = OPENSSL_sk_num(lVar7);
    if (iVar3 < 1) {
      iVar4 = 0;
LAB_00b1c864:
      *(int *)(param_1 + 4) = iVar4;
      local_70 = CRYPTO_malloc(iVar4,"crypto/x509/x_name.c",0x16a);
      if (local_70 != (uchar *)0x0) {
        param_1[3] = local_70;
        iVar3 = OPENSSL_sk_num(lVar7);
        if (0 < iVar3) {
          iVar3 = 0;
          do {
            local_68 = (ASN1_VALUE *)OPENSSL_sk_value(lVar7,iVar3);
            iVar4 = ASN1_item_ex_i2d(&local_68,&local_70,(ASN1_ITEM *)&DAT_00c825e0,-1,-1);
            if (iVar4 < 0) break;
            iVar3 = iVar3 + 1;
            iVar4 = OPENSSL_sk_num(lVar7);
          } while (iVar3 < iVar4);
        }
        val = (ASN1_VALUE *)0x0;
        uVar11 = 1;
        goto LAB_00b1c95c;
      }
      ERR_new();
      uVar11 = 0x16c;
      goto LAB_00b1c840;
    }
    iVar3 = 0;
    iVar4 = 0;
    do {
      local_68 = (ASN1_VALUE *)OPENSSL_sk_value(lVar7,iVar3);
      iVar5 = ASN1_item_ex_i2d(&local_68,(uchar **)0x0,(ASN1_ITEM *)&DAT_00c825e0,-1,-1);
      if (iVar5 < 0) goto LAB_00b1c858;
      iVar4 = iVar5 + iVar4;
      iVar3 = iVar3 + 1;
      iVar5 = OPENSSL_sk_num(lVar7);
    } while (iVar3 < iVar5);
    if (-1 < iVar4) goto LAB_00b1c864;
  }
LAB_00b1c858:
  val = (ASN1_VALUE *)0x0;
LAB_00b1c958:
  uVar11 = 0;
LAB_00b1c95c:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c82478);
  OPENSSL_sk_pop_free(lVar7,&LAB_00b1c9e4);
  return uVar11;
}

