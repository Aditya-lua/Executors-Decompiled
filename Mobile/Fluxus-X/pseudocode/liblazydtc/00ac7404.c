/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7404
 */

undefined4 FUN_00ac7404(undefined8 param_1,undefined8 param_2,int *param_3,char *param_4)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 *ptr;
  size_t sVar3;
  char *local_60 [2];
  
  local_60[0] = param_4;
  iVar1 = CRYPTO_THREAD_read_lock();
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/property/property_string.c",0x92,"ossl_property_string");
    uVar2 = 0xc010f;
LAB_00ac74ec:
    ERR_set_error(0xf,uVar2,0);
LAB_00ac74f4:
    uVar2 = 0;
  }
  else {
    ptr = (undefined8 *)OPENSSL_LH_retrieve(param_2,local_60);
    CRYPTO_THREAD_unlock(param_1);
    if ((param_3 == (int *)0x0) || (ptr != (undefined8 *)0x0)) {
      if (ptr == (undefined8 *)0x0) goto LAB_00ac74f4;
    }
    else {
      iVar1 = CRYPTO_THREAD_write_lock(param_1);
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("crypto/property/property_string.c",0x99,"ossl_property_string");
        uVar2 = 0xc0110;
        goto LAB_00ac74ec;
      }
      ptr = (undefined8 *)OPENSSL_LH_retrieve(param_2,local_60);
      if (ptr == (undefined8 *)0x0) {
        sVar3 = strlen(param_4);
        ptr = CRYPTO_malloc((int)sVar3 + 0x10,"crypto/property/property_string.c",0x7b);
        if (ptr != (undefined8 *)0x0) {
          memcpy((void *)((long)ptr + 0xc),param_4,sVar3 + 1);
          *ptr = (void *)((long)ptr + 0xc);
          iVar1 = *param_3 + 1;
          *param_3 = iVar1;
          *(int *)(ptr + 1) = iVar1;
          if (iVar1 != 0) {
            OPENSSL_LH_insert(param_2,ptr);
            iVar1 = OPENSSL_LH_error(param_2);
            if (iVar1 == 0) goto LAB_00ac747c;
          }
          CRYPTO_free(ptr);
        }
        CRYPTO_THREAD_unlock(param_1);
        goto LAB_00ac74f4;
      }
LAB_00ac747c:
      CRYPTO_THREAD_unlock(param_1);
    }
    uVar2 = *(undefined4 *)(ptr + 1);
  }
  return uVar2;
}

