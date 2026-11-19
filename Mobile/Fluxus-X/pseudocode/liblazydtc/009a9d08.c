/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9d08
 */

undefined8 ssl_generate_master_secret(long param_1,void *param_2,size_t param_3,int param_4)

{
  long lVar1;
  undefined1 *puVar2;
  size_t __n;
  uint uVar3;
  undefined8 uVar4;
  int iVar5;
  undefined1 *puVar6;
  size_t __n_00;
  
  uVar3 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
  if ((uVar3 & 0x1c8) == 0) {
    iVar5 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x18))
                      (param_1,*(long *)(param_1 + 0x918) + 0x50,param_2,param_3,
                       *(long *)(param_1 + 0x918) + 8);
    if (iVar5 != 0) {
joined_r0x009a9dd0:
      uVar4 = 1;
      goto joined_r0x009a9dd0;
    }
  }
  else {
    __n_00 = *(size_t *)(param_1 + 0x378);
    __n = __n_00;
    if ((uVar3 & 8) == 0) {
      __n = param_3;
    }
    lVar1 = __n_00 + __n + 4;
    puVar6 = CRYPTO_malloc((int)lVar1,"ssl/s3_lib.c",0x120b);
    param_3 = __n;
    if (puVar6 != (undefined1 *)0x0) {
      puVar2 = puVar6 + 2;
      puVar6[1] = (char)__n;
      *puVar6 = (char)(__n >> 8);
      if ((uVar3 >> 3 & 1) == 0) {
        memcpy(puVar2,param_2,__n);
      }
      else {
        memset(puVar2,0,__n);
      }
      puVar2 = puVar2 + __n;
      *puVar2 = (char)(__n_00 >> 8);
      puVar2[1] = (char)__n_00;
      memcpy(puVar2 + 2,*(void **)(param_1 + 0x370),__n_00);
      CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x370),__n_00,"ssl/s3_lib.c",0x1218);
      *(undefined8 *)(param_1 + 0x378) = 0;
      *(undefined8 *)(param_1 + 0x370) = 0;
      iVar5 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x18))
                        (param_1,*(long *)(param_1 + 0x918) + 0x50,puVar6,lVar1,
                         *(long *)(param_1 + 0x918) + 8);
      if (iVar5 != 0) {
        CRYPTO_clear_free(puVar6,lVar1,"ssl/s3_lib.c",0x1222);
        goto joined_r0x009a9dd0;
      }
      CRYPTO_clear_free(puVar6,lVar1,"ssl/s3_lib.c",0x121e);
    }
  }
  uVar4 = 0;
joined_r0x009a9dd0:
  if (param_2 == (void *)0x0) {
    iVar5 = *(int *)(param_1 + 0x38);
  }
  else if (param_4 == 0) {
    OPENSSL_cleanse(param_2,param_3);
    iVar5 = *(int *)(param_1 + 0x38);
  }
  else {
    CRYPTO_clear_free(param_2,param_3,"ssl/s3_lib.c",0x1234);
    iVar5 = *(int *)(param_1 + 0x38);
  }
  if (iVar5 == 0) {
    *(undefined8 *)(param_1 + 0x368) = 0;
    *(undefined8 *)(param_1 + 0x360) = 0;
  }
  return uVar4;
}

