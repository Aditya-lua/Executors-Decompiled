/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12808
 */

long CTLOG_STORE_get0_log_by_id(long param_1,void *param_2,size_t param_3)

{
  int iVar1;
  int iVar2;
  long lVar3;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x10));
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      lVar3 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x10),iVar1);
      iVar2 = memcmp((void *)(lVar3 + 0x18),param_2,param_3);
      if (iVar2 == 0) {
        return lVar3;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x10));
    } while (iVar1 < iVar2);
  }
  return 0;
}

