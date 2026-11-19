/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f43c
 */

int HMAC_Init_ex(HMAC_CTX *ctx,void *key,int len,EVP_MD *md,ENGINE *impl)

{
  uint uVar1;
  int iVar2;
  EVP_MD *type;
  bool bVar3;
  EVP_MD_CTX *pEVar4;
  ulong local_170;
  ulong uStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong local_150;
  ulong uStack_148;
  ulong uStack_140;
  ulong uStack_138;
  ulong local_130;
  ulong uStack_128;
  ulong uStack_120;
  ulong uStack_118;
  ulong local_110;
  ulong uStack_108;
  ulong uStack_100;
  ulong uStack_f8;
  byte local_f0;
  byte local_ef;
  byte local_ee;
  byte local_ed;
  byte local_ec;
  byte local_eb;
  byte local_ea;
  byte local_e9;
  byte local_e8;
  byte local_e7;
  byte local_e6;
  byte local_e5;
  byte local_e4;
  byte local_e3;
  byte local_e2;
  byte local_e1;
  ulong local_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  ulong local_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  ulong uStack_a8;
  ulong local_a0;
  ulong uStack_98;
  ulong local_90;
  ulong uStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong local_70;
  ulong uStack_68;
  byte local_60;
  byte local_5f;
  byte local_5e;
  byte local_5d;
  byte local_5c;
  byte local_5b;
  byte local_5a;
  byte local_59;
  byte local_58;
  byte local_57;
  byte local_56;
  byte local_55;
  byte local_54;
  byte local_53;
  byte local_52;
  byte local_51;
  uint local_44;
  
  type = ctx->md;
  if (md == (EVP_MD *)0x0) {
    if (type == (EVP_MD *)0x0) {
      return 0;
    }
  }
  else {
    if (type != md) {
      if (key == (void *)0x0) {
        return 0;
      }
      if (len < 0) {
        return 0;
      }
    }
    ctx->md = md;
    type = md;
  }
  uVar1 = EVP_MD_get_flags(type);
  if ((uVar1 >> 1 & 1) != 0) {
    return 0;
  }
  if (key == (void *)0x0) {
    bVar3 = true;
LAB_00a7f520:
    iVar2 = EVP_MD_CTX_copy_ex((EVP_MD_CTX *)(ctx->md_ctx).digest,(EVP_MD_CTX *)(ctx->md_ctx).engine
                              );
    uVar1 = (uint)(iVar2 != 0);
    if (bVar3) {
      return uVar1;
    }
  }
  else {
    uVar1 = EVP_MD_get_block_size(type);
    if (0x90 < uVar1) {
      return 0;
    }
    if ((int)uVar1 < len) {
      iVar2 = EVP_DigestInit_ex((EVP_MD_CTX *)(ctx->md_ctx).digest,type,impl);
      if (((iVar2 == 0) ||
          (iVar2 = EVP_DigestUpdate((EVP_MD_CTX *)(ctx->md_ctx).digest,key,(long)len), iVar2 == 0))
         || (iVar2 = EVP_DigestFinal_ex((EVP_MD_CTX *)(ctx->md_ctx).digest,(uchar *)&local_170,
                                        &local_44), iVar2 == 0)) {
        return 0;
      }
    }
    else {
      if (0x90 < (uint)len) {
        return 0;
      }
      memcpy(&local_170,key,(long)len);
      local_44 = len;
    }
    if (local_44 != 0x90) {
      memset((void *)((long)&local_170 + (ulong)local_44),0,(ulong)(0x90 - local_44));
    }
    local_e0 = local_170 ^ 0x3636363636363636;
    uStack_d8 = uStack_168 ^ 0x3636363636363636;
    uStack_d0 = uStack_160 ^ 0x3636363636363636;
    uStack_c8 = uStack_158 ^ 0x3636363636363636;
    local_c0 = local_150 ^ 0x3636363636363636;
    uStack_b8 = uStack_148 ^ 0x3636363636363636;
    uStack_b0 = uStack_140 ^ 0x3636363636363636;
    uStack_a8 = uStack_138 ^ 0x3636363636363636;
    local_a0 = local_130 ^ 0x3636363636363636;
    uStack_98 = uStack_128 ^ 0x3636363636363636;
    local_90 = uStack_120 ^ 0x3636363636363636;
    uStack_88 = uStack_118 ^ 0x3636363636363636;
    uStack_80 = local_110 ^ 0x3636363636363636;
    uStack_78 = uStack_108 ^ 0x3636363636363636;
    local_60 = local_f0 ^ 0x36;
    local_5f = local_ef ^ 0x36;
    local_5e = local_ee ^ 0x36;
    local_5d = local_ed ^ 0x36;
    local_5c = local_ec ^ 0x36;
    local_5b = local_eb ^ 0x36;
    local_5a = local_ea ^ 0x36;
    local_59 = local_e9 ^ 0x36;
    local_58 = local_e8 ^ 0x36;
    local_57 = local_e7 ^ 0x36;
    local_56 = local_e6 ^ 0x36;
    local_55 = local_e5 ^ 0x36;
    local_54 = local_e4 ^ 0x36;
    local_53 = local_e3 ^ 0x36;
    local_52 = local_e2 ^ 0x36;
    local_51 = local_e1 ^ 0x36;
    uStack_68 = uStack_f8 ^ 0x3636363636363636;
    local_70 = uStack_100 ^ 0x3636363636363636;
    iVar2 = EVP_DigestInit_ex((EVP_MD_CTX *)(ctx->md_ctx).engine,type,impl);
    if (iVar2 != 0) {
      pEVar4 = (EVP_MD_CTX *)(ctx->md_ctx).engine;
      iVar2 = EVP_MD_get_block_size(type);
      iVar2 = EVP_DigestUpdate(pEVar4,&local_e0,(long)iVar2);
      if (iVar2 != 0) {
        local_e0 = local_170 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_d8 = uStack_168 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_d0 = uStack_160 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_c8 = uStack_158 ^ 0x5c5c5c5c5c5c5c5c;
        local_c0 = local_150 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_b8 = uStack_148 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_b0 = uStack_140 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_a8 = uStack_138 ^ 0x5c5c5c5c5c5c5c5c;
        local_a0 = local_130 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_98 = uStack_128 ^ 0x5c5c5c5c5c5c5c5c;
        local_90 = uStack_120 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_88 = uStack_118 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_80 = local_110 ^ 0x5c5c5c5c5c5c5c5c;
        uStack_78 = uStack_108 ^ 0x5c5c5c5c5c5c5c5c;
        local_60 = local_f0 ^ 0x5c;
        local_5f = local_ef ^ 0x5c;
        local_5e = local_ee ^ 0x5c;
        local_5d = local_ed ^ 0x5c;
        local_5c = local_ec ^ 0x5c;
        local_5b = local_eb ^ 0x5c;
        local_5a = local_ea ^ 0x5c;
        local_59 = local_e9 ^ 0x5c;
        local_58 = local_e8 ^ 0x5c;
        local_57 = local_e7 ^ 0x5c;
        local_56 = local_e6 ^ 0x5c;
        local_55 = local_e5 ^ 0x5c;
        local_54 = local_e4 ^ 0x5c;
        local_53 = local_e3 ^ 0x5c;
        local_52 = local_e2 ^ 0x5c;
        local_51 = local_e1 ^ 0x5c;
        uStack_68 = uStack_f8 ^ 0x5c5c5c5c5c5c5c5c;
        local_70 = uStack_100 ^ 0x5c5c5c5c5c5c5c5c;
        iVar2 = EVP_DigestInit_ex((EVP_MD_CTX *)(ctx->md_ctx).flags,type,impl);
        if (iVar2 != 0) {
          pEVar4 = (EVP_MD_CTX *)(ctx->md_ctx).flags;
          iVar2 = EVP_MD_get_block_size(type);
          iVar2 = EVP_DigestUpdate(pEVar4,&local_e0,(long)iVar2);
          bVar3 = false;
          if (iVar2 != 0) goto LAB_00a7f520;
        }
      }
    }
    uVar1 = 0;
  }
  OPENSSL_cleanse(&local_170,0x90);
  OPENSSL_cleanse(&local_e0,0x90);
  return uVar1;
}

