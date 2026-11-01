/* WARNING: Possible PIC construction at 0x0001400072b4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000140007452: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0001400073ea: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000140007382: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00014000774f: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000140007768: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00014000766f: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0001400075e2: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000140007555: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000140006df6: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00014000755b) */
/* WARNING: Removing unreachable block (ram,0x0001400075e8) */
/* WARNING: Removing unreachable block (ram,0x000140007675) */
/* WARNING: Removing unreachable block (ram,0x00014000776e) */
/* WARNING: Removing unreachable block (ram,0x000140007755) */
/* WARNING: Removing unreachable block (ram,0x000140007388) */
/* WARNING: Removing unreachable block (ram,0x0001400073f0) */
/* WARNING: Removing unreachable block (ram,0x000140007458) */
/* WARNING: Removing unreachable block (ram,0x0001400072b9) */
/* WARNING: Removing unreachable block (ram,0x0001400072c4) */
/* WARNING: Removing unreachable block (ram,0x000140006dfb) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_140005400(longlong param_1)

{
  undefined4 *puVar1;
  undefined1 auVar2 [16];
  short sVar3;
  undefined2 uVar4;
  undefined8 uVar5;
  longlong *plVar6;
  longlong lVar7;
  undefined1 (*pauVar8) [16];
  code *pcVar9;
  undefined1 auVar10 [16];
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  char cVar15;
  char cVar16;
  char cVar17;
  char cVar18;
  char cVar19;
  char cVar20;
  char cVar21;
  char cVar22;
  char cVar23;
  char cVar24;
  char cVar25;
  char cVar26;
  char cVar27;
  char cVar28;
  char cVar29;
  ulonglong *puVar30;
  char cVar31;
  char cVar32;
  undefined4 uVar33;
  int iVar34;
  uint uVar35;
  longlong lVar36;
  longlong lVar37;
  undefined8 *puVar38;
  undefined1 *puVar39;
  undefined8 uVar40;
  longlong lVar41;
  undefined4 uVar42;
  char *pcVar43;
  undefined8 uVar44;
  undefined1 *puVar45;
  undefined1 *puVar46;
  undefined8 uVar47;
  bool bVar48;
  undefined1 auVar49 [16];
  undefined8 unaff_XMM6_Qa;
  undefined8 unaff_XMM6_Qb;
  undefined8 uVar50;
  undefined8 uStackX_8;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStack_48;
  
  uStack_48 = 0x140005416;
  lVar36 = FUN_140c6a6b0();
  lVar36 = -lVar36;
  *(undefined8 *)(&stack0x00001040 + lVar36) = unaff_XMM6_Qa;
  *(undefined8 *)(&stack0x00001048 + lVar36) = unaff_XMM6_Qb;
  *(undefined8 *)(&stack0x00001038 + lVar36) = 0xfffffffffffffffe;
  lVar41 = *(longlong *)(param_1 + 0x88);
  lVar37 = *(longlong *)(lVar41 + 0x1370);
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000544b;
  lVar37 = FUN_1401ed950(lVar37 + 0x10);
  if (lVar37 == 0) {
    *(undefined **)(&stack0x00000ca0 + lVar36) = &UNK_140cdbc50;
    *(undefined8 *)(&stack0x00000ca8 + lVar36) = 0x17;
    *(undefined1 **)(&stack0x000004b0 + lVar36) = &stack0x00000ca0 + lVar36;
    goto LAB_140006c11;
  }
  pcVar43 = (char *)(lVar37 + 0x9e);
  LOCK();
  bVar48 = *(char *)(lVar37 + 0x9e) == '\0';
  if (bVar48) {
    *(char *)(lVar37 + 0x9e) = '\x01';
  }
  UNLOCK();
  if (!bVar48) {
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006c43;
    FUN_140c992d0(pcVar43);
  }
  puVar30 = _DAT_14119ede8;
  if ((*_DAT_14119ede8 & 0x7fffffffffffffff) == 0) {
    uVar35 = 0;
    cVar32 = *(char *)(lVar37 + 0x9f);
  }
  else {
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006c4d;
    uVar35 = func_0x000140c9a010();
    uVar35 = uVar35 ^ 1;
    cVar32 = *(char *)(lVar37 + 0x9f);
  }
  if (cVar32 != '\0') {
    *(char **)(&stack0x000004b0 + lVar36) = pcVar43;
    (&stack0x000004b8)[lVar36] = (char)uVar35;
    *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9e070;
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006c96;
    FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x000004b0 + lVar36,&UNK_140cdb428);
    goto LAB_1400077cd;
  }
  if (*(char *)(lVar37 + 0xa0) != '\0') {
    *(uint *)(&stack0x00001018 + lVar36) = uVar35;
    *(char **)(&stack0x00001000 + lVar36) = pcVar43;
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400054c2;
    FUN_140002800(&UNK_140c9e0a0,0x23);
    if (((&stack0x00001018)[lVar36] == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0)) {
      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006e47;
      cVar32 = func_0x000140c9a010();
      if (cVar32 == '\0') {
        *(undefined1 *)(lVar37 + 0x9f) = 1;
      }
    }
    pcVar43 = *(char **)(&stack0x00001000 + lVar36);
    LOCK();
    cVar32 = *pcVar43;
    *pcVar43 = '\0';
    UNLOCK();
    if (cVar32 != '\x02') {
      return;
    }
    goto code_r0x000140c99390;
  }
  *(undefined1 *)(lVar37 + 0xa0) = 1;
  if (((char)uVar35 == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0)) {
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006e2e;
    cVar32 = func_0x000140c9a010();
    if (cVar32 == '\0') {
      *(undefined1 *)(lVar37 + 0x9f) = 1;
    }
  }
  LOCK();
  cVar32 = *pcVar43;
  *pcVar43 = '\0';
  UNLOCK();
  if (cVar32 == '\x02') {
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006dfb;
    goto code_r0x000140c99390;
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005546;
  FUN_140002800(&UNK_140c9daf3,0x20);
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005552;
  FUN_1400394a0(&stack0x000004b0 + lVar36);
  uVar44 = *(undefined8 *)(&stack0x000004b8 + lVar36);
  if (SBORROW8(0,*(longlong *)(&stack0x000004b0 + lVar36))) {
    puVar38 = *(undefined8 **)(&stack0x000004c0 + lVar36);
    uVar50 = *(undefined8 *)(&stack0x000004c8 + lVar36);
  }
  else {
    *(longlong *)(&stack0x00001018 + lVar36) = *(longlong *)(&stack0x000004b0 + lVar36);
    uVar50 = *(undefined8 *)(&stack0x000004c0 + lVar36);
    (&stack0x000004b0)[lVar36] = 1;
    *(undefined8 *)(&stack0x00001000 + lVar36) = uVar44;
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400055a0;
    lVar37 = FUN_140c31be0(&stack0x000004b0 + lVar36,uVar44,uVar50);
    if (lVar37 == 0) {
      *(undefined8 *)(&stack0xffffffffffffffe0 + lVar36) = 0xc;
      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005663;
      FUN_140c29d60(&stack0x00000c80 + lVar36,*(undefined8 *)(&stack0x00001000 + lVar36),uVar50,
                    &UNK_140cb94ad);
      uVar47 = *(undefined8 *)(&stack0x00000c88 + lVar36);
      uVar44 = *(undefined8 *)(&stack0x00000c90 + lVar36);
      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005684;
      FUN_140c39760(&stack0x000004b0 + lVar36,uVar47,uVar44);
      if (*(int *)(&stack0x000004b0 + lVar36) == 2) {
        *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
        *(undefined8 *)(&stack0x00000ca0 + lVar36) = 2;
LAB_14000570d:
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005719;
        FUN_14004b880(&stack0x00000ca8 + lVar36);
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000572b;
        FUN_140002800(&UNK_140cb95e8,0x3e);
        lVar37 = *(longlong *)(lVar41 + 0x1370);
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000573c;
        lVar37 = FUN_1401ee980(lVar37 + 0x10);
        if (lVar37 == 0) {
          *(undefined **)(&stack0xfffffffffffffff0 + lVar36) = &UNK_140cdc130;
          *(undefined8 *)(&stack0xfffffffffffffff8 + lVar36) = 0x53;
          *(undefined1 **)(&stack0x000004b0 + lVar36) = &stack0xfffffffffffffff0 + lVar36;
          *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_14010b520;
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400070dd;
          FUN_140c9b080(&UNK_140cdc0ec,&stack0x000004b0 + lVar36,&UNK_140cdc118);
          goto LAB_1400077cd;
        }
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005755;
        FUN_140092650(&stack0x00000ca0 + lVar36,lVar37);
        if (*(longlong *)(&stack0x00000ca0 + lVar36) == -0x7fffffffffffffdd) {
          *(undefined8 *)(&stack0x00001028 + lVar36) = *(undefined8 *)(&stack0x00000ca8 + lVar36);
          *(undefined8 *)(&stack0xffffffffffffffe0 + lVar36) = 0xc;
          *(undefined8 *)(&stack0x00001008 + lVar36) = *(undefined8 *)(&stack0x00000cb0 + lVar36);
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400057ac;
          FUN_140c29d60(&stack0x00000250 + lVar36,*(undefined8 *)(&stack0x00000cb0 + lVar36),
                        *(undefined8 *)(&stack0x00000cb8 + lVar36),&UNK_140cb94ad);
          if (*(longlong *)(&stack0x00001028 + lVar36) != 0) {
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400057cb;
            func_0x000140001090(*(undefined8 *)(&stack0x00001008 + lVar36),
                                *(longlong *)(&stack0x00001028 + lVar36),1);
          }
          uVar40 = *(undefined8 *)(&stack0x00000260 + lVar36);
          *(undefined8 *)(&stack0x00001028 + lVar36) = *(undefined8 *)(&stack0x00000258 + lVar36);
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400057ef;
          FUN_140c39760(&stack0x000004b0 + lVar36,*(undefined8 *)(&stack0x00000258 + lVar36),uVar40)
          ;
          if (*(int *)(&stack0x000004b0 + lVar36) == 2) {
            *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
            *(undefined8 *)(&stack0x00000ca0 + lVar36) = 2;
LAB_140005924:
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005930;
            FUN_14004b880(&stack0x00000ca8 + lVar36);
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005942;
            FUN_140002800(&UNK_140cb9626,0x1f);
LAB_140005943:
            if (*(longlong *)(&stack0x00000250 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005961;
              func_0x000140001090(*(undefined8 *)(&stack0x00001028 + lVar36),
                                  *(longlong *)(&stack0x00000250 + lVar36),1);
            }
            goto LAB_140005962;
          }
          *(undefined8 *)(&stack0x00000ca0 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
          *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
          *(undefined8 *)(&stack0x00000cf0 + lVar36) = *(undefined8 *)(&stack0x00000500 + lVar36);
          *(undefined8 *)(&stack0x00000ce0 + lVar36) = *(undefined8 *)(&stack0x000004f0 + lVar36);
          *(undefined8 *)(&stack0x00000ce8 + lVar36) = *(undefined8 *)(&stack0x000004f8 + lVar36);
          *(undefined4 *)(&stack0x00000cd0 + lVar36) = *(undefined4 *)(&stack0x000004e0 + lVar36);
          *(undefined4 *)(&stack0x00000cd4 + lVar36) = *(undefined4 *)(&stack0x000004e4 + lVar36);
          *(undefined4 *)(&stack0x00000cd8 + lVar36) = *(undefined4 *)(&stack0x000004e8 + lVar36);
          *(undefined4 *)(&stack0x00000cdc + lVar36) = *(undefined4 *)(&stack0x000004ec + lVar36);
          *(undefined4 *)(&stack0x00000cc0 + lVar36) = *(undefined4 *)(&stack0x000004d0 + lVar36);
          *(undefined4 *)(&stack0x00000cc4 + lVar36) = *(undefined4 *)(&stack0x000004d4 + lVar36);
          *(undefined4 *)(&stack0x00000cc8 + lVar36) = *(undefined4 *)(&stack0x000004d8 + lVar36);
          *(undefined4 *)(&stack0x00000ccc + lVar36) = *(undefined4 *)(&stack0x000004dc + lVar36);
          *(undefined4 *)(&stack0x00000cb0 + lVar36) = *(undefined4 *)(&stack0x000004c0 + lVar36);
          *(undefined4 *)(&stack0x00000cb4 + lVar36) = *(undefined4 *)(&stack0x000004c4 + lVar36);
          *(undefined4 *)(&stack0x00000cb8 + lVar36) = *(undefined4 *)(&stack0x000004c8 + lVar36);
          *(undefined4 *)(&stack0x00000cbc + lVar36) = *(undefined4 *)(&stack0x000004cc + lVar36);
          if (*(longlong *)(&stack0x00000ca0 + lVar36) == 2) goto LAB_140005924;
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005c81;
          lVar37 = FUN_140c393b0(*(undefined8 *)(&stack0x00001028 + lVar36),uVar40,uVar47,uVar44);
          if (lVar37 != 1) goto LAB_140005943;
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005c98;
          FUN_140003820(&stack0x000004b0 + lVar36);
          uVar44 = *(undefined8 *)(&stack0x000004b0 + lVar36);
          puVar38 = *(undefined8 **)(&stack0x000004b8 + lVar36);
          uVar50 = *(undefined8 *)(&stack0x000004c0 + lVar36);
          lVar41 = *(longlong *)(&stack0x00000250 + lVar36);
          if (lVar41 == 0) goto LAB_140005a54;
          uVar40 = *(undefined8 *)(&stack0x00001028 + lVar36);
LAB_140005f65:
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005f6a;
          func_0x000140001090(uVar40,lVar41,1);
        }
        else {
          *(undefined4 *)(&stack0x000004d0 + lVar36) = *(undefined4 *)(&stack0x00000cc0 + lVar36);
          *(undefined4 *)(&stack0x000004d4 + lVar36) = *(undefined4 *)(&stack0x00000cc4 + lVar36);
          *(undefined4 *)(&stack0x000004d8 + lVar36) = *(undefined4 *)(&stack0x00000cc8 + lVar36);
          *(undefined4 *)(&stack0x000004dc + lVar36) = *(undefined4 *)(&stack0x00000ccc + lVar36);
          *(undefined4 *)(&stack0x000004c0 + lVar36) = *(undefined4 *)(&stack0x00000cb0 + lVar36);
          *(undefined4 *)(&stack0x000004c4 + lVar36) = *(undefined4 *)(&stack0x00000cb4 + lVar36);
          *(undefined4 *)(&stack0x000004c8 + lVar36) = *(undefined4 *)(&stack0x00000cb8 + lVar36);
          *(undefined4 *)(&stack0x000004cc + lVar36) = *(undefined4 *)(&stack0x00000cbc + lVar36);
          *(undefined8 *)(&stack0x000004b0 + lVar36) = *(undefined8 *)(&stack0x00000ca0 + lVar36);
          *(undefined8 *)(&stack0x000004b8 + lVar36) = *(undefined8 *)(&stack0x00000ca8 + lVar36);
          *(undefined8 *)(&stack0x00000f90 + lVar36) = 0;
          *(undefined8 *)(&stack0x00000f98 + lVar36) = 1;
          *(undefined8 *)(&stack0x00000fa0 + lVar36) = 0;
          *(undefined8 *)(&stack0x00000000 + lVar36) = 0x60000020;
          *(undefined1 **)(&stack0xfffffffffffffff0 + lVar36) = &stack0x00000f90 + lVar36;
          *(undefined **)(&stack0xfffffffffffffff8 + lVar36) = &UNK_140cdb0d0;
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005896;
          cVar32 = FUN_1409c33f0(&stack0x000004b0 + lVar36,&stack0xfffffffffffffff0 + lVar36);
          if (cVar32 != '\0') {
            *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140cdb188;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400071f2;
            FUN_140c9ae20(&UNK_140cdb100,0x37,&stack0x00001017 + lVar36,&UNK_140cdb218);
            goto LAB_1400077cd;
          }
          uVar44 = *(undefined8 *)(&stack0x00000f90 + lVar36);
          puVar38 = *(undefined8 **)(&stack0x00000f98 + lVar36);
          uVar50 = *(undefined8 *)(&stack0x00000fa0 + lVar36);
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400058ba;
          FUN_14004acd0(&stack0x000004b0 + lVar36);
        }
      }
      else {
        *(undefined8 *)(&stack0x00000ca0 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
        *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
        *(undefined8 *)(&stack0x00000cf0 + lVar36) = *(undefined8 *)(&stack0x00000500 + lVar36);
        *(undefined8 *)(&stack0x00000ce0 + lVar36) = *(undefined8 *)(&stack0x000004f0 + lVar36);
        *(undefined8 *)(&stack0x00000ce8 + lVar36) = *(undefined8 *)(&stack0x000004f8 + lVar36);
        *(undefined8 *)(&stack0x00000cd0 + lVar36) = *(undefined8 *)(&stack0x000004e0 + lVar36);
        *(undefined8 *)(&stack0x00000cd8 + lVar36) = *(undefined8 *)(&stack0x000004e8 + lVar36);
        *(undefined8 *)(&stack0x00000cc0 + lVar36) = *(undefined8 *)(&stack0x000004d0 + lVar36);
        *(undefined8 *)(&stack0x00000cc8 + lVar36) = *(undefined8 *)(&stack0x000004d8 + lVar36);
        *(undefined8 *)(&stack0x00000cb0 + lVar36) = *(undefined8 *)(&stack0x000004c0 + lVar36);
        *(undefined8 *)(&stack0x00000cb8 + lVar36) = *(undefined8 *)(&stack0x000004c8 + lVar36);
        if (*(longlong *)(&stack0x00000ca0 + lVar36) == 2) goto LAB_14000570d;
LAB_140005962:
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005974;
        uVar40 = uVar47;
        FUN_140c39760(&stack0x000004b0 + lVar36,uVar47,uVar44);
        uVar42 = (undefined4)uVar40;
        if (*(int *)(&stack0x000004b0 + lVar36) == 2) {
          *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
          *(undefined8 *)(&stack0x00000ca0 + lVar36) = 2;
        }
        else {
          *(undefined8 *)(&stack0x00000ca0 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
          *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
          *(undefined8 *)(&stack0x00000cf0 + lVar36) = *(undefined8 *)(&stack0x00000500 + lVar36);
          *(undefined8 *)(&stack0x00000ce0 + lVar36) = *(undefined8 *)(&stack0x000004f0 + lVar36);
          *(undefined8 *)(&stack0x00000ce8 + lVar36) = *(undefined8 *)(&stack0x000004f8 + lVar36);
          *(undefined4 *)(&stack0x00000cd0 + lVar36) = *(undefined4 *)(&stack0x000004e0 + lVar36);
          *(undefined4 *)(&stack0x00000cd4 + lVar36) = *(undefined4 *)(&stack0x000004e4 + lVar36);
          *(undefined4 *)(&stack0x00000cd8 + lVar36) = *(undefined4 *)(&stack0x000004e8 + lVar36);
          *(undefined4 *)(&stack0x00000cdc + lVar36) = *(undefined4 *)(&stack0x000004ec + lVar36);
          *(undefined4 *)(&stack0x00000cc0 + lVar36) = *(undefined4 *)(&stack0x000004d0 + lVar36);
          *(undefined4 *)(&stack0x00000cc4 + lVar36) = *(undefined4 *)(&stack0x000004d4 + lVar36);
          *(undefined4 *)(&stack0x00000cc8 + lVar36) = *(undefined4 *)(&stack0x000004d8 + lVar36);
          *(undefined4 *)(&stack0x00000ccc + lVar36) = *(undefined4 *)(&stack0x000004dc + lVar36);
          *(undefined4 *)(&stack0x00000cb0 + lVar36) = *(undefined4 *)(&stack0x000004c0 + lVar36);
          *(undefined4 *)(&stack0x00000cb4 + lVar36) = *(undefined4 *)(&stack0x000004c4 + lVar36);
          *(undefined4 *)(&stack0x00000cb8 + lVar36) = *(undefined4 *)(&stack0x000004c8 + lVar36);
          *(undefined4 *)(&stack0x00000cbc + lVar36) = *(undefined4 *)(&stack0x000004cc + lVar36);
          if (*(longlong *)(&stack0x00000ca0 + lVar36) != 2) {
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005bfe;
            uVar33 = FUN_140c2ae60();
            *(undefined4 *)(&stack0xfffffffffffffff0 + lVar36) = uVar33;
            *(undefined4 *)(&stack0xfffffffffffffff4 + lVar36) = uVar42;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005c21;
            func_0x000140c2ae10(&stack0x00000250 + lVar36,&stack0xfffffffffffffff0 + lVar36,
                                0xd53e8000,0x19db1de);
            if (*(int *)(&stack0x00000250 + lVar36) == 1) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005c34;
              func_0x0001400010c0();
              lVar37 = 1;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005c49;
              puVar39 = (undefined1 *)func_0x000140001080(1,1);
              if (puVar39 == (undefined1 *)0x0) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400077cc;
                FUN_140c9ab0b(1,1);
                goto LAB_1400077cd;
              }
              *puVar39 = 0x30;
              *(undefined8 *)(&stack0x00000fd8 + lVar36) = 1;
              *(undefined1 **)(&stack0x00000fe0 + lVar36) = puVar39;
            }
            else {
              auVar2._8_8_ = 0;
              auVar2._0_8_ = *(ulonglong *)(&stack0x00000258 + lVar36);
              auVar10._8_8_ = 0;
              auVar10._0_8_ = (ulonglong)*(uint *)(&stack0x00000260 + lVar36) / 1000000;
              auVar10 = ZEXT816(1000) * auVar2 + auVar10;
              lVar37 = auVar10._8_8_;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005d00;
              uVar40 = FUN_140c51350(auVar10._0_8_,lVar37,&stack0x000004b0 + lVar36,0x27);
              *(undefined8 *)(&stack0x00001008 + lVar36) = uVar40;
              *(undefined8 *)(&stack0x00001028 + lVar36) = uVar47;
              *(undefined8 *)(&stack0xffffffffffffffe0 + lVar36) = 1;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005d2f;
              FUN_140090850(&stack0x00000ca0 + lVar36);
              uVar47 = *(undefined8 *)(&stack0x00000ca8 + lVar36);
              if (*(int *)(&stack0x00000ca0 + lVar36) == 1) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007207;
                FUN_140c9ab0b(uVar47,*(undefined8 *)(&stack0x00000cb0 + lVar36));
                goto LAB_1400077cd;
              }
              uVar40 = *(undefined8 *)(&stack0x00000cb0 + lVar36);
              if (lVar37 != 0) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005d61;
                FUN_140c70710(uVar40,*(undefined8 *)(&stack0x00001008 + lVar36),lVar37);
              }
              *(undefined8 *)(&stack0x00000fd8 + lVar36) = uVar47;
              *(undefined8 *)(&stack0x00000fe0 + lVar36) = uVar40;
              uVar47 = *(undefined8 *)(&stack0x00001028 + lVar36);
            }
            *(longlong *)(&stack0x00000fe8 + lVar36) = lVar37;
            *(undefined1 **)(&stack0x000004b0 + lVar36) = &stack0x00000fd8 + lVar36;
            *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_140001280;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005db3;
            FUN_140c4eb10(&stack0x00000c48 + lVar36,&UNK_140cb965b,&stack0x000004b0 + lVar36);
            *(undefined8 *)(&stack0xffffffffffffffe0 + lVar36) =
                 *(undefined8 *)(&stack0x00000c58 + lVar36);
            *(undefined8 *)(&stack0x00001028 + lVar36) = *(undefined8 *)(&stack0x00000c50 + lVar36);
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005de4;
            FUN_140c29d60(&stack0x00000f70 + lVar36,*(undefined8 *)(&stack0x00001000 + lVar36),
                          uVar50);
            if (*(longlong *)(&stack0x00000c48 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005e03;
              func_0x000140001090(*(undefined8 *)(&stack0x00001028 + lVar36),
                                  *(longlong *)(&stack0x00000c48 + lVar36),1);
            }
            uVar40 = *(undefined8 *)(&stack0x00000f78 + lVar36);
            uVar5 = *(undefined8 *)(&stack0x00000f80 + lVar36);
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005e22;
            lVar37 = FUN_140c393b0(uVar47,uVar44,uVar40,uVar5);
            if (lVar37 == 1) {
              *(undefined8 *)(&stack0x00000250 + lVar36) = uVar44;
              *(undefined1 **)(&stack0x00000ca0 + lVar36) = &stack0x00000250 + lVar36;
              *(code **)(&stack0x00000ca8 + lVar36) = FUN_140c43150;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005e6d;
              FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140cb9693,&stack0x00000ca0 + lVar36);
              *(undefined8 *)(&stack0x00001028 + lVar36) =
                   *(undefined8 *)(&stack0x000004b0 + lVar36);
              *(undefined8 *)(&stack0x00001008 + lVar36) =
                   *(undefined8 *)(&stack0x000004b8 + lVar36);
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005e96;
              FUN_140002800(*(undefined8 *)(&stack0x000004b8 + lVar36),
                            *(undefined8 *)(&stack0x000004c0 + lVar36));
              if (*(longlong *)(&stack0x00001028 + lVar36) != 0) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005eb5;
                func_0x000140001090(*(undefined8 *)(&stack0x00001008 + lVar36),
                                    *(longlong *)(&stack0x00001028 + lVar36),1);
              }
              *(undefined8 *)(&stack0x00000ca0 + lVar36) = 0;
              *(undefined8 *)(&stack0x00000ca8 + lVar36) = 1;
              *(undefined8 *)(&stack0x00000cb0 + lVar36) = 0;
              *(undefined8 *)(&stack0x000004c0 + lVar36) = 0x60000020;
              *(undefined1 **)(&stack0x000004b0 + lVar36) = &stack0x00000ca0 + lVar36;
              *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_140cdb0d0;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005f09;
              cVar32 = FUN_140c43150(&stack0x00000250 + lVar36,&stack0x000004b0 + lVar36);
              if (cVar32 != '\0') {
                *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140cdb188;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007238;
                FUN_140c9ae20(&UNK_140cdb100,0x37,&stack0x00001017 + lVar36,&UNK_140cdb218);
                goto LAB_1400077cd;
              }
              uVar44 = *(undefined8 *)(&stack0x00000ca0 + lVar36);
              puVar38 = *(undefined8 **)(&stack0x00000ca8 + lVar36);
              uVar50 = *(undefined8 *)(&stack0x00000cb0 + lVar36);
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005f2d;
              FUN_14004b880(&stack0x00000250 + lVar36);
              if (*(longlong *)(&stack0x00000f70 + lVar36) != 0) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005f48;
                func_0x000140001090(uVar40,*(longlong *)(&stack0x00000f70 + lVar36),1);
              }
              lVar41 = *(longlong *)(&stack0x00000fd8 + lVar36);
              if (lVar41 != 0) {
                uVar40 = *(undefined8 *)(&stack0x00000fe0 + lVar36);
                goto LAB_140005f65;
              }
              goto LAB_140005a54;
            }
            *(undefined8 *)(&stack0x00000250 + lVar36) = uVar40;
            *(undefined8 *)(&stack0x00000258 + lVar36) = uVar5;
            *(undefined1 **)(&stack0x00000ca0 + lVar36) = &stack0x00000250 + lVar36;
            *(undefined **)(&stack0x00000ca8 + lVar36) = &UNK_140c41ef0;
            puVar39 = &stack0x00000ca0 + lVar36;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005fb6;
            FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140cb9673,puVar39);
            *(undefined8 *)(&stack0x00001028 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
            *(undefined8 *)(&stack0x00001008 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005fdf;
            FUN_140002800(*(undefined8 *)(&stack0x000004b8 + lVar36),
                          *(undefined8 *)(&stack0x000004c0 + lVar36));
            if (*(longlong *)(&stack0x00001028 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005ffe;
              func_0x000140001090(*(undefined8 *)(&stack0x00001008 + lVar36),
                                  *(longlong *)(&stack0x00001028 + lVar36),1);
            }
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006015;
            FUN_140c39850(&stack0x000004b0 + lVar36,*(undefined8 *)(&stack0x00001000 + lVar36),
                          uVar50);
            if (*(int *)(&stack0x000004b0 + lVar36) == 2) {
              *(undefined8 *)(&stack0x00000ca8 + lVar36) =
                   *(undefined8 *)(&stack0x000004b8 + lVar36);
              *(undefined8 *)(&stack0x00000ca0 + lVar36) = 2;
LAB_14000636e:
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000637a;
              FUN_14004b880(&stack0x00000ca8 + lVar36);
            }
            else {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006056;
              FUN_140c70710(&stack0x00000ca0 + lVar36,&stack0x000004b0 + lVar36,0x270);
              if (*(longlong *)(&stack0x00000ca0 + lVar36) == 2) goto LAB_14000636e;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000607d;
              FUN_140c70710(&stack0x00000970 + lVar36,&stack0x00000ca0 + lVar36,0x270);
              cVar29 = UNK_140c9d08f;
              cVar28 = UNK_140c9d08e;
              cVar27 = UNK_140c9d08d;
              cVar26 = UNK_140c9d08c;
              cVar25 = UNK_140c9d08b;
              cVar24 = UNK_140c9d08a;
              cVar23 = UNK_140c9d089;
              cVar22 = UNK_140c9d088;
              cVar21 = UNK_140c9d087;
              cVar20 = UNK_140c9d086;
              cVar19 = UNK_140c9d085;
              cVar18 = UNK_140c9d084;
              cVar17 = UNK_140c9d083;
              cVar16 = UNK_140c9d082;
              cVar15 = UNK_140c9d081;
              cVar32 = DAT_140c9d080;
              *(undefined8 *)(&stack0x000004b0 + lVar36) = 0;
              *(undefined8 *)(&stack0x00000710 + lVar36) = 0;
              puVar46 = &stack0x000004b0 + lVar36;
              puVar39 = &stack0x00000250 + lVar36;
              puVar45 = &stack0x00000f58 + lVar36;
              while( true ) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400060c6;
                FUN_140001460(&stack0xfffffffffffffff0 + lVar36,puVar46);
                if (*(longlong *)(&stack0xfffffffffffffff0 + lVar36) == 0) break;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400060e3;
                FUN_140c70710(puVar39,&stack0xfffffffffffffff0 + lVar36,600);
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400060ef;
                FUN_140c31bc0(&stack0x00000c28 + lVar36,puVar39);
                *(undefined8 *)(&stack0x00001028 + lVar36) =
                     *(undefined8 *)(&stack0x00000c30 + lVar36);
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000610d;
                FUN_140c4e470(puVar45,*(undefined8 *)(&stack0x00000c30 + lVar36),
                              *(undefined8 *)(&stack0x00000c38 + lVar36));
                pcVar43 = *(char **)(&stack0x00000f60 + lVar36);
                if (((0xf < *(ulonglong *)(&stack0x00000f68 + lVar36)) &&
                    (auVar49[0] = -(*pcVar43 == cVar32), auVar49[1] = -(pcVar43[1] == cVar15),
                    auVar49[2] = -(pcVar43[2] == cVar16), auVar49[3] = -(pcVar43[3] == cVar17),
                    auVar49[4] = -(pcVar43[4] == cVar18), auVar49[5] = -(pcVar43[5] == cVar19),
                    auVar49[6] = -(pcVar43[6] == cVar20), auVar49[7] = -(pcVar43[7] == cVar21),
                    auVar49[8] = -(pcVar43[8] == cVar22), auVar49[9] = -(pcVar43[9] == cVar23),
                    auVar49[10] = -(pcVar43[10] == cVar24), auVar49[0xb] = -(pcVar43[0xb] == cVar25)
                    , auVar49[0xc] = -(pcVar43[0xc] == cVar26),
                    auVar49[0xd] = -(pcVar43[0xd] == cVar27),
                    auVar49[0xe] = -(pcVar43[0xe] == cVar28),
                    auVar49[0xf] = -(pcVar43[0xf] == cVar29),
                    (ushort)((ushort)(SUB161(auVar49 >> 7,0) & 1) |
                             (ushort)(SUB161(auVar49 >> 0xf,0) & 1) << 1 |
                             (ushort)(SUB161(auVar49 >> 0x17,0) & 1) << 2 |
                             (ushort)(SUB161(auVar49 >> 0x1f,0) & 1) << 3 |
                             (ushort)(SUB161(auVar49 >> 0x27,0) & 1) << 4 |
                             (ushort)(SUB161(auVar49 >> 0x2f,0) & 1) << 5 |
                             (ushort)(SUB161(auVar49 >> 0x37,0) & 1) << 6 |
                             (ushort)(SUB161(auVar49 >> 0x3f,0) & 1) << 7 |
                             (ushort)(SUB161(auVar49 >> 0x47,0) & 1) << 8 |
                             (ushort)(SUB161(auVar49 >> 0x4f,0) & 1) << 9 |
                             (ushort)(SUB161(auVar49 >> 0x57,0) & 1) << 10 |
                             (ushort)(SUB161(auVar49 >> 0x5f,0) & 1) << 0xb |
                             (ushort)(SUB161(auVar49 >> 0x67,0) & 1) << 0xc |
                             (ushort)(SUB161(auVar49 >> 0x6f,0) & 1) << 0xd |
                             (ushort)(SUB161(auVar49 >> 0x77,0) & 1) << 0xe |
                            (ushort)(auVar49[0xf] >> 7) << 0xf) == 0xffff)) &&
                   (*(int *)(pcVar43 + (*(ulonglong *)(&stack0x00000f68 + lVar36) - 4)) ==
                    0x6c6c642e)) {
                  *(char **)(&stack0x00001008 + lVar36) = pcVar43;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006162;
                  FUN_140c31ab0(&stack0x00000c60 + lVar36,puVar39);
                  uVar44 = *(undefined8 *)(&stack0x00000f78 + lVar36);
                  uVar50 = *(undefined8 *)(&stack0x00000f80 + lVar36);
                  *(undefined8 *)(&stack0x00000ff8 + lVar36) =
                       *(undefined8 *)(&stack0x00000c68 + lVar36);
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006195;
                  FUN_140c294a0(&stack0x00000be8 + lVar36,*(undefined8 *)(&stack0x00000c68 + lVar36)
                                ,*(undefined8 *)(&stack0x00000c70 + lVar36));
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400061a8;
                  FUN_140c294a0(&stack0x00000f18 + lVar36,uVar44,uVar50);
                  if (((*(longlong *)(&stack0x00000bf0 + lVar36) ==
                        *(longlong *)(&stack0x00000f20 + lVar36)) &&
                      ((&stack0x00000c20)[lVar36] == (&stack0x00000f50)[lVar36])) &&
                     (((&stack0x00000c21)[lVar36] == '\x02' &&
                      (((&stack0x00000f51)[lVar36] == '\x02' &&
                       ((byte)(&stack0x00000f28)[lVar36] < 3 == (byte)(&stack0x00000bf8)[lVar36] < 3
                       )))))) {
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006205;
                    iVar34 = FUN_140c70da0(*(undefined8 *)(&stack0x00000be8 + lVar36),
                                           *(undefined8 *)(&stack0x00000f18 + lVar36));
                    if (iVar34 != 0) goto LAB_140006209;
LAB_14000625b:
                    puVar45 = &stack0x00000f58 + lVar36;
                    if (*(longlong *)(&stack0x00000c60 + lVar36) != 0) {
                      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006283;
                      func_0x000140001090(*(undefined8 *)(&stack0x00000ff8 + lVar36),
                                          *(longlong *)(&stack0x00000c60 + lVar36),1);
                    }
                    puVar46 = &stack0x000004b0 + lVar36;
                  }
                  else {
LAB_140006209:
                    *(undefined4 *)(&stack0x00000fc0 + lVar36) =
                         *(undefined4 *)(&stack0x00000f48 + lVar36);
                    *(undefined4 *)(&stack0x00000fc4 + lVar36) =
                         *(undefined4 *)(&stack0x00000f4c + lVar36);
                    *(undefined4 *)(&stack0x00000fc8 + lVar36) =
                         *(undefined4 *)(&stack0x00000f50 + lVar36);
                    *(undefined4 *)(&stack0x00000fcc + lVar36) =
                         *(undefined4 *)(&stack0x00000f54 + lVar36);
                    *(undefined4 *)(&stack0x00000fb0 + lVar36) =
                         *(undefined4 *)(&stack0x00000f38 + lVar36);
                    *(undefined4 *)(&stack0x00000fb4 + lVar36) =
                         *(undefined4 *)(&stack0x00000f3c + lVar36);
                    *(undefined4 *)(&stack0x00000fb8 + lVar36) =
                         *(undefined4 *)(&stack0x00000f40 + lVar36);
                    *(undefined4 *)(&stack0x00000fbc + lVar36) =
                         *(undefined4 *)(&stack0x00000f44 + lVar36);
                    *(undefined4 *)(&stack0x00000fa0 + lVar36) =
                         *(undefined4 *)(&stack0x00000f28 + lVar36);
                    *(undefined4 *)(&stack0x00000fa4 + lVar36) =
                         *(undefined4 *)(&stack0x00000f2c + lVar36);
                    *(undefined4 *)(&stack0x00000fa8 + lVar36) =
                         *(undefined4 *)(&stack0x00000f30 + lVar36);
                    *(undefined4 *)(&stack0x00000fac + lVar36) =
                         *(undefined4 *)(&stack0x00000f34 + lVar36);
                    *(undefined8 *)(&stack0x00000f90 + lVar36) =
                         *(undefined8 *)(&stack0x00000f18 + lVar36);
                    *(undefined8 *)(&stack0x00000f98 + lVar36) =
                         *(undefined8 *)(&stack0x00000f20 + lVar36);
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006256;
                    cVar31 = FUN_1400d3620(&stack0x00000be8 + lVar36,&stack0x00000f90 + lVar36);
                    if (cVar31 != '\0') goto LAB_14000625b;
                    puVar45 = &stack0x00000f58 + lVar36;
                    if (*(longlong *)(&stack0x00000c60 + lVar36) != 0) {
                      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400062b4;
                      func_0x000140001090(*(undefined8 *)(&stack0x00000ff8 + lVar36),
                                          *(longlong *)(&stack0x00000c60 + lVar36),1);
                    }
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400062c4;
                    FUN_140c31ab0(&stack0x00000f90 + lVar36,puVar39);
                    puVar46 = &stack0x000004b0 + lVar36;
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400062d8;
                    lVar37 = FUN_140078960(&stack0x00000f90 + lVar36);
                    *(longlong *)(&stack0x00000f18 + lVar36) = lVar37;
                    if (lVar37 != 0) {
                      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400062f1;
                      FUN_14004b880(&stack0x00000f18 + lVar36);
                    }
                  }
                  pcVar43 = *(char **)(&stack0x00001008 + lVar36);
                }
                if (0 < *(longlong *)(&stack0x00000f58 + lVar36)) {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006313;
                  func_0x000140001090(pcVar43,*(longlong *)(&stack0x00000f58 + lVar36),1);
                }
                if (*(longlong *)(&stack0x00000c28 + lVar36) != 0) {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006331;
                  func_0x000140001090(*(undefined8 *)(&stack0x00001028 + lVar36),
                                      *(longlong *)(&stack0x00000c28 + lVar36),1);
                }
                plVar6 = *(longlong **)(&stack0x00000250 + lVar36);
                LOCK();
                *plVar6 = *plVar6 + -1;
                UNLOCK();
                if (*plVar6 == 0) {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000634a;
                  FUN_140bded10(puVar39);
                }
              }
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000635c;
              FUN_140053890(&stack0x000004b0 + lVar36);
              puVar39 = &stack0x00000ca0 + lVar36;
              if (*(longlong *)(&stack0x00000ca0 + lVar36) == 2) goto LAB_14000636e;
            }
            lVar37 = *(longlong *)(&stack0x00000f70 + lVar36);
            uVar44 = *(undefined8 *)(&stack0x00000f78 + lVar36);
            puVar38 = *(undefined8 **)(&stack0x00000f80 + lVar36);
            uVar50 = *(undefined8 *)(&stack0x00000f88 + lVar36);
            if (*(longlong *)(&stack0x00000fd8 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400063af;
              func_0x000140001090(*(undefined8 *)(&stack0x00000fe0 + lVar36),
                                  *(longlong *)(&stack0x00000fd8 + lVar36),1);
            }
            lVar7 = *(longlong *)(&stack0x00001018 + lVar36);
            if (*(longlong *)(&stack0x00000c80 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400063d4;
              func_0x000140001090(*(undefined8 *)(&stack0x00000c88 + lVar36),
                                  *(longlong *)(&stack0x00000c80 + lVar36),1);
            }
            if (lVar7 != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400063ee;
              func_0x000140001090(*(undefined8 *)(&stack0x00001000 + lVar36),lVar7,1);
            }
            if (SBORROW8(0,lVar37)) goto LAB_140005a95;
            *(longlong *)(&stack0x00001000 + lVar36) = lVar37;
            *(longlong *)(&stack0x00000f18 + lVar36) = lVar37;
            *(undefined8 *)(&stack0x00000f20 + lVar36) = uVar44;
            *(undefined8 **)(&stack0x00000f28 + lVar36) = puVar38;
            *(undefined8 *)(&stack0x00000f30 + lVar36) = uVar50;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000642a;
            FUN_140001bb0(&stack0x00000f90 + lVar36,&stack0x00000f18 + lVar36);
            if (!SBORROW8(0,*(longlong *)(&stack0x00000f90 + lVar36))) {
              iVar34 = *(int *)(&stack0x00000fb0 + lVar36);
              *(longlong *)(&stack0x00001018 + lVar36) = *(longlong *)(&stack0x00000f90 + lVar36);
              if (iVar34 == 2) {
                uVar44 = *(undefined8 *)(&stack0x00000fa8 + lVar36);
                *(undefined8 *)(&stack0xfffffffffffffff0 + lVar36) = uVar44;
                *(undefined8 *)(&stack0x00001008 + lVar36) =
                     *(undefined8 *)(&stack0x00000f98 + lVar36);
                uVar50 = *(undefined8 *)(&stack0x00000fa0 + lVar36);
                (&stack0x00001035)[lVar36] = 1;
                (&stack0x00001034)[lVar36] = 0;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006605;
                FUN_140002800(&UNK_140c9db13,0x2f);
                lVar37 = *(longlong *)(lVar41 + 0x1370);
                (&stack0x00001035)[lVar36] = 1;
                (&stack0x00001034)[lVar36] = 0;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006624;
                lVar37 = FUN_1401ed950(lVar37 + 0x10);
                if (lVar37 == 0) {
                  *(undefined **)(&stack0x00000ca0 + lVar36) = &UNK_140cdbc50;
                  *(undefined8 *)(&stack0x00000ca8 + lVar36) = 0x17;
                  *(undefined1 **)(&stack0x000004b0 + lVar36) = puVar39;
                  *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_14010b520;
                  (&stack0x00001035)[lVar36] = 1;
                  (&stack0x00001034)[lVar36] = 0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000731f;
                  FUN_140c9b080(&UNK_140cdc0ec,&stack0x000004b0 + lVar36,&UNK_140cdc118);
                  goto LAB_1400077cd;
                }
                *(undefined8 *)(&stack0x00000258 + lVar36) = uVar44;
                *(undefined8 *)(&stack0x00000250 + lVar36) = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006653;
                FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar37 + 0x48);
                *(undefined8 *)(&stack0x00000ff8 + lVar36) = uVar44;
                if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
                  *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9db48;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000736b;
                  FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb4a8);
                  goto LAB_1400077cd;
                }
                (&stack0x00001027)[lVar36] = (&stack0x000004c0)[lVar36];
                *(longlong *)(&stack0x00001028 + lVar36) = *(longlong *)(&stack0x000004b8 + lVar36);
                if (*(longlong *)(*(longlong *)(&stack0x000004b8 + lVar36) + 8) != 0) {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000669a;
                  func_0x000140717820(*(longlong *)(&stack0x00001028 + lVar36) + 0x10);
                }
                pcVar43 = *(char **)(&stack0x00001028 + lVar36);
                pcVar43[8] = '\x01';
                pcVar43[9] = '\0';
                pcVar43[10] = '\0';
                pcVar43[0xb] = '\0';
                pcVar43[0xc] = '\0';
                pcVar43[0xd] = '\0';
                pcVar43[0xe] = '\0';
                pcVar43[0xf] = '\0';
                *(undefined8 *)(pcVar43 + 0x10) = *(undefined8 *)(&stack0x00000ff8 + lVar36);
                if (((&stack0x00001027)[lVar36] == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0))
                {
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007532;
                  cVar32 = func_0x000140c9a010();
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 == '\x02') {
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007387;
                  goto code_r0x000140c99390;
                }
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400066e9;
                FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar37);
                if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
                  *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9db60;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400073d3;
                  FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb3c8);
                  goto LAB_1400077cd;
                }
                pcVar43 = *(char **)(&stack0x000004b8 + lVar36);
                cVar32 = (&stack0x000004c0)[lVar36];
                lVar7 = *(longlong *)(pcVar43 + 8);
                if ((!SBORROW8(0,lVar7)) && (lVar7 != 0)) {
                  uVar44 = *(undefined8 *)(pcVar43 + 0x10);
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006723;
                  func_0x000140001090(uVar44,lVar7,1);
                }
                *(undefined8 *)(pcVar43 + 8) = *(undefined8 *)(&stack0x00001018 + lVar36);
                *(undefined8 *)(pcVar43 + 0x10) = *(undefined8 *)(&stack0x00001008 + lVar36);
                *(undefined8 *)(pcVar43 + 0x18) = uVar50;
                if ((cVar32 == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0)) {
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400075bf;
                  cVar32 = func_0x000140c9a010();
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 == '\x02') {
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400073ef;
                  goto code_r0x000140c99390;
                }
                (&stack0x00001035)[lVar36] = 0;
                (&stack0x00001034)[lVar36] = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006785;
                FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar37 + 0x98);
                if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
                  *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9db78;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000743b;
                  FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb528);
                  goto LAB_1400077cd;
                }
                pcVar43 = *(char **)(&stack0x000004b8 + lVar36);
                cVar32 = (&stack0x000004c0)[lVar36];
                pcVar43[2] = '\0';
                pcVar43[3] = '\0';
                if ((cVar32 == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0)) {
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000764c;
                  cVar32 = func_0x000140c9a010();
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 == '\x02') {
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007457;
                  goto code_r0x000140c99390;
                }
                LOCK();
                *(undefined1 *)(lVar37 + 0xa1) = 1;
                UNLOCK();
                (&stack0x00001035)[lVar36] = 0;
                (&stack0x00001034)[lVar36] = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400067f7;
                FUN_14029f540(&stack0x000004b0 + lVar36,&UNK_140c9db90,0xd);
                if (*(longlong *)(&stack0x000004b0 + lVar36) == -0x7fffffffffffffdd) {
                  *(undefined8 *)(&stack0x000004b0 + lVar36) = 0x8000000000000000;
                  *(undefined1 **)(&stack0x000004b8 + lVar36) = &stack0x00001017 + lVar36;
                  (&stack0x00001035)[lVar36] = 0;
                  (&stack0x00001034)[lVar36] = 1;
                  *(undefined1 **)(&stack0xffffffffffffffe0 + lVar36) = &stack0x000004b0 + lVar36;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006862;
                  FUN_14005fb50(&stack0x00000ca0 + lVar36,lVar41 + 0x10);
                  if (*(longlong *)(&stack0x00000ca0 + lVar36) == -0x7fffffffffffffdd)
                  goto LAB_140007127;
                }
                else {
                  *(undefined8 *)(&stack0x00000cc8 + lVar36) =
                       *(undefined8 *)(&stack0x000004d8 + lVar36);
                  *(undefined8 *)(&stack0x00000cb8 + lVar36) =
                       *(undefined8 *)(&stack0x000004c8 + lVar36);
                  *(undefined8 *)(&stack0x00000cc0 + lVar36) =
                       *(undefined8 *)(&stack0x000004d0 + lVar36);
                  *(longlong *)(&stack0x00000ca0 + lVar36) =
                       *(longlong *)(&stack0x000004b0 + lVar36);
                  *(undefined8 *)(&stack0x00000ca8 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  *(undefined8 *)(&stack0x00000cb0 + lVar36) =
                       *(undefined8 *)(&stack0x000004c0 + lVar36);
                }
                (&stack0x00001035)[lVar36] = 0;
                (&stack0x00001034)[lVar36] = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006ded;
                FUN_14004acd0(&stack0x00000ca0 + lVar36);
              }
              else {
                if (0xfffe < iVar34 - 1U) {
                  *(undefined8 *)(&stack0x00001008 + lVar36) =
                       *(undefined8 *)(&stack0x00000f98 + lVar36);
                  *(undefined8 *)(&stack0x00000250 + lVar36) =
                       *(undefined8 *)(&stack0x00000fa8 + lVar36);
                  *(int *)(&stack0xfffffffffffffff0 + lVar36) = iVar34;
                  *(undefined1 **)(&stack0x00000ca0 + lVar36) = &stack0xfffffffffffffff0 + lVar36;
                  *(code **)(&stack0x00000ca8 + lVar36) = FUN_140c5bb60;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006cee;
                  FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140c9db9d,&stack0x00000ca0 + lVar36);
                  *(undefined8 *)(&stack0x00001028 + lVar36) =
                       *(undefined8 *)(&stack0x000004b0 + lVar36);
                  *(undefined8 *)(&stack0x00000ff8 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006d17;
                  FUN_140002800(*(undefined8 *)(&stack0x000004b8 + lVar36),
                                *(undefined8 *)(&stack0x000004c0 + lVar36));
                  if (*(longlong *)(&stack0x00001028 + lVar36) != 0) {
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006d36;
                    func_0x000140001090(*(undefined8 *)(&stack0x00000ff8 + lVar36),
                                        *(longlong *)(&stack0x00001028 + lVar36),1);
                  }
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006d55;
                  FUN_140008ac0(&UNK_140c9dbe3,0x1c,&UNK_140c9dbff,0x3b);
                  if (*(longlong *)(&stack0x00001018 + lVar36) != 0) {
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006d74;
                    func_0x000140001090(*(undefined8 *)(&stack0x00001008 + lVar36),
                                        *(longlong *)(&stack0x00001018 + lVar36),1);
                  }
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006d81;
                  func_0x000140717820(&stack0x00000250 + lVar36);
                  lVar41 = *(longlong *)(&stack0x00001000 + lVar36);
                  goto joined_r0x000140006d8c;
                }
                uVar44 = *(undefined8 *)(&stack0x00000fa8 + lVar36);
                *(undefined8 *)(&stack0x00000be8 + lVar36) = uVar44;
                *(undefined8 *)(&stack0x00001008 + lVar36) =
                     *(undefined8 *)(&stack0x00000f98 + lVar36);
                uVar50 = *(undefined8 *)(&stack0x00000fa0 + lVar36);
                *(short *)(&stack0x00000ff6 + lVar36) = (short)iVar34;
                *(undefined1 **)(&stack0x00000ca0 + lVar36) = &stack0x00000ff6 + lVar36;
                *(code **)(&stack0x00000ca8 + lVar36) = FUN_140c5b260;
                (&stack0x00001037)[lVar36] = 1;
                (&stack0x00001036)[lVar36] = 0;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400068f5;
                FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140c9dc3a,&stack0x00000ca0 + lVar36);
                *(undefined8 *)(&stack0x00001028 + lVar36) =
                     *(undefined8 *)(&stack0x000004b0 + lVar36);
                *(undefined8 *)(&stack0x00000ff8 + lVar36) =
                     *(undefined8 *)(&stack0x000004b8 + lVar36);
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000691e;
                FUN_140002800(*(undefined8 *)(&stack0x000004b8 + lVar36),
                              *(undefined8 *)(&stack0x000004c0 + lVar36));
                if (*(longlong *)(&stack0x00001028 + lVar36) != 0) {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000693d;
                  func_0x000140001090(*(undefined8 *)(&stack0x00000ff8 + lVar36),
                                      *(longlong *)(&stack0x00001028 + lVar36),1);
                }
                lVar37 = *(longlong *)(lVar41 + 0x1370);
                (&stack0x00001037)[lVar36] = 1;
                (&stack0x00001036)[lVar36] = 0;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000695b;
                lVar37 = FUN_1401ed950(lVar37 + 0x10);
                if (lVar37 == 0) {
                  *(undefined **)(&stack0x00000ca0 + lVar36) = &UNK_140cdbc50;
                  *(undefined8 *)(&stack0x00000ca8 + lVar36) = 0x17;
                  *(undefined1 **)(&stack0x000004b0 + lVar36) = &stack0x00000ca0 + lVar36;
                  *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_14010b520;
                  (&stack0x00001037)[lVar36] = 1;
                  (&stack0x00001036)[lVar36] = 0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400074cd;
                  FUN_140c9b080(&UNK_140cdc0ec,&stack0x000004b0 + lVar36,&UNK_140cdc118);
                  goto LAB_1400077cd;
                }
                *(undefined8 *)(&stack0x00000258 + lVar36) = uVar44;
                *(undefined8 *)(&stack0x00000250 + lVar36) = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000698a;
                FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar37 + 0x48);
                *(undefined8 *)(&stack0x00000ff8 + lVar36) = uVar44;
                if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
                  *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9dc80;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007519;
                  FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb4a8);
                  goto LAB_1400077cd;
                }
                (&stack0x00001027)[lVar36] = (&stack0x000004c0)[lVar36];
                *(longlong *)(&stack0x00001028 + lVar36) = *(longlong *)(&stack0x000004b8 + lVar36);
                if (*(longlong *)(*(longlong *)(&stack0x000004b8 + lVar36) + 8) != 0) {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400069d1;
                  func_0x000140717820(*(longlong *)(&stack0x00001028 + lVar36) + 0x10);
                }
                pcVar43 = *(char **)(&stack0x00001028 + lVar36);
                pcVar43[8] = '\x01';
                pcVar43[9] = '\0';
                pcVar43[10] = '\0';
                pcVar43[0xb] = '\0';
                pcVar43[0xc] = '\0';
                pcVar43[0xd] = '\0';
                pcVar43[0xe] = '\0';
                pcVar43[0xf] = '\0';
                *(undefined8 *)(pcVar43 + 0x10) = *(undefined8 *)(&stack0x00000ff8 + lVar36);
                if (((&stack0x00001027)[lVar36] == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0))
                {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000768d;
                  cVar32 = func_0x000140c9a010();
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 == '\x02') {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000755a;
                  goto code_r0x000140c99390;
                }
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006a20;
                FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar37);
                if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
                  *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9dc98;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400075a6;
                  FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb3c8);
                  goto LAB_1400077cd;
                }
                pcVar43 = *(char **)(&stack0x000004b8 + lVar36);
                cVar32 = (&stack0x000004c0)[lVar36];
                lVar7 = *(longlong *)(pcVar43 + 8);
                if ((!SBORROW8(0,lVar7)) && (lVar7 != 0)) {
                  uVar44 = *(undefined8 *)(pcVar43 + 0x10);
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006a5a;
                  func_0x000140001090(uVar44,lVar7,1);
                }
                *(undefined8 *)(pcVar43 + 8) = *(undefined8 *)(&stack0x00001018 + lVar36);
                *(undefined8 *)(pcVar43 + 0x10) = *(undefined8 *)(&stack0x00001008 + lVar36);
                *(undefined8 *)(pcVar43 + 0x18) = uVar50;
                if ((cVar32 == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0)) {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400076b2;
                  cVar32 = func_0x000140c9a010();
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 == '\x02') {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400075e7;
                  goto code_r0x000140c99390;
                }
                uVar4 = *(undefined2 *)(&stack0x00000ff6 + lVar36);
                (&stack0x00001037)[lVar36] = 0;
                (&stack0x00001036)[lVar36] = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006ac4;
                FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar37 + 0x98);
                if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
                  *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9dcb0;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007633;
                  FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb528);
                  goto LAB_1400077cd;
                }
                pcVar43 = *(char **)(&stack0x000004b8 + lVar36);
                cVar32 = (&stack0x000004c0)[lVar36];
                pcVar43[2] = '\x01';
                pcVar43[3] = '\0';
                *(undefined2 *)(pcVar43 + 4) = uVar4;
                if ((cVar32 == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0)) {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400076d7;
                  cVar32 = func_0x000140c9a010();
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 == '\x02') {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007674;
                  goto code_r0x000140c99390;
                }
                *(undefined2 *)(&stack0x00000c60 + lVar36) =
                     *(undefined2 *)(&stack0x00000ff6 + lVar36);
                (&stack0x00001037)[lVar36] = 0;
                (&stack0x00001036)[lVar36] = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006b3e;
                FUN_14029f540(&stack0x000004b0 + lVar36,&UNK_140c9dcc8,0xc);
                if (*(longlong *)(&stack0x000004b0 + lVar36) == -0x7fffffffffffffdd) {
                  (&stack0x00001037)[lVar36] = 0;
                  (&stack0x00001036)[lVar36] = 1;
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006b88;
                  FUN_1402a00d0(&stack0x000004b0 + lVar36,*(undefined8 *)(&stack0x000004b8 + lVar36)
                                ,*(undefined8 *)(&stack0x000004c0 + lVar36),
                                &stack0x00000c60 + lVar36);
                  *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  *(undefined8 *)(&stack0x00000ca8 + lVar36) =
                       *(undefined8 *)(&stack0x000004c0 + lVar36);
                  *(undefined8 *)(&stack0x00000cb0 + lVar36) =
                       *(undefined8 *)(&stack0x000004c8 + lVar36);
                  *(undefined8 *)(&stack0x00000cb8 + lVar36) =
                       *(undefined8 *)(&stack0x000004d0 + lVar36);
                  *(undefined8 *)(&stack0x00000cc0 + lVar36) =
                       *(undefined8 *)(&stack0x000004d8 + lVar36);
                  *(undefined8 *)(&stack0x00000cc8 + lVar36) =
                       *(undefined8 *)(&stack0x000004e0 + lVar36);
                  if (*(int *)(&stack0x000004b0 + lVar36) == 1) {
                    uVar44 = *(undefined8 *)(&stack0x00000ca0 + lVar36);
                    uVar50 = *(undefined8 *)(&stack0x00000ca8 + lVar36);
                    *(undefined8 *)((longlong)&uStackX_10 + lVar36) =
                         *(undefined8 *)(&stack0x00000cc0 + lVar36);
                    *(undefined8 *)((longlong)&uStackX_18 + lVar36) =
                         *(undefined8 *)(&stack0x00000cc8 + lVar36);
                    *(undefined8 *)(&stack0x00000000 + lVar36) =
                         *(undefined8 *)(&stack0x00000cb0 + lVar36);
                    *(undefined8 *)((longlong)(&stack0x00000000 + lVar36) + 8) =
                         *(undefined8 *)(&stack0x00000cb8 + lVar36);
                    *(undefined8 *)(&stack0xfffffffffffffff0 + lVar36) = uVar44;
                    *(undefined8 *)(&stack0xfffffffffffffff8 + lVar36) = uVar50;
                  }
                  else {
                    *(undefined4 *)(&stack0x00000270 + lVar36) =
                         *(undefined4 *)(&stack0x00000cc0 + lVar36);
                    *(undefined4 *)(&stack0x00000274 + lVar36) =
                         *(undefined4 *)(&stack0x00000cc4 + lVar36);
                    *(undefined4 *)(&stack0x00000278 + lVar36) =
                         *(undefined4 *)(&stack0x00000cc8 + lVar36);
                    *(undefined4 *)(&stack0x0000027c + lVar36) =
                         *(undefined4 *)(&stack0x00000ccc + lVar36);
                    *(undefined4 *)(&stack0x00000260 + lVar36) =
                         *(undefined4 *)(&stack0x00000cb0 + lVar36);
                    *(undefined4 *)(&stack0x00000264 + lVar36) =
                         *(undefined4 *)(&stack0x00000cb4 + lVar36);
                    *(undefined4 *)(&stack0x00000268 + lVar36) =
                         *(undefined4 *)(&stack0x00000cb8 + lVar36);
                    *(undefined4 *)(&stack0x0000026c + lVar36) =
                         *(undefined4 *)(&stack0x00000cbc + lVar36);
                    *(undefined8 *)(&stack0x00000250 + lVar36) =
                         *(undefined8 *)(&stack0x00000ca0 + lVar36);
                    *(undefined8 *)(&stack0x00000258 + lVar36) =
                         *(undefined8 *)(&stack0x00000ca8 + lVar36);
                    (&stack0x00001033)[lVar36] = 1;
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006ea1;
                    FUN_14026d1a0(&stack0x00000ca0 + lVar36,lVar41 + 0x1178);
                    if (*(int *)(&stack0x00000ca0 + lVar36) == 1) {
                      *(undefined8 *)(&stack0xfffffffffffffff0 + lVar36) =
                           *(undefined8 *)(&stack0x00000ca8 + lVar36);
                      (&stack0xfffffffffffffff8)[lVar36] = (&stack0x00000cb0)[lVar36];
                      *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140cdc388;
                      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007726;
                      FUN_140c9ae20(&UNK_140cdc308,0x18,&stack0xfffffffffffffff0 + lVar36,
                                    &UNK_140cdb318);
                      goto LAB_1400077cd;
                    }
                    lVar37 = *(longlong *)(&stack0x00000ca8 + lVar36);
                    (&stack0x00000ff8)[lVar36] = (&stack0x00000cb0)[lVar36];
                    pauVar8 = *(undefined1 (**) [16])(lVar37 + 8);
                    lVar7 = *(longlong *)(lVar37 + 0x10);
                    auVar2 = *pauVar8;
                    *(longlong *)(&stack0x00001028 + lVar36) = lVar37;
                    uVar44 = *(undefined8 *)(lVar37 + 0x20);
                    *(undefined1 (**) [16])(&stack0x00000ca0 + lVar36) = pauVar8;
                    *(undefined1 (**) [16])(&stack0x00000ca8 + lVar36) = pauVar8 + 1;
                    *(undefined1 **)(&stack0x00000cb0 + lVar36) = *pauVar8 + lVar7 + 1;
                    *(ushort *)(&stack0x00000cb8 + lVar36) =
                         ~((ushort)(SUB161(auVar2 >> 7,0) & 1) |
                           (ushort)(SUB161(auVar2 >> 0xf,0) & 1) << 1 |
                           (ushort)(SUB161(auVar2 >> 0x17,0) & 1) << 2 |
                           (ushort)(SUB161(auVar2 >> 0x1f,0) & 1) << 3 |
                           (ushort)(SUB161(auVar2 >> 0x27,0) & 1) << 4 |
                           (ushort)(SUB161(auVar2 >> 0x2f,0) & 1) << 5 |
                           (ushort)(SUB161(auVar2 >> 0x37,0) & 1) << 6 |
                           (ushort)(SUB161(auVar2 >> 0x3f,0) & 1) << 7 |
                           (ushort)(SUB161(auVar2 >> 0x47,0) & 1) << 8 |
                           (ushort)(SUB161(auVar2 >> 0x4f,0) & 1) << 9 |
                           (ushort)(SUB161(auVar2 >> 0x57,0) & 1) << 10 |
                           (ushort)(SUB161(auVar2 >> 0x5f,0) & 1) << 0xb |
                           (ushort)(SUB161(auVar2 >> 0x67,0) & 1) << 0xc |
                           (ushort)(SUB161(auVar2 >> 0x6f,0) & 1) << 0xd |
                           (ushort)(SUB161(auVar2 >> 0x77,0) & 1) << 0xe |
                          (ushort)(byte)(auVar2[0xf] >> 7) << 0xf);
                    *(undefined8 *)(&stack0x00000cc0 + lVar36) = uVar44;
                    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar36) = 0;
                    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006f39;
                    FUN_1401e5320(&stack0x000004b0 + lVar36,lVar41 + 0x1368,
                                  &stack0x00000ca0 + lVar36,&stack0x00000250 + lVar36);
                    if (*(longlong *)(&stack0x000004b0 + lVar36) == -0x7fffffffffffffdd) {
                      if (((&stack0x00000ff8)[lVar36] == '\0') &&
                         ((*puVar30 & 0x7fffffffffffffff) != 0)) {
                        (&stack0x00001033)[lVar36] = 1;
                        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000777f;
                        cVar32 = func_0x000140c9a010();
                        if (cVar32 == '\0') {
                          *(undefined1 *)(*(longlong *)(&stack0x00001028 + lVar36) + 1) = 1;
                        }
                      }
                      LOCK();
                      cVar32 = **(char **)(&stack0x00001028 + lVar36);
                      **(char **)(&stack0x00001028 + lVar36) = '\0';
                      UNLOCK();
                      if (cVar32 == '\x02') {
                        (&stack0x00001033)[lVar36] = 1;
                        pcVar43 = *(char **)(&stack0x00001028 + lVar36);
                        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007754;
                        goto code_r0x000140c99390;
                      }
                      *(undefined4 *)(&stack0x000004d0 + lVar36) =
                           *(undefined4 *)(&stack0x00000270 + lVar36);
                      *(undefined4 *)(&stack0x000004d4 + lVar36) =
                           *(undefined4 *)(&stack0x00000274 + lVar36);
                      *(undefined4 *)(&stack0x000004d8 + lVar36) =
                           *(undefined4 *)(&stack0x00000278 + lVar36);
                      *(undefined4 *)(&stack0x000004dc + lVar36) =
                           *(undefined4 *)(&stack0x0000027c + lVar36);
                      *(undefined4 *)(&stack0x000004c0 + lVar36) =
                           *(undefined4 *)(&stack0x00000260 + lVar36);
                      *(undefined4 *)(&stack0x000004c4 + lVar36) =
                           *(undefined4 *)(&stack0x00000264 + lVar36);
                      *(undefined4 *)(&stack0x000004c8 + lVar36) =
                           *(undefined4 *)(&stack0x00000268 + lVar36);
                      *(undefined4 *)(&stack0x000004cc + lVar36) =
                           *(undefined4 *)(&stack0x0000026c + lVar36);
                      *(undefined8 *)(&stack0x000004b0 + lVar36) =
                           *(undefined8 *)(&stack0x00000250 + lVar36);
                      *(undefined8 *)(&stack0x000004b8 + lVar36) =
                           *(undefined8 *)(&stack0x00000258 + lVar36);
                      (&stack0x00001033)[lVar36] = 0;
                      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006fbc;
                      FUN_1409cb620(&stack0x00000ca0 + lVar36,lVar41 + 0x1368,
                                    &stack0x000004b0 + lVar36);
                      if (*(longlong *)(&stack0x00000ca0 + lVar36) == -0x7fffffffffffffdd)
                      goto LAB_140007127;
                      uVar44 = *(undefined8 *)(&stack0x00000ca0 + lVar36);
                      uVar50 = *(undefined8 *)(&stack0x00000ca8 + lVar36);
                      *(undefined8 *)((longlong)&uStackX_10 + lVar36) =
                           *(undefined8 *)(&stack0x00000cc0 + lVar36);
                      *(undefined8 *)((longlong)&uStackX_18 + lVar36) =
                           *(undefined8 *)(&stack0x00000cc8 + lVar36);
                      *(undefined8 *)(&stack0x00000000 + lVar36) =
                           *(undefined8 *)(&stack0x00000cb0 + lVar36);
                      *(undefined8 *)((longlong)(&stack0x00000000 + lVar36) + 8) =
                           *(undefined8 *)(&stack0x00000cb8 + lVar36);
                      *(undefined8 *)(&stack0xfffffffffffffff0 + lVar36) = uVar44;
                      *(undefined8 *)(&stack0xfffffffffffffff8 + lVar36) = uVar50;
                    }
                    else {
                      uVar44 = *(undefined8 *)(&stack0x000004b0 + lVar36);
                      uVar50 = *(undefined8 *)(&stack0x000004b8 + lVar36);
                      uVar42 = *(undefined4 *)(&stack0x000004c0 + lVar36);
                      uVar33 = *(undefined4 *)(&stack0x000004c4 + lVar36);
                      uVar11 = *(undefined4 *)(&stack0x000004c8 + lVar36);
                      uVar12 = *(undefined4 *)(&stack0x000004cc + lVar36);
                      uVar13 = *(undefined4 *)(&stack0x000004d8 + lVar36);
                      uVar14 = *(undefined4 *)(&stack0x000004dc + lVar36);
                      *(undefined4 *)((longlong)&uStackX_10 + lVar36) =
                           *(undefined4 *)(&stack0x000004d0 + lVar36);
                      *(undefined4 *)((longlong)&uStackX_10 + lVar36 + 4) =
                           *(undefined4 *)(&stack0x000004d4 + lVar36);
                      *(undefined4 *)((longlong)&uStackX_18 + lVar36) = uVar13;
                      *(undefined4 *)((longlong)&uStackX_18 + lVar36 + 4) = uVar14;
                      puVar1 = (undefined4 *)(&stack0x00000000 + lVar36);
                      *puVar1 = uVar42;
                      puVar1[1] = uVar33;
                      puVar1[2] = uVar11;
                      puVar1[3] = uVar12;
                      *(undefined8 *)(&stack0xfffffffffffffff0 + lVar36) = uVar44;
                      *(undefined8 *)(&stack0xfffffffffffffff8 + lVar36) = uVar50;
                      if (((&stack0x00000ff8)[lVar36] == '\0') &&
                         ((*puVar30 & 0x7fffffffffffffff) != 0)) {
                        (&stack0x00001033)[lVar36] = 1;
                        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400077a4;
                        cVar32 = func_0x000140c9a010();
                        if (cVar32 == '\0') {
                          *(undefined1 *)(*(longlong *)(&stack0x00001028 + lVar36) + 1) = 1;
                        }
                      }
                      LOCK();
                      cVar32 = **(char **)(&stack0x00001028 + lVar36);
                      **(char **)(&stack0x00001028 + lVar36) = '\0';
                      UNLOCK();
                      if (cVar32 == '\x02') {
                        (&stack0x00001033)[lVar36] = 1;
                        pcVar43 = *(char **)(&stack0x00001028 + lVar36);
                        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000776d;
                        goto code_r0x000140c99390;
                      }
                      if (*(longlong *)(&stack0x00000250 + lVar36) != 0) {
                        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007070;
                        func_0x000140001090(*(undefined8 *)(&stack0x00000258 + lVar36),
                                            *(longlong *)(&stack0x00000250 + lVar36),1);
                      }
                      if (*(longlong *)(&stack0x00000268 + lVar36) != 0) {
                        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007095;
                        func_0x000140001090(*(undefined8 *)(&stack0x00000270 + lVar36),
                                            *(longlong *)(&stack0x00000268 + lVar36),1);
                      }
                    }
                  }
                  if (*(longlong *)(&stack0xfffffffffffffff0 + lVar36) == -0x7fffffffffffffdd)
                  goto LAB_140007127;
                }
                else {
                  *(undefined8 *)((longlong)&uStackX_18 + lVar36) =
                       *(undefined8 *)(&stack0x000004d8 + lVar36);
                  *(undefined8 *)((longlong)&uStackX_8 + lVar36) =
                       *(undefined8 *)(&stack0x000004c8 + lVar36);
                  *(undefined8 *)((longlong)&uStackX_10 + lVar36) =
                       *(undefined8 *)(&stack0x000004d0 + lVar36);
                  *(longlong *)(&stack0xfffffffffffffff0 + lVar36) =
                       *(longlong *)(&stack0x000004b0 + lVar36);
                  *(undefined8 *)(&stack0xfffffffffffffff8 + lVar36) =
                       *(undefined8 *)(&stack0x000004b8 + lVar36);
                  *(undefined8 *)(&stack0x00000000 + lVar36) =
                       *(undefined8 *)(&stack0x000004c0 + lVar36);
                }
                (&stack0x00001037)[lVar36] = 0;
                (&stack0x00001036)[lVar36] = 1;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007126;
                FUN_14004acd0(&stack0xfffffffffffffff0 + lVar36);
              }
LAB_140007127:
              if (*(longlong *)(&stack0x00001000 + lVar36) != 0) {
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007145;
                func_0x000140001090(*(undefined8 *)(&stack0x00000f20 + lVar36),
                                    *(longlong *)(&stack0x00001000 + lVar36),1);
              }
              lVar41 = *(longlong *)(lVar41 + 0x1370);
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007155;
              lVar41 = FUN_1401ed950(lVar41 + 0x10);
              if (lVar41 == 0) {
                *(undefined **)(&stack0x00000ca0 + lVar36) = &UNK_140cdbc50;
                *(undefined8 *)(&stack0x00000ca8 + lVar36) = 0x17;
                *(undefined1 **)(&stack0x000004b0 + lVar36) = puVar39;
LAB_140006c11:
                *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_14010b520;
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006c39;
                FUN_140c9b080(&UNK_140cdc0ec,&stack0x000004b0 + lVar36,&UNK_140cdc118);
                    /* WARNING: Does not return */
                pcVar9 = (code *)invalidInstructionException();
                (*pcVar9)();
              }
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007173;
              FUN_14026d1a0(&stack0x000004b0 + lVar36,lVar41 + 0x98);
              if (*(int *)(&stack0x000004b0 + lVar36) != 1) {
                pcVar43 = *(char **)(&stack0x000004b8 + lVar36);
                sVar3 = *(short *)(pcVar43 + 2);
                uVar4 = *(undefined2 *)(pcVar43 + 4);
                if (((&stack0x000004c0)[lVar36] == '\0') && ((*puVar30 & 0x7fffffffffffffff) != 0))
                {
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140007464;
                  cVar32 = func_0x000140c9a010(uVar4);
                  if (cVar32 == '\0') {
                    pcVar43[1] = '\x01';
                  }
                }
                LOCK();
                cVar32 = *pcVar43;
                *pcVar43 = '\0';
                UNLOCK();
                if (cVar32 != '\x02') {
                  if (sVar3 == 0) {
                    return;
                  }
                  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400071c2;
                  FUN_14000a2b0(uVar4);
                  return;
                }
                *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400072b9;
code_r0x000140c99390:
                    /* WARNING: Could not recover jumptable at 0x000140c99390. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                WakeByAddressSingle(pcVar43);
                return;
              }
              *(undefined8 *)(&stack0x00000ca0 + lVar36) =
                   *(undefined8 *)(&stack0x000004b8 + lVar36);
              (&stack0x00000ca8)[lVar36] = (&stack0x000004c0)[lVar36];
              *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140c9e088;
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400072a9;
              FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000ca0 + lVar36,&UNK_140cdb528);
              goto LAB_1400077cd;
            }
            *(undefined8 *)(&stack0x00000cb0 + lVar36) = *(undefined8 *)(&stack0x00000fa8 + lVar36);
            *(undefined8 *)(&stack0x00000ca0 + lVar36) = *(undefined8 *)(&stack0x00000f98 + lVar36);
            *(undefined8 *)(&stack0x00000ca8 + lVar36) = *(undefined8 *)(&stack0x00000fa0 + lVar36);
            *(undefined1 **)(&stack0x000004b0 + lVar36) = puVar39;
            *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_140001280;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006484;
            FUN_140c38e40(&UNK_140c9dcd4,&stack0x000004b0 + lVar36);
            *(undefined1 **)(&stack0x00000250 + lVar36) = puVar39;
            *(undefined **)(&stack0x00000258 + lVar36) = &UNK_140001280;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400064ad;
            FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140c9dcf3,&stack0x00000250 + lVar36);
            *(undefined8 *)(&stack0x00001018 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
            *(undefined8 *)(&stack0x00001028 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400064d6;
            FUN_140002800(*(undefined8 *)(&stack0x000004b8 + lVar36),
                          *(undefined8 *)(&stack0x000004c0 + lVar36));
            if (*(longlong *)(&stack0x00001018 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x1400064f5;
              func_0x000140001090(*(undefined8 *)(&stack0x00001028 + lVar36),
                                  *(longlong *)(&stack0x00001018 + lVar36),1);
            }
            *(undefined1 **)(&stack0x00000250 + lVar36) = puVar39;
            *(undefined **)(&stack0x00000258 + lVar36) = &UNK_140001280;
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000651d;
            FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140c9dd15,&stack0x00000250 + lVar36);
            *(undefined8 *)(&stack0x00001018 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
            *(undefined8 *)(&stack0x00001028 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
            *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006552;
            FUN_140008ac0(&UNK_140c9ddd9,0x25,*(undefined8 *)(&stack0x000004b8 + lVar36),
                          *(undefined8 *)(&stack0x000004c0 + lVar36));
            if (*(longlong *)(&stack0x00001018 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006571;
              func_0x000140001090(*(undefined8 *)(&stack0x00001028 + lVar36),
                                  *(longlong *)(&stack0x00001018 + lVar36),1);
            }
            lVar41 = *(longlong *)(&stack0x00001000 + lVar36);
            if (*(longlong *)(&stack0x00000ca0 + lVar36) != 0) {
              *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006596;
              func_0x000140001090(*(undefined8 *)(&stack0x00000ca8 + lVar36),
                                  *(longlong *)(&stack0x00000ca0 + lVar36),1);
            }
joined_r0x000140006d8c:
            if (lVar41 == 0) {
              return;
            }
            goto LAB_140005bd9;
          }
        }
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005a09;
        FUN_14004b880(&stack0x00000ca8 + lVar36);
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005a0f;
        func_0x0001400010c0();
        uVar44 = 0x16;
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005a23;
        puVar38 = (undefined8 *)func_0x000140001080(0x16,1);
        uVar50 = _UNK_140cb964d;
        if (puVar38 == (undefined8 *)0x0) {
          *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000773b;
          FUN_140c9ab0b(1,0x16);
LAB_1400077cd:
                    /* WARNING: Does not return */
          pcVar9 = (code *)invalidInstructionException();
          (*pcVar9)();
        }
        *puVar38 = _DAT_140cb9645;
        puVar38[1] = uVar50;
        *(undefined8 *)((longlong)puVar38 + 0xe) = 0x646e756f6620746f;
        uVar50 = _UNK_140c9d098;
      }
