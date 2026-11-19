/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2a44
 */

undefined8 tls_construct_ctos_session_ticket(long param_1,undefined8 param_2)

{
  int iVar1;
  void *__dest;
  undefined8 uVar2;
  int *piVar3;
  ushort *puVar4;
  ulong __n;
  
  iVar1 = tls_use_ticket();
  if (iVar1 == 0) {
    return 2;
  }
  piVar3 = *(int **)(param_1 + 0x918);
  if (*(int *)(param_1 + 0x3c) == 0) {
    if (piVar3 == (int *)0x0) goto LAB_009d2ae8;
    if ((*(long *)(piVar3 + 0xce) == 0) || (*piVar3 == 0x304)) goto LAB_009d2a74;
    __n = *(ulong *)(piVar3 + 0xd0);
    if (__n == 0) goto LAB_009d2ae8;
  }
  else {
    if (piVar3 != (int *)0x0) {
LAB_009d2a74:
      puVar4 = *(ushort **)(param_1 + 0xae0);
      if ((puVar4 != (ushort *)0x0) && (*(long *)(puVar4 + 4) != 0)) {
        __n = (ulong)*puVar4;
        __dest = CRYPTO_malloc((uint)*puVar4,"ssl/statem/extensions_clnt.c",0x10e);
        *(void **)(*(long *)(param_1 + 0x918) + 0x338) = __dest;
        if (__dest == (void *)0x0) {
          ERR_new();
          uVar2 = 0x110;
          goto LAB_009d2b58;
        }
        memcpy(__dest,*(void **)(*(long *)(param_1 + 0xae0) + 8),__n);
        *(ulong *)(*(long *)(param_1 + 0x918) + 0x340) = __n;
        if (__n != 0) goto LAB_009d2b08;
      }
    }
LAB_009d2ae8:
    if (*(long *)(param_1 + 0xae0) == 0) {
      __n = 0;
    }
    else {
      __n = 0;
      if (*(long *)(*(long *)(param_1 + 0xae0) + 8) == 0) {
        return 2;
      }
    }
  }
LAB_009d2b08:
  iVar1 = WPACKET_put_bytes__(param_2,0x23,2);
  if ((iVar1 != 0) &&
     (iVar1 = WPACKET_sub_memcpy__
                        (param_2,*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x338),__n,2),
     iVar1 != 0)) {
    return 1;
  }
  ERR_new();
  uVar2 = 0x120;
LAB_009d2b58:
  ERR_set_debug("ssl/statem/extensions_clnt.c",uVar2,"tls_construct_ctos_session_ticket");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

