/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52fa8
 */

long ossl_engine_table_select(long *param_1,undefined4 param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined4 local_60 [8];
  
  OPENSSL_init_crypto(0x40,0);
  if (*param_1 == 0) {
    return 0;
  }
  ERR_set_mark();
  iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (((iVar1 == 0) || (*param_1 == 0)) ||
     (local_60[0] = param_2, lVar3 = OPENSSL_LH_retrieve(*param_1,local_60), lVar3 == 0)) {
    lVar4 = 0;
  }
  else {
    if ((*(long *)(lVar3 + 0x10) == 0) || (iVar1 = engine_unlocked_init(), iVar1 == 0)) {
      if (*(int *)(lVar3 + 0x18) == 0) {
        iVar1 = 0;
        do {
          lVar4 = OPENSSL_sk_value(*(undefined8 *)(lVar3 + 8),iVar1);
          if (lVar4 == 0) goto LAB_00a530c0;
          iVar1 = iVar1 + 1;
          if ((0 < *(int *)(lVar4 + 0xa0)) || (iVar2 = 0, (DAT_00d219d0 & 1) == 0)) {
            iVar2 = engine_unlocked_init(lVar4);
          }
        } while (iVar2 == 0);
        if ((*(long *)(lVar3 + 0x10) != lVar4) && (iVar1 = engine_unlocked_init(lVar4), iVar1 != 0))
        {
          if (*(long *)(lVar3 + 0x10) != 0) {
            engine_unlocked_finish(*(long *)(lVar3 + 0x10),0);
          }
          *(long *)(lVar3 + 0x10) = lVar4;
        }
      }
      else {
        lVar4 = *(long *)(lVar3 + 0x10);
      }
    }
    else {
      lVar4 = *(long *)(lVar3 + 0x10);
    }
LAB_00a530c0:
    *(undefined4 *)(lVar3 + 0x18) = 1;
  }
  CRYPTO_THREAD_unlock(global_engine_lock);
  ERR_pop_to_mark();
  return lVar4;
}

