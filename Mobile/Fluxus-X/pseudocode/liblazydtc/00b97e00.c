/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b97e00
 */

void FUN_00b97e00(undefined4 *param_1,ushort *param_2,undefined8 param_3,uint param_4)

{
  uint uVar1;
  ushort uVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  ulong local_58;
  undefined1 auStack_50 [4];
  undefined4 local_4c;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  local_58 = (ulong)param_2[1];
  uVar5 = mbedtls_cipher_values_from_psa(param_4,*param_2,&local_58,auStack_50,&local_4c);
  if ((int)uVar5 != 0) goto LAB_00b97e58;
  uVar1 = param_4 & 0xffc07fff;
  if (uVar1 == 0x5000500) {
    *param_1 = 0x5100500;
    if (param_4 != 0x5100500) {
LAB_00b97f3c:
      uVar5 = 0xffffff7a;
      goto LAB_00b97e58;
    }
    mbedtls_chachapoly_init(param_1 + 2);
    mbedtls_chachapoly_setkey(param_1 + 2,param_3);
    uVar5 = mbedtls_to_psa_error();
    iVar4 = (int)uVar5;
  }
  else if (uVar1 == 0x5400200) {
    *param_1 = 0x5500200;
    if ((*param_2 & 0x7700) != 0x2400) {
LAB_00b97fac:
      uVar5 = 0xffffff79;
      goto LAB_00b97e58;
    }
    mbedtls_gcm_init(param_1 + 2);
    mbedtls_gcm_setkey(param_1 + 2,local_4c,param_3,local_58 & 0xffffffff);
    uVar5 = mbedtls_to_psa_error();
    iVar4 = (int)uVar5;
  }
  else {
    if (uVar1 != 0x5400100) goto LAB_00b97f3c;
    *param_1 = 0x5500100;
    if ((*param_2 & 0x7700) != 0x2400) goto LAB_00b97fac;
    mbedtls_ccm_init(param_1 + 2);
    mbedtls_ccm_setkey(param_1 + 2,local_4c,param_3,local_58 & 0xffffffff);
    uVar5 = mbedtls_to_psa_error();
    iVar4 = (int)uVar5;
  }
  if (iVar4 == 0) {
    uVar2 = *param_2;
    uVar5 = 0;
    *(byte *)((long)param_1 + 7) = (byte)(param_4 >> 0x10) & 0x3f;
    *(ushort *)(param_1 + 1) = uVar2;
  }
LAB_00b97e58:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

