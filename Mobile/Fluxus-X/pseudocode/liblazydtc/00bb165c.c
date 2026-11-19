/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb165c
 */

void FUN_00bb165c(long param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  long lVar1;
  undefined4 uVar2;
  long lVar3;
  undefined4 local_88;
  undefined4 uStack_84;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  lVar3 = *(long *)(param_1 + 0x176e0);
  if (lVar3 != 0) {
    local_88 = 0x2968;
    uStack_68 = 0;
    local_70 = 0;
    uStack_58 = 0;
    uStack_60 = 0;
    uStack_78 = 0;
    local_80 = 0;
    uStack_84 = param_4;
    if (*(long *)(param_1 + 0x75f0) != 0) {
      uVar2 = ZSTD_getDictID_fromDDict(*(long *)(param_1 + 0x75f0));
      local_80 = CONCAT44(local_80._4_4_,uVar2);
      uStack_78 = ZSTD_DDict_dictSize(*(undefined8 *)(param_1 + 0x75f0));
      lVar3 = *(long *)(param_1 + 0x176e0);
      local_80 = CONCAT44(*(undefined4 *)(param_1 + 0x75fc),(undefined4)local_80);
    }
    local_70 = param_2;
    uStack_68 = param_3;
    local_50 = param_1;
    ZSTD_trace_decompress_end(lVar3,&local_88);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

