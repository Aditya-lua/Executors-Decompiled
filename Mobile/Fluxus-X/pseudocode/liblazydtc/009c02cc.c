/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c02cc
 */

undefined8 tls1_setup_key_block(long param_1)

{
  int iVar1;
  int iVar2;
  void *pvVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long local_50;
  undefined4 local_44;
  undefined1 auStack_40 [8];
  undefined8 local_38;
  undefined8 local_28;
  
  local_44 = 0;
  local_50 = 0;
  if (*(long *)(param_1 + 0x310) == 0) {
    iVar1 = ssl_cipher_get_evp(*(undefined8 *)(param_1 + 0x9a8),*(undefined8 *)(param_1 + 0x918),
                               &local_28,&local_38,&local_44,&local_50,auStack_40,
                               *(undefined4 *)(param_1 + 0xb2c));
    if (iVar1 == 0) {
      ossl_statem_send_fatal(param_1,0x50);
      return 0;
    }
    ssl_evp_cipher_free(*(undefined8 *)(param_1 + 800));
    *(undefined8 *)(param_1 + 800) = local_28;
    ssl_evp_md_free(*(undefined8 *)(param_1 + 0x328));
    lVar6 = local_50;
    *(undefined8 *)(param_1 + 0x328) = local_38;
    *(undefined4 *)(param_1 + 0x330) = local_44;
    *(long *)(param_1 + 0x338) = local_50;
    iVar1 = EVP_CIPHER_get_key_length(local_28);
    iVar2 = EVP_CIPHER_get_mode(local_28);
    if ((iVar2 == 6) || (iVar2 = EVP_CIPHER_get_mode(local_28), iVar2 == 7)) {
      lVar5 = 4;
    }
    else {
      iVar2 = EVP_CIPHER_get_iv_length(local_28);
      lVar5 = (long)iVar2;
    }
    lVar6 = (lVar6 + iVar1 + lVar5) * 2;
    ssl3_cleanup_key_block(param_1);
    pvVar3 = CRYPTO_malloc((int)lVar6,"ssl/t1_enc.c",0x230);
    if (pvVar3 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/t1_enc.c",0x231,"tls1_setup_key_block");
      ossl_statem_fatal(param_1,0x50,0xc0100,0);
      return 0;
    }
    *(long *)(param_1 + 0x310) = lVar6;
    *(void **)(param_1 + 0x318) = pvVar3;
    uVar4 = FUN_009c0598(param_1,"key expansion",0xd,param_1 + 0x140,0x20,param_1 + 0x160,0x20,0,0,
                         *(long *)(param_1 + 0x918) + 0x50,
                         *(undefined8 *)(*(long *)(param_1 + 0x918) + 8),pvVar3,lVar6,1);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if ((*(byte *)(param_1 + 0x9e9) >> 3 & 1) == 0) {
      if (0x301 < **(int **)(param_1 + 8)) {
        return 1;
      }
      *(undefined4 *)(param_1 + 0x180) = 1;
      lVar6 = *(long *)(*(long *)(param_1 + 0x918) + 0x2f8);
      if (lVar6 == 0) {
        return 1;
      }
      iVar1 = *(int *)(lVar6 + 0x24);
      if ((iVar1 == 4) || (iVar1 == 0x20)) {
        *(undefined4 *)(param_1 + 0x180) = 0;
      }
    }
  }
  return 1;
}

