/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008038d8
 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_008038d8(undefined1 *param_1)

{
  void *pvVar1;
  long lVar2;
  uint3 uVar3;
  code *pcVar4;
  bool bVar5;
  int iVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 *puVar9;
  undefined *puVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  ulong *puVar13;
  ulong uVar14;
  long *plVar15;
  ulong uVar16;
  long *plVar17;
  long lVar18;
  long local_f0;
  undefined1 uStack_e1;
  void *local_e0;
  ulong uStack_d8;
  void *local_d0;
  long *local_c0;
  undefined8 uStack_b8;
  undefined1 local_b0;
  long local_a0;
  
  lVar2 = tpidr_el0;
  local_a0 = *(long *)(lVar2 + 0x28);
  iVar6 = FUN_00c2b8f0(0,1,param_1);
  plVar15 = DAT_00cca918;
  if (iVar6 == 0) {
    for (; plVar15 != (long *)0x0; plVar15 = (long *)*plVar15) {
      while (iVar6 = FUN_008ae110(*(undefined8 *)(DAT_00cca938 + 0x10),plVar15[2]), iVar6 - 3U < 2)
      {
        FUN_008ae7e4(*(undefined8 *)(DAT_00cca938 + 0x10),(int)plVar15[3]);
        plVar17 = (long *)*plVar15;
        FUN_00804814(&local_e0,&DAT_00cca908,plVar15);
        pvVar1 = local_e0;
        local_e0 = (void *)0x0;
        if (pvVar1 != (void *)0x0) {
          operator_delete(pvVar1,0x20);
        }
        plVar15 = plVar17;
        if (plVar17 == (long *)0x0) goto LAB_008039b0;
      }
    }
LAB_008039b0:
    uVar14 = 0;
    do {
      if ((3 < uVar14) || (0x3f < DAT_00cca920)) break;
      local_e0 = (void *)0x0;
      uStack_d8 = 0;
      local_d0 = (void *)0x0;
                    /* try { // try from 00803a60 to 00803a67 has its CatchHandler @ 00804278 */
      std::__ndk1::mutex::lock((mutex *)(param_1 + 0x38));
      if (*(long *)(param_1 + 0x30) == 0) {
        std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x38));
LAB_00803c48:
        bVar5 = true;
      }
      else {
        uVar16 = *(ulong *)(param_1 + 0x28);
        lVar18 = *(long *)(*(long *)(param_1 + 0x10) + (uVar16 / 0xaa) * 8);
        if (((ulong)local_e0 & 1) != 0) {
          operator_delete(local_d0,(ulong)local_e0 & 0xfffffffffffffffe);
        }
        puVar13 = (ulong *)(lVar18 + (uVar16 % 0xaa) * 0x18);
        local_d0 = (void *)puVar13[2];
        uStack_d8 = puVar13[1];
        local_e0 = (void *)*puVar13;
        *(undefined2 *)puVar13 = 0;
        uVar16 = *(ulong *)(param_1 + 0x28);
        puVar13 = (ulong *)(*(long *)(*(long *)(param_1 + 0x10) + (uVar16 / 0xaa) * 8) +
                           (uVar16 % 0xaa) * 0x18);
        if ((*puVar13 & 1) != 0) {
          operator_delete((void *)puVar13[2],*puVar13 & 0xfffffffffffffffe);
          uVar16 = *(ulong *)(param_1 + 0x28);
        }
        *(ulong *)(param_1 + 0x28) = uVar16 + 1;
        *(long *)(param_1 + 0x30) = *(long *)(param_1 + 0x30) + -1;
        if (0x153 < uVar16 + 1) {
          operator_delete((void *)**(undefined8 **)(param_1 + 0x10),0xff0);
          *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + 8;
          *(long *)(param_1 + 0x28) = *(long *)(param_1 + 0x28) + -0xaa;
        }
        std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x38));
        if (*(long *)(DAT_00cca938 + 0x10) == 0) goto LAB_00803c48;
                    /* try { // try from 00803b48 to 00803b4b has its CatchHandler @ 00804260 */
        uVar7 = FUN_008aa984();
                    /* try { // try from 00803b58 to 00803b5b has its CatchHandler @ 0080426c */
        local_f0 = FUN_008aa7f4(*(undefined8 *)(DAT_00cca938 + 0x10));
        bVar5 = local_f0 == 0;
        if (local_f0 == 0) {
                    /* try { // try from 00803c58 to 00803c63 has its CatchHandler @ 0080426c */
          FUN_008aa994(*(undefined8 *)(DAT_00cca938 + 0x10),uVar7);
        }
        else {
                    /* try { // try from 00803b74 to 00803b93 has its CatchHandler @ 00804268 */
          uVar8 = FUN_008ae664(*(undefined8 *)(DAT_00cca938 + 0x10),0xffffffff);
          FUN_008aa994(*(undefined8 *)(DAT_00cca938 + 0x10),0xfffffffe);
          lVar18 = *(long *)(local_f0 + 0x10);
          if (lVar18 != 0) {
            uVar16 = DAT_00cc4430 | 0x203fffffffffff3f;
            *(undefined4 *)(lVar18 + 0x48) = 8;
            pcVar4 = DAT_00ccaae8;
            *(ulong *)(lVar18 + 0x98) = uVar16;
                    /* try { // try from 00803bc8 to 00803c0f has its CatchHandler @ 00804264 */
            puVar9 = (undefined4 *)(*pcVar4)();
            if (puVar9 != (undefined4 *)0x0) {
              *(ulong *)(puVar9 + 10) = uVar16;
              *puVar9 = 8;
            }
          }
          pvVar1 = (void *)((ulong)&local_e0 | 1);
          uVar16 = (ulong)local_e0 >> 1 & 0x7f;
          if (((ulong)local_e0 & 1) != 0) {
            pvVar1 = local_d0;
            uVar16 = uStack_d8;
          }
          iVar6 = (*DAT_00ccb130)(local_f0,DAT_00ccb138,pvVar1,uVar16,0);
          if (iVar6 == 0) {
                    /* try { // try from 00803c80 to 00803c97 has its CatchHandler @ 00804270 */
            lVar18 = FUN_008abf34(local_f0,0xffffffff);
            if ((lVar18 != 0) && (*(long *)(lVar18 + 0x18) != 0)) {
              FUN_008042b4();
            }
            lVar18 = local_f0;
            if (((DAT_00ccb180 & 1) == 0) &&
               (iVar6 = __cxa_guard_acquire(&DAT_00ccb180), iVar6 != 0)) {
              DAT_00ccb178 = 0x7892ba87;
              _DAT_00ccb17c = 0x147;
              __cxa_atexit(&LAB_008047cc,&DAT_00ccb178,&PTR_LOOP_00c48880);
              __cxa_guard_release(&DAT_00ccb180);
            }
            if (DAT_00ccb17d == '\x01') {
              _DAT_00ccb17c = (ushort)(DAT_00ccb17c ^ 0x47);
              DAT_00ccb178 = DAT_00ccb178 ^ 0x13e1dbf3;
            }
                    /* try { // try from 00803cec to 00803cfb has its CatchHandler @ 00804258 */
            FUN_008acba4(lVar18,0xffffd8ee,&DAT_00ccb178);
                    /* try { // try from 00803d00 to 00803d07 has its CatchHandler @ 00804270 */
            iVar6 = FUN_008ab0e0(local_f0,0xffffffff);
            lVar18 = local_f0;
            if (iVar6 == 6) {
              if (((DAT_00ccb190 & 1) == 0) &&
                 (iVar6 = __cxa_guard_acquire(&DAT_00ccb190), iVar6 != 0)) {
                DAT_00ccb18e = '\x01';
                DAT_00ccb188 = 0x24012c4f;
                _DAT_00ccb18c = 0x73d7;
                __cxa_atexit(&LAB_008047d8,&DAT_00ccb188,&PTR_LOOP_00c48880);
                __cxa_guard_release(&DAT_00ccb190);
              }
              if (DAT_00ccb18e == '\x01') {
                DAT_00ccb18e = '\0';
                _DAT_00ccb18c = _DAT_00ccb18c ^ 0x73a5;
                DAT_00ccb188 = DAT_00ccb188 ^ 0x4167492b;
              }
                    /* try { // try from 00803d74 to 00803d87 has its CatchHandler @ 00804250 */
              FUN_008acba4(lVar18,0xffffffff,&DAT_00ccb188);
                    /* try { // try from 00803d8c to 00803dcb has its CatchHandler @ 00804270 */
              iVar6 = FUN_008ab0e0(local_f0,0xffffffff);
              if (iVar6 != 7) {
                uVar12 = 0xfffffffd;
                goto LAB_00803edc;
              }
              FUN_008aab40(local_f0,0xfffffffe);
              FUN_008aac40(local_f0,0xfffffffe);
              iVar6 = FUN_008adea0(local_f0,1,0,0);
              if (iVar6 == 0) {
                local_c0 = &local_f0;
                lVar18 = FUN_00804984(&DAT_00cca908,&local_f0,&DAT_002dd6a5,&local_c0,&uStack_e1);
                *(undefined4 *)(lVar18 + 0x18) = uVar8;
              }
              else {
                    /* try { // try from 00803dd4 to 00803def has its CatchHandler @ 00804254 */
                iVar6 = FUN_008ab43c(local_f0,0xffffffff);
                if (iVar6 == 0) {
                  if (((DAT_00ccb1a8 & 1) == 0) &&
                     (iVar6 = __cxa_guard_acquire(&DAT_00ccb1a8), iVar6 != 0)) {
                    DAT_00ccb1a4 = '\x01';
                    DAT_00ccb198 = 0x9fa4c7fdcadd8661;
                    DAT_00ccb1a0 = 0xafc98c77;
                    __cxa_atexit(&LAB_008047e4,&DAT_00ccb198,&PTR_LOOP_00c48880);
                    __cxa_guard_release(&DAT_00ccb1a8);
                  }
                  puVar11 = &DAT_00ccb198;
                  if (DAT_00ccb1a4 == '\x01') {
                    DAT_00ccb1a4 = '\0';
                    DAT_00ccb198 = DAT_00ccb198 ^ 0xedc1e78fafbbe305;
                    DAT_00ccb1a0 = DAT_00ccb1a0 ^ 0xafbbe305;
                  }
                }
                else {
                  puVar11 = (undefined8 *)FUN_008ab8a4(local_f0,0xffffffff,0);
                }
                if (((DAT_00ccb1b8 & 1) == 0) &&
                   (iVar6 = __cxa_guard_acquire(&DAT_00ccb1b8), iVar6 != 0)) {
                  _DAT_00ccb1b0 = 0x145b8dc;
                  __cxa_atexit(&LAB_008047f0,&DAT_00ccb1b0,&PTR_LOOP_00c48880);
                  __cxa_guard_release(&DAT_00ccb1b8);
                }
                if (DAT_00ccb1b3 == '\x01') {
                  uVar3 = (uint3)_DAT_00ccb1b0;
                  _DAT_00ccb1b0 = (uint)(uVar3 ^ 0x45cbf9);
                }
                    /* try { // try from 00803fec to 00803fff has its CatchHandler @ 0080424c */
                (*DAT_00ccb160)(3,&DAT_00ccb1b0,puVar11);
                    /* try { // try from 00804004 to 0080401b has its CatchHandler @ 00804254 */
                FUN_008aa994(local_f0,0xfffffffe);
                FUN_008ae7e4(*(undefined8 *)(DAT_00cca938 + 0x10),uVar8);
              }
            }
            else {
              uVar12 = 0xfffffffe;
LAB_00803edc:
                    /* try { // try from 00803edc to 00803f3b has its CatchHandler @ 00804270 */
              FUN_008aa994(local_f0,uVar12);
              FUN_008ae7e4(*(undefined8 *)(DAT_00cca938 + 0x10),uVar8);
            }
            FUN_008aa994(*(undefined8 *)(DAT_00cca938 + 0x10),uVar7);
          }
          else {
                    /* try { // try from 00803c1c to 00803c37 has its CatchHandler @ 00804274 */
            iVar6 = FUN_008ab43c(local_f0,0xffffffff);
            if (iVar6 == 0) {
              local_b0 = 0x6f;
              uStack_b8 = 0x2fc8e590721def0b;
              local_c0 = (long *)0x2ac2e5a6661aba03;
              if (((DAT_00ccb158 & 1) == 0) &&
                 (iVar6 = __cxa_guard_acquire(&DAT_00ccb158), iVar6 != 0)) {
                    /* try { // try from 008040d0 to 008040df has its CatchHandler @ 00804238 */
                FUN_00804720(&DAT_00ccb140,&local_c0);
                __cxa_atexit(&LAB_008047b4,&DAT_00ccb140,&PTR_LOOP_00c48880);
                __cxa_guard_release(&DAT_00ccb158);
              }
              puVar10 = &DAT_00ccb140;
              FUN_0080494c(&DAT_00ccb140);
            }
            else {
              puVar10 = (undefined *)FUN_008ab8a4(local_f0,0xffffffff,0);
            }
            if (((DAT_00ccb170 & 1) == 0) &&
               (iVar6 = __cxa_guard_acquire(&DAT_00ccb170), iVar6 != 0)) {
              _DAT_00ccb168 = 0x18722c6;
              __cxa_atexit(&LAB_008047c0,&DAT_00ccb168,&PTR_LOOP_00c48880);
              __cxa_guard_release(&DAT_00ccb170);
            }
            if (DAT_00ccb16b == '\x01') {
              uVar3 = (uint3)_DAT_00ccb168;
              _DAT_00ccb168 = (uint)(uVar3 ^ 0x8751e3);
            }
                    /* try { // try from 00803e8c to 00803e9f has its CatchHandler @ 0080425c */
            (*DAT_00ccb160)(3,&DAT_00ccb168,puVar10);
                    /* try { // try from 00803ea4 to 00803ecb has its CatchHandler @ 00804274 */
            FUN_008aa994(local_f0,0xfffffffe);
            FUN_008ae7e4(*(undefined8 *)(DAT_00cca938 + 0x10),uVar8);
            FUN_008aa994(*(undefined8 *)(DAT_00cca938 + 0x10),uVar7);
          }
          uVar14 = uVar14 + 1;
        }
      }
      if (((ulong)local_e0 & 1) != 0) {
        operator_delete(local_d0,(ulong)local_e0 & 0xfffffffffffffffe);
      }
    } while (!bVar5);
    *param_1 = 0;
  }
  if (*(long *)(lVar2 + 0x28) != local_a0) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

