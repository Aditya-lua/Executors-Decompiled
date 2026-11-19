/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c200
 */

int mbedtls_hmac_drbg_update(undefined8 *param_1,long param_2,long param_3)

{
  byte bVar1;
  char cVar2;
  long lVar3;
  undefined1 uVar4;
  int iVar5;
  byte bVar6;
  undefined8 *puVar7;
  char local_ac [4];
  undefined1 auStack_a8 [64];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  puVar7 = param_1 + 3;
  uVar4 = mbedtls_md_get_size(*param_1);
  bVar6 = 1;
  if (param_2 != 0 && param_3 != 0) {
    bVar6 = 2;
  }
  local_ac[0] = '\0';
  do {
    iVar5 = mbedtls_md_hmac_reset(param_1);
    if (iVar5 != 0) goto LAB_00b9c338;
    iVar5 = mbedtls_md_hmac_update(param_1,puVar7,uVar4);
    if (iVar5 != 0) goto LAB_00b9c338;
    iVar5 = mbedtls_md_hmac_update(param_1,local_ac,1);
    if (iVar5 != 0) goto LAB_00b9c338;
    if (param_2 != 0 && param_3 != 0) {
      iVar5 = mbedtls_md_hmac_update(param_1,param_2,param_3);
      if (iVar5 != 0) goto LAB_00b9c338;
    }
    iVar5 = mbedtls_md_hmac_finish(param_1,auStack_a8);
    if (iVar5 != 0) goto LAB_00b9c338;
    iVar5 = mbedtls_md_hmac_starts(param_1,auStack_a8,uVar4);
    if (iVar5 != 0) goto LAB_00b9c338;
    iVar5 = mbedtls_md_hmac_update(param_1,puVar7,uVar4);
    if (iVar5 != 0) goto LAB_00b9c338;
    iVar5 = mbedtls_md_hmac_finish(param_1,puVar7);
    if (iVar5 != 0) goto LAB_00b9c338;
    cVar2 = local_ac[0] + '\x01';
    bVar1 = local_ac[0] + 1;
    local_ac[0] = cVar2;
  } while (bVar1 < bVar6);
  iVar5 = 0;
LAB_00b9c338:
  mbedtls_platform_zeroize(auStack_a8,0x40);
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

