/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b75008
 */

undefined8 mbedtls_des3_set3key_dec(long param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  undefined8 auStack_2c8 [32];
  undefined8 auStack_1c8 [16];
  undefined8 local_148 [16];
  undefined1 auStack_c8 [128];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  mbedtls_des_setkey(auStack_1c8);
  mbedtls_des_setkey(param_1 + 0x80,param_2 + 8);
  mbedtls_des_setkey(auStack_c8,param_2 + 0x10);
  lVar3 = 0;
  uVar4 = 0;
  lVar5 = 0x178;
  do {
    puVar1 = (undefined8 *)(param_1 + lVar3);
    uVar4 = uVar4 + 2;
    *puVar1 = *(undefined8 *)((long)auStack_1c8 + lVar5);
    *(undefined8 *)((long)local_148 + lVar3) = *(undefined8 *)(param_1 + lVar5 + -0x80);
    lVar3 = lVar3 + 8;
    puVar1[0x20] = *(undefined8 *)((long)auStack_2c8 + lVar5);
    lVar5 = lVar5 + -8;
  } while (uVar4 < 0x20);
  mbedtls_platform_zeroize(auStack_1c8,0x180);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

