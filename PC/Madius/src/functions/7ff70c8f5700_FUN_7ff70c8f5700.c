/* 7ff70c8f5700 FUN_7ff70c8f5700 */

undefined8 *
FUN_7ff70c8f5700(undefined8 *param_1,undefined8 *param_2,undefined4 *param_3,undefined4 *param_4,
                undefined1 *param_5,undefined4 *param_6)

{
  undefined8 *puVar1;
  longlong *plVar2;
  int *piVar3;
  undefined8 uVar4;
  longlong *plVar5;
  code *pcVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  longlong lVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  longlong lVar19;
  undefined8 *puVar20;
  ulonglong uVar21;
  longlong lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 *puStack_70;
  undefined8 *puStack_68;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  *param_1 = 0;
  param_1[1] = 0;
  *param_1 = *param_2;
  param_1[1] = param_2[1];
  *param_2 = 0;
  param_2[1] = 0;
  *(undefined4 *)(param_1 + 2) = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[3] = 0;
  param_1[4] = 0;
  uVar7 = *param_3;
  uVar8 = param_3[1];
  uVar9 = param_3[2];
  uVar10 = param_3[3];
  uVar11 = param_3[5];
  uVar12 = param_3[6];
  uVar13 = param_3[7];
  *(undefined4 *)(param_1 + 5) = param_3[4];
  *(undefined4 *)((longlong)param_1 + 0x2c) = uVar11;
  *(undefined4 *)(param_1 + 6) = uVar12;
  *(undefined4 *)((longlong)param_1 + 0x34) = uVar13;
  *(undefined4 *)(param_1 + 3) = uVar7;
  *(undefined4 *)((longlong)param_1 + 0x1c) = uVar8;
  *(undefined4 *)(param_1 + 4) = uVar9;
  *(undefined4 *)((longlong)param_1 + 0x24) = uVar10;
  *(undefined8 *)(param_3 + 4) = 0;
  *(undefined8 *)(param_3 + 6) = 0xf;
  *(undefined1 *)param_3 = 0;
  param_1[7] = 0;
  param_1[8] = 0;
  puStack_70 = param_2;
  puStack_68 = param_1;
  lVar16 = FUN_7ff70ca8ff40(0x60);
  *(longlong *)lVar16 = lVar16;
  *(longlong *)(lVar16 + 8) = lVar16;
  *(longlong *)(lVar16 + 0x10) = lVar16;
  *(undefined2 *)(lVar16 + 0x18) = 0x101;
  puStack_68[7] = lVar16;
  puStack_68[10] = 0;
  puStack_68[0xb] = 0;
  puStack_68[0xc] = 0;
  puStack_68[0xd] = 0xf;
  puStack_68[9] = &UNK_7ff70cb743b8;
  puStack_68[0xe] = 0;
  *(undefined1 *)(puStack_68 + 0xf) = *param_5;
  uVar4 = *(undefined8 *)(param_5 + 0x18);
  *(undefined8 *)(param_5 + 0x18) = 0;
  uVar14 = *(undefined8 *)(param_5 + 8);
  uVar15 = *(undefined8 *)(param_5 + 0x10);
  *(undefined8 *)(param_5 + 8) = 0;
  *(undefined8 *)(param_5 + 0x10) = 0;
  puStack_68[0x10] = uVar14;
  puStack_68[0x11] = uVar15;
  puStack_68[0x12] = uVar4;
  *(undefined4 *)(puStack_68 + 0x13) = *param_6;
  puStack_68[0x16] = 0;
  puStack_68[0x17] = 0;
  puStack_68[0x14] = 0;
  puStack_68[0x15] = 0;
  uVar4 = *(undefined8 *)(param_6 + 2);
  uVar14 = *(undefined8 *)(param_6 + 4);
  uVar15 = *(undefined8 *)(param_6 + 8);
  puStack_68[0x16] = *(undefined8 *)(param_6 + 6);
  puStack_68[0x17] = uVar15;
  puStack_68[0x14] = uVar4;
  puStack_68[0x15] = uVar14;
  *(undefined8 *)(param_6 + 6) = 0;
  *(undefined8 *)(param_6 + 8) = 0xf;
  *(undefined1 *)(param_6 + 2) = 0;
  puStack_68[0x1a] = 0;
  puStack_68[0x1b] = 0;
  puStack_68[0x18] = 0;
  puStack_68[0x19] = 0;
  uVar7 = *param_4;
  uVar8 = param_4[1];
  uVar9 = param_4[2];
  uVar10 = param_4[3];
  uVar11 = param_4[5];
  uVar12 = param_4[6];
  uVar13 = param_4[7];
  *(undefined4 *)(puStack_68 + 0x1a) = param_4[4];
  *(undefined4 *)((longlong)puStack_68 + 0xd4) = uVar11;
  *(undefined4 *)(puStack_68 + 0x1b) = uVar12;
  *(undefined4 *)((longlong)puStack_68 + 0xdc) = uVar13;
  *(undefined4 *)(puStack_68 + 0x18) = uVar7;
  *(undefined4 *)((longlong)puStack_68 + 0xc4) = uVar8;
  *(undefined4 *)(puStack_68 + 0x19) = uVar9;
  *(undefined4 *)((longlong)puStack_68 + 0xcc) = uVar10;
  *(undefined8 *)(param_4 + 4) = 0;
  *(undefined8 *)(param_4 + 6) = 0xf;
  *(undefined1 *)param_4 = 0;
  puStack_68[0x1c] = 0;
  puStack_68[0x1d] = 0;
  puStack_68[0x1e] = 0;
  puStack_68[0x1f] = 0xf;
  puStack_68[0x20] = 0;
  puStack_68[0x21] = 0;
  puStack_68[0x22] = 0;
  puStack_68[0x23] = 0xf;
  puStack_68[0x24] = 0;
  puStack_68[0x25] = 0;
  *(undefined4 *)(puStack_68 + 0x26) = 0;
  FUN_7ff70c7b21b0(&lStack_a0);
  puVar20 = puStack_68;
  puVar1 = puStack_68 + 2;
  plVar5 = puStack_68 + 7;
  if (plVar5 != &lStack_a0) {
    lVar16 = puStack_68[7];
    FUN_7ff70ca3dc90(plVar5,plVar5,*(undefined8 *)(lVar16 + 8));
    *(longlong *)(lVar16 + 8) = lVar16;
    *(longlong *)lVar16 = lVar16;
    *(longlong *)(lVar16 + 0x10) = lVar16;
    lVar16 = puVar20[7];
    puVar20[7] = lStack_a0;
    puVar20[8] = uStack_98;
    uStack_98 = (undefined8 *)0x0;
    lStack_a0 = lVar16;
  }
  FUN_7ff70ca3dc90(&lStack_a0,&lStack_a0,*(undefined8 *)(lStack_a0 + 8));
  thunk_FUN_7ff70ca90250(lStack_a0,0x60);
  FUN_7ff70c8f20c0(*(undefined8 *)*puVar20,0x200002,puVar1);
  FUN_7ff70c8f20c0(*(undefined8 *)*puStack_68,0x300003,puStack_68 + 0xe);
  uStack_78 = 0;
  FUN_7ff70c8f20c0(*(undefined8 *)*puStack_68,0x100001,&uStack_78);
  puVar1 = puStack_68;
  uVar4 = uStack_78;
  uStack_98 = (undefined8 *)0x0;
  uStack_90 = 0;
  uVar17 = FUN_7ff70cb12e80(uStack_78);
  if ((longlong)uVar17 < 0) {
    FUN_7ff70ca00780();
LAB_7ff70c8f5b78:
                    /* WARNING: Does not return */
    pcVar6 = (code *)invalidInstructionException();
    (*pcVar6)();
  }
  puVar20 = &uStack_98;
  uVar21 = 0xf;
  if (0xf < uVar17) {
    uVar18 = uVar17 | 0xf;
    uVar21 = 0x16;
    if (0x16 < uVar18) {
      uVar21 = uVar18;
    }
    if (uVar18 < 0xfff) {
      puVar20 = (undefined8 *)FUN_7ff70ca8ff40(uVar21 + 1);
      uStack_98 = puVar20;
    }
    else {
      lVar16 = FUN_7ff70ca8ff40(uVar21 + 0x28);
      puVar20 = (undefined8 *)(lVar16 + 0x27U & 0xffffffffffffffe0);
      puVar20[-1] = lVar16;
      uStack_98 = puVar20;
    }
  }
  uStack_88 = uVar17;
  uStack_80 = uVar21;
  FUN_7ff70cb12b60(puVar20,uVar4,uVar17);
  *(undefined1 *)((longlong)puVar20 + uVar17) = 0;
  uVar17 = puVar1[0xd];
  if (0xf < uVar17) {
    lVar16 = puVar1[10];
    uVar21 = uVar17 + 1;
    lVar19 = lVar16;
    if (0xfff < uVar21) {
      lVar19 = *(longlong *)(lVar16 + -8);
      if (0x1f < (ulonglong)((lVar16 + -8) - lVar19)) goto LAB_7ff70c8f5b78;
      uVar21 = uVar17 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar19,uVar21);
  }
  *(undefined4 *)(puVar1 + 0xc) = (undefined4)uStack_88;
  *(undefined4 *)((longlong)puVar1 + 100) = uStack_88._4_4_;
  *(undefined4 *)(puVar1 + 0xd) = (undefined4)uStack_80;
  *(undefined4 *)((longlong)puVar1 + 0x6c) = uStack_80._4_4_;
  *(undefined4 *)(puVar1 + 10) = (undefined4)uStack_98;
  *(undefined4 *)((longlong)puVar1 + 0x54) = uStack_98._4_4_;
  *(undefined4 *)(puVar1 + 0xb) = (undefined4)uStack_90;
  *(undefined4 *)((longlong)puVar1 + 0x5c) = uStack_90._4_4_;
  FUN_7ff70c8f20c0(*(undefined8 *)*puVar1,0x600008,puVar1 + 0x25);
  FUN_7ff70c8f20c0(*(undefined8 *)*puStack_68,0x600007,puStack_68 + 0x24);
  FUN_7ff70c8f20c0(*(undefined8 *)*puStack_68,0x200014,puStack_68 + 0x26);
  plVar5 = (longlong *)puStack_70[1];
  if (plVar5 != (longlong *)0x0) {
    LOCK();
    plVar2 = plVar5 + 1;
    *(int *)plVar2 = (int)*plVar2 + -1;
    UNLOCK();
    if ((int)*plVar2 == 0) {
      (**(code **)*plVar5)(plVar5);
      LOCK();
      piVar3 = (int *)((longlong)plVar5 + 0xc);
      *piVar3 = *piVar3 + -1;
      UNLOCK();
      if (*piVar3 == 0) {
        (**(code **)(*plVar5 + 8))(plVar5);
      }
    }
  }
  return puVar1;
}


