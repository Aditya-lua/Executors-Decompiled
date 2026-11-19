/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00818008
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00818008(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  undefined8 *puVar6;
  code *local_50;
  undefined8 uStack_48;
  undefined1 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1c640 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c640), iVar5 != 0)) {
    DAT_00d1c630 = 0x50fbce5965daf2d7;
    _DAT_00d1c638 = 0x1a5;
    __cxa_atexit(&LAB_0081f180,&DAT_00d1c630,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c640);
  }
  if (DAT_00d1c639 == '\x01') {
    DAT_00d1c630 = DAT_00d1c630 ^ 0x3597a73f01bb97a5;
    _DAT_00d1c638 = (ushort)(DAT_00d1c638 ^ 0xa5);
  }
  FUN_008ac76c(param_1,FUN_00819174,&DAT_00d1c630,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = FUN_00819174;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c630);
  if (((DAT_00d1c658 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c658), iVar5 != 0)) {
    DAT_00d1c652 = '\x01';
    DAT_00d1c648 = 0x9760ddbc957251ae;
    _DAT_00d1c650 = 0x23bc;
    __cxa_atexit(&LAB_0081f68c,&DAT_00d1c648,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c658);
  }
  if (DAT_00d1c652 == '\x01') {
    DAT_00d1c652 = '\0';
    DAT_00d1c648 = DAT_00d1c648 ^ 0xfb09bbd9e11b23d9;
    _DAT_00d1c650 = _DAT_00d1c650 ^ 0x23d9;
  }
  FUN_008ac76c(param_1,&LAB_0081955c,&DAT_00d1c648,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081955c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c648);
  if (((DAT_00d1c670 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c670), iVar5 != 0)) {
    DAT_00d1c660 = 0x828741cf3425cdc0;
    _DAT_00d1c668 = 0x155d8cd;
    __cxa_atexit(&LAB_0081f698,&DAT_00d1c660,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c670);
  }
  if (DAT_00d1c66b == '\x01') {
    DAT_00d1c660 = DAT_00d1c660 ^ 0xebe125a15155bda1;
    uVar2 = (uint3)_DAT_00d1c668;
    _DAT_00d1c668 = (uint)(uVar2 ^ 0x55bda1);
  }
  FUN_008ac76c(param_1,&LAB_00819788,&DAT_00d1c660,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_00819788;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c660);
  if (((DAT_00d1c688 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c688), iVar5 != 0)) {
    DAT_00d1c678 = 0xf1fb3c99be5446f0;
    _DAT_00d1c680 = 0x13f55f8;
    __cxa_atexit(&LAB_0081f6a4,&DAT_00d1c678,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c688);
  }
  if (DAT_00d1c683 == '\x01') {
    DAT_00d1c678 = DAT_00d1c678 ^ 0x959753ffdb3f279d;
    uVar2 = (uint3)_DAT_00d1c680;
    _DAT_00d1c680 = (uint)(uVar2 ^ 0x3f279d);
  }
  FUN_008ac76c(param_1,&LAB_008199b4,&DAT_00d1c678,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_008199b4;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c678);
  if (((DAT_00d1c6a0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c6a0), iVar5 != 0)) {
    DAT_00d1c690 = 0x1ba41fe3e093bed8;
    _DAT_00d1c698 = 0x1b1;
    __cxa_atexit(&LAB_0081f6b0,&DAT_00d1c690,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c6a0);
  }
  if (DAT_00d1c699 == '\x01') {
    DAT_00d1c690 = DAT_00d1c690 ^ 0x69c17b8f8ff5cdb1;
    _DAT_00d1c698 = (ushort)(DAT_00d1c698 ^ 0xb1);
  }
  FUN_008ac76c(param_1,&LAB_00819b3c,&DAT_00d1c690,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_00819b3c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c690);
  if (((DAT_00d1c6b0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c6b0), iVar5 != 0)) {
    _DAT_00d1c6a8 = 0x16956af943d5000;
    __cxa_atexit(&LAB_0081f6bc,&DAT_00d1c6a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c6b0);
  }
  uVar4 = _DAT_00d1c6a8;
  if (DAT_00d1c6af == '\x01') {
    _DAT_00d1c6a8 = (uint6)((ushort)((ushort)(_DAT_00d1c6a8 >> 0x20) ^ 0x3300) ^ 0xc3) << 0x20;
    _DAT_00d1c6a8 =
         (ulong)CONCAT34((int3)(CONCAT16(DAT_00d1c6ae,_DAT_00d1c6a8) >> 0x20),(int)uVar4) ^
         0x690000fd5b2369;
  }
  FUN_008ac76c(param_1,&LAB_00819d0c,&DAT_00d1c6a8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_00819d0c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c6a8);
  if (((DAT_00d1c6f8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c6f8), iVar5 != 0)) {
    DAT_00d1c6f2 = '\x01';
    DAT_00d1c6e8 = 0x5045ae99cbd4080f;
    _DAT_00d1c6f0 = 0x6110;
    __cxa_atexit(&LAB_0081f7bc,&DAT_00d1c6e8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c6f8);
  }
  if (DAT_00d1c6f2 == '\x01') {
    DAT_00d1c6f2 = '\0';
    DAT_00d1c6e8 = DAT_00d1c6e8 ^ 0x3529c7ffbfa76163;
    _DAT_00d1c6f0 = _DAT_00d1c6f0 ^ 0x6163;
  }
  FUN_008ac76c(param_1,&LAB_00819edc,&DAT_00d1c6e8,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_00819edc;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c6e8);
  if (((DAT_00d1c750 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c750), iVar5 != 0)) {
    DAT_00d1c74c = '\x01';
    DAT_00d1c740 = 0x79a92e4f9764b06f;
    DAT_00d1c748 = 0xe364ab66;
    __cxa_atexit(&LAB_0081f7ec,&DAT_00d1c740,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c750);
  }
  if (DAT_00d1c74c == '\x01') {
    DAT_00d1c74c = '\0';
    DAT_00d1c740 = DAT_00d1c740 ^ 0x1dc54129e317d903;
    DAT_00d1c748 = DAT_00d1c748 ^ 0xe317d903;
  }
  FUN_008ac76c(param_1,&LAB_0081a60c,&DAT_00d1c740,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081a60c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c740);
  if (((DAT_00d1c768 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c768), iVar5 != 0)) {
    DAT_00d1c760 = '\x01';
    DAT_00d1c758 = 0xf1fc3f2c59b528e5;
    __cxa_atexit(&LAB_0081f7f8,&DAT_00d1c758,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c768);
  }
  if (DAT_00d1c760 == '\x01') {
    DAT_00d1c760 = '\0';
    DAT_00d1c758 = DAT_00d1c758 ^ 0xf19953453fd94d81;
  }
  FUN_008ac76c(param_1,&LAB_0081afa0,&DAT_00d1c758,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081afa0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c758);
  if (((DAT_00d1c780 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c780), iVar5 != 0)) {
    DAT_00d1c77a = '\x01';
    DAT_00d1c770 = 0x78c5693e574bb401;
    _DAT_00d1c778 = 0xd117;
    __cxa_atexit(&LAB_0081f800,&DAT_00d1c770,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c780);
  }
  if (DAT_00d1c77a == '\x01') {
    DAT_00d1c77a = '\0';
    DAT_00d1c770 = DAT_00d1c770 ^ 0x1da105513127d165;
    _DAT_00d1c778 = _DAT_00d1c778 ^ 0xd165;
  }
  FUN_008ac76c(param_1,&LAB_0081b124,&DAT_00d1c770,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081b124;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c770);
  if (((DAT_00d1c7b0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c7b0), iVar5 != 0)) {
    DAT_00d1c7a0 = 0x78759ae9c9544423;
    _DAT_00d1c7a8 = 0x14f;
    __cxa_atexit(&LAB_0081f818,&DAT_00d1c7a0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c7b0);
  }
  if (DAT_00d1c7a9 == '\x01') {
    DAT_00d1c7a0 = DAT_00d1c7a0 ^ 0x1d19f38fad352b4f;
    _DAT_00d1c7a8 = (ushort)(DAT_00d1c7a8 ^ 0x4f);
  }
  FUN_008ac76c(param_1,&LAB_0081b2a8,&DAT_00d1c7a0,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081b2a8;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c7a0);
  if (((DAT_00d1c7d8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c7d8), iVar5 != 0)) {
    _DAT_00d1c7d0 = 0x1b30ad5b201c0b3;
    __cxa_atexit(&LAB_0081f830,&DAT_00d1c7d0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c7d8);
  }
  uVar4 = _DAT_00d1c7d0;
  if (DAT_00d1c7d7 == '\x01') {
    uVar3 = _DAT_00d1c7d0 >> 0x30;
    _DAT_00d1c7d0 = (uint5)(DAT_00d1c7d4 ^ 0xb9) << 0x20;
    _DAT_00d1c7d0 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c7d5,_DAT_00d1c7d0)) >> 0x20),
                         (int)uVar4) ^ 0xb36f00db67afd7;
  }
  FUN_008ac76c(param_1,&LAB_0081ba0c,&DAT_00d1c7d0,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081ba0c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c7d0);
  if (((DAT_00d1c930 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c930), iVar5 != 0)) {
    _DAT_00d1c928 = 0x1ab29ecae409216;
    DAT_00d1c920 = 0x32df2efcbe47961c;
    __cxa_atexit(&LAB_0081fdc8,&DAT_00d1c920,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c930);
  }
  uVar4 = _DAT_00d1c928;
  if (DAT_00d1c92f == '\x01') {
    uVar3 = _DAT_00d1c928 >> 0x30;
    DAT_00d1c920 = DAT_00d1c920 ^ 0x5dab5d89dd33f37b;
    _DAT_00d1c928 = (uint5)(DAT_00d1c92c ^ 0x89) << 0x20;
    _DAT_00d1c928 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c92d,_DAT_00d1c928)) >> 0x20),
                         (int)uVar4) ^ 0xab5d00dd33f37b;
  }
  FUN_008ac76c(param_1,&LAB_0081c1a4,&DAT_00d1c920,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081c1a4;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1c920);
  local_40 = 0xaf;
  uStack_48 = 0xdda0b6eeeacc34db;
  local_50 = (code *)0xdab0a6f8ffc829d8;
  if (((DAT_00d1ca48 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1ca48), iVar5 != 0)) {
                    /* try { // try from 0081910c to 0081911b has its CatchHandler @ 00819148 */
    FUN_008201e4(&DAT_00d1ca30,&local_50);
    __cxa_atexit(&LAB_00820278,&DAT_00d1ca30,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ca48);
  }
  FUN_00820284(&DAT_00d1ca30);
  FUN_008ac76c(param_1,&LAB_0081d6a0,&DAT_00d1ca30,0,0);
  puVar6 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar6;
  FUN_00807f14(&DAT_00d1c598,&local_50,&local_50);
  local_50 = (code *)&LAB_0081d6a0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1ca30);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

