/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b864
 */

void mbedtls_poly1305_self_test(int param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_1 != 0) {
    printf("  Poly1305 test %u ",0);
  }
  mbedtls_poly1305_mac(&DAT_007802a8,"Cryptographic Forum Research Group",0x22,auStack_58);
  iVar2 = memcmp(auStack_58,&DAT_007803e6,0x10);
  if (iVar2 == 0) {
    if (param_1 != 0) {
      puts("passed");
      printf("  Poly1305 test %u ",1);
    }
    mbedtls_poly1305_mac(&DAT_007802c8,&DAT_00780367,0x7f,auStack_58);
    iVar2 = memcmp(auStack_58,&DAT_007803f6,0x10);
    if (iVar2 == 0) {
      if (param_1 != 0) {
        puts("passed");
        putchar(10);
      }
      uVar3 = 0;
      goto LAB_00b7b93c;
    }
  }
  if (param_1 != 0) {
    puts("failed (mac)");
  }
  uVar3 = 0xffffffff;
LAB_00b7b93c:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

