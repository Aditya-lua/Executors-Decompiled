/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ede4
 */

void mbedtls_aes_crypt_cbc
               (undefined8 param_1,uint param_2,ulong param_3,ulong *param_4,ulong *param_5,
               ulong *param_6)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong uVar7;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  if (1 < param_2) {
    uVar2 = 0xffffffdf;
    goto LAB_00b6eef4;
  }
  if (param_3 != 0) {
    if ((param_3 & 0xf) != 0) {
      uVar2 = 0xffffffde;
      goto LAB_00b6eef4;
    }
    if (param_2 != 0) {
      puVar4 = param_4;
      do {
        puVar5 = param_6;
        *puVar5 = *puVar4 ^ *param_5;
        puVar5[1] = puVar4[1] ^ param_5[1];
        mbedtls_internal_aes_encrypt(param_1,puVar5,puVar5);
        param_3 = param_3 - 0x10;
        param_5 = param_5 + 2;
        puVar4 = puVar5;
        param_6 = puVar5 + 2;
      } while (param_3 != 0);
      uVar6 = *puVar5;
      uVar2 = 0;
      param_4[1] = puVar5[1];
      *param_4 = uVar6;
      goto LAB_00b6eef4;
    }
    do {
      uVar7 = param_5[1];
      uVar6 = *param_5;
      mbedtls_internal_aes_decrypt(param_1,param_5,param_6);
      param_5 = param_5 + 2;
      param_3 = param_3 - 0x10;
      *param_6 = *param_4 ^ *param_6;
      param_6[1] = param_4[1] ^ param_6[1];
      param_6 = param_6 + 2;
      param_4[1] = uVar7;
      *param_4 = uVar6;
    } while (param_3 != 0);
  }
  uVar2 = 0;
LAB_00b6eef4:
  if (*(long *)(lVar1 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

