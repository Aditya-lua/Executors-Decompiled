
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00136d00(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  int in_w8;
  undefined2 *puVar6;
  undefined4 *puVar7;
  ulong *unaff_x19;
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
  
  if (in_w8 < 0) {
    __ZdlPv(uStack0000000000000020);
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
    puRam0000000000a392e0 = puVar1 + 4;
  }
  else {
    puRam0000000000a392e0 = (undefined8 *)func_0x0014a284(0xa392d8,&uStack0000000000000020);
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
    puRam0000000000a392e0 = puVar1 + 4;
  }
  else {
    puRam0000000000a392e0 = (undefined8 *)func_0x0014a284(0xa392d8,&uStack0000000000000020);
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
    puRam0000000000a392e0 = puVar1 + 4;
  }
  else {
    puRam0000000000a392e0 = (undefined8 *)func_0x0014a284(0xa392d8,&uStack0000000000000020);
    if (cStack0000000000000037 < '\0') {
      __ZdlPv(uStack0000000000000020);
    }
  }
  if (cRam0000000000a39297 < '\0') {
    uRam0000000000a39288 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a39283,CONCAT12(uRam0000000000a39282,uRam0000000000a39280));
    *puVar6 = 0x2a2f;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a39297 = '\x02';
    uRam0000000000a39280 = 0x2a2f;
    uRam0000000000a39282 = 0;
  }
  if (cRam0000000000a392af < '\0') {
    uRam0000000000a392a0 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a3929b,CONCAT12(uRam0000000000a3929a,uRam0000000000a39298));
    *puVar6 = 0x2f2a;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a392af = '\x02';
    uRam0000000000a39298 = 0x2f2a;
    uRam0000000000a3929a = 0;
  }
  if (cRam0000000000a392c7 < '\0') {
    uRam0000000000a392b8 = 2;
    puVar6 = puRam0000000000a392b0;
  }
  else {
    puVar6 = (undefined2 *)0xa392b0;
    cRam0000000000a392c7 = '\x02';
  }
  *puVar6 = 0x2f2f;
  *(undefined1 *)(puVar6 + 1) = 0;
  uRam0000000000a392f0 = 1;
  uRam0000000000a392c9 = 1;
  if (cRam0000000000a39207 < '\0') {
    uRam0000000000a391f8 = 4;
    puVar7 = puRam0000000000a391f0;
  }
  else {
    cRam0000000000a39207 = '\x04';
    puVar7 = (undefined4 *)0xa391f0;
  }
  *puVar7 = 0x4c534c48;
  *(undefined1 *)(puVar7 + 1) = 0;
  *(undefined1 *)(unaff_x22 + 0xa9) = 1;
  return 0xa391f0;
}

