/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3520
 */

undefined8 SSL_CTX_dane_mtype_set(long param_1,long param_2,byte param_3,undefined1 param_4)

{
  int num;
  undefined1 uVar1;
  void *pvVar2;
  void *pvVar3;
  undefined8 uVar4;
  undefined1 *puVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  
  if ((param_2 != 0) && (param_3 == 0)) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xdf,"dane_mtype_set");
    ERR_set_error(0x14,0xad,0);
    return 0;
  }
  if (*(byte *)(param_1 + 0x3a8) < param_3) {
    num = param_3 + 1;
    pvVar2 = CRYPTO_realloc(*(void **)(param_1 + 0x398),num * 8,"ssl/ssl_lib.c",0xe8);
    if (pvVar2 == (void *)0x0) {
      ERR_new();
      uVar4 = 0xea;
    }
    else {
      *(void **)(param_1 + 0x398) = pvVar2;
      pvVar3 = CRYPTO_realloc(*(void **)(param_1 + 0x3a0),num,"ssl/ssl_lib.c",0xef);
      if (pvVar3 != (void *)0x0) {
        uVar6 = (ulong)*(byte *)(param_1 + 0x3a8);
        *(void **)(param_1 + 0x3a0) = pvVar3;
        if (*(byte *)(param_1 + 0x3a8) + 1 < (uint)param_3) {
          puVar5 = (undefined1 *)((long)pvVar3 + uVar6);
          puVar8 = (undefined8 *)((long)pvVar2 + uVar6 * 8);
          lVar7 = ((ulong)param_3 - 1) - uVar6;
          do {
            puVar8 = puVar8 + 1;
            puVar5 = puVar5 + 1;
            *puVar8 = 0;
            lVar7 = lVar7 + -1;
            *puVar5 = 0;
          } while (lVar7 != 0);
        }
        *(byte *)(param_1 + 0x3a8) = param_3;
        goto LAB_009b3620;
      }
      ERR_new();
      uVar4 = 0xf1;
    }
    ERR_set_debug("ssl/ssl_lib.c",uVar4,"dane_mtype_set");
    ERR_set_error(0x14,0xc0100,0);
    uVar4 = 0xffffffff;
  }
  else {
LAB_009b3620:
    uVar1 = 0;
    if (param_2 != 0) {
      uVar1 = param_4;
    }
    *(long *)(*(long *)(param_1 + 0x398) + (ulong)param_3 * 8) = param_2;
    uVar4 = 1;
    *(undefined1 *)(*(long *)(param_1 + 0x3a0) + (ulong)param_3) = uVar1;
  }
  return uVar4;
}

