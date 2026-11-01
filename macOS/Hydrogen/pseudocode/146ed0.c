
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00146ed0(void)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  code *pcVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined4 *puVar8;
  undefined2 *puVar9;
  undefined8 uVar10;
  long unaff_x24;
  ulong unaff_x25;
  long lVar11;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined2 uStack0000000000000028;
  uint uStack000000000000002a;
  char cStack000000000000002e;
  char cStack000000000000002f;
  undefined2 uStack0000000000000030;
  undefined4 uStack0000000000000032;
  undefined1 uStack0000000000000036;
  byte bStack0000000000000037;
  undefined4 uStack0000000000000038;
  undefined4 uStack000000000000003c;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined4 uStack0000000000000050;
  undefined3 uStack0000000000000054;
  char cStack0000000000000057;
  undefined1 uStack0000000000000058;
  undefined2 uStack0000000000000059;
  undefined4 uStack000000000000005b;
  
  do {
    uVar10 = *(undefined8 *)(&UNK_009bd1c0 + unaff_x24);
    uVar6 = _strlen(uVar10);
    if (unaff_x25 < uVar6) {
      func_0x0001748c(&uStack0000000000000020);
      goto LAB_001476ac;
    }
    if (uVar6 < 0x17) {
      bStack0000000000000037 = (byte)uVar6;
      puVar7 = &uStack0000000000000020;
      if (uVar6 != 0) goto LAB_00146f50;
    }
    else {
      uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar1 = uVar6 | 7;
      }
      lVar11 = uVar1 + 1;
      puVar7 = (undefined8 *)__Znwm(lVar11);
      bStack0000000000000037 = (byte)((ulong)lVar11 >> 0x38) | 0x80;
      uStack0000000000000028 = (undefined2)uVar6;
      uStack000000000000002a = (uint)(uVar6 >> 0x10);
      _cStack000000000000002e = (undefined2)(uVar6 >> 0x30);
      uStack0000000000000030 = (undefined2)lVar11;
      uStack0000000000000032 = (undefined4)((ulong)lVar11 >> 0x10);
      uStack0000000000000036 = (undefined1)((ulong)lVar11 >> 0x30);
      uStack0000000000000020 = (char *)puVar7;
LAB_00146f50:
      _memmove(puVar7,uVar10,uVar6);
    }
    *(undefined1 *)((long)puVar7 + uVar6) = 0;
    func_0x0014b190(0xa39730,&uStack0000000000000020,&uStack0000000000000020);
    if ((char)bStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
    unaff_x24 = unaff_x24 + 8;
  } while (unaff_x24 != 0xb8);
  lVar11 = 0;
  do {
    uStack0000000000000059 = 0;
    uStack000000000000005b = 0;
    uStack0000000000000058 = 0x6e;
    uVar10 = *(undefined8 *)(&UNK_009bd278 + lVar11);
    uVar6 = _strlen(uVar10);
    if (unaff_x25 < uVar6) {
LAB_001476ac:
      func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x1476b8);
      (*pcVar5)();
    }
    if (uVar6 < 0x17) {
      _uStack0000000000000018 = CONCAT17((char)uVar6,uStack0000000000000018);
      puVar7 = &uStack0000000000000008;
      if (uVar6 != 0) goto LAB_00147044;
    }
    else {
      uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
      if ((uVar6 | 7) != 0x17) {
        uVar1 = uVar6 | 7;
      }
      puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000018 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000008 = puVar7;
      in_stack_00000010 = uVar6;
LAB_00147044:
      _memmove(puVar7,uVar10,uVar6);
    }
    *(undefined1 *)((long)puVar7 + uVar6) = 0;
    uStack0000000000000028 = (undefined2)in_stack_00000010;
    uStack000000000000002a = (uint)(in_stack_00000010 >> 0x10);
    _cStack000000000000002e = (undefined2)(in_stack_00000010 >> 0x30);
    uStack0000000000000020 = (char *)uStack0000000000000008;
    uStack0000000000000030 = (undefined2)_uStack0000000000000018;
    uStack0000000000000032 = (undefined4)(_uStack0000000000000018 >> 0x10);
    uStack0000000000000036 = (undefined1)(_uStack0000000000000018 >> 0x30);
    bStack0000000000000037 = (byte)(_uStack0000000000000018 >> 0x38);
    _uStack0000000000000038 = 0;
    in_stack_00000040 = 0x6e692d746c697542;
    in_stack_00000048 = 0x6f6974636e756620;
    uStack0000000000000050 =
         CONCAT13((char)uStack000000000000005b,
                  CONCAT21(uStack0000000000000059,uStack0000000000000058));
    uStack0000000000000054 = (undefined3)((uint)uStack000000000000005b >> 8);
    cStack0000000000000057 = '\x11';
    func_0x0014b5b0(0xa39758,&uStack0000000000000020,&uStack0000000000000020);
    if (cStack0000000000000057 < '\0') {
      __ZdlPv(in_stack_00000040);
    }
    uVar10 = s_L__________________008d9773._8_8_;
    if ((char)bStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
      uVar10 = s_L__________________008d9773._8_8_;
    }
    lVar11 = lVar11 + 8;
    s_L__________________008d9773._8_8_ = uVar10;
    if (lVar11 == 0x590) {
      uStack0000000000000030 = 0x225c;
      uStack0000000000000020 = (char *)0x2e5c5c28225c3f4c;
      uStack0000000000000028 = (undefined2)uVar10;
      uStack000000000000002a = SUB84(uVar10,2);
      _cStack000000000000002e = SUB82(uVar10,6);
      uStack0000000000000032 = 0;
      uStack0000000000000036 = 0;
      bStack0000000000000037 = '\x12';
      uStack000000000000003c = (undefined4)((ulong)_uStack0000000000000038 >> 0x20);
      uStack0000000000000038 = 3;
      if (puRam0000000000a39808 < puRam0000000000a39810) {
        puRam0000000000a39808[2] = 0x120000000000225c;
        puRam0000000000a39808[1] = uVar10;
        *puRam0000000000a39808 = 0x2e5c5c28225c3f4c;
        uStack000000000000002a = 0;
        _cStack000000000000002e = 0;
        uStack0000000000000030 = 0;
        uStack0000000000000032 = 0;
        uStack0000000000000036 = 0;
        *(undefined4 *)(puRam0000000000a39808 + 3) = 3;
        puRam0000000000a39808 = puRam0000000000a39808 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      uStack0000000000000020 = (char *)0x2a5d275c5e5b275c;
      uStack0000000000000028 = 0x275c;
      uStack000000000000002a = uStack000000000000002a & 0xffffff00;
      bStack0000000000000037 = '\n';
      uStack0000000000000038 = 3;
      if (puRam0000000000a39808 < puRam0000000000a39810) {
        puRam0000000000a39808[2] =
             CONCAT17(10,CONCAT16(uStack0000000000000036,
                                  CONCAT42(uStack0000000000000032,uStack0000000000000030)));
        puRam0000000000a39808[1] =
             CONCAT26(_cStack000000000000002e,CONCAT42(uStack000000000000002a,0x275c));
        *puRam0000000000a39808 = 0x2a5d275c5e5b275c;
        uStack0000000000000028 = 0;
        uStack000000000000002a = 0;
        _cStack000000000000002e = 0;
        uStack0000000000000030 = 0;
        uStack0000000000000032 = 0;
        uStack0000000000000036 = 0;
        bStack0000000000000037 = '\0';
        uStack0000000000000020 = (char *)0x0;
        *(undefined4 *)(puRam0000000000a39808 + 3) = 3;
        puRam0000000000a39808 = puRam0000000000a39808 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      puVar4 = puRam0000000000a39810;
      puVar7 = puRam0000000000a39808;
      uStack0000000000000020 = (char *)__Znwm(0x28);
      uVar3 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._24_8_;
      uVar2 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._16_8_;
      uVar10 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._0_8_;
      *(undefined8 *)(uStack0000000000000020 + 8) =
           s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._8_8_;
      *(undefined8 *)uStack0000000000000020 = uVar10;
      *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar3;
      *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar2;
      uStack0000000000000020[0x20] = '\0';
      uVar10 = _UNK_00813410;
      uStack0000000000000030 = (undefined2)_UNK_00813418;
      uStack0000000000000032 = (undefined4)((ulong)_UNK_00813418 >> 0x10);
      uStack0000000000000036 = (undefined1)((ulong)_UNK_00813418 >> 0x30);
      bStack0000000000000037 = (byte)((ulong)_UNK_00813418 >> 0x38);
      uStack0000000000000028 = (undefined2)_UNK_00813410;
      uStack000000000000002a = (uint)((ulong)_UNK_00813410 >> 0x10);
      _cStack000000000000002e = (undefined2)((ulong)_UNK_00813410 >> 0x30);
      uStack0000000000000038 = 2;
      if (puVar7 < puVar4) {
        puVar7[2] = _UNK_00813418;
        puVar7[1] = uVar10;
        *puVar7 = uStack0000000000000020;
        uStack0000000000000028 = 0;
        uStack000000000000002a = 0;
        _cStack000000000000002e = 0;
        uStack0000000000000030 = 0;
        uStack0000000000000032 = 0;
        uStack0000000000000036 = 0;
        bStack0000000000000037 = '\0';
        uStack0000000000000020 = (char *)0x0;
        *(undefined4 *)(puVar7 + 3) = 2;
        puRam0000000000a39808 = puVar7 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      puVar4 = puRam0000000000a39810;
      puVar7 = puRam0000000000a39808;
      uStack0000000000000020 = (char *)__Znwm(0x40);
      uVar3 = s________0_9_______0_9_________0_9_008d9786._24_8_;
      uVar2 = s________0_9_______0_9_________0_9_008d9786._16_8_;
      uVar10 = s________0_9_______0_9_________0_9_008d9786._0_8_;
      *(undefined8 *)(uStack0000000000000020 + 8) =
           s________0_9_______0_9_________0_9_008d9786._8_8_;
      *(undefined8 *)uStack0000000000000020 = uVar10;
      *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar3;
      *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar2;
      uVar10 = s________0_9_______0_9_________0_9_008d9786._32_8_;
      *(ulong *)(uStack0000000000000020 + 0x28) =
           CONCAT62(s________0_9_______0_9_________0_9_008d9786._42_6_,
                    s________0_9_______0_9_________0_9_008d9786._40_2_);
      *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar10;
      uVar10 = CONCAT26(s________0_9_______0_9_________0_9_008d9786._48_2_,
                        s________0_9_______0_9_________0_9_008d9786._42_6_);
      *(undefined8 *)(uStack0000000000000020 + 0x32) =
           s________0_9_______0_9_________0_9_008d9786._50_8_;
      *(undefined8 *)(uStack0000000000000020 + 0x2a) = uVar10;
      uStack0000000000000020[0x3a] = '\0';
      uVar10 = _UNK_00813400;
      uStack0000000000000030 = (undefined2)_UNK_00813408;
      uStack0000000000000032 = (undefined4)((ulong)_UNK_00813408 >> 0x10);
      uStack0000000000000036 = (undefined1)((ulong)_UNK_00813408 >> 0x30);
      bStack0000000000000037 = (byte)((ulong)_UNK_00813408 >> 0x38);
      uStack0000000000000028 = (undefined2)_UNK_00813400;
      uStack000000000000002a = (uint)((ulong)_UNK_00813400 >> 0x10);
      _cStack000000000000002e = (undefined2)((ulong)_UNK_00813400 >> 0x30);
      uStack0000000000000038 = 2;
      if (puVar7 < puVar4) {
        puVar7[2] = _UNK_00813408;
        puVar7[1] = uVar10;
        *puVar7 = uStack0000000000000020;
        uStack0000000000000028 = 0;
        uStack000000000000002a = 0;
        _cStack000000000000002e = 0;
        uStack0000000000000030 = 0;
        uStack0000000000000032 = 0;
        uStack0000000000000036 = 0;
        bStack0000000000000037 = '\0';
        uStack0000000000000020 = (char *)0x0;
        *(undefined4 *)(puVar7 + 3) = 2;
        puRam0000000000a39808 = puVar7 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      puVar4 = puRam0000000000a39810;
      puVar7 = puRam0000000000a39808;
      uStack0000000000000020 = (char *)__Znwm(0x20);
      uVar10 = s_______0_9___Uu___lL___lL___008d97c1._0_8_;
      *(ulong *)(uStack0000000000000020 + 8) =
           CONCAT62(s_______0_9___Uu___lL___lL___008d97c1._10_6_,
                    s_______0_9___Uu___lL___lL___008d97c1._8_2_);
      *(undefined8 *)uStack0000000000000020 = uVar10;
      uVar10 = CONCAT26(s_______0_9___Uu___lL___lL___008d97c1._16_2_,
                        s_______0_9___Uu___lL___lL___008d97c1._10_6_);
      *(undefined8 *)(uStack0000000000000020 + 0x12) = s_______0_9___Uu___lL___lL___008d97c1._18_8_;
      *(undefined8 *)(uStack0000000000000020 + 10) = uVar10;
      uStack0000000000000020[0x1a] = '\0';
      uVar10 = _UNK_007fc140;
      uStack0000000000000030 = (undefined2)_UNK_007fc148;
      uStack0000000000000032 = (undefined4)((ulong)_UNK_007fc148 >> 0x10);
      uStack0000000000000036 = (undefined1)((ulong)_UNK_007fc148 >> 0x30);
      bStack0000000000000037 = (byte)((ulong)_UNK_007fc148 >> 0x38);
      uStack0000000000000028 = (undefined2)_UNK_007fc140;
      uStack000000000000002a = (uint)((ulong)_UNK_007fc140 >> 0x10);
      _cStack000000000000002e = (undefined2)((ulong)_UNK_007fc140 >> 0x30);
      uStack0000000000000038 = 2;
      if (puVar7 < puVar4) {
        puVar7[2] = _UNK_007fc148;
        puVar7[1] = uVar10;
        *puVar7 = uStack0000000000000020;
        *(undefined4 *)(puVar7 + 3) = 2;
        puRam0000000000a39808 = puVar7 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      uStack0000000000000020 = (char *)0x5f5a2d417a2d615b;
      uStack0000000000000028 = s__a_zA_Z___a_zA_Z0_9____008d9814._8_2_;
      uStack000000000000002a = s__a_zA_Z___a_zA_Z0_9____008d9814._10_4_;
      cStack000000000000002e = s__a_zA_Z___a_zA_Z0_9____008d9814[0xe];
      cStack000000000000002f = s__a_zA_Z___a_zA_Z0_9____008d9814[0xf];
      uStack0000000000000030 = s__a_zA_Z___a_zA_Z0_9____008d9814._16_2_;
      uStack0000000000000032 = s__a_zA_Z___a_zA_Z0_9____008d9814._18_4_;
      uStack0000000000000036 = 0;
      bStack0000000000000037 = '\x16';
      uStack0000000000000038 = 7;
      if (puRam0000000000a39808 < puRam0000000000a39810) {
        uVar10 = CONCAT26(s__a_zA_Z___a_zA_Z0_9____008d9814._14_2_,
                          s__a_zA_Z___a_zA_Z0_9____008d9814._8_6_);
        puRam0000000000a39808[2] =
             CONCAT17(0x16,(uint7)(uint6)s__a_zA_Z___a_zA_Z0_9____008d9814._16_6_);
        puRam0000000000a39808[1] = uVar10;
        *puRam0000000000a39808 = 0x5f5a2d417a2d615b;
        uStack0000000000000028 = 0;
        uStack000000000000002a = 0;
        cStack000000000000002e = '\0';
        cStack000000000000002f = '\0';
        uStack0000000000000030 = 0;
        uStack0000000000000032 = 0;
        uStack0000000000000036 = 0;
        bStack0000000000000037 = '\0';
        uStack0000000000000020 = (char *)0x0;
        *(undefined4 *)(puRam0000000000a39808 + 3) = 7;
        puRam0000000000a39808 = puRam0000000000a39808 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      puVar4 = puRam0000000000a39810;
      puVar7 = puRam0000000000a39808;
      uStack0000000000000020 = (char *)__Znwm(0x38);
      uVar3 = s__________________________________008d982b._24_8_;
      uVar2 = s__________________________________008d982b._16_8_;
      uVar10 = s__________________________________008d982b._0_8_;
      *(undefined8 *)(uStack0000000000000020 + 8) =
           s__________________________________008d982b._8_8_;
      *(undefined8 *)uStack0000000000000020 = uVar10;
      *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar3;
      *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar2;
      uVar10 = s__________________________________008d982b._32_8_;
      *(undefined8 *)(uStack0000000000000020 + 0x28) =
           s__________________________________008d982b._40_8_;
      *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar10;
      uStack0000000000000020[0x30] = '\0';
      uVar10 = _UNK_00813420;
      uStack0000000000000030 = (undefined2)_UNK_00813428;
      uStack0000000000000032 = (undefined4)((ulong)_UNK_00813428 >> 0x10);
      uStack0000000000000036 = (undefined1)((ulong)_UNK_00813428 >> 0x30);
      bStack0000000000000037 = (byte)((ulong)_UNK_00813428 >> 0x38);
      uStack0000000000000028 = (undefined2)_UNK_00813420;
      uStack000000000000002a = (uint)((ulong)_UNK_00813420 >> 0x10);
      _cStack000000000000002e = (undefined2)((ulong)_UNK_00813420 >> 0x30);
      _uStack0000000000000038 = CONCAT44(uStack000000000000003c,5);
      if (puVar7 < puVar4) {
        puVar7[2] = _UNK_00813428;
        puVar7[1] = uVar10;
        *puVar7 = uStack0000000000000020;
        *(undefined4 *)(puVar7 + 3) = 5;
        puRam0000000000a39808 = puVar7 + 4;
      }
      else {
        puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
        if ((char)bStack0000000000000037 < '\0') {
          __ZdlPv(uStack0000000000000020);
        }
      }
      if (cRam0000000000a397bf < '\0') {
        uRam0000000000a397b0 = 4;
        puVar8 = puRam0000000000a397a8;
      }
      else {
        puVar8 = (undefined4 *)0xa397a8;
        cRam0000000000a397bf = '\x04';
      }
      *puVar8 = 0x5b5b2d2d;
      *(undefined1 *)(puVar8 + 1) = 0;
      if (cRam0000000000a397d7 < '\0') {
        uRam0000000000a397c8 = 2;
        puVar9 = (undefined2 *)
                 CONCAT53(uRam0000000000a397c3,CONCAT12(uRam0000000000a397c2,uRam0000000000a397c0));
        *puVar9 = 0x5d5d;
        *(undefined1 *)(puVar9 + 1) = 0;
      }
      else {
        cRam0000000000a397d7 = '\x02';
        uRam0000000000a397c0 = 0x5d5d;
        uRam0000000000a397c2 = 0;
      }
      if (cRam0000000000a397ef < '\0') {
        uRam0000000000a397e0 = 2;
        puVar9 = puRam0000000000a397d8;
      }
      else {
        cRam0000000000a397ef = '\x02';
        puVar9 = (undefined2 *)0xa397d8;
      }
      *puVar9 = 0x2d2d;
      *(undefined1 *)(puVar9 + 1) = 0;
      uRam0000000000a39818 = 1;
      uRam0000000000a397f1 = 0;
      if (cRam0000000000a3972f < '\0') {
        uRam0000000000a39720 = 3;
        puVar8 = puRam0000000000a39718;
      }
      else {
        cRam0000000000a3972f = '\x03';
        puVar8 = (undefined4 *)0xa39718;
      }
      *puVar8 = 0x61754c;
      uRam0000000000a390ae = 1;
      return 0xa39718;
    }
  } while( true );
}

