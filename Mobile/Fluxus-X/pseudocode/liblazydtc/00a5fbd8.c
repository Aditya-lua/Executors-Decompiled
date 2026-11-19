/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fbd8
 */

void EVP_CIPHER_CTX_clear_flags(EVP_CIPHER_CTX *ctx,int flags)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined4 local_14;
  
  uVar1 = ctx->flags;
  uVar2 = uVar1 & (long)~flags;
  ctx->flags = uVar2;
  if ((((uint)uVar2 ^ (uint)uVar1) >> 0xd & 1) != 0) {
    local_14 = 0;
    memset(&local_70,0,0x50);
    OSSL_PARAM_construct_uint(&local_98,"use-bits",&local_14);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    EVP_CIPHER_CTX_set_params(ctx,&local_70);
  }
  return;
}

