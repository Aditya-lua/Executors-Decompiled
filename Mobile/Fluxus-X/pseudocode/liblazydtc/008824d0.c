/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008824d0
 */

void FUN_008824d0(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined1 local_9c [16];
  undefined1 local_8c;
  undefined1 local_88 [16];
  undefined1 local_78;
  undefined1 local_74 [16];
  undefined1 local_64;
  undefined1 local_60 [16];
  undefined1 local_50;
  undefined1 local_4c [16];
  undefined1 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_b0 = 0;
  uStack_a8 = 0;
  local_4c[0] = 0;
  local_3c = 0;
  local_c0 = 0;
  uStack_b8 = 0;
  local_d0 = 0;
  uStack_c8 = 0;
  FUN_00850b3c(param_1,&local_b0,0,0,"boolean",local_4c,&local_c0,0,&local_d0,0);
  local_b0 = 0;
  uStack_a8 = 0;
  local_60[0] = 0;
  local_50 = 0;
  local_c0 = 0;
  uStack_b8 = 0;
  local_d0 = 0;
  uStack_c8 = 0;
  FUN_00850b3c(param_1 + 0x78,&local_b0,0,0,"number",local_60,&local_c0,0,&local_d0,0);
  local_b0 = 0;
  uStack_a8 = 0;
  local_74[0] = 0;
  local_64 = 0;
  local_c0 = 0;
  uStack_b8 = 0;
  local_d0 = 0;
  uStack_c8 = 0;
  FUN_00850b3c(param_1 + 0xf0,&local_b0,0,0,"string",local_74,&local_c0,0,&local_d0,0);
  local_b0 = 0;
  uStack_a8 = 0;
  local_88[0] = 0;
  local_78 = 0;
  local_c0 = 0;
  uStack_b8 = 0;
  local_d0 = 0;
  uStack_c8 = 0;
  FUN_00850b3c(param_1 + 0x168,&local_b0,0,0,"vector",local_88,&local_c0,0,&local_d0,0);
  local_b0 = 0;
  uStack_a8 = 0;
  local_9c[0] = 0;
  local_8c = 0;
  local_c0 = 0;
  uStack_b8 = 0;
  local_d0 = 0;
  uStack_c8 = 0;
  FUN_00850b3c(param_1 + 0x1e0,&local_b0,0,0,param_2,local_9c,&local_c0,0,&local_d0,0);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

