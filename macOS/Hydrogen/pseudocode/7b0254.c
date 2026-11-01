
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_007b0254(void)

{
  ulong *puVar1;
  byte bVar2;
  code *pcVar3;
  bool bVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 uVar7;
  long *plVar8;
  ulong uVar9;
  uint uVar10;
  int iVar11;
  code *extraout_x8;
  long lVar12;
  uint uVar13;
  long lVar14;
  long *plVar15;
  long unaff_x19;
  ulong unaff_x20;
  ulong uVar16;
  byte *unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  ulong unaff_x28;
  undefined1 auVar17 [16];
  undefined1 auVar18 [12];
  undefined *in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000068;
  undefined8 uStack00000000000000c8;
  int iStack00000000000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long in_stack_00000120;
  long in_stack_00000128;
  long in_stack_00000130;
  long in_stack_00000138;
  long in_stack_00000140;
  long in_stack_00000148;
  long in_stack_00000150;
  long in_stack_00000158;
  long in_stack_00000160;
  
code_r0x007b0254:
  func_0x005e6010();
  _pthread_mutex_destroy();
  _pthread_cond_destroy(&uStack0000000000000068);
code_r0x007b026c:
  if (unaff_x26 == 0) {
    if ((unaff_x20 & 1) == 0) {
      uVar16 = 0;
      bVar2 = *unaff_x21;
      goto joined_r0x007b0360;
    }
LAB_007b0550:
    uVar7 = 1;
  }
  else {
    if (unaff_x26 == 1) {
      uVar16 = 0;
      do {
        bVar2 = *unaff_x21;
joined_r0x007b0360:
        uVar13 = (uint)bVar2;
        unaff_x20 = uVar16;
        if ((bVar2 & 1) != 0) goto LAB_007b0004;
LAB_007affe8:
        bVar2 = *unaff_x21;
        if (bVar2 == (byte)uVar13) {
          *unaff_x21 = (byte)uVar13 | 1;
        }
        bVar4 = bVar2 == uVar13;
        uVar13 = (uint)bVar2;
        if (bVar4) goto LAB_007b0550;
code_r0x007afffc:
        if ((uVar13 & 1) == 0) goto LAB_007affe8;
LAB_007b0004:
        while( true ) {
          if ((uVar13 >> 1 & 1) != 0) goto code_r0x007b0024;
          uVar10 = (uint)uVar16;
          if (9 < uVar10) goto code_r0x007b0010;
          uVar16 = (ulong)(uVar10 + 1);
          if (uVar10 < 3) break;
          func_0x00412518();
          uVar13 = (uint)*unaff_x21;
          unaff_x20 = uVar16;
          if ((*unaff_x21 & 1) == 0) goto LAB_007affe8;
        }
        iVar11 = 2 << (ulong)(uVar10 & 0x1f);
        do {
          InstructionSynchronizationBarrier();
          iVar11 = iVar11 + -1;
        } while (iVar11 != 0);
      } while( true );
    }
    uVar7 = 0;
  }
  return uVar7;
code_r0x007b0010:
  bVar2 = *unaff_x21;
  if (bVar2 == (byte)uVar13) {
    *unaff_x21 = (byte)uVar13 | 2;
  }
  bVar4 = bVar2 == uVar13;
  uVar13 = (uint)bVar2;
  if (bVar4) {
code_r0x007b0024:
    uVar16 = 0;
    plVar5 = (long *)(*
                     ___ZN16parking_lot_core11parking_lot16with_thread_data11THREAD_DATA29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h1d6252a8b8badc7dE
                     )();
    plVar8 = plVar5 + 1;
    if (*plVar5 != 1) {
      if (*plVar5 == 2) {
        func_0x005e5d5c(&uStack00000000000000c8);
        unaff_x23[0xd] = in_stack_00000130;
        unaff_x23[0xc] = in_stack_00000128;
        unaff_x23[0xf] = in_stack_00000140;
        unaff_x23[0xe] = in_stack_00000138;
        unaff_x23[0x11] = in_stack_00000150;
        unaff_x23[0x10] = in_stack_00000148;
        unaff_x23[0x13] = in_stack_00000160;
        unaff_x23[0x12] = in_stack_00000158;
        unaff_x23[5] = in_stack_000000f0;
        unaff_x23[4] = in_stack_000000e8;
        unaff_x23[7] = in_stack_00000100;
        unaff_x23[6] = in_stack_000000f8;
        unaff_x23[9] = in_stack_00000110;
        unaff_x23[8] = in_stack_00000108;
        unaff_x23[0xb] = in_stack_00000120;
        unaff_x23[10] = in_stack_00000118;
        unaff_x23[1] = _iStack00000000000000d0;
        *unaff_x23 = uStack00000000000000c8;
        unaff_x23[3] = in_stack_000000e0;
        unaff_x23[2] = in_stack_000000d8;
        plVar8 = unaff_x23;
        uVar16 = unaff_x28;
      }
      else {
        uVar7 = (*extraout_x8)(&
                               __ZN16parking_lot_core11parking_lot16with_thread_data11THREAD_DATA29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h1d6252a8b8badc7dE
                              );
        plVar8 = (long *)func_0x007b08e4(uVar7,0);
      }
    }
    goto code_r0x007b008c;
  }
  goto code_r0x007afffc;
code_r0x007b008c:
  plVar5 = (long *)*unaff_x22;
  if (plVar5 == (long *)0x0) {
    plVar5 = (long *)func_0x007b0c50();
    uVar6 = unaff_x24 >> ((ulong)(uint)-(int)plVar5[3] & 0x3f);
    uVar9 = plVar5[1];
    if (uVar9 <= uVar6) goto code_r0x007b0588;
  }
  else {
    uVar6 = unaff_x24 >> ((ulong)(uint)-(int)plVar5[3] & 0x3f);
    uVar9 = plVar5[1];
    if (uVar9 <= uVar6) goto code_r0x007b0588;
  }
  puVar1 = (ulong *)(*plVar5 + uVar6 * 0x40);
  if (*puVar1 == 0) {
    *puVar1 = unaff_x28;
  }
  else {
    func_0x007b0d40(puVar1);
  }
  if ((long *)*unaff_x22 != plVar5) {
    uVar6 = *puVar1;
    *puVar1 = uVar6 + unaff_x19;
    LORelease();
    if (3 < uVar6 && (uVar6 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    goto code_r0x007b008c;
  }
  if (*unaff_x21 != 3) {
    uVar6 = *puVar1;
    *puVar1 = uVar6 + unaff_x19;
    LORelease();
    if (3 < uVar6 && (uVar6 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    unaff_x26 = 1;
    goto joined_r0x007b0508;
  }
  *(undefined1 *)(plVar8 + 0x13) = in_stack_00000008._4_1_;
  plVar8[0x10] = 0;
  plVar8[0xf] = (long)unaff_x21;
  plVar8[0x12] = 0;
  *(char *)(plVar8 + 0xe) = (char)unaff_x28;
  if ((*(byte *)((long)plVar8 + 0x71) & 1) == 0) {
    *(char *)((long)plVar8 + 0x71) = (char)unaff_x28;
  }
  if (puVar1[1] == 0) {
    puVar1[1] = (ulong)plVar8;
    puVar1[2] = (ulong)plVar8;
    uVar6 = *puVar1;
    *puVar1 = uVar6 + unaff_x19;
    LORelease();
    if (3 < uVar6 && (uVar6 & 2) == 0) goto code_r0x007b0538;
  }
  else {
    *(long **)(puVar1[2] + 0x80) = plVar8;
    puVar1[2] = (ulong)plVar8;
    uVar6 = *puVar1;
    *puVar1 = uVar6 + unaff_x19;
    LORelease();
    if (3 < uVar6 && (uVar6 & 2) == 0) {
code_r0x007b0538:
      func_0x007b0f88(puVar1);
    }
  }
  _pthread_mutex_lock(plVar8);
  bVar2 = *(byte *)(plVar8 + 0xe);
  if (in_stack_00000018._4_4_ != 1000000000) {
joined_r0x007b022c:
    if (bVar2 != 0) {
      do {
        auVar18 = func_0x00428c10();
        if (in_stack_00000010 == auVar18._0_8_) {
          if (in_stack_00000018._4_4_ <= auVar18._8_4_) {
code_r0x007b0368:
            _pthread_mutex_unlock(plVar8);
            goto code_r0x007b0388;
          }
        }
        else if (in_stack_00000010 <= auVar18._0_8_) goto code_r0x007b0368;
        auVar17 = func_0x00428ed4(in_stack_00000010,in_stack_00000018._4_4_);
        lVar14 = auVar17._0_8_;
        if (-1 < lVar14) {
          _gettimeofday(&uStack00000000000000c8,0);
          lVar12 = uStack00000000000000c8 + lVar14;
          if (!SCARRY8(uStack00000000000000c8,lVar14)) {
            lVar14 = (long)iStack00000000000000d0 * 1000 + (auVar17._8_8_ & 0xffffffff);
            if (lVar14 < 1000000000) goto code_r0x007b0298;
            bVar4 = SCARRY8(lVar12,1);
            lVar12 = lVar12 + 1;
            if (!bVar4) goto code_r0x007b028c;
          }
        }
        _pthread_cond_wait(plVar8 + 8,plVar8);
        if ((*(byte *)(plVar8 + 0xe) & 1) == 0) break;
      } while( true );
    }
    goto code_r0x007b0230;
  }
  while (bVar2 != 0) {
    _pthread_cond_wait(plVar8 + 8,plVar8);
    bVar2 = *(byte *)(plVar8 + 0xe) & 1;
  }
code_r0x007b0230:
  _pthread_mutex_unlock(plVar8);
  goto code_r0x007b0238;
code_r0x007b0388:
  plVar5 = (long *)*unaff_x22;
  if (plVar5 == (long *)0x0) {
    plVar5 = (long *)func_0x007b0c50();
  }
  unaff_x20 = plVar8[0xf];
  uVar6 = unaff_x20 * -0x61c8864680b583eb >> ((ulong)(uint)-(int)plVar5[3] & 0x3f);
  uVar9 = plVar5[1];
  if (uVar9 <= uVar6) {
    in_stack_00000000 = &UNK_009f3828;
code_r0x007b0588:
    func_0x007a2570(uVar6,uVar9,in_stack_00000000);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x7b0594);
    (*pcVar3)();
  }
  puVar1 = (ulong *)(*plVar5 + uVar6 * 0x40);
  if (*puVar1 == 0) {
    *puVar1 = unaff_x28;
  }
  else {
    func_0x007b0d40(puVar1);
  }
  if (((long *)*unaff_x22 != plVar5) || (plVar8[0xf] != unaff_x20)) {
    uVar6 = *puVar1;
    *puVar1 = uVar6 + unaff_x19;
    LORelease();
    if (3 < uVar6 && (uVar6 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    goto code_r0x007b0388;
  }
  _pthread_mutex_lock(plVar8);
  bVar2 = *(byte *)(plVar8 + 0xe);
  _pthread_mutex_unlock(plVar8);
  if ((bVar2 & 1) != 0) {
    plVar5 = (long *)puVar1[1];
    if (plVar5 != (long *)0x0) {
      if (plVar5 == plVar8) {
        uVar6 = plVar5[0x10];
        puVar1[1] = uVar6;
        if ((long *)puVar1[2] != plVar8) {
          bVar4 = true;
          goto joined_r0x007b04c0;
        }
        puVar1[2] = 0;
      }
      else {
        bVar4 = true;
        do {
          plVar15 = plVar5;
          plVar5 = (long *)plVar15[0x10];
          if (plVar5 == (long *)0x0) goto code_r0x007b04ec;
          bVar4 = (bool)(plVar15[0xf] != unaff_x20 & bVar4);
        } while (plVar5 != plVar8);
        uVar6 = plVar5[0x10];
        plVar15[0x10] = uVar6;
        if ((long *)puVar1[2] == plVar8) {
          puVar1[2] = (ulong)plVar15;
        }
        else {
joined_r0x007b04c0:
          for (; uVar6 != 0; uVar6 = *(ulong *)(uVar6 + 0x80)) {
            if (*(ulong *)(uVar6 + 0x78) == unaff_x20) goto code_r0x007b04ec;
          }
        }
        if (!bVar4) goto code_r0x007b04ec;
      }
      *unaff_x21 = *unaff_x21 & 0xfd;
    }
code_r0x007b04ec:
    uVar6 = *puVar1;
    *puVar1 = uVar6 + unaff_x19;
    LORelease();
    if (3 < uVar6 && (uVar6 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    unaff_x26 = 2;
    goto joined_r0x007b0508;
  }
  uVar6 = *puVar1;
  *puVar1 = uVar6 + unaff_x19;
  LORelease();
  if (3 < uVar6 && (uVar6 & 2) == 0) {
    func_0x007b0f88(puVar1);
  }
code_r0x007b0238:
  unaff_x26 = 0;
  unaff_x20 = (ulong)(plVar8[0x11] == 1);
joined_r0x007b0508:
  if (uVar16 != 0) goto code_r0x007b0254;
  goto code_r0x007b026c;
code_r0x007b028c:
  lVar14 = lVar14 + -1000000000;
code_r0x007b0298:
  uStack00000000000000c8 = lVar12;
  _iStack00000000000000d0 = lVar14;
  _pthread_cond_timedwait(plVar8 + 8,plVar8,&uStack00000000000000c8);
  bVar2 = *(byte *)(plVar8 + 0xe) & 1;
  goto joined_r0x007b022c;
}

