/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b989f0
 */

void mbedtls_cipher_info_from_psa
               (undefined8 param_1,undefined8 param_2,ulong param_3,undefined4 *param_4)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined4 local_38;
  undefined4 local_34;
  ulong local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_38 = 0;
  local_30 = param_3;
  iVar2 = mbedtls_cipher_values_from_psa(param_1,param_2,&local_30,&local_34,&local_38);
  uVar3 = 0;
  if (iVar2 == 0) {
    if (param_4 != (undefined4 *)0x0) {
      *param_4 = local_38;
    }
    uVar3 = mbedtls_cipher_info_from_values(local_38,local_30 & 0xffffffff,local_34);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

