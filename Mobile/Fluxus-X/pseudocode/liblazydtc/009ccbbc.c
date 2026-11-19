/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccbbc
 */

undefined8 ssl3_setup_read_buffer(long param_1)

{
  ulong uVar1;
  int iVar2;
  void *pvVar3;
  ulong uVar4;
  ulong uVar5;
  
  if (*(long *)(param_1 + 0xc78) == 0) {
    uVar5 = (ulong)((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) & 8) + 0x4148);
    iVar2 = ssl_allow_compression();
    uVar4 = *(ulong *)(param_1 + 0xa20);
    if (iVar2 != 0) {
      uVar5 = uVar5 | 0x400;
    }
    if (uVar4 < 2) {
      uVar4 = 1;
    }
    uVar1 = *(ulong *)(param_1 + 0xc80);
    if (*(ulong *)(param_1 + 0xc80) <= uVar4 * uVar5) {
      uVar1 = uVar4 * uVar5;
    }
    pvVar3 = CRYPTO_malloc((int)uVar1,"ssl/record/ssl3_buffer.c",0x44);
    if (pvVar3 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_buffer.c",0x4a,"ssl3_setup_read_buffer");
      ossl_statem_fatal(param_1,0xffffffff,0xc0100,0);
      return 0;
    }
    *(void **)(param_1 + 0xc78) = pvVar3;
    *(ulong *)(param_1 + 0xc88) = uVar1;
  }
  return 1;
}

