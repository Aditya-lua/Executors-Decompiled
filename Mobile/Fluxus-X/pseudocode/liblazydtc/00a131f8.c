/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a131f8
 */

ulong i2o_SCT(int *param_1,undefined8 *param_2)

{
  int iVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  size_t __n;
  undefined1 *ptr;
  undefined1 *local_38;
  
  local_38 = (undefined1 *)0x0;
  iVar1 = SCT_is_complete();
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_oct.c",0xce,"i2o_SCT");
    uVar3 = 0x6a;
LAB_00a13280:
    ERR_set_error(0x32,uVar3,0);
    ptr = (undefined1 *)0x0;
  }
  else {
    iVar1 = *param_1;
    if (iVar1 == 0) {
      __n = *(long *)(param_1 + 0xe) + *(long *)(param_1 + 0x14) + 0x2f;
    }
    else {
      __n = *(size_t *)(param_1 + 4);
    }
    if (param_2 == (undefined8 *)0x0) goto LAB_00a132a4;
    puVar2 = (undefined1 *)*param_2;
    if (puVar2 == (undefined1 *)0x0) {
      local_38 = CRYPTO_malloc((int)__n,"crypto/ct/ct_oct.c",0xe3);
      if (local_38 == (undefined1 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ct/ct_oct.c",0xe5,"i2o_SCT");
        uVar3 = 0xc0100;
        goto LAB_00a13280;
      }
      iVar1 = *param_1;
      *param_2 = local_38;
      ptr = local_38;
    }
    else {
      ptr = (undefined1 *)0x0;
      *param_2 = puVar2 + __n;
      local_38 = puVar2;
    }
    if (iVar1 != 0) {
      memcpy(local_38,*(void **)(param_1 + 2),__n);
      goto LAB_00a132a4;
    }
    *local_38 = 0;
    puVar4 = *(undefined8 **)(param_1 + 6);
    uVar3 = puVar4[2];
    puVar2 = local_38 + 0x2b;
    *(undefined8 *)(local_38 + 0x19) = puVar4[3];
    *(undefined8 *)(local_38 + 0x11) = uVar3;
    uVar3 = *puVar4;
    *(undefined8 *)(local_38 + 9) = puVar4[1];
    *(undefined8 *)(local_38 + 1) = uVar3;
    local_38[0x21] = *(undefined1 *)((long)param_1 + 0x2f);
    local_38[0x22] = (char)*(undefined2 *)((long)param_1 + 0x2e);
    local_38[0x23] = (char)((ulong)*(undefined8 *)(param_1 + 10) >> 0x28);
    local_38[0x24] = (char)param_1[0xb];
    local_38[0x25] = (char)((ulong)*(undefined8 *)(param_1 + 10) >> 0x18);
    local_38[0x26] = (char)((ulong)*(undefined8 *)(param_1 + 10) >> 0x10);
    local_38[0x27] = (char)((ulong)*(undefined8 *)(param_1 + 10) >> 8);
    local_38[0x28] = (char)*(undefined8 *)(param_1 + 10);
    local_38[0x29] = (char)((ulong)*(undefined8 *)(param_1 + 0xe) >> 8);
    local_38[0x2a] = (char)*(undefined8 *)(param_1 + 0xe);
    local_38 = puVar2;
    if (*(size_t *)(param_1 + 0xe) != 0) {
      memcpy(puVar2,*(void **)(param_1 + 0xc),*(size_t *)(param_1 + 0xe));
      local_38 = puVar2 + *(long *)(param_1 + 0xe);
    }
    iVar1 = i2o_SCT_signature(param_1,&local_38);
    if (0 < iVar1) goto LAB_00a132a4;
  }
  CRYPTO_free(ptr);
  __n = 0xffffffff;
LAB_00a132a4:
  return __n & 0xffffffff;
}

