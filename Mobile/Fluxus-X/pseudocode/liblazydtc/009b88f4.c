/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b88f4
 */

undefined8 SSL_client_hello_get1_extensions_present(long param_1,undefined8 *param_2,ulong *param_3)

{
  void *ptr;
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  int *piVar4;
  ulong *puVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  
  if (param_3 == (ulong *)0x0) {
    return 0;
  }
  if (param_2 == (undefined8 *)0x0) {
    return 0;
  }
  lVar3 = *(long *)(param_1 + 0xb58);
  if (lVar3 == 0) {
    return 0;
  }
  uVar1 = *(ulong *)(lVar3 + 0x280);
  if (uVar1 == 0) goto LAB_009b8a14;
  uVar2 = 0;
  uVar8 = 0;
  if (uVar1 == 1) {
LAB_009b8980:
    piVar4 = (int *)(*(long *)(lVar3 + 0x288) + uVar2 * 0x28 + 0x10);
    do {
      uVar2 = uVar2 + 1;
      if (*piVar4 != 0) {
        uVar8 = uVar8 + 1;
      }
      piVar4 = piVar4 + 10;
    } while (uVar2 < uVar1);
  }
  else {
    uVar2 = uVar1 & 0xfffffffffffffffe;
    lVar6 = 0;
    lVar7 = 0;
    piVar4 = (int *)(*(long *)(lVar3 + 0x288) + 0x38);
    uVar8 = uVar2;
    do {
      if (piVar4[-10] != 0) {
        lVar6 = lVar6 + 1;
      }
      if (*piVar4 != 0) {
        lVar7 = lVar7 + 1;
      }
      uVar8 = uVar8 - 2;
      piVar4 = piVar4 + 0x14;
    } while (uVar8 != 0);
    uVar8 = lVar7 + lVar6;
    if (uVar1 != uVar2) goto LAB_009b8980;
  }
  if (uVar8 != 0) {
    ptr = CRYPTO_malloc((int)(uVar8 << 2),"ssl/ssl_lib.c",0x1547);
    if (ptr == (void *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x1548,"SSL_client_hello_get1_extensions_present");
      ERR_set_error(0x14,0xc0100,0);
      return 0;
    }
    uVar1 = *(ulong *)(*(long *)(param_1 + 0xb58) + 0x280);
    if (uVar1 != 0) {
      uVar2 = 0;
      puVar5 = (ulong *)(*(long *)(*(long *)(param_1 + 0xb58) + 0x288) + 0x20);
      do {
        if ((int)puVar5[-2] != 0) {
          if (uVar8 <= *puVar5) {
            CRYPTO_free(ptr);
            return 0;
          }
          *(int *)((long)ptr + *puVar5 * 4) = (int)puVar5[-1];
        }
        uVar2 = uVar2 + 1;
        puVar5 = puVar5 + 5;
      } while (uVar2 < uVar1);
    }
    *param_2 = ptr;
    *param_3 = uVar8;
    return 1;
  }
LAB_009b8a14:
  *param_2 = 0;
  *param_3 = 0;
  return 1;
}

