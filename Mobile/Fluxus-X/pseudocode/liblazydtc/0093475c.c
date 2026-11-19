/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093475c
 */

int FUN_0093475c(int *param_1,uint param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  ushort uVar3;
  long lVar4;
  int iVar5;
  int iVar6;
  timeval *ptVar7;
  int *piVar8;
  undefined4 *puVar9;
  ushort *puVar10;
  ulong uVar11;
  uint uVar12;
  ulong uVar13;
  undefined1 auStack_200 [16];
  fd_set fStack_1f0;
  fd_set fStack_170;
  fd_set fStack_f0;
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  if ((param_1 != (int *)0x0) && (param_2 != 0)) {
    uVar12 = 0;
    piVar8 = param_1;
    do {
      if (*piVar8 != -1) {
        memset(&fStack_f0,0,0x80);
        memset(&fStack_170,0,0x80);
        memset(&fStack_1f0,0,0x80);
        uVar13 = 0;
        uVar11 = (ulong)param_2;
        puVar10 = (ushort *)(param_1 + 1);
        uVar12 = 0xffffffff;
        goto LAB_0093486c;
      }
      uVar12 = uVar12 + 1;
      piVar8 = piVar8 + 2;
    } while (uVar12 < param_2);
  }
  iVar6 = 0;
  if (param_3 != 0) {
    if (param_3 < 0) {
      puVar9 = (undefined4 *)__errno();
LAB_00934a10:
      *puVar9 = 0x16;
      iVar6 = -1;
    }
    else {
      ptVar7 = (timeval *)FUN_00941c68(&fStack_f0,param_3);
      iVar5 = select(0,(fd_set *)0x0,(fd_set *)0x0,(fd_set *)0x0,ptVar7);
      iVar6 = 0;
      if (iVar5 != 0) {
        if (iVar5 == -1) {
          piVar8 = (int *)__errno();
          iVar6 = 0;
          if (*piVar8 == 4) goto LAB_00934a1c;
        }
        iVar6 = -1;
      }
    }
  }
  goto LAB_00934a1c;
LAB_0093486c:
  do {
    uVar2 = *(uint *)(puVar10 + -2);
    puVar10[1] = 0;
    if (uVar2 != 0xffffffff) {
      if (0x3ff < uVar2) {
        puVar9 = (undefined4 *)__errno();
        goto LAB_00934a10;
      }
      uVar3 = *puVar10;
      if ((uVar3 & 0x1c7) != 0) {
        uVar1 = uVar2;
        if ((int)uVar2 <= (int)uVar12) {
          uVar1 = uVar12;
        }
        if ((uVar3 & 0x41) != 0) {
          __FD_SET_chk(uVar2,&fStack_f0,0x80);
          uVar3 = *puVar10;
        }
        if ((uVar3 & 0x104) != 0) {
          __FD_SET_chk(*(int *)(puVar10 + -2),&fStack_170,0x80);
          uVar3 = *puVar10;
        }
        uVar12 = uVar1;
        if ((uVar3 & 0x82) != 0) {
          __FD_SET_chk(*(int *)(puVar10 + -2),&fStack_1f0,0x80);
        }
      }
    }
    uVar13 = uVar13 + 1;
    puVar10 = puVar10 + 4;
  } while (uVar13 < uVar11);
  ptVar7 = (timeval *)FUN_00941c68(auStack_200,param_3);
  iVar6 = select(uVar12 + 1,&fStack_f0,&fStack_170,&fStack_1f0,ptVar7);
  if (iVar6 < 1) {
    if (iVar6 == -1) {
      piVar8 = (int *)__errno();
      iVar6 = -(uint)(*piVar8 != 4);
    }
  }
  else {
    iVar6 = 0;
    puVar10 = (ushort *)((long)param_1 + 6);
    do {
      *puVar10 = 0;
      if (*(int *)(puVar10 + -3) != -1) {
        iVar5 = __FD_ISSET_chk(*(int *)(puVar10 + -3),&fStack_f0,0x80);
        if (iVar5 != 0) {
          if ((puVar10[-1] >> 6 & 1) != 0) {
            *puVar10 = *puVar10 | 0x40;
          }
          if ((puVar10[-1] & 1) != 0) {
            *puVar10 = *puVar10 | 1;
          }
        }
        iVar5 = __FD_ISSET_chk(*(undefined4 *)(puVar10 + -3),&fStack_170,0x80);
        if (iVar5 != 0) {
          if ((puVar10[-1] >> 8 & 1) != 0) {
            *puVar10 = *puVar10 | 0x100;
          }
          if ((puVar10[-1] >> 2 & 1) != 0) {
            *puVar10 = *puVar10 | 4;
          }
        }
        iVar5 = __FD_ISSET_chk(*(undefined4 *)(puVar10 + -3),&fStack_1f0,0x80);
        if (iVar5 != 0) {
          if ((puVar10[-1] >> 7 & 1) != 0) {
            *puVar10 = *puVar10 | 0x80;
          }
          if ((puVar10[-1] >> 1 & 1) != 0) {
            *puVar10 = *puVar10 | 2;
          }
        }
        if (*puVar10 != 0) {
          iVar6 = iVar6 + 1;
        }
      }
      uVar11 = uVar11 - 1;
      puVar10 = puVar10 + 4;
    } while (uVar11 != 0);
  }
LAB_00934a1c:
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

