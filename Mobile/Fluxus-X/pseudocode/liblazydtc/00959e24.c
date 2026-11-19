/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00959e24
 */

void FUN_00959e24(undefined8 param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4)

{
  long lVar1;
  int iVar2;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_48 = *param_3;
  local_40 = *param_2;
  iVar2 = FUN_00923334(&PTR_LAB_00c502e0,param_1,0x10,&local_48,0x10,&local_58);
  if (iVar2 == 0) {
    param_4[1] = uStack_50;
    *param_4 = local_58;
    param_4[2] = *param_2;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

