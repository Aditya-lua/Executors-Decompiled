/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0704
 */

void mbedtls_ecjpake_read_round_one(undefined4 *param_1,long param_2,long param_3)

{
  undefined4 uVar1;
  undefined4 uVar2;
  long lVar3;
  uint uVar4;
  ulong uVar5;
  undefined *puVar6;
  long local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uVar1 = param_1[0x33];
  uVar2 = *param_1;
  param_3 = param_2 + param_3;
  puVar6 = (&PTR_s_client_00cab448)[1 - param_1[0x32]];
  local_60 = param_2;
  uVar5 = FUN_00ba0b44(uVar2,param_1 + 2,uVar1,param_1 + 0x10,param_1 + 0x4c,puVar6,&local_60,
                       param_3);
  if ((int)uVar5 == 0) {
    uVar4 = FUN_00ba0b44(uVar2,param_1 + 2,uVar1,param_1 + 0x10,param_1 + 0x58,puVar6,&local_60,
                         param_3);
    if (local_60 != param_3 && uVar4 == 0) {
      uVar4 = 0xffffb080;
    }
    uVar5 = (ulong)uVar4;
  }
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