LAB_140005a54:
      lVar41 = *(longlong *)(&stack0x00001018 + lVar36);
      if (*(longlong *)(&stack0x00000c80 + lVar36) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005a75;
        func_0x000140001090(uVar47,*(longlong *)(&stack0x00000c80 + lVar36),1);
      }
    }
    else {
      *(longlong *)(&stack0x00000250 + lVar36) = lVar37;
      *(undefined8 *)(&stack0x00000ca0 + lVar36) = 0;
      *(undefined8 *)(&stack0x00000ca8 + lVar36) = 1;
      *(undefined8 *)(&stack0x00000cb0 + lVar36) = 0;
      *(undefined8 *)(&stack0x000004c0 + lVar36) = 0x60000020;
      *(undefined1 **)(&stack0x000004b0 + lVar36) = &stack0x00000ca0 + lVar36;
      *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_140cdb0d0;
      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x14000560c;
      cVar32 = FUN_140c43150(&stack0x00000250 + lVar36,&stack0x000004b0 + lVar36);
      if (cVar32 != '\0') {
        *(undefined **)(&stack0xffffffffffffffe0 + lVar36) = &UNK_140cdb188;
        *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140006ffd;
        FUN_140c9ae20(&UNK_140cdb100,0x37,&stack0x00001017 + lVar36,&UNK_140cdb218);
        goto LAB_1400077cd;
      }
      uVar44 = *(undefined8 *)(&stack0x00000ca0 + lVar36);
      puVar38 = *(undefined8 **)(&stack0x00000ca8 + lVar36);
      uVar50 = *(undefined8 *)(&stack0x00000cb0 + lVar36);
      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005630;
      FUN_14004b880(&stack0x00000250 + lVar36);
      lVar41 = *(longlong *)(&stack0x00001018 + lVar36);
    }
    if (lVar41 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005a8f;
      func_0x000140001090(*(undefined8 *)(&stack0x00001000 + lVar36),lVar41,1);
    }
  }
