/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9210
 */

long ssl3_choose_cipher(int *param_1,long param_2,long param_3)

{
  bool bVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  
  if ((*(byte *)(*(long *)(param_1 + 0x226) + 0x1e) & 3) == 0) {
    if (((uint)*(undefined8 *)(param_1 + 0x27a) >> 0x16 & 1) != 0) {
      if ((((((uint)*(undefined8 *)(param_1 + 0x27a) >> 0x15 & 1) != 0) &&
           (iVar5 = OPENSSL_sk_num(param_2), 0 < iVar5)) &&
          (lVar11 = OPENSSL_sk_value(param_2,0), *(int *)(lVar11 + 0x24) == 0x80000)) &&
         (iVar5 = OPENSSL_sk_num(param_3), 0 < iVar5)) {
        iVar7 = 1;
LAB_009a95a8:
        lVar11 = OPENSSL_sk_value(param_3,iVar7 + -1);
        if (*(int *)(lVar11 + 0x24) != 0x80000) goto code_r0x009a95c0;
        lVar10 = OPENSSL_sk_new_reserve(0,iVar5);
        lVar12 = lVar10;
        if (lVar10 != 0) {
          OPENSSL_sk_push(lVar10,lVar11);
          if (iVar7 < iVar5) {
            do {
              lVar11 = OPENSSL_sk_value(param_3,iVar7);
              if (*(int *)(lVar11 + 0x24) == 0x80000) {
                OPENSSL_sk_push(lVar10,lVar11);
              }
              iVar7 = iVar7 + 1;
            } while (iVar5 != iVar7);
          }
          iVar7 = 0;
          do {
            lVar11 = OPENSSL_sk_value(param_3,iVar7);
            if (*(int *)(lVar11 + 0x24) != 0x80000) {
              OPENSSL_sk_push(lVar10,lVar11);
            }
            iVar7 = iVar7 + 1;
          } while (iVar5 != iVar7);
          goto LAB_009a9254;
        }
        goto LAB_009a9250;
      }
      goto LAB_009a924c;
    }
    lVar10 = param_2;
    lVar12 = 0;
    param_2 = param_3;
  }
  else {
LAB_009a924c:
    lVar12 = 0;
LAB_009a9250:
    lVar10 = param_3;
  }
LAB_009a9254:
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar5 = **(int **)(param_1 + 2), 0x303 < iVar5)) && (iVar5 != 0x10000)) {
    if (*(long *)(param_1 + 0x264) != 0) {
      lVar11 = *(long *)(param_1 + 0x226);
      if ((((((*(long *)(lVar11 + 0x20) == 0) || (bVar1 = false, *(long *)(lVar11 + 0x28) == 0)) &&
            ((*(long *)(lVar11 + 0x48) == 0 || (bVar1 = false, *(long *)(lVar11 + 0x50) == 0)))) &&
           (((*(long *)(lVar11 + 0x70) == 0 || (bVar1 = false, *(long *)(lVar11 + 0x78) == 0)) &&
            (((*(long *)(lVar11 + 0x98) == 0 || (bVar1 = false, *(long *)(lVar11 + 0xa0) == 0)) &&
             ((((*(long *)(lVar11 + 0xc0) == 0 || (bVar1 = false, *(long *)(lVar11 + 200) == 0)) &&
               ((*(long *)(lVar11 + 0xe8) == 0 || (bVar1 = false, *(long *)(lVar11 + 0xf0) == 0))))
              && ((*(long *)(lVar11 + 0x110) == 0 || (bVar1 = false, *(long *)(lVar11 + 0x118) == 0)
                  ))))))))) &&
          ((*(long *)(lVar11 + 0x138) == 0 || (bVar1 = false, *(long *)(lVar11 + 0x140) == 0)))) &&
         ((*(long *)(lVar11 + 0x160) == 0 || (bVar1 = false, *(long *)(lVar11 + 0x168) == 0)))) {
        bVar1 = true;
      }
      goto LAB_009a9358;
    }
  }
  else {
    tls1_set_cert_validity(param_1);
    ssl_set_masks(param_1);
  }
  bVar1 = false;
