/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b95a00
 */

ulong FUN_00b95a00(long param_1,long *param_2,ulong param_3)

{
  long *plVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  void *__ptr;
  long lVar5;
  void *pvVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (param_3 < 2) {
    uVar4 = FUN_00b93e20(param_1,*param_2);
    if (*(long *)(lVar2 + 0x28) == local_68) {
      return uVar4;
    }
  }
  else {
    __ptr = calloc(param_3,0x10);
    if (__ptr == (void *)0x0) {
      uVar4 = 0xffffb280;
    }
    else {
      mbedtls_mpi_init(auStack_78);
      pvVar6 = __ptr;
      uVar4 = param_3;
      do {
        uVar4 = uVar4 - 1;
        mbedtls_mpi_init(pvVar6);
        pvVar6 = (void *)((long)pvVar6 + 0x10);
      } while (uVar4 != 0);
      uVar3 = mbedtls_mpi_copy(__ptr,*param_2 + 0x20);
      uVar4 = (ulong)uVar3;
      if (uVar3 == 0) {
        if (1 < param_3) {
          uVar8 = 1;
          pvVar6 = __ptr;
          do {
            uVar3 = FUN_00b953d4(param_1,(void *)((long)pvVar6 + 0x10),pvVar6,param_2[uVar8] + 0x20)
            ;
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) goto LAB_00b95b0c;
            uVar8 = uVar8 + 1;
            pvVar6 = (void *)((long)pvVar6 + 0x10);
          } while (uVar8 < param_3);
        }
        lVar5 = (long)__ptr + param_3 * 0x10 + -0x10;
        uVar3 = mbedtls_mpi_inv_mod(lVar5,lVar5,param_1 + 8);
        uVar4 = (ulong)uVar3;
        if (uVar3 == 0) {
          lVar7 = param_3 * 8;
          lVar9 = (long)__ptr + param_3 * 0x10 + -0x20;
          lVar5 = -param_3;
          do {
            lVar5 = lVar5 + 1;
            lVar7 = lVar7 + -8;
            if (lVar5 == 0) {
              uVar3 = mbedtls_mpi_copy(auStack_78,__ptr);
              plVar1 = param_2;
            }
            else {
              uVar3 = FUN_00b953d4(param_1,auStack_78,lVar9 + 0x10,lVar9);
              uVar4 = (ulong)uVar3;
              if (uVar3 != 0) break;
              plVar1 = (long *)((long)param_2 + lVar7);
              uVar3 = FUN_00b953d4(param_1,lVar9,lVar9 + 0x10,*plVar1 + 0x20);
            }
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = FUN_00b953d4(param_1,*plVar1 + 0x10,*plVar1 + 0x10,auStack_78);
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = FUN_00b953d4(param_1,auStack_78,auStack_78,auStack_78);
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = FUN_00b953d4(param_1,*plVar1,*plVar1,auStack_78);
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = FUN_00b953d4(param_1,*plVar1 + 0x10,*plVar1 + 0x10,auStack_78);
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = mbedtls_mpi_shrink(*plVar1,*(undefined2 *)(param_1 + 0x12));
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = mbedtls_mpi_shrink(*plVar1 + 0x10,*(undefined2 *)(param_1 + 0x12));
            uVar4 = (ulong)uVar3;
            if (uVar3 != 0) break;
            uVar3 = mbedtls_mpi_lset(*plVar1 + 0x20,1);
            uVar4 = (ulong)uVar3;
            if ((lVar5 == 0) || (lVar9 = lVar9 + -0x10, uVar3 != 0)) break;
          } while( true );
        }
      }
LAB_00b95b0c:
      mbedtls_mpi_free(auStack_78);
      pvVar6 = __ptr;
      do {
        param_3 = param_3 - 1;
        mbedtls_mpi_free(pvVar6);
        pvVar6 = (void *)((long)pvVar6 + 0x10);
      } while (param_3 != 0);
      free(__ptr);
    }
    if (*(long *)(lVar2 + 0x28) == local_68) {
      return uVar4;
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

