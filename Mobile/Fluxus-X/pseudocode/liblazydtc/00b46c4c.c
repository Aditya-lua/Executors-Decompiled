/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b46c4c
 */

undefined8 FUN_00b46c4c(long param_1,byte *param_2,ulong param_3,undefined8 param_4)

{
  uint uVar1;
  void *key;
  uchar *data;
  int iVar2;
  uint uVar3;
  EVP_MD *md;
  HMAC_CTX *ctx;
  HMAC_CTX *dctx;
  undefined8 uVar4;
  ulong uVar5;
  byte *pbVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  int iVar12;
  ulong len;
  ulong uVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  uchar local_a4;
  undefined1 local_a3;
  undefined1 local_a2;
  undefined1 local_a1;
  byte local_a0 [16];
  undefined8 auStack_90 [6];
  
  iVar2 = ossl_prov_is_running();
  if (iVar2 == 0) {
    return 0;
  }
  iVar2 = FUN_00b4706c(param_1,param_4);
  if (iVar2 == 0) {
    return 0;
  }
  if (*(long *)(param_1 + 8) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x9a,"kdf_pbkdf2_derive");
    uVar4 = 0x82;
  }
  else if (*(long *)(param_1 + 0x18) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x9f,"kdf_pbkdf2_derive");
    uVar4 = 0x83;
  }
  else {
    md = (EVP_MD *)ossl_prov_digest_md(param_1 + 0x30);
    key = *(void **)(param_1 + 8);
    uVar4 = *(undefined8 *)(param_1 + 0x10);
    data = *(uchar **)(param_1 + 0x18);
    uVar15 = *(undefined8 *)(param_1 + 0x20);
    uVar14 = *(ulong *)(param_1 + 0x28);
    iVar2 = *(int *)(param_1 + 0x48);
    uVar3 = EVP_MD_get_size();
    if ((int)uVar3 < 1) {
      return 0;
    }
    len = (ulong)(int)uVar3;
    uVar13 = 0;
    if (len != 0) {
      uVar13 = param_3 / len;
    }
    if (uVar13 < 0xffffffff) {
      iVar12 = (int)uVar15;
      if (iVar2 == 0) {
LAB_00b46e24:
        ctx = (HMAC_CTX *)HMAC_CTX_new();
        if (ctx == (HMAC_CTX *)0x0) {
          return 0;
        }
        iVar2 = HMAC_Init_ex(ctx,key,(int)uVar4,md,(ENGINE *)0x0);
        if (iVar2 == 0) {
          uVar4 = 0;
          dctx = (HMAC_CTX *)0x0;
        }
        else {
          dctx = (HMAC_CTX *)HMAC_CTX_new();
          if (dctx == (HMAC_CTX *)0x0) {
            uVar4 = 0;
          }
          else if ((int)param_3 == 0) {
            uVar4 = 1;
          }
          else {
            lVar9 = 1;
            do {
              uVar10 = (uint)param_3;
              uVar1 = uVar3;
              if ((int)uVar10 <= (int)uVar3) {
                uVar1 = uVar10;
              }
              local_a4 = (uchar)((ulong)lVar9 >> 0x18);
              local_a3 = (undefined1)((ulong)lVar9 >> 0x10);
              local_a2 = (undefined1)((ulong)lVar9 >> 8);
              local_a1 = (undefined1)lVar9;
              iVar2 = HMAC_CTX_copy(dctx,ctx);
              if ((((iVar2 == 0) || (iVar2 = HMAC_Update(dctx,data,(long)iVar12), iVar2 == 0)) ||
                  (iVar2 = HMAC_Update(dctx,&local_a4,4), iVar2 == 0)) ||
                 (iVar2 = HMAC_Final(dctx,local_a0,(uint *)0x0), iVar2 == 0)) {
LAB_00b4703c:
                uVar4 = 0;
                break;
              }
              uVar13 = (ulong)(int)uVar1;
              memcpy(param_2,local_a0,uVar13);
              if (1 < uVar14) {
                uVar7 = uVar13 & 0xffffffffffffffe0;
                uVar11 = 1;
                do {
                  iVar2 = HMAC_CTX_copy(dctx,ctx);
                  if (((iVar2 == 0) || (iVar2 = HMAC_Update(dctx,local_a0,len), iVar2 == 0)) ||
                     (iVar2 = HMAC_Final(dctx,local_a0,(uint *)0x0), iVar2 == 0)) goto LAB_00b4703c;
                  if (0 < (int)uVar1) {
                    uVar5 = 0;
                    if (0x1f < uVar1 &&
                        (local_a0 + uVar13 <= param_2 || param_2 + uVar13 <= local_a0)) {
                      uVar5 = uVar7;
                      pbVar6 = param_2 + 0x10;
                      puVar8 = auStack_90;
                      do {
                        uVar15 = puVar8[-1];
                        uVar4 = puVar8[-2];
                        uVar17 = puVar8[1];
                        uVar16 = *puVar8;
                        uVar19 = *(undefined8 *)(pbVar6 + -8);
                        uVar18 = *(undefined8 *)(pbVar6 + -0x10);
                        uVar21 = *(undefined8 *)(pbVar6 + 8);
                        uVar20 = *(undefined8 *)pbVar6;
                        puVar8 = puVar8 + 4;
                        uVar5 = uVar5 - 0x20;
                        *(ulong *)(pbVar6 + -8) =
                             CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                               (byte)((ulong)uVar15 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                        (byte)((ulong)uVar15 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                                 (byte)((ulong)uVar15 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar19 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar15 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar19 >> 0x10) ^ (byte)((ulong)uVar15 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar19 >> 8) ^
                                                           (byte)((ulong)uVar15 >> 8),
                                                           (byte)uVar19 ^ (byte)uVar15)))))));
                        *(ulong *)(pbVar6 + -0x10) =
                             CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                               (byte)((ulong)uVar4 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                        (byte)((ulong)uVar4 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                                 (byte)((ulong)uVar4 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar18 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar4 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar18 >> 0x10) ^ (byte)((ulong)uVar4 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar18 >> 8) ^
                                                           (byte)((ulong)uVar4 >> 8),
                                                           (byte)uVar18 ^ (byte)uVar4)))))));
                        *(ulong *)(pbVar6 + 8) =
                             CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                               (byte)((ulong)uVar17 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                        (byte)((ulong)uVar17 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                                 (byte)((ulong)uVar17 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar21 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar17 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar21 >> 0x10) ^ (byte)((ulong)uVar17 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar17 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar17)))))));
                        *(ulong *)pbVar6 =
                             CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                               (byte)((ulong)uVar16 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                        (byte)((ulong)uVar16 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                                 (byte)((ulong)uVar16 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar20 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar16 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar20 >> 0x10) ^ (byte)((ulong)uVar16 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar20 >> 8) ^
                                                           (byte)((ulong)uVar16 >> 8),
                                                           (byte)uVar20 ^ (byte)uVar16)))))));
                        pbVar6 = pbVar6 + 0x20;
                      } while (uVar5 != 0);
                      uVar5 = uVar7;
                      if (uVar7 == uVar13) goto LAB_00b46ff4;
                    }
                    do {
                      param_2[uVar5] = param_2[uVar5] ^ local_a0[uVar5];
                      uVar5 = uVar5 + 1;
                    } while ((long)uVar5 < (long)uVar13);
                  }
LAB_00b46ff4:
                  uVar11 = uVar11 + 1;
                } while (uVar11 < uVar14);
              }
              param_2 = param_2 + uVar13;
              uVar4 = 1;
              param_3 = (ulong)(uVar10 - uVar1);
              lVar9 = lVar9 + 1;
            } while (uVar10 - uVar1 != 0);
          }
        }
        HMAC_CTX_free(dctx);
        HMAC_CTX_free(ctx);
        return uVar4;
      }
      if (param_3 * 8 < 0x70) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x12d,"pbkdf2_derive");
        uVar4 = 0xab;
      }
      else if (iVar12 < 0x10) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x131,"pbkdf2_derive");
        uVar4 = 0x70;
      }
      else {
        if (999 < uVar14) goto LAB_00b46e24;
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x135,"pbkdf2_derive");
        uVar4 = 0x7b;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x127,"pbkdf2_derive");
      uVar4 = 0x69;
    }
  }
  ERR_set_error(0x39,uVar4,0);
  return 0;
}

