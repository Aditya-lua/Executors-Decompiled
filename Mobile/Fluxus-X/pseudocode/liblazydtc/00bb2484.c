/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2484
 */

void ZSTD_initDStream_usingDict(long param_1,long param_2,long param_3)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *(undefined4 *)(param_1 + 0x761c) = 0;
  *(undefined4 *)(param_1 + 0x766c) = 0;
  *(undefined4 *)(param_1 + 0x75e0) = 1;
  ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
  *(undefined4 *)(param_1 + 0x7600) = 0;
  *(undefined8 *)(param_1 + 0x75f0) = 0;
  *(undefined8 *)(param_1 + 0x75e8) = 0;
  if ((param_2 != 0) && (param_3 != 0)) {
    uStack_58 = *(undefined8 *)(param_1 + 0x75b8);
    local_60 = *(undefined8 *)(param_1 + 0x75b0);
    local_50 = *(undefined8 *)(param_1 + 0x75c0);
    lVar2 = ZSTD_createDDict_advanced(param_2,param_3,0,0,&local_60);
    *(long *)(param_1 + 0x75e8) = lVar2;
    if (lVar2 == 0) {
      uVar3 = 0xffffffffffffffc0;
      goto LAB_00bb2534;
    }
    *(long *)(param_1 + 0x75f0) = lVar2;
    *(undefined4 *)(param_1 + 0x7600) = 0xffffffff;
  }
  uVar3 = 5;
  if (*(int *)(param_1 + 0x7598) != 0) {
    uVar3 = 1;
  }
LAB_00bb2534:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

