/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8054
 */

undefined8 ossl_asn1_enc_restore(undefined4 *param_1,long *param_2,long *param_3,long param_4)

{
  undefined8 *puVar1;
  long lVar2;
  
  if (((param_3 != (long *)0x0) && (*param_3 != 0)) &&
     (lVar2 = *(long *)(param_4 + 0x20), lVar2 != 0)) {
    if ((*(byte *)(lVar2 + 8) >> 1 & 1) == 0) {
      return 0;
    }
    puVar1 = (undefined8 *)(*param_3 + (long)*(int *)(lVar2 + 0x20));
    if (puVar1 != (undefined8 *)0x0) {
      if (*(int *)(puVar1 + 2) != 0) {
        return 0;
      }
      if (param_2 != (long *)0x0) {
        memcpy((void *)*param_2,(void *)*puVar1,puVar1[1]);
        *param_2 = *param_2 + puVar1[1];
      }
      if (param_1 != (undefined4 *)0x0) {
        *param_1 = (int)puVar1[1];
      }
      return 1;
    }
  }
  return 0;
}

