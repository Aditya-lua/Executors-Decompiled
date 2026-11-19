/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b97bcc
 */

int mbedtls_psa_aead_encrypt
              (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
              undefined8 param_9,long param_10,long param_11,ulong param_12,long *param_13)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  int local_218;
  byte local_212;
  byte local_211;
  undefined1 auStack_210 [424];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  memset(&local_218,0,0x1b0);
  iVar3 = FUN_00b97e00(&local_218,param_1,param_2,param_4);
  if (iVar3 == 0) {
    uVar4 = (ulong)local_211;
    if (param_12 < uVar4 + param_10) {
      iVar3 = -0x8a;
    }
    else {
      lVar1 = param_11 + param_10;
      if (local_218 == 0x5100500) {
        if (local_211 != 0x10) {
          iVar3 = -0x86;
          goto LAB_00b97d5c;
        }
        mbedtls_chachapoly_encrypt_and_tag
                  (auStack_210,param_10,param_5,param_7,param_8,param_9,param_11,lVar1);
      }
      else if (local_218 == 0x5500200) {
        mbedtls_gcm_crypt_and_tag
                  (auStack_210,1,param_10,param_5,param_6,param_7,param_8,param_9,param_11,uVar4,
                   lVar1);
      }
      else {
        if (local_218 != 0x5500100) {
          iVar3 = -0x86;
          goto LAB_00b97dc8;
        }
        mbedtls_ccm_encrypt_and_tag
                  (auStack_210,param_10,param_5,param_6,param_7,param_8,param_9,param_11,lVar1,uVar4
                  );
      }
      iVar3 = mbedtls_to_psa_error();
      if (iVar3 == 0) {
        *param_13 = (ulong)local_211 + param_10;
      }
    }
  }
LAB_00b97d5c:
  if (local_218 == 0x5100500) {
    mbedtls_chachapoly_free(auStack_210);
  }
  else if (local_218 == 0x5500200) {
    mbedtls_gcm_free(auStack_210);
  }
  else if (local_218 == 0x5500100) {
    mbedtls_ccm_free(auStack_210);
  }
  local_212 = local_212 & 0xfe;
LAB_00b97dc8:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

