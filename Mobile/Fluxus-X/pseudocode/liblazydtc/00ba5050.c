/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5050
 */

undefined8 mbedtls_ripemd160_finish(ulong *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  ulong uVar6;
  int *__src;
  undefined *__src_00;
  size_t __n;
  ulong uVar7;
  undefined *puVar8;
  undefined1 *puVar9;
  ulong uVar10;
  ulong uVar11;
  int local_70;
  undefined4 uStack_6c;
  undefined8 local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar2 = (uint)*param_1;
  uVar1 = uVar2 & 0x3f;
  uVar10 = (ulong)uVar1;
  iVar5 = 0x38;
  if (0x37 < uVar1) {
    iVar5 = 0x78;
  }
  local_70 = uVar2 << 3;
  uStack_6c = (undefined4)(*param_1 >> 0x1d);
  uVar3 = iVar5 - uVar1;
  uVar6 = (ulong)uVar3;
  if (uVar3 != 0) {
    *(uint *)param_1 = uVar3 + uVar2;
    if (uVar3 + uVar2 < uVar3) {
      *(uint *)((long)param_1 + 4) = *(uint *)((long)param_1 + 4) + 1;
    }
    __src_00 = &DAT_00787fa0;
    if ((uVar1 != 0) && (uVar7 = (ulong)(0x40 - uVar1), 0x40 - uVar1 <= uVar3)) {
      memcpy((void *)((long)param_1 + 0x1c + uVar10),&DAT_00787fa0,uVar7);
      mbedtls_internal_ripemd160_process(param_1,(uint *)((long)param_1 + 0x1c));
      uVar10 = 0;
      __src_00 = &DAT_00787fa0 + uVar7;
      uVar6 = uVar6 - uVar7;
    }
    uVar7 = uVar6 - 0x40;
    if (0x3f < uVar6) {
      uVar11 = uVar7 & 0xffffffffffffffc0;
      puVar8 = __src_00;
      do {
        mbedtls_internal_ripemd160_process(param_1,puVar8);
        uVar6 = uVar6 - 0x40;
        puVar8 = puVar8 + 0x40;
      } while (0x3f < uVar6);
      __src_00 = __src_00 + uVar11 + 0x40;
      uVar6 = uVar7 - uVar11;
    }
    if (uVar6 != 0) {
      memcpy((void *)((long)param_1 + uVar10 + 0x1c),__src_00,uVar6);
    }
  }
  uVar2 = (uint)*param_1;
  uVar1 = uVar2 & 0x3f;
  uVar10 = (ulong)uVar1;
  *(uint *)param_1 = uVar2 + 8;
  if (0xfffffff7 < uVar2) {
    *(uint *)((long)param_1 + 4) = *(uint *)((long)param_1 + 4) + 1;
  }
  __n = 8;
  __src = &local_70;
  if ((uVar1 != 0) && (uVar6 = (ulong)(0x40 - uVar1), __src = &local_70, 0x40 - uVar1 < 9)) {
    memcpy((void *)((long)param_1 + 0x1c + uVar10),&local_70,uVar6);
    mbedtls_internal_ripemd160_process(param_1,(uint *)((long)param_1 + 0x1c));
    __n = -uVar6 + 8;
    uVar10 = -uVar6 - 0x38;
    __src = (int *)((long)&local_70 + uVar6);
    if (0x3f < __n) {
      uVar6 = uVar10 & 0xffffffffffffffc0;
      puVar9 = (undefined1 *)__src;
      do {
        mbedtls_internal_ripemd160_process(param_1,puVar9);
        __n = __n - 0x40;
        puVar9 = puVar9 + 0x40;
      } while (0x3f < __n);
      __src = (int *)((long)__src + uVar6 + 0x40);
      __n = uVar10 - uVar6;
    }
    uVar10 = 0;
    if (__n == 0) goto LAB_00ba5224;
  }
  memcpy((void *)((long)param_1 + uVar10 + 0x1c),__src,__n);
LAB_00ba5224:
  *param_2 = (uint)param_1[1];
  param_2[1] = *(uint *)((long)param_1 + 0xc);
  param_2[2] = (uint)param_1[2];
  param_2[3] = *(uint *)((long)param_1 + 0x14);
  param_2[4] = (uint)param_1[3];
  if (param_1 != (ulong *)0x0) {
    mbedtls_platform_zeroize(param_1,0x5c);
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

