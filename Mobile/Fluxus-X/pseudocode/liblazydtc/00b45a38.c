/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b45a38
 */

undefined8 FUN_00b45a38(long param_1,void *param_2,ulong param_3,undefined8 param_4)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  size_t sVar13;
  void *__dest;
  ulong uVar14;
  uint uVar15;
  ulong uVar16;
  uint local_6c;
  undefined1 local_68 [4];
  uint local_64;
  
  iVar4 = ossl_prov_is_running();
  if ((iVar4 == 0) || (iVar4 = FUN_00b45d74(param_1,param_4), iVar4 == 0)) {
    return 0;
  }
  if (*(long *)(param_1 + 0x10) == 0) {
    if ((*(long *)(param_1 + 0x20) == 0) || (*(long *)(param_1 + 0x18) == 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/kbkdf.c",0xe4,"kbkdf_derive");
      uVar12 = 0x72;
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/kbkdf.c",0xe9,"kbkdf_derive");
      uVar12 = 0x96;
    }
    ERR_set_error(0x39,uVar12,0);
    return 0;
  }
  if (param_3 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/kbkdf.c",0xef,"kbkdf_derive");
    ERR_set_error(0x39,0x69,0);
    return 0;
  }
  uVar6 = EVP_MAC_CTX_get_mac_size();
  if (uVar6 == 0) {
    __dest = (void *)0x0;
  }
  else if ((*(ulong *)(param_1 + 0x50) == 0) || (*(ulong *)(param_1 + 0x50) == uVar6)) {
    uVar2 = (int)param_3 << 3;
    uVar15 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
    uVar2 = 0;
    if (*(int *)(param_1 + 0x58) != 0) {
      uVar2 = uVar15 >> 0x10 | uVar15 << 0x10;
    }
    __dest = (void *)CRYPTO_zalloc(uVar6,"providers/implementations/kdfs/kbkdf.c",0xfe);
    if (__dest != (void *)0x0) {
      uVar12 = *(undefined8 *)(param_1 + 0x10);
      iVar4 = *(int *)(param_1 + 8);
      uVar8 = *(undefined8 *)(param_1 + 0x28);
      sVar13 = *(size_t *)(param_1 + 0x50);
      uVar9 = *(undefined8 *)(param_1 + 0x30);
      uVar10 = *(undefined8 *)(param_1 + 0x38);
      uVar11 = *(undefined8 *)(param_1 + 0x40);
      iVar1 = *(int *)(param_1 + 0x5c);
      local_68[0] = 0;
      local_64 = uVar2;
      if (sVar13 != 0) {
        memcpy(__dest,*(void **)(param_1 + 0x48),sVar13);
      }
      uVar16 = 0;
      uVar15 = 1;
      uVar14 = param_3;
      do {
        uVar3 = (uVar15 & 0xff00ff00) >> 8 | (uVar15 & 0xff00ff) << 8;
        local_6c = uVar3 >> 0x10 | uVar3 << 0x10;
        lVar7 = EVP_MAC_CTX_dup(uVar12);
        if ((((lVar7 == 0) ||
             ((((iVar4 == 1 && (iVar5 = EVP_MAC_update(lVar7,__dest,sVar13), iVar5 == 0)) ||
               (iVar5 = EVP_MAC_update(lVar7,&local_6c,4), iVar5 == 0)) ||
              (iVar5 = EVP_MAC_update(lVar7,uVar8,uVar9), iVar5 == 0)))) ||
            ((((iVar1 != 0 && (iVar5 = EVP_MAC_update(lVar7,local_68,1), iVar5 == 0)) ||
              (iVar5 = EVP_MAC_update(lVar7,uVar10,uVar11), iVar5 == 0)) ||
             ((uVar2 != 0 && (iVar5 = EVP_MAC_update(lVar7,&local_64,4), iVar5 == 0)))))) ||
           (iVar5 = EVP_MAC_final(lVar7,__dest,0,uVar6), iVar5 == 0)) {
          EVP_MAC_CTX_free(lVar7);
          goto LAB_00b45d1c;
        }
        sVar13 = uVar14;
        if (uVar6 <= uVar14) {
          sVar13 = uVar6;
        }
        memcpy((void *)((long)param_2 + uVar16),__dest,sVar13);
        uVar16 = uVar16 + uVar6;
        EVP_MAC_CTX_free(lVar7);
        uVar15 = uVar15 + 1;
        sVar13 = uVar6;
        uVar14 = uVar14 - uVar6;
      } while (uVar16 < param_3);
      EVP_MAC_CTX_free(0);
      uVar12 = 1;
      goto LAB_00b45d2c;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/kbkdf.c",0xf7,"kbkdf_derive");
    ERR_set_error(0x39,0x9a,0);
    __dest = (void *)0x0;
  }
LAB_00b45d1c:
  OPENSSL_cleanse(param_2,param_3);
  uVar12 = 0;
LAB_00b45d2c:
  CRYPTO_clear_free(__dest,uVar6,"providers/implementations/kdfs/kbkdf.c",0x108);
  return uVar12;
}

