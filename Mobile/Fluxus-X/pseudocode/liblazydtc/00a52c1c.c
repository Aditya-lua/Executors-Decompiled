/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52c1c
 */

undefined8
engine_table_register
          (long *param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4,int param_5,
          int param_6)

{
  int iVar1;
  undefined4 *ptr;
  long lVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  undefined4 local_80 [8];
  
  iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (iVar1 == 0) {
    return 0;
  }
  if (*param_1 == 0) {
    lVar2 = OPENSSL_LH_new(&LAB_00a53138,&LAB_00a53140);
    if (lVar2 == 0) {
LAB_00a52df0:
      uVar4 = 0;
      goto LAB_00a52df4;
    }
    *param_1 = lVar2;
    iVar1 = engine_cleanup_add_first(param_2);
    if (iVar1 == 0) {
      OPENSSL_LH_free(*param_1);
      uVar4 = 0;
      *param_1 = 0;
      goto LAB_00a52df4;
    }
  }
  uVar4 = 1;
  if (param_5 != 0) {
    do {
      local_80[0] = *param_4;
      ptr = (undefined4 *)OPENSSL_LH_retrieve(*param_1,local_80);
      if (ptr == (undefined4 *)0x0) {
        ptr = CRYPTO_malloc(0x20,"crypto/engine/eng_table.c",0x6a);
        if (ptr != (undefined4 *)0x0) {
          ptr[6] = 1;
          *ptr = *param_4;
          lVar2 = OPENSSL_sk_new_null();
          *(long *)(ptr + 2) = lVar2;
          if (lVar2 != 0) {
            *(undefined8 *)(ptr + 4) = 0;
            OPENSSL_LH_insert(*param_1,ptr);
            puVar3 = (undefined4 *)OPENSSL_LH_retrieve(*param_1,local_80);
            if (puVar3 == ptr) goto LAB_00a52cf4;
            OPENSSL_sk_free(*(undefined8 *)(ptr + 2));
          }
          CRYPTO_free(ptr);
        }
        goto LAB_00a52df0;
      }
LAB_00a52cf4:
      OPENSSL_sk_delete_ptr(*(undefined8 *)(ptr + 2),param_3);
      iVar1 = OPENSSL_sk_push(*(undefined8 *)(ptr + 2),param_3);
      if (iVar1 == 0) goto LAB_00a52df0;
      ptr[6] = 0;
      if (param_6 != 0) {
        iVar1 = engine_unlocked_init(param_3);
        if (iVar1 == 0) {
          ERR_new();
          ERR_set_debug("crypto/engine/eng_table.c",0x87,"engine_table_register");
          ERR_set_error(0x26,0x6d,0);
          goto LAB_00a52df0;
        }
        if (*(long *)(ptr + 4) != 0) {
          engine_unlocked_finish(*(long *)(ptr + 4),0);
        }
        *(undefined8 *)(ptr + 4) = param_3;
        ptr[6] = 1;
      }
      param_5 = param_5 + -1;
      param_4 = param_4 + 1;
    } while (param_5 != 0);
    uVar4 = 1;
  }
LAB_00a52df4:
  CRYPTO_THREAD_unlock(global_engine_lock);
  return uVar4;
}

