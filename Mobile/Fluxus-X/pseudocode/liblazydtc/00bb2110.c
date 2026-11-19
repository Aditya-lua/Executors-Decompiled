/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2110
 */

void ZSTD_DCtx_loadDictionary_byReference(long param_1,long param_2,long param_3)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(int *)(param_1 + 0x761c) == 0) {
    ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
    uVar2 = 0;
    *(undefined4 *)(param_1 + 0x7600) = 0;
    *(undefined8 *)(param_1 + 0x75f0) = 0;
    *(undefined8 *)(param_1 + 0x75e8) = 0;
    if ((param_2 != 0) && (param_3 != 0)) {
      uStack_58 = *(undefined8 *)(param_1 + 0x75b8);
      local_60 = *(undefined8 *)(param_1 + 0x75b0);
      local_50 = *(undefined8 *)(param_1 + 0x75c0);
      lVar3 = ZSTD_createDDict_advanced(param_2,param_3,1,0,&local_60);
      *(long *)(param_1 + 0x75e8) = lVar3;
      if (lVar3 == 0) {
        uVar2 = 0xffffffffffffffc0;
      }
      else {
        uVar2 = 0;
        *(long *)(param_1 + 0x75f0) = lVar3;
        *(undefined4 *)(param_1 + 0x7600) = 0xffffffff;
      }
    }
  }
  else {
    uVar2 = 0xffffffffffffffc4;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

