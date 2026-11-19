/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8d90
 */

undefined8 ssl_cache_cipherlist(long param_1,long *param_2,int param_3)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  bool bVar4;
  undefined2 *puVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined2 *puVar10;
  long lVar11;
  
  uVar9 = param_2[1];
  if (uVar9 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x15ec,"ssl_cache_cipherlist");
    uVar7 = 0x2f;
    uVar8 = 0xb7;
  }
  else {
    uVar2 = 2;
    if (param_3 != 0) {
      uVar2 = 3;
    }
    uVar3 = 0;
    if (uVar2 != 0) {
      uVar3 = uVar9 / uVar2;
    }
    if (uVar9 == uVar3 * uVar2) {
      plVar1 = (long *)(param_1 + 0x350);
      CRYPTO_free(*(void **)(param_1 + 0x350));
      *(undefined8 *)(param_1 + 0x358) = 0;
      *(undefined8 *)(param_1 + 0x350) = 0;
      if (param_3 == 0) {
        CRYPTO_free((void *)0x0);
        *plVar1 = 0;
        *(undefined8 *)(param_1 + 0x358) = 0;
        lVar11 = param_2[1];
        if (lVar11 == 0) {
          return 1;
        }
        lVar6 = CRYPTO_memdup(*param_2,lVar11,"include/internal/packet.h",0x1cf);
        *plVar1 = lVar6;
        if (lVar6 != 0) {
          *(long *)(param_1 + 0x358) = lVar11;
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x1620,"ssl_cache_cipherlist");
        uVar8 = 0xc0103;
        uVar7 = 0x50;
      }
      else {
        lVar11 = *param_2;
        uVar9 = param_2[1];
        uVar3 = 0;
        if (uVar2 != 0) {
          uVar3 = uVar9 / uVar2;
        }
        puVar5 = CRYPTO_malloc((int)(uVar3 << 1),"ssl/ssl_lib.c",0x1606);
        *plVar1 = (long)puVar5;
        if (puVar5 != (undefined2 *)0x0) {
          *(undefined8 *)(param_1 + 0x358) = 0;
          if (uVar9 == 0) {
            return 1;
          }
          puVar10 = (undefined2 *)(lVar11 + 1);
          uVar9 = uVar9 - 1;
          do {
            if (*(char *)((long)puVar10 + -1) == '\0') {
              if (uVar9 < 2) goto LAB_009b8f68;
              *puVar5 = *puVar10;
              *(long *)(param_1 + 0x358) = *(long *)(param_1 + 0x358) + 2;
            }
            else if (uVar9 < 2) {
LAB_009b8f68:
              ERR_new();
              ERR_set_debug("ssl/ssl_lib.c",0x1615,"ssl_cache_cipherlist");
              ossl_statem_fatal(param_1,0x32,0xf0,0);
              CRYPTO_free(*(void **)(param_1 + 0x350));
              *plVar1 = 0;
              *(undefined8 *)(param_1 + 0x358) = 0;
              return 0;
            }
            puVar5 = puVar5 + 1;
            puVar10 = (undefined2 *)((long)puVar10 + 3);
            bVar4 = uVar9 == 2;
            uVar9 = uVar9 - 3;
            if (bVar4) {
              return 1;
            }
          } while( true );
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x1609,"ssl_cache_cipherlist");
        uVar7 = 0x50;
        uVar8 = 0xc0100;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x15f1,"ssl_cache_cipherlist");
      uVar7 = 0x32;
      uVar8 = 0x97;
    }
  }
  ossl_statem_fatal(param_1,uVar7,uVar8,0);
  return 0;
}

