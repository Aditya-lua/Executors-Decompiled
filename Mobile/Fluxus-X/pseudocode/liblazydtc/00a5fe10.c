/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fe10
 */

/* WARNING: Removing unreachable block (ram,0x00a5ffac) */
/* WARNING: Removing unreachable block (ram,0x00a5ff68) */
/* WARNING: Heritage AFTER dead removal. Example location: s0xfffffffffffffef0 : 0x00a5ff74 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

undefined8
EVP_PKEY_Q_keygen(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  EVP_PKEY_CTX *ctx;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_68;
  
  memset(&local_c0,0,0x50);
  iVar1 = OPENSSL_strcasecmp(param_3,&DAT_002db996);
  if (iVar1 == 0) {
    local_68 = param_4;
    OSSL_PARAM_construct_size_t(&local_e8,&DAT_002adc98,&local_68);
  }
  else {
    iVar1 = OPENSSL_strcasecmp(param_3,&DAT_002cf33a);
    if (iVar1 != 0) {
      iVar1 = OPENSSL_strcasecmp(param_3,"ED25519");
      if ((((iVar1 != 0) && (iVar1 = OPENSSL_strcasecmp(param_3,"X25519"), iVar1 != 0)) &&
          (iVar1 = OPENSSL_strcasecmp(param_3,"ED448"), iVar1 != 0)) &&
         ((iVar1 = OPENSSL_strcasecmp(param_3,&DAT_0029fe3c), iVar1 != 0 &&
          (iVar1 = OPENSSL_strcasecmp(param_3,&DAT_002adb94), iVar1 != 0)))) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_lib.c",0x4b6,"EVP_PKEY_Q_keygen");
        ERR_set_error(6,0x80106,0);
        return 0;
      }
      goto LAB_00a5ffe0;
    }
    OSSL_PARAM_construct_utf8_string(&local_e8,"group",param_4,0);
  }
  local_a0 = local_c8;
  uStack_b8 = uStack_e0;
  local_c0 = local_e8;
  uStack_a8 = uStack_d0;
  uStack_b0 = uStack_d8;
LAB_00a5ffe0:
  local_e8 = 0;
  ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_name(param_1,param_3,param_2);
  if (((ctx != (EVP_PKEY_CTX *)0x0) && (iVar1 = EVP_PKEY_keygen_init(ctx), 0 < iVar1)) &&
     (iVar1 = EVP_PKEY_CTX_set_params(ctx,&local_c0), iVar1 != 0)) {
    EVP_PKEY_generate(ctx,&local_e8);
  }
  EVP_PKEY_CTX_free(ctx);
  return local_e8;
}

