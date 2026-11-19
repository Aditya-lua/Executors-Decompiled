/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a901c
 */

undefined * ssl3_get_cipher_by_std_name(char *param_1)

{
  int iVar1;
  undefined *puVar2;
  ulong uVar3;
  
  puVar2 = &DAT_00cc4e30;
  if ((PTR_s_TLS_AES_128_GCM_SHA256_00cc4e40 != (undefined *)0x0) &&
     (iVar1 = strcmp(param_1,PTR_s_TLS_AES_128_GCM_SHA256_00cc4e40), iVar1 == 0)) {
    return &DAT_00cc4e30;
  }
  if ((PTR_s_TLS_AES_256_GCM_SHA384_00cc4e90 == (undefined *)0x0) ||
     (iVar1 = strcmp(param_1,PTR_s_TLS_AES_256_GCM_SHA384_00cc4e90), iVar1 != 0)) {
    if ((PTR_s_TLS_CHACHA20_POLY1305_SHA256_00cc4ee0 != (undefined *)0x0) &&
       (iVar1 = strcmp(param_1,PTR_s_TLS_CHACHA20_POLY1305_SHA256_00cc4ee0), iVar1 == 0)) {
      return &DAT_00cc4ed0;
    }
    if ((PTR_s_TLS_AES_128_CCM_SHA256_00cc4f30 != (undefined *)0x0) &&
       (iVar1 = strcmp(param_1,PTR_s_TLS_AES_128_CCM_SHA256_00cc4f30), iVar1 == 0)) {
      return &DAT_00cc4f20;
    }
    if ((PTR_s_TLS_AES_128_CCM_8_SHA256_00cc4f80 != (undefined *)0x0) &&
       (iVar1 = strcmp(param_1,PTR_s_TLS_AES_128_CCM_8_SHA256_00cc4f80), iVar1 == 0)) {
      return &DAT_00cc4f70;
    }
    uVar3 = 0;
    puVar2 = &DAT_00cc4fc0;
    do {
      if ((*(char **)(puVar2 + 0x10) != (char *)0x0) &&
         (iVar1 = strcmp(param_1,*(char **)(puVar2 + 0x10)), iVar1 == 0)) {
        return puVar2;
      }
      uVar3 = uVar3 + 1;
      puVar2 = puVar2 + 0x50;
    } while (uVar3 < 0xa7);
    puVar2 = &DAT_00cc83f0;
    if ((PTR_s_TLS_EMPTY_RENEGOTIATION_INFO_SCS_00cc8400 != (undefined *)0x0) &&
       (iVar1 = strcmp(param_1,PTR_s_TLS_EMPTY_RENEGOTIATION_INFO_SCS_00cc8400), iVar1 == 0)) {
      return &DAT_00cc83f0;
    }
    if ((PTR_s_TLS_FALLBACK_SCSV_00cc8450 == (undefined *)0x0) ||
       (iVar1 = strcmp(param_1,PTR_s_TLS_FALLBACK_SCSV_00cc8450), iVar1 != 0)) {
      return (undefined *)0x0;
    }
  }
  return puVar2 + 0x50;
}

