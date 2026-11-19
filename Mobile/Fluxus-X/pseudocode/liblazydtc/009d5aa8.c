/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5aa8
 */

undefined8 FUN_009d5aa8(char *param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  size_t sVar4;
  undefined8 uVar5;
  size_t __n;
  undefined **ppuVar6;
  char *__s;
  
  lVar2 = OPENSSL_sk_new_null();
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/d1_srtp.c",0x47,"ssl_ctx_make_profiles");
    ERR_set_error(0x14,0x16a,0);
LAB_009d5bf0:
    uVar5 = 1;
  }
  else {
    do {
      pcVar3 = strchr(param_1,0x3a);
      if (pcVar3 == (char *)0x0) {
        __n = strlen(param_1);
        if (PTR_s_SRTP_AES128_CM_SHA1_80_00cc8518 != (undefined *)0x0) goto LAB_009d5b1c;
LAB_009d5b8c:
        ERR_new();
        ERR_set_debug("ssl/d1_srtp.c",0x5a,"ssl_ctx_make_profiles");
        uVar5 = 0x16c;
LAB_009d5bb0:
        ERR_set_error(0x14,uVar5,0);
        OPENSSL_sk_free(lVar2);
        goto LAB_009d5bf0;
      }
      __n = (long)pcVar3 - (long)param_1;
      if (PTR_s_SRTP_AES128_CM_SHA1_80_00cc8518 == (undefined *)0x0) goto LAB_009d5b8c;
LAB_009d5b1c:
      ppuVar6 = &PTR_s_SRTP_AES128_CM_SHA1_80_00cc8518;
      __s = PTR_s_SRTP_AES128_CM_SHA1_80_00cc8518;
      while ((sVar4 = strlen(__s), sVar4 != __n || (iVar1 = strncmp(__s,param_1,__n), iVar1 != 0)))
      {
        ppuVar6 = ppuVar6 + 2;
        __s = *ppuVar6;
        if (__s == (char *)0x0) goto LAB_009d5b8c;
      }
      iVar1 = OPENSSL_sk_find(lVar2,ppuVar6);
      if (-1 < iVar1) {
        ERR_new();
        ERR_set_debug("ssl/d1_srtp.c",0x51,"ssl_ctx_make_profiles");
        uVar5 = 0x161;
        goto LAB_009d5bb0;
      }
      iVar1 = OPENSSL_sk_push(lVar2,ppuVar6);
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/d1_srtp.c",0x56,"ssl_ctx_make_profiles");
        uVar5 = 0x16a;
        goto LAB_009d5bb0;
      }
      param_1 = pcVar3 + 1;
    } while (pcVar3 != (char *)0x0);
    OPENSSL_sk_free(*param_2);
    uVar5 = 0;
    *param_2 = lVar2;
  }
  return uVar5;
}

