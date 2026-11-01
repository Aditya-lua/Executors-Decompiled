
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00144fc8(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined2 *puVar6;
  undefined4 *puVar7;
  undefined8 *in_x9;
  uint in_w10;
  ulong *unaff_x19;
  long unaff_x22;
  undefined8 uStack0000000000000020;
  uint uStack0000000000000028;
  char cStack000000000000002c;
  char cStack000000000000002d;
  char cStack000000000000002e;
  char cStack000000000000002f;
  char cStack0000000000000030;
  char cStack0000000000000031;
  char cStack0000000000000032;
  char cStack0000000000000033;
  char cStack0000000000000034;
  char cStack0000000000000035;
  undefined1 uStack0000000000000036;
  char cStack0000000000000037;
  undefined4 uStack0000000000000038;
  
  uVar3 = _cStack0000000000000030;
  uStack0000000000000028 = in_w10 & 0xffff | 0x275c0000;
  cStack000000000000002c = 0;
  cStack0000000000000037 = '\f';
  uStack0000000000000038 = 4;
  if (param_1 < in_x9) {
    param_1[2] = CONCAT17(0xc,(int7)uVar3);
    param_1[1] = CONCAT26(_cStack000000000000002e,
                          CONCAT15(cStack000000000000002d,(uint5)uStack0000000000000028));
    *param_1 = uStack0000000000000020;
    uStack0000000000000028 = 0;
    cStack000000000000002c = 0;
    cStack000000000000002d = 0;
    _cStack000000000000002e = 0;
    _cStack0000000000000030 = 0;
    uStack0000000000000036 = 0;
    cStack0000000000000037 = '\0';
    uStack0000000000000020 = (char *)0x0;
    *(undefined4 *)(param_1 + 3) = 4;
    puRam0000000000a393e8 = param_1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  uStack0000000000000020 = (char *)__Znwm(0x40);
  uVar5 = s________0_9_______0_9_________0_9_008d9786._24_8_;
  uVar4 = s________0_9_______0_9_________0_9_008d9786._16_8_;
  uVar3 = s________0_9_______0_9_________0_9_008d9786._0_8_;
  *(undefined8 *)(uStack0000000000000020 + 8) = s________0_9_______0_9_________0_9_008d9786._8_8_;
  *(undefined8 *)uStack0000000000000020 = uVar3;
  *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar5;
  *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar4;
  uVar3 = s________0_9_______0_9_________0_9_008d9786._32_8_;
  *(ulong *)(uStack0000000000000020 + 0x28) =
       CONCAT62(s________0_9_______0_9_________0_9_008d9786._42_6_,
                s________0_9_______0_9_________0_9_008d9786._40_2_);
  *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar3;
  uVar3 = CONCAT26(s________0_9_______0_9_________0_9_008d9786._48_2_,
                   s________0_9_______0_9_________0_9_008d9786._42_6_);
  *(undefined8 *)(uStack0000000000000020 + 0x32) =
       s________0_9_______0_9_________0_9_008d9786._50_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x2a) = uVar3;
  uStack0000000000000020[0x3a] = '\0';
  uVar3 = _UNK_00813400;
  _cStack0000000000000030 = (undefined6)_UNK_00813408;
  uStack0000000000000036 = (undefined1)((ulong)_UNK_00813408 >> 0x30);
  cStack0000000000000037 = (char)((ulong)_UNK_00813408 >> 0x38);
  uStack0000000000000028 = (uint)_UNK_00813400;
  cStack000000000000002c = (char)((ulong)_UNK_00813400 >> 0x20);
  cStack000000000000002d = (char)((ulong)_UNK_00813400 >> 0x28);
  _cStack000000000000002e = (undefined2)((ulong)_UNK_00813400 >> 0x30);
  uStack0000000000000038 = 2;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813408;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    uStack0000000000000028 = 0;
    cStack000000000000002c = 0;
    cStack000000000000002d = 0;
    _cStack000000000000002e = 0;
    _cStack0000000000000030 = 0;
    uStack0000000000000036 = 0;
    cStack0000000000000037 = '\0';
    uStack0000000000000020 = (char *)0x0;
    *(undefined4 *)(puVar1 + 3) = 2;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  uStack0000000000000020 = (char *)__Znwm(0x20);
  uVar3 = s_______0_9___Uu___lL___lL___008d97c1._0_8_;
  *(ulong *)(uStack0000000000000020 + 8) =
       CONCAT62(s_______0_9___Uu___lL___lL___008d97c1._10_6_,
                s_______0_9___Uu___lL___lL___008d97c1._8_2_);
  *(undefined8 *)uStack0000000000000020 = uVar3;
  uVar3 = CONCAT26(s_______0_9___Uu___lL___lL___008d97c1._16_2_,
                   s_______0_9___Uu___lL___lL___008d97c1._10_6_);
  *(undefined8 *)(uStack0000000000000020 + 0x12) = s_______0_9___Uu___lL___lL___008d97c1._18_8_;
  *(undefined8 *)(uStack0000000000000020 + 10) = uVar3;
  uStack0000000000000020[0x1a] = '\0';
  uVar3 = _UNK_007fc140;
  _cStack0000000000000030 = (undefined6)_UNK_007fc148;
  uStack0000000000000036 = (undefined1)((ulong)_UNK_007fc148 >> 0x30);
  cStack0000000000000037 = (char)((ulong)_UNK_007fc148 >> 0x38);
  uStack0000000000000028 = (uint)_UNK_007fc140;
  cStack000000000000002c = (char)((ulong)_UNK_007fc140 >> 0x20);
  cStack000000000000002d = (char)((ulong)_UNK_007fc140 >> 0x28);
  _cStack000000000000002e = (undefined2)((ulong)_UNK_007fc140 >> 0x30);
  uStack0000000000000038 = 2;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_007fc148;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 2;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  uStack0000000000000020 = (char *)0x5b2b5d372d305b30;
  uStack0000000000000028 = s_0_0_7___Uu___lL___lL___008d97dc._8_4_;
  cStack000000000000002c = s_0_0_7___Uu___lL___lL___008d97dc[0xc];
  cStack000000000000002d = s_0_0_7___Uu___lL___lL___008d97dc[0xd];
  cStack000000000000002e = s_0_0_7___Uu___lL___lL___008d97dc[0xe];
  cStack000000000000002f = s_0_0_7___Uu___lL___lL___008d97dc[0xf];
  cStack0000000000000030 = s_0_0_7___Uu___lL___lL___008d97dc[0x10];
  cStack0000000000000031 = s_0_0_7___Uu___lL___lL___008d97dc[0x11];
  cStack0000000000000032 = s_0_0_7___Uu___lL___lL___008d97dc[0x12];
  cStack0000000000000033 = s_0_0_7___Uu___lL___lL___008d97dc[0x13];
  cStack0000000000000034 = s_0_0_7___Uu___lL___lL___008d97dc[0x14];
  cStack0000000000000035 = s_0_0_7___Uu___lL___lL___008d97dc[0x15];
  uStack0000000000000036 = 0;
  cStack0000000000000037 = '\x16';
  uStack0000000000000038 = 2;
  if (puVar1 < (undefined8 *)unaff_x19[1]) {
    uVar3 = CONCAT26(s_0_0_7___Uu___lL___lL___008d97dc._14_2_,
                     s_0_0_7___Uu___lL___lL___008d97dc._8_6_);
    puVar1[2] = CONCAT17(0x16,(uint7)(uint6)s_0_0_7___Uu___lL___lL___008d97dc._16_6_);
    puVar1[1] = uVar3;
    *puVar1 = 0x5b2b5d372d305b30;
    uStack0000000000000028 = 0;
    cStack000000000000002c = '\0';
    cStack000000000000002d = '\0';
    cStack000000000000002e = '\0';
    cStack000000000000002f = '\0';
    cStack0000000000000030 = '\0';
    cStack0000000000000031 = '\0';
    cStack0000000000000032 = '\0';
    cStack0000000000000033 = '\0';
    cStack0000000000000034 = '\0';
    cStack0000000000000035 = '\0';
    uStack0000000000000036 = 0;
    cStack0000000000000037 = '\0';
    uStack0000000000000020 = (char *)0x0;
    *(undefined4 *)(puVar1 + 3) = 2;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  uStack0000000000000020 = (char *)__Znwm(0x28);
  uVar5 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._24_8_;
  uVar4 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._16_8_;
  uVar3 = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._0_8_;
  *(undefined8 *)(uStack0000000000000020 + 8) = s_0_xX__0_9a_fA_F___uU___lL___lL___008d97f3._8_8_;
  *(undefined8 *)uStack0000000000000020 = uVar3;
  *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar5;
  *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar4;
  uStack0000000000000020[0x20] = '\0';
  uVar3 = _UNK_00813410;
  _cStack0000000000000030 = (undefined6)_UNK_00813418;
  uStack0000000000000036 = (undefined1)((ulong)_UNK_00813418 >> 0x30);
  cStack0000000000000037 = (char)((ulong)_UNK_00813418 >> 0x38);
  uStack0000000000000028 = (uint)_UNK_00813410;
  cStack000000000000002c = (char)((ulong)_UNK_00813410 >> 0x20);
  cStack000000000000002d = (char)((ulong)_UNK_00813410 >> 0x28);
  _cStack000000000000002e = (undefined2)((ulong)_UNK_00813410 >> 0x30);
  uStack0000000000000038 = 2;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813418;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 2;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  uStack0000000000000020 = (char *)0x5f5a2d417a2d615b;
  uStack0000000000000028 = s__a_zA_Z___a_zA_Z0_9____008d9814._8_4_;
  cStack000000000000002c = s__a_zA_Z___a_zA_Z0_9____008d9814[0xc];
  cStack000000000000002d = s__a_zA_Z___a_zA_Z0_9____008d9814[0xd];
  cStack000000000000002e = s__a_zA_Z___a_zA_Z0_9____008d9814[0xe];
  cStack000000000000002f = s__a_zA_Z___a_zA_Z0_9____008d9814[0xf];
  cStack0000000000000030 = s__a_zA_Z___a_zA_Z0_9____008d9814[0x10];
  cStack0000000000000031 = s__a_zA_Z___a_zA_Z0_9____008d9814[0x11];
  cStack0000000000000032 = s__a_zA_Z___a_zA_Z0_9____008d9814[0x12];
  cStack0000000000000033 = s__a_zA_Z___a_zA_Z0_9____008d9814[0x13];
  cStack0000000000000034 = s__a_zA_Z___a_zA_Z0_9____008d9814[0x14];
  cStack0000000000000035 = s__a_zA_Z___a_zA_Z0_9____008d9814[0x15];
  uStack0000000000000036 = 0;
  cStack0000000000000037 = '\x16';
  uStack0000000000000038 = 7;
  if (puVar1 < (undefined8 *)unaff_x19[1]) {
    uVar3 = CONCAT26(s__a_zA_Z___a_zA_Z0_9____008d9814._14_2_,
                     s__a_zA_Z___a_zA_Z0_9____008d9814._8_6_);
    puVar1[2] = CONCAT17(0x16,(uint7)(uint6)s__a_zA_Z___a_zA_Z0_9____008d9814._16_6_);
    puVar1[1] = uVar3;
    *puVar1 = 0x5f5a2d417a2d615b;
    uStack0000000000000028 = 0;
    cStack000000000000002c = '\0';
    cStack000000000000002d = '\0';
    cStack000000000000002e = '\0';
    cStack000000000000002f = '\0';
    cStack0000000000000030 = '\0';
    cStack0000000000000031 = '\0';
    cStack0000000000000032 = '\0';
    cStack0000000000000033 = '\0';
    cStack0000000000000034 = '\0';
    cStack0000000000000035 = '\0';
    uStack0000000000000036 = 0;
    cStack0000000000000037 = '\0';
    uStack0000000000000020 = (char *)0x0;
    *(undefined4 *)(puVar1 + 3) = 7;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  uStack0000000000000020 = (char *)__Znwm(0x38);
  uVar5 = s__________________________________008d982b._24_8_;
  uVar4 = s__________________________________008d982b._16_8_;
  uVar3 = s__________________________________008d982b._0_8_;
  *(undefined8 *)(uStack0000000000000020 + 8) = s__________________________________008d982b._8_8_;
  *(undefined8 *)uStack0000000000000020 = uVar3;
  *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar5;
  *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar4;
  uVar3 = s__________________________________008d982b._32_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x28) =
       s__________________________________008d982b._40_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar3;
  uStack0000000000000020[0x30] = '\0';
  uVar3 = _UNK_00813420;
  _cStack0000000000000030 = (undefined6)_UNK_00813428;
  uStack0000000000000036 = (undefined1)((ulong)_UNK_00813428 >> 0x30);
  cStack0000000000000037 = (char)((ulong)_UNK_00813428 >> 0x38);
  uStack0000000000000028 = (uint)_UNK_00813420;
  cStack000000000000002c = (char)((ulong)_UNK_00813420 >> 0x20);
  cStack000000000000002d = (char)((ulong)_UNK_00813420 >> 0x28);
  _cStack000000000000002e = (undefined2)((ulong)_UNK_00813420 >> 0x30);
  uStack0000000000000038 = 5;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813428;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 5;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  if (cRam0000000000a3939f < '\0') {
    uRam0000000000a39390 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a3938b,CONCAT12(uRam0000000000a3938a,uRam0000000000a39388));
    *puVar6 = 0x2a2f;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a3939f = '\x02';
    uRam0000000000a39388 = 0x2a2f;
    uRam0000000000a3938a = 0;
  }
  if (cRam0000000000a393b7 < '\0') {
    uRam0000000000a393a8 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a393a3,CONCAT12(uRam0000000000a393a2,uRam0000000000a393a0));
    *puVar6 = 0x2f2a;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a393b7 = '\x02';
    uRam0000000000a393a0 = 0x2f2a;
    uRam0000000000a393a2 = 0;
  }
  if (cRam0000000000a393cf < '\0') {
    uRam0000000000a393c0 = 2;
    puVar6 = puRam0000000000a393b8;
  }
  else {
    puVar6 = (undefined2 *)0xa393b8;
    cRam0000000000a393cf = '\x02';
  }
  *puVar6 = 0x2f2f;
  *(undefined1 *)(puVar6 + 1) = 0;
  uRam0000000000a393f8 = 1;
  uRam0000000000a393d1 = 1;
  if (cRam0000000000a3930f < '\0') {
    uRam0000000000a39300 = 4;
    puVar7 = puRam0000000000a392f8;
  }
  else {
    cRam0000000000a3930f = '\x04';
    puVar7 = (undefined4 *)0xa392f8;
  }
  *puVar7 = 0x4c534c47;
  *(undefined1 *)(puVar7 + 1) = 0;
  *(undefined1 *)(unaff_x22 + 0xaa) = 1;
  return 0xa392f8;
}

