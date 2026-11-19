/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ebcb4
 */

undefined8 tls_handle_alpn(long param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  code *pcVar5;
  long lVar6;
  ulong __n;
  void *__s2;
  byte local_34 [4];
  void *local_28;
  
  local_28 = (void *)0x0;
  local_34[0] = 0;
  pcVar5 = *(code **)(*(long *)(param_1 + 0x9a8) + 0x298);
  if (((pcVar5 == (code *)0x0) || (*(long *)(param_1 + 0x498) == 0)) ||
     (iVar1 = (*pcVar5)(param_1,&local_28,local_34,*(long *)(param_1 + 0x498),
                        *(undefined4 *)(param_1 + 0x4a0),
                        *(undefined8 *)(*(long *)(param_1 + 0x9a8) + 0x2a0)), iVar1 == 3)) {
    if (*(long *)(*(long *)(param_1 + 0x918) + 0x358) == 0) {
      return 1;
    }
    *(undefined4 *)(param_1 + 0xb34) = 0;
    return 1;
  }
  if (iVar1 == 0) {
    CRYPTO_free(*(void **)(param_1 + 0x488));
    lVar2 = CRYPTO_memdup(local_28,local_34[0],"ssl/statem/statem_srvr.c",0x849);
    *(long *)(param_1 + 0x488) = lVar2;
    if (lVar2 == 0) {
      *(undefined8 *)(param_1 + 0x490) = 0;
      ERR_new();
      uVar3 = 0x84c;
    }
    else {
      __n = (ulong)local_34[0];
      *(undefined4 *)(param_1 + 0x484) = 0;
      *(ulong *)(param_1 + 0x490) = __n;
      __s2 = *(void **)(*(long *)(param_1 + 0x918) + 0x358);
      if ((((__s2 != (void *)0x0) && (*(ulong *)(*(long *)(param_1 + 0x918) + 0x360) == __n)) &&
          (iVar1 = memcmp(local_28,__s2,__n), iVar1 == 0)) ||
         (*(undefined4 *)(param_1 + 0xb34) = 0, *(int *)(param_1 + 0x4d0) != 0)) {
        return 1;
      }
      if (__s2 == (void *)0x0) {
        lVar2 = CRYPTO_memdup(local_28,__n,"ssl/statem/statem_srvr.c",0x869);
        lVar6 = *(long *)(param_1 + 0x918);
        *(long *)(lVar6 + 0x358) = lVar2;
        if (lVar2 != 0) {
          *(ulong *)(lVar6 + 0x360) = (ulong)local_34[0];
          return 1;
        }
        ERR_new();
        uVar3 = 0x86c;
      }
      else {
        ERR_new();
        uVar3 = 0x865;
      }
    }
    ERR_set_debug("ssl/statem/statem_srvr.c",uVar3,"tls_handle_alpn");
    uVar3 = 0x50;
    uVar4 = 0xc0103;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x876,"tls_handle_alpn");
    uVar3 = 0x78;
    uVar4 = 0xeb;
  }
  ossl_statem_fatal(param_1,uVar3,uVar4,0);
  return 0;
}

