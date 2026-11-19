/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae75a0
 */

undefined8 SRP_VBASE_init(undefined8 *param_1,void *param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  BIO_METHOD *type;
  BIO *bp;
  long lVar5;
  TXT_DB *db;
  undefined8 *puVar6;
  undefined8 *ptr;
  char *pcVar7;
  undefined8 *puVar8;
  BIGNUM *pBVar9;
  undefined8 uVar10;
  char *pcVar11;
  undefined8 uVar12;
  char *local_a38;
  uchar auStack_a2c [2508];
  
  lVar4 = OPENSSL_sk_new_null();
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    db = (TXT_DB *)0x0;
    uVar10 = 3;
  }
  else {
    uVar10 = 3;
    lVar5 = BIO_ctrl(bp,0x6c,3,param_2);
    if ((int)lVar5 < 1) {
      db = (TXT_DB *)0x0;
    }
    else {
      db = TXT_DB_read(bp,6);
      if (db == (TXT_DB *)0x0) {
        uVar10 = 1;
      }
      else {
        local_a38 = (char *)0x0;
        if (param_1[2] != 0) {
          puVar6 = (undefined8 *)SRP_get_default_gN(0);
          local_a38 = (char *)*puVar6;
        }
        iVar1 = OPENSSL_sk_num(db->data);
        if (0 < iVar1) {
          iVar1 = 0;
          uVar10 = 4;
          do {
            puVar6 = (undefined8 *)OPENSSL_sk_value(db->data,iVar1);
            if (*(char *)*puVar6 == 'V') {
              pcVar7 = (char *)puVar6[4];
              if ((lVar4 != 0) && (iVar2 = OPENSSL_sk_num(lVar4), 0 < iVar2)) {
                iVar2 = 0;
                do {
                  puVar8 = (undefined8 *)OPENSSL_sk_value(lVar4,iVar2);
                  if ((puVar8 != (undefined8 *)0x0) &&
                     ((pcVar7 == (char *)0x0 || (iVar3 = strcmp((char *)*puVar8,pcVar7), iVar3 == 0)
                      ))) goto LAB_00ae7758;
                  iVar2 = iVar2 + 1;
                  iVar3 = OPENSSL_sk_num(lVar4);
                } while (iVar2 < iVar3);
              }
              puVar8 = (undefined8 *)SRP_get_default_gN(pcVar7);
LAB_00ae7758:
              if (puVar8 == (undefined8 *)0x0) goto LAB_00ae7870;
              ptr = CRYPTO_malloc(0x30,"crypto/srp/srp_vfy.c",0xc2);
              if (ptr == (undefined8 *)0x0) {
                uVar10 = 4;
              }
              else {
                ptr[3] = 0;
                ptr[2] = 0;
                ptr[5] = 0;
                ptr[4] = 0;
                ptr[1] = 0;
                *ptr = 0;
                uVar10 = puVar8[1];
                ptr[4] = puVar8[2];
                ptr[3] = uVar10;
                pcVar11 = (char *)puVar6[3];
                pcVar7 = (char *)puVar6[5];
                CRYPTO_free((void *)0x0);
                CRYPTO_free((void *)ptr[5]);
                if (pcVar11 == (char *)0x0) {
LAB_00ae77d4:
                  if (pcVar7 != (char *)0x0) {
                    pcVar7 = CRYPTO_strdup(pcVar7,"crypto/srp/srp_vfy.c",0xdd);
                    ptr[5] = pcVar7;
                    if (pcVar7 == (char *)0x0) goto LAB_00ae7954;
                  }
                  uVar10 = puVar6[1];
                  uVar12 = puVar6[2];
                  ptr[1] = 0;
                  puVar6 = ptr + 2;
                  *puVar6 = 0;
                  iVar2 = FUN_00ae8258(auStack_a2c,uVar10);
                  if (-1 < iVar2) {
                    pBVar9 = BN_bin2bn(auStack_a2c,iVar2,(BIGNUM *)0x0);
                    *puVar6 = pBVar9;
                    if (pBVar9 != (BIGNUM *)0x0) {
                      iVar2 = FUN_00ae8258(auStack_a2c,uVar12);
                      if (-1 < iVar2) {
                        pBVar9 = BN_bin2bn(auStack_a2c,iVar2,(BIGNUM *)0x0);
                        ptr[1] = pBVar9;
                        if (pBVar9 != (BIGNUM *)0x0) {
                          iVar2 = OPENSSL_sk_insert(*param_1,ptr,0);
                          uVar10 = 2;
                          if (iVar2 != 0) goto LAB_00ae7870;
                          goto LAB_00ae7960;
                        }
                      }
                      BN_free((BIGNUM *)*puVar6);
                      *puVar6 = 0;
                    }
                  }
                  uVar10 = 2;
                }
                else {
                  pcVar11 = CRYPTO_strdup(pcVar11,"crypto/srp/srp_vfy.c",0xdb);
                  *ptr = pcVar11;
                  if (pcVar11 != (char *)0x0) goto LAB_00ae77d4;
LAB_00ae7954:
                  uVar10 = 4;
                }
LAB_00ae7960:
                BN_free((BIGNUM *)ptr[1]);
                BN_clear_free((BIGNUM *)ptr[2]);
                CRYPTO_free((void *)*ptr);
                CRYPTO_free((void *)ptr[5]);
LAB_00ae799c:
                CRYPTO_free(ptr);
              }
              goto LAB_00ae79a8;
            }
            if (*(char *)*puVar6 == 'I') {
              ptr = CRYPTO_malloc(0x18,"crypto/srp/srp_vfy.c",0x1af);
              if (ptr != (undefined8 *)0x0) {
                pcVar7 = CRYPTO_strdup((char *)puVar6[3],"crypto/srp/srp_vfy.c",0x1b2);
                *ptr = pcVar7;
                if (pcVar7 != (char *)0x0) {
                  lVar5 = FUN_00ae79ec(param_1[1],puVar6[1]);
                  ptr[2] = lVar5;
                  if (lVar5 != 0) {
                    lVar5 = FUN_00ae79ec(param_1[1],puVar6[2]);
                    ptr[1] = lVar5;
                    if ((lVar5 != 0) && (iVar2 = OPENSSL_sk_insert(lVar4,ptr,0), iVar2 != 0)) {
                      if (param_1[2] != 0) {
                        local_a38 = (char *)puVar6[3];
                      }
                      goto LAB_00ae7870;
                    }
                  }
                }
                CRYPTO_free((void *)*ptr);
                goto LAB_00ae799c;
              }
              goto LAB_00ae79a8;
            }
LAB_00ae7870:
            iVar1 = iVar1 + 1;
            iVar2 = OPENSSL_sk_num(db->data);
          } while (iVar1 < iVar2);
        }
        uVar10 = 0;
        if (local_a38 != (char *)0x0) {
          if ((lVar4 != 0) && (iVar1 = OPENSSL_sk_num(lVar4), 0 < iVar1)) {
            iVar1 = 0;
            do {
              puVar6 = (undefined8 *)OPENSSL_sk_value(lVar4,iVar1);
              if ((puVar6 != (undefined8 *)0x0) &&
                 (iVar2 = strcmp((char *)*puVar6,local_a38), iVar2 == 0)) goto LAB_00ae78e8;
              iVar1 = iVar1 + 1;
              iVar2 = OPENSSL_sk_num(lVar4);
            } while (iVar1 < iVar2);
          }
          puVar6 = (undefined8 *)SRP_get_default_gN(local_a38);
LAB_00ae78e8:
          if (puVar6 == (undefined8 *)0x0) {
            uVar10 = 2;
          }
          else {
            uVar12 = puVar6[1];
            uVar10 = 0;
            param_1[4] = puVar6[2];
            param_1[3] = uVar12;
          }
        }
      }
    }
  }
LAB_00ae79a8:
  TXT_DB_free(db);
  BIO_free_all(bp);
  OPENSSL_sk_free(lVar4);
  return uVar10;
}

