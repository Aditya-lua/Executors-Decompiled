/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cab38
 */

void FUN_008cab38(undefined8 param_1,undefined8 *param_2,long param_3,undefined8 param_4,
                 undefined8 param_5)

{
  long lVar1;
  undefined8 local_78;
  undefined8 *puStack_70;
  long local_68;
  undefined8 local_60;
  long local_58;
  long local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 *local_38;
  ulong uStack_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_40 = 0;
  uStack_30 = (ulong)*(uint *)(param_2[0xe] + (long)*(int *)(param_3 + 0x98) * 4);
  local_60 = 0;
  local_78 = 0;
  local_58 = 0;
  local_50 = 0;
                    /* try { // try from 008cab8c to 008cabab has its CatchHandler @ 008cabec */
  puStack_70 = param_2;
  local_68 = param_3;
  local_48 = param_1;
  local_38 = param_2;
  FUN_008c9360(param_1,param_3,*(undefined1 *)((long)param_2 + 0x39),
               *(undefined1 *)((long)param_2 + 0x3a),(long)param_2 + 0x3b,&local_48,&local_78,
               param_4,param_5,*param_2,&uStack_30);
  if (local_58 != 0) {
                    /* try { // try from 008cabc0 to 008cabc7 has its CatchHandler @ 008cabe8 */
    FUN_008b7a9c(local_60,local_58,local_50 << 3,0);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

