/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98038
 */

int mbedtls_psa_aead_decrypt
              (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
              long param_9,ulong param_10,undefined8 param_11,ulong param_12,long *param_13)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  int local_220;
  byte local_21a;
  byte local_219;
  undefined1 auStack_218 [424];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  memset(&local_220,0,0x1b0);
  iVar3 = FUN_00b97e00(&local_220,param_1,param_2,param_4);
  if (iVar3 == 0) {
    uVar5 = (ulong)local_219;
    if (param_10 < uVar5) {
      iVar3 = -0x87;
    }
    else {
      uVar4 = param_10 - uVar5;
      if (param_12 < uVar4) {
        iVar3 = -0x8a;
      }
      else {
        lVar1 = param_9 + uVar4;
        if (local_220 == 0x5100500) {
          if (local_219 != 0x10) {
            iVar3 = -0x86;
            goto LAB_00b981c0;
          }
          mbedtls_chachapoly_auth_decrypt
                    (auStack_218,uVar4,param_5,param_7,param_8,lVar1,param_9,param_11);
        }
        else if (local_220 == 0x5500200) {
          mbedtls_gcm_auth_decrypt
                    (auStack_218,uVar4,param_5,param_6,param_7,param_8,lVar1,uVar5,param_9,param_11)
          ;
        }
        else {
          if (local_220 != 0x5500100) {
            iVar3 = -0x86;
            goto LAB_00b9823c;
          }
          mbedtls_ccm_auth_decrypt
                    (auStack_218,uVar4,param_5,param_6,param_7,param_8,param_9,param_11,lVar1,uVar5)
          ;
        }
        iVar3 = mbedtls_to_psa_error();
        if (iVar3 == 0) {
          *param_13 = param_10 - local_219;
        }
      }
    }
  }
LAB_00b981c0:
  if (local_220 == 0x5100500) {
    mbedtls_chachapoly_free(auStack_218);
  }
  else if (local_220 == 0x5500200) {
    mbedtls_gcm_free(auStack_218);
  }
  else if (local_220 == 0x5500100) {
    mbedtls_ccm_free(auStack_218);
  }
  local_21a = local_21a & 0xfe;
  if (iVar3 == 0) {
    *param_13 = param_10 - local_219;
  }
LAB_00b9823c:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

