/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4a638
 */

undefined8 FUN_00b4a638(long param_1,uchar *param_2,ulong param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  bool bVar7;
  int iVar8;
  int iVar9;
  EVP_MD *type;
  void *pvVar10;
  EVP_MD_CTX *out;
  EVP_MD_CTX *ctx;
  undefined8 uVar11;
  ulong uVar12;
  void *pvVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  undefined8 uVar18;
  ulong cnt;
  char *pcVar19;
  ulong local_b8;
  char *local_b0;
  uchar auStack_a8 [72];
  
  iVar8 = ossl_prov_is_running();
  if (iVar8 == 0) {
    return 0;
  }
  iVar8 = FUN_00b4ab88(param_1,param_4);
  if (iVar8 == 0) {
    return 0;
  }
  if ((*(int *)(param_1 + 0x98) != 0) && (*(long *)(param_1 + 0x50) != 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x19f,"x942kdf_derive");
    uVar11 = 0xc6;
    goto LAB_00b4a704;
  }
  if ((*(long *)(param_1 + 0x30) != 0) &&
     ((((*(long *)(param_1 + 0x40) != 0 || (*(long *)(param_1 + 0x48) != 0)) ||
       (*(long *)(param_1 + 0x50) != 0)) || (*(long *)(param_1 + 0x58) != 0)))) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x1ab,"x942kdf_derive");
    uVar11 = 0x73;
    goto LAB_00b4a704;
  }
  if (*(long *)(param_1 + 0x20) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x1af,"x942kdf_derive");
    uVar11 = 0x84;
    goto LAB_00b4a704;
  }
  type = (EVP_MD *)ossl_prov_digest_md(param_1 + 8);
  if (type == (EVP_MD *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x1b4,"x942kdf_derive");
    uVar11 = 0x81;
    goto LAB_00b4a704;
  }
  lVar14 = *(long *)(param_1 + 0x88);
  if ((lVar14 == 0) || (lVar16 = *(long *)(param_1 + 0x90), lVar16 == 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x1b8,"x942kdf_derive");
    uVar11 = 0x90;
    goto LAB_00b4a704;
  }
  lVar17 = *(long *)(param_1 + 0x40);
  if ((lVar17 != 0) && (*(ulong *)(param_1 + 0x60) >> 0x1e != 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x1c0,"x942kdf_derive");
    uVar11 = 200;
    goto LAB_00b4a704;
  }
  if (*(int *)(param_1 + 0x98) == 0) {
    uVar12 = 0;
  }
  else {
    uVar12 = *(ulong *)(param_1 + 0x80);
  }
  uVar11 = *(undefined8 *)(param_1 + 0x30);
  uVar3 = *(undefined8 *)(param_1 + 0x38);
  uVar1 = *(undefined8 *)(param_1 + 0x58);
  uVar4 = *(undefined8 *)(param_1 + 0x60);
  uVar2 = *(undefined8 *)(param_1 + 0x48);
  uVar5 = *(undefined8 *)(param_1 + 0x50);
  pcVar19 = *(char **)(param_1 + 0x68);
  uVar6 = *(undefined8 *)(param_1 + 0x70);
  uVar18 = *(undefined8 *)(param_1 + 0x78);
  local_b8 = 0;
  local_b0 = (char *)0x0;
  if (uVar12 >> 0x18 == 0) {
    iVar8 = (int)uVar12 << 3;
    iVar9 = FUN_00b4b034(auStack_a8,0,0,lVar14,lVar16,uVar11,uVar3,lVar17,uVar4,uVar2,pcVar19,uVar5,
                         uVar6,uVar1,uVar18,iVar8,0);
    if ((iVar9 == 0) || (iVar9 = WPACKET_get_total_written(auStack_a8,&local_b8), iVar9 == 0)) {
LAB_00b4a9a4:
      pvVar10 = (void *)0x0;
      uVar12 = 0;
      bVar7 = false;
    }
    else {
      WPACKET_cleanup(auStack_a8);
      pvVar13 = (void *)CRYPTO_zalloc(local_b8,"providers/implementations/kdfs/x942kdf.c",0xe4);
      if ((pvVar13 == (void *)0x0) ||
         ((iVar8 = FUN_00b4b034(auStack_a8,pvVar13,local_b8,lVar14,lVar16,uVar11,uVar3,lVar17,uVar4,
                                uVar2,pcVar19,uVar5,uVar6,uVar1,uVar18,iVar8,&local_b0), iVar8 == 0
          || (pvVar10 = (void *)WPACKET_get_curr(auStack_a8), pvVar10 != pvVar13))))
      goto LAB_00b4a9a4;
      bVar7 = false;
      pvVar10 = (void *)0x0;
      uVar12 = 0;
      if (local_b0 != (char *)0x0) {
        if ((*local_b0 != '\x04') || (local_b0[1] != '\x04')) goto LAB_00b4a9a4;
        pcVar19 = local_b0 + 2;
        bVar7 = true;
        pvVar10 = pvVar13;
        uVar12 = local_b8;
      }
    }
    WPACKET_cleanup(auStack_a8);
    if (bVar7) {
      if (((param_3 - 1 >> 0x1e == 0) && (uVar12 < 0x40000001)) &&
         (cnt = *(ulong *)(param_1 + 0x28), cnt < 0x40000001)) {
        pvVar13 = *(void **)(param_1 + 0x20);
        iVar8 = EVP_MD_get_size(type);
        if (0 < iVar8) {
          out = (EVP_MD_CTX *)EVP_MD_CTX_new();
          ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
          if (out == (EVP_MD_CTX *)0x0) {
LAB_00b4ab44:
            uVar11 = 0;
          }
          else {
            uVar11 = 0;
            if (ctx != (EVP_MD_CTX *)0x0) {
              iVar9 = EVP_DigestInit(ctx,type);
              if (iVar9 != 0) {
                pcVar19[0] = '\0';
                pcVar19[1] = '\0';
                pcVar19[2] = '\0';
                pcVar19[3] = '\x01';
                iVar9 = EVP_MD_CTX_copy_ex(out,ctx);
                if (iVar9 != 0) {
                  uVar15 = (ulong)iVar8;
                  lVar14 = 2;
                  do {
                    iVar8 = EVP_DigestUpdate(out,pvVar13,cnt);
                    if ((iVar8 == 0) || (iVar8 = EVP_DigestUpdate(out,pvVar10,uVar12), iVar8 == 0))
                    break;
                    if (param_3 < uVar15) {
                      iVar8 = EVP_DigestFinal_ex(out,auStack_a8,(uint *)0x0);
                      if (iVar8 != 0) {
                        memcpy(param_2,auStack_a8,param_3);
LAB_00b4ab3c:
                        uVar11 = 1;
                        goto LAB_00b4ab48;
                      }
                      break;
                    }
                    iVar8 = EVP_DigestFinal_ex(out,param_2,(uint *)0x0);
                    if (iVar8 == 0) break;
                    if (uVar15 == param_3) goto LAB_00b4ab3c;
                    param_2 = param_2 + uVar15;
                    *pcVar19 = (char)((ulong)lVar14 >> 0x18);
                    pcVar19[1] = (char)((ulong)lVar14 >> 0x10);
                    pcVar19[2] = (char)((ulong)lVar14 >> 8);
                    pcVar19[3] = (char)lVar14;
                    iVar8 = EVP_MD_CTX_copy_ex(out,ctx);
                    lVar14 = lVar14 + 1;
                    param_3 = param_3 - uVar15;
                  } while (iVar8 != 0);
                }
              }
              goto LAB_00b4ab44;
            }
          }
LAB_00b4ab48:
          EVP_MD_CTX_free(out);
          EVP_MD_CTX_free(ctx);
          OPENSSL_cleanse(auStack_a8,0x40);
          goto LAB_00b4ab64;
        }
      }
      else {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x118,"x942kdf_hash_kdm");
        ERR_set_error(0x39,0x8e,0);
      }
      uVar11 = 0;
LAB_00b4ab64:
      CRYPTO_free(pvVar10);
      return uVar11;
    }
  }
  ERR_new();
  ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x1cc,"x942kdf_derive");
  uVar11 = 0x8d;
LAB_00b4a704:
  ERR_set_error(0x39,uVar11,0);
  return 0;
}

