/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00837a1c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00837a1c(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  ulong uVar3;
  int iVar4;
  undefined8 *puVar5;
  code *local_60;
  undefined8 uStack_58;
  undefined4 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1e090 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e090), iVar4 != 0)) {
    DAT_00d1e088 = '\x01';
    DAT_00d1e080 = 0xb16d5d88f423da96;
    __cxa_atexit(&LAB_0083be6c,&DAT_00d1e080,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e090);
  }
  if (DAT_00d1e088 == '\x01') {
    DAT_00d1e088 = '\0';
    DAT_00d1e080 = DAT_00d1e080 ^ 0xb11b33ed9357bff1;
  }
  FUN_008ac76c(param_1,FUN_0083920c,&DAT_00d1e080,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = FUN_0083920c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e080);
  if (((DAT_00d1e0a8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e0a8), iVar4 != 0)) {
    DAT_00d1e0a0 = '\x01';
    DAT_00d1e098 = 0xfb3909eaa915f6fc;
    __cxa_atexit(&LAB_0083be74,&DAT_00d1e098,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e0a8);
  }
  if (DAT_00d1e0a0 == '\x01') {
    DAT_00d1e0a0 = '\0';
    DAT_00d1e098 = DAT_00d1e098 ^ 0xfb4f678fdb61939b;
  }
  FUN_008ac76c(param_1,FUN_00839228,&DAT_00d1e098,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = FUN_00839228;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e098);
  if (((DAT_00d1e0b8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e0b8), iVar4 != 0)) {
    _DAT_00d1e0b0 = 0x1f936e2038f0672;
    __cxa_atexit(&LAB_0083be7c,&DAT_00d1e0b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e0b8);
  }
  uVar3 = _DAT_00d1e0b0;
  if (DAT_00d1e0b7 == '\x01') {
    _DAT_00d1e0b0 = (uint6)((ushort)((ushort)(_DAT_00d1e0b0 >> 0x20) ^ 0x5100) ^ 0x87) << 0x20;
    _DAT_00d1e0b0 =
         (ulong)(CONCAT34((int3)(CONCAT16(DAT_00d1e0b6,_DAT_00d1e0b0) >> 0x20),(int)uVar3) ^
                0xf9000000000000) ^ 0x71fb6315;
  }
  FUN_008ac76c(param_1,FUN_00839270,&DAT_00d1e0b0,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = FUN_00839270;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e0b0);
  if (((DAT_00d1e0c8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e0c8), iVar4 != 0)) {
    DAT_00d1e0c6 = '\x01';
    DAT_00d1e0c0 = 0xce59b46c;
    _DAT_00d1e0c4 = 0x9f70;
    __cxa_atexit(&LAB_0083c0d8,&DAT_00d1e0c0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e0c8);
  }
  if (DAT_00d1e0c6 == '\x01') {
    DAT_00d1e0c6 = '\0';
    _DAT_00d1e0c4 = _DAT_00d1e0c4 ^ 0x9f13;
    DAT_00d1e0c0 = DAT_00d1e0c0 ^ 0xa92dd10b;
  }
  FUN_008ac76c(param_1,&LAB_0083928c,&DAT_00d1e0c0,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083928c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e0c0);
  if (((DAT_00d1e150 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e150), iVar4 != 0)) {
    _DAT_00d1e148 = 0x14f;
    DAT_00d1e140 = 0xc8609b1ae1819429;
    __cxa_atexit(&LAB_0083c1c0,&DAT_00d1e140,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e150);
  }
  if (DAT_00d1e149 == '\x01') {
    DAT_00d1e140 = DAT_00d1e140 ^ 0xab07e97f95edfd4f;
    _DAT_00d1e148 = (ushort)(DAT_00d1e148 ^ 0x4f);
  }
  FUN_008ac76c(param_1,&LAB_008393ec,&DAT_00d1e140,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_008393ec;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e140);
  local_50._0_2_ = 0x50c;
  uStack_58 = 0x39fa21ed001b6c11;
  local_60 = (code *)0x2cf627eb110b6012;
  if (((DAT_00d1e170 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e170), iVar4 != 0)) {
                    /* try { // try from 00838b2c to 00838b3b has its CatchHandler @ 008391e0 */
    FUN_0083c1cc(&DAT_00d1e158,&local_60);
    __cxa_atexit(&LAB_0083c268,&DAT_00d1e158,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e170);
  }
  FUN_0083f484(&DAT_00d1e158);
  FUN_008ac76c(param_1,&LAB_00839df4,&DAT_00d1e158,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_00839df4;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e158);
  local_50 = CONCAT22(local_50._2_2_,0x2f02);
  uStack_58 = 0x290469cd0019461f;
  local_60 = (code *)0x3c086fcb11094a08;
  if (((DAT_00d1e190 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e190), iVar4 != 0)) {
                    /* try { // try from 00838b78 to 00838b87 has its CatchHandler @ 008391d0 */
    FUN_0083c274(&DAT_00d1e178,&local_60);
    __cxa_atexit(&LAB_0083c310,&DAT_00d1e178,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e190);
  }
  FUN_0083f4cc(&DAT_00d1e178);
  FUN_008ac76c(param_1,&LAB_00839e20,&DAT_00d1e178,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_00839e20;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e178);
  if (((DAT_00d1e1a8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e1a8), iVar4 != 0)) {
    DAT_00d1e1a4 = '\x01';
    DAT_00d1e198 = 0xffd4e4808c740738;
    DAT_00d1e1a0 = 0xef630a37;
    __cxa_atexit(&LAB_0083c31c,&DAT_00d1e198,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e1a8);
  }
  if (DAT_00d1e1a4 == '\x01') {
    DAT_00d1e1a4 = '\0';
    DAT_00d1e198 = DAT_00d1e198 ^ 0x93b587ebef116f5b;
    DAT_00d1e1a0 = DAT_00d1e1a0 ^ 0xef116f5b;
  }
  FUN_008ac76c(param_1,&LAB_00839ea0,&DAT_00d1e198,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_00839ea0;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e198);
  local_50 = CONCAT31(local_50._1_3_,0x93);
  uStack_58 = 0x65af143f328244fd;
  local_60 = (code *)0x78b3112c328546f4;
  if (((DAT_00d1e1c8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e1c8), iVar4 != 0)) {
                    /* try { // try from 00838c1c to 00838c2b has its CatchHandler @ 008391c0 */
    FUN_0083c328(&DAT_00d1e1b0,&local_60);
    __cxa_atexit(&LAB_0083c3bc,&DAT_00d1e1b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e1c8);
  }
  FUN_0083f514(&DAT_00d1e1b0);
  FUN_008ac76c(param_1,&LAB_00839ed0,&DAT_00d1e1b0,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_00839ed0;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e1b0);
  uStack_58 = 0xdf8327cce2c5f105;
  local_60 = (code *)0xdd8221c2fec3f216;
  local_50 = 0x8dd3f614;
  if (((DAT_00d1e1e8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e1e8), iVar4 != 0)) {
                    /* try { // try from 00838c68 to 00838c77 has its CatchHandler @ 008391b0 */
    FUN_0083c3c8(&DAT_00d1e1d0,&local_60);
    __cxa_atexit(&LAB_0083c474,&DAT_00d1e1d0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e1e8);
  }
  FUN_0083f54c(&DAT_00d1e1d0);
  FUN_008ac76c(param_1,&LAB_00839f04,&DAT_00d1e1d0,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_00839f04;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e1d0);
  if (((DAT_00d1e220 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e220), iVar4 != 0)) {
    DAT_00d1e210 = 0xa13bd66998d4703a;
    DAT_00d1e218 = 0x9ecb6132;
    _DAT_00d1e21c = 0x11b;
    __cxa_atexit(&LAB_0083c8d4,&DAT_00d1e210,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e220);
  }
  if (DAT_00d1e21d == '\x01') {
    _DAT_00d1e21c = (ushort)(DAT_00d1e21c ^ 0x1b);
    DAT_00d1e210 = DAT_00d1e210 ^ 0xd54bbf1bfba70353;
    DAT_00d1e218 = DAT_00d1e218 ^ 0xfba70353;
  }
  FUN_008ac76c(param_1,&LAB_00839f7c,&DAT_00d1e210,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_00839f7c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e210);
  if (((DAT_00d1e260 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e260), iVar4 != 0)) {
    DAT_00d1e25e = '\x01';
    DAT_00d1e250 = 0x2b9a652c52631a3e;
    DAT_00d1e258 = 0x4d751e39;
    _DAT_00d1e25c = 0x172a;
    __cxa_atexit(&LAB_0083d558,&DAT_00d1e250,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e260);
  }
  if (DAT_00d1e25e == '\x01') {
    DAT_00d1e25e = '\0';
    DAT_00d1e250 = DAT_00d1e250 ^ 0x5bf3174f21177f4d;
    DAT_00d1e258 = DAT_00d1e258 ^ 0x21177f4d;
    _DAT_00d1e25c = _DAT_00d1e25c ^ 0x174f;
  }
  FUN_008ac76c(param_1,&LAB_0083a278,&DAT_00d1e250,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083a278;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e250);
  local_50._0_2_ = 0x95a8;
  uStack_58 = 0x21c380c30c8fe5bf;
  local_60 = (code *)0x30d581da0b89f0b6;
  if (((DAT_00d1e2a0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e2a0), iVar4 != 0)) {
                    /* try { // try from 00838d6c to 00838d7b has its CatchHandler @ 008391a0 */
    FUN_0083d768(&DAT_00d1e288,&local_60);
    __cxa_atexit(&LAB_0083d804,&DAT_00d1e288,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e2a0);
  }
  FUN_0083f590(&DAT_00d1e288);
  FUN_008ac76c(param_1,&LAB_0083a5ec,&DAT_00d1e288,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083a5ec;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e288);
  local_50 = CONCAT22(local_50._2_2_,0x41bc);
  uStack_58 = 0x771d800f888131ab;
  local_60 = (code *)0x660b81168f8724b6;
  if (((DAT_00d1e2e0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e2e0), iVar4 != 0)) {
                    /* try { // try from 00838db8 to 00838dc7 has its CatchHandler @ 00839190 */
    FUN_0083da18(&DAT_00d1e2c8,&local_60);
    __cxa_atexit(&LAB_0083dab4,&DAT_00d1e2c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e2e0);
  }
  FUN_0083f5d8(&DAT_00d1e2c8);
  FUN_008ac76c(param_1,&LAB_0083a8d8,&DAT_00d1e2c8,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083a8d8;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e2c8);
  if (((DAT_00d1e390 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e390), iVar4 != 0)) {
    DAT_00d1e380 = 0xbb4af184300b66b0;
    _DAT_00d1e388 = 0x17f70a3;
    __cxa_atexit(&LAB_0083db14,&DAT_00d1e380,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e390);
  }
  if (DAT_00d1e38b == '\x01') {
    DAT_00d1e380 = DAT_00d1e380 ^ 0xcb2383e7437f03d7;
    uVar2 = (uint3)_DAT_00d1e388;
    _DAT_00d1e388 = (uint)(uVar2 ^ 0x7f03d7);
  }
  FUN_008ac76c(param_1,&LAB_0083abdc,&DAT_00d1e380,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083abdc;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e380);
  local_50 = CONCAT22(local_50._2_2_,0x3b28);
  uStack_58 = 0xf522e8349d845939;
  local_60 = (code *)0xe124f9329a895e2a;
  if (((DAT_00d1e520 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e520), iVar4 != 0)) {
                    /* try { // try from 00838e54 to 00838e63 has its CatchHandler @ 00839180 */
    FUN_0083f080(&DAT_00d1e508,&local_60);
    __cxa_atexit(&LAB_0083f11c,&DAT_00d1e508,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e520);
  }
  FUN_0083f620(&DAT_00d1e508);
  FUN_008ac76c(param_1,&LAB_0083b360,&DAT_00d1e508,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083b360;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e508);
  local_50 = CONCAT31(local_50._1_3_,0x17);
  uStack_58 = 0x6aff86a248f72463;
  local_60 = (code *)0x7fe481b254ef2270;
  if (((DAT_00d1e548 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e548), iVar4 != 0)) {
                    /* try { // try from 00838ea0 to 00838eaf has its CatchHandler @ 00839170 */
    FUN_0083f128(&DAT_00d1e530,&local_60);
    __cxa_atexit(&LAB_0083f1bc,&DAT_00d1e530,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e548);
  }
  FUN_0083f668(&DAT_00d1e530);
  FUN_008ac76c(param_1,&LAB_0083b428,&DAT_00d1e530,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083b428;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e530);
  if (((DAT_00d1e578 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e578), iVar4 != 0)) {
    DAT_00d1e576 = '\x01';
    DAT_00d1e568 = 0xe7ac85445c233692;
    DAT_00d1e570 = 0x5c363b81;
    _DAT_00d1e574 = 0xf74f;
    __cxa_atexit(&LAB_0083f1d0,&DAT_00d1e568,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e578);
  }
  if (DAT_00d1e576 == '\x01') {
    DAT_00d1e576 = '\0';
    _DAT_00d1e574 = _DAT_00d1e574 ^ 0xf727;
    DAT_00d1e568 = DAT_00d1e568 ^ 0x97c5f7272f5753f5;
    DAT_00d1e570 = DAT_00d1e570 ^ 0x2f5753f5;
  }
  FUN_008ac76c(param_1,&LAB_0083b528,&DAT_00d1e568,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083b528;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e568);
  if (((DAT_00d1e590 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e590), iVar4 != 0)) {
    DAT_00d1e58c = 1;
    DAT_00d1e580 = 0x256f160374afec54;
    DAT_00d1e588 = 0x1da2fd5a;
    __cxa_atexit(&LAB_0083f1dc,&DAT_00d1e580,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e590);
  }
  local_50 = CONCAT31(local_50._1_3_,0x33);
  uStack_58 = 0x2579161373b4ea57;
  local_60 = (code *)0x3064010f69afec54;
  if (((DAT_00d1e5b0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e5b0), iVar4 != 0)) {
                    /* try { // try from 00838fbc to 00838fcb has its CatchHandler @ 00839160 */
    FUN_0083f1e8(&DAT_00d1e598,&local_60);
    __cxa_atexit(&LAB_0083f27c,&DAT_00d1e598,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e5b0);
  }
  FUN_0083b624(param_1,&LAB_00839df4,&DAT_00d1e580,&DAT_00d1e598);
  if (((DAT_00d1e5c8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e5c8), iVar4 != 0)) {
    DAT_00d1e5c4 = 1;
    DAT_00d1e5b8 = 0x71975251445f5eda;
    DAT_00d1e5c0 = 0x2d524fc0;
    __cxa_atexit(&LAB_0083f288,&DAT_00d1e5b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e5c8);
  }
  local_50 = CONCAT31(local_50._1_3_,0xa9);
  uStack_58 = 0x71815241434458cd;
  local_60 = (code *)0x649c455d595f5eda;
  if (((DAT_00d1e5e8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e5e8), iVar4 != 0)) {
                    /* try { // try from 00839064 to 00839073 has its CatchHandler @ 00839150 */
    FUN_0083f294(&DAT_00d1e5d0,&local_60);
    __cxa_atexit(&LAB_0083f328,&DAT_00d1e5d0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e5e8);
  }
  FUN_0083b7a4(param_1,&LAB_00839e20,&DAT_00d1e5b8,&DAT_00d1e5d0);
  if (((DAT_00d1e600 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e600), iVar4 != 0)) {
    DAT_00d1e5f0 = 0x4a2dd7dcc3283a01;
    DAT_00d1e5f8 = 0x145280b;
    __cxa_atexit(&LAB_0083f334,&DAT_00d1e5f0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e600);
  }
  FUN_0083b924(param_1,&LAB_0083b360,&DAT_00d1e5f0);
  local_50 = CONCAT22(local_50._2_2_,0x4f17);
  uStack_58 = 0x12a85d0815ae290d;
  local_60 = (code *)0xda85b0808af2a1e;
  if (((DAT_00d1e620 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1e620), iVar4 != 0)) {
                    /* try { // try from 00839104 to 00839113 has its CatchHandler @ 00839140 */
    FUN_0083f340(&DAT_00d1e608,&local_60);
    __cxa_atexit(&LAB_0083f3dc,&DAT_00d1e608,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e620);
  }
  FUN_0083f70c(&DAT_00d1e608);
  FUN_008ac76c(param_1,&LAB_0083b428,&DAT_00d1e608,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1e030,&local_60,&local_60);
  local_60 = (code *)&LAB_0083b428;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e608);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