LAB_009a9358:
  iVar5 = OPENSSL_sk_num(lVar10);
  if (iVar5 < 1) {
    lVar11 = 0;
  }
  else {
    lVar11 = 0;
    uVar14 = 0;
    uVar13 = 0;
    iVar5 = 0;
    do {
      lVar8 = OPENSSL_sk_value(lVar10,iVar5);
      iVar7 = *param_1;
      if ((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) {
        if ((*(int *)(lVar8 + 0x2c) <= iVar7) && (iVar7 <= *(int *)(lVar8 + 0x30))) {
          iVar7 = **(int **)(param_1 + 2);
          if ((iVar7 < 0x304) || (iVar7 == 0x10000)) goto LAB_009a9404;
          goto LAB_009a9468;
        }
      }
      else {
        iVar6 = 0xff00;
        if (iVar7 != 0x100) {
          iVar6 = iVar7;
        }
        iVar7 = 0xff00;
        if (*(int *)(lVar8 + 0x34) != 0x100) {
          iVar7 = *(int *)(lVar8 + 0x34);
        }
        if (iVar6 <= iVar7) {
          iVar7 = 0xff00;
          if (*(int *)(lVar8 + 0x38) != 0x100) {
            iVar7 = *(int *)(lVar8 + 0x38);
          }
          if (iVar7 <= iVar6) {
LAB_009a9404:
            uVar2 = *(uint *)(lVar8 + 0x1c);
            uVar13 = (ulong)uVar2;
            uVar14 = (ulong)*(uint *)(lVar8 + 0x20);
            if (((uVar2 & 0x1c8) == 0) || (*(long *)(param_1 + 0x264) != 0)) {
              bVar3 = ((*(ulong *)(param_1 + 0x312) & 0x20 | (ulong)(uint)param_1[0xf7]) & uVar13)
                      != 0;
              bVar4 = (((ulong)(uint)param_1[0xf8] | (*(ulong *)(param_1 + 0x312) & 0x20) << 1) &
                      uVar14) != 0;
              if ((uVar2 >> 2 & 1) == 0) {
                if (bVar3 && bVar4) goto LAB_009a9468;
              }
              else if ((bVar3 && bVar4) &&
                      (iVar7 = tls1_check_ec_tmp_key(param_1,*(undefined4 *)(lVar8 + 0x18)),
                      iVar7 != 0)) {
LAB_009a9468:
                iVar7 = OPENSSL_sk_find(param_2,lVar8);
                if (-1 < iVar7) {
                  iVar6 = ssl_security(param_1,0x10002,*(undefined4 *)(lVar8 + 0x44),0,lVar8);
                  if (iVar6 != 0) {
                    if (((((uint)uVar13 >> 2 & 1) == 0) || (((uint)uVar14 >> 3 & 1) == 0)) ||
                       ((char)param_1[299] == '\0')) {
                      lVar8 = OPENSSL_sk_value(param_2,iVar7);
                      if ((!bVar1) ||
                         ((lVar9 = ssl_md(*(undefined8 *)(param_1 + 0x26a),
                                          *(undefined4 *)(lVar8 + 0x40)), lVar9 != 0 &&
                          (iVar7 = EVP_MD_is_a(lVar9,"SHA2-256"), iVar7 != 0)))) {
                        lVar11 = lVar8;
                        break;
                      }
                      if (lVar11 != 0) {
                        lVar8 = lVar11;
                      }
                      lVar11 = lVar8;
                    }
                    else if (lVar11 == 0) {
                      lVar11 = OPENSSL_sk_value(param_2,iVar7);
                    }
                  }
                }
              }
            }
          }
        }
      }
      iVar5 = iVar5 + 1;
      iVar7 = OPENSSL_sk_num(lVar10);
    } while (iVar5 < iVar7);
  }
  OPENSSL_sk_free(lVar12);
  return lVar11;
code_r0x009a95c0:
  bVar1 = iVar5 <= iVar7;
  iVar7 = iVar7 + 1;
  if (bVar1) goto LAB_009a924c;
  goto LAB_009a95a8;
}

