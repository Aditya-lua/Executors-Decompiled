/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00830f34
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00830f34(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  undefined1 uVar6;
  byte bVar7;
  int iVar8;
  undefined8 *puVar9;
  undefined1 *local_50;
  undefined5 uStack_48;
  undefined2 uStack_43;
  undefined1 uStack_41;
  undefined1 uStack_40;
  undefined1 uStack_3f;
  undefined1 uStack_3e;
  undefined2 uStack_3d;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1da20 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1da20), iVar8 != 0)) {
    DAT_00d1da1e = '\x01';
    DAT_00d1da10 = 0x500dd2b4a914042b;
    DAT_00d1da18 = 0xa61e0b3a;
    DAT_00d1da1c = 0xbdb5;
    __cxa_atexit(&LAB_008364a8,&DAT_00d1da10,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1da20);
  }
  if (DAT_00d1da1e == '\x01') {
    DAT_00d1da1e = '\0';
    DAT_00d1da10 = DAT_00d1da10 ^ 0x3561bdc7c77b6759;
    DAT_00d1da18 = DAT_00d1da18 ^ 0xc77b6759;
    DAT_00d1da1c = DAT_00d1da1c ^ 0xbdc7;
  }
  FUN_008ac76c(param_1,&LAB_00833af0,&DAT_00d1da10,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833af0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1da10);
  if (((DAT_00d1da40 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1da40), iVar8 != 0)) {
    _DAT_00d1da38 = 0x115868b3eb643d2;
    DAT_00d1da30 = 0x7e798c8c31bc52c3;
    __cxa_atexit(&LAB_008364b4,&DAT_00d1da30,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1da40);
  }
  uVar4 = _DAT_00d1da38;
  if (DAT_00d1da3f == '\x01') {
    uVar6 = DAT_00d1da3e;
    uVar3 = (ulong)CONCAT31(_DAT_00d1da3d,~DAT_00d1da3c) & 0xffffff;
    _DAT_00d1da38 = uVar3 << 0x20;
    lVar5 = _DAT_00d1da38;
    DAT_00d1da3d = (undefined1)(uVar3 >> 8);
    DAT_00d1da30 = DAT_00d1da30 ^ 0x1b15e3ff5fd331b1;
    _DAT_00d1da38 = (undefined5)lVar5;
    _DAT_00d1da38 =
         (ulong)(CONCAT34((int3)(CONCAT16(uVar6,CONCAT15(DAT_00d1da3d,_DAT_00d1da38)) >> 0x20),
                          (int)uVar4) ^ 0x15000000000000) ^ 0xe3005fd331b1;
  }
  FUN_008ac76c(param_1,&LAB_00833af8,&DAT_00d1da30,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833af8;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1da30);
  uStack_48 = 0xd12b9ec2a5;
  uStack_43 = 0xb446;
  uStack_41 = 0xf9;
  local_50 = (undefined1 *)0x9ca146d03182c4b3;
  if (((DAT_00d1da68 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1da68), iVar8 != 0)) {
                    /* try { // try from 00832c44 to 00832c53 has its CatchHandler @ 00833ac4 */
    FUN_008364c0(&DAT_00d1da50,&local_50);
    __cxa_atexit(&LAB_0083654c,&DAT_00d1da50,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1da68);
  }
  if (DAT_00d1da60 == '\x01') {
    DAT_00d1da60 = '\0';
    _DAT_00d1da50 = _DAT_00d1da50 ^ 0xf9cd29a35feda7c1;
    uRam0000000000d1da58 = uRam0000000000d1da58 ^ 0xf9cd29a35feda7c1;
  }
  FUN_008ac76c(param_1,&LAB_00833b00,&DAT_00d1da50,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b00;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1da50);
  if (((DAT_00d1da80 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1da80), iVar8 != 0)) {
    DAT_00d1da7e = '\x01';
    DAT_00d1da70 = 0x6a6116b439f4f655;
    DAT_00d1da78 = 0x22ebfb4e;
    DAT_00d1da7c = 0x79b3;
    __cxa_atexit(&LAB_00836554,&DAT_00d1da70,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1da80);
  }
  if (DAT_00d1da7e == '\x01') {
    DAT_00d1da7e = '\0';
    DAT_00d1da70 = DAT_00d1da70 ^ 0xf0d79c7579b9527;
    DAT_00d1da78 = DAT_00d1da78 ^ 0x579b9527;
    DAT_00d1da7c = DAT_00d1da7c ^ 0x79c7;
  }
  FUN_008ac76c(param_1,&LAB_00833b08,&DAT_00d1da70,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b08;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1da70);
  if (((DAT_00d1da98 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1da98), iVar8 != 0)) {
    DAT_00d1da96 = '\x01';
    DAT_00d1da88 = 0xca39c0b6c1f61acf;
    DAT_00d1da90 = 0xc1f00bcd;
    _DAT_00d1da94 = 0xafb1;
    __cxa_atexit(&LAB_00836560,&DAT_00d1da88,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1da98);
  }
  if (DAT_00d1da96 == '\x01') {
    DAT_00d1da96 = '\0';
    DAT_00d1da88 = DAT_00d1da88 ^ 0xaf55afc5af9979bd;
    DAT_00d1da90 = DAT_00d1da90 ^ 0xaf9979bd;
    _DAT_00d1da94 = _DAT_00d1da94 ^ 0xafc5;
  }
  FUN_008ac76c(param_1,&LAB_00833b10,&DAT_00d1da88,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b10;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1da88);
  uStack_40 = 7;
  uStack_48 = 0x108561ce74;
  uStack_43 = 0x178b;
  uStack_41 = 0xae;
  local_50 = (undefined1 *)0xae17900a9f7ac875;
  if (((DAT_00d1dab8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dab8), iVar8 != 0)) {
                    /* try { // try from 00832d50 to 00832d5f has its CatchHandler @ 00833ab4 */
    FUN_0083656c(&DAT_00d1daa0,&local_50);
    __cxa_atexit(&LAB_00836600,&DAT_00d1daa0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dab8);
  }
  FUN_008377dc(&DAT_00d1daa0);
  FUN_008ac76c(param_1,&LAB_00833b18,&DAT_00d1daa0,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b18;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1daa0);
  if (((DAT_00d1dad0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dad0), iVar8 != 0)) {
    DAT_00d1dac0 = 0x74e94c2e406f6f8;
    _DAT_00d1dac8 = 0x175ebfa;
    __cxa_atexit(&LAB_0083660c,&DAT_00d1dac0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dad0);
  }
  if (DAT_00d1dacb == '\x01') {
    DAT_00d1dac0 = DAT_00d1dac0 ^ 0x652bf3a397759395;
    _DAT_00d1dac8 = _DAT_00d1dac8 & 0xffffff ^ 0x759395;
  }
  FUN_008ac76c(param_1,&LAB_00833b20,&DAT_00d1dac0,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b20;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dac0);
  if (((DAT_00d1dae8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dae8), iVar8 != 0)) {
    DAT_00d1dad8 = 0xfca5dc1057ce5ae3;
    DAT_00d1dae0 = 0x56c757f8;
    _DAT_00d1dae4 = 0x163;
    __cxa_atexit(&LAB_00836618,&DAT_00d1dad8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dae8);
  }
  if (DAT_00d1dae5 == '\x01') {
    _DAT_00d1dae4 = (ushort)(DAT_00d1dae4 ^ 99);
    DAT_00d1dad8 = DAT_00d1dad8 ^ 0x99c9b36339a13991;
    DAT_00d1dae0 = DAT_00d1dae0 ^ 0x39a13991;
  }
  FUN_008ac76c(param_1,&LAB_00833b28,&DAT_00d1dad8,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b28;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dad8);
  if (((DAT_00d1db00 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1db00), iVar8 != 0)) {
    DAT_00d1daf0 = 0x7c6dce9861101615;
    DAT_00d1daf8 = 0x610d1410;
    _DAT_00d1dafc = 0x1eb;
    __cxa_atexit(&LAB_00836624,&DAT_00d1daf0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1db00);
  }
  if (DAT_00d1dafd == '\x01') {
    _DAT_00d1dafc = (ushort)(DAT_00d1dafc ^ 0xeb);
    DAT_00d1daf0 = DAT_00d1daf0 ^ 0x1901a1eb0f7f7567;
    DAT_00d1daf8 = DAT_00d1daf8 ^ 0xf7f7567;
  }
  FUN_008ac76c(param_1,&LAB_00833b30,&DAT_00d1daf0,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b30;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1daf0);
  if (((DAT_00d1db18 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1db18), iVar8 != 0)) {
    DAT_00d1db14 = '\x01';
    DAT_00d1db08 = 0xae11e4ba6be038d1;
    DAT_00d1db10 = 0x5fd29c6;
    __cxa_atexit(&LAB_00836630,&DAT_00d1db08,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1db18);
  }
  if (DAT_00d1db14 == '\x01') {
    DAT_00d1db14 = '\0';
    DAT_00d1db08 = DAT_00d1db08 ^ 0xcb7d8bc9058f5ba3;
    DAT_00d1db10 = DAT_00d1db10 ^ 0x58f5ba3;
  }
  FUN_008ac76c(param_1,&LAB_00833b38,&DAT_00d1db08,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b38;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1db08);
  if (((DAT_00d1db30 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1db30), iVar8 != 0)) {
    DAT_00d1db20 = 0xe037c46837f27a87;
    DAT_00d1db28 = 0x3cf9709d;
    _DAT_00d1db2c = 0x11b;
    __cxa_atexit(&LAB_0083663c,&DAT_00d1db20,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1db30);
  }
  if (DAT_00d1db2d == '\x01') {
    _DAT_00d1db2c = (ushort)(DAT_00d1db2c ^ 0x1b);
    DAT_00d1db20 = DAT_00d1db20 ^ 0x855bab1b599d19f5;
    DAT_00d1db28 = DAT_00d1db28 ^ 0x599d19f5;
  }
  FUN_008ac76c(param_1,&LAB_00833b40,&DAT_00d1db20,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b40;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1db20);
  if (((DAT_00d1db48 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1db48), iVar8 != 0)) {
    DAT_00d1db38 = 0xcaa5dc5cdd9240d5;
    DAT_00d1db40 = 0xc4924bd4;
    _DAT_00d1db44 = 0x12f;
    __cxa_atexit(&LAB_00836648,&DAT_00d1db38,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1db48);
  }
  if (DAT_00d1db45 == '\x01') {
    _DAT_00d1db44 = (ushort)(DAT_00d1db44 ^ 0x2f);
    DAT_00d1db38 = DAT_00d1db38 ^ 0xafc9b32fb3fd23a7;
    DAT_00d1db40 = DAT_00d1db40 ^ 0xb3fd23a7;
  }
  FUN_008ac76c(param_1,&LAB_00833b48,&DAT_00d1db38,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b48;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1db38);
  if (((DAT_00d1db60 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1db60), iVar8 != 0)) {
    _DAT_00d1db58 = 0x1af625cb334c683;
    DAT_00d1db50 = 0xe6c36c55b130df88;
    __cxa_atexit(&LAB_00836654,&DAT_00d1db50,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1db60);
  }
  uVar4 = _DAT_00d1db58;
  if (DAT_00d1db5f == '\x01') {
    uVar3 = _DAT_00d1db58 >> 0x30;
    DAT_00d1db50 = DAT_00d1db50 ^ 0x83af0533df55afe7;
    _DAT_00d1db58 = (uint5)(DAT_00d1db5c ^ 0x33) << 0x20;
    _DAT_00d1db58 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1db5d,_DAT_00d1db58)) >> 0x20),
                         (int)uVar4) ^ 0xaf0500df55afe7;
  }
  FUN_008ac76c(param_1,&LAB_00833b50,&DAT_00d1db50,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b50;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1db50);
  uStack_48 = 0x8fae88c9d8;
  uStack_43 = 0x84ac;
  uStack_41 = 0x87;
  local_50 = (undefined1 *)0xe28faa85a184ddc4;
  if (((DAT_00d1db88 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1db88), iVar8 != 0)) {
                    /* try { // try from 00832fe8 to 00832ff7 has its CatchHandler @ 00833aa4 */
    FUN_00836660(&DAT_00d1db70,&local_50);
    __cxa_atexit(&LAB_008366ec,&DAT_00d1db70,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1db88);
  }
  if (DAT_00d1db80 == '\x01') {
    DAT_00d1db80 = '\0';
    _DAT_00d1db70 = _DAT_00d1db70 ^ 0x87e3c3e3cfe1adab;
    uRam0000000000d1db78 = uRam0000000000d1db78 ^ 0x87e3c3e3cfe1adab;
  }
  FUN_008ac76c(param_1,&LAB_00833b58,&DAT_00d1db70,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b58;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1db70);
  uStack_40 = 0x23;
  uStack_48 = 0xb6809b9746;
  uStack_43 = 0x86c9;
  uStack_41 = 0x1e;
  local_50 = (undefined1 *)0x1d85cab1879a954c;
  if (((DAT_00d1dba8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dba8), iVar8 != 0)) {
                    /* try { // try from 00833034 to 00833043 has its CatchHandler @ 00833a94 */
    FUN_008366f4(&DAT_00d1db90,&local_50);
    __cxa_atexit(&LAB_00836788,&DAT_00d1db90,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dba8);
  }
  FUN_00837810(&DAT_00d1db90);
  FUN_008ac76c(param_1,&LAB_00833b60,&DAT_00d1db90,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b60;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1db90);
  if (((DAT_00d1dbc0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dbc0), iVar8 != 0)) {
    _DAT_00d1dbb8 = 0x193d838a758543b;
    DAT_00d1dbb0 = 0xaeffd631ae4f5c2c;
    __cxa_atexit(&LAB_00836794,&DAT_00d1dbb0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dbc0);
  }
  uVar4 = _DAT_00d1dbb8;
  if (DAT_00d1dbbf == '\x01') {
    bVar7 = DAT_00d1dbbc;
    _DAT_00d1dbb8 = _DAT_00d1dbb8 & 0xffffffffffffff;
    uVar3 = _DAT_00d1dbb8;
    _DAT_00d1dbb8 = (uint5)(bVar7 ^ 0x57) << 0x20;
    DAT_00d1dbbd = SUB81(uVar3,5);
    DAT_00d1dbb0 = DAT_00d1dbb0 ^ 0xcb93bf57cb393d5f;
    _DAT_00d1dbb8 =
         (ulong)CONCAT34((int3)(CONCAT16(DAT_00d1dbbe,CONCAT15(DAT_00d1dbbd,_DAT_00d1dbb8)) >> 0x20)
                         ,(int)uVar4) ^ 0x93bf00cb393d5f;
  }
  FUN_008ac76c(param_1,&LAB_00833b68,&DAT_00d1dbb0,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b68;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dbb0);
  uStack_40 = 0xbb;
  uStack_48 = 0x960c4877de;
  uStack_43 = 0xf88f;
  uStack_41 = 0xed;
  local_50 = (undefined1 *)0xe6f1929701486bd2;
  if (((DAT_00d1dbe0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dbe0), iVar8 != 0)) {
                    /* try { // try from 008330c4 to 008330d3 has its CatchHandler @ 00833a84 */
    FUN_008367a0(&DAT_00d1dbc8,&local_50);
    __cxa_atexit(&LAB_00836834,&DAT_00d1dbc8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dbe0);
  }
  FUN_00837848(&DAT_00d1dbc8);
  FUN_008ac76c(param_1,&LAB_00833b70,&DAT_00d1dbc8,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833b70;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dbc8);
  if (((DAT_00d1dbf8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dbf8), iVar8 != 0)) {
    DAT_00d1dbf4 = '\x01';
    DAT_00d1dbe8 = 0x91ee1a593b91e256;
    DAT_00d1dbf0 = 0x5986e756;
    __cxa_atexit(&LAB_00836840,&DAT_00d1dbe8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dbf8);
  }
  if (DAT_00d1dbf4 == '\x01') {
    DAT_00d1dbf4 = '\0';
    DAT_00d1dbe8 = DAT_00d1dbe8 ^ 0xe58d7b2159e3913f;
    DAT_00d1dbf0 = DAT_00d1dbf0 ^ 0x59e3913f;
  }
  FUN_008ac76c(param_1,&LAB_00833bac,&DAT_00d1dbe8,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833bac;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dbe8);
  if (((DAT_00d1dc30 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dc30), iVar8 != 0)) {
    _DAT_00d1dc28 = 0x13fbc187d8fd0e4;
    __cxa_atexit(&LAB_00836860,&DAT_00d1dc28,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dc30);
  }
  uVar4 = _DAT_00d1dc28;
  if (DAT_00d1dc2f == '\x01') {
    uVar3 = _DAT_00d1dc28 >> 0x30;
    _DAT_00d1dc28 = (uint5)(DAT_00d1dc2c ^ 0x6d) << 0x20;
    _DAT_00d1dc28 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1dc2d,_DAT_00d1dc28)) >> 0x20),
                         (int)uVar4) ^ 0x3fd50015fbb583;
  }
  FUN_008ac76c(param_1,&LAB_00833bc8,&DAT_00d1dc28,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833bc8;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dc28);
  if (((DAT_00d1dc78 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dc78), iVar8 != 0)) {
    DAT_00d1dc68 = 0xfa63eee4ef308339;
    _DAT_00d1dc70 = 0x15f983c;
    __cxa_atexit(&LAB_00836cf4,&DAT_00d1dc68,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dc78);
  }
  if (DAT_00d1dc73 == '\x01') {
    DAT_00d1dc68 = DAT_00d1dc68 ^ 0x9d178d819b5ff149;
    uVar2 = (uint3)_DAT_00d1dc70;
    _DAT_00d1dc70 = (uint)(uVar2 ^ 0x5ff149);
  }
  FUN_008ac76c(param_1,&LAB_00833d74,&DAT_00d1dc68,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00833d74;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dc68);
  if (((DAT_00d1dca0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dca0), iVar8 != 0)) {
    DAT_00d1dc90 = 0xc2a5184297737f6;
    DAT_00d1dc98 = 0x32723ef7;
    _DAT_00d1dc9c = 0x1eb;
    __cxa_atexit(&LAB_00836d0c,&DAT_00d1dc90,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dca0);
  }
  if (DAT_00d1dc9d == '\x01') {
    _DAT_00d1dc9c = (ushort)(DAT_00d1dc9c ^ 0xeb);
    DAT_00d1dc90 = DAT_00d1dc90 ^ 0x6f4f25eb5b075983;
    DAT_00d1dc98 = DAT_00d1dc98 ^ 0x5b075983;
  }
  FUN_008ac76c(param_1,&LAB_008340e0,&DAT_00d1dc90,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008340e0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dc90);
  if (((DAT_00d1dcb8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dcb8), iVar8 != 0)) {
    DAT_00d1dca8 = 0x9351d62d26f54c10;
    DAT_00d1dcb0 = 0x21f3480c;
    _DAT_00d1dcb4 = 0x141;
    __cxa_atexit(&LAB_00836d18,&DAT_00d1dca8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dcb8);
  }
  if (DAT_00d1dcb5 == '\x01') {
    _DAT_00d1dcb4 = (ushort)(DAT_00d1dcb4 ^ 0x41);
    DAT_00d1dca8 = DAT_00d1dca8 ^ 0xf121bf4145812963;
    DAT_00d1dcb0 = DAT_00d1dcb0 ^ 0x45812963;
  }
  FUN_008ac76c(param_1,&LAB_008342f0,&DAT_00d1dca8,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008342f0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dca8);
  if (((DAT_00d1dcd0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dcd0), iVar8 != 0)) {
    DAT_00d1dcc0 = 0xe319a0e36829a090;
    DAT_00d1dcc8 = 0x6f2fa498;
    _DAT_00d1dccc = 399;
    __cxa_atexit(&LAB_00836d24,&DAT_00d1dcc0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dcd0);
  }
  if (DAT_00d1dccd == '\x01') {
    _DAT_00d1dccc = (ushort)(DAT_00d1dccc ^ 0x8f);
    DAT_00d1dcc0 = DAT_00d1dcc0 ^ 0x8169c98f0b5dc5f7;
    DAT_00d1dcc8 = DAT_00d1dcc8 ^ 0xb5dc5f7;
  }
  FUN_008ac76c(param_1,&LAB_0083442c,&DAT_00d1dcc0,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_0083442c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dcc0);
  if (((DAT_00d1dce8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dce8), iVar8 != 0)) {
    DAT_00d1dce0 = '\x01';
    DAT_00d1dcd8 = 0x6f07da58af41c6fc;
    __cxa_atexit(&LAB_00836d30,&DAT_00d1dcd8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dce8);
  }
  if (DAT_00d1dce0 == '\x01') {
    DAT_00d1dce0 = '\0';
    DAT_00d1dcd8 = DAT_00d1dcd8 ^ 0x6f63b32fc735a39b;
  }
  FUN_008ac76c(param_1,&LAB_008344ec,&DAT_00d1dcd8,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008344ec;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dcd8);
  if (((DAT_00d1dd30 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dd30), iVar8 != 0)) {
    _DAT_00d1dd28 = 0x1c7;
    DAT_00d1dd20 = 0xb6b8392dbb81f2a0;
    __cxa_atexit(&LAB_00836e54,&DAT_00d1dd20,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dd30);
  }
  if (DAT_00d1dd29 == '\x01') {
    DAT_00d1dd20 = DAT_00d1dd20 ^ 0xd1d9554bddf597c7;
    _DAT_00d1dd28 = (ushort)(DAT_00d1dd28 ^ 199);
  }
  FUN_008ac76c(param_1,&LAB_008345ac,&DAT_00d1dd20,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008345ac;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dd20);
  if (((DAT_00d1dd78 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dd78), iVar8 != 0)) {
    _DAT_00d1dd70 = 0x1a9;
    DAT_00d1dd68 = 0xb4e0ddd91bedd4da;
    __cxa_atexit(&LAB_00836f80,&DAT_00d1dd68,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dd78);
  }
  if (DAT_00d1dd71 == '\x01') {
    DAT_00d1dd68 = DAT_00d1dd68 ^ 0xd381b1bf7d99b1a9;
    _DAT_00d1dd70 = (ushort)(DAT_00d1dd70 ^ 0xa9);
  }
  FUN_008ac76c(param_1,&LAB_008348c8,&DAT_00d1dd68,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008348c8;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1dd68);
  if (((DAT_00d1dde0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dde0), iVar8 != 0)) {
    DAT_00d1ddda = '\x01';
    DAT_00d1ddd0 = 0xac2a341d3fbfde0c;
    _DAT_00d1ddd8 = 0xbb1b;
    __cxa_atexit(&LAB_0083717c,&DAT_00d1ddd0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dde0);
  }
  if (DAT_00d1ddda == '\x01') {
    DAT_00d1ddda = '\0';
    DAT_00d1ddd0 = DAT_00d1ddd0 ^ 0xcd49476d59cbbb6b;
    _DAT_00d1ddd8 = _DAT_00d1ddd8 ^ 0xbb6b;
  }
  FUN_008ac76c(param_1,&LAB_00834cdc,&DAT_00d1ddd0,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00834cdc;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1ddd0);
  if (((DAT_00d1de50 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1de50), iVar8 != 0)) {
    DAT_00d1de4a = '\x01';
    DAT_00d1de40 = 0xda8a7ea9af917cfe;
    _DAT_00d1de48 = 0x19fd;
    __cxa_atexit(&LAB_00837378,&DAT_00d1de40,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1de50);
  }
  if (DAT_00d1de4a == '\x01') {
    DAT_00d1de4a = '\0';
    DAT_00d1de40 = DAT_00d1de40 ^ 0xbbe90dd9c9e5198d;
    _DAT_00d1de48 = _DAT_00d1de48 ^ 0x198d;
  }
  FUN_008ac76c(param_1,&LAB_008350d8,&DAT_00d1de40,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008350d8;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1de40);
  uStack_40 = 0xcd;
  uStack_3f = 0x9b;
  uStack_48 = 0x8a2584efe6;
  uStack_43 = 0xb215;
  uStack_41 = 0xfb;
  local_50 = (undefined1 *)0xe7b23a8a3c84eec8;
  if (((DAT_00d1de70 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1de70), iVar8 != 0)) {
                    /* try { // try from 00833490 to 0083349f has its CatchHandler @ 00833a74 */
    FUN_00837384(&DAT_00d1de58,&local_50);
    __cxa_atexit(&LAB_00837420,&DAT_00d1de58,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1de70);
  }
  FUN_0083787c(&DAT_00d1de58);
  FUN_008ac76c(param_1,&LAB_00835578,&DAT_00d1de58,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_00835578;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1de58);
  uStack_48 = 0x1b29bbaff;
  local_50 = (undefined1 *)0x1853fe01bc8eb3f0;
  uStack_43 = 0x78d5;
  uStack_41 = 0xc;
  uStack_40 = 0xe6;
  uStack_3f = 0xba;
  uStack_3e = 0x9e;
  uStack_3d = 0x73b8;
  if (((DAT_00d1de90 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1de90), iVar8 != 0)) {
                    /* try { // try from 008334dc to 008334eb has its CatchHandler @ 00833a64 */
    FUN_0083742c(&DAT_00d1de78,&local_50);
    __cxa_atexit(&LAB_008374e0,&DAT_00d1de78,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1de90);
  }
  FUN_008378c4(&DAT_00d1de78);
  FUN_008ac76c(param_1,&LAB_008356bc,&DAT_00d1de78,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008356bc;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1de78);
  if (((DAT_00d1dea8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dea8), iVar8 != 0)) {
    DAT_00d1de98 = 0xeed2f91c4e17e89e;
    DAT_00d1dea0 = 0x4f18e291;
    DAT_00d1dea4 = 0x173;
    __cxa_atexit(&LAB_008374ec,&DAT_00d1de98,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dea8);
  }
  FUN_008356dc(param_1,&LAB_00833af0,&DAT_00d1de98);
  if (((DAT_00d1dec0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dec0), iVar8 != 0)) {
    DAT_00d1debe = 1;
    DAT_00d1deb0 = 0x8f825a8c01fd0fa;
    DAT_00d1deb8 = 0xc710daeb;
    DAT_00d1debc = 0x49a2;
    __cxa_atexit(&LAB_008374f8,&DAT_00d1deb0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dec0);
  }
  FUN_008357e8(param_1,&LAB_00833af8,&DAT_00d1deb0);
  if (((DAT_00d1dee0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dee0), iVar8 != 0)) {
    uRam0000000000d1ded8 = 0x137b2fa8d1730f0;
    _DAT_00d1ded0 = 0x4552a7fa8c0d2cf6;
    __cxa_atexit(&LAB_00837504,&DAT_00d1ded0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dee0);
  }
  FUN_00835900(param_1,&LAB_00833b00,&DAT_00d1ded0);
  if (((DAT_00d1def8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1def8), iVar8 != 0)) {
    DAT_00d1dee8 = 0x8cfa83263823d0c2;
    DAT_00d1def0 = 0x3f38cfcf;
    DAT_00d1def4 = 0x149;
    __cxa_atexit(&LAB_00837510,&DAT_00d1dee8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1def8);
  }
  FUN_00835a2c(param_1,&LAB_00833b08,&DAT_00d1dee8);
  if (((DAT_00d1df10 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1df10), iVar8 != 0)) {
    DAT_00d1df00 = 0xdf86a35c0c4d1282;
    DAT_00d1df08 = 0xb4d1493;
    DAT_00d1df0c = 0x133;
    __cxa_atexit(&LAB_0083751c,&DAT_00d1df00,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1df10);
  }
  FUN_00835b38(param_1,&LAB_00833b10,&DAT_00d1df00);
  uStack_48 = 0xebda33596c;
  uStack_43 = 0x862d;
  uStack_41 = 0x37;
  local_50 = (undefined1 *)0x44862df0c029426a;
  if (((DAT_00d1df30 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1df30), iVar8 != 0)) {
                    /* try { // try from 008336e8 to 008336f7 has its CatchHandler @ 00833a54 */
    FUN_00837528(&DAT_00d1df18,&local_50);
    __cxa_atexit(&LAB_008375b4,&DAT_00d1df18,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1df30);
  }
  if (((DAT_00d1df48 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1df48), iVar8 != 0)) {
    DAT_00d1df38 = 0x528f2eecdd284e7b;
    DAT_00d1df40 = 0xd62a4c67;
    DAT_00d1df44 = 0x19f;
    __cxa_atexit(&LAB_008375bc,&DAT_00d1df38,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1df48);
  }
  FUN_00835c40(param_1,&LAB_00833b18,&DAT_00d1df18,&DAT_00d1df38);
  uStack_48 = 0x96b36dd41d;
  uStack_43 = 0x463a;
  uStack_41 = 0xb7;
  local_50 = (undefined1 *)0xc240328fb86bde0e;
  if (((DAT_00d1df68 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1df68), iVar8 != 0)) {
                    /* try { // try from 00833790 to 0083379f has its CatchHandler @ 00833a44 */
    FUN_008375c8(&DAT_00d1df50,&local_50);
    __cxa_atexit(&LAB_00837654,&DAT_00d1df50,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1df68);
  }
  FUN_00835de8(param_1,&LAB_00833b70,&DAT_00d1df50);
  if (((DAT_00d1df80 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1df80), iVar8 != 0)) {
    DAT_00d1df70 = 0x1e40ae28f6d8d4b8;
    DAT_00d1df78 = 0xf2c9cea5;
    DAT_00d1df7c = 0x145;
    __cxa_atexit(&LAB_0083765c,&DAT_00d1df70,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1df80);
  }
  if (((DAT_00d1dfa0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dfa0), iVar8 != 0)) {
    uRam0000000000d1df98 = 0x121ae33fecbc4b0;
    _DAT_00d1df90 = 0xa4eaf2bfec8d4b8;
    __cxa_atexit(&LAB_00837668,&DAT_00d1df90,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dfa0);
  }
  FUN_00835ec8(param_1,&LAB_00833bac,&DAT_00d1df70,&DAT_00d1df90);
  if (((DAT_00d1dfb8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dfb8), iVar8 != 0)) {
    DAT_00d1dfb4 = 1;
    DAT_00d1dfa8 = 0x6e91c106615e5c49;
    DAT_00d1dfb0 = 0xd59415c;
    __cxa_atexit(&LAB_00837674,&DAT_00d1dfa8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dfb8);
  }
  FUN_008360b8(param_1,&LAB_008342f0,&DAT_00d1dfa8);
  if (((DAT_00d1dfd0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dfd0), iVar8 != 0)) {
    DAT_00d1dfcc = 1;
    DAT_00d1dfc0 = 0x8e356ce999cbb41;
    DAT_00d1dfc8 = 0xed9abc56;
    __cxa_atexit(&LAB_00837680,&DAT_00d1dfc0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dfd0);
  }
  FUN_008361b4(param_1,&LAB_00833d74,&DAT_00d1dfc0);
  if (((DAT_00d1dfe8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1dfe8), iVar8 != 0)) {
    DAT_00d1dfe6 = 1;
    DAT_00d1dfd8 = 0x7810c97e6bd37128;
    DAT_00d1dfe0 = 0x6cc44029;
    DAT_00d1dfe4 = 0xbd78;
    __cxa_atexit(&LAB_0083768c,&DAT_00d1dfd8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1dfe8);
  }
  FUN_008362b0(param_1,&LAB_008340e0,&DAT_00d1dfd8);
  uStack_48 = 0x242f6a7d3e;
  uStack_43 = 0x7da1;
  uStack_41 = 0x45;
  local_50 = (undefined1 *)0x3167bc2e2a6a642a;
  if (((DAT_00d1e008 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1e008), iVar8 != 0)) {
                    /* try { // try from 0083399c to 008339ab has its CatchHandler @ 00833a34 */
    FUN_00837698(&DAT_00d1dff0,&local_50);
    __cxa_atexit(&LAB_00837724,&DAT_00d1dff0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e008);
  }
  FUN_008363c8(param_1,&LAB_00835578,&DAT_00d1dff0);
  uStack_48 = 0x3bcb2c7b7c;
  uStack_43 = 0x8402;
  local_50 = (undefined1 *)0xa394073dd826677a;
  uStack_41 = 0xaa;
  uStack_40 = 0x6c;
  uStack_3f = 0x6e;
  uStack_3e = 0x43;
  if (((DAT_00d1e028 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1e028), iVar8 != 0)) {
                    /* try { // try from 008339e8 to 008339f7 has its CatchHandler @ 00833a24 */
    FUN_0083772c(&DAT_00d1e010,&local_50);
    __cxa_atexit(&LAB_008377d0,&DAT_00d1e010,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e028);
  }
  FUN_00837918(&DAT_00d1e010);
  FUN_008ac76c(param_1,&LAB_008356bc,&DAT_00d1e010,0,0);
  puVar9 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar9;
  FUN_00807f14(&DAT_00d1d9c0,&local_50,&local_50);
  local_50 = &LAB_008356bc;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1e010);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

