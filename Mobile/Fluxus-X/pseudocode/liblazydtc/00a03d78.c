/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03d78
 */

void BN_CTX_start(BN_CTX *ctx)

{
  uint uVar1;
  undefined4 uVar2;
  void *__dest;
  int iVar3;
  uint uVar4;
  
  iVar3 = *(int *)(ctx + 0x34);
  if ((iVar3 == 0) && (*(int *)(ctx + 0x38) == 0)) {
    uVar4 = *(uint *)(ctx + 0x28);
    uVar2 = *(undefined4 *)(ctx + 0x30);
    if (uVar4 == *(uint *)(ctx + 0x2c)) {
      uVar1 = 0x20;
      if (uVar4 != 0) {
        uVar1 = uVar4 * 3 >> 1;
      }
      __dest = CRYPTO_malloc(uVar1 << 2,"crypto/bn/bn_ctx.c",0x10f);
      if (__dest == (void *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/bn/bn_ctx.c",0x110,"BN_STACK_push");
        ERR_set_error(3,0xc0100,0);
        ERR_new();
        ERR_set_debug("crypto/bn/bn_ctx.c",0xbd,"BN_CTX_start");
        ERR_set_error(3,0x6d,0);
        iVar3 = *(int *)(ctx + 0x34);
        goto LAB_00a03d9c;
      }
      if (*(uint *)(ctx + 0x28) != 0) {
        memcpy(__dest,*(void **)(ctx + 0x20),(ulong)*(uint *)(ctx + 0x28) << 2);
      }
      CRYPTO_free(*(void **)(ctx + 0x20));
      uVar4 = *(uint *)(ctx + 0x28);
      *(void **)(ctx + 0x20) = __dest;
      *(uint *)(ctx + 0x2c) = uVar1;
    }
    else {
      __dest = *(void **)(ctx + 0x20);
    }
    *(uint *)(ctx + 0x28) = uVar4 + 1;
    *(undefined4 *)((long)__dest + (ulong)uVar4 * 4) = uVar2;
  }
  else {
LAB_00a03d9c:
    *(int *)(ctx + 0x34) = iVar3 + 1;
  }
  return;
}

