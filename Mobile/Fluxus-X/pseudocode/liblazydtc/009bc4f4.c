/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bc4f4
 */

/* WARNING: Type propagation algorithm not settling */

uint SSL_CTX_use_serverinfo_ex(long param_1,int param_2,byte *param_3,ulong param_4)

{
  ulong uVar1;
  bool bVar2;
  uint uVar3;
  int iVar4;
  undefined4 *ptr;
  void *pvVar5;
  undefined8 uVar6;
  ulong uVar7;
  byte *pbVar8;
  ulong uVar9;
  
  if (((param_1 == 0) || (param_3 == (byte *)0x0)) || (param_4 == 0)) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x2e5,"SSL_CTX_use_serverinfo_ex");
    uVar6 = 0xc0102;
    goto LAB_009bc7b8;
  }
  if (param_2 == 1) {
    ptr = CRYPTO_malloc((int)(param_4 + 4),"ssl/ssl_rsa.c",0x2f2);
    if (ptr != (undefined4 *)0x0) {
      *ptr = 0xd0010000;
      memcpy(ptr + 1,param_3,param_4);
      uVar3 = SSL_CTX_use_serverinfo_ex(param_1,2,ptr,param_4 + 4);
      CRYPTO_free(ptr);
      return uVar3;
    }
    ERR_new();
    uVar6 = 0x2f4;
LAB_009bc7a8:
    ERR_set_debug("ssl/ssl_rsa.c",uVar6,"SSL_CTX_use_serverinfo_ex");
    uVar6 = 0xc0100;
  }
  else {
    if (((long)param_4 < 0) || (1 < param_2 - 1U)) {
LAB_009bc768:
      ERR_new();
      uVar6 = 0x302;
    }
    else {
      pbVar8 = param_3;
      uVar7 = param_4;
      do {
        if (((uVar7 < 4) || (uVar7 - 4 < 2)) || ((uVar7 - 4 & 0xfffffffffffffffe) == 2))
        goto LAB_009bc768;
        uVar1 = (ulong)CONCAT11(pbVar8[6],pbVar8[7]);
        if (uVar7 - 8 < uVar1) goto LAB_009bc768;
        uVar7 = (uVar7 - 8) - uVar1;
        pbVar8 = pbVar8 + uVar1 + 8;
      } while (uVar7 != 0);
      if (**(long **)(param_1 + 0x158) == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x306,"SSL_CTX_use_serverinfo_ex");
        uVar6 = 0xc0103;
        goto LAB_009bc7b8;
      }
      pvVar5 = CRYPTO_realloc(*(void **)(**(long **)(param_1 + 0x158) + 0x18),(int)param_4,
                              "ssl/ssl_rsa.c",0x30a);
      if (pvVar5 == (void *)0x0) {
        ERR_new();
        uVar6 = 0x30c;
        goto LAB_009bc7a8;
      }
      *(void **)(**(long **)(param_1 + 0x158) + 0x18) = pvVar5;
      pvVar5 = memcpy(pvVar5,param_3,param_4);
      *(ulong *)(**(long **)(param_1 + 0x158) + 0x20) = param_4;
      while (param_2 != 2) {
        uVar7 = 0;
        if (param_4 < 2) goto LAB_009bc810;
LAB_009bc6dc:
        if ((param_4 & 0xfffffffffffffffe) == 2) goto LAB_009bc810;
        uVar1 = (ulong)CONCAT11(param_3[2],param_3[3]);
        uVar9 = param_4 - 4;
        param_4 = uVar9 - uVar1;
        if (uVar9 < uVar1) goto LAB_009bc810;
        if (uVar7 == 0x1d0) {
          pvVar5 = (void *)SSL_CTX_add_server_custom_ext
                                     (param_1,CONCAT11(*param_3,param_3[1]),&LAB_009bd06c,0,0,
                                      &LAB_009bd144,0);
          iVar4 = (int)pvVar5;
        }
        else {
          pvVar5 = (void *)SSL_CTX_add_custom_ext
                                     (param_1,CONCAT11(*param_3,param_3[1]),uVar7,FUN_009bd160,0,0,
                                      &LAB_009bd248,0);
          iVar4 = (int)pvVar5;
        }
        if (iVar4 == 0) goto LAB_009bc810;
        param_3 = param_3 + uVar1 + 4;
        pvVar5 = (void *)0x1;
        if (param_4 == 0) {
          return 1;
        }
      }
      bVar2 = 3 < param_4;
      param_4 = param_4 - 4;
      if (bVar2) {
        uVar7 = (ulong)*param_3 << 0x18 | (ulong)param_3[1] << 0x10 | (ulong)param_3[2] << 8 |
                (ulong)param_3[3];
        param_3 = param_3 + 4;
        if (1 < param_4) goto LAB_009bc6dc;
      }
LAB_009bc810:
      ERR_new(pvVar5);
      uVar6 = 0x319;
    }
    ERR_set_debug("ssl/ssl_rsa.c",uVar6,"SSL_CTX_use_serverinfo_ex");
    uVar6 = 0x184;
  }
LAB_009bc7b8:
  ERR_set_error(0x14,uVar6,0);
  return 0;
}

