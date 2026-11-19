/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00830738
 */

void FUN_00830738(undefined8 param_1,undefined8 param_2,ulong *param_3)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(char *)((long)param_3 + 0xe) == '\x01') {
    *(undefined1 *)((long)param_3 + 0xe) = 0;
    *(byte *)((long)param_3 + 0xc) = *(byte *)((long)param_3 + 0xc) ^ 0x53;
    *(byte *)((long)param_3 + 0xd) = *(byte *)((long)param_3 + 0xd) ^ 7;
    *param_3 = *param_3 ^ 0xf1e90753b583fb01;
    *(uint *)(param_3 + 1) = (uint)param_3[1] ^ 0xb583fb01;
  }
  FUN_008ac76c(param_1,param_2,param_3,0,0);
  puVar2 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = *puVar2;
  FUN_00807f14(&DAT_00d1d790,&local_40,&local_40);
  local_40 = param_2;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xffffd8ee,param_3);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

