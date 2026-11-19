/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c94c
 */

undefined8 ossl_tdes_get_ctx_params(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  DES_cblock *key;
  
  uVar2 = ossl_cipher_generic_get_ctx_params();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  lVar3 = OSSL_PARAM_locate(param_2,"randkey");
  if (lVar3 == 0) {
LAB_00b2c9d0:
    uVar2 = 1;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 0x48);
    if (uVar4 != 0) {
      key = *(DES_cblock **)(lVar3 + 0x10);
      iVar1 = RAND_priv_bytes_ex(*(undefined8 *)(param_1 + 0xb8),key,uVar4,0);
      if (0 < iVar1) {
        DES_set_odd_parity(key);
        if ((0xf < uVar4) && (DES_set_odd_parity(key + 1), 0x17 < uVar4)) {
          DES_set_odd_parity(key + 2);
        }
        goto LAB_00b2c9d0;
      }
    }
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_tdes_common.c",0x91,
                  "ossl_tdes_get_ctx_params");
    ERR_set_error(0x39,0x79,0);
    uVar2 = 0;
  }
  return uVar2;
}

