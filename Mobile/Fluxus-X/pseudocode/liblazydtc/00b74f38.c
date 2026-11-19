/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b74f38
 */

undefined8 mbedtls_des3_set3key_enc(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  undefined8 auStack_248 [16];
  undefined8 local_1c8 [16];
  undefined1 auStack_148 [128];
  undefined8 local_c8 [16];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  mbedtls_des_setkey();
  mbedtls_des_setkey(auStack_148,param_2 + 8);
  mbedtls_des_setkey(param_1 + 0x100,param_2 + 0x10);
  uVar5 = 0;
  lVar6 = 0x178;
  lVar4 = 0;
  do {
    puVar2 = (undefined8 *)(param_1 + lVar6);
    uVar5 = uVar5 + 2;
    *(undefined8 *)((long)local_1c8 + lVar4) = *puVar2;
    puVar1 = (undefined8 *)((long)auStack_248 + lVar6);
    lVar6 = lVar6 + -8;
    *(undefined8 *)(param_1 + lVar4 + 0x80) = *puVar1;
    *(undefined8 *)((long)local_c8 + lVar4) = puVar2[-0x20];
    lVar4 = lVar4 + 8;
  } while (uVar5 < 0x20);
  mbedtls_platform_zeroize(local_1c8,0x180);
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

