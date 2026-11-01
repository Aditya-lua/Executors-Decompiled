
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_001468c0(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined4 in_w8;
  undefined2 *puVar6;
  char *pcVar7;
  ulong *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000020;
  char cStack0000000000000028;
  char cStack0000000000000029;
  char cStack000000000000002a;
  char cStack000000000000002b;
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
  undefined4 in_stack_00000038;
  
  *(undefined4 *)(unaff_x20 + 0x18) = in_w8;
  puRam0000000000a39700 = (undefined8 *)(unaff_x20 + 0x20);
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
  _cStack0000000000000028 = (undefined6)_UNK_007fc140;
  _cStack000000000000002e = (undefined2)((ulong)_UNK_007fc140 >> 0x30);
  in_stack_00000038 = 2;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_007fc148;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 2;
    puRam0000000000a39700 = puVar1 + 4;
  }
  else {
    puRam0000000000a39700 = (undefined8 *)func_0x0014a284(0xa396f8,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  uStack0000000000000020 = (char *)0x5b2b5d372d305b30;
  cStack0000000000000028 = s_0_0_7___Uu___lL___lL___008d97dc[8];
  cStack0000000000000029 = s_0_0_7___Uu___lL___lL___008d97dc[9];
  cStack000000000000002a = s_0_0_7___Uu___lL___lL___008d97dc[10];
  cStack000000000000002b = s_0_0_7___Uu___lL___lL___008d97dc[0xb];
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
  in_stack_00000038 = 2;
  if (puVar1 < (undefined8 *)unaff_x19[1]) {
    uVar3 = CONCAT26(s_0_0_7___Uu___lL___lL___008d97dc._14_2_,
                     s_0_0_7___Uu___lL___lL___008d97dc._8_6_);
    puVar1[2] = CONCAT17(0x16,(uint7)(uint6)s_0_0_7___Uu___lL___lL___008d97dc._16_6_);
    puVar1[1] = uVar3;
    *puVar1 = 0x5b2b5d372d305b30;
    cStack0000000000000028 = '\0';
    cStack0000000000000029 = '\0';
    cStack000000000000002a = '\0';
    cStack000000000000002b = '\0';
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
    puRam0000000000a39700 = puVar1 + 4;
  }
  else {
    puRam0000000000a39700 = (undefined8 *)func_0x0014a284(0xa396f8,&uStack0000000000000020);
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
  _cStack0000000000000028 = (undefined6)_UNK_00813410;
  _cStack000000000000002e = (undefined2)((ulong)_UNK_00813410 >> 0x30);
  in_stack_00000038 = 2;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813418;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 2;
    puRam0000000000a39700 = puVar1 + 4;
  }
  else {
    puRam0000000000a39700 = (undefined8 *)func_0x0014a284(0xa396f8,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  puVar1 = (undefined8 *)*unaff_x19;
  uStack0000000000000020 = (char *)0x5f5a2d417a2d615b;
  cStack0000000000000028 = s__a_zA_Z___a_zA_Z0_9____008d9814[8];
  cStack0000000000000029 = s__a_zA_Z___a_zA_Z0_9____008d9814[9];
  cStack000000000000002a = s__a_zA_Z___a_zA_Z0_9____008d9814[10];
  cStack000000000000002b = s__a_zA_Z___a_zA_Z0_9____008d9814[0xb];
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
  in_stack_00000038 = 7;
  if (puVar1 < (undefined8 *)unaff_x19[1]) {
    uVar3 = CONCAT26(s__a_zA_Z___a_zA_Z0_9____008d9814._14_2_,
                     s__a_zA_Z___a_zA_Z0_9____008d9814._8_6_);
    puVar1[2] = CONCAT17(0x16,(uint7)(uint6)s__a_zA_Z___a_zA_Z0_9____008d9814._16_6_);
    puVar1[1] = uVar3;
    *puVar1 = 0x5f5a2d417a2d615b;
    cStack0000000000000028 = '\0';
    cStack0000000000000029 = '\0';
    cStack000000000000002a = '\0';
    cStack000000000000002b = '\0';
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
    puRam0000000000a39700 = puVar1 + 4;
  }
  else {
    puRam0000000000a39700 = (undefined8 *)func_0x0014a284(0xa396f8,&uStack0000000000000020);
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
  _cStack0000000000000028 = (undefined6)_UNK_00813420;
  _cStack000000000000002e = (undefined2)((ulong)_UNK_00813420 >> 0x30);
  in_stack_00000038 = 5;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813428;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 5;
    puRam0000000000a39700 = puVar1 + 4;
  }
  else {
    puRam0000000000a39700 = (undefined8 *)func_0x0014a284(0xa396f8,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  if (cRam0000000000a396b7 < '\0') {
    uRam0000000000a396a8 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a396a3,CONCAT12(uRam0000000000a396a2,uRam0000000000a396a0));
    *puVar6 = 0x2a2f;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a396b7 = '\x02';
    uRam0000000000a396a0 = 0x2a2f;
    uRam0000000000a396a2 = 0;
  }
  if (cRam0000000000a396cf < '\0') {
    uRam0000000000a396c0 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a396bb,CONCAT12(uRam0000000000a396ba,uRam0000000000a396b8));
    *puVar6 = 0x2f2a;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a396cf = '\x02';
    uRam0000000000a396b8 = 0x2f2a;
    uRam0000000000a396ba = 0;
  }
  if (cRam0000000000a396e7 < '\0') {
    uRam0000000000a396d8 = 2;
    puVar6 = puRam0000000000a396d0;
  }
  else {
    puVar6 = (undefined2 *)0xa396d0;
    cRam0000000000a396e7 = '\x02';
  }
  *puVar6 = 0x2f2f;
  *(undefined1 *)(puVar6 + 1) = 0;
  uRam0000000000a39710 = 1;
  uRam0000000000a396e9 = 1;
  if (cRam0000000000a39627 < '\0') {
    uRam0000000000a39618 = 0xb;
    pcVar7 = pcRam0000000000a39610;
  }
  else {
    cRam0000000000a39627 = '\v';
    pcVar7 = (char *)0xa39610;
  }
  pcVar7[7] = 'r';
  pcVar7[8] = 'i';
  pcVar7[9] = 'p';
  pcVar7[10] = 't';
  *(undefined8 *)pcVar7 = s_AngelScript_008da2ba._0_8_;
  pcVar7[0xb] = '\0';
  *(undefined1 *)(unaff_x22 + 0xad) = 1;
  return 0xa39610;
}

