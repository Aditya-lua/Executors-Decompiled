/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69908
 */

void mbedtls_base64_self_test(int param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 auStack_b0 [8];
  undefined1 auStack_a8 [128];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (param_1 != 0) {
    printf("  Base64 encoding test: ");
  }
  iVar2 = mbedtls_base64_encode(auStack_a8,0x80,auStack_b0,&DAT_0077c7bb,0x40);
  if ((iVar2 == 0) &&
     (iVar2 = memcmp("JEhuVodiWr2/F9mixBcaAZTtjx4Rs9cJDLbpEG8i7hPKswcFdsn6MWwINP+Nwmw4AEPpVJevUEvRQbqVMVoLlw=="
                     ,auStack_a8,0x58), iVar2 == 0)) {
    if (param_1 != 0) {
      printf("passed\n  Base64 decoding test: ");
    }
    iVar2 = mbedtls_base64_decode
                      (auStack_a8,0x80,auStack_b0,
                       "JEhuVodiWr2/F9mixBcaAZTtjx4Rs9cJDLbpEG8i7hPKswcFdsn6MWwINP+Nwmw4AEPpVJevUEvRQbqVMVoLlw=="
                       ,0x58);
    if ((iVar2 == 0) && (iVar2 = memcmp(&DAT_0077c7bb,auStack_a8,0x40), iVar2 == 0)) {
      if (param_1 != 0) {
        puts("passed\n");
      }
      uVar3 = 0;
      goto LAB_00b699cc;
    }
  }
  if (param_1 != 0) {
    puts("failed");
  }
  uVar3 = 1;
LAB_00b699cc:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

