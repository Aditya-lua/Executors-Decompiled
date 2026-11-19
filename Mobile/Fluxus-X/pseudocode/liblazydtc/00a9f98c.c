/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f98c
 */

undefined8 * OSSL_PARAM_dup(long *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 *ptr;
  long lVar3;
  undefined8 *puVar4;
  uint uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  size_t __n;
  long lVar9;
  undefined8 uVar10;
  long local_90 [6];
  
  if (param_1 == (long *)0x0) {
    return (undefined8 *)0x0;
  }
  local_90[3] = 0;
  local_90[2] = 0;
  local_90[5] = 0;
  local_90[4] = 0;
  local_90[1] = 0;
  local_90[0] = 0;
  if (*param_1 == 0) {
    uVar8 = 5;
  }
  else {
    lVar6 = 0;
    do {
      lVar7 = lVar6;
      iVar2 = CRYPTO_secure_allocated(*(undefined8 *)((long)param_1 + lVar7 + 0x10));
      uVar5 = *(uint *)((long)param_1 + lVar7 + 8);
      if ((uVar5 & 0xfffffffe) == 6) {
        lVar6 = 8;
      }
      else {
        lVar6 = *(long *)((long)param_1 + lVar7 + 0x18);
      }
      lVar3 = 7;
      if (uVar5 == 4) {
        lVar3 = 8;
      }
      local_90[(long)iVar2 * 4] = local_90[(long)iVar2 * 4] + ((ulong)(lVar3 + lVar6) >> 3);
      lVar6 = lVar7 + 0x28;
    } while (*(long *)((long)param_1 + lVar7 + 0x28) != 0);
    uVar8 = lVar7 + 0x50U >> 3;
  }
  lVar6 = (uVar8 + local_90[0]) * 8;
  ptr = (undefined8 *)CRYPTO_zalloc(lVar6,"crypto/params_dup.c",0x27);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/params_dup.c",0x2a,"ossl_param_buf_alloc");
    ERR_set_error(0xf,0xc0100,0);
    return (undefined8 *)0x0;
  }
  local_90[1] = lVar6;
  if (local_90[4] == 0) {
    lVar6 = 0;
    lVar3 = *param_1;
    lVar7 = 0;
  }
  else {
    lVar6 = local_90[4] << 3;
    local_90[2] = CRYPTO_secure_zalloc(lVar6,"crypto/params_dup.c",0x27);
    if (local_90[2] == 0) {
      ERR_new();
      ERR_set_debug("crypto/params_dup.c",0x2a,"ossl_param_buf_alloc");
      ERR_set_error(0xf,0x6f,0);
      CRYPTO_free(ptr);
      return (undefined8 *)0x0;
    }
    lVar3 = *param_1;
    lVar7 = local_90[2];
    local_90[3] = local_90[2];
    local_90[5] = lVar6;
  }
  if (lVar3 == 0) {
    puVar4 = ptr;
  }
  else {
    lVar3 = 0;
    do {
      puVar4 = (undefined8 *)((long)param_1 + lVar3);
      iVar2 = CRYPTO_secure_allocated(puVar4[2]);
      puVar1 = (undefined8 *)((long)ptr + lVar3);
      lVar9 = (long)iVar2;
      puVar1[4] = puVar4[4];
      uVar10 = puVar4[2];
      puVar1[3] = puVar4[3];
      puVar1[2] = uVar10;
      uVar10 = *puVar4;
      puVar1[1] = puVar4[1];
      *puVar1 = uVar10;
      puVar1[2] = local_90[lVar9 * 4 + -1];
      uVar5 = *(uint *)(puVar4 + 1);
      if ((uVar5 & 0xfffffffe) == 6) {
        __n = 8;
        *(undefined8 *)puVar1[2] = *(undefined8 *)puVar4[2];
      }
      else {
        __n = puVar4[3];
        memcpy((void *)puVar1[2],(void *)puVar4[2],__n);
        uVar5 = *(uint *)(puVar4 + 1);
      }
      if (uVar5 == 4) {
        __n = __n + 1;
      }
      local_90[lVar9 * 4 + -1] = local_90[lVar9 * 4 + -1] + (__n + 7 & 0xfffffffffffffff8);
      lVar9 = lVar3 + 0x28;
      lVar3 = lVar3 + 0x28;
    } while (*(long *)((long)param_1 + lVar9) != 0);
    puVar4 = (undefined8 *)((long)ptr + lVar3);
  }
  *puVar4 = 0;
  puVar4[2] = lVar7;
  puVar4[3] = lVar6;
  *(undefined4 *)(puVar4 + 1) = 0x7f;
  return ptr;
}

