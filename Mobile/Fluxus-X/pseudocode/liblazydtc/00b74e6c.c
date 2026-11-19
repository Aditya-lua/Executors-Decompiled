/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b74e6c
 */

undefined8 mbedtls_des3_set2key_dec(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  undefined8 auStack_2c8 [16];
  undefined8 auStack_248 [16];
  undefined8 local_1c8 [15];
  undefined4 local_150 [2];
  undefined8 local_148 [16];
  undefined8 local_c8 [16];
  long local_48;
  
  lVar7 = tpidr_el0;
  local_48 = *(long *)(lVar7 + 0x28);
  mbedtls_des_setkey(local_1c8);
  mbedtls_des_setkey(param_1 + 0x80,param_2 + 8);
  lVar8 = 0;
  uVar9 = 0;
  lVar10 = 0x100;
  do {
    uVar5 = *(undefined4 *)((long)local_150 + lVar8);
    uVar6 = *(undefined4 *)((long)local_150 + lVar8 + 4);
    puVar2 = (undefined4 *)(param_1 + lVar10);
    lVar3 = param_1 + lVar8;
    puVar4 = (undefined8 *)((long)local_1c8 + lVar10);
    puVar2[-0x40] = uVar5;
    puVar2[-0x3f] = uVar6;
    uVar9 = uVar9 + 2;
    lVar8 = lVar8 + -8;
    *(undefined8 *)((long)auStack_248 + lVar10) = *(undefined8 *)(lVar3 + 0xf8);
    puVar1 = (undefined8 *)((long)auStack_2c8 + lVar10);
    lVar10 = lVar10 + 8;
    *puVar4 = *puVar1;
    *puVar2 = uVar5;
    puVar2[1] = uVar6;
  } while (uVar9 < 0x20);
  mbedtls_platform_zeroize(local_1c8,0x180);
  if (*(long *)(lVar7 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

