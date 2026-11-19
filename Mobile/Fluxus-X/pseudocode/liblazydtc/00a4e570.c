/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e570
 */

int ossl_core_bio_vprintf(long param_1,char *param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 local_30;
  undefined8 uStack_28;
  undefined8 local_20;
  undefined8 uStack_18;
  
  uStack_18 = param_3[3];
  local_20 = param_3[2];
  uStack_28 = param_3[1];
  local_30 = *param_3;
  iVar1 = BIO_vprintf(*(BIO **)(param_1 + 0x10),param_2,&local_30);
  return iVar1;
}

