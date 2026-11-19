/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ba968
 */

void FUN_008ba968(undefined8 param_1,long param_2,uint param_3,int param_4)

{
  void *__src;
  long lVar1;
  byte bVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  void *__dest;
  long lVar6;
  undefined8 *puVar7;
  double *pdVar8;
  uint uVar9;
  long lVar10;
  ulong uVar11;
  undefined4 *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  double *pdVar17;
  uint uVar18;
  ulong uVar19;
  long lVar20;
  uint uVar21;
  undefined8 uVar22;
  double dVar23;
  double local_78;
  undefined4 local_70;
  uint local_6c;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if ((0x4000000 < (int)param_3) || (0x4000000 < param_4)) {
LAB_008bad70:
    if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"table overflow");
    }
    goto LAB_008bae40;
  }
  uVar15 = (ulong)param_3;
  if (param_4 == 0) {
    uVar18 = 0;
    uVar19 = 0;
  }
  else {
    iVar5 = FUN_008b91dc(param_4 + -1);
    if (0x19 < iVar5) goto LAB_008bad70;
    uVar18 = iVar5 + 1;
    uVar19 = (ulong)(uint)(1 << (ulong)(uVar18 & 0x1f));
  }
  __src = *(void **)(param_2 + 0x20);
  lVar1 = *(long *)(param_2 + 0x28);
  uVar3 = *(uint *)(param_2 + 8);
  lVar20 = (long)(int)uVar3;
  bVar2 = *(byte *)(param_2 + 5);
  __dest = __src;
  if (param_3 != uVar3) {
    if ((int)param_3 < 0) {
      if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_008b75fc(param_1);
      }
      goto LAB_008bae40;
    }
    __dest = (void *)FUN_008b7610(param_1,uVar15 << 4,*(undefined1 *)(param_2 + 1));
    if ((int)param_3 < (int)uVar3) {
      if (param_3 != 0) {
        memcpy(__dest,__src,uVar15 << 4);
      }
    }
    else {
      if (uVar3 != 0) {
        memcpy(__dest,__src,lVar20 << 4);
      }
      if ((int)uVar3 < (int)param_3) {
        uVar11 = uVar15 - lVar20;
        lVar6 = lVar20;
        if (1 < uVar11) {
          uVar13 = uVar11 & 0xfffffffffffffffe;
          lVar6 = uVar13 + lVar20;
          puVar12 = (undefined4 *)((long)__dest + lVar20 * 0x10 + 0x1c);
          uVar14 = uVar13;
          do {
            uVar14 = uVar14 - 2;
            puVar12[-4] = 0;
            *puVar12 = 0;
            puVar12 = puVar12 + 8;
          } while (uVar14 != 0);
          if (uVar11 == uVar13) goto LAB_008baabc;
        }
        lVar10 = uVar15 - lVar6;
        uVar11 = lVar6 << 4 | 0xc;
        do {
          lVar10 = lVar10 + -1;
          *(undefined4 *)((long)__dest + uVar11) = 0;
          uVar11 = uVar11 + 0x10;
        } while (lVar10 != 0);
      }
    }
  }
