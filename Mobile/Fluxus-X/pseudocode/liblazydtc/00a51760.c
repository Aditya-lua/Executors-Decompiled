/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51760
 */

undefined8 engine_add_dynamic_id(long param_1,long param_2,int param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == 0 && *(long *)(param_1 + 0xd8) == 0) {
    return 0;
  }
  if ((param_3 != 0) && (iVar2 = CRYPTO_THREAD_write_lock(global_engine_lock), iVar2 == 0)) {
    return 0;
  }
  lVar1 = DAT_00d219a8;
  if (param_2 == 0) {
LAB_00a517e0:
    if (lVar1 == 0) {
      if (DAT_00d219b0 == 0) {
        DAT_00d219a8 = param_1;
        *(undefined8 *)(param_1 + 200) = 0;
LAB_00a5182c:
        uVar4 = 1;
        DAT_00d219b0 = param_1;
        *(undefined8 *)(param_1 + 0xd0) = 0;
        goto joined_r0x00a51814;
      }
    }
    else if ((DAT_00d219b0 != 0) && (*(long *)(DAT_00d219b0 + 0xd0) == 0)) {
      *(long *)(DAT_00d219b0 + 0xd0) = param_1;
      *(long *)(param_1 + 200) = DAT_00d219b0;
      goto LAB_00a5182c;
    }
  }
  else {
    if (DAT_00d219a8 != 0) {
      lVar3 = DAT_00d219a8;
      do {
        if (*(long *)(lVar3 + 0xd8) == param_2) {
          uVar4 = 0;
          goto joined_r0x00a51814;
        }
        lVar3 = *(long *)(lVar3 + 0xc0);
      } while (lVar3 != 0);
    }
    if (*(long *)(param_1 + 0xd8) == 0) {
      *(long *)(param_1 + 0xd8) = param_2;
      goto LAB_00a517e0;
    }
  }
  uVar4 = 0;
joined_r0x00a51814:
  if (param_3 != 0) {
    CRYPTO_THREAD_unlock(global_engine_lock);
  }
  return uVar4;
}

