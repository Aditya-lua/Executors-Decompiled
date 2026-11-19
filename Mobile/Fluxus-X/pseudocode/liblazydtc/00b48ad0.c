/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b48ad0
 */

undefined8 FUN_00b48ad0(long param_1,void *param_2,size_t param_3,undefined8 param_4)

{
  ulong uVar1;
  int iVar2;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  void *d;
  void *d_00;
  size_t cnt;
  size_t cnt_00;
  void *pvVar3;
  ulong __n;
  size_t cnt_01;
  undefined8 uVar4;
  uint local_a8;
  uchar auStack_a4 [64];
  char local_64 [4];
  
  iVar2 = ossl_prov_is_running();
  if ((iVar2 != 0) && (iVar2 = FUN_00b48dd0(param_1,param_4), iVar2 != 0)) {
    type = (EVP_MD *)ossl_prov_digest_md(param_1 + 8);
    if (type == (EVP_MD *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sshkdf.c",0x6e,"kdf_sshkdf_derive");
      uVar4 = 0x81;
    }
    else {
      d = *(void **)(param_1 + 0x20);
      if (d == (void *)0x0) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/sshkdf.c",0x72,"kdf_sshkdf_derive");
        uVar4 = 0x80;
      }
      else {
        d_00 = *(void **)(param_1 + 0x30);
        if (d_00 == (void *)0x0) {
          ERR_new();
          ERR_set_debug("providers/implementations/kdfs/sshkdf.c",0x76,"kdf_sshkdf_derive");
          uVar4 = 0x87;
        }
        else {
          pvVar3 = *(void **)(param_1 + 0x48);
          if (pvVar3 == (void *)0x0) {
            ERR_new();
            ERR_set_debug("providers/implementations/kdfs/sshkdf.c",0x7a,"kdf_sshkdf_derive");
            uVar4 = 0x85;
          }
          else {
            local_64[0] = *(char *)(param_1 + 0x40);
            if (local_64[0] != '\0') {
              cnt = *(size_t *)(param_1 + 0x28);
              cnt_00 = *(size_t *)(param_1 + 0x38);
              cnt_01 = *(size_t *)(param_1 + 0x50);
              local_a8 = 0;
              ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
              if (ctx == (EVP_MD_CTX *)0x0) {
                return 0;
              }
              iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
              if (((((iVar2 == 0) || (iVar2 = EVP_DigestUpdate(ctx,d,cnt), iVar2 == 0)) ||
                   (iVar2 = EVP_DigestUpdate(ctx,d_00,cnt_00), iVar2 == 0)) ||
                  ((iVar2 = EVP_DigestUpdate(ctx,local_64,1), iVar2 == 0 ||
                   (iVar2 = EVP_DigestUpdate(ctx,pvVar3,cnt_01), iVar2 == 0)))) ||
                 (iVar2 = EVP_DigestFinal_ex(ctx,auStack_a4,&local_a8), iVar2 == 0)) {
LAB_00b48d9c:
                uVar4 = 0;
              }
              else {
                __n = (ulong)local_a8;
                if (param_3 < __n) {
                  pvVar3 = param_2;
LAB_00b48bf4:
                  memcpy(pvVar3,auStack_a4,param_3);
                  uVar4 = 1;
                }
                else {
                  memcpy(param_2,auStack_a4,__n);
                  uVar4 = 1;
                  while (__n < param_3) {
                    iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
                    if (((iVar2 == 0) || (iVar2 = EVP_DigestUpdate(ctx,d,cnt), iVar2 == 0)) ||
                       ((iVar2 = EVP_DigestUpdate(ctx,d_00,cnt_00), iVar2 == 0 ||
                        ((iVar2 = EVP_DigestUpdate(ctx,param_2,__n), iVar2 == 0 ||
                         (iVar2 = EVP_DigestFinal_ex(ctx,auStack_a4,&local_a8), iVar2 == 0))))))
                    goto LAB_00b48d9c;
                    pvVar3 = (void *)((long)param_2 + __n);
                    uVar1 = __n + local_a8;
                    if (param_3 < uVar1) {
                      param_3 = param_3 - __n;
                      goto LAB_00b48bf4;
                    }
                    memcpy(pvVar3,auStack_a4,(ulong)local_a8);
                    __n = uVar1;
                  }
                }
              }
              EVP_MD_CTX_free(ctx);
              OPENSSL_cleanse(auStack_a4,0x40);
              return uVar4;
            }
            ERR_new();
            ERR_set_debug("providers/implementations/kdfs/sshkdf.c",0x7e,"kdf_sshkdf_derive");
            uVar4 = 0x86;
          }
        }
      }
    }
    ERR_set_error(0x39,uVar4,0);
  }
  return 0;
}

