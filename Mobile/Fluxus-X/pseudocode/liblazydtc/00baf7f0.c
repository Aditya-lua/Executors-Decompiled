/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baf7f0
 */

int FUN_00baf7f0(int param_1,char *param_2,int param_3)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  undefined *__s2;
  size_t __n;
  undefined1 auStack_540 [64];
  undefined1 auStack_500 [1000];
  undefined1 auStack_118 [204];
  undefined2 local_4c;
  undefined2 local_4a;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  memset(auStack_500,0x61,1000);
  if (param_1 != 0) {
    printf("  %s long KAT test ",param_2);
  }
  memset(auStack_118,0,0xd0);
  uVar1 = param_3 - 1;
  if (uVar1 < 4) {
    local_4c = (undefined2)(0x4000300020001c >> ((ulong)uVar1 << 4 & 0x3f));
    local_4a = (undefined2)(0x48006800880090 >> ((ulong)uVar1 << 4 & 0x3f));
    memset(auStack_118,0,0xcc);
  }
  else if (param_1 != 0) {
    printf("setup failed\n ");
  }
  iVar3 = 1000;
  do {
    mbedtls_sha3_update(auStack_118,auStack_500,1000);
    iVar3 = iVar3 + -1;
  } while (iVar3 != 0);
  iVar3 = mbedtls_sha3_finish(auStack_118,auStack_540,0x40);
  if (iVar3 != 0) {
    if (param_1 != 0) {
      printf("finish error code: %d\n",iVar3);
    }
    goto LAB_00baf99c;
  }
  switch(uVar1) {
  case 0:
    __s2 = &DAT_00788e88;
    __n = 0x1c;
    break;
  case 1:
    __s2 = &DAT_00788ea4;
    __n = 0x20;
    break;
  case 2:
    __s2 = &DAT_00788ec4;
    __n = 0x30;
    break;
  case 3:
    __s2 = &DAT_00788ef4;
    __n = 0x40;
    break;
  default:
    iVar3 = 0;
    if (param_1 == 0) goto LAB_00baf99c;
    goto LAB_00baf990;
  }
  iVar3 = memcmp(auStack_540,__s2,__n);
  if ((param_1 != 0) && (iVar3 != 0)) {
    puts("failed");
  }
  if (param_1 != 0) {
LAB_00baf990:
    puts("passed");
  }
LAB_00baf99c:
  mbedtls_platform_zeroize(auStack_118,0xd0);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

