/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b762e0
 */

int FUN_00b762e0(long param_1,undefined1 param_2,undefined1 *param_3,ulong param_4)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 local_8c;
  undefined1 local_8b;
  undefined1 auStack_88 [64];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (0x40 < param_4) {
    uVar3 = mbedtls_md_info_from_type(0xb);
    iVar2 = mbedtls_md(uVar3,param_3,param_4,auStack_88);
    if (iVar2 != 0) goto LAB_00b763b4;
    param_4 = 0x40;
    param_3 = auStack_88;
  }
  local_8b = (undefined1)param_4;
  local_8c = param_2;
  if (*(int *)(param_1 + 0x18) == 0) {
    uVar3 = mbedtls_md_info_from_type(0xb);
    iVar2 = mbedtls_md_setup(param_1,uVar3,0);
    if (iVar2 != 0) goto LAB_00b763b4;
    iVar2 = mbedtls_md_starts(param_1);
    if (iVar2 != 0) goto LAB_00b763b4;
    *(undefined4 *)(param_1 + 0x18) = 1;
  }
  iVar2 = mbedtls_md_update(param_1,&local_8c,2);
  if (iVar2 == 0) {
    iVar2 = mbedtls_md_update(param_1,param_3,param_4);
  }
LAB_00b763b4:
  mbedtls_platform_zeroize(auStack_88,0x40);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

