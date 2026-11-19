/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50f6c
 */

ulong engine_unlocked_finish(long param_1,int param_2)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  
  iVar1 = *(int *)(param_1 + 0xa0) + -1;
  *(int *)(param_1 + 0xa0) = iVar1;
  if ((iVar1 == 0) && (*(code **)(param_1 + 0x68) != (code *)0x0)) {
    if (param_2 == 0) {
      uVar3 = (**(code **)(param_1 + 0x68))(param_1);
      uVar4 = uVar3 & 0xffffffff;
      iVar1 = (int)uVar3;
    }
    else {
      CRYPTO_THREAD_unlock(global_engine_lock);
      uVar2 = (**(code **)(param_1 + 0x68))(param_1);
      uVar4 = (ulong)uVar2;
      iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
      if (uVar2 == 0) {
        return 0;
      }
      uVar3 = 0;
    }
    if (iVar1 == 0) {
      return uVar3;
    }
  }
  else {
    uVar4 = 1;
  }
  iVar1 = engine_free_util(param_1,0);
  if (iVar1 == 0) {
    ERR_new(uVar4);
    ERR_set_debug("crypto/engine/eng_init.c",0x4a,"engine_unlocked_finish");
    ERR_set_error(0x26,0x6a,0);
    return 0;
  }
  return uVar4;
}

