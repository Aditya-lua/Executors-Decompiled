/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b88a80
 */

void FUN_00b88a80(undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                 long param_5,ulong param_6,ulong *param_7,int param_8)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  undefined4 uVar5;
  ulong uVar6;
  byte local_64 [4];
  long local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar5 = 0x800;
  if (param_8 != 0) {
    uVar5 = 0x400;
  }
  local_64[0] = 0;
  iVar3 = FUN_00b86e5c(param_1,&local_60,uVar5,param_2);
  if ((iVar3 == 0) && (iVar3 = FUN_00b91284(param_2,local_60,local_64), iVar3 == 0)) {
    if (param_6 < local_64[0]) {
      iVar3 = -0x8a;
      goto LAB_00b88b54;
    }
    if (0xff < *(uint *)(local_60 + 4)) {
      iVar3 = -0x87;
      goto LAB_00b88b54;
    }
    iVar3 = mbedtls_psa_mac_compute
                      (local_60,*(undefined8 *)(local_60 + 0x28),*(undefined8 *)(local_60 + 0x30),
                       param_2,param_3,param_4,param_5,(ulong)local_64[0],param_7);
    if (iVar3 == 0) {
      bVar2 = true;
      goto joined_r0x00b88b64;
    }
    bVar2 = false;
  }
  else {
LAB_00b88b54:
    bVar2 = iVar3 == 0;
  }
  *param_7 = param_6;
  local_64[0] = 0;
joined_r0x00b88b64:
  if (param_6 != 0) {
    uVar6 = *param_7;
    if (!bVar2) {
      uVar6 = 0;
    }
    memset((void *)(param_5 + uVar6),0x21,param_6 - uVar6);
  }
  iVar4 = psa_unregister_read_under_mutex(local_60);
  if (!bVar2) {
    iVar4 = iVar3;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar4);
  }
  return;
}

