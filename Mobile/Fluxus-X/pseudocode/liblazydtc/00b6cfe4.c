/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6cfe4
 */

int mbedtls_chachapoly_starts(long param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = mbedtls_chacha20_starts(param_1,param_2,0);
  if (iVar2 == 0) {
    uStack_40 = 0;
    local_48 = 0;
    uStack_50 = 0;
    local_58 = 0;
    uStack_60 = 0;
    local_68 = 0;
    uStack_70 = 0;
    local_78 = 0;
    iVar2 = mbedtls_chacha20_update(param_1,0x40,&local_78,&local_78);
    if (iVar2 == 0) {
      iVar2 = mbedtls_poly1305_starts(param_1 + 0x88,&local_78);
      if (iVar2 == 0) {
        *(undefined8 *)(param_1 + 0xd8) = 0;
        *(undefined8 *)(param_1 + 0xe0) = 0;
        *(undefined4 *)(param_1 + 0xe8) = 1;
        *(undefined4 *)(param_1 + 0xec) = param_3;
      }
    }
  }
  mbedtls_platform_zeroize(&local_78,0x40);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

