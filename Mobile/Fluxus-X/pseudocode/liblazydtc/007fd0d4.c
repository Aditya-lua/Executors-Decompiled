/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fd0d4
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007fd0d4(long param_1)

{
  long *plVar1;
  char *__s;
  byte *pbVar2;
  byte bVar3;
  uint3 uVar4;
  ulong uVar5;
  long *plVar6;
  code *pcVar7;
  int iVar8;
  undefined4 *puVar9;
  size_t __n;
  void *__dest;
  long lVar10;
  long lVar11;
  ulong *puVar12;
  ulong uVar13;
  long lVar14;
  ulong local_98;
  size_t local_90;
  void *local_88;
  ulong local_80;
  ulong uStack_78;
  char *local_70;
  long local_68;
  
  plVar6 = DAT_00cca938;
  lVar14 = tpidr_el0;
  local_68 = *(long *)(lVar14 + 0x28);
  lVar10 = *(long *)(param_1 + 0x1b0);
  plVar1 = DAT_00cca938 + 3;
  *DAT_00cca938 = lVar10;
  if (*plVar1 == 0) {
    plVar6[3] = param_1;
LAB_007fd708:
    lVar14 = *(long *)(lVar14 + 0x28);
  }
  else {
    if (param_1 == *plVar1) goto LAB_007fd708;
    if (param_1 != plVar6[4]) {
      if (lVar10 == 0) goto LAB_007fd708;
      plVar6[4] = param_1;
      *(undefined1 *)((long)plVar6 + 0x29) = 0;
      plVar6[1] = 0;
      plVar6[2] = 0;
      *(undefined1 *)(plVar6 + 5) = 1;
    }
    if ((*(byte *)(plVar6 + 5) & 1) == 0) {
LAB_007fd744:
      if ((plVar6[2] != 0) && ((*DAT_00cca948 & 1) == 0)) {
        FUN_008038d8(DAT_00cca948);
      }
      (*DAT_00cca970)(param_1);
      if (*(long *)(lVar14 + 0x28) == local_68) {
        return;
      }
      goto LAB_007fda9c;
    }
    if (plVar6[1] != 0) {
      *(undefined1 *)(plVar6 + 5) = 0;
      lVar10 = FUN_008aa7f4();
      lVar11 = *(long *)(lVar10 + 0x10);
      plVar6[2] = lVar10;
      uVar13 = DAT_00cc4430;
      if (lVar11 != 0) {
        *(undefined4 *)(lVar11 + 0x48) = 8;
        pcVar7 = DAT_00ccaae8;
        *(ulong *)(lVar11 + 0x98) = uVar13 | 0x203fffffffffff3f;
        puVar9 = (undefined4 *)(*pcVar7)();
        if (puVar9 != (undefined4 *)0x0) {
          *puVar9 = 8;
          *(ulong *)(puVar9 + 10) = uVar13 | 0x203fffffffffff3f;
        }
      }
      FUN_008b73b4(plVar6[2]);
      FUN_008ad0b0(plVar6[2],0,0);
      lVar10 = plVar6[2];
      if (((DAT_00ccaaf8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccaaf8), iVar8 != 0)) {
        _DAT_00ccaaf0 = 0x1c17ce4;
        __cxa_atexit(&LAB_007fdf18,&DAT_00ccaaf0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccaaf8);
      }
      if (DAT_00ccaaf3 == '\x01') {
        uVar4 = (uint3)_DAT_00ccaaf0;
        _DAT_00ccaaf0 = (uint)(uVar4 ^ 0xc13bbb);
      }
      FUN_008ad800(lVar10,0xffffd8ee,&DAT_00ccaaf0);
      FUN_008ad0b0(plVar6[2],0,0);
      lVar10 = plVar6[2];
      if (((DAT_00ccab08 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccab08), iVar8 != 0)) {
        _DAT_00ccab00 = 0x15f333623aaeb6a;
        __cxa_atexit(&LAB_007fdf24,&DAT_00ccab00,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccab08);
      }
      uVar13 = _DAT_00ccab00;
      if (DAT_00ccab07 == '\x01') {
        uVar5 = _DAT_00ccab00 >> 0x30;
        _DAT_00ccab00 = (uint5)(DAT_00ccab04 ^ 0x53) << 0x20;
        _DAT_00ccab00 =
             (ulong)CONCAT34((int3)(CONCAT16((char)uVar5,CONCAT15(DAT_00ccab05,_DAT_00ccab00)) >>
                                   0x20),(int)uVar13) ^ 0x5f570051cb8319;
      }
      FUN_008ad800(lVar10,0xffffd8ee,&DAT_00ccab00);
      FUN_008ae664(plVar6[1],0xffffffff);
      FUN_008aa994(plVar6[1],0xfffffffe);
      lVar10 = plVar6[2];
      if (lVar10 != 0) {
        if (((DAT_00ccab20 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccab20), iVar8 != 0)) {
          _DAT_00ccab18 = 0x17b;
          DAT_00ccab10 = 0xc0eab7a471a0d32;
          __cxa_atexit(&LAB_007fdf30,&DAT_00ccab10,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00ccab20);
        }
        if (DAT_00ccab19 == '\x01') {
          DAT_00ccab10 = DAT_00ccab10 ^ 0x696dc51b3369637b;
          _DAT_00ccab18 = (ushort)(DAT_00ccab18 ^ 0x7b);
        }
        FUN_008acba4(lVar10,0xffffd8ee,&DAT_00ccab10);
        lVar10 = plVar6[2];
        if (((DAT_00ccab30 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccab30), iVar8 != 0)) {
          DAT_00ccab2c = '\x01';
          DAT_00ccab28 = 0x27be6869;
          __cxa_atexit(&LAB_007fdf3c,&DAT_00ccab28,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00ccab30);
        }
        if (DAT_00ccab2c == '\x01') {
          DAT_00ccab2c = '\0';
          DAT_00ccab28 = DAT_00ccab28 ^ 0x27c90d07;
        }
        FUN_008acba4(lVar10,0xffffffff,&DAT_00ccab28);
        lVar10 = plVar6[2];
        if (((DAT_00ccab48 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccab48), iVar8 != 0)) {
          DAT_00ccab44 = '\x01';
          DAT_00ccab38 = 0x759cde1b5cde2cdb;
          DAT_00ccab40 = 0x3dc933fe;
          __cxa_atexit(&LAB_007fdf44,&DAT_00ccab38,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00ccab48);
        }
        if (DAT_00ccab44 == '\x01') {
          DAT_00ccab44 = '\0';
          DAT_00ccab38 = DAT_00ccab38 ^ 0x7ff8d773dbd4397;
          DAT_00ccab40 = DAT_00ccab40 ^ 0x3dbd4397;
        }
        FUN_008ac4a8(lVar10,&DAT_00ccab38);
        FUN_008add48(plVar6[2],1,1);
        lVar10 = plVar6[2];
        if (((DAT_00ccab58 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccab58), iVar8 != 0)) {
          _DAT_00ccab50 = 0x18b39e3a6171428;
          __cxa_atexit(&LAB_007fdf50,&DAT_00ccab50,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00ccab58);
        }
        uVar13 = _DAT_00ccab50;
        if (DAT_00ccab57 == '\x01') {
          uVar5 = _DAT_00ccab50 >> 0x30;
          _DAT_00ccab50 = (uint5)(DAT_00ccab54 ^ 0x93) << 0x20;
          _DAT_00ccab50 =
               (ulong)CONCAT34((int3)(CONCAT16((char)uVar5,CONCAT15(DAT_00ccab55,_DAT_00ccab50)) >>
                                     0x20),(int)uVar13) ^ 0x8b4d00cf65775b;
        }
        FUN_008ad800(lVar10,0xffffd8ee,&DAT_00ccab50);
        FUN_008aa994(plVar6[2],0xfffffffe);
        FUN_0084e83c(plVar6[2]);
        FUN_00804e40();
        do {
          local_80 = 0;
          uStack_78 = 0;
          local_70 = (char *)0x0;
                    /* try { // try from 007fd504 to 007fd50b has its CatchHandler @ 007fda64 */
          std::__ndk1::mutex::lock((mutex *)(plVar6 + 0xc));
          lVar10 = plVar6[0xb];
          if (lVar10 == 0) {
            std::__ndk1::mutex::unlock((mutex *)(plVar6 + 0xc));
          }
          else {
            puVar12 = (ulong *)(*(long *)(plVar6[7] + ((ulong)plVar6[10] / 0xaa) * 8) +
                               ((ulong)plVar6[10] % 0xaa) * 0x18);
            if (&local_80 != puVar12) {
              bVar3 = (byte)*puVar12;
              if ((local_80 & 1) == 0) {
                if ((bVar3 & 1) == 0) {
                  local_70 = (char *)puVar12[2];
                  uStack_78 = puVar12[1];
                  local_80 = *puVar12;
                }
                else {
                  FUN_007fdf5c(&local_80,puVar12[2],puVar12[1]);
                }
              }
              else {
                uVar13 = puVar12[1];
                pbVar2 = (byte *)puVar12[2];
                if ((bVar3 & 1) == 0) {
                  pbVar2 = (byte *)((long)puVar12 + 1);
                  uVar13 = (ulong)(bVar3 >> 1);
                }
                    /* try { // try from 007fd588 to 007fd59f has its CatchHandler @ 007fda2c */
                FUN_007fe004(&local_80,pbVar2,uVar13);
              }
            }
            uVar13 = plVar6[10];
            puVar12 = (ulong *)(*(long *)(plVar6[7] + (uVar13 / 0xaa) * 8) + (uVar13 % 0xaa) * 0x18)
            ;
            if ((*puVar12 & 1) != 0) {
              operator_delete((void *)puVar12[2],*puVar12 & 0xfffffffffffffffe);
              uVar13 = plVar6[10];
            }
            plVar6[10] = uVar13 + 1;
            plVar6[0xb] = plVar6[0xb] + -1;
            if (0x153 < uVar13 + 1) {
              operator_delete(*(void **)plVar6[7],0xff0);
              plVar6[7] = plVar6[7] + 8;
              plVar6[10] = plVar6[10] + -0xaa;
            }
            std::__ndk1::mutex::unlock((mutex *)(plVar6 + 0xc));
            pbVar2 = DAT_00cca948;
            __s = (char *)((ulong)&local_80 | 1);
            if ((local_80 & 1) != 0) {
              __s = local_70;
            }
            __n = strlen(__s);
            if (0xfffffffffffffff7 < __n) {
              if (*(long *)(lVar14 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 007fd7d0 to 007fd7d3 has its CatchHandler @ 007fda40 */
                FUN_007fe124();
              }
              goto LAB_007fda9c;
            }
            if (__n < 0x17) {
              local_98 = CONCAT71(local_98._1_7_,(char)((int)__n << 1));
              __dest = (void *)((ulong)&local_98 | 1);
              if (__n != 0) goto LAB_007fd698;
            }
            else {
              uVar13 = 0x1a;
              if ((__n | 7) != 0x17) {
                uVar13 = (__n | 7) + 1;
              }
                    /* try { // try from 007fd67c to 007fd683 has its CatchHandler @ 007fda3c */
              __dest = operator_new(uVar13);
              local_98 = uVar13 | 1;
              local_90 = __n;
              local_88 = __dest;
LAB_007fd698:
              memmove(__dest,__s,__n);
            }
            *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 007fd6ac to 007fd6b7 has its CatchHandler @ 007fda44 */
            FUN_00804318(pbVar2,&local_98);
            if ((local_98 & 1) != 0) {
              operator_delete(local_88,local_98 & 0xfffffffffffffffe);
            }
          }
          if ((local_80 & 1) != 0) {
            operator_delete(local_70,local_80 & 0xfffffffffffffffe);
          }
        } while (lVar10 != 0);
        goto LAB_007fd744;
      }
    }
    lVar14 = *(long *)(lVar14 + 0x28);
  }
  if (lVar14 == local_68) {
                    /* WARNING: Could not recover jumptable at 0x007fd740. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_00cca970)(param_1);
    return;
  }
LAB_007fda9c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

