/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8c80
 */

int mbedtls_rsa_self_test(int param_1)

{
  long lVar1;
  undefined1 *puVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  long lVar8;
  undefined1 auStack_230 [16];
  undefined1 auStack_220 [8];
  ulong local_218;
  undefined1 auStack_210 [16];
  undefined1 auStack_200 [16];
  undefined1 auStack_1f0 [16];
  undefined1 auStack_1e0 [16];
  undefined1 auStack_1d0 [16];
  undefined1 auStack_1c0 [16];
  undefined1 auStack_1b0 [16];
  undefined1 auStack_1a0 [96];
  int local_140;
  int local_13c;
  size_t local_138;
  undefined1 auStack_12c [20];
  undefined2 local_118 [64];
  undefined1 auStack_98 [24];
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_230);
  memset(auStack_220,0,0xe8);
  iVar3 = mbedtls_mpi_read_string
                    (auStack_230,0x10,
                     "9292758453063D803DD603D5E777D7888ED1D5BF35786190FA2F23EBC0848AEADDA92CA6C3D80B32C4D109BE0F36D6AE7130B9CED7ACDF54CFC7555AC14EEBAB93A89813FBF3C4F8066D2D800F7C38A81AE31942917403FF4946B0A83D3D3E05EE57C6F5F5606FB5D4BC6CD34EE0801A5E94BB77B07507233A0BC7BAC8F90F79"
                    );
  if (iVar3 == 0) {
    iVar3 = mbedtls_mpi_copy(auStack_210,auStack_230);
    if (iVar3 == 0) {
      local_218 = mbedtls_mpi_size(auStack_210);
    }
    else {
      iVar3 = iVar3 + -0x4080;
      if (iVar3 != 0) goto LAB_00ba8ce8;
    }
    iVar3 = mbedtls_mpi_read_string
                      (auStack_230,0x10,
                       "C36D0EB7FCD285223CFB5AABA5BDA3D82C01CAD19EA484A87EA4377637E75500FCB2005C5C7DD6EC4AC023CDA285D796C3D9E75E1EFC42488BB4F1D13AC30A57"
                      );
    if (iVar3 == 0) {
      iVar3 = mbedtls_mpi_copy(auStack_1e0,auStack_230);
      if (((iVar3 == 0) || (iVar3 = iVar3 + -0x4080, iVar3 == 0)) &&
         (iVar3 = mbedtls_mpi_read_string
                            (auStack_230,0x10,
                             "C000DF51A7C77AE8D7C7370C1FF55B69E211C2B9E5DB1ED0BF61D0D9899620F4910E4168387E3C30AA1E00C339A795088452DD96A9A5EA5D9DCA68DA636032AF"
                            ), iVar3 == 0)) {
        iVar3 = mbedtls_mpi_copy(auStack_1d0,auStack_230);
        if (((iVar3 == 0) || (iVar3 = iVar3 + -0x4080, iVar3 == 0)) &&
           (iVar3 = mbedtls_mpi_read_string
                              (auStack_230,0x10,
                               "24BF6185468786FDD303083D25E64EFC66CA472BC44D253102F8B4A9D3BFA75091386C0077937FE33FA3252D28855837AE1B484A8A9A45F7EE8C0C634F99E8CDDF79C5CE07EE72C7F123142198164234CABB724CF78B8173B9F880FC86322407AF1FEDFDDE2BEB674CA15F3E81A1521E071513A1E85B5DFA031F21ECAE91A34D"
                              ), iVar3 == 0)) {
          iVar3 = mbedtls_mpi_copy(auStack_1f0,auStack_230);
          if (((iVar3 == 0) || (iVar3 = iVar3 + -0x4080, iVar3 == 0)) &&
             (iVar3 = mbedtls_mpi_read_string(auStack_230,0x10,"10001"), iVar3 == 0)) {
            iVar3 = mbedtls_mpi_copy(auStack_200,auStack_230);
            if (((iVar3 == 0) || (iVar3 = iVar3 + -0x4080, iVar3 == 0)) &&
               (iVar3 = mbedtls_rsa_complete(auStack_220), iVar3 == 0)) {
              if (param_1 != 0) {
                printf("  RSA key validation: ");
              }
              iVar3 = mbedtls_rsa_check_pubkey(auStack_220);
              if (((iVar3 == 0) && (iVar3 = mbedtls_rsa_check_pubkey(auStack_220), iVar3 == 0)) &&
                 ((iVar3 = FUN_00ba6554(auStack_220,1), iVar3 == 0 &&
                  ((iVar3 = mbedtls_rsa_validate_params
                                      (auStack_210,auStack_1e0,auStack_1d0,auStack_1f0,auStack_200,0
                                       ,0), iVar3 == 0 &&
                   (iVar3 = mbedtls_rsa_validate_crt
                                      (auStack_1e0,auStack_1d0,auStack_1f0,auStack_1c0,auStack_1b0,
                                       auStack_1a0), iVar3 == 0)))))) {
                if (param_1 != 0) {
                  printf("passed\n  PKCS#1 encryption : ");
                }
                local_70 = 0xddddddddddcc0c0b;
                uStack_78 = 0xa332211ffffffff;
                local_80 = 0xff00010203ccbbaa;
                if (local_140 == 1) {
                  iVar3 = mbedtls_rsa_rsaes_oaep_encrypt
                                    (auStack_220,FUN_00ba91cc,0,0,0,0x18,&local_80,local_118);
                }
                else {
                  if ((local_140 != 0) || (local_218 < 0x23)) goto LAB_00ba8eec;
                  lVar8 = local_218 - 0x1b;
                  local_118[0] = 0x200;
                  puVar2 = (undefined1 *)((ulong)local_118 | 2);
                  do {
                    puVar7 = puVar2;
                    lVar8 = lVar8 + -1;
                    iVar3 = -100;
                    while( true ) {
                      uVar4 = rand();
                      *puVar7 = (char)uVar4;
                      if ((uVar4 & 0xff) != 0) break;
                      iVar3 = iVar3 + 1;
                      if (iVar3 == 0) goto LAB_00ba8eec;
                    }
                    puVar2 = puVar7 + 1;
                  } while (lVar8 != 0);
                  puVar7[1] = 0;
                  *(undefined8 *)(puVar7 + 0x12) = local_70;
                  *(undefined8 *)(puVar7 + 10) = uStack_78;
                  *(undefined8 *)(puVar7 + 2) = local_80;
                  iVar3 = mbedtls_rsa_public(auStack_220,local_118,local_118);
                }
                if (iVar3 == 0) {
                  if (param_1 != 0) {
                    printf("passed\n  PKCS#1 decryption : ");
                  }
                  if (local_140 == 1) {
                    iVar3 = mbedtls_rsa_rsaes_oaep_decrypt
                                      (auStack_220,FUN_00ba91cc,0,0,0,&local_138,local_118,
                                       auStack_98,0x18);
                  }
                  else {
                    if (local_140 != 0) goto LAB_00ba8eec;
                    iVar3 = mbedtls_rsa_rsaes_pkcs1_v15_decrypt
                                      (auStack_220,FUN_00ba91cc,0,&local_138,local_118,auStack_98,
                                       0x18);
                  }
                  if ((iVar3 == 0) && (iVar3 = memcmp(auStack_98,&local_80,local_138), iVar3 == 0))
                  {
                    if (param_1 != 0) {
                      puts("passed");
                      printf("  PKCS#1 data sign  : ");
                    }
                    uVar6 = mbedtls_md_info_from_type(5);
                    uVar5 = mbedtls_md(uVar6,&local_80,0x18,auStack_12c);
                    if ((int)uVar5 != 0) {
                      if (param_1 == 0) {
                        iVar3 = 1;
                      }
                      else {
                        uVar4 = puts("failed");
                        uVar5 = (ulong)uVar4;
                        iVar3 = 1;
                      }
                      goto LAB_00ba8cf8;
                    }
                    if (local_140 == 1) {
                      iVar3 = FUN_00ba8060(auStack_220,FUN_00ba91cc,0,5,0x14,auStack_12c,0xffffffff,
                                           local_118);
                    }
                    else {
                      if (local_140 != 0) goto LAB_00ba8eec;
                      iVar3 = mbedtls_rsa_rsassa_pkcs1_v15_sign
                                        (auStack_220,FUN_00ba91cc,0,5,0x14,auStack_12c,local_118);
                    }
                    if (iVar3 == 0) {
                      if (param_1 != 0) {
                        printf("passed\n  PKCS#1 sig. verify: ");
                      }
                      if (local_140 == 1) {
                        iVar3 = 5;
                        if (local_13c != 0) {
                          iVar3 = local_13c;
                        }
                        iVar3 = mbedtls_rsa_rsassa_pss_verify_ext
                                          (auStack_220,5,0x14,auStack_12c,iVar3,0xffffffff,local_118
                                          );
                      }
                      else {
                        if (local_140 != 0) goto LAB_00ba8eec;
                        iVar3 = mbedtls_rsa_rsassa_pkcs1_v15_verify
                                          (auStack_220,5,0x14,auStack_12c,local_118);
                      }
                      if (iVar3 == 0) {
                        if (param_1 != 0) {
                          puts("passed");
                          putchar(10);
                        }
                        iVar3 = 0;
                        goto LAB_00ba8ce8;
                      }
                    }
                  }
                }
              }
LAB_00ba8eec:
              if (param_1 != 0) {
                puts("failed");
              }
              iVar3 = 1;
            }
          }
        }
      }
    }
  }
LAB_00ba8ce8:
  mbedtls_mpi_free(auStack_230);
  uVar5 = mbedtls_rsa_free(auStack_220);
LAB_00ba8cf8:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return iVar3;
}

