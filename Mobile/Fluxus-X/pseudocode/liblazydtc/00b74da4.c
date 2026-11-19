/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b74da4
 */

undefined8 mbedtls_des3_set2key_enc(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  undefined4 auStack_2c8 [64];
  undefined4 local_1c8 [32];
  undefined1 auStack_148 [120];
  undefined8 local_d0;
  undefined4 local_c8 [32];
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  mbedtls_des_setkey();
  mbedtls_des_setkey(auStack_148,param_2 + 8);
  lVar6 = 0;
  uVar7 = 0;
  lVar8 = 0x100;
  do {
    uVar2 = *(undefined4 *)(param_1 + lVar6 + 0x78);
    uVar3 = *(undefined4 *)(param_1 + lVar6 + 0x7c);
    puVar1 = (undefined8 *)(param_1 + lVar8);
    *(undefined4 *)((long)auStack_2c8 + lVar8) = uVar2;
    *(undefined4 *)((long)auStack_2c8 + lVar8 + 4) = uVar3;
    lVar5 = lVar6 + 0x78;
    uVar7 = uVar7 + 2;
    lVar6 = lVar6 + -8;
    puVar1[-0x10] = *(undefined8 *)(auStack_148 + lVar5);
    *puVar1 = puVar1[-0x20];
    *(undefined4 *)((long)local_1c8 + lVar8) = uVar2;
    *(undefined4 *)((long)local_1c8 + lVar8 + 4) = uVar3;
    lVar8 = lVar8 + 8;
  } while (uVar7 < 0x20);
  mbedtls_platform_zeroize(local_1c8,0x180);
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

