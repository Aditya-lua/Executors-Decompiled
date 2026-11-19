/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b49190
 */

undefined8 FUN_00b49190(long param_1,void *param_2,ulong param_3,undefined8 param_4)

{
  undefined1 *__src;
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined *puVar8;
  undefined1 *puVar9;
  ulong uVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 uVar13;
  long lVar14;
  undefined1 local_e8;
  undefined1 uStack_e7;
  undefined1 uStack_e6;
  undefined1 uStack_e5;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined1 local_c0 [8];
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  ulong local_70 [2];
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return 0;
  }
  iVar1 = FUN_00b496d8(param_1,param_4);
  if (iVar1 == 0) {
    return 0;
  }
  if (*(long *)(param_1 + 0x28) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x167,"sskdf_derive");
    uVar4 = 0x84;
    goto LAB_00b4947c;
  }
  lVar3 = ossl_prov_digest_md(param_1 + 0x10);
  if (*(long *)(param_1 + 8) == 0) {
    if (lVar3 != 0) {
      uVar4 = FUN_00b49ab4(lVar3,*(undefined8 *)(param_1 + 0x28),*(undefined8 *)(param_1 + 0x30),
                           *(undefined8 *)(param_1 + 0x38),*(undefined8 *)(param_1 + 0x40),0,param_2
                           ,param_3);
      return uVar4;
    }
    ERR_new();
    uVar4 = 0x19b;
LAB_00b4941c:
    ERR_set_debug("providers/implementations/kdfs/sskdf.c",uVar4,"sskdf_derive");
    uVar4 = 0x81;
LAB_00b4947c:
    ERR_set_error(0x39,uVar4,0);
    return 0;
  }
  uVar4 = EVP_MAC_CTX_get0_mac(*(long *)(param_1 + 8));
  iVar1 = EVP_MAC_is_a(uVar4,&DAT_002c35d3);
  if (iVar1 == 0) {
    if (*(int *)(param_1 + 0x60) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x186,"sskdf_derive");
      uVar4 = 0x89;
      goto LAB_00b4947c;
    }
    iVar2 = EVP_MAC_is_a(uVar4,"KMAC128");
    puVar8 = &UNK_0077c194;
    iVar1 = 0x84;
    if (iVar2 != 0) {
      iVar1 = 0xa4;
    }
    uVar4 = 3;
    lVar3 = *(long *)(param_1 + 0x48);
  }
  else {
    if (lVar3 == 0) {
      ERR_new();
      uVar4 = 0x177;
      goto LAB_00b4941c;
    }
    iVar1 = EVP_MD_get_size(lVar3);
    if (iVar1 < 1) {
      return 0;
    }
    puVar8 = (undefined *)0x0;
    uVar4 = 0;
    lVar3 = *(long *)(param_1 + 0x48);
  }
  if ((lVar3 == 0) || (lVar14 = *(long *)(param_1 + 0x50), lVar14 == 0)) {
    lVar14 = (long)iVar1;
    lVar3 = CRYPTO_zalloc(lVar14,"providers/implementations/kdfs/sskdf.c",0x18b);
    *(long *)(param_1 + 0x48) = lVar3;
    if (lVar3 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x18d,"sskdf_derive");
      uVar4 = 0xc0100;
      goto LAB_00b4947c;
    }
    *(long *)(param_1 + 0x50) = lVar14;
  }
  if (param_3 - 1 >> 0x1e != 0) {
    return 0;
  }
  uVar10 = *(ulong *)(param_1 + 0x30);
  if (0x40000000 < uVar10) {
    return 0;
  }
  uVar7 = *(ulong *)(param_1 + 0x40);
  if (0x40000000 < uVar7) {
    return 0;
  }
  uVar11 = *(undefined8 *)(param_1 + 8);
  uVar12 = *(ulong *)(param_1 + 0x58);
  uVar6 = *(undefined8 *)(param_1 + 0x28);
  uVar13 = *(undefined8 *)(param_1 + 0x38);
  puVar9 = (undefined1 *)0x0;
  local_70[0] = uVar12;
  if (puVar8 == (undefined *)0x0) {
LAB_00b49514:
    __src = local_c0;
    if (puVar9 != (undefined1 *)0x0) {
      __src = puVar9;
    }
    iVar1 = EVP_MAC_init(uVar11,lVar3,lVar14,0);
    if (((iVar1 != 0) && (uVar5 = EVP_MAC_CTX_get_mac_size(uVar11), uVar5 != 0)) &&
       ((__src != local_c0 || (uVar5 < 0x41)))) {
      local_e8 = 0;
      uStack_e7 = 0;
      uStack_e6 = 0;
      uStack_e5 = 1;
      lVar3 = EVP_MAC_CTX_dup(uVar11);
      if (lVar3 != 0) {
        lVar14 = 2;
        do {
          iVar1 = EVP_MAC_update(lVar3,&local_e8,4);
          if (((iVar1 == 0) || (iVar1 = EVP_MAC_update(lVar3,uVar6,uVar10), iVar1 == 0)) ||
             (iVar1 = EVP_MAC_update(lVar3,uVar13,uVar7), iVar1 == 0)) {
LAB_00b496b8:
            uVar4 = 0;
            goto joined_r0x00b496c4;
          }
          if (param_3 < uVar5) {
            iVar1 = EVP_MAC_final(lVar3,__src,0,uVar5);
            if (iVar1 == 0) goto LAB_00b496b8;
            memcpy(param_2,__src,param_3);
LAB_00b496b0:
            uVar4 = 1;
            goto joined_r0x00b496c4;
          }
          iVar1 = EVP_MAC_final(lVar3,param_2,0,param_3);
          if (iVar1 == 0) goto LAB_00b496b8;
          if (uVar5 == param_3) goto LAB_00b496b0;
          param_2 = (void *)((long)param_2 + uVar5);
          EVP_MAC_CTX_free(lVar3);
          local_e8 = (undefined1)((ulong)lVar14 >> 0x18);
          uStack_e7 = (undefined1)((ulong)lVar14 >> 0x10);
          uStack_e6 = (undefined1)((ulong)lVar14 >> 8);
          uStack_e5 = (undefined1)lVar14;
          lVar3 = EVP_MAC_CTX_dup(uVar11);
          lVar14 = lVar14 + 1;
          param_3 = param_3 - uVar5;
        } while (lVar3 != 0);
      }
    }
    uVar4 = 0;
    lVar3 = 0;
joined_r0x00b496c4:
    if (puVar9 != (undefined1 *)0x0) {
      CRYPTO_clear_free(puVar9,uVar12,"providers/implementations/kdfs/sskdf.c",0x116);
      goto LAB_00b4967c;
    }
  }
  else {
    OSSL_PARAM_construct_octet_string(&local_e8,"custom",puVar8,uVar4);
    local_a0 = local_c8;
    uStack_b8 = uStack_e0;
    uStack_a8 = uStack_d0;
    uStack_b0 = local_d8;
    OSSL_PARAM_construct_end(&local_e8);
    local_78 = local_c8;
    uStack_80 = uStack_d0;
    local_88 = local_d8;
    uStack_90 = uStack_e0;
    iVar1 = EVP_MAC_CTX_set_params(uVar11,local_c0);
    if (iVar1 != 0) {
      if (uVar12 == 0) {
        local_70[0] = param_3;
      }
      else if ((uVar12 != param_3) &&
              ((uVar5 = uVar12 - 0x14 >> 2, 0xb < (uVar5 | uVar12 << 0x3e) ||
               ((1L << (uVar5 & 0x3f) & 0x88dU) == 0)))) goto LAB_00b49668;
      OSSL_PARAM_construct_size_t(&local_e8,&DAT_002d7e7d,local_70);
      local_a0 = local_c8;
      uStack_b8 = uStack_e0;
      uStack_a8 = uStack_d0;
      uStack_b0 = local_d8;
      iVar1 = EVP_MAC_CTX_set_params(uVar11,local_c0);
      if ((0 < iVar1) &&
         ((puVar9 = (undefined1 *)0x0, local_70[0] < 0x41 ||
          (puVar9 = (undefined1 *)
                    CRYPTO_zalloc(local_70[0],"providers/implementations/kdfs/sskdf.c",199),
          puVar9 != (undefined1 *)0x0)))) goto LAB_00b49514;
    }
LAB_00b49668:
    lVar3 = 0;
    uVar4 = 0;
  }
  OPENSSL_cleanse(local_c0,0x40);
LAB_00b4967c:
  EVP_MAC_CTX_free(lVar3);
  return uVar4;
}

