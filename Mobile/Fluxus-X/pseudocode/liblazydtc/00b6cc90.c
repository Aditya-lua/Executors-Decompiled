/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6cc90
 */

undefined8
mbedtls_chacha20_crypt
          (undefined8 *param_1,undefined4 *param_2,undefined4 param_3,undefined8 param_4,
          undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined4 local_c0;
  undefined4 uStack_bc;
  undefined4 local_b8;
  undefined4 local_b4;
  undefined1 auStack_b0 [64];
  undefined8 local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  mbedtls_platform_zeroize(&local_f0,0x40);
  mbedtls_platform_zeroize(auStack_b0,0x40);
  local_70 = 0x40;
  uStack_e8 = 0x6b20657479622d32;
  local_f0 = 0x3320646e61707865;
  uStack_d8 = param_1[1];
  local_e0 = *param_1;
  uStack_c8 = param_1[3];
  local_d0 = param_1[2];
  uStack_bc = *param_2;
  local_b8 = param_2[1];
  local_b4 = param_2[2];
  local_c0 = param_3;
  mbedtls_platform_zeroize(auStack_b0,0x40);
  local_70 = 0x40;
  mbedtls_chacha20_update(&local_f0,param_4,param_5,param_6);
  mbedtls_platform_zeroize(&local_f0,0x88);
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