LAB_140005a95:
  *(undefined8 *)(&stack0x00000ca0 + lVar36) = uVar44;
  *(undefined8 **)(&stack0x00000ca8 + lVar36) = puVar38;
  *(undefined8 *)(&stack0x00000cb0 + lVar36) = uVar50;
  puVar39 = &stack0x00000ca0 + lVar36;
  *(undefined1 **)(&stack0x000004b0 + lVar36) = puVar39;
  *(undefined **)(&stack0x000004b8 + lVar36) = &UNK_140001280;
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005ad3;
  FUN_140c38e40(&UNK_140c9ddfe,&stack0x000004b0 + lVar36);
  *(undefined1 **)(&stack0x00000250 + lVar36) = puVar39;
  *(undefined **)(&stack0x00000258 + lVar36) = &UNK_140001280;
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005afc;
  FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140c9de1b,&stack0x00000250 + lVar36);
  *(undefined8 *)(&stack0x00001000 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
  *(undefined8 *)(&stack0x00001018 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005b25;
  FUN_140002800(*(undefined8 *)(&stack0x000004b8 + lVar36),
                *(undefined8 *)(&stack0x000004c0 + lVar36));
  if (*(longlong *)(&stack0x00001000 + lVar36) != 0) {
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005b44;
    func_0x000140001090(*(undefined8 *)(&stack0x00001018 + lVar36),
                        *(longlong *)(&stack0x00001000 + lVar36),1);
  }
  *(undefined1 **)(&stack0x00000250 + lVar36) = puVar39;
  *(undefined **)(&stack0x00000258 + lVar36) = &UNK_140001280;
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005b6c;
  FUN_140c4eb10(&stack0x000004b0 + lVar36,&UNK_140c9de37,&stack0x00000250 + lVar36);
  *(undefined8 *)(&stack0x00001000 + lVar36) = *(undefined8 *)(&stack0x000004b0 + lVar36);
  *(undefined8 *)(&stack0x00001018 + lVar36) = *(undefined8 *)(&stack0x000004b8 + lVar36);
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005ba1;
  FUN_140008ac0(&UNK_140c9df3d,0x1e,*(undefined8 *)(&stack0x000004b8 + lVar36),
                *(undefined8 *)(&stack0x000004c0 + lVar36));
  if (*(longlong *)(&stack0x00001000 + lVar36) != 0) {
    *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005bc0;
    func_0x000140001090(*(undefined8 *)(&stack0x00001018 + lVar36),
                        *(longlong *)(&stack0x00001000 + lVar36),1);
  }
  lVar41 = *(longlong *)(&stack0x00000ca0 + lVar36);
  if (lVar41 == 0) {
    return;
  }
  uVar44 = *(undefined8 *)(&stack0x00000ca8 + lVar36);
LAB_140005bd9:
  *(undefined8 *)((longlong)&uStack_48 + lVar36) = 0x140005bde;
  func_0x000140001090(uVar44,lVar41,1);
  return;
}


