/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baf5c8
 */

int FUN_00baf5c8(int param_1,char *param_2,int param_3,int param_4)

{
  long lVar1;
  int param3;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 auStack_178 [64];
  undefined1 auStack_138 [204];
  undefined2 local_6c;
  undefined2 local_6a;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  lVar5 = (long)param_4;
  memset(auStack_138,0,0xd0);
  uVar2 = param_3 - 1;
  if (uVar2 < 4) {
    uVar4 = *(undefined8 *)(&DAT_0029c740 + (long)param_4 * 8);
    local_6c = (undefined2)(0x4000300020001c >> ((ulong)uVar2 << 4 & 0x3f));
    local_6a = (undefined2)(0x48006800880090 >> ((ulong)uVar2 << 4 & 0x3f));
    memset(auStack_138,0,0xcc);
    mbedtls_sha3_update(auStack_138,&UNK_00788d28 + lVar5 * 4,uVar4);
    param3 = mbedtls_sha3_finish(auStack_138,auStack_178,0x40);
  }
  else {
    param3 = -0x76;
  }
  uVar3 = mbedtls_platform_zeroize(auStack_138,0xd0);
  if (param3 != 0) {
    if (param_1 != 0) {
      uVar2 = printf("  %s test %d error code: %d\n",param_2,param_4,param3);
      uVar3 = (ulong)uVar2;
    }
    goto LAB_00baf798;
  }
  switch(uVar2) {
  case 0:
    uVar2 = memcmp(auStack_178,&UNK_00788d30 + lVar5 * 0x1c,0x1c);
    uVar3 = (ulong)uVar2;
    if (uVar2 == 0) goto switchD_00baf6f8_default;
    goto LAB_00baf740;
  case 1:
    uVar2 = memcmp(auStack_178,&UNK_00788d68 + lVar5 * 0x20,0x20);
    break;
  case 2:
    uVar2 = memcmp(auStack_178,&UNK_00788da8 + lVar5 * 0x30,0x30);
    break;
  case 3:
    uVar2 = memcmp(auStack_178,&UNK_00788e08 + lVar5 * 0x40,0x40);
    break;
  default:
    goto switchD_00baf6f8_default;
  }
  uVar3 = (ulong)uVar2;
  if (uVar2 == 0) {
switchD_00baf6f8_default:
    if (param_1 != 0) {
      uVar2 = printf("  %s test %d passed\n",param_2,param_4);
      uVar3 = (ulong)uVar2;
    }
    param3 = 0;
  }
  else {
LAB_00baf740:
    if (param_1 != 0) {
      uVar2 = printf("  %s test %d failed\n",param_2,param_4);
      uVar3 = (ulong)uVar2;
    }
    param3 = -1;
  }
LAB_00baf798:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return param3;
}

