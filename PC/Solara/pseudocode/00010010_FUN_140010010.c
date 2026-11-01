/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_140010010(longlong param_1)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 uVar3;
  undefined4 uVar4;
  longlong *plVar5;
  longlong *plVar6;
  undefined8 uVar7;
  longlong *plVar8;
  longlong *plVar9;
  longlong *plVar10;
  longlong *plVar11;
  longlong *plVar12;
  longlong *plVar13;
  longlong *plVar14;
  longlong *plVar15;
  int *piVar16;
  code *pcVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined8 uVar21;
  ulonglong *puVar22;
  char cVar23;
  byte bVar24;
  longlong lVar25;
  longlong lVar26;
  undefined8 *puVar27;
  undefined8 uVar28;
  longlong lVar29;
  undefined8 uVar30;
  longlong lVar31;
  undefined8 uVar32;
  ulonglong uVar33;
  undefined1 *puVar34;
  char *pcVar35;
  bool bVar36;
  undefined8 unaff_XMM6_Qa;
  undefined8 unaff_XMM6_Qb;
  undefined8 auStackX_8 [4];
  undefined8 uStack_48;
  
  uStack_48 = 0x140010026;
  lVar25 = FUN_140c6a6b0();
  lVar25 = -lVar25;
  *(undefined8 *)(&stack0x00001250 + lVar25) = unaff_XMM6_Qa;
  *(undefined8 *)(&stack0x00001258 + lVar25) = unaff_XMM6_Qb;
  *(undefined8 *)(&stack0x00001248 + lVar25) = 0xfffffffffffffffe;
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010058;
  FUN_140002800(&UNK_140cb8df9,0xe);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010067;
  FUN_140065e90(&stack0x000003c0 + lVar25,param_1);
  plVar5 = *(longlong **)(param_1 + 0x88);
  LOCK();
  lVar26 = *plVar5;
  *plVar5 = *plVar5 + 1;
  UNLOCK();
  if (*plVar5 == 0 || SCARRY8(lVar26,1) != *plVar5 < 0) goto LAB_1400129a4;
  plVar6 = *(longlong **)(param_1 + 0x90);
  LOCK();
  lVar26 = *plVar6;
  *plVar6 = *plVar6 + 1;
  UNLOCK();
  if (*plVar6 == 0 || SCARRY8(lVar26,1) != *plVar6 < 0) goto LAB_1400129a4;
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400100a2;
  FUN_140c70710(&stack0x00001110 + lVar25,&stack0x000003c0 + lVar25,0x88);
  *(longlong **)(&stack0x00001198 + lVar25) = plVar5;
  *(longlong **)(&stack0x000011a0 + lVar25) = plVar6;
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400100bf;
  FUN_14005b920(&stack0x000003c0 + lVar25,plVar5);
  if (*(int *)(&stack0x000003c0 + lVar25) == 3) {
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400100da;
    FUN_140002800(&UNK_140c9e2f6,0x25);
  }
  else {
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400100fc;
    FUN_140c70710(&stack0x00000d50 + lVar25,&stack0x000003c0 + lVar25,0x380);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001010f;
    FUN_140240ee0(&stack0x00000af8 + lVar25,&stack0x00000f68 + lVar25);
    if (*(int *)(&stack0x00000af8 + lVar25) != 0x12) {
      *(undefined8 *)(&stack0x000003d8 + lVar25) = *(undefined8 *)(&stack0x00000b08 + lVar25);
      *(undefined8 *)(&stack0x000003c8 + lVar25) = *(undefined8 *)(&stack0x00000af8 + lVar25);
      *(undefined8 *)(&stack0x000003d0 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
      *(undefined8 *)(&stack0x000003c0 + lVar25) = 0x8000000000000000;
      *(undefined1 **)(&stack0x00000160 + lVar25) = &stack0x000003c0 + lVar25;
      *(code **)(&stack0x00000168 + lVar25) = FUN_1409c33f0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001017b;
      FUN_140c4eb10(&stack0x00000af8 + lVar25,&UNK_140c9e2ce,&stack0x00000160 + lVar25);
      *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x00000af8 + lVar25);
      *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400101a4;
      FUN_140002800(*(undefined8 *)(&stack0x00000b00 + lVar25),
                    *(undefined8 *)(&stack0x00000b08 + lVar25));
      if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400101c3;
        func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                            *(longlong *)(&stack0x00001240 + lVar25),1);
      }
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400101d0;
      FUN_14004acd0(&stack0x000003c0 + lVar25);
    }
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400101dd;
    FUN_14004bc30(&stack0x00000d50 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400101ea;
    FUN_14004c120(&stack0x00000f68 + lVar25);
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400101f7;
  func_0x000140c36db0(&stack0x000010d8 + lVar25);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001020b;
  FUN_1400a9820(&stack0x000010f8 + lVar25,&stack0x000010d8 + lVar25);
  if (((2 < *(ulonglong *)(&stack0x00001108 + lVar25)) &&
      (lVar26 = *(longlong *)(&stack0x00001100 + lVar25), *(longlong *)(lVar26 + 0x28) == 0xd)) &&
     (*(longlong *)((longlong)*(longlong **)(lVar26 + 0x20) + 5) == 0x646c6f2d70756e61 &&
      **(longlong **)(lVar26 + 0x20) == 0x756e61656c632d2d)) {
    *(longlong *)(&stack0x00000d50 + lVar25) = lVar26 + 0x30;
    *(undefined **)(&stack0x00000d58 + lVar25) = &UNK_140001280;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010c30;
    FUN_140c4eb10(&stack0x000003c0 + lVar25,&UNK_140cb96bf,&stack0x00000d50 + lVar25);
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010c59;
    FUN_140002800(*(undefined8 *)(&stack0x000003c8 + lVar25),
                  *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010c78;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    uVar30 = *(undefined8 *)(lVar26 + 0x38);
    uVar28 = *(undefined8 *)(lVar26 + 0x40);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010c8c;
    FUN_140c4e880(&stack0x000003c0 + lVar25,uVar30,uVar28);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    lVar26 = *(longlong *)(&stack0x000003d0 + lVar25);
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x000003c0 + lVar25);
    if (lVar26 < 0) {
      uVar30 = 0;
LAB_140010cb8:
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010cc3;
      FUN_140c9ab0b(uVar30,lVar26);
      goto LAB_1400129a4;
    }
    uVar3 = (&stack0x000003d8)[lVar25];
    if (lVar26 == 0) {
      lVar31 = 1;
    }
    else {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010d17;
      func_0x0001400010c0();
      uVar30 = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010d2a;
      lVar31 = func_0x000140001080(lVar26,1);
      if (lVar31 == 0) goto LAB_140010cb8;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010d44;
      FUN_140c70710(lVar31,*(undefined8 *)(&stack0x00001238 + lVar25),lVar26);
    }
    *(longlong *)(&stack0x00000d50 + lVar25) = lVar26;
    *(longlong *)(&stack0x00000d58 + lVar25) = lVar31;
    *(longlong *)(&stack0x00000d60 + lVar25) = lVar26;
    (&stack0x00000d68)[lVar25] = uVar3;
    *(undefined8 *)(&stack0x000003d0 + lVar25) = 0x8000000000000000;
    *(undefined8 *)(&stack0x000003c0 + lVar25) = 0;
    (&stack0x000003e8)[lVar25] = 0;
    *(undefined1 **)(&stack0xfffffffffffffff0 + lVar25) = &stack0x00000d50 + lVar25;
    *(undefined8 *)(&stack0xffffffffffffffe8 + lVar25) = 0;
    (&stack0xffffffffffffffe0)[lVar25] = 0;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010db4;
    FUN_14003f920(&stack0x00000af8 + lVar25,&stack0x000003d0 + lVar25,0);
    plVar5 = *(longlong **)(&stack0x00000af8 + lVar25);
    if (plVar5 == (longlong *)0x0) {
      *(undefined8 *)(&stack0x000003c0 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
      *(undefined **)(&stack0xffffffffffffffe0 + lVar25) = &UNK_140cb9748;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400129a3;
      FUN_140c9ae20(&UNK_140cb96de,0x16,&stack0x000003c0 + lVar25,&UNK_140cdb238);
      goto LAB_1400129a4;
    }
    *(longlong **)(&stack0x000003c0 + lVar25) = plVar5;
    *(undefined8 *)(&stack0x000003c8 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
    *(undefined8 *)(&stack0x000003d0 + lVar25) = *(undefined8 *)(&stack0x00000b08 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010dee;
    CloseHandle();
    LOCK();
    *plVar5 = *plVar5 + -1;
    UNLOCK();
    if (*plVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010e00;
      FUN_140c35090(&stack0x000003c0 + lVar25);
    }
    plVar5 = *(longlong **)(&stack0x000003c8 + lVar25);
    LOCK();
    *plVar5 = *plVar5 + -1;
    UNLOCK();
    if (*plVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010e1a;
      FUN_140c34f50(&stack0x000003c8 + lVar25);
    }
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010e3d;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010258;
  FUN_1400341b0(&stack0x000011e0 + lVar25);
  if (SBORROW8(0,*(longlong *)(&stack0x000011e0 + lVar25))) {
LAB_140010316:
    if (*(longlong *)(&stack0x000011e8 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010334;
      func_0x000140001090(*(undefined8 *)(&stack0x000011f0 + lVar25),
                          *(longlong *)(&stack0x000011e8 + lVar25),1);
    }
  }
  else {
    *(longlong *)(&stack0x00001240 + lVar25) = *(longlong *)(&stack0x000011e0 + lVar25);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000011e8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010294;
    FUN_140c39850(&stack0x000003c0 + lVar25,*(undefined8 *)(&stack0x000011e8 + lVar25),
                  *(undefined8 *)(&stack0x000011f0 + lVar25));
    if (*(int *)(&stack0x000003c0 + lVar25) == 2) {
      *(undefined8 *)(&stack0x00000d58 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
      *(undefined8 *)(&stack0x00000d50 + lVar25) = 2;
LAB_1400102e0:
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400102ec;
      FUN_14004b880(&stack0x00000d58 + lVar25);
    }
    else {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400102d2;
      FUN_140c70710(&stack0x00000d50 + lVar25,&stack0x000003c0 + lVar25,0x270);
      if (*(longlong *)(&stack0x00000d50 + lVar25) == 2) goto LAB_1400102e0;
      *(longlong *)(&stack0x000011d8 + lVar25) = param_1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001096c;
      FUN_140c70710(&stack0x00000880 + lVar25,&stack0x00000d50 + lVar25,0x270);
      *(undefined8 *)(&stack0x000003c0 + lVar25) = 0;
      *(undefined8 *)(&stack0x00000620 + lVar25) = 0;
      puVar1 = &stack0x00000af8 + lVar25;
      puVar34 = &stack0xfffffffffffffff8 + lVar25;
      puVar2 = &stack0x000011a8 + lVar25;
      while( true ) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400109ad;
        FUN_140001460(&stack0x00000160 + lVar25,&stack0x000003c0 + lVar25);
        if (*(longlong *)(&stack0x00000160 + lVar25) == 0) break;
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400109cd;
        FUN_140c70710(puVar1,&stack0x00000160 + lVar25,600);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400109d9;
        FUN_140c31bc0(puVar34,puVar1);
        uVar30 = *(undefined8 *)((longlong)auStackX_8 + lVar25 + -8);
        *(undefined8 *)(&stack0x00001228 + lVar25) = uVar30;
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400109f1;
        FUN_140c4e470(puVar2,uVar30,*(undefined8 *)((longlong)auStackX_8 + lVar25));
        *(undefined8 *)(&stack0x00001218 + lVar25) = *(undefined8 *)(&stack0x000011b0 + lVar25);
        lVar26 = *(longlong *)(&stack0x000011b8 + lVar25);
        if (lVar26 < 0) {
          uVar30 = 0;
          lVar26 = param_1;
LAB_140010be9:
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010bf4;
          FUN_140c9ab0b(uVar30,lVar26);
          goto LAB_1400129a4;
        }
        if (lVar26 == 0) {
          param_1 = 1;
        }
        else {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010a26;
          func_0x0001400010c0();
          uVar30 = 1;
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010a39;
          param_1 = func_0x000140001080(lVar26,1);
          if (param_1 == 0) goto LAB_140010be9;
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010a57;
          FUN_140c70710(param_1,*(undefined8 *)(&stack0x00001218 + lVar25),lVar26);
        }
        *(longlong *)(&stack0x000011c0 + lVar25) = lVar26;
        *(longlong *)(&stack0x000011c8 + lVar25) = param_1;
        *(longlong *)(&stack0x000011d0 + lVar25) = lVar26;
        if (0 < *(longlong *)(&stack0x000011a8 + lVar25)) {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010aa6;
          func_0x000140001090(*(undefined8 *)(&stack0x00001218 + lVar25),
                              *(longlong *)(&stack0x000011a8 + lVar25),1);
        }
        if (*(longlong *)(&stack0xfffffffffffffff8 + lVar25) != 0) {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010ac1;
          func_0x000140001090(*(undefined8 *)(&stack0x00001228 + lVar25),
                              *(longlong *)(&stack0xfffffffffffffff8 + lVar25),1);
        }
        if ((3 < *(ulonglong *)(&stack0x000011d0 + lVar25)) &&
           (*(int *)(*(longlong *)(&stack0x000011c8 + lVar25) + -4 +
                    *(ulonglong *)(&stack0x000011d0 + lVar25)) == 0x646c6f2e)) {
          *(undefined1 **)(&stack0x000011a8 + lVar25) = &stack0x000011c0 + lVar25;
          *(undefined **)(&stack0x000011b0 + lVar25) = &UNK_140001280;
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010b15;
          FUN_140c4eb10(puVar34,&UNK_140cb9760,puVar2);
          *(undefined8 *)(&stack0x00001218 + lVar25) =
               *(undefined8 *)(&stack0xfffffffffffffff8 + lVar25);
          uVar30 = *(undefined8 *)((longlong)auStackX_8 + lVar25 + -8);
          *(undefined8 *)(&stack0x00001228 + lVar25) = uVar30;
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010b35;
          FUN_140002800(uVar30,*(undefined8 *)((longlong)auStackX_8 + lVar25));
          if (*(longlong *)(&stack0x00001218 + lVar25) != 0) {
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010b54;
            func_0x000140001090(*(undefined8 *)(&stack0x00001228 + lVar25),
                                *(longlong *)(&stack0x00001218 + lVar25),1);
          }
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010b60;
          FUN_140c31ab0(puVar34,puVar1);
          uVar30 = *(undefined8 *)((longlong)auStackX_8 + lVar25 + -8);
          *(undefined8 *)(&stack0x00001218 + lVar25) = uVar30;
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010b75;
          lVar26 = FUN_140c38fd0(uVar30,*(undefined8 *)((longlong)auStackX_8 + lVar25));
          if (*(longlong *)(&stack0xfffffffffffffff8 + lVar25) != 0) {
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010b94;
            func_0x000140001090(*(undefined8 *)(&stack0x00001218 + lVar25),
                                *(longlong *)(&stack0xfffffffffffffff8 + lVar25),1);
          }
          *(longlong *)(&stack0x000011a8 + lVar25) = lVar26;
          if (lVar26 != 0) {
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010ba8;
            FUN_14004b880(puVar2);
          }
        }
        if (*(longlong *)(&stack0x000011c0 + lVar25) != 0) {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010bc7;
          func_0x000140001090(*(undefined8 *)(&stack0x000011c8 + lVar25),
                              *(longlong *)(&stack0x000011c0 + lVar25),1);
        }
        plVar5 = *(longlong **)(&stack0x00000af8 + lVar25);
        LOCK();
        *plVar5 = *plVar5 + -1;
        UNLOCK();
        if (*plVar5 == 0) {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010be0;
          FUN_140bded10(puVar1);
        }
      }
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400124ec;
      FUN_140053890(&stack0x000003c0 + lVar25);
      param_1 = *(longlong *)(&stack0x000011d8 + lVar25);
      if (*(longlong *)(&stack0x00000d50 + lVar25) == 2) goto LAB_1400102e0;
    }
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001030b;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    if (SBORROW8(0,*(longlong *)(&stack0x000011e0 + lVar25))) goto LAB_140010316;
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010341;
  FUN_1400394a0(&stack0x000003c0 + lVar25);
  if (SBORROW8(0,*(longlong *)(&stack0x000003c0 + lVar25))) {
    *(undefined8 *)(&stack0x00000d50 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)(&stack0x00000d58 + lVar25) = *(undefined8 *)(&stack0x000003d0 + lVar25);
    *(undefined8 *)(&stack0x00000d60 + lVar25) = *(undefined8 *)(&stack0x000003d8 + lVar25);
    lVar26 = *(longlong *)(&stack0x00000d50 + lVar25);
    if (SBORROW8(0,lVar26)) {
      lVar26 = *(longlong *)(&stack0x00000d58 + lVar25);
      goto joined_r0x0001400103ff;
    }
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010424;
      func_0x000140001090(*(undefined8 *)(&stack0x00000d58 + lVar25),lVar26,1);
    }
  }
  else {
    *(longlong *)(&stack0x00001240 + lVar25) = *(longlong *)(&stack0x000003c0 + lVar25);
    (&stack0x00000d50)[lVar25] = 1;
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400103c2;
    lVar26 = FUN_140c31be0(&stack0x00000d50 + lVar25,*(undefined8 *)(&stack0x000003c8 + lVar25),
                           *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400103e4;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    *(longlong *)(&stack0x00000d58 + lVar25) = lVar26;
    *(undefined8 *)(&stack0x00000d50 + lVar25) = 0x8000000000000000;
joined_r0x0001400103ff:
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001040d;
      FUN_14004b880(&stack0x00000d58 + lVar25);
    }
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010431;
  FUN_1400345b0(&stack0x000003c0 + lVar25);
  if (SBORROW8(0,*(longlong *)(&stack0x000003c0 + lVar25))) {
    *(undefined8 *)(&stack0x00000d50 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)(&stack0x00000d58 + lVar25) = *(undefined8 *)(&stack0x000003d0 + lVar25);
    *(undefined8 *)(&stack0x00000d60 + lVar25) = *(undefined8 *)(&stack0x000003d8 + lVar25);
    lVar26 = *(longlong *)(&stack0x00000d50 + lVar25);
    if (SBORROW8(0,lVar26)) {
      lVar26 = *(longlong *)(&stack0x00000d58 + lVar25);
      goto joined_r0x0001400104e8;
    }
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001050d;
      func_0x000140001090(*(undefined8 *)(&stack0x00000d58 + lVar25),lVar26,1);
    }
  }
  else {
    *(longlong *)(&stack0x00001240 + lVar25) = *(longlong *)(&stack0x000003c0 + lVar25);
    (&stack0x00000d50)[lVar25] = 1;
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400104ab;
    lVar26 = FUN_140c31be0(&stack0x00000d50 + lVar25,*(undefined8 *)(&stack0x000003c8 + lVar25),
                           *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400104cd;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    *(longlong *)(&stack0x00000d58 + lVar25) = lVar26;
    *(undefined8 *)(&stack0x00000d50 + lVar25) = 0x8000000000000000;
joined_r0x0001400104e8:
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400104f6;
      FUN_14004b880(&stack0x00000d58 + lVar25);
    }
  }
  lVar26 = *(longlong *)(&stack0x00001100 + lVar25);
  lVar31 = *(longlong *)(&stack0x00001108 + lVar25);
  if (lVar31 != 0) {
    puVar27 = (undefined8 *)(lVar26 + 8);
    do {
      lVar29 = puVar27[-1];
      if (lVar29 != 0) {
        uVar30 = *puVar27;
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010550;
        func_0x000140001090(uVar30,lVar29,1);
      }
      puVar27 = puVar27 + 3;
      lVar31 = lVar31 + -1;
    } while (lVar31 != 0);
  }
  if (*(longlong *)(&stack0x000010f8 + lVar25) != 0) {
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010574;
    func_0x000140001090(lVar26,*(longlong *)(&stack0x000010f8 + lVar25) * 0x18,8);
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010586;
  FUN_140002800(&UNK_140cb8e07,0x1b);
  lVar26 = *(longlong *)(*(longlong *)(param_1 + 0x160) + 0x1370);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001059e;
  lVar26 = FUN_1401ee980(lVar26 + 0x10);
  if (lVar26 == 0) {
    *(undefined **)(&stack0x00000af8 + lVar25) = &UNK_140cdc130;
    *(undefined8 *)(&stack0x00000b00 + lVar25) = 0x53;
    *(undefined1 **)(&stack0x00000d50 + lVar25) = &stack0x00000af8 + lVar25;
    *(undefined **)(&stack0x00000d58 + lVar25) = &UNK_14010b520;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400127cf;
    FUN_140c9b080(&UNK_140cdc0ec,&stack0x00000d50 + lVar25,&UNK_140cdc118);
    goto LAB_1400129a4;
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400105b7;
  FUN_140092540(&stack0x000003c0 + lVar25,lVar26);
  if (*(longlong *)(&stack0x000003c0 + lVar25) != -0x7fffffffffffffdd) {
    *(undefined8 *)(&stack0x000003c8 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)(&stack0x000003d0 + lVar25) = *(undefined8 *)(&stack0x000003d0 + lVar25);
    *(undefined8 *)(&stack0x000003d8 + lVar25) = *(undefined8 *)(&stack0x000003d8 + lVar25);
    *(longlong *)(&stack0x000003c0 + lVar25) = *(longlong *)(&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0x000003e0 + lVar25) = *(undefined8 *)(&stack0x000003e0 + lVar25);
    *(undefined8 *)(&stack0x000003e8 + lVar25) = *(undefined8 *)(&stack0x000003e8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010691;
    func_0x0001400010c0();
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400106a0;
    puVar27 = (undefined8 *)func_0x000140001080(0x30,8);
    if (puVar27 == (undefined8 *)0x0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400127e4;
      FUN_140c9aaf1(8,0x30);
      goto LAB_1400129a4;
    }
    uVar30 = *(undefined8 *)(&stack0x000003c0 + lVar25);
    uVar28 = *(undefined8 *)(&stack0x000003c8 + lVar25);
    uVar32 = *(undefined8 *)(&stack0x000003d0 + lVar25);
    uVar7 = *(undefined8 *)(&stack0x000003d8 + lVar25);
    uVar21 = *(undefined8 *)(&stack0x000003e8 + lVar25);
    puVar27[4] = *(undefined8 *)(&stack0x000003e0 + lVar25);
    puVar27[5] = uVar21;
    puVar27[2] = uVar32;
    puVar27[3] = uVar7;
    *puVar27 = uVar30;
    puVar27[1] = uVar28;
    goto LAB_140012383;
  }
  *(undefined8 *)(&stack0x00001218 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
  (&stack0x000003c0)[lVar25] = 1;
  *(undefined8 *)(&stack0x000011d8 + lVar25) = *(undefined8 *)(&stack0x000003d0 + lVar25);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010604;
  lVar26 = FUN_140c31be0(&stack0x000003c0 + lVar25);
  *(longlong *)(&stack0x000003c0 + lVar25) = lVar26;
  if (lVar26 != 0) {
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001061d;
    FUN_14004b880(&stack0x000003c0 + lVar25);
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001062a;
  FUN_1400341b0(&stack0x00000d50 + lVar25);
  if (SBORROW8(0,*(longlong *)(&stack0x00000d50 + lVar25))) {
    lVar26 = *(longlong *)(&stack0x00000d58 + lVar25);
    if (lVar26 != 0) {
      uVar30 = *(undefined8 *)(&stack0x00000d60 + lVar25);
LAB_14001089f:
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400108a4;
      func_0x000140001090(uVar30,lVar26,1);
    }
  }
  else {
    *(longlong *)(&stack0x00001238 + lVar25) = *(longlong *)(&stack0x00000d50 + lVar25);
    uVar30 = *(undefined8 *)(&stack0x00000d60 + lVar25);
    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = 8;
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x00000d58 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001070e;
    FUN_140c29d60(&stack0x000003c0 + lVar25,*(undefined8 *)(&stack0x00000d58 + lVar25),uVar30,
                  &UNK_140c9df64);
    (&stack0x00000160)[lVar25] = 1;
    *(undefined8 *)(&stack0x00001228 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010737;
    lVar26 = FUN_140c31be0(&stack0x00000160 + lVar25,*(undefined8 *)(&stack0x000003c8 + lVar25),
                           *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x000003c0 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010759;
      func_0x000140001090(*(undefined8 *)(&stack0x00001228 + lVar25),
                          *(longlong *)(&stack0x000003c0 + lVar25),1);
    }
    *(longlong *)(&stack0x00000af8 + lVar25) = lVar26;
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010771;
      FUN_14004b880(&stack0x00000af8 + lVar25);
    }
    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = 9;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010798;
    FUN_140c29d60(&stack0x000003c0 + lVar25,*(undefined8 *)(&stack0x00001240 + lVar25),uVar30,
                  &UNK_140c9df5b);
    (&stack0x00000160)[lVar25] = 1;
    *(undefined8 *)(&stack0x00001228 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400107c1;
    lVar26 = FUN_140c31be0(&stack0x00000160 + lVar25,*(undefined8 *)(&stack0x000003c8 + lVar25),
                           *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x000003c0 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400107e3;
      func_0x000140001090(*(undefined8 *)(&stack0x00001228 + lVar25),
                          *(longlong *)(&stack0x000003c0 + lVar25),1);
    }
    *(longlong *)(&stack0x00000af8 + lVar25) = lVar26;
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400107fb;
      FUN_14004b880(&stack0x00000af8 + lVar25);
    }
    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = 7;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010822;
    FUN_140c29d60(&stack0x000003c0 + lVar25,*(undefined8 *)(&stack0x00001240 + lVar25),uVar30,
                  &UNK_140c9df6c);
    (&stack0x00000160)[lVar25] = 1;
    *(undefined8 *)(&stack0x00001228 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001084b;
    lVar26 = FUN_140c31be0(&stack0x00000160 + lVar25,*(undefined8 *)(&stack0x000003c8 + lVar25),
                           *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x000003c0 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001086d;
      func_0x000140001090(*(undefined8 *)(&stack0x00001228 + lVar25),
                          *(longlong *)(&stack0x000003c0 + lVar25),1);
    }
    *(longlong *)(&stack0x00000af8 + lVar25) = lVar26;
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010885;
      FUN_14004b880(&stack0x00000af8 + lVar25);
    }
    lVar26 = *(longlong *)(&stack0x00001238 + lVar25);
    if (lVar26 != 0) {
      uVar30 = *(undefined8 *)(&stack0x00001240 + lVar25);
      goto LAB_14001089f;
    }
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400108b6;
  FUN_140002800(&UNK_140cb8e22,0x18);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400108c6;
  FUN_140003bc0(&stack0x000011a8 + lVar25,param_1);
  lVar26 = *(longlong *)(&stack0x000011a8 + lVar25);
  if (SBORROW8(0,lVar26)) {
    *(longlong *)(&stack0x000011c0 + lVar25) = *(longlong *)(&stack0x000011b0 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010905;
    FUN_1401ff8a0(&stack0x000010d8 + lVar25,*(longlong *)(&stack0x000011b0 + lVar25) + 0x10,
                  &UNK_140cb8e3a,7);
    if ((&stack0x000010d8)[lVar25] != '\x06') {
      *(undefined8 *)(&stack0x000011e0 + lVar25) = *(undefined8 *)(&stack0x000010d8 + lVar25);
      *(undefined8 *)(&stack0x000011e8 + lVar25) = *(undefined8 *)(&stack0x000010e0 + lVar25);
      *(undefined4 *)(&stack0x000011f0 + lVar25) = *(undefined4 *)(&stack0x000010e8 + lVar25);
      *(undefined4 *)(&stack0x000011f4 + lVar25) = *(undefined4 *)(&stack0x000010ec + lVar25);
      *(undefined4 *)(&stack0x000011f8 + lVar25) = *(undefined4 *)(&stack0x000010f0 + lVar25);
      *(undefined4 *)(&stack0x000011fc + lVar25) = *(undefined4 *)(&stack0x000010f4 + lVar25);
      if ((&stack0x000011e0)[lVar25] == '\x01') {
        bVar24 = (&stack0x000011e1)[lVar25];
      }
      else {
        bVar24 = 0;
        if ((&stack0x000011e0)[lVar25] == '\x03') {
          piVar16 = *(int **)(&stack0x000011f0 + lVar25);
          if (*(longlong *)(&stack0x000011f8 + lVar25) == 5) {
            if ((char)piVar16[1] == 'e' && *piVar16 == 0x736c6166) {
              bVar24 = 0;
            }
          }
          else if ((*(longlong *)(&stack0x000011f8 + lVar25) == 4) && (*piVar16 == 0x65757274)) {
            bVar24 = 1;
          }
        }
      }
      lVar26 = *(longlong *)(param_1 + 0x160);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010e77;
      FUN_14005e560(&stack0xfffffffffffffff8 + lVar25,lVar26 + 0x10,&UNK_140c9d5d0,4);
      if (*(int *)(&stack0xfffffffffffffff8 + lVar25) != 3) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010e9b;
        FUN_140c70710(&stack0x00000160 + lVar25,&stack0xfffffffffffffff8 + lVar25,0x168);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010eab;
        FUN_140233d50(&stack0x00000af8 + lVar25,&stack0xfffffffffffffff8 + lVar25);
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010eb8;
        cVar23 = FUN_1402a4520(&stack0x00000af8 + lVar25);
        if (cVar23 == '\0') {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010fea;
          FUN_14004bc30(&stack0x00000af8 + lVar25);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010ff7;
          FUN_14004c120(&stack0x00000160 + lVar25);
        }
        else {
          lVar26 = *(longlong *)(&stack0x00000af8 + lVar25);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010ee4;
          FUN_140c70710(&stack0x000003c0 + lVar25,&stack0x00000b00 + lVar25,0x210);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010efd;
          FUN_140c70710(&stack0x000005d0 + lVar25,&stack0x00000160 + lVar25,0x168);
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010f12;
          FUN_140c70710(&stack0x00000d50 + lVar25,&stack0x000003c0 + lVar25,0x378);
          if (lVar26 != 3) {
            *(longlong *)(&stack0x000003c0 + lVar25) = lVar26;
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010f3f;
            FUN_140c70710(&stack0x000003c8 + lVar25,&stack0x00000d50 + lVar25,0x378);
            *(undefined4 *)(&stack0x00000b40 + lVar25) = *(undefined4 *)(&stack0x00000448 + lVar25);
            *(undefined4 *)(&stack0x00000b00 + lVar25) = 0x2f;
            (&stack0x00000b04)[lVar25] = bVar24 & 1;
            (&stack0x00000af8)[lVar25] = 0x20;
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010f7c;
            FUN_140253310(&stack0x00000160 + lVar25,&stack0x000003c0 + lVar25,
                          &stack0x00000af8 + lVar25);
            if (*(int *)(&stack0x00000160 + lVar25) != 0x12) {
              *(undefined8 *)(&stack0x00000b10 + lVar25) =
                   *(undefined8 *)(&stack0x00000170 + lVar25);
              *(undefined8 *)(&stack0x00000b00 + lVar25) =
                   *(undefined8 *)(&stack0x00000160 + lVar25);
              *(undefined8 *)(&stack0x00000b08 + lVar25) =
                   *(undefined8 *)(&stack0x00000168 + lVar25);
              *(undefined8 *)(&stack0x00000af8 + lVar25) = 0x8000000000000000;
              *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010fc1;
              FUN_14004acd0(&stack0x00000af8 + lVar25);
            }
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010fce;
            FUN_14004bc30(&stack0x000003c0 + lVar25);
            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140010fdb;
            FUN_14004c120(&stack0x000005d8 + lVar25);
          }
        }
      }
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011004;
      FUN_14004c7c0(&stack0x000011e0 + lVar25);
    }
    plVar5 = *(longlong **)(&stack0x000011c0 + lVar25);
    LOCK();
    *plVar5 = *plVar5 + -1;
    UNLOCK();
    if (*plVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001101e;
      FUN_1401175a0(&stack0x000011c0 + lVar25);
    }
    lVar26 = *(longlong *)(&stack0x000011a8 + lVar25);
    if (!SBORROW8(0,lVar26)) goto LAB_14001102e;
  }
  else {
LAB_14001102e:
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011045;
      func_0x000140001090(*(undefined8 *)(&stack0x000011b0 + lVar25),lVar26,1);
    }
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011057;
  FUN_140002800(&UNK_140cb8e41,0x1d);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011078;
  FUN_1402068d0(&stack0x000003c0 + lVar25,&stack0x00001110 + lVar25,&UNK_140c9d90e,0xc);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001108c;
  FUN_1402047c0(&stack0x00000d50 + lVar25,&stack0x000003c0 + lVar25);
  lVar26 = *(longlong *)(&stack0x00000d58 + lVar25);
  if (*(longlong *)(&stack0x00000d50 + lVar25) == -0x7fffffffffffffd7) {
    *(longlong *)(&stack0x00000b00 + lVar25) = lVar26;
    *(undefined8 *)(&stack0x00000af8 + lVar25) = 0x8000000000000029;
    *(longlong *)(&stack0x00000d50 + lVar25) = lVar26;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400110e0;
    FUN_1401ff8a0(&stack0x000003c0 + lVar25,lVar26 + 0x10,&UNK_140c9e31b,10);
    if ((&stack0x000003c0)[lVar25] == '\x06') {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011112;
      FUN_1401ff8a0(&stack0x000003c0 + lVar25,*(longlong *)(&stack0x00000d50 + lVar25) + 0x10,
                    &UNK_140c9e325,0xb);
      if ((&stack0x000003c0)[lVar25] == '\x06') {
        plVar5 = *(longlong **)(&stack0x00000d50 + lVar25);
        LOCK();
        *plVar5 = *plVar5 + -1;
        UNLOCK();
        if (*plVar5 == 0) {
          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011139;
          FUN_1401175a0(&stack0x00000d50 + lVar25);
        }
        if (*(longlong *)(&stack0x00000af8 + lVar25) != -0x7fffffffffffffd7) goto LAB_140011187;
        goto LAB_140011194;
      }
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001128e;
      FUN_14004c7c0(&stack0x000003c0 + lVar25);
    }
    else {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001127f;
      FUN_14004c7c0(&stack0x000003c0 + lVar25);
    }
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400112a0;
    FUN_140002800(&UNK_140c9e330,0x41);
    plVar5 = *(longlong **)(&stack0x00000d50 + lVar25);
    LOCK();
    *plVar5 = *plVar5 + -1;
    UNLOCK();
    if (*plVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400112ba;
      FUN_1401175a0(&stack0x00000d50 + lVar25);
    }
    if (*(longlong *)(&stack0x00000af8 + lVar25) != -0x7fffffffffffffd7) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400112da;
      FUN_14004e360(&stack0x00000af8 + lVar25);
    }
  }
  else {
    *(undefined8 *)(&stack0x00000b0c + lVar25) = *(undefined8 *)(&stack0x00000d64 + lVar25);
    *(undefined8 *)(&stack0x00000b14 + lVar25) = *(undefined8 *)(&stack0x00000d6c + lVar25);
    *(undefined8 *)(&stack0x00000b18 + lVar25) = *(undefined8 *)(&stack0x00000d70 + lVar25);
    *(undefined8 *)(&stack0x00000b20 + lVar25) = *(undefined8 *)(&stack0x00000d78 + lVar25);
    *(undefined4 *)(&stack0x00000b08 + lVar25) = *(undefined4 *)(&stack0x00000d60 + lVar25);
    *(longlong *)(&stack0x00000b00 + lVar25) = lVar26;
    *(longlong *)(&stack0x00000af8 + lVar25) = *(longlong *)(&stack0x00000d50 + lVar25);
LAB_140011187:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011193;
    FUN_14004e360(&stack0x00000af8 + lVar25);
LAB_140011194:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400111a7;
    FUN_140004a40(&stack0x00000af8 + lVar25,*(undefined8 *)(&stack0x00001198 + lVar25));
    if (!SBORROW8(0,*(longlong *)(&stack0x00000af8 + lVar25))) {
      *(undefined8 *)(&stack0x00000d60 + lVar25) = *(undefined8 *)(&stack0x00000b08 + lVar25);
      *(undefined8 *)(&stack0x00000d50 + lVar25) = *(undefined8 *)(&stack0x00000af8 + lVar25);
      *(undefined8 *)(&stack0x00000d58 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
      *(undefined1 **)(&stack0x00000160 + lVar25) = &stack0x00000d50 + lVar25;
      *(undefined **)(&stack0x00000168 + lVar25) = &UNK_140001280;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001120b;
      FUN_140c4eb10(&stack0x000003c0 + lVar25,&UNK_140c9e371,&stack0x00000160 + lVar25);
      *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x000003c0 + lVar25);
      *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011234;
      FUN_140002800(*(undefined8 *)(&stack0x000003c8 + lVar25),
                    *(undefined8 *)(&stack0x000003d0 + lVar25));
      if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011253;
        func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                            *(longlong *)(&stack0x00001240 + lVar25),1);
      }
      if (*(longlong *)(&stack0x00000d50 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011271;
        func_0x000140001090(*(undefined8 *)(&stack0x00000d58 + lVar25),
                            *(longlong *)(&stack0x00000d50 + lVar25),1);
      }
    }
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400112ec;
  FUN_140002800(&UNK_140cb8e5e,0x27);
  plVar5 = *(longlong **)(&stack0x00001128 + lVar25);
  LOCK();
  lVar26 = *plVar5;
  *plVar5 = *plVar5 + 1;
  UNLOCK();
  if (*plVar5 == 0 || SCARRY8(lVar26,1) != *plVar5 < 0) goto LAB_1400129a4;
  uVar30 = *(undefined8 *)(&stack0x00001130 + lVar25);
  lVar26 = *(longlong *)(&stack0x00001110 + lVar25);
  lVar31 = *(longlong *)(&stack0x00001118 + lVar25);
  uVar28 = *(undefined8 *)(&stack0x00001118 + lVar25);
  uVar32 = *(undefined8 *)(&stack0x00001120 + lVar25);
  if (lVar26 == 0) {
    LOCK();
    plVar6 = (longlong *)(lVar31 + 0x200);
    lVar31 = *plVar6;
    *plVar6 = *plVar6 + 1;
    UNLOCK();
    if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) {
      pcVar17 = (code *)swi(0x29);
      (*pcVar17)(7);
                    /* WARNING: Does not return */
      pcVar17 = (code *)invalidInstructionException();
      (*pcVar17)();
    }
  }
  else if ((int)lVar26 == 1) {
    LOCK();
    plVar6 = (longlong *)(lVar31 + 0x180);
    lVar31 = *plVar6;
    *plVar6 = *plVar6 + 1;
    UNLOCK();
    if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) {
      pcVar17 = (code *)swi(0x29);
      (*pcVar17)(7);
                    /* WARNING: Does not return */
      pcVar17 = (code *)invalidInstructionException();
      (*pcVar17)();
    }
  }
  else {
    LOCK();
    plVar6 = (longlong *)(lVar31 + 0x70);
    lVar31 = *plVar6;
    *plVar6 = *plVar6 + 1;
    UNLOCK();
    if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) {
      pcVar17 = (code *)swi(0x29);
      (*pcVar17)(7);
                    /* WARNING: Does not return */
      pcVar17 = (code *)invalidInstructionException();
      (*pcVar17)();
    }
  }
  uVar4 = *(undefined4 *)(&stack0x00001150 + lVar25);
  plVar6 = *(longlong **)(&stack0x00001138 + lVar25);
  uVar7 = *(undefined8 *)(&stack0x00001148 + lVar25);
  LOCK();
  lVar31 = *plVar6;
  *plVar6 = *plVar6 + 1;
  UNLOCK();
  if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) goto LAB_1400129a4;
  plVar8 = *(longlong **)(&stack0x00001140 + lVar25);
  *plVar8 = *plVar8 + 1;
  if (*plVar8 == 0) goto LAB_1400129a4;
  plVar9 = *(longlong **)(&stack0x00001158 + lVar25);
  LOCK();
  lVar31 = *plVar9;
  *plVar9 = *plVar9 + 1;
  UNLOCK();
  if (*plVar9 == 0 || SCARRY8(lVar31,1) != *plVar9 < 0) goto LAB_1400129a4;
  plVar10 = *(longlong **)(&stack0x00001160 + lVar25);
  LOCK();
  lVar31 = *plVar10;
  *plVar10 = *plVar10 + 1;
  UNLOCK();
  if (*plVar10 == 0 || SCARRY8(lVar31,1) != *plVar10 < 0) goto LAB_1400129a4;
  plVar11 = *(longlong **)(&stack0x00001168 + lVar25);
  LOCK();
  lVar31 = *plVar11;
  *plVar11 = *plVar11 + 1;
  UNLOCK();
  if (*plVar11 == 0 || SCARRY8(lVar31,1) != *plVar11 < 0) goto LAB_1400129a4;
  plVar12 = *(longlong **)(&stack0x00001170 + lVar25);
  LOCK();
  lVar31 = *plVar12;
  *plVar12 = *plVar12 + 1;
  UNLOCK();
  if (*plVar12 == 0 || SCARRY8(lVar31,1) != *plVar12 < 0) goto LAB_1400129a4;
  plVar13 = *(longlong **)(&stack0x00001178 + lVar25);
  LOCK();
  lVar31 = *plVar13;
  *plVar13 = *plVar13 + 1;
  UNLOCK();
  if (*plVar13 == 0 || SCARRY8(lVar31,1) != *plVar13 < 0) goto LAB_1400129a4;
  *(longlong **)(&stack0x00001240 + lVar25) = plVar10;
  plVar10 = *(longlong **)(&stack0x00001180 + lVar25);
  LOCK();
  lVar31 = *plVar10;
  *plVar10 = *plVar10 + 1;
  UNLOCK();
  if (*plVar10 == 0 || SCARRY8(lVar31,1) != *plVar10 < 0) goto LAB_1400129a4;
  *(longlong **)(&stack0x00001238 + lVar25) = plVar9;
  plVar9 = *(longlong **)(&stack0x00001188 + lVar25);
  LOCK();
  lVar31 = *plVar9;
  *plVar9 = *plVar9 + 1;
  UNLOCK();
  if (*plVar9 == 0 || SCARRY8(lVar31,1) != *plVar9 < 0) goto LAB_1400129a4;
  (&stack0x00001228)[lVar25] = (&stack0x00001190)[lVar25];
  plVar14 = *(longlong **)(&stack0x00001198 + lVar25);
  LOCK();
  lVar31 = *plVar14;
  *plVar14 = *plVar14 + 1;
  UNLOCK();
  if (*plVar14 == 0 || SCARRY8(lVar31,1) != *plVar14 < 0) goto LAB_1400129a4;
  plVar15 = *(longlong **)(&stack0x000011a0 + lVar25);
  LOCK();
  lVar31 = *plVar15;
  *plVar15 = *plVar15 + 1;
  UNLOCK();
  if (*plVar15 == 0 || SCARRY8(lVar31,1) != *plVar15 < 0) goto LAB_1400129a4;
  *(longlong *)(&stack0x000003c0 + lVar25) = lVar26;
  *(undefined8 *)(&stack0x000003c8 + lVar25) = uVar28;
  *(undefined8 *)(&stack0x000003d0 + lVar25) = uVar32;
  *(longlong **)(&stack0x000003d8 + lVar25) = plVar5;
  *(undefined8 *)(&stack0x000003e0 + lVar25) = uVar30;
  *(longlong **)(&stack0x000003e8 + lVar25) = plVar6;
  *(longlong **)(&stack0x000003f0 + lVar25) = plVar8;
  *(undefined8 *)(&stack0x000003f8 + lVar25) = uVar7;
  *(undefined4 *)(&stack0x00000400 + lVar25) = uVar4;
  *(undefined8 *)(&stack0x00000408 + lVar25) = *(undefined8 *)(&stack0x00001238 + lVar25);
  *(undefined8 *)(&stack0x00000410 + lVar25) = *(undefined8 *)(&stack0x00001240 + lVar25);
  *(longlong **)(&stack0x00000418 + lVar25) = plVar11;
  *(longlong **)(&stack0x00000420 + lVar25) = plVar12;
  *(longlong **)(&stack0x00000428 + lVar25) = plVar13;
  *(longlong **)(&stack0x00000430 + lVar25) = plVar10;
  *(longlong **)(&stack0x00000438 + lVar25) = plVar9;
  (&stack0x00000440)[lVar25] = (&stack0x00001228)[lVar25];
  *(longlong **)(&stack0x00000448 + lVar25) = plVar14;
  *(longlong **)(&stack0x00000450 + lVar25) = plVar15;
  *(undefined2 *)(&stack0x000005f8 + lVar25) = 1;
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400114f3;
  FUN_140366de0(&stack0x000003c0 + lVar25,&UNK_140cb8e88);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011516;
  FUN_140002800(&UNK_140cb8ea0,0x1c);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011528;
  FUN_140002800(&UNK_140cb8ebc,0x1c);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011535;
  FUN_1400341b0(&stack0x000003c0 + lVar25);
  lVar26 = *(longlong *)(&stack0x000003c8 + lVar25);
  uVar30 = *(undefined8 *)(&stack0x000003d0 + lVar25);
  if (SBORROW8(0,*(longlong *)(&stack0x000003c0 + lVar25))) {
    uVar28 = *(undefined8 *)(&stack0x000003d8 + lVar25);
LAB_1400118ba:
    if (SBORROW8(0,lVar26)) goto LAB_1400118c2;
    *(longlong *)(&stack0x00000d50 + lVar25) = lVar26;
    *(undefined8 *)(&stack0x00000d58 + lVar25) = uVar30;
    *(undefined8 *)(&stack0x00000d60 + lVar25) = uVar28;
    *(undefined1 **)(&stack0x00000af8 + lVar25) = &stack0x00000d50 + lVar25;
    *(undefined **)(&stack0x00000b00 + lVar25) = &UNK_140001280;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001191e;
    FUN_140c4eb10(&stack0x000003c0 + lVar25,&UNK_140cb8ef2,&stack0x00000af8 + lVar25);
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011947;
    FUN_140002800(*(undefined8 *)(&stack0x000003c8 + lVar25),
                  *(undefined8 *)(&stack0x000003d0 + lVar25));
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011966;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    if (*(longlong *)(&stack0x00000d50 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011984;
      func_0x000140001090(*(undefined8 *)(&stack0x00000d58 + lVar25),
                          *(longlong *)(&stack0x00000d50 + lVar25),1);
    }
  }
  else {
    *(longlong *)(&stack0x00001240 + lVar25) = *(longlong *)(&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = 3;
    *(longlong *)(&stack0x00001238 + lVar25) = lVar26;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011599;
    FUN_140c29d60(&stack0x00000d50 + lVar25,lVar26,uVar30,&UNK_140c9d739);
    lVar31 = *(longlong *)(&stack0x00000d50 + lVar25);
    lVar26 = *(longlong *)(&stack0x00000d58 + lVar25);
    uVar30 = *(undefined8 *)(&stack0x00000d60 + lVar25);
    uVar28 = *(undefined8 *)(&stack0x00000d68 + lVar25);
    uVar32 = *(undefined8 *)(&stack0x00000d60 + lVar25);
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400115d5;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    if (SBORROW8(0,lVar31)) goto LAB_1400118ba;
    *(longlong *)(&stack0x00001240 + lVar25) = lVar31;
    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = 0xb;
    *(longlong *)(&stack0x00001238 + lVar25) = lVar26;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011611;
    FUN_140c29d60(&stack0x00000af8 + lVar25,lVar26,uVar32,&UNK_140cb97cf);
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011630;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    uVar30 = *(undefined8 *)(&stack0x00000b08 + lVar25);
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001164d;
    uVar28 = uVar30;
    lVar26 = FUN_140c29e70(*(undefined8 *)(&stack0x00000b00 + lVar25),uVar30);
    if (lVar26 != 0) {
      (&stack0x000003c0)[lVar25] = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011670;
      lVar26 = FUN_140c31be0(&stack0x000003c0 + lVar25,lVar26,uVar28);
      if (lVar26 == 0) goto LAB_1400116ff;
      *(longlong *)(&stack0x00000160 + lVar25) = lVar26;
      *(undefined8 *)(&stack0x00000d50 + lVar25) = 0;
      *(undefined8 *)(&stack0x00000d58 + lVar25) = 1;
      *(undefined8 *)(&stack0x00000d60 + lVar25) = 0;
      *(undefined8 *)(&stack0x000003d0 + lVar25) = 0x60000020;
      *(undefined1 **)(&stack0x000003c0 + lVar25) = &stack0x00000d50 + lVar25;
      *(undefined **)(&stack0x000003c8 + lVar25) = &UNK_140cdb0d0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400116d5;
      cVar23 = FUN_140c43150(&stack0x00000160 + lVar25,&stack0x000003c0 + lVar25);
      if (cVar23 != '\0') {
        *(undefined **)(&stack0xffffffffffffffe0 + lVar25) = &UNK_140cdb188;
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012815;
        FUN_140c9ae20(&UNK_140cdb100,0x37,&stack0x00001226 + lVar25,&UNK_140cdb218);
        goto LAB_1400129a4;
      }
      lVar26 = *(longlong *)(&stack0x00000d50 + lVar25);
      uVar30 = *(undefined8 *)(&stack0x00000d58 + lVar25);
      uVar28 = *(undefined8 *)(&stack0x00000d60 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400116f9;
      FUN_14004b880(&stack0x00000160 + lVar25);
LAB_14001189c:
      if (*(longlong *)(&stack0x00000af8 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400118ba;
        func_0x000140001090(*(undefined8 *)(&stack0x00001240 + lVar25),
                            *(longlong *)(&stack0x00000af8 + lVar25),1);
      }
      goto LAB_1400118ba;
    }
LAB_1400116ff:
    *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = 3;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011725;
    FUN_140c29b80(&stack0x00000d50 + lVar25,*(undefined8 *)(&stack0x00001240 + lVar25),uVar30,
                  &UNK_140cb97da);
    uVar28 = *(undefined8 *)(&stack0x00000d60 + lVar25);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x00000d58 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011750;
    lVar26 = FUN_140c40040(*(undefined8 *)(&stack0x00000d58 + lVar25),uVar28,&UNK_140cb97dd,0x20dd8)
    ;
    if (lVar26 != 0) {
      *(longlong *)(&stack0xfffffffffffffff8 + lVar25) = lVar26;
      *(undefined8 *)(&stack0x00000160 + lVar25) = 0;
      *(undefined8 *)(&stack0x00000168 + lVar25) = 1;
      *(undefined8 *)(&stack0x00000170 + lVar25) = 0;
      *(undefined8 *)(&stack0x000003d0 + lVar25) = 0x60000020;
      *(undefined1 **)(&stack0x000003c0 + lVar25) = &stack0x00000160 + lVar25;
      *(undefined **)(&stack0x000003c8 + lVar25) = &UNK_140cdb0d0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400117b6;
      cVar23 = FUN_140c43150(&stack0xfffffffffffffff8 + lVar25,&stack0x000003c0 + lVar25);
      if (cVar23 != '\0') {
        *(undefined **)(&stack0xffffffffffffffe0 + lVar25) = &UNK_140cdb188;
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012846;
        FUN_140c9ae20(&UNK_140cdb100,0x37,&stack0x00001226 + lVar25,&UNK_140cdb218);
        goto LAB_1400129a4;
      }
      lVar26 = *(longlong *)(&stack0x00000160 + lVar25);
      uVar30 = *(undefined8 *)(&stack0x00000168 + lVar25);
      uVar28 = *(undefined8 *)(&stack0x00000170 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400117d7;
      FUN_14004b880(&stack0xfffffffffffffff8 + lVar25);
LAB_14001187e:
      if (*(longlong *)(&stack0x00000d50 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001189c;
        func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                            *(longlong *)(&stack0x00000d50 + lVar25),1);
      }
      goto LAB_14001189c;
    }
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400117f6;
    lVar26 = FUN_140c39590(*(undefined8 *)(&stack0x00001238 + lVar25),uVar28,
                           *(undefined8 *)(&stack0x00001240 + lVar25),uVar30);
    if (lVar26 != 0) {
      *(longlong *)(&stack0xfffffffffffffff8 + lVar25) = lVar26;
      *(undefined8 *)(&stack0x00000160 + lVar25) = 0;
      *(undefined8 *)(&stack0x00000168 + lVar25) = 1;
      *(undefined8 *)(&stack0x00000170 + lVar25) = 0;
      *(undefined8 *)(&stack0x000003d0 + lVar25) = 0x60000020;
      *(undefined1 **)(&stack0x000003c0 + lVar25) = &stack0x00000160 + lVar25;
      *(undefined **)(&stack0x000003c8 + lVar25) = &UNK_140cdb0d0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001185c;
      cVar23 = FUN_140c43150(&stack0xfffffffffffffff8 + lVar25,&stack0x000003c0 + lVar25);
      if (cVar23 != '\0') {
        *(undefined **)(&stack0xffffffffffffffe0 + lVar25) = &UNK_140cdb188;
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012877;
        FUN_140c9ae20(&UNK_140cdb100,0x37,&stack0x00001226 + lVar25,&UNK_140cdb218);
        goto LAB_1400129a4;
      }
      lVar26 = *(longlong *)(&stack0x00000160 + lVar25);
      uVar30 = *(undefined8 *)(&stack0x00000168 + lVar25);
      uVar28 = *(undefined8 *)(&stack0x00000170 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001187d;
      FUN_14004b880(&stack0xfffffffffffffff8 + lVar25);
      goto LAB_14001187e;
    }
    *(undefined8 *)(&stack0x000011e0 + lVar25) = 0x20dd8;
    *(undefined8 *)(&stack0xfffffffffffffff8 + lVar25) = *(undefined8 *)(&stack0x00001240 + lVar25);
    *(undefined8 *)((longlong)auStackX_8 + lVar25 + -8) = uVar30;
    *(undefined1 **)(&stack0x000003c0 + lVar25) = &stack0x000011e0 + lVar25;
    *(code **)(&stack0x000003c8 + lVar25) = FUN_140c5c650;
    *(undefined1 **)(&stack0x000003d0 + lVar25) = &stack0xfffffffffffffff8 + lVar25;
    *(undefined **)(&stack0x000003d8 + lVar25) = &UNK_140c41ef0;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001241d;
    FUN_140c4eb10(&stack0x00000160 + lVar25,&UNK_140cda5b5,&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0x00001228 + lVar25) = *(undefined8 *)(&stack0x00000160 + lVar25);
    *(undefined8 *)(&stack0x00001208 + lVar25) = *(undefined8 *)(&stack0x00000168 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012446;
    FUN_140002800(*(undefined8 *)(&stack0x00000168 + lVar25),
                  *(undefined8 *)(&stack0x00000170 + lVar25));
    if (*(longlong *)(&stack0x00001228 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012465;
      func_0x000140001090(*(undefined8 *)(&stack0x00001208 + lVar25),
                          *(longlong *)(&stack0x00001228 + lVar25),1);
    }
    if (*(longlong *)(&stack0x00000d50 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012483;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00000d50 + lVar25),1);
    }
    if (*(longlong *)(&stack0x00000af8 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400124a5;
      func_0x000140001090(*(undefined8 *)(&stack0x00001240 + lVar25),
                          *(longlong *)(&stack0x00000af8 + lVar25),1);
    }
LAB_1400118c2:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400118d3;
    FUN_140002800(&UNK_140cb8ed8,0x1a);
  }
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400119a5;
  FUN_1402068d0(&stack0x000003c0 + lVar25,&stack0x00001110 + lVar25,&UNK_140c9d90e,0xc);
  *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400119bc;
  FUN_1402047c0(&stack0x00000d50 + lVar25,&stack0x000003c0 + lVar25);
  plVar5 = *(longlong **)(&stack0x00000d58 + lVar25);
  if (*(longlong *)(&stack0x00000d50 + lVar25) == -0x7fffffffffffffd7) {
    *(longlong **)(&stack0x00000b00 + lVar25) = plVar5;
    *(undefined8 *)(&stack0x00000af8 + lVar25) = 0x8000000000000029;
    *(longlong **)(&stack0x00000d50 + lVar25) = plVar5;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011a02;
    FUN_1401ff8a0(&stack0x000003c0 + lVar25,plVar5 + 2,&UNK_140cdab34,0x1c);
    if ((&stack0x000003c0)[lVar25] == '\x06') {
      LOCK();
      *plVar5 = *plVar5 + -1;
      UNLOCK();
      if (*plVar5 == 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011a22;
        FUN_1401175a0(&stack0x00000d50 + lVar25);
      }
      if (*(longlong *)(&stack0x00000af8 + lVar25) != -0x7fffffffffffffd7) goto LAB_140011a70;
      goto LAB_140011a7d;
    }
    if ((&stack0x000003c0)[lVar25] == '\x01') {
      bVar24 = (&stack0x000003c1)[lVar25];
      goto LAB_140011f9c;
    }
    if ((&stack0x000003c0)[lVar25] == '\x03') {
      piVar16 = *(int **)(&stack0x000003d0 + lVar25);
      if (*(longlong *)(&stack0x000003d8 + lVar25) == 5) {
        if ((char)piVar16[1] != 'e' || *piVar16 != 0x736c6166) goto LAB_140011f99;
        bVar24 = 0;
      }
      else {
        if ((*(longlong *)(&stack0x000003d8 + lVar25) != 4) || (*piVar16 != 0x65757274))
        goto LAB_140011f99;
        bVar24 = 1;
      }
    }
    else {
LAB_140011f99:
      bVar24 = 0;
    }
LAB_140011f9c:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011fa8;
    FUN_14004c7c0(&stack0x000003c0 + lVar25);
    plVar5 = *(longlong **)(&stack0x00000d50 + lVar25);
    LOCK();
    *plVar5 = *plVar5 + -1;
    UNLOCK();
    if (*plVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011fc2;
      FUN_1401175a0(&stack0x00000d50 + lVar25);
    }
    if (*(longlong *)(&stack0x00000af8 + lVar25) != -0x7fffffffffffffd7) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011fe2;
      FUN_14004e360(&stack0x00000af8 + lVar25);
    }
    if ((bVar24 & 1) == 0) goto LAB_140011a7d;
LAB_14001204c:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001205d;
    FUN_140002800(&UNK_140cb8f18,0x28);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001206a;
    FUN_140005400(&stack0x00001110 + lVar25);
  }
  else {
    *(undefined8 *)(&stack0x00000b0c + lVar25) = *(undefined8 *)(&stack0x00000d64 + lVar25);
    *(undefined8 *)(&stack0x00000b14 + lVar25) = *(undefined8 *)(&stack0x00000d6c + lVar25);
    *(undefined8 *)(&stack0x00000b18 + lVar25) = *(undefined8 *)(&stack0x00000d70 + lVar25);
    *(undefined8 *)(&stack0x00000b20 + lVar25) = *(undefined8 *)(&stack0x00000d78 + lVar25);
    *(undefined4 *)(&stack0x00000b08 + lVar25) = *(undefined4 *)(&stack0x00000d60 + lVar25);
    *(longlong **)(&stack0x00000b00 + lVar25) = plVar5;
    *(longlong *)(&stack0x00000af8 + lVar25) = *(longlong *)(&stack0x00000d50 + lVar25);
LAB_140011a70:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011a7c;
    FUN_14004e360(&stack0x00000af8 + lVar25);
LAB_140011a7d:
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011a99;
    FUN_140c36d10(&stack0x000003c0 + lVar25,&UNK_140cda950,0x13);
    lVar26 = *(longlong *)(&stack0x000003c0 + lVar25);
    if (lVar26 != -0x7fffffffffffffff) {
LAB_140011b14:
      *(longlong *)(&stack0x00001240 + lVar25) = lVar26;
      (&stack0x00001227)[lVar25] = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011b33;
      FUN_140002800(&UNK_140cdab00,0x34);
      (&stack0x00001227)[lVar25] = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011b47;
      FUN_14003b0e0(&stack0x00001110 + lVar25);
      lVar26 = *(longlong *)(&stack0x00001240 + lVar25);
      if (!SBORROW8(0,lVar26)) {
        puVar34 = &stack0x000003c0 + lVar25;
        if (lVar26 == -0x7fffffffffffffff) {
          lVar26 = *(longlong *)(&stack0x000003c8 + lVar25);
          puVar34 = &stack0x000003c8 + lVar25;
        }
        if (lVar26 != 0) {
          uVar30 = *(undefined8 *)(puVar34 + 8);
          goto LAB_140011b81;
        }
      }
      goto LAB_14001204c;
    }
    uVar30 = *(undefined8 *)(&stack0x000003d0 + lVar25);
    lVar31 = *(longlong *)(&stack0x000003d8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011ac9;
    lVar29 = lVar31;
    FUN_1400543f0(uVar30);
    if (lVar29 == 0) goto LAB_140011b14;
    lVar26 = *(longlong *)(&stack0x000003c8 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011ae0;
    uVar28 = FUN_1400543f0(uVar30);
    if (lVar31 < 0) {
      *(longlong *)(&stack0x00001238 + lVar25) = lVar26;
      uVar32 = 0;
LAB_140011af5:
      *(undefined8 *)(&stack0x00001228 + lVar25) = uVar30;
      *(undefined8 *)(&stack0x00001240 + lVar25) = 0x8000000000000001;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011b0e;
      FUN_140c9ab0b(uVar32,lVar31);
      goto LAB_1400129a4;
    }
    if (lVar31 == 0) {
      lVar29 = 1;
    }
    else {
      *(longlong *)(&stack0x00001238 + lVar25) = lVar26;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011bf5;
      func_0x0001400010c0();
      uVar32 = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011c07;
      lVar29 = func_0x000140001080(lVar31,1);
      if (lVar29 == 0) goto LAB_140011af5;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011c21;
      FUN_140c70710(lVar29,uVar28,lVar31);
      lVar26 = *(longlong *)(&stack0x00001238 + lVar25);
    }
    if (lVar26 != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011c3e;
      func_0x000140001090(uVar30,lVar26,1);
    }
    (&stack0x00001235)[lVar25] = 1;
    *(longlong *)(&stack0x00001208 + lVar25) = lVar29;
    *(longlong *)(&stack0x00001228 + lVar25) = lVar31;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011c5e;
    cVar23 = FUN_140c29e00(lVar29,lVar31);
    if (cVar23 == '\0') {
      (&stack0x00001235)[lVar25] = 1;
      uVar30 = *(undefined8 *)(&stack0x00001228 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011c7d;
      lVar26 = FUN_140c29e70(*(undefined8 *)(&stack0x00001208 + lVar25),uVar30);
      if (lVar26 == 0) goto LAB_140011cb5;
      (&stack0x00001235)[lVar25] = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011c9c;
      uVar32 = func_0x000140c29760(&stack0x00000d50 + lVar25,lVar26,uVar30);
      uVar30 = *(undefined8 *)(&stack0x00000d58 + lVar25);
      uVar28 = *(undefined8 *)(&stack0x00000d60 + lVar25);
      *(int *)(&stack0x00001214 + lVar25) = (int)CONCAT71((int7)((ulonglong)uVar32 >> 8),1);
    }
    else {
LAB_140011cb5:
      uVar28 = *(undefined8 *)(&stack0x00001228 + lVar25);
      *(undefined8 *)(&stack0x00000d50 + lVar25) = uVar28;
      uVar30 = *(undefined8 *)(&stack0x00001208 + lVar25);
      *(undefined8 *)(&stack0x00000d58 + lVar25) = uVar30;
      *(undefined8 *)(&stack0x00000d60 + lVar25) = uVar28;
      (&stack0x00000d68)[lVar25] = 1;
      *(undefined4 *)(&stack0x00001214 + lVar25) = 0;
    }
    *(undefined8 *)(&stack0x00001238 + lVar25) = uVar30;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011cf8;
    cVar23 = FUN_140c29e00(uVar30,uVar28);
    if (cVar23 == '\0') {
      *(undefined8 *)(&stack0x00000160 + lVar25) = *(undefined8 *)(&stack0x00001238 + lVar25);
      *(undefined8 *)(&stack0x00000168 + lVar25) = uVar28;
      *(undefined1 **)(&stack0x00000af8 + lVar25) = &stack0x00000160 + lVar25;
      *(undefined **)(&stack0x00000b00 + lVar25) = &UNK_140c41ef0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011e1b;
      FUN_140c4eb10(&stack0x000003c0 + lVar25,&UNK_140cdaa41,&stack0x00000af8 + lVar25);
      *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x000003c0 + lVar25);
      *(undefined8 *)(&stack0x00001200 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011e44;
      FUN_140002800(*(undefined8 *)(&stack0x000003c8 + lVar25),
                    *(undefined8 *)(&stack0x000003d0 + lVar25));
      if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011e63;
        func_0x000140001090(*(undefined8 *)(&stack0x00001200 + lVar25),
                            *(longlong *)(&stack0x00001240 + lVar25),1);
      }
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011e70;
      FUN_14003b0e0(&stack0x00001110 + lVar25);
LAB_14001200e:
      if (*(longlong *)(&stack0x00000d50 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001202c;
        func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                            *(longlong *)(&stack0x00000d50 + lVar25),1);
      }
      lVar26 = *(longlong *)(&stack0x00001228 + lVar25);
      uVar30 = *(undefined8 *)(&stack0x00001208 + lVar25);
      if (((&stack0x00001214)[lVar25] & lVar26 != 0) == 0) goto LAB_14001204c;
LAB_140011b81:
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011b8c;
      func_0x000140001090(uVar30,lVar26,1);
      goto LAB_14001204c;
    }
    *(undefined1 (*) [16])(&stack0x00000160 + lVar25) = (undefined1  [16])0x0;
    *(undefined8 *)(&stack0x00000170 + lVar25) = 0;
    lVar26 = 0;
    uVar33 = 0;
    for (lVar31 = 0; *(longlong *)(&stack0x000011e0 + lVar25) = lVar26, lVar31 != 0x30;
        lVar31 = lVar31 + 0x10) {
      uVar30 = *(undefined8 *)(&UNK_140cda920 + lVar31);
      *(undefined8 *)(&stack0xffffffffffffffe0 + lVar25) = *(undefined8 *)(&UNK_140cda928 + lVar31);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011d70;
      FUN_140c29d60(&stack0x000003c0 + lVar25,*(undefined8 *)(&stack0x00001238 + lVar25),uVar28,
                    uVar30);
      *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x000003c8 + lVar25);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011d8b;
      lVar26 = FUN_140039640(*(undefined8 *)(&stack0x000003c8 + lVar25),
                             *(undefined8 *)(&stack0x000003d0 + lVar25));
      if (2 < uVar33) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012966;
        FUN_140c9aea3(uVar33,3,&UNK_140cdaae8);
        goto LAB_1400129a4;
      }
      *(longlong *)(&stack0x00000160 + uVar33 * 8 + lVar25) = lVar26;
      if (*(longlong *)(&stack0x000003c0 + lVar25) != 0) {
        *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011dbf;
        func_0x000140001090(*(undefined8 *)(&stack0x00001240 + lVar25),
                            *(longlong *)(&stack0x000003c0 + lVar25),1);
      }
      uVar33 = uVar33 + 1;
      lVar26 = lVar26 + *(longlong *)(&stack0x000011e0 + lVar25);
    }
    if (lVar26 == 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012000;
      FUN_140002800(&UNK_140cdaa74,0x34);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001200d;
      FUN_14003b0e0(&stack0x00001110 + lVar25);
      goto LAB_14001200e;
    }
    *(undefined8 *)(&stack0xfffffffffffffff8 + lVar25) = *(undefined8 *)(&stack0x00001238 + lVar25);
    *(undefined8 *)((longlong)auStackX_8 + lVar25 + -8) = uVar28;
    *(undefined1 **)(&stack0x000003c0 + lVar25) = &stack0x000011e0 + lVar25;
    *(code **)(&stack0x000003c8 + lVar25) = FUN_140c5c650;
    *(undefined1 **)(&stack0x000003d0 + lVar25) = &stack0xfffffffffffffff8 + lVar25;
    *(undefined **)(&stack0x000003d8 + lVar25) = &UNK_140c41ef0;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011edd;
    FUN_140c4eb10(&stack0x00000af8 + lVar25,&UNK_140cdaaa8,&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x00000af8 + lVar25);
    *(undefined8 *)(&stack0x00001200 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011f06;
    FUN_140002800(*(undefined8 *)(&stack0x00000b00 + lVar25),
                  *(undefined8 *)(&stack0x00000b08 + lVar25));
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011f25;
      func_0x000140001090(*(undefined8 *)(&stack0x00001200 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011f3c;
    FUN_140c4e470(&stack0x000003c0 + lVar25,*(undefined8 *)(&stack0x00001238 + lVar25),uVar28);
    uVar30 = *(undefined8 *)(&stack0x000003c8 + lVar25);
    lVar26 = *(longlong *)(&stack0x000003d0 + lVar25);
    if (lVar26 < 0) {
      uVar28 = 0;
LAB_140011f57:
      *(undefined8 *)(&stack0x00001240 + lVar25) = uVar30;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140011f69;
      FUN_140c9ab0b(uVar28,lVar26);
      goto LAB_1400129a4;
    }
    if (lVar26 == 0) {
      lVar31 = 1;
    }
    else {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400124b1;
      func_0x0001400010c0();
      uVar28 = 1;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400124c4;
      lVar31 = func_0x000140001080(lVar26,1);
      if (lVar31 == 0) goto LAB_140011f57;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400124de;
      FUN_140c70710(lVar31,uVar30,lVar26);
    }
    uVar32 = *(undefined8 *)(&stack0x00000160 + lVar25);
    uVar7 = *(undefined8 *)(&stack0x00000168 + lVar25);
    uVar28 = *(undefined8 *)(&stack0x00000170 + lVar25);
    lVar29 = *(longlong *)(&stack0x00001228 + lVar25);
    if (*(longlong *)(&stack0x00000d50 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012547;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00000d50 + lVar25),1);
    }
    if (((&stack0x00001214)[lVar25] & lVar29 != 0) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001256a;
      func_0x000140001090(*(undefined8 *)(&stack0x00001208 + lVar25),lVar29,1);
    }
    if (0 < *(longlong *)(&stack0x000003c0 + lVar25)) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012584;
      func_0x000140001090(uVar30,*(longlong *)(&stack0x000003c0 + lVar25),1);
    }
    *(longlong *)(&stack0x00000d50 + lVar25) = lVar26;
    *(longlong *)(&stack0x00000d58 + lVar25) = lVar31;
    *(longlong *)(&stack0x00000d60 + lVar25) = lVar26;
    *(undefined8 *)(&stack0x00000d68 + lVar25) = uVar32;
    *(undefined8 *)(&stack0x00000d70 + lVar25) = uVar7;
    *(undefined8 *)(&stack0x00000d78 + lVar25) = uVar28;
    *(undefined1 **)(&stack0x000003c0 + lVar25) = &stack0x00000d50 + lVar25;
    *(undefined **)(&stack0x000003c8 + lVar25) = &UNK_140001280;
    *(undefined1 **)(&stack0x000003d0 + lVar25) = &stack0x00000d68 + lVar25;
    *(code **)(&stack0x000003d8 + lVar25) = FUN_140c5c650;
    *(undefined1 **)(&stack0x000003e0 + lVar25) = &stack0x00000d70 + lVar25;
    *(code **)(&stack0x000003e8 + lVar25) = FUN_140c5c650;
    *(undefined1 **)(&stack0x000003f0 + lVar25) = &stack0x00000d78 + lVar25;
    *(code **)(&stack0x000003f8 + lVar25) = FUN_140c5c650;
    (&stack0x00001237)[lVar25] = 1;
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001261d;
    FUN_140c4eb10(&stack0x00000af8 + lVar25,&UNK_140cb8f40,&stack0x000003c0 + lVar25);
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x00000af8 + lVar25);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x00000b00 + lVar25);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012646;
    FUN_140002800(*(undefined8 *)(&stack0x00000b00 + lVar25),
                  *(undefined8 *)(&stack0x00000b08 + lVar25));
    if (*(longlong *)(&stack0x00001240 + lVar25) != 0) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001266c;
      func_0x000140001090(*(undefined8 *)(&stack0x00001238 + lVar25),
                          *(longlong *)(&stack0x00001240 + lVar25),1);
    }
    *(undefined8 *)(&stack0x00001240 + lVar25) = *(undefined8 *)(&stack0x00000d50 + lVar25);
    *(undefined8 *)(&stack0x00001238 + lVar25) = *(undefined8 *)(&stack0x00000d58 + lVar25);
    *(undefined8 *)(&stack0x000003c0 + lVar25) = *(undefined8 *)(&stack0x00000d60 + lVar25);
    *(undefined8 *)(&stack0x000003c8 + lVar25) = *(undefined8 *)(&stack0x00000d68 + lVar25);
    *(undefined4 *)(&stack0x000003d0 + lVar25) = *(undefined4 *)(&stack0x00000d70 + lVar25);
    *(undefined4 *)(&stack0x000003d4 + lVar25) = *(undefined4 *)(&stack0x00000d74 + lVar25);
    *(undefined4 *)(&stack0x000003d8 + lVar25) = *(undefined4 *)(&stack0x00000d78 + lVar25);
    *(undefined4 *)(&stack0x000003dc + lVar25) = *(undefined4 *)(&stack0x00000d7c + lVar25);
    lVar26 = *(longlong *)(*(longlong *)(&stack0x00001198 + lVar25) + 0x1370);
    *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400126b6;
    lVar26 = FUN_1401ed950(lVar26 + 0x10);
    if (lVar26 == 0) {
      *(undefined **)(&stack0x00000160 + lVar25) = &UNK_140cdbc50;
      *(undefined8 *)(&stack0x00000168 + lVar25) = 0x17;
      *(undefined1 **)(&stack0x00000af8 + lVar25) = &stack0x00000160 + lVar25;
      *(undefined **)(&stack0x00000b00 + lVar25) = &UNK_14010b520;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400128cc;
      FUN_140c9b080(&UNK_140cdc0ec,&stack0x00000af8 + lVar25,&UNK_140cdc118);
      goto LAB_1400129a4;
    }
    pcVar35 = (char *)(lVar26 + 0x60);
    LOCK();
    bVar36 = *(char *)(lVar26 + 0x60) == '\0';
    if (bVar36) {
      *(char *)(lVar26 + 0x60) = '\x01';
    }
    UNLOCK();
    if (!bVar36) {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400128da;
      FUN_140c992d0(pcVar35);
    }
    puVar22 = _DAT_14119ede8;
    if ((*_DAT_14119ede8 & 0x7fffffffffffffff) == 0) {
      bVar24 = 0;
      cVar23 = *(char *)(lVar26 + 0x61);
    }
    else {
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400128e5;
      bVar24 = func_0x000140c9a010();
      bVar24 = bVar24 ^ 1;
      cVar23 = *(char *)(lVar26 + 0x61);
    }
    if (cVar23 != '\0') {
      *(char **)(&stack0x00000af8 + lVar25) = pcVar35;
      (&stack0x00000b00)[lVar25] = bVar24;
      *(undefined **)(&stack0xffffffffffffffe0 + lVar25) = &UNK_140cb8fa0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012931;
      FUN_140c9ae20(&UNK_140cdb358,0x2b,&stack0x00000af8 + lVar25,&UNK_140cdb338);
      goto LAB_1400129a4;
    }
    lVar31 = *(longlong *)(lVar26 + 0x68);
    if ((!SBORROW8(0,lVar31)) && (lVar31 != 0)) {
      uVar30 = *(undefined8 *)(lVar26 + 0x70);
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001271a;
      func_0x000140001090(uVar30,lVar31,1);
    }
    *(undefined8 *)(lVar26 + 0x68) = *(undefined8 *)(&stack0x00001240 + lVar25);
    *(undefined8 *)(lVar26 + 0x70) = *(undefined8 *)(&stack0x00001238 + lVar25);
    uVar30 = *(undefined8 *)(&stack0x000003c8 + lVar25);
    uVar4 = *(undefined4 *)(&stack0x000003d0 + lVar25);
    uVar18 = *(undefined4 *)(&stack0x000003d4 + lVar25);
    uVar19 = *(undefined4 *)(&stack0x000003d8 + lVar25);
    uVar20 = *(undefined4 *)(&stack0x000003dc + lVar25);
    *(undefined8 *)(lVar26 + 0x78) = *(undefined8 *)(&stack0x000003c0 + lVar25);
    *(undefined8 *)(lVar26 + 0x80) = uVar30;
    *(undefined4 *)(lVar26 + 0x88) = uVar4;
    *(undefined4 *)(lVar26 + 0x8c) = uVar18;
    *(undefined4 *)(lVar26 + 0x90) = uVar19;
    *(undefined4 *)(lVar26 + 0x94) = uVar20;
    if ((bVar24 == 0) && ((*puVar22 & 0x7fffffffffffffff) != 0)) {
      (&stack0x00001237)[lVar25] = 0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012940;
      cVar23 = func_0x000140c9a010();
      if (cVar23 == '\0') {
        *(undefined1 *)(lVar26 + 0x61) = 1;
      }
    }
    LOCK();
    cVar23 = *pcVar35;
    *pcVar35 = '\0';
    UNLOCK();
    if (cVar23 == '\x02') {
      (&stack0x00001237)[lVar25] = 0;
      *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001277a;
      func_0x000140c99390(pcVar35);
    }
  }
  plVar5 = *(longlong **)(&stack0x00001128 + lVar25);
  LOCK();
  lVar26 = *plVar5;
  *plVar5 = *plVar5 + 1;
  UNLOCK();
  if (*plVar5 != 0 && SCARRY8(lVar26,1) == *plVar5 < 0) {
    uVar30 = *(undefined8 *)(&stack0x00001130 + lVar25);
    lVar26 = *(longlong *)(&stack0x00001110 + lVar25);
    lVar31 = *(longlong *)(&stack0x00001118 + lVar25);
    uVar28 = *(undefined8 *)(&stack0x00001118 + lVar25);
    uVar32 = *(undefined8 *)(&stack0x00001120 + lVar25);
    if (lVar26 == 2) {
      LOCK();
      plVar6 = (longlong *)(lVar31 + 0x70);
      lVar31 = *plVar6;
      *plVar6 = *plVar6 + 1;
      UNLOCK();
      if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) {
        pcVar17 = (code *)swi(0x29);
        (*pcVar17)(7);
                    /* WARNING: Does not return */
        pcVar17 = (code *)invalidInstructionException();
        (*pcVar17)();
      }
    }
    else if ((int)lVar26 == 1) {
      LOCK();
      plVar6 = (longlong *)(lVar31 + 0x180);
      lVar31 = *plVar6;
      *plVar6 = *plVar6 + 1;
      UNLOCK();
      if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) {
        pcVar17 = (code *)swi(0x29);
        (*pcVar17)(7);
                    /* WARNING: Does not return */
        pcVar17 = (code *)invalidInstructionException();
        (*pcVar17)();
      }
    }
    else {
      LOCK();
      plVar6 = (longlong *)(lVar31 + 0x200);
      lVar31 = *plVar6;
      *plVar6 = *plVar6 + 1;
      UNLOCK();
      if (*plVar6 == 0 || SCARRY8(lVar31,1) != *plVar6 < 0) {
        pcVar17 = (code *)swi(0x29);
        (*pcVar17)(7);
                    /* WARNING: Does not return */
        pcVar17 = (code *)invalidInstructionException();
        (*pcVar17)();
      }
    }
    uVar4 = *(undefined4 *)(&stack0x00001150 + lVar25);
    plVar6 = *(longlong **)(&stack0x00001138 + lVar25);
    uVar7 = *(undefined8 *)(&stack0x00001148 + lVar25);
    LOCK();
    lVar31 = *plVar6;
    *plVar6 = *plVar6 + 1;
    UNLOCK();
    if (*plVar6 != 0 && SCARRY8(lVar31,1) == *plVar6 < 0) {
      plVar8 = *(longlong **)(&stack0x00001140 + lVar25);
      *plVar8 = *plVar8 + 1;
      if (*plVar8 != 0) {
        plVar9 = *(longlong **)(&stack0x00001158 + lVar25);
        LOCK();
        lVar31 = *plVar9;
        *plVar9 = *plVar9 + 1;
        UNLOCK();
        if (*plVar9 != 0 && SCARRY8(lVar31,1) == *plVar9 < 0) {
          plVar10 = *(longlong **)(&stack0x00001160 + lVar25);
          LOCK();
          lVar31 = *plVar10;
          *plVar10 = *plVar10 + 1;
          UNLOCK();
          if (*plVar10 != 0 && SCARRY8(lVar31,1) == *plVar10 < 0) {
            plVar11 = *(longlong **)(&stack0x00001168 + lVar25);
            LOCK();
            lVar31 = *plVar11;
            *plVar11 = *plVar11 + 1;
            UNLOCK();
            if (*plVar11 != 0 && SCARRY8(lVar31,1) == *plVar11 < 0) {
              plVar12 = *(longlong **)(&stack0x00001170 + lVar25);
              LOCK();
              lVar31 = *plVar12;
              *plVar12 = *plVar12 + 1;
              UNLOCK();
              if (*plVar12 != 0 && SCARRY8(lVar31,1) == *plVar12 < 0) {
                plVar13 = *(longlong **)(&stack0x00001178 + lVar25);
                LOCK();
                lVar31 = *plVar13;
                *plVar13 = *plVar13 + 1;
                UNLOCK();
                if (*plVar13 != 0 && SCARRY8(lVar31,1) == *plVar13 < 0) {
                  *(longlong **)(&stack0x00001240 + lVar25) = plVar10;
                  plVar10 = *(longlong **)(&stack0x00001180 + lVar25);
                  LOCK();
                  lVar31 = *plVar10;
                  *plVar10 = *plVar10 + 1;
                  UNLOCK();
                  if (*plVar10 != 0 && SCARRY8(lVar31,1) == *plVar10 < 0) {
                    *(longlong **)(&stack0x00001238 + lVar25) = plVar9;
                    plVar9 = *(longlong **)(&stack0x00001188 + lVar25);
                    LOCK();
                    lVar31 = *plVar9;
                    *plVar9 = *plVar9 + 1;
                    UNLOCK();
                    if (*plVar9 != 0 && SCARRY8(lVar31,1) == *plVar9 < 0) {
                      (&stack0x00001228)[lVar25] = (&stack0x00001190)[lVar25];
                      plVar14 = *(longlong **)(&stack0x00001198 + lVar25);
                      LOCK();
                      lVar31 = *plVar14;
                      *plVar14 = *plVar14 + 1;
                      UNLOCK();
                      if (*plVar14 != 0 && SCARRY8(lVar31,1) == *plVar14 < 0) {
                        plVar15 = *(longlong **)(&stack0x000011a0 + lVar25);
                        LOCK();
                        lVar31 = *plVar15;
                        *plVar15 = *plVar15 + 1;
                        UNLOCK();
                        if (*plVar15 != 0 && SCARRY8(lVar31,1) == *plVar15 < 0) {
                          *(longlong *)(&stack0x00000d50 + lVar25) = lVar26;
                          *(undefined8 *)(&stack0x00000d58 + lVar25) = uVar28;
                          *(undefined8 *)(&stack0x00000d60 + lVar25) = uVar32;
                          *(longlong **)(&stack0x00000d68 + lVar25) = plVar5;
                          *(undefined8 *)(&stack0x00000d70 + lVar25) = uVar30;
                          *(longlong **)(&stack0x00000d78 + lVar25) = plVar6;
                          *(longlong **)(&stack0x00000d80 + lVar25) = plVar8;
                          *(undefined8 *)(&stack0x00000d88 + lVar25) = uVar7;
                          *(undefined4 *)(&stack0x00000d90 + lVar25) = uVar4;
                          *(undefined8 *)(&stack0x00000d98 + lVar25) =
                               *(undefined8 *)(&stack0x00001238 + lVar25);
                          *(undefined8 *)(&stack0x00000da0 + lVar25) =
                               *(undefined8 *)(&stack0x00001240 + lVar25);
                          *(longlong **)(&stack0x00000da8 + lVar25) = plVar11;
                          *(longlong **)(&stack0x00000db0 + lVar25) = plVar12;
                          *(longlong **)(&stack0x00000db8 + lVar25) = plVar13;
                          *(longlong **)(&stack0x00000dc0 + lVar25) = plVar10;
                          *(longlong **)(&stack0x00000dc8 + lVar25) = plVar9;
                          (&stack0x00000dd0)[lVar25] = (&stack0x00001228)[lVar25];
                          *(longlong **)(&stack0x00000dd8 + lVar25) = plVar14;
                          *(longlong **)(&stack0x00000de0 + lVar25) = plVar15;
                          (&stack0x00001236)[lVar25] = 1;
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012271;
                          FUN_140002800(&UNK_140cda700,0x18);
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001228e;
                          FUN_140c70710(&stack0x000003c0 + lVar25,&stack0x00000d50 + lVar25,0x98);
                          (&stack0x00000458)[lVar25] = 0;
                          (&stack0x00001236)[lVar25] = 0;
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400122ab;
                          uVar30 = FUN_14034cd60(&stack0x000003c0 + lVar25,&UNK_140cda718);
                          (&stack0x00001236)[lVar25] = 0;
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400122be;
                          cVar23 = func_0x000140a8e7d0(uVar30);
                          if (cVar23 != '\0') {
                            (&stack0x00001236)[lVar25] = 0;
                            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400122d2;
                            func_0x000140a8f2d0(uVar30);
                          }
                          (&stack0x00001236)[lVar25] = 0;
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400122eb;
                          FUN_140002800(&UNK_140cda730,0x1e);
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x1400122fd;
                          FUN_140002800(&UNK_140cb8fb8,0x24);
                          (&stack0x000006e0)[lVar25] = 0;
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012318;
                          uVar30 = FUN_140359be0(&stack0x000003c0 + lVar25,&UNK_140cda840);
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012324;
                          cVar23 = func_0x000140a8e7d0(uVar30);
                          if (cVar23 != '\0') {
                            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012331;
                            func_0x000140a8f2d0(uVar30);
                          }
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012343;
                          FUN_140002800(&UNK_140cb8fdc,0x2c);
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012350;
                          FUN_1400ebc70(&stack0x00001110 + lVar25);
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012362;
                          FUN_140002800(&UNK_140cb9008,0x32);
                          if (*(longlong *)(&stack0x00001218 + lVar25) != 0) {
                            *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x140012381;
                            func_0x000140001090(*(undefined8 *)(&stack0x000011d8 + lVar25),
                                                *(longlong *)(&stack0x00001218 + lVar25),1);
                          }
                          puVar27 = (undefined8 *)0x0;
LAB_140012383:
                          *(undefined8 *)((longlong)&uStack_48 + lVar25) = 0x14001238f;
                          FUN_14004bb40(&stack0x00001110 + lVar25);
                          return puVar27;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
LAB_1400129a4:
                    /* WARNING: Does not return */
  pcVar17 = (code *)invalidInstructionException();
  (*pcVar17)();
}


