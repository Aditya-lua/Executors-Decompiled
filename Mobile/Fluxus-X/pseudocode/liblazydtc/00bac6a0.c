/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bac6a0
 */

undefined4 mbedtls_sha1_self_test(int param_1)

{
  uint uVar1;
  size_t __n;
  long lVar2;
  int iVar3;
  uint uVar4;
  undefined4 uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  ulong uVar10;
  undefined1 *puVar11;
  undefined8 local_4e0;
  undefined8 uStack_4d8;
  undefined8 local_4d0;
  undefined4 local_4c8;
  undefined1 auStack_4c4 [64];
  undefined1 auStack_484 [20];
  undefined1 auStack_470 [1024];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  memset(&local_4e0,0,0x5c);
  uVar10 = 0;
  while( true ) {
    if (param_1 != 0) {
      printf("  SHA-1 test #%d: ",(int)uVar10 + 1);
    }
    local_4d0 = 0x1032547698badcfe;
    uStack_4d8 = 0xefcdab8967452301;
    local_4e0 = 0;
    local_4c8 = 0xc3d2e1f0;
    if (uVar10 == 2) {
      memset(auStack_470,0x61,1000);
      iVar3 = 0;
      uVar4 = 0;
      while( true ) {
        uVar1 = uVar4 & 0x3f;
        if (0xfffffc17 < uVar4) {
          local_4e0._4_4_ = local_4e0._4_4_ + 1;
        }
        local_4e0 = CONCAT44(local_4e0._4_4_,uVar4 + 1000);
        if (uVar1 == 0) {
          puVar11 = auStack_470;
          uVar7 = 1000;
        }
        else {
          uVar7 = (ulong)(0x40 - uVar1);
          memcpy(auStack_4c4 + uVar1,auStack_470,uVar7);
          mbedtls_internal_sha1_process(&local_4e0,auStack_4c4);
          puVar11 = auStack_470 + uVar7;
          uVar7 = 1000 - uVar7;
        }
        uVar9 = uVar7 - 0x40;
        uVar6 = uVar9 & 0xffffffffffffffc0;
        puVar8 = puVar11;
        do {
          mbedtls_internal_sha1_process(&local_4e0,puVar8);
          uVar7 = uVar7 - 0x40;
          puVar8 = puVar8 + 0x40;
        } while (0x3f < uVar7);
        __n = uVar9 - uVar6;
        if (__n != 0) {
          memcpy(auStack_4c4,puVar11 + uVar6 + 0x40,__n);
        }
        iVar3 = iVar3 + 1;
        if (iVar3 == 1000) break;
        uVar4 = (uint)local_4e0;
      }
    }
    else {
      local_4e0 = (&DAT_00788488)[uVar10] & 0xffffffff;
      memcpy(auStack_4c4,&DAT_007883d8 + uVar10 * 0x39,(&DAT_00788488)[uVar10]);
    }
    mbedtls_sha1_finish(&local_4e0,auStack_484);
    iVar3 = memcmp(auStack_484,&DAT_007884a0 + uVar10 * 0x14,0x14);
    if (iVar3 != 0) break;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar10 = uVar10 + 1;
    if (2 < uVar10) {
      uVar5 = 0;
      if (param_1 != 0) {
        putchar(10);
        uVar5 = 0;
      }
LAB_00bac8c0:
      mbedtls_platform_zeroize(&local_4e0,0x5c);
      if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return uVar5;
    }
  }
  if (param_1 != 0) {
    puts("failed");
  }
  uVar5 = 1;
  goto LAB_00bac8c0;
}

