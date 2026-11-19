/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00814304
 */

void FUN_00814304(undefined8 param_1,undefined8 param_2,ulong *param_3,ulong *param_4)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (*(char *)((long)param_3 + 10) == '\x01') {
    *(undefined1 *)((long)param_3 + 10) = 0;
    *(byte *)(param_3 + 1) = (byte)param_3[1] ^ 0x5d;
    *(byte *)((long)param_3 + 9) = *(byte *)((long)param_3 + 9) ^ 0x3d;
    *param_3 = *param_3 ^ 0xdf9dcd6daf0d3d5d;
  }
  if (*(char *)((long)param_4 + 0xb) == '\x01') {
    *(undefined1 *)((long)param_4 + 0xb) = 0;
    *(byte *)(param_4 + 1) = (byte)param_4[1] ^ 0x5d;
    *(byte *)((long)param_4 + 9) = *(byte *)((long)param_4 + 9) ^ 0x3d;
    *(byte *)((long)param_4 + 10) = *(byte *)((long)param_4 + 10) ^ 0xd;
    *param_4 = *param_4 ^ 0xdf9dcd6daf0d3d5d;
  }
  FUN_008ac76c(param_1,param_2,param_3,0,0);
  puVar2 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = *puVar2;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = param_2;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,param_3);
  FUN_008ac76c(param_1,param_2,param_4,0,0);
  puVar2 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = *puVar2;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = param_2;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,param_4);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

