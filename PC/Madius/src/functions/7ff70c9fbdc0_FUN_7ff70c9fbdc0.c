/* 7ff70c9fbdc0 FUN_7ff70c9fbdc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9fbdc0(void)

{
  longlong lVar1;
  code *pcVar2;
  byte bVar3;
  int iVar4;
  ulonglong uVar5;
  longlong *plVar6;
  longlong *plVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined1 *puVar10;
  longlong lVar11;
  undefined *puVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  undefined8 extraout_XMM0_Qa;
  undefined1 auVar15 [16];
  undefined8 extraout_XMM0_Qa_00;
  undefined8 extraout_XMM0_Qb;
  undefined8 extraout_XMM0_Qb_00;
  undefined1 auVar16 [16];
  undefined1 in_XMM1 [16];
  ulonglong in_stack_ffffffffffffff38;
  undefined *puStack_b0;
  undefined *puStack_a8;
  undefined8 uStack_a0;
  undefined *puStack_98;
  undefined8 uStack_90;
  undefined1 auStack_88 [16];
  ulonglong uStack_78;
  ulonglong uStack_70;
  longlong lStack_60;
  undefined1 auStack_58 [16];
  ulonglong uStack_48;
  ulonglong uStack_40;
  longlong lStack_38;
  undefined8 uStack_30;
  
  uStack_30 = 0xfffffffffffffffe;
  if ((DAT_7ff70cc1b2e0 == '\x01') &&
     (iVar4 = (**(code **)(*_DAT_7ff70cc1b2e8 + 0x40))(_DAT_7ff70cc1b2e8,0,1), iVar4 == 0x87a0001))
  {
    (*_DAT_7ff70cb95960)(10);
    return;
  }
  DAT_7ff70cc1b2e0 = 0;
  if (_DAT_7ff70cc1b2f4 != 0 && _DAT_7ff70cc1b2f0 != 0) {
    if (_DAT_7ff70cc1b300 != (longlong *)0x0) {
      (**(code **)(*_DAT_7ff70cc1b300 + 0x10))();
      _DAT_7ff70cc1b300 = (longlong *)0x0;
    }
    (**(code **)(*_DAT_7ff70cc1b2e8 + 0x68))
              (_DAT_7ff70cc1b2e8,0,_DAT_7ff70cc1b2f0,_DAT_7ff70cc1b2f4,
               in_stack_ffffffffffffff38 & 0xffffffff00000000,0);
    _DAT_7ff70cc1b2f4 = 0;
    _DAT_7ff70cc1b2f0 = 0;
    auVar16._8_8_ = 0;
    auVar16._0_8_ = auStack_58._8_8_;
    auStack_58 = auVar16 << 0x40;
    (**(code **)(*_DAT_7ff70cc1b2e8 + 0x48))(_DAT_7ff70cc1b2e8,0,&UNK_7ff70cb74a90,auStack_58);
    if (auStack_58._0_8_ != 0) {
      (**(code **)(*_DAT_7ff70cc1b310 + 0x48))
                (_DAT_7ff70cc1b310,auStack_58._0_8_,0,&DAT_7ff70cc1b300);
      (**(code **)(*(longlong *)auStack_58._0_8_ + 0x10))();
    }
  }
  FUN_7ff70c8be220();
  FUN_7ff70c8be680();
  FUN_7ff70c81c690();
  entry();
  bVar3 = DAT_7ff70cbed2f8;
  LOCK();
  DAT_7ff70cbed2f8 = 0;
  UNLOCK();
  if ((bVar3 & 1) == 0) goto LAB_7ff70c9fc28b;
  auStack_58 = (undefined1  [16])0x0;
  uStack_48 = 0;
  uStack_40 = 0xf;
  iVar4 = FUN_7ff70cb12570(0x7ff70cbed288);
  uVar8 = _DAT_7ff70cbed2e8;
  if (iVar4 == 0) {
    if (_DAT_7ff70cbed2d4 == 0x7fffffff) goto LAB_7ff70c9fc3c7;
    puVar12 = _DAT_7ff70cbed2d8;
    if (_DAT_7ff70cbed2f0 < 0x10) {
      puVar12 = &DAT_7ff70cbed2d8;
    }
    if (uStack_40 < _DAT_7ff70cbed2e8) {
      FUN_7ff70ca005a0(auStack_58,_DAT_7ff70cbed2e8);
    }
    else {
      if (uStack_40 < 0x10) {
        puVar10 = auStack_58;
      }
      else {
        puVar10 = (undefined1 *)auStack_58._0_8_;
      }
      uStack_48 = _DAT_7ff70cbed2e8;
      FUN_7ff70cb12b70(puVar10,puVar12,_DAT_7ff70cbed2e8);
      puVar10[uVar8] = 0;
    }
    FUN_7ff70cb12580(0x7ff70cbed288);
    uVar8 = uStack_48;
    if (uStack_48 == 0) {
LAB_7ff70c9fc24c:
      if (0xf < uStack_40) {
        uVar8 = uStack_40 + 1;
        lVar11 = auStack_58._0_8_;
        if (0xfff < uVar8) {
          lVar11 = *(longlong *)(auStack_58._0_8_ + -8);
          if (0x1f < (ulonglong)((auStack_58._0_8_ + -8) - lVar11)) goto LAB_7ff70c9fc3e8;
          uVar8 = uStack_40 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar11,uVar8);
      }
LAB_7ff70c9fc28b:
      FUN_7ff70c833c40();
      (**(code **)(*_DAT_7ff70cc1b2f8 + 0x108))(_DAT_7ff70cc1b2f8,1,&DAT_7ff70cc1b300,0);
      (**(code **)(*_DAT_7ff70cc1b2f8 + 400))(_DAT_7ff70cc1b2f8,_DAT_7ff70cc1b300,&UNK_7ff70cb74a80)
      ;
      uVar9 = FUN_7ff70c8195e0();
      FUN_7ff70c8bc230(uVar9);
      iVar4 = (**(code **)(*_DAT_7ff70cc1b2e8 + 0x40))(_DAT_7ff70cc1b2e8,1,0);
      DAT_7ff70cc1b2e0 = iVar4 == 0x87a0001;
      return;
    }
    if (uStack_40 < 0x10) {
      puVar10 = auStack_58;
    }
    else {
      puVar10 = (undefined1 *)auStack_58._0_8_;
    }
    auVar15 = (undefined1  [16])0x0;
    auStack_88 = (undefined1  [16])0x0;
    uStack_78 = 0;
    uStack_70 = 7;
    if (0x7ffffffffffffffe < uStack_48) goto LAB_7ff70c9fc3dc;
    if (uStack_48 < 8) {
      plVar7 = (longlong *)auStack_88;
joined_r0x7ff70c9fc0ab:
      uVar5 = uVar8;
      plVar6 = plVar7;
      if ((uVar8 < 4) ||
         ((plVar7 < puVar10 + uVar8 && (puVar10 < (undefined1 *)((longlong)plVar7 + uVar8 * 2))))) {
LAB_7ff70c9fc11e:
        uVar13 = uVar5 - 1;
        if ((uVar5 & 7) != 0) {
          uVar14 = 0;
          do {
            *(short *)plVar6 = (short)(char)puVar10[uVar14];
            plVar6 = (longlong *)((longlong)plVar6 + 2);
            uVar14 = uVar14 + 1;
          } while ((uVar5 & 7) != uVar14);
          puVar10 = puVar10 + uVar14;
          uVar5 = uVar5 - uVar14;
        }
        if (6 < uVar13) {
          uVar13 = 0;
          do {
            *(short *)((longlong)plVar6 + uVar13 * 2) = (short)(char)puVar10[uVar13];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 2) = (short)(char)puVar10[uVar13 + 1];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 4) = (short)(char)puVar10[uVar13 + 2];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 6) = (short)(char)puVar10[uVar13 + 3];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 8) = (short)(char)puVar10[uVar13 + 4];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 10) = (short)(char)puVar10[uVar13 + 5];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 0xc) = (short)(char)puVar10[uVar13 + 6];
            *(short *)((longlong)plVar6 + uVar13 * 2 + 0xe) = (short)(char)puVar10[uVar13 + 7];
            uVar13 = uVar13 + 8;
          } while (uVar5 != uVar13);
        }
      }
      else if (uVar8 < 0x10) {
        uVar13 = 0;
LAB_7ff70c9fc360:
        uVar14 = uVar8 & 0x7ffffffffffffffc;
        do {
          auVar16 = pmovsxbw(ZEXT416(*(uint *)(puVar10 + uVar13)),
                             ZEXT416(*(uint *)(puVar10 + uVar13)));
          *(longlong *)((longlong)plVar7 + uVar13 * 2) = auVar16._0_8_;
          uVar13 = uVar13 + 4;
        } while (uVar14 != uVar13);
        puVar10 = puVar10 + uVar14;
        uVar5 = (ulonglong)((uint)uVar8 & 3);
        plVar6 = (longlong *)((longlong)plVar7 + uVar14 * 2);
        if (uVar8 != uVar14) goto LAB_7ff70c9fc11e;
      }
      else {
        uVar13 = uVar8 & 0x7ffffffffffffff0;
        uVar5 = 0;
        do {
          auVar15 = pmovsxbw(auVar15,*(undefined8 *)(puVar10 + uVar5));
          in_XMM1 = pmovsxbw(in_XMM1,*(undefined8 *)(puVar10 + uVar5 + 8));
          *(undefined1 (*) [16])((longlong)plVar7 + uVar5 * 2) = auVar15;
          *(undefined1 (*) [16])((longlong)plVar7 + uVar5 * 2 + 0x10) = in_XMM1;
          uVar5 = uVar5 + 0x10;
        } while (uVar13 != uVar5);
        if (uVar8 != uVar13) {
          if ((uVar8 & 0xc) == 0) {
            puVar10 = puVar10 + uVar13;
            uVar5 = (ulonglong)((uint)uVar8 & 0xf);
            plVar6 = (longlong *)((longlong)plVar7 + uVar13 * 2);
            goto LAB_7ff70c9fc11e;
          }
          goto LAB_7ff70c9fc360;
        }
      }
      uStack_78 = uVar8;
      *(undefined2 *)((longlong)plVar7 + uVar8 * 2) = 0;
      if (uStack_70 < 8) {
        puVar10 = auStack_88;
      }
      else {
        puVar10 = (undefined1 *)auStack_88._0_8_;
      }
      uVar8 = func_0x7ff70cc3d352(0,&UNK_7ff70cb92484,puVar10,0,0,1);
      if (7 < uVar8) {
        uVar5 = uVar8 * 2 + 2;
        lVar11 = auStack_88._0_8_;
        if (0xfff < uVar5) {
          lVar11 = *(longlong *)(auStack_88._0_8_ + -8);
          if (0x1f < (ulonglong)((auStack_88._0_8_ + -8) - lVar11)) goto LAB_7ff70c9fc3e8;
          uVar5 = uVar8 * 2 + 0x29;
        }
        thunk_FUN_7ff70ca90250(lVar11,uVar5);
      }
      goto LAB_7ff70c9fc24c;
    }
    uVar5 = uStack_48 | 7;
    if (uVar5 < 0x7fffffffffffffff) {
      uVar13 = 10;
      if (10 < uVar5) {
        uVar13 = uVar5;
      }
      lVar11 = uVar13 * 2;
      if (uVar5 < 0x7ff) {
        lVar1 = lVar11 + 2;
        lStack_60 = lVar11 + 0x12;
        lStack_38 = lVar1;
        plVar7 = (longlong *)(*_DAT_7ff70cb96730)();
        auVar15._8_8_ = extraout_XMM0_Qb_00;
        auVar15._0_8_ = extraout_XMM0_Qa_00;
        if (plVar7 == (longlong *)0x0) {
          puStack_98 = &UNK_7ff70cb868f0;
          uStack_90 = 0x6e;
          FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_98,&lStack_60,&lStack_38);
          uStack_a0 = 0;
          puStack_a8 = &UNK_7ff70cb846bb;
          puStack_b0 = &UNK_7ff70cb740b8;
          FUN_7ff70cb12a50(&puStack_b0,&UNK_7ff70cbe4470);
LAB_7ff70c9fc445:
          puStack_98 = &UNK_7ff70cb868f0;
          uStack_90 = 0x6e;
          FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_98,&lStack_60,&lStack_38);
          uStack_a0 = 0;
          puStack_a8 = &UNK_7ff70cb846bb;
          puStack_b0 = &UNK_7ff70cb740b8;
          FUN_7ff70cb12a50(&puStack_b0,&UNK_7ff70cbe4470);
          pcVar2 = (code *)swi(3);
          (*pcVar2)();
          return;
        }
        *plVar7 = lVar1;
        *(undefined1 *)(plVar7 + 1) = 1;
        LOCK();
        _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
        UNLOCK();
        LOCK();
        _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_38;
        UNLOCK();
        plVar7 = plVar7 + 2;
      }
      else {
        if (0x7fffffffffffffeb < uVar5) goto LAB_7ff70c9fc3e2;
        lVar1 = lVar11 + 0x29;
        lStack_60 = lVar11 + 0x39;
        lStack_38 = lVar1;
        plVar6 = (longlong *)(*_DAT_7ff70cb96730)();
        auVar15._8_8_ = extraout_XMM0_Qb;
        auVar15._0_8_ = extraout_XMM0_Qa;
        if (plVar6 == (longlong *)0x0) goto LAB_7ff70c9fc445;
        *plVar6 = lVar1;
        *(undefined1 *)(plVar6 + 1) = 1;
        LOCK();
        _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
        UNLOCK();
        LOCK();
        _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_38;
        UNLOCK();
        plVar7 = (longlong *)((longlong)plVar6 + 0x37U & 0xffffffffffffffe0);
        plVar7[-1] = (longlong)(plVar6 + 2);
      }
      auStack_88._0_8_ = plVar7;
      uStack_70 = uVar13;
      goto joined_r0x7ff70c9fc0ab;
    }
  }
  else {
    FUN_7ff70cb124d0(5);
LAB_7ff70c9fc3c7:
    _DAT_7ff70cbed2d4 = 0x7ffffffe;
    FUN_7ff70cb124d0(6);
LAB_7ff70c9fc3dc:
    FUN_7ff70ca00780();
  }
LAB_7ff70c9fc3e2:
  FUN_7ff70ca007a0();
LAB_7ff70c9fc3e8:
                    /* WARNING: Does not return */
  pcVar2 = (code *)invalidInstructionException();
  (*pcVar2)();
}


