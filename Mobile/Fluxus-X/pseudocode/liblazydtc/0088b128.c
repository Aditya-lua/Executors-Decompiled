/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088b128
 */

void FUN_0088b128(undefined8 *param_1,long param_2)

{
  uint uVar1;
  ulong uVar2;
  uint uVar3;
  long *plVar4;
  uint uVar5;
  long *__dest;
  long *__src;
  void *pvVar6;
  undefined4 uVar7;
  long lVar8;
  undefined8 uVar9;
  int iVar10;
  long lVar11;
  uint uVar12;
  long *plVar13;
  ulong uVar14;
  size_t __n;
  ulong uVar15;
  long *plVar16;
  long *plVar17;
  int local_a8;
  byte local_a4;
  undefined8 *local_78;
  undefined4 local_70;
  long local_68;
  
  plVar4 = (long *)tpidr_el0;
  local_68 = plVar4[5];
  local_70 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 0088b16c to 0088b177 has its CatchHandler @ 0088b658 */
  local_78 = param_1;
  FUN_00899540(&local_a8,param_1,*(undefined8 *)(param_2 + 0x28),&local_78);
  if (local_a8 == 0) {
    uVar12 = (uint)local_a4;
  }
  else {
    uVar12 = *(uint *)((long)param_1 + 0x64c);
    uVar5 = uVar12 + 1;
    if (0xff < uVar5) {
      if (plVar4[5] == local_68) {
                    /* try { // try from 0088b5b0 to 0088b5c7 has its CatchHandler @ 0088b684 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                     0xff);
      }
      goto LAB_0088b6b4;
    }
    *(uint *)((long)param_1 + 0x64c) = uVar5;
    uVar3 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar5) {
      uVar3 = uVar5;
    }
    *(uint *)(param_1 + 0xca) = uVar3;
  }
  if (*(uint *)(param_2 + 0x20) < 7) {
    if (local_a8 != 0) {
                    /* try { // try from 0088b1c0 to 0088b1d3 has its CatchHandler @ 0088b684 */
      FUN_00892774(param_1,&local_a8,uVar12,0,*(undefined8 *)(param_2 + 0x28));
    }
                    /* try { // try from 0088b1d8 to 0088b1df has its CatchHandler @ 0088b67c */
    uVar5 = FUN_008932d0(param_1,*(undefined8 *)(param_2 + 0x30));
    if (uVar5 < 0x100) {
      if (*(uint *)(param_2 + 0x20) < 7) {
        uVar7 = *(undefined4 *)(&DAT_003644fc + (ulong)*(uint *)(param_2 + 0x20) * 4);
      }
      else {
        uVar7 = 0;
      }
                    /* try { // try from 0088b390 to 0088b39b has its CatchHandler @ 0088b67c */
      FUN_00875b54(*param_1,uVar7,uVar12,uVar12);
    }
    else {
      __n = *(size_t *)(param_2 + 0x30);
                    /* try { // try from 0088b210 to 0088b257 has its CatchHandler @ 0088b680 */
      uVar5 = FUN_0088df20(param_1,__n);
      if ((int)uVar5 < 0) {
        iVar10 = *(int *)((long)param_1 + 0x64c);
        uVar5 = iVar10 + 1;
        plVar16 = plVar4;
        if (0xff < uVar5) {
LAB_0088b5f8:
          if (plVar16[5] == local_68) {
                    /* try { // try from 0088b608 to 0088b61f has its CatchHandler @ 0088b680 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(__n + 0xc,
                         "Out of registers when trying to allocate %d registers: exceeded limit %d",
                         1,0xff);
          }
          goto LAB_0088b6b4;
        }
        *(uint *)((long)param_1 + 0x64c) = uVar5;
        uVar3 = *(uint *)(param_1 + 0xca);
        if (*(uint *)(param_1 + 0xca) <= uVar5) {
          uVar3 = uVar5;
        }
        *(uint *)(param_1 + 0xca) = uVar3;
        uVar5 = FUN_00891438(param_1,__n,iVar10,0xff);
      }
      if (*(uint *)(param_2 + 0x20) < 7) {
        uVar7 = *(undefined4 *)(&DAT_00364518 + (ulong)*(uint *)(param_2 + 0x20) * 4);
      }
      else {
        uVar7 = 0;
      }
                    /* try { // try from 0088b3a4 to 0088b43f has its CatchHandler @ 0088b680 */
      FUN_00875b54(*param_1,uVar7,uVar12,uVar12,uVar5);
      if (local_a8 != 0) {
        FUN_008917fc(param_1,*(undefined8 *)(param_2 + 0x28),uVar12 & 0xff,2,1);
      }
      lVar8 = *(long *)(param_2 + 0x30);
      iVar10 = *(int *)(lVar8 + 8);
      if ((lVar8 == 0) || (iVar10 != DAT_00d1b010)) {
        lVar11 = lVar8;
        do {
          if ((iVar10 != DAT_00d1afc0) && (iVar10 != DAT_00d1b0b0)) {
            FUN_008917fc(param_1,lVar8,uVar5 & 0xff,2,1);
            break;
          }
          lVar11 = *(long *)(lVar11 + 0x20);
          iVar10 = *(int *)(lVar11 + 8);
        } while ((lVar11 == 0) || (iVar10 != DAT_00d1b010));
      }
    }
  }
  else if (*(uint *)(param_2 + 0x20) == 7) {
    lVar8 = *(long *)(param_2 + 0x30);
                    /* try { // try from 0088b288 to 0088b28f has its CatchHandler @ 0088b648 */
    __dest = operator_new(8);
    plVar16 = __dest + 1;
    *__dest = lVar8;
    plVar17 = plVar16;
    if (lVar8 != 0) {
      iVar10 = *(int *)(lVar8 + 8);
      if (iVar10 == DAT_00d1b0a0) {
        __src = __dest;
        plVar13 = __dest;
        while( true ) {
          __dest = __src;
          if (*(int *)(lVar8 + 0x1c) != 7) break;
          *plVar13 = *(long *)(lVar8 + 0x20);
          if (plVar16 < plVar17) {
            *plVar16 = *(long *)(lVar8 + 0x28);
            plVar13 = plVar16;
          }
          else {
            __n = (long)plVar16 - (long)__src;
            uVar14 = ((long)__n >> 3) + 1;
            if (uVar14 >> 0x3d != 0) {
              if (plVar4[5] != local_68) goto LAB_0088b6b4;
              FUN_0086f7dc();
              goto LAB_0088b5f8;
            }
            uVar15 = (long)plVar17 - (long)__src;
            uVar2 = (long)uVar15 >> 2;
            if ((ulong)((long)uVar15 >> 2) <= uVar14) {
              uVar2 = uVar14;
            }
            if (0x7ffffffffffffff7 < uVar15) {
              uVar2 = 0x1fffffffffffffff;
            }
            if (uVar2 >> 0x3d != 0) {
              if (plVar4[5] == local_68) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0088b5dc to 0088b5f7 has its CatchHandler @ 0088b654 */
                FUN_007fe1b8();
              }
              goto LAB_0088b6b4;
            }
                    /* try { // try from 0088b328 to 0088b32b has its CatchHandler @ 0088b650 */
            pvVar6 = operator_new(uVar2 << 3);
            plVar13 = (long *)((long)pvVar6 + __n);
            __dest = plVar13 + -((long)__n >> 3);
            *plVar13 = *(long *)(lVar8 + 0x28);
            memcpy(__dest,__src,__n);
            plVar17 = (long *)((long)pvVar6 + uVar2 * 8);
            operator_delete(__src,uVar15);
            iVar10 = DAT_00d1b0a0;
          }
          plVar16 = plVar13 + 1;
          lVar8 = *plVar13;
          if ((lVar8 == 0) || (__src = __dest, *(int *)(lVar8 + 8) != iVar10)) break;
        }
      }
    }
    uVar3 = *(uint *)((long)param_1 + 0x64c);
    uVar14 = (long)plVar16 - (long)__dest >> 3;
    iVar10 = (int)uVar14 + 1;
    uVar5 = iVar10 + uVar3;
    if (0xff < uVar5) {
      if (plVar4[5] == local_68) {
                    /* try { // try from 0088b634 to 0088b647 has its CatchHandler @ 0088b64c */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",
                     iVar10,0xff);
      }
      goto LAB_0088b6b4;
    }
    *(uint *)((long)param_1 + 0x64c) = uVar5;
    uVar9 = *(undefined8 *)(param_2 + 0x28);
    uVar1 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar5) {
      uVar1 = uVar5;
    }
    *(uint *)(param_1 + 0xca) = uVar1;
                    /* try { // try from 0088b4d8 to 0088b4eb has its CatchHandler @ 0088b64c */
    FUN_00892774(param_1,&local_a8,uVar3,0,uVar9);
    if (plVar16 != __dest) {
      if (uVar14 < 2) {
        uVar14 = 1;
      }
      plVar13 = __dest;
      uVar5 = uVar3;
      do {
        uVar5 = uVar5 + 1;
        lVar8 = *plVar13;
        if (DAT_00d1f068 == '\x01') {
          uVar7 = *(undefined4 *)((long)param_1 + 0x64c);
          *(uint *)((long)param_1 + 0x64c) = (uVar5 & 0xff) + 1;
                    /* try { // try from 0088b550 to 0088b55f has its CatchHandler @ 0088b664 */
          FUN_0088d1d0(param_1,lVar8,uVar5,1);
          *(undefined4 *)((long)param_1 + 0x64c) = uVar7;
        }
        else {
                    /* try { // try from 0088b510 to 0088b51f has its CatchHandler @ 0088b65c */
          FUN_0088d1d0(param_1,lVar8,uVar5,1);
        }
        uVar14 = uVar14 - 1;
        plVar13 = plVar13 + 1;
      } while (uVar14 != 0);
    }
                    /* try { // try from 0088b570 to 0088b583 has its CatchHandler @ 0088b64c */
    FUN_00875b54(*param_1,0x31,uVar12,uVar3,
                 (int)((ulong)((long)plVar16 - (long)__dest) >> 3) + uVar3);
    operator_delete(__dest,(long)plVar17 - (long)__dest);
  }
  if (local_a8 != 0) {
                    /* try { // try from 0088b44c to 0088b45f has its CatchHandler @ 0088b684 */
    FUN_00892774(param_1,&local_a8,uVar12,1,*(undefined8 *)(param_2 + 0x28));
  }
  *(undefined4 *)((long)local_78 + 0x64c) = local_70;
  if (plVar4[5] == local_68) {
    return;
  }
LAB_0088b6b4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

