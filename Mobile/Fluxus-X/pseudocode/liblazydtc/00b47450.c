/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b47450
 */

undefined8 FUN_00b47450(long param_1,void *param_2,ulong param_3,undefined8 param_4)

{
  ulong cnt;
  size_t sVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  bool bVar5;
  int iVar6;
  int num;
  int num_00;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  void *__s;
  uchar *md;
  void *ptr;
  void *d;
  ulong uVar7;
  void *pvVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 uVar15;
  ulong cnt_00;
  ulong cnt_01;
  
  iVar6 = ossl_prov_is_running();
  if ((iVar6 == 0) || (iVar6 = FUN_00b47930(param_1,param_4), iVar6 == 0)) {
    return 0;
  }
  if (*(long *)(param_1 + 0x20) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/pkcs12kdf.c",0xd2,"kdf_pkcs12_derive");
    uVar15 = 0x82;
LAB_00b475c8:
    ERR_set_error(0x39,uVar15,0);
    return 0;
  }
  if (*(long *)(param_1 + 0x30) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/pkcs12kdf.c",0xd7,"kdf_pkcs12_derive");
    uVar15 = 0x83;
    goto LAB_00b475c8;
  }
  type = (EVP_MD *)ossl_prov_digest_md(param_1 + 8);
  lVar2 = *(long *)(param_1 + 0x20);
  uVar13 = *(ulong *)(param_1 + 0x28);
  lVar3 = *(long *)(param_1 + 0x30);
  uVar9 = *(ulong *)(param_1 + 0x38);
  iVar6 = *(int *)(param_1 + 0x48);
  uVar11 = *(ulong *)(param_1 + 0x40);
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/pkcs12kdf.c",0x3e,"pkcs12kdf_derive");
    uVar15 = 0xc0100;
  }
  else {
    num = EVP_MD_get_block_size(type);
    num_00 = EVP_MD_get_size(type);
    if ((0 < num) && (0 < num_00)) {
      cnt_01 = (ulong)num;
      cnt_00 = (ulong)num_00;
      __s = CRYPTO_malloc(num,"providers/implementations/kdfs/pkcs12kdf.c",0x49);
      md = CRYPTO_malloc(num_00,"providers/implementations/kdfs/pkcs12kdf.c",0x4a);
      ptr = CRYPTO_malloc(num + 1,"providers/implementations/kdfs/pkcs12kdf.c",0x4b);
      uVar12 = 0;
      if (cnt_01 != 0) {
        uVar12 = ((cnt_01 - 1) + uVar9) / cnt_01;
      }
      uVar12 = uVar12 * cnt_01;
      if (uVar13 == 0) {
        uVar14 = 0;
      }
      else {
        uVar14 = 0;
        if (cnt_01 != 0) {
          uVar14 = ((cnt_01 - 1) + uVar13) / cnt_01;
        }
        uVar14 = uVar14 * cnt_01;
      }
      cnt = uVar14 + uVar12;
      d = CRYPTO_malloc((int)cnt,"providers/implementations/kdfs/pkcs12kdf.c",0x52);
      if ((((__s == (void *)0x0) || (md == (uchar *)0x0)) || (ptr == (void *)0x0)) ||
         (d == (void *)0x0)) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/pkcs12kdf.c",0x54,"pkcs12kdf_derive");
        ERR_set_error(0x39,0xc0100,0);
        uVar15 = 0;
      }
      else {
        sVar1 = cnt_01;
        if (cnt_01 < 2) {
          sVar1 = 1;
        }
        memset(__s,iVar6,sVar1);
        pvVar8 = d;
        if (uVar12 != 0) {
          uVar7 = 0;
          do {
            uVar4 = 0;
            if (uVar9 != 0) {
              uVar4 = uVar7 / uVar9;
            }
            *(undefined1 *)((long)d + uVar7) = *(undefined1 *)(lVar3 + (uVar7 - uVar4 * uVar9));
            uVar7 = uVar7 + 1;
          } while (uVar7 < uVar12);
          pvVar8 = (void *)((long)d + uVar7);
        }
        if (uVar14 != 0) {
          uVar9 = 0;
          do {
            uVar12 = 0;
            if (uVar13 != 0) {
              uVar12 = uVar9 / uVar13;
            }
            *(undefined1 *)((long)pvVar8 + uVar9) =
                 *(undefined1 *)(lVar2 + (uVar9 - uVar12 * uVar13));
            uVar9 = uVar9 + 1;
          } while (uVar14 != uVar9);
        }
        iVar6 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
        while (((iVar6 != 0 && (iVar6 = EVP_DigestUpdate(ctx,__s,cnt_01), iVar6 != 0)) &&
               ((iVar6 = EVP_DigestUpdate(ctx,d,cnt), iVar6 != 0 &&
                (iVar6 = EVP_DigestFinal_ex(ctx,md,(uint *)0x0), iVar6 != 0))))) {
          if (1 < uVar11) {
            uVar13 = 1;
            do {
              iVar6 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
              if (((iVar6 == 0) || (iVar6 = EVP_DigestUpdate(ctx,md,cnt_00), iVar6 == 0)) ||
                 (iVar6 = EVP_DigestFinal_ex(ctx,md,(uint *)0x0), iVar6 == 0)) goto LAB_00b4790c;
              uVar13 = uVar13 + 1;
            } while (uVar13 < uVar11);
          }
          sVar1 = param_3;
          if (cnt_00 <= param_3) {
            sVar1 = cnt_00;
          }
          memcpy(param_2,md,sVar1);
          bVar5 = param_3 < cnt_00;
          param_3 = param_3 - cnt_00;
          if (bVar5 || param_3 == 0) {
            uVar15 = 1;
            goto LAB_00b47648;
          }
          uVar13 = 0;
          do {
            uVar9 = 0;
            if (cnt_00 != 0) {
              uVar9 = uVar13 / cnt_00;
            }
            *(uchar *)((long)ptr + uVar13) = md[uVar13 - uVar9 * cnt_00];
            uVar13 = uVar13 + 1;
          } while (uVar13 < cnt_01);
          param_2 = (void *)((long)param_2 + cnt_00);
          if (cnt != 0) {
            uVar13 = 0;
            pvVar8 = d;
            do {
              uVar10 = 1;
              uVar9 = cnt_01;
              do {
                uVar12 = uVar9 - 1;
                uVar10 = uVar10 + *(byte *)((long)pvVar8 + (uVar9 - 1)) +
                         (uint)*(byte *)((long)ptr + (uVar9 - 1));
                *(char *)((long)pvVar8 + (uVar9 - 1)) = (char)uVar10;
                uVar10 = uVar10 >> 8;
                uVar9 = uVar12;
              } while (uVar12 != 0);
              uVar13 = uVar13 + cnt_01;
              pvVar8 = (void *)((long)pvVar8 + cnt_01);
            } while (uVar13 < cnt);
          }
          iVar6 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
        }
LAB_00b4790c:
        uVar15 = 0;
      }
      goto LAB_00b47648;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/pkcs12kdf.c",0x44,"pkcs12kdf_derive");
    uVar15 = 0xda;
  }
  ERR_set_error(0x39,uVar15,0);
  md = (uchar *)0x0;
  d = (void *)0x0;
  __s = (void *)0x0;
  uVar15 = 0;
  ptr = (void *)0x0;
LAB_00b47648:
  CRYPTO_free(md);
  CRYPTO_free(ptr);
  CRYPTO_free(__s);
  CRYPTO_free(d);
  EVP_MD_CTX_free(ctx);
  return uVar15;
}

