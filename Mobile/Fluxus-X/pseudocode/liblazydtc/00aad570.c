/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad570
 */

int OBJ_NAME_add(char *name,int type,char *data)

{
  int iVar1;
  ulong *ptr;
  int *ptr_00;
  long lVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22160,FUN_00aad21c);
  if (iVar1 == 0) {
    return 0;
  }
  if (DAT_00d22164 == 0) {
    return 0;
  }
  ptr = CRYPTO_malloc(0x18,"crypto/objects/o_names.c",200);
  if (ptr == (ulong *)0x0) {
    return 0;
  }
  ptr[1] = (ulong)name;
  ptr[2] = (ulong)data;
  *ptr = CONCAT44(type,type) & 0x8000ffff7fff;
  iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22168);
  if (iVar1 == 0) {
    CRYPTO_free(ptr);
    return 0;
  }
  ptr_00 = (int *)OPENSSL_LH_insert(DAT_00d22178,ptr);
  if (ptr_00 == (int *)0x0) {
    iVar1 = OPENSSL_LH_error(DAT_00d22178);
    if (iVar1 != 0) {
      CRYPTO_free(ptr);
      iVar1 = 0;
      goto LAB_00aad6a0;
    }
  }
  else {
    if ((DAT_00d22170 != 0) && (iVar1 = OPENSSL_sk_num(), *ptr_00 < iVar1)) {
      lVar2 = OPENSSL_sk_value(DAT_00d22170);
      (**(code **)(lVar2 + 0x10))(*(undefined8 *)(ptr_00 + 2),*ptr_00,*(undefined8 *)(ptr_00 + 4));
    }
    CRYPTO_free(ptr_00);
  }
  iVar1 = 1;
LAB_00aad6a0:
  CRYPTO_THREAD_unlock(DAT_00d22168);
  return iVar1;
}

