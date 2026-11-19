/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008363c8
 */

void FUN_008363c8(undefined8 param_1,undefined8 param_2,ulong *param_3)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((char)param_3[2] == '\x01') {
    *(undefined1 *)(param_3 + 2) = 0;
    param_3[1] = param_3[1] ^ 0x4509d34b5f0f115b;
    *param_3 = *param_3 ^ 0x4509d34b5f0f115b;
  }
  FUN_008ac76c(param_1,param_2,param_3,0,0);
  puVar2 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = *puVar2;
  FUN_00807f14(&DAT_00d1d9c0,&local_40,&local_40);
  local_40 = param_2;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xffffd8ee,param_3);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

