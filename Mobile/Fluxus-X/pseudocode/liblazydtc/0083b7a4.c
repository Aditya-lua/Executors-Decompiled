/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083b7a4
 */

void FUN_0083b7a4(undefined8 param_1,undefined8 param_2,ulong *param_3,undefined8 param_4)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (*(char *)((long)param_3 + 0xc) == '\x01') {
    *(undefined1 *)((long)param_3 + 0xc) = 0;
    *param_3 = *param_3 ^ 0x5f937352d2b3ba9;
    *(uint *)(param_3 + 1) = (uint)param_3[1] ^ 0x2d2b3ba9;
  }
  FUN_0083f6d4(param_4);
  FUN_008ac76c(param_1,param_2,param_3,0,0);
  puVar2 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = *puVar2;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = param_2;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,param_3);
  FUN_008ac76c(param_1,param_2,param_4,0,0);
  puVar2 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = *puVar2;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = param_2;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,param_4);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

