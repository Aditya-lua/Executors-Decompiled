/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5186c
 */

void engine_remove_dynamic_id(long param_1,int param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  
  if (((param_1 != 0) && (*(long *)(param_1 + 0xd8) != 0)) &&
     ((param_2 == 0 || (iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock), iVar1 != 0)))) {
    lVar3 = *(long *)(param_1 + 0xd0);
    *(undefined8 *)(param_1 + 0xd8) = 0;
    if (lVar3 != 0) {
      *(undefined8 *)(lVar3 + 200) = *(undefined8 *)(param_1 + 200);
    }
    lVar2 = *(long *)(param_1 + 200);
    if (lVar2 != 0) {
      *(long *)(lVar2 + 0xd0) = lVar3;
    }
    if (DAT_00d219a8 == param_1) {
      DAT_00d219a8 = *(long *)(param_1 + 0xd0);
    }
    if (DAT_00d219b0 != param_1) {
      lVar2 = DAT_00d219b0;
    }
    DAT_00d219b0 = lVar2;
    if (param_2 != 0) {
      CRYPTO_THREAD_unlock(global_engine_lock);
      return;
    }
  }
  return;
}

