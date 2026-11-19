/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73e74
 */

void mbedtls_ctr_drbg_seed
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uStack_50 = 0;
  local_58 = 0;
  uStack_60 = 0;
  local_68 = 0;
  uVar3 = *(ulong *)(param_1 + 0x18);
  *(undefined8 *)(param_1 + 0x148) = param_2;
  *(undefined8 *)(param_1 + 0x150) = param_3;
  if (uVar3 == 0) {
    uVar3 = 0x30;
    *(undefined8 *)(param_1 + 0x18) = 0x30;
    iVar2 = *(int *)(param_1 + 0x10);
  }
  else {
    iVar2 = *(int *)(param_1 + 0x10);
  }
  uVar4 = (ulong)iVar2;
  if (iVar2 < 0) {
    uVar4 = 0;
    if (uVar3 < 0x30) {
      uVar4 = uVar3 + 1 >> 1;
    }
  }
  iVar2 = mbedtls_aes_setkey_enc(param_1 + 0x28,&local_68,0x100);
  if (iVar2 == 0) {
    FUN_00b73d28(param_1,param_4,param_5,uVar4);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

