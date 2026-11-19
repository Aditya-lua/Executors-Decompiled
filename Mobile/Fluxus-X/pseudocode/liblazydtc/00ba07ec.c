/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba07ec
 */

void mbedtls_ecjpake_write_round_one
               (undefined4 *param_1,ulong param_2,long param_3,long *param_4,undefined8 param_5,
               undefined8 param_6)

{
  undefined4 *puVar1;
  undefined4 *puVar2;
  undefined4 *puVar3;
  ulong uVar4;
  uint uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  long lVar8;
  ulong uVar9;
  undefined8 uVar10;
  undefined *puVar11;
  ulong local_78;
  long local_70;
  long local_68;
  
  lVar8 = tpidr_el0;
  local_68 = *(long *)(lVar8 + 0x28);
  uVar7 = *param_1;
  uVar5 = param_1[0x32];
  uVar6 = param_1[0x33];
  local_78 = param_2;
  if (-1 < param_3) {
    puVar1 = param_1 + 2;
    puVar2 = param_1 + 0x10;
    puVar3 = param_1 + 0x34;
    uVar10 = mbedtls_ecp_gen_keypair_base(puVar1,puVar2,param_1 + 0x70,puVar3,param_5,param_6);
    if (((int)uVar10 != 0) ||
       (uVar10 = mbedtls_ecp_tls_write_point(puVar1,puVar3,uVar6,&local_70,param_2,param_3),
       (int)uVar10 != 0)) goto LAB_00ba08f0;
    puVar11 = (&PTR_s_client_00cab448)[uVar5];
    uVar4 = param_2 + param_3;
    local_78 = param_2 + local_70;
    uVar10 = FUN_00ba1078(uVar7,puVar1,uVar6,puVar2,param_1 + 0x70,puVar3,puVar11,&local_78,uVar4,
                          param_5,param_6);
    uVar9 = local_78;
    if ((int)uVar10 != 0) goto LAB_00ba08f0;
    if (local_78 <= uVar4) {
      puVar3 = param_1 + 0x40;
      uVar10 = mbedtls_ecp_gen_keypair_base(puVar1,puVar2,param_1 + 0x74,puVar3,param_5,param_6);
      if (((int)uVar10 == 0) &&
         (uVar10 = mbedtls_ecp_tls_write_point(puVar1,puVar3,uVar6,&local_70,uVar9,uVar4 - uVar9),
         (int)uVar10 == 0)) {
        local_78 = uVar9 + local_70;
        uVar10 = FUN_00ba1078(uVar7,puVar1,uVar6,puVar2,param_1 + 0x74,puVar3,puVar11,&local_78,
                              uVar4,param_5,param_6);
        if ((int)uVar10 == 0) {
          *param_4 = local_78 - param_2;
        }
      }
      goto LAB_00ba08f0;
    }
  }
  uVar10 = 0xffffb100;
LAB_00ba08f0:
  if (*(long *)(lVar8 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar10);
  }
  return;
}

