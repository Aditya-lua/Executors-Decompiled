/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e9b0
 */

int EVP_CIPHER_set_asn1_iv(EVP_CIPHER_CTX *c,ASN1_TYPE *type)

{
  uchar *data;
  uchar *puVar1;
  int iVar2;
  uint len;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  uchar *local_38;
  
  if (type == (ASN1_TYPE *)0x0) {
    iVar2 = 0;
  }
  else {
    local_38 = c->oiv;
    memset(&local_90,0,0x50);
    OSSL_PARAM_construct_octet_ptr(&local_b8,&DAT_002bdad8,&local_38,0x10);
    local_70 = local_98;
    uStack_88 = uStack_b0;
    local_90 = local_b8;
    uStack_78 = uStack_a0;
    uStack_80 = local_a8;
    iVar2 = evp_do_ciph_ctx_getparams(c->cipher,c[1].cipher,&local_90);
    puVar1 = local_38;
    len = EVP_CIPHER_CTX_get_iv_length(c);
    if (0x10 < len) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: j <= sizeof(c->iv)","crypto/evp/evp_lib.c",0x4a);
    }
    data = (uchar *)0x0;
    if (iVar2 != 0) {
      data = puVar1;
    }
    iVar2 = ASN1_TYPE_set_octetstring(type,data,len);
  }
  return iVar2;
}

