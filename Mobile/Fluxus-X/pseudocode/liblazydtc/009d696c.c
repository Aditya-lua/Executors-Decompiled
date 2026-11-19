/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d696c
 */

undefined8 tls_parse_ctos_server_name(long param_1,long *param_2)

{
  ulong uVar1;
  ulong len;
  int iVar2;
  size_t sVar3;
  void *pvVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  uint uVar8;
  undefined1 *puVar9;
  char *__s;
  
  if ((ulong)param_2[1] < 2) {
LAB_009d6a34:
    ERR_new();
    uVar6 = 0x67;
LAB_009d6a4c:
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar6,"tls_parse_ctos_server_name");
    uVar6 = 0x32;
  }
  else {
    puVar9 = (undefined1 *)*param_2;
    uVar1 = (ulong)CONCAT11(*puVar9,puVar9[1]);
    if (param_2[1] - 2U != uVar1) goto LAB_009d6a34;
    *param_2 = (long)(puVar9 + 2 + uVar1);
    param_2[1] = 0;
    if (uVar1 == 0) goto LAB_009d6a34;
    if (((uVar1 - 1 < 2) || (puVar9[2] != '\0')) ||
       (len = (ulong)CONCAT11(puVar9[3],puVar9[4]), uVar1 - 3 != len)) {
      ERR_new();
      uVar6 = 0x79;
      goto LAB_009d6a4c;
    }
    puVar9 = puVar9 + 5;
    if ((*(int *)(param_1 + 0x4d0) != 0) &&
       ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0 ||
         (iVar2 = **(int **)(param_1 + 8), iVar2 < 0x304)) || (iVar2 == 0x10000)))) {
      __s = *(char **)(*(long *)(param_1 + 0x918) + 0x330);
      if (__s == (char *)0x0) {
        uVar8 = 0;
      }
      else {
        sVar3 = strlen(__s);
        uVar8 = 0;
        if (len == sVar3) {
          iVar2 = CRYPTO_memcmp(puVar9,__s,len);
          uVar8 = (uint)(iVar2 == 0);
        }
      }
      *(uint *)(param_1 + 0xb60) = uVar8;
      return 1;
    }
    if (len < 0x100) {
      pvVar4 = memchr(puVar9,0,len);
      if (pvVar4 == (void *)0x0) {
        CRYPTO_free(*(void **)(param_1 + 0xa58));
        *(undefined8 *)(param_1 + 0xa58) = 0;
        CRYPTO_free((void *)0x0);
        lVar5 = CRYPTO_strndup(puVar9,len,"include/internal/packet.h",0x1e6);
        *(long *)(param_1 + 0xa58) = lVar5;
        if (lVar5 != 0) {
          *(undefined4 *)(param_1 + 0xb60) = 1;
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x93,"tls_parse_ctos_server_name");
        uVar6 = 0x50;
        uVar7 = 0xc0103;
        goto LAB_009d6a58;
      }
      ERR_new();
      uVar6 = 0x88;
    }
    else {
      ERR_new();
      uVar6 = 0x83;
    }
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar6,"tls_parse_ctos_server_name");
    uVar6 = 0x70;
  }
  uVar7 = 0x6e;
LAB_009d6a58:
  ossl_statem_fatal(param_1,uVar6,uVar7,0);
  return 0;
}

