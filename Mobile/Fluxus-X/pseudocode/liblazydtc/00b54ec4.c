/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54ec4
 */

bool FUN_00b54ec4(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  bool bVar2;
  int iVar3;
  uint uVar4;
  EVP_MD *type;
  undefined1 *d;
  undefined8 uVar5;
  int iVar6;
  long lVar7;
  EVP_MD_CTX *ctx;
  EVP_MD_CTX *ctx_00;
  undefined1 *__dest;
  size_t __n;
  ulong uVar8;
  char *local_a0;
  undefined4 local_98;
  undefined1 *local_90;
  undefined8 local_80;
  
  ctx = *(EVP_MD_CTX **)(param_1 + 8);
  iVar3 = ossl_prov_is_running();
  if ((iVar3 != 0) && (iVar3 = FUN_00b5532c(param_1,param_4), iVar3 != 0)) {
    if (param_2 == 0) {
      if (*(long *)(param_1 + 0x30) == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x11c,"kmac_init");
        uVar5 = 0x72;
        goto LAB_00b55138;
      }
    }
    else {
      iVar3 = FUN_00b555e8(param_1,param_2,param_3);
      if (iVar3 == 0) {
        return false;
      }
    }
    ctx_00 = *(EVP_MD_CTX **)(param_1 + 8);
    type = (EVP_MD *)ossl_prov_digest_md(param_1 + 0x10);
    iVar3 = EVP_DigestInit_ex(ctx_00,type,(ENGINE *)0x0);
    if (iVar3 != 0) {
      ossl_prov_digest_md(param_1 + 0x10);
      uVar4 = EVP_MD_get_block_size();
      if ((int)uVar4 < 1) {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x125,"kmac_init");
        uVar5 = 0xa6;
      }
      else {
        lVar7 = *(long *)(param_1 + 0x38);
        uVar8 = (ulong)(int)uVar4;
        if (lVar7 == 0) {
          memset(&local_a0,0,0x50);
          local_a0 = "custom";
          local_98 = 5;
          local_90 = &DAT_002ab32c;
          local_80 = 0xffffffffffffffff;
          FUN_00b5532c(param_1,&local_a0);
          lVar7 = *(long *)(param_1 + 0x38);
        }
        uVar1 = 0;
        if (uVar8 != 0) {
          uVar1 = ((uVar8 - 1) + ((lVar7 << 0x20) + 0x800000000 >> 0x20)) / uVar8;
        }
        d = CRYPTO_malloc((int)(uVar1 * uVar8),"providers/implementations/macs/kmac_prov.c",0x138);
        if (d != (undefined1 *)0x0) {
          bVar2 = false;
          if (uVar4 < 0x100) {
            __n = *(size_t *)(param_1 + 0x38);
            *d = 1;
            d[1] = (char)uVar4;
            __dest = d + 8;
            *(undefined2 *)(d + 6) = 0x4341;
            *(undefined4 *)(d + 2) = 0x4d4b2001;
            if (__n != 0) {
              memcpy(__dest,(void *)(param_1 + 0x2e4),__n);
              __dest = __dest + __n;
            }
            iVar6 = (int)__dest - (int)d;
            iVar3 = 0;
            if (uVar8 != 0) {
              iVar3 = (int)(((uVar8 - 1) + (long)iVar6) / uVar8);
            }
            if (iVar3 * uVar4 != iVar6) {
              memset(__dest,0,(long)(int)(iVar3 * uVar4 - iVar6));
            }
            iVar3 = EVP_DigestUpdate(ctx,d,uVar1 * uVar8);
            if (iVar3 == 0) {
              bVar2 = false;
            }
            else {
              iVar3 = EVP_DigestUpdate(ctx,(void *)(param_1 + 0x44),*(size_t *)(param_1 + 0x30));
              bVar2 = iVar3 != 0;
            }
          }
          CRYPTO_free(d);
          return bVar2;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x13a,"kmac_init");
        uVar5 = 0xc0100;
      }
LAB_00b55138:
      ERR_set_error(0x39,uVar5,0);
      return false;
    }
  }
  return false;
}

