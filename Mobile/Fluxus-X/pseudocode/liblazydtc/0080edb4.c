/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080edb4
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0080edb4(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  undefined8 *puVar6;
  undefined1 *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1ba58 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1ba58), iVar5 != 0)) {
    DAT_00d1ba48 = 0x7e457a5d48ab63d;
    DAT_00d1ba50 = 0xd49db83c;
    _DAT_00d1ba54 = 0x193;
    __cxa_atexit(&LAB_00814718,&DAT_00d1ba48,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ba58);
  }
  if (DAT_00d1ba55 == '\x01') {
    _DAT_00d1ba54 = (ushort)(DAT_00d1ba54 ^ 0x93);
    DAT_00d1ba48 = DAT_00d1ba48 ^ 0x69816393b1f9d75f;
    DAT_00d1ba50 = DAT_00d1ba50 ^ 0xb1f9d75f;
  }
  FUN_008ac76c(param_1,&LAB_00811478,&DAT_00d1ba48,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811478;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1ba48);
  if (((DAT_00d1ba70 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1ba70), iVar5 != 0)) {
    DAT_00d1ba60 = 0x4279ab6916d43ad3;
    DAT_00d1ba68 = 0x16c334d2;
    _DAT_00d1ba6c = 0x15f;
    __cxa_atexit(&LAB_008148f4,&DAT_00d1ba60,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ba70);
  }
  if (DAT_00d1ba6d == '\x01') {
    _DAT_00d1ba6c = (ushort)(DAT_00d1ba6c ^ 0x5f);
    DAT_00d1ba60 = DAT_00d1ba60 ^ 0x271d9f5f73a75bb1;
    DAT_00d1ba68 = DAT_00d1ba68 ^ 0x73a75bb1;
  }
  FUN_008ac76c(param_1,&LAB_00811550,&DAT_00d1ba60,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811550;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1ba60);
  if (((DAT_00d1ba88 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1ba88), iVar5 != 0)) {
    DAT_00d1ba86 = '\x01';
    DAT_00d1ba78 = 0xc25c574b1e420033;
    DAT_00d1ba80 = 0x1f5e023f;
    _DAT_00d1ba84 = 0x6318;
    __cxa_atexit(&LAB_00814900,&DAT_00d1ba78,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ba88);
  }
  if (DAT_00d1ba86 == '\x01') {
    DAT_00d1ba86 = '\0';
    DAT_00d1ba78 = DAT_00d1ba78 ^ 0xa703637d7b316151;
    DAT_00d1ba80 = DAT_00d1ba80 ^ 0x7b316151;
    _DAT_00d1ba84 = _DAT_00d1ba84 ^ 0x637d;
  }
  FUN_008ac76c(param_1,&LAB_00811478,&DAT_00d1ba78,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811478;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1ba78);
  if (((DAT_00d1baa0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1baa0), iVar5 != 0)) {
    DAT_00d1ba9e = '\x01';
    DAT_00d1ba90 = 0xf9a8dd0d3c325eff;
    DAT_00d1ba98 = 0x3d2e5cf8;
    _DAT_00d1ba9c = 0xe95e;
    __cxa_atexit(&LAB_0081490c,&DAT_00d1ba90,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1baa0);
  }
  if (DAT_00d1ba9e == '\x01') {
    DAT_00d1ba9e = '\0';
    DAT_00d1ba90 = DAT_00d1ba90 ^ 0x9df7e93b59413f9d;
    DAT_00d1ba98 = DAT_00d1ba98 ^ 0x59413f9d;
    _DAT_00d1ba9c = _DAT_00d1ba9c ^ 0xe93b;
  }
  FUN_008ac76c(param_1,&LAB_00811550,&DAT_00d1ba90,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811550;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1ba90);
  if (((DAT_00d1bab8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1bab8), iVar5 != 0)) {
    DAT_00d1bab2 = '\x01';
    DAT_00d1baa8 = 0xfffceeb556ed10bd;
    _DAT_00d1bab0 = 0x75b0;
    __cxa_atexit(&LAB_00814918,&DAT_00d1baa8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bab8);
  }
  if (DAT_00d1bab2 == '\x01') {
    DAT_00d1bab2 = '\0';
    DAT_00d1baa8 = DAT_00d1baa8 ^ 0x9b938ddb339575d5;
    _DAT_00d1bab0 = _DAT_00d1bab0 ^ 0x75d5;
  }
  FUN_008ac76c(param_1,&LAB_00811610,&DAT_00d1baa8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811610;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1baa8);
  if (((DAT_00d1bad0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1bad0), iVar5 != 0)) {
    DAT_00d1baca = '\x01';
    DAT_00d1bac0 = 0x59b0e60caff93e37;
    _DAT_00d1bac8 = 0x5b3a;
    __cxa_atexit(&LAB_00814924,&DAT_00d1bac0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bad0);
  }
  if (DAT_00d1baca == '\x01') {
    DAT_00d1baca = '\0';
    DAT_00d1bac0 = DAT_00d1bac0 ^ 0x3ddf8569cb815b5f;
    _DAT_00d1bac8 = _DAT_00d1bac8 ^ 0x5b5f;
  }
  FUN_008ac76c(param_1,&LAB_0081176c,&DAT_00d1bac0,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_0081176c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1bac0);
  if (((DAT_00d1bae8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1bae8), iVar5 != 0)) {
    DAT_00d1bad8 = 0x18b277d44cb35473;
    _DAT_00d1bae0 = 0x1cb547f;
    __cxa_atexit(&LAB_00814930,&DAT_00d1bad8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bae8);
  }
  if (DAT_00d1bae3 == '\x01') {
    DAT_00d1bad8 = DAT_00d1bad8 ^ 0x77d119b113cb311b;
    _DAT_00d1bae0 = _DAT_00d1bae0 & 0xffffff ^ 0xcb311b;
  }
  FUN_008ac76c(param_1,&LAB_00811610,&DAT_00d1bad8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811610;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1bad8);
  if (((DAT_00d1bb00 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1bb00), iVar5 != 0)) {
    DAT_00d1baf0 = 0x7e1c4caf02c994e1;
    _DAT_00d1baf8 = 0x1b194ed;
    __cxa_atexit(&LAB_0081493c,&DAT_00d1baf0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bb00);
  }
  if (DAT_00d1bafb == '\x01') {
    DAT_00d1baf0 = DAT_00d1baf0 ^ 0x117f29cb5db1f189;
    uVar2 = (uint3)_DAT_00d1baf8;
    _DAT_00d1baf8 = (uint)(uVar2 ^ 0xb1f189);
  }
  FUN_008ac76c(param_1,&LAB_0081176c,&DAT_00d1baf0,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_0081176c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1baf0);
  if (((DAT_00d1c028 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c028), iVar5 != 0)) {
    DAT_00d1c020 = '\x01';
    DAT_00d1c018 = 0x13cdbba663a25b16;
    __cxa_atexit(&LAB_00814fc0,&DAT_00d1c018,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c028);
  }
  if (DAT_00d1c020 == '\x01') {
    DAT_00d1c020 = '\0';
    DAT_00d1c018 = DAT_00d1c018 ^ 0x13b9cbdf11c13573;
  }
  FUN_008ac76c(param_1,&LAB_008119f8,&DAT_00d1c018,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_008119f8;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c018);
  if (((DAT_00d1c050 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c050), iVar5 != 0)) {
    DAT_00d1c048 = '\x01';
    DAT_00d1c040 = 0x27e33f306fa82cf7;
    __cxa_atexit(&LAB_00814fd0,&DAT_00d1c040,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c050);
  }
  if (DAT_00d1c048 == '\x01') {
    DAT_00d1c048 = '\0';
    DAT_00d1c040 = DAT_00d1c040 ^ 0x27974f491dcb4993;
  }
  FUN_008ac76c(param_1,&LAB_008120fc,&DAT_00d1c040,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_008120fc;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c040);
  if (((DAT_00d1c068 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c068), iVar5 != 0)) {
    DAT_00d1c066 = '\x01';
    DAT_00d1c058 = 0x9e3b2297deb9d842;
    DAT_00d1c060 = 0xdea3c447;
    _DAT_00d1c064 = 0x4396;
    __cxa_atexit(&LAB_00814fd8,&DAT_00d1c058,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c068);
  }
  if (DAT_00d1c066 == '\x01') {
    DAT_00d1c066 = '\0';
    DAT_00d1c058 = DAT_00d1c058 ^ 0xfb4f43e5bbd7bd25;
    DAT_00d1c060 = DAT_00d1c060 ^ 0xbbd7bd25;
    _DAT_00d1c064 = _DAT_00d1c064 ^ 0x43e5;
  }
  FUN_008ac76c(param_1,&LAB_00812740,&DAT_00d1c058,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00812740;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c058);
  if (((DAT_00d1c080 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c080), iVar5 != 0)) {
    DAT_00d1c07c = '\x01';
    DAT_00d1c070 = 0xe6355adf82555658;
    DAT_00d1c078 = 0xe7425654;
    __cxa_atexit(&LAB_00814fe4,&DAT_00d1c070,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c080);
  }
  if (DAT_00d1c07c == '\x01') {
    DAT_00d1c07c = '\0';
    DAT_00d1c070 = DAT_00d1c070 ^ 0x83413bade73b333f;
    DAT_00d1c078 = DAT_00d1c078 ^ 0xe73b333f;
  }
  FUN_008ac76c(param_1,&LAB_00812864,&DAT_00d1c070,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00812864;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c070);
  if (((DAT_00d1c090 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c090), iVar5 != 0)) {
    _DAT_00d1c088 = 0x1cf84206b5168a5;
    __cxa_atexit(&LAB_00814ff0,&DAT_00d1c088,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c090);
  }
  uVar4 = _DAT_00d1c088;
  if (DAT_00d1c08f == '\x01') {
    uVar3 = _DAT_00d1c088 >> 0x30;
    _DAT_00d1c088 = (uint5)(DAT_00d1c08c ^ 0x4f) << 0x20;
    _DAT_00d1c088 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c08d,_DAT_00d1c088)) >> 0x20),
                         (int)uVar4) ^ 0xcfe9000f3f09d7;
  }
  FUN_008ac76c(param_1,&LAB_00812974,&DAT_00d1c088,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00812974;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c088);
  if (((DAT_00d1c170 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c170), iVar5 != 0)) {
    DAT_00d1c168 = 0xfb4e066b;
    _DAT_00d1c16c = 0x101;
    __cxa_atexit(&LAB_00815778,&DAT_00d1c168,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c170);
  }
  if (DAT_00d1c16d == '\x01') {
    _DAT_00d1c16c = (ushort)(DAT_00d1c16c ^ 1);
    DAT_00d1c168 = DAT_00d1c168 ^ 0x933d6703;
  }
  FUN_008ac76c(param_1,&LAB_00812a3c,&DAT_00d1c168,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00812a3c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c168);
  if (((DAT_00d1c190 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c190), iVar5 != 0)) {
    DAT_00d1c188 = 0x9a926291;
    _DAT_00d1c18c = 0x1e5;
    __cxa_atexit(&LAB_00815790,&DAT_00d1c188,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c190);
  }
  if (DAT_00d1c18d == '\x01') {
    _DAT_00d1c18c = (ushort)(DAT_00d1c18c ^ 0xe5);
    DAT_00d1c188 = DAT_00d1c188 ^ 0xf9f30ff9;
  }
  FUN_008ac76c(param_1,&LAB_00813460,&DAT_00d1c188,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00813460;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c188);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1c1a0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c1a0), iVar5 != 0)) {
    _DAT_00d1c198 = 0x13bf4eb08821356;
    __cxa_atexit(&LAB_0081579c,&DAT_00d1c198,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c1a0);
  }
  uVar4 = _DAT_00d1c198;
  if (DAT_00d1c19f == '\x01') {
    _DAT_00d1c198 = (uint6)((ushort)((ushort)(_DAT_00d1c198 >> 0x20) ^ 0x9100) ^ 0x8f) << 0x20;
    _DAT_00d1c198 =
         (ulong)CONCAT34((int3)(CONCAT16(DAT_00d1c19e,_DAT_00d1c198) >> 0x20),(int)uVar4) ^
         0x3b000067e17d33;
  }
  FUN_008ac76c(param_1,&LAB_00811478,&DAT_00d1c198,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811478;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c198);
  if (((DAT_00d1c1b0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c1b0), iVar5 != 0)) {
    _DAT_00d1c1a8 = 0x1bd5a1198424c31;
    __cxa_atexit(&LAB_008157a8,&DAT_00d1c1a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c1b0);
  }
  uVar4 = _DAT_00d1c1a8;
  if (DAT_00d1c1af == '\x01') {
    uVar3 = _DAT_00d1c1a8 >> 0x30;
    _DAT_00d1c1a8 = (uint5)(DAT_00d1c1ac ^ 0x75) << 0x20;
    _DAT_00d1c1a8 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c1ad,_DAT_00d1c1a8)) >> 0x20),
                         (int)uVar4) ^ 0xbd3f00f7212955;
  }
  FUN_008ac76c(param_1,&LAB_00811550,&DAT_00d1c1a8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811550;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c1a8);
  if (((DAT_00d1c1c0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c1c0), iVar5 != 0)) {
    _DAT_00d1c1b8 = 0x16da11d9ab6e449;
    __cxa_atexit(&LAB_008157b4,&DAT_00d1c1b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c1c0);
  }
  uVar4 = _DAT_00d1c1b8;
  if (DAT_00d1c1bf == '\x01') {
    uVar3 = _DAT_00d1c1b8 >> 0x30;
    _DAT_00d1c1b8 = (uint5)(DAT_00d1c1bc ^ 0x2b) << 0x20;
    _DAT_00d1c1b8 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c1bd,_DAT_00d1c1b8)) >> 0x20),
                         (int)uVar4) ^ 0x6d9500ffc5852b;
  }
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c1b8);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1c1d0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c1d0), iVar5 != 0)) {
    _DAT_00d1c1c8 = 0x13fbaf578f81324;
    __cxa_atexit(&LAB_008157c0,&DAT_00d1c1c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c1d0);
  }
  uVar4 = _DAT_00d1c1c8;
  if (DAT_00d1c1cf == '\x01') {
    uVar3 = _DAT_00d1c1c8 >> 0x30;
    _DAT_00d1c1c8 = (uint5)(DAT_00d1c1cc ^ 0x91) << 0x20;
    _DAT_00d1c1c8 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c1cd,_DAT_00d1c1c8)) >> 0x20),
                         (int)uVar4) ^ 0x3fdf00179b7d41;
  }
  FUN_008ac76c(param_1,&LAB_00811610,&DAT_00d1c1c8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811610;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c1c8);
  if (((DAT_00d1c1e0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c1e0), iVar5 != 0)) {
    _DAT_00d1c1d8 = 0x1d7287352161ef5;
    __cxa_atexit(&LAB_008157cc,&DAT_00d1c1d8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c1e0);
  }
  uVar4 = _DAT_00d1c1d8;
  if (DAT_00d1c1df == '\x01') {
    uVar3 = _DAT_00d1c1d8 >> 0x30;
    _DAT_00d1c1d8 = (uint5)(DAT_00d1c1dc ^ 0x17) << 0x20;
    _DAT_00d1c1d8 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c1dd,_DAT_00d1c1d8)) >> 0x20),
                         (int)uVar4) ^ 0xd74d003d757b91;
  }
  FUN_008ac76c(param_1,&LAB_0081176c,&DAT_00d1c1d8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_0081176c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c1d8);
  if (((DAT_00d1c1f0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c1f0), iVar5 != 0)) {
    DAT_00d1c1ec = '\x01';
    DAT_00d1c1e8 = 0x7d3d9ca9;
    __cxa_atexit(&LAB_008157d8,&DAT_00d1c1e8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c1f0);
  }
  if (DAT_00d1c1ec == '\x01') {
    DAT_00d1c1ec = '\0';
    DAT_00d1c1e8 = DAT_00d1c1e8 ^ 0x7d45f9c1;
  }
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c1e8);
  if (((DAT_00d1c200 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c200), iVar5 != 0)) {
    DAT_00d1c1fe = '\x01';
    DAT_00d1c1f8 = 0xb1dc838e;
    _DAT_00d1c1fc = 0xf1d7;
    __cxa_atexit(&LAB_008157e0,&DAT_00d1c1f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c200);
  }
  if (DAT_00d1c1fe == '\x01') {
    DAT_00d1c1fe = '\0';
    _DAT_00d1c1fc = _DAT_00d1c1fc ^ 0xf1a3;
    DAT_00d1c1f8 = DAT_00d1c1f8 ^ 0xc1a5f1ed;
  }
  FUN_00807e7c(param_1,&DAT_00d1c1f8);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1c210 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c210), iVar5 != 0)) {
    _DAT_00d1c208 = 0x145c889565c1bb4;
    __cxa_atexit(&LAB_008157ec,&DAT_00d1c208,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c210);
  }
  uVar4 = _DAT_00d1c208;
  if (DAT_00d1c20f == '\x01') {
    uVar3 = _DAT_00d1c208 >> 0x30;
    _DAT_00d1c208 = (uint5)(DAT_00d1c20c ^ 0xed) << 0x20;
    _DAT_00d1c208 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c20d,_DAT_00d1c208)) >> 0x20),
                         (int)uVar4) ^ 0x45ad00393f75d1;
  }
  FUN_008ac76c(param_1,&LAB_00811478,&DAT_00d1c208,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811478;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c208);
  if (((DAT_00d1c220 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c220), iVar5 != 0)) {
    _DAT_00d1c218 = 0x13f5c09d052f40b;
    __cxa_atexit(&LAB_008157f8,&DAT_00d1c218,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c220);
  }
  uVar4 = _DAT_00d1c218;
  if (DAT_00d1c21f == '\x01') {
    uVar3 = _DAT_00d1c218 >> 0x30;
    _DAT_00d1c218 = (uint5)(DAT_00d1c21c ^ 0x6d) << 0x20;
    _DAT_00d1c218 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c21d,_DAT_00d1c218)) >> 0x20),
                         (int)uVar4) ^ 0x3f3900bf31916f;
  }
  FUN_008ac76c(param_1,&LAB_00811550,&DAT_00d1c218,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811550;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c218);
  if (((DAT_00d1c230 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c230), iVar5 != 0)) {
    _DAT_00d1c228 = 0x11365b156183819;
    __cxa_atexit(&LAB_00815804,&DAT_00d1c228,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c230);
  }
  uVar4 = _DAT_00d1c228;
  if (DAT_00d1c22f == '\x01') {
    _DAT_00d1c228 = (uint6)((ushort)((ushort)(_DAT_00d1c228 >> 0x20) ^ 0x5100) ^ 0x87) << 0x20;
    _DAT_00d1c228 =
         (ulong)CONCAT34((int3)(CONCAT16(DAT_00d1c22e,_DAT_00d1c228) >> 0x20),(int)uVar4) ^
         0x130000336b597b;
  }
  FUN_00807e7c(param_1,&DAT_00d1c228);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1c240 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c240), iVar5 != 0)) {
    _DAT_00d1c238 = 0x141f6ad5cac976c;
    __cxa_atexit(&LAB_00815810,&DAT_00d1c238,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c240);
  }
  uVar4 = _DAT_00d1c238;
  if (DAT_00d1c23f == '\x01') {
    uVar3 = _DAT_00d1c238 >> 0x30;
    _DAT_00d1c238 = (uint5)(DAT_00d1c23c ^ 0xc9) << 0x20;
    _DAT_00d1c238 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c23d,_DAT_00d1c238)) >> 0x20),
                         (int)uVar4) ^ 0x41930033cff909;
  }
  FUN_008ac76c(param_1,&LAB_00811610,&DAT_00d1c238,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00811610;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c238);
  if (((DAT_00d1c250 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c250), iVar5 != 0)) {
    _DAT_00d1c248 = 0x1fd4031fe6462d3;
    __cxa_atexit(&LAB_0081581c,&DAT_00d1c248,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c250);
  }
  uVar4 = _DAT_00d1c248;
  if (DAT_00d1c24f == '\x01') {
    _DAT_00d1c248 = (uint6)((ushort)((ushort)(_DAT_00d1c248 >> 0x20) ^ 0x2500) ^ 0x55) << 0x20;
    _DAT_00d1c248 =
         (ulong)(CONCAT34((int3)(CONCAT16(DAT_00d1c24e,_DAT_00d1c248) >> 0x20),(int)uVar4) ^
                0xfd000000000000) ^ 0x910707b7;
  }
  FUN_008ac76c(param_1,&LAB_0081176c,&DAT_00d1c248,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_0081176c;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1c248);
  if (((DAT_00d1c260 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c260), iVar5 != 0)) {
    DAT_00d1c25c = '\x01';
    DAT_00d1c258 = 0x4bb5a8f1;
    __cxa_atexit(&LAB_00815828,&DAT_00d1c258,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c260);
  }
  if (DAT_00d1c25c == '\x01') {
    DAT_00d1c25c = '\0';
    DAT_00d1c258 = DAT_00d1c258 ^ 0x4bcdcd99;
  }
  FUN_00807e7c(param_1,&DAT_00d1c258);
  if (((DAT_00d1c278 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c278), iVar5 != 0)) {
    DAT_00d1c274 = '\x01';
    DAT_00d1c268 = 0xa1717004461d23b1;
    DAT_00d1c270 = 0x255a2ab8;
    __cxa_atexit(&LAB_00815844,&DAT_00d1c268,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c278);
  }
  if (DAT_00d1c274 == '\x01') {
    DAT_00d1c274 = '\0';
    DAT_00d1c268 = DAT_00d1c268 ^ 0xd3011d6b252959dd;
    DAT_00d1c270 = DAT_00d1c270 ^ 0x252959dd;
  }
  FUN_008ac76c(param_1,&LAB_00813a00,&DAT_00d1c268,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00813a00;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c268);
  if (((DAT_00d1c290 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c290), iVar5 != 0)) {
    DAT_00d1c28e = '\x01';
    DAT_00d1c280 = 0x228c3cf051df8b77;
    DAT_00d1c288 = 0x468e836b;
    _DAT_00d1c28c = 0x5fe6;
    __cxa_atexit(&LAB_00815850,&DAT_00d1c280,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c290);
  }
  if (DAT_00d1c28e == '\x01') {
    DAT_00d1c28e = '\0';
    DAT_00d1c280 = DAT_00d1c280 ^ 0x4fe35f9535ebf11b;
    DAT_00d1c288 = DAT_00d1c288 ^ 0x35ebf11b;
    _DAT_00d1c28c = _DAT_00d1c28c ^ 0x5f95;
  }
  FUN_008ac76c(param_1,&LAB_00813bf0,&DAT_00d1c280,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_60 = (undefined1 *)*puVar6;
  FUN_00807f14(&DAT_00d1b9f8,&local_60,&local_60);
  local_60 = &LAB_00813bf0;
  FUN_0080837c(&DAT_00cca848,&local_60,&local_60);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c280);
  if (((DAT_00d1c2a8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c2a8), iVar5 != 0)) {
    DAT_00d1c298 = 0xdca95ad8cdee2e1;
    DAT_00d1c2a0 = 0x8cc9ece0;
    DAT_00d1c2a4 = 0x19b;
    __cxa_atexit(&LAB_0081585c,&DAT_00d1c298,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c2a8);
  }
  if (((DAT_00d1c2c0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c2c0), iVar5 != 0)) {
    DAT_00d1c2be = 1;
    DAT_00d1c2b0 = 0x6f095ad8cdee2e1;
    DAT_00d1c2b8 = 0x8dc2e0ed;
    DAT_00d1c2bc = 0xa1fe;
    __cxa_atexit(&LAB_00815868,&DAT_00d1c2b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c2c0);
  }
  FUN_00813d80(param_1,&LAB_00811478,&DAT_00d1c298,&DAT_00d1c2b0);
  if (((DAT_00d1c2d8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c2d8), iVar5 != 0)) {
    DAT_00d1c2c8 = 0xb6d32d950af60427;
    DAT_00d1c2d0 = 0xae10a26;
    DAT_00d1c2d4 = 0x1a3;
    __cxa_atexit(&LAB_00815874,&DAT_00d1c2c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c2d8);
  }
  if (((DAT_00d1c2f0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c2f0), iVar5 != 0)) {
    DAT_00d1c2ee = 1;
    DAT_00d1c2e0 = 0xb7e82d950af60427;
    DAT_00d1c2e8 = 0xbea0620;
    DAT_00d1c2ec = 0x19c6;
    __cxa_atexit(&LAB_00815880,&DAT_00d1c2e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c2f0);
  }
  FUN_00813f60(param_1,&LAB_00811550,&DAT_00d1c2c8,&DAT_00d1c2e0);
  if (((DAT_00d1c308 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c308), iVar5 != 0)) {
    DAT_00d1c302 = 1;
    DAT_00d1c2f8 = 0x935aa04564336a49;
    DAT_00d1c300 = 0xf44;
    __cxa_atexit(&LAB_0081588c,&DAT_00d1c2f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c308);
  }
  if (((DAT_00d1c320 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c320), iVar5 != 0)) {
    DAT_00d1c310 = 0x9856ad4e5e336a49;
    DAT_00d1c318 = 0x14b6a45;
    __cxa_atexit(&LAB_00815898,&DAT_00d1c310,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c320);
  }
  FUN_00814140(param_1,&LAB_00811610,&DAT_00d1c2f8,&DAT_00d1c310);
  if (((DAT_00d1c338 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c338), iVar5 != 0)) {
    DAT_00d1c332 = 1;
    DAT_00d1c328 = 0xbbf2ae08cb755835;
    DAT_00d1c330 = 0x3d38;
    __cxa_atexit(&LAB_008158a4,&DAT_00d1c328,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c338);
  }
  if (((DAT_00d1c350 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c350), iVar5 != 0)) {
    DAT_00d1c340 = 0xb0fea809f0755835;
    DAT_00d1c348 = 0x10d5839;
    __cxa_atexit(&LAB_008158b0,&DAT_00d1c340,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c350);
  }
  FUN_00814304(param_1,&LAB_0081176c,&DAT_00d1c328,&DAT_00d1c340);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

