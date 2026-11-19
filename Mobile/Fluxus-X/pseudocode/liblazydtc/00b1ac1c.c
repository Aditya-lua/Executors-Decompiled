/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ac1c
 */

undefined8
OSSL_HTTP_parse_url(undefined8 param_1,undefined4 *param_2,undefined8 *param_3,undefined8 *param_4,
                   undefined8 *param_5,undefined4 *param_6,undefined8 *param_7,undefined8 *param_8,
                   undefined8 *param_9)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  undefined4 local_74;
  char *local_70;
  char *local_68;
  
  if (param_5 != (undefined8 *)0x0) {
    *param_5 = 0;
  }
  if (param_2 != (undefined4 *)0x0) {
    *param_2 = 0;
  }
  uVar3 = OSSL_parse_url(param_1,&local_68,param_3,param_4,&local_70,param_6,param_7,param_8,param_9
                        );
  pcVar4 = local_68;
  if ((int)uVar3 == 0) {
    return uVar3;
  }
  iVar2 = strcmp(local_68,"https");
  if (iVar2 == 0) {
    bVar1 = true;
    if (param_2 != (undefined4 *)0x0) {
      *param_2 = 1;
    }
LAB_00b1ad34:
    CRYPTO_free(pcVar4);
    iVar2 = strcmp(local_70,"0");
    if (iVar2 == 0) {
      CRYPTO_free(local_70);
      local_70 = "80";
      if (bVar1) {
        local_70 = "443";
      }
      iVar2 = sscanf(local_70,"%d",&local_74);
      if (iVar2 != 1) goto joined_r0x00b1ade0;
      if (param_6 != (undefined4 *)0x0) {
        *param_6 = local_74;
      }
      if (param_5 != (undefined8 *)0x0) {
        pcVar4 = CRYPTO_strdup(local_70,"crypto/http/http_lib.c",0xe4);
        *param_5 = pcVar4;
        if (pcVar4 == (char *)0x0) goto joined_r0x00b1ade0;
      }
    }
    else if (param_5 == (undefined8 *)0x0) {
      CRYPTO_free(local_70);
    }
    else {
      *param_5 = local_70;
    }
    uVar3 = 1;
  }
  else {
    if ((*pcVar4 == '\0') || (iVar2 = strcmp(pcVar4,"http"), iVar2 == 0)) {
      bVar1 = false;
      goto LAB_00b1ad34;
    }
    ERR_new();
    ERR_set_debug("crypto/http/http_lib.c",0xd4,"OSSL_HTTP_parse_url");
    ERR_set_error(0x3d,0x7c,0);
    CRYPTO_free(local_68);
    CRYPTO_free(local_70);
joined_r0x00b1ade0:
    if (param_3 != (undefined8 *)0x0) {
      CRYPTO_free((void *)*param_3);
      *param_3 = 0;
    }
    if (param_4 != (undefined8 *)0x0) {
      CRYPTO_free((void *)*param_4);
      *param_4 = 0;
    }
    if (param_7 != (undefined8 *)0x0) {
      CRYPTO_free((void *)*param_7);
      *param_7 = 0;
    }
    if (param_8 != (undefined8 *)0x0) {
      CRYPTO_free((void *)*param_8);
      *param_8 = 0;
    }
    if (param_9 == (undefined8 *)0x0) {
      uVar3 = 0;
    }
    else {
      CRYPTO_free((void *)*param_9);
      uVar3 = 0;
      *param_9 = 0;
    }
  }
  return uVar3;
}

