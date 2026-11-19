/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a130b4
 */

ulong i2o_SCT_signature(int *param_1,long *param_2)

{
  int iVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  ulong uVar5;
  
  iVar1 = SCT_signature_is_complete();
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_oct.c",0x9f,"i2o_SCT_signature");
    uVar3 = 0x6b;
  }
  else {
    if (*param_1 == 0) {
      uVar5 = *(long *)(param_1 + 0x14) + 4;
      if (param_2 == (long *)0x0) goto LAB_00a13148;
      puVar4 = (undefined1 *)*param_2;
      if (puVar4 == (undefined1 *)0x0) {
        puVar2 = CRYPTO_malloc((int)uVar5,"crypto/ct/ct_oct.c",0xb4);
        puVar4 = puVar2;
        if (puVar2 == (undefined1 *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/ct/ct_oct.c",0xb6,"i2o_SCT_signature");
          uVar3 = 0xc0100;
          goto LAB_00a13128;
        }
      }
      else {
        puVar2 = puVar4 + uVar5;
      }
      *param_2 = (long)puVar2;
      *puVar4 = (char)param_1[0x10];
      puVar4[1] = *(undefined1 *)((long)param_1 + 0x41);
      puVar4[2] = (char)((ulong)*(undefined8 *)(param_1 + 0x14) >> 8);
      puVar4[3] = (char)*(undefined8 *)(param_1 + 0x14);
      memcpy(puVar4 + 4,*(void **)(param_1 + 0x12),*(size_t *)(param_1 + 0x14));
      goto LAB_00a13148;
    }
    ERR_new();
    ERR_set_debug("crypto/ct/ct_oct.c",0xa4,"i2o_SCT_signature");
    uVar3 = 0x67;
  }
LAB_00a13128:
  ERR_set_error(0x32,uVar3,0);
  CRYPTO_free((void *)0x0);
  uVar5 = 0xffffffff;
LAB_00a13148:
  return uVar5 & 0xffffffff;
}

