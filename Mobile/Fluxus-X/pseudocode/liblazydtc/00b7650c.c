/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7650c
 */

int mbedtls_entropy_func(long param_1,void *param_2,ulong param_3)

{
  long lVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong uVar10;
  int *piVar11;
  uint uVar12;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (0x40 < param_3) {
    iVar4 = -0x3c;
    goto LAB_00b766f8;
  }
  uVar12 = 0;
LAB_00b765d0:
  do {
    if (0x100 < uVar12) {
      iVar4 = -0x3c;
      goto LAB_00b766ec;
    }
    iVar4 = FUN_00b76400(param_1);
    if (iVar4 != 0) goto LAB_00b766ec;
    uVar12 = uVar12 + 1;
    if (*(int *)(param_1 + 0x1c) < 1) {
      uVar6 = 0;
    }
    else {
      lVar9 = 0;
      uVar6 = 0;
      piVar11 = (int *)(param_1 + 0x40);
      bVar3 = true;
      do {
        uVar7 = *(ulong *)(piVar11 + -4);
        lVar9 = lVar9 + 1;
        bVar2 = false;
        if (*(ulong *)(piVar11 + -2) <= uVar7) {
          bVar2 = bVar3;
        }
        if (*piVar11 != 1) {
          uVar7 = 0;
        }
        uVar6 = uVar7 + uVar6;
        piVar11 = piVar11 + 10;
        bVar3 = bVar2;
      } while (lVar9 < *(int *)(param_1 + 0x1c));
      if (!bVar2) goto LAB_00b765d0;
    }
  } while (uVar6 < 0x40);
  uStack_60 = 0;
  local_68 = 0;
  uStack_70 = 0;
  local_78 = 0;
  uStack_80 = 0;
  local_88 = 0;
  uStack_90 = 0;
  local_98 = 0;
  iVar4 = mbedtls_md_finish(param_1,&local_98);
  if (iVar4 == 0) {
    mbedtls_md_free(param_1);
    mbedtls_md_init(param_1);
    uVar5 = mbedtls_md_info_from_type(0xb);
    iVar4 = mbedtls_md_setup(param_1,uVar5,0);
    if (iVar4 == 0) {
      iVar4 = mbedtls_md_starts(param_1);
      if (iVar4 == 0) {
        iVar4 = mbedtls_md_update(param_1,&local_98,0x40);
        if (iVar4 == 0) {
          uVar5 = mbedtls_md_info_from_type(0xb);
          iVar4 = mbedtls_md(uVar5,&local_98,0x40,&local_98);
          if (iVar4 == 0) {
            iVar4 = *(int *)(param_1 + 0x1c);
            uVar6 = (ulong)iVar4;
            if (0 < iVar4) {
              uVar7 = 0;
              if (iVar4 != 1) {
                uVar7 = uVar6 & 0xfffffffffffffffe;
                puVar8 = (undefined8 *)(param_1 + 0x58);
                uVar10 = uVar7;
                do {
                  puVar8[-5] = 0;
                  *puVar8 = 0;
                  uVar10 = uVar10 - 2;
                  puVar8 = puVar8 + 10;
                } while (uVar10 != 0);
                if (uVar7 == uVar6) goto LAB_00b766d8;
              }
              puVar8 = (undefined8 *)(param_1 + uVar7 * 0x28 + 0x30);
              do {
                uVar7 = uVar7 + 1;
                *puVar8 = 0;
                puVar8 = puVar8 + 5;
              } while ((long)uVar7 < (long)uVar6);
            }
LAB_00b766d8:
            memcpy(param_2,&local_98,param_3);
            iVar4 = 0;
          }
        }
      }
    }
  }
LAB_00b766ec:
  mbedtls_platform_zeroize(&local_98,0x40);
LAB_00b766f8:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

