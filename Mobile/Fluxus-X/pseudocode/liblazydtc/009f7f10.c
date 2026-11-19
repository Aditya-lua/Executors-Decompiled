/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7f10
 */

void ossl_asn1_enc_free(long *param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  
  if ((((param_1 != (long *)0x0) && (*param_1 != 0)) &&
      (lVar2 = *(long *)(param_2 + 0x20), lVar2 != 0)) &&
     (((*(byte *)(lVar2 + 8) >> 1 & 1) != 0 &&
      (puVar1 = (undefined8 *)(*param_1 + (long)*(int *)(lVar2 + 0x20)), puVar1 != (undefined8 *)0x0
      )))) {
    CRYPTO_free((void *)*puVar1);
    *puVar1 = 0;
    puVar1[1] = 0;
    *(undefined4 *)(puVar1 + 2) = 1;
  }
  return;
}

