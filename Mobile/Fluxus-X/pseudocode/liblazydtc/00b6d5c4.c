/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6d5c4
 */

void mbedtls_chachapoly_self_test(int param_1)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  char *pcVar4;
  undefined8 uVar5;
  undefined1 auStack_210 [16];
  undefined1 auStack_200 [200];
  undefined1 auStack_138 [136];
  undefined1 auStack_b0 [80];
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_1 != 0) {
    printf("  ChaCha20-Poly1305 test %u ",0);
  }
  mbedtls_chacha20_init(auStack_138);
  mbedtls_poly1305_init(auStack_b0);
  local_60 = 0;
  uStack_58 = 0;
  local_50 = 0;
  uVar2 = mbedtls_chacha20_setkey(auStack_138,&DAT_0077cfc4);
  if (uVar2 == 0) {
    uVar2 = mbedtls_chachapoly_encrypt_and_tag
                      (auStack_138,0x72,&DAT_0077cfe4,&DAT_0077cff0,0xc,&DAT_0077cffc,auStack_200,
                       auStack_210);
    if (uVar2 == 0) {
      iVar3 = memcmp(auStack_200,&DAT_0077d06e,0x72);
      if (iVar3 == 0) {
        iVar3 = memcmp(auStack_210,&DAT_0077d0e0,0x10);
        if (iVar3 == 0) {
          mbedtls_chacha20_free(auStack_138);
          mbedtls_poly1305_free(auStack_b0);
          local_60 = 0;
          uStack_58 = 0;
          local_50 = 0;
          if (param_1 != 0) {
            puts("passed");
            putchar(10);
          }
          uVar5 = 0;
          goto LAB_00b6d698;
        }
        if (param_1 != 0) {
          pcVar4 = "failure (wrong MAC)";
          goto LAB_00b6d70c;
        }
      }
      else if (param_1 != 0) {
        pcVar4 = "failure (wrong output)";
LAB_00b6d70c:
        puts(pcVar4);
      }
    }
    else if (param_1 != 0) {
      pcVar4 = "crypt_and_tag() error code: %i\n";
      goto LAB_00b6d690;
    }
  }
  else if (param_1 != 0) {
    pcVar4 = "setkey() error code: %i\n";
LAB_00b6d690:
    printf(pcVar4,(ulong)uVar2);
  }
  uVar5 = 0xffffffff;
LAB_00b6d698:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

