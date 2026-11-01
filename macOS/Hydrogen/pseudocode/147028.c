
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00147028(ulong param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  code *pcVar5;
  undefined8 *puVar6;
  undefined4 *puVar7;
  undefined2 *puVar8;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined4 *unaff_x27;
  char unaff_w28;
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
  char cStack0000000000000037;
  undefined4 uStack0000000000000038;
  undefined4 uStack000000000000003c;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  char cStack0000000000000057;
  undefined1 uStack0000000000000058;
  undefined2 uStack0000000000000059;
  undefined1 uStack000000000000005b;
  
code_r0x00147028:
  puVar6 = (undefined8 *)__Znwm(param_1);
  _uStack0000000000000018 = unaff_x23 | 0x8000000000000000;
  uStack0000000000000008 = puVar6;
  in_stack_00000010 = unaff_x20;
  do {
    _memmove(puVar6,unaff_x21,unaff_x20);
    do {
      *(undefined1 *)((long)puVar6 + unaff_x20) = 0;
      uStack0000000000000028 = (undefined2)in_stack_00000010;
      uStack000000000000002a = (uint)(in_stack_00000010 >> 0x10);
      _cStack000000000000002e = (undefined2)(in_stack_00000010 >> 0x30);
      uStack0000000000000020 = (char *)uStack0000000000000008;
      uStack0000000000000030 = (undefined2)_uStack0000000000000018;
      uStack0000000000000032 = (undefined4)(_uStack0000000000000018 >> 0x10);
      uStack0000000000000036 = (undefined1)(_uStack0000000000000018 >> 0x30);
      cStack0000000000000037 = (char)(_uStack0000000000000018 >> 0x38);
      _uStack0000000000000038 = 0;
      in_stack_00000040 = 0x6e692d746c697542;
      in_stack_00000048 = 0x6f6974636e756620;
      *unaff_x27 = CONCAT13(uStack000000000000005b,
                            CONCAT21(uStack0000000000000059,uStack0000000000000058));
      *(undefined4 *)((long)unaff_x27 + 3) = _uStack000000000000005b;
      cStack0000000000000057 = unaff_w28;
      func_0x0014b5b0();
      if (cStack0000000000000057 < '\0') {
        __ZdlPv(in_stack_00000040);
      }
      uVar1 = s_L__________________008d9773._8_8_;
      if (cStack0000000000000037 < '\0') {
        __ZdlPv(uStack0000000000000020);
        uVar1 = s_L__________________008d9773._8_8_;
      }
      s_L__________________008d9773._8_8_ = uVar1;
      if (unaff_x26 == 0x588) {
        uStack0000000000000030 = 0x225c;
        uStack0000000000000020 = (char *)0x2e5c5c28225c3f4c;
        uStack0000000000000028 = (undefined2)uVar1;
        uStack000000000000002a = SUB84(uVar1,2);
        _cStack000000000000002e = SUB82(uVar1,6);
        uStack0000000000000032 = 0;
        uStack0000000000000036 = 0;
        cStack0000000000000037 = '\x12';
        uStack000000000000003c = (undefined4)((ulong)_uStack0000000000000038 >> 0x20);
        uStack0000000000000038 = 3;
        if (puRam0000000000a39808 < puRam0000000000a39810) {
          puRam0000000000a39808[2] = 0x120000000000225c;
          puRam0000000000a39808[1] = uVar1;
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
          if (cStack0000000000000037 < '\0') {
            __ZdlPv(uStack0000000000000020);
          }
        }
        uStack0000000000000020 = (char *)0x2a5d275c5e5b275c;
        uStack0000000000000028 = 0x275c;
        uStack000000000000002a = uStack000000000000002a & 0xffffff00;
        cStack0000000000000037 = '\n';
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
          cStack0000000000000037 = '\0';
          uStack0000000000000020 = (char *)0x0;
          *(undefined4 *)(puRam0000000000a39808 + 3) = 3;
          puRam0000000000a39808 = puRam0000000000a39808 + 4;
        }
        else {
          puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
          if (cStack0000000000000037 < '\0') {
            __ZdlPv(uStack0000000000000020);
          }
        }
        puVar4 = puRam0000000000a39810;
        puVar6 = puRam0000000000a39808;
        uStack0000000000000020 = (char *)__Znwm(0x28);
        uVar3 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._24_8_;
        uVar2 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._16_8_;
        uVar1 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._0_8_;
        *(undefined8 *)(uStack0000000000000020 + 8) =
             s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._8_8_;
        *(undefined8 *)uStack0000000000000020 = uVar1;
        *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar3;
        *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar2;
        uStack0000000000000020[0x20] = '\0';
        uVar1 = _UNK_00813410;
        uStack0000000000000030 = (undefined2)_UNK_00813418;
        uStack0000000000000032 = (undefined4)((ulong)_UNK_00813418 >> 0x10);
        uStack0000000000000036 = (undefined1)((ulong)_UNK_00813418 >> 0x30);
        cStack0000000000000037 = (char)((ulong)_UNK_00813418 >> 0x38);
        uStack0000000000000028 = (undefined2)_UNK_00813410;
        uStack000000000000002a = (uint)((ulong)_UNK_00813410 >> 0x10);
        _cStack000000000000002e = (undefined2)((ulong)_UNK_00813410 >> 0x30);
        uStack0000000000000038 = 2;
        if (puVar6 < puVar4) {
          puVar6[2] = _UNK_00813418;
          puVar6[1] = uVar1;
          *puVar6 = uStack0000000000000020;
          uStack0000000000000028 = 0;
          uStack000000000000002a = 0;
          _cStack000000000000002e = 0;
          uStack0000000000000030 = 0;
          uStack0000000000000032 = 0;
          uStack0000000000000036 = 0;
          cStack0000000000000037 = '\0';
          uStack0000000000000020 = (char *)0x0;
          *(undefined4 *)(puVar6 + 3) = 2;
          puRam0000000000a39808 = puVar6 + 4;
        }
        else {
          puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
          if (cStack0000000000000037 < '\0') {
            __ZdlPv(uStack0000000000000020);
          }
        }
        puVar4 = puRam0000000000a39810;
        puVar6 = puRam0000000000a39808;
        uStack0000000000000020 = (char *)__Znwm(0x40);
        uVar3 = s________0_9_______0_9_________0_9_008d9786._24_8_;
        uVar2 = s________0_9_______0_9_________0_9_008d9786._16_8_;
        uVar1 = s________0_9_______0_9_________0_9_008d9786._0_8_;
        *(undefined8 *)(uStack0000000000000020 + 8) =
             s________0_9_______0_9_________0_9_008d9786._8_8_;
        *(undefined8 *)uStack0000000000000020 = uVar1;
        *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar3;
        *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar2;
        uVar1 = s________0_9_______0_9_________0_9_008d9786._32_8_;
        *(ulong *)(uStack0000000000000020 + 0x28) =
             CONCAT62(s________0_9_______0_9_________0_9_008d9786._42_6_,
                      s________0_9_______0_9_________0_9_008d9786._40_2_);
        *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar1;
        uVar1 = CONCAT26(s________0_9_______0_9_________0_9_008d9786._48_2_,
                         s________0_9_______0_9_________0_9_008d9786._42_6_);
        *(undefined8 *)(uStack0000000000000020 + 0x32) =
             s________0_9_______0_9_________0_9_008d9786._50_8_;
        *(undefined8 *)(uStack0000000000000020 + 0x2a) = uVar1;
        uStack0000000000000020[0x3a] = '\0';
        uVar1 = _UNK_00813400;
        uStack0000000000000030 = (undefined2)_UNK_00813408;
        uStack0000000000000032 = (undefined4)((ulong)_UNK_00813408 >> 0x10);
        uStack0000000000000036 = (undefined1)((ulong)_UNK_00813408 >> 0x30);
        cStack0000000000000037 = (char)((ulong)_UNK_00813408 >> 0x38);
        uStack0000000000000028 = (undefined2)_UNK_00813400;
        uStack000000000000002a = (uint)((ulong)_UNK_00813400 >> 0x10);
        _cStack000000000000002e = (undefined2)((ulong)_UNK_00813400 >> 0x30);
        uStack0000000000000038 = 2;
        if (puVar6 < puVar4) {
          puVar6[2] = _UNK_00813408;
          puVar6[1] = uVar1;
          *puVar6 = uStack0000000000000020;
          uStack0000000000000028 = 0;
          uStack000000000000002a = 0;
          _cStack000000000000002e = 0;
          uStack0000000000000030 = 0;
          uStack0000000000000032 = 0;
          uStack0000000000000036 = 0;
          cStack0000000000000037 = '\0';
          uStack0000000000000020 = (char *)0x0;
          *(undefined4 *)(puVar6 + 3) = 2;
          puRam0000000000a39808 = puVar6 + 4;
        }
        else {
          puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
          if (cStack0000000000000037 < '\0') {
            __ZdlPv(uStack0000000000000020);
          }
        }
        puVar4 = puRam0000000000a39810;
        puVar6 = puRam0000000000a39808;
        uStack0000000000000020 = (char *)__Znwm(0x20);
        uVar1 = s_______0_9___Uu___lL___lL___008d97c1._0_8_;
        *(ulong *)(uStack0000000000000020 + 8) =
             CONCAT62(s_______0_9___Uu___lL___lL___008d97c1._10_6_,
                      s_______0_9___Uu___lL___lL___008d97c1._8_2_);
        *(undefined8 *)uStack0000000000000020 = uVar1;
        uVar1 = CONCAT26(s_______0_9___Uu___lL___lL___008d97c1._16_2_,
                         s_______0_9___Uu___lL___lL___008d97c1._10_6_);
        *(undefined8 *)(uStack0000000000000020 + 0x12) =
             s_______0_9___Uu___lL___lL___008d97c1._18_8_;
        *(undefined8 *)(uStack0000000000000020 + 10) = uVar1;
        uStack0000000000000020[0x1a] = '\0';
        uVar1 = _UNK_007fc140;
        uStack0000000000000030 = (undefined2)_UNK_007fc148;
        uStack0000000000000032 = (undefined4)((ulong)_UNK_007fc148 >> 0x10);
        uStack0000000000000036 = (undefined1)((ulong)_UNK_007fc148 >> 0x30);
        cStack0000000000000037 = (char)((ulong)_UNK_007fc148 >> 0x38);
        uStack0000000000000028 = (undefined2)_UNK_007fc140;
        uStack000000000000002a = (uint)((ulong)_UNK_007fc140 >> 0x10);
        _cStack000000000000002e = (undefined2)((ulong)_UNK_007fc140 >> 0x30);
        uStack0000000000000038 = 2;
        if (puVar6 < puVar4) {
          puVar6[2] = _UNK_007fc148;
          puVar6[1] = uVar1;
          *puVar6 = uStack0000000000000020;
          *(undefined4 *)(puVar6 + 3) = 2;
          puRam0000000000a39808 = puVar6 + 4;
        }
        else {
          puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
          if (cStack0000000000000037 < '\0') {
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
        cStack0000000000000037 = '\x16';
        uStack0000000000000038 = 7;
        if (puRam0000000000a39808 < puRam0000000000a39810) {
          uVar1 = CONCAT26(s__a_zA_Z___a_zA_Z0_9____008d9814._14_2_,
                           s__a_zA_Z___a_zA_Z0_9____008d9814._8_6_);
          puRam0000000000a39808[2] =
               CONCAT17(0x16,(uint7)(uint6)s__a_zA_Z___a_zA_Z0_9____008d9814._16_6_);
          puRam0000000000a39808[1] = uVar1;
          *puRam0000000000a39808 = 0x5f5a2d417a2d615b;
          uStack0000000000000028 = 0;
          uStack000000000000002a = 0;
          cStack000000000000002e = '\0';
          cStack000000000000002f = '\0';
          uStack0000000000000030 = 0;
          uStack0000000000000032 = 0;
          uStack0000000000000036 = 0;
          cStack0000000000000037 = '\0';
          uStack0000000000000020 = (char *)0x0;
          *(undefined4 *)(puRam0000000000a39808 + 3) = 7;
          puRam0000000000a39808 = puRam0000000000a39808 + 4;
        }
        else {
          puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
          if (cStack0000000000000037 < '\0') {
            __ZdlPv(uStack0000000000000020);
          }
        }
        puVar4 = puRam0000000000a39810;
        puVar6 = puRam0000000000a39808;
        uStack0000000000000020 = (char *)__Znwm(0x38);
        uVar3 = s__________________________________008d982b._24_8_;
        uVar2 = s__________________________________008d982b._16_8_;
        uVar1 = s__________________________________008d982b._0_8_;
        *(undefined8 *)(uStack0000000000000020 + 8) =
             s__________________________________008d982b._8_8_;
        *(undefined8 *)uStack0000000000000020 = uVar1;
        *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar3;
        *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar2;
        uVar1 = s__________________________________008d982b._32_8_;
        *(undefined8 *)(uStack0000000000000020 + 0x28) =
             s__________________________________008d982b._40_8_;
        *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar1;
        uStack0000000000000020[0x30] = '\0';
        uVar1 = _UNK_00813420;
        uStack0000000000000030 = (undefined2)_UNK_00813428;
        uStack0000000000000032 = (undefined4)((ulong)_UNK_00813428 >> 0x10);
        uStack0000000000000036 = (undefined1)((ulong)_UNK_00813428 >> 0x30);
        cStack0000000000000037 = (char)((ulong)_UNK_00813428 >> 0x38);
        uStack0000000000000028 = (undefined2)_UNK_00813420;
        uStack000000000000002a = (uint)((ulong)_UNK_00813420 >> 0x10);
        _cStack000000000000002e = (undefined2)((ulong)_UNK_00813420 >> 0x30);
        _uStack0000000000000038 = CONCAT44(uStack000000000000003c,5);
        if (puVar6 < puVar4) {
          puVar6[2] = _UNK_00813428;
          puVar6[1] = uVar1;
          *puVar6 = uStack0000000000000020;
          *(undefined4 *)(puVar6 + 3) = 5;
          puRam0000000000a39808 = puVar6 + 4;
        }
        else {
          puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
          if (cStack0000000000000037 < '\0') {
            __ZdlPv(uStack0000000000000020);
          }
        }
        if (cRam0000000000a397bf < '\0') {
          uRam0000000000a397b0 = 4;
          puVar7 = puRam0000000000a397a8;
        }
        else {
          puVar7 = (undefined4 *)0xa397a8;
          cRam0000000000a397bf = '\x04';
        }
        *puVar7 = 0x5b5b2d2d;
        *(undefined1 *)(puVar7 + 1) = 0;
        if (cRam0000000000a397d7 < '\0') {
          uRam0000000000a397c8 = 2;
          puVar8 = (undefined2 *)
                   CONCAT53(uRam0000000000a397c3,CONCAT12(uRam0000000000a397c2,uRam0000000000a397c0)
                           );
          *puVar8 = 0x5d5d;
          *(undefined1 *)(puVar8 + 1) = 0;
        }
        else {
          cRam0000000000a397d7 = '\x02';
          uRam0000000000a397c0 = 0x5d5d;
          uRam0000000000a397c2 = 0;
        }
        if (cRam0000000000a397ef < '\0') {
          uRam0000000000a397e0 = 2;
          puVar8 = puRam0000000000a397d8;
        }
        else {
          cRam0000000000a397ef = '\x02';
          puVar8 = (undefined2 *)0xa397d8;
        }
        *puVar8 = 0x2d2d;
        *(undefined1 *)(puVar8 + 1) = 0;
        uRam0000000000a39818 = 1;
        uRam0000000000a397f1 = 0;
        if (cRam0000000000a3972f < '\0') {
          uRam0000000000a39720 = 3;
          puVar7 = puRam0000000000a39718;
        }
        else {
          cRam0000000000a3972f = '\x03';
          puVar7 = (undefined4 *)0xa39718;
        }
        *puVar7 = 0x61754c;
        uRam0000000000a390ae = 1;
        return 0xa39718;
      }
      unaff_x26 = unaff_x26 + 8;
      uStack0000000000000059 = 0;
      _uStack000000000000005b = 0;
      uStack0000000000000058 = 0x6e;
      unaff_x21 = *(undefined8 *)(unaff_x24 + unaff_x26);
      unaff_x20 = _strlen(unaff_x21);
      if (unaff_x25 < unaff_x20) {
        func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x1476b8);
        (*pcVar5)();
      }
      if (0x16 < unaff_x20) {
        param_1 = (unaff_x20 & 0xfffffffffffffff8) + 8;
        if ((unaff_x20 | 7) != 0x17) {
          param_1 = unaff_x20 | 7;
        }
        param_1 = param_1 + 1;
        unaff_x23 = param_1;
        goto code_r0x00147028;
      }
      _uStack0000000000000018 = CONCAT17((char)unaff_x20,uStack0000000000000018);
      puVar6 = &uStack0000000000000008;
    } while (unaff_x20 == 0);
  } while( true );
}

