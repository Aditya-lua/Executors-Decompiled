/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5c744
 */

int EVP_CIPHER_CTX_set_padding(EVP_CIPHER_CTX *c,int pad)

{
  ulong uVar1;
  int iVar2;
  uint uVar3;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  int local_74;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  
  memset(&local_70,0,0x50);
  uVar1 = c->flags | 0x100;
  if (pad != 0) {
    uVar1 = c->flags & 0xfffffffffffffeff;
  }
  c->flags = uVar1;
  if ((c->cipher == (EVP_CIPHER *)0x0) || (c->cipher[1].do_cipher != (_func_1090 *)0x0)) {
    local_74 = pad;
    OSSL_PARAM_construct_uint(&local_a0,"padding",&local_74);
    local_50 = local_80;
    uStack_68 = uStack_98;
    local_70 = local_a0;
    uStack_58 = uStack_88;
    uStack_60 = uStack_90;
    iVar2 = evp_do_ciph_ctx_setparams(c->cipher,c[1].cipher,&local_70);
    uVar3 = (uint)(iVar2 != 0);
  }
  else {
    uVar3 = 1;
  }
  return uVar3;
}

