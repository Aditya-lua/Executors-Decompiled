/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b754
 */

undefined8 mbedtls_poly1305_mac(ulong *param_1,long param_2,ulong param_3,undefined8 param_4)

{
  long lVar1;
  ulong uVar2;
  ulong local_a0;
  ulong uStack_98;
  ulong local_90;
  ulong uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined4 local_70;
  undefined1 auStack_6c [20];
  size_t local_58;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  mbedtls_platform_zeroize(&local_a0,0x50);
  local_a0 = *param_1 & 0xffffffc0fffffff;
  uStack_98 = param_1[1] & 0xffffffc0ffffffc;
  uStack_88 = param_1[3];
  local_90 = param_1[2];
  local_80 = 0;
  uStack_78 = 0;
  local_70 = 0;
  mbedtls_platform_zeroize(auStack_6c,0x10);
  local_58 = 0;
  if (param_3 != 0) {
    if (param_3 < 0x10) {
      uVar2 = 0;
    }
    else {
      FUN_00b7b534(&local_a0,param_3 >> 4,param_2,1);
      if ((param_3 & 0xf) == 0) goto LAB_00b7b81c;
      uVar2 = param_3 & 0xfffffffffffffff0;
      param_3 = param_3 & 0xf;
    }
    local_58 = param_3;
    memcpy(auStack_6c,(void *)(param_2 + uVar2),param_3);
  }
LAB_00b7b81c:
  mbedtls_poly1305_finish(&local_a0,param_4);
  mbedtls_platform_zeroize(&local_a0,0x50);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