LAB_008baabc:
  if (((DAT_00d1fc90 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1fc90), iVar5 != 0)) {
                    /* try { // try from 008bada8 to 008badab has its CatchHandler @ 008bae14 */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  iVar5 = (int)uVar19;
  if (iVar5 == 0) {
    lVar6 = (long)&DWORD_007f3700 + DAT_00d1fc88;
  }
  else {
    if (__src == __dest) {
      lVar6 = FUN_008b7610(param_1,uVar19 << 5,*(undefined1 *)(param_2 + 1));
    }
    else {
      lVar6 = FUN_008b777c();
      if (lVar6 == 0) {
        if (*(long *)(lVar4 + 0x28) == local_68) {
          FUN_008b7a9c(param_1,__dest,-(ulong)(param_3 >> 0x1f) & 0xfffffff000000000 | uVar15 << 4,
                       *(undefined1 *)(param_2 + 1));
                    /* WARNING: Subroutine does not return */
          FUN_008b3f9c(param_1,4);
        }
        goto LAB_008bae40;
      }
    }
    if (iVar5 == 1) {
      uVar11 = 0;
    }
    else {
      uVar11 = uVar19 & 0x7ffffffe;
      puVar12 = (undefined4 *)(lVar6 + 0x2c);
      uVar15 = uVar11;
      do {
        uVar15 = uVar15 - 2;
        puVar12[-4] = 0;
        puVar12[4] = 0;
        puVar12[-8] = 0;
        *puVar12 = 0;
        puVar12 = puVar12 + 0x10;
      } while (uVar15 != 0);
      if (uVar11 == uVar19) goto LAB_008babac;
    }
    lVar10 = uVar19 - uVar11;
    puVar12 = (undefined4 *)(lVar6 + uVar11 * 0x20 + 0x1c);
    do {
      *puVar12 = 0;
      lVar10 = lVar10 + -1;
      puVar12[-4] = 0;
      puVar12 = puVar12 + 8;
    } while (lVar10 != 0);
  }
LAB_008babac:
  *(char *)(param_2 + 5) = (char)uVar18;
  *(void **)(param_2 + 0x20) = __dest;
  *(long *)(param_2 + 0x28) = lVar6;
  *(uint *)(param_2 + 8) = param_3;
  *(int *)(param_2 + 0xc) = iVar5;
  *(byte *)(param_2 + 4) = ~(byte)(-1 << (ulong)(uVar18 & 0x1f));
  if ((int)param_3 < (int)uVar3) {
    puVar16 = (undefined8 *)((long)__src + (long)(int)param_3 * 0x10);
    uVar18 = param_3;
    uVar9 = param_3;
    do {
      uVar18 = uVar18 + 1;
      if (*(int *)((long)puVar16 + 0xc) == 0) {
        uVar21 = uVar18;
      }
      else {
        local_78 = (double)(int)uVar18;
        uVar21 = uVar9 + 1;
        local_6c = 3;
        puVar7 = (undefined8 *)FUN_008bd898(param_1,param_2,&local_78,0);
        uVar22 = *puVar16;
        puVar7[1] = puVar16[1];
        *puVar7 = uVar22;
      }
      uVar9 = uVar9 + 1;
      puVar16 = puVar16 + 2;
    } while (uVar21 != uVar3);
  }
  uVar18 = 1 << (ulong)(bVar2 & 0x1f);
  if (bVar2 != 0x1f) {
    iVar5 = uVar18 + 1;
    pdVar17 = (double *)(lVar1 + (ulong)(uVar18 - 1) * 0x20 + 0x10);
    do {
      if (*(int *)((long)pdVar17 + -4) != 0) {
        local_70 = *(undefined4 *)(pdVar17 + 1);
        local_78 = *pdVar17;
        local_6c = *(uint *)((long)pdVar17 + 0xc) & 0xf;
        pdVar8 = (double *)FUN_008bd898(param_1,param_2,&local_78,1);
        dVar23 = pdVar17[-2];
        pdVar8[1] = pdVar17[-1];
        *pdVar8 = dVar23;
      }
      iVar5 = iVar5 + -1;
      pdVar17 = pdVar17 + -4;
    } while (1 < iVar5);
  }
  if (param_3 != uVar3) {
    FUN_008b7a9c(param_1,__src,lVar20 << 4,*(undefined1 *)(param_2 + 1));
  }
  if (((DAT_00d1fc90 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1fc90), iVar5 != 0)) {
                    /* try { // try from 008badd8 to 008baddb has its CatchHandler @ 008bae10 */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  if (lVar1 == (long)&DWORD_007f3700 + DAT_00d1fc88) {
    if (*(long *)(lVar4 + 0x28) == local_68) {
      return;
    }
  }
  else if (*(long *)(lVar4 + 0x28) == local_68) {
    FUN_008b7a9c(param_1,lVar1,-(ulong)(uVar18 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar18 << 5,
                 *(undefined1 *)(param_2 + 1));
    return;
  }
LAB_008bae40:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

