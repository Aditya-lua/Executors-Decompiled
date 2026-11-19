/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad6bc
 */

int OBJ_NAME_remove(char *name,int type)

{
  int iVar1;
  int *ptr;
  long lVar2;
  int iVar3;
  uint local_48 [2];
  char *local_40;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22160,FUN_00aad21c);
  iVar3 = 0;
  if ((iVar1 != 0) && (DAT_00d22164 != 0)) {
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22168);
    if (iVar1 == 0) {
      iVar3 = 0;
    }
    else {
      local_48[0] = type & 0xffff7fff;
      local_40 = name;
      ptr = (int *)OPENSSL_LH_delete(DAT_00d22178,local_48);
      if (ptr == (int *)0x0) {
        iVar3 = 0;
      }
      else {
        if (DAT_00d22170 != 0) {
          iVar1 = OPENSSL_sk_num();
          if (*ptr < iVar1) {
            lVar2 = OPENSSL_sk_value(DAT_00d22170);
            (**(code **)(lVar2 + 0x10))(*(undefined8 *)(ptr + 2),*ptr,*(undefined8 *)(ptr + 4));
          }
        }
        CRYPTO_free(ptr);
        iVar3 = 1;
      }
      CRYPTO_THREAD_unlock(DAT_00d22168);
    }
  }
  return iVar3;
}

