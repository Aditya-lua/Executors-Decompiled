/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aef3d0
 */

void ERR_add_error_txt(char *param_1,char *param_2)

{
  char *__s;
  char cVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  uint uVar5;
  bool bVar6;
  ulong uVar7;
  size_t sVar8;
  size_t sVar9;
  char *pcVar10;
  void *pvVar11;
  char *pcVar12;
  char *__haystack;
  ulong uVar13;
  byte local_84 [4];
  char *local_80;
  undefined8 local_78;
  undefined4 local_6c;
  undefined8 local_68;
  
  local_68 = 0;
  local_80 = (char *)0x0;
  local_78 = 0;
  uVar7 = ERR_peek_last_error();
  __s = "";
  if (param_1 != (char *)0x0) {
    __s = param_1;
  }
  if (uVar7 == 0) {
    ERR_new();
    ERR_set_debug(&DAT_002ab32c,0,0);
    ERR_set_error(1,0,0);
  }
  uVar5 = 2;
  if (-1 < (int)(uint)uVar7) {
    uVar5 = (uint)uVar7 >> 0x17 & 0xff;
  }
  do {
    ERR_peek_last_error_all(&local_68,&local_6c,&local_78,&local_80,local_84);
    if ((local_84[0] >> 1 & 1) == 0) {
      local_80 = "";
      pcVar12 = "";
    }
    else {
      pcVar12 = __s;
    }
    sVar8 = strlen(local_80);
    uVar13 = 0;
    if (sVar8 < 0xf9c) {
      sVar9 = strlen(__s);
      uVar13 = 0;
      if (sVar9 < -sVar8 + 0xf9c) {
        uVar13 = (-sVar8 + 0xf9b) - sVar9;
      }
    }
    if (*__s == '\0') {
      sVar8 = strlen(param_2);
      if (sVar8 <= uVar13) {
        pcVar10 = param_2 + sVar8;
        goto LAB_00aef634;
      }
      __haystack = param_2 + uVar13;
      bVar6 = false;
      pcVar10 = __haystack;
      if (__haystack == (char *)0x0) goto LAB_00aef5e0;
LAB_00aef54c:
      if ((long)__haystack - (long)param_2 != 0) {
        pvVar11 = (void *)CRYPTO_strndup(param_2,(long)__haystack - (long)param_2,
                                         "crypto/err/err_prn.c",0x7b);
        if (pvVar11 == (void *)0x0) {
          return;
        }
        ERR_add_error_data(2,__s,pvVar11);
        CRYPTO_free(pvVar11);
      }
      uVar4 = local_68;
      uVar3 = local_6c;
      uVar2 = local_78;
      ERR_new();
      ERR_set_debug(uVar4,uVar3,uVar2);
      ERR_set_error(uVar5,uVar7 & 0xffffffff,0);
      param_2 = __haystack;
    }
    else {
      pcVar10 = param_2;
      if (*param_2 != '\0') {
        bVar6 = false;
        do {
          __haystack = pcVar10;
          pcVar10 = strstr(__haystack,__s);
          if (pcVar10 == (char *)0x0) {
            sVar8 = strlen(__haystack);
            pcVar10 = __haystack + sVar8;
            cVar1 = *pcVar10;
          }
          else {
            sVar8 = strlen(__s);
            pcVar10 = pcVar10 + sVar8;
            cVar1 = *pcVar10;
            bVar6 = cVar1 == '\0';
          }
        } while (((ulong)((long)pcVar10 - (long)param_2) <= uVar13) && (cVar1 != '\0'));
        if ((uVar13 < (ulong)((long)pcVar10 - (long)param_2)) && (__haystack != (char *)0x0))
        goto LAB_00aef54c;
LAB_00aef5e0:
        if (bVar6) {
          sVar8 = strlen(__s);
          pvVar11 = (void *)CRYPTO_strndup(param_2,pcVar10 + (-(long)param_2 - sVar8),
                                           "crypto/err/err_prn.c",0x85);
          if (pvVar11 == (void *)0x0) {
            return;
          }
          ERR_add_error_data(2,pcVar12,pvVar11);
          CRYPTO_free(pvVar11);
          param_2 = pcVar10;
          goto LAB_00aef648;
        }
      }
LAB_00aef634:
      ERR_add_error_data(2,pcVar12,param_2);
      param_2 = pcVar10;
    }
LAB_00aef648:
    if (*param_2 == '\0') {
      return;
    }
  } while( true );
}

