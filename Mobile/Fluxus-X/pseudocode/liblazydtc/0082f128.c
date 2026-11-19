/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082f128
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0082f128(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  int iVar6;
  undefined8 *puVar7;
  code *local_50;
  undefined8 uStack_48;
  undefined2 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uStack_48 = 0x9b96b5e18edfb693;
  local_50 = (code *)0xfe9eaee29ddfb280;
  if (((DAT_00d1d7d8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d7d8), iVar6 != 0)) {
                    /* try { // try from 0082f93c to 0082f94b has its CatchHandler @ 0082fd40 */
    FUN_00830850(&DAT_00d1d7c0,&local_50);
    __cxa_atexit(&LAB_008308dc,&DAT_00d1d7c0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d7d8);
  }
  if (DAT_00d1d7d0 == '\x01') {
    DAT_00d1d7d0 = '\0';
    _DAT_00d1d7c0 = _DAT_00d1d7c0 ^ 0x9bf3d983efabd7e7;
    uRam0000000000d1d7c8 = uRam0000000000d1d7c8 ^ 0x9bf3d983efabd7e7;
  }
  FUN_008ac76c(param_1,FUN_0082fd6c,&DAT_00d1d7c0,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = FUN_0082fd6c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d7c0);
  uStack_48 = 0x308333b60031077;
  local_50 = (code *)0x6600283873031470;
  if (((DAT_00d1d848 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d848), iVar6 != 0)) {
                    /* try { // try from 0082f988 to 0082f997 has its CatchHandler @ 0082fd30 */
    FUN_00830bc0(&DAT_00d1d830,&local_50);
    __cxa_atexit(&LAB_00830c4c,&DAT_00d1d830,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d848);
  }
  if (DAT_00d1d840 == '\x01') {
    DAT_00d1d840 = '\0';
    _DAT_00d1d830 = _DAT_00d1d830 ^ 0x36d5f5901777103;
    uRam0000000000d1d838 = uRam0000000000d1d838 ^ 0x36d5f5901777103;
  }
  FUN_008ac76c(param_1,FUN_0082fdac,&DAT_00d1d830,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = FUN_0082fdac;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d830);
  if (((DAT_00d1d860 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d860), iVar6 != 0)) {
    DAT_00d1d85c = '\x01';
    DAT_00d1d850 = 0x9c2df4bcb759f88e;
    DAT_00d1d858 = 0xc554f193;
    __cxa_atexit(&LAB_00830c54,&DAT_00d1d850,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d860);
  }
  if (DAT_00d1d85c == '\x01') {
    DAT_00d1d85c = '\0';
    DAT_00d1d850 = DAT_00d1d850 ^ 0xf34995d9c52d9dfd;
    DAT_00d1d858 = DAT_00d1d858 ^ 0xc52d9dfd;
  }
  FUN_008ac76c(param_1,FUN_0082ff90,&DAT_00d1d850,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = FUN_0082ff90;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d850);
  if (((DAT_00d1d878 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d878), iVar6 != 0)) {
    DAT_00d1d868 = 0x65b469ae94ed8c36;
    _DAT_00d1d870 = 0x19f8633;
    __cxa_atexit(&LAB_00830c60,&DAT_00d1d868,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d878);
  }
  if (DAT_00d1d873 == '\x01') {
    DAT_00d1d868 = DAT_00d1d868 ^ 0xbdb0dcff19fff5f;
    uVar2 = CONCAT12(DAT_00d1d872,CONCAT11(~DAT_00d1d871,DAT_00d1d870));
    _DAT_00d1d870 = (uint)(uVar2 ^ 0x9f005f);
  }
  FUN_008ac76c(param_1,&LAB_0082ffdc,&DAT_00d1d868,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = (code *)&LAB_0082ffdc;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d868);
  if (((DAT_00d1d890 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d890), iVar6 != 0)) {
    DAT_00d1d88e = '\x01';
    DAT_00d1d880 = 0x29ee310278aeae2c;
    DAT_00d1d888 = 0x71a7ae24;
    _DAT_00d1d88c = 0x4310;
    __cxa_atexit(&LAB_00830c6c,&DAT_00d1d880,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d890);
  }
  if (DAT_00d1d88e == '\x01') {
    DAT_00d1d88e = '\0';
    DAT_00d1d880 = DAT_00d1d880 ^ 0x5d8743751dc5cf41;
    DAT_00d1d888 = DAT_00d1d888 ^ 0x1dc5cf41;
    _DAT_00d1d88c = _DAT_00d1d88c ^ 0x4375;
  }
  FUN_008ac76c(param_1,&LAB_00830020,&DAT_00d1d880,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = (code *)&LAB_00830020;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d880);
  if (((DAT_00d1d8a8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d8a8), iVar6 != 0)) {
    DAT_00d1d898 = 0x37703c016a963c8e;
    DAT_00d1d8a0 = 0x7691338c;
    _DAT_00d1d8a4 = 0x173;
    __cxa_atexit(&LAB_00830c78,&DAT_00d1d898,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d8a8);
  }
  if (DAT_00d1d8a5 == '\x01') {
    _DAT_00d1d8a4 = (ushort)(DAT_00d1d8a4 ^ 0x73);
    DAT_00d1d898 = DAT_00d1d898 ^ 0x531159730ffd5de3;
    DAT_00d1d8a0 = DAT_00d1d8a0 ^ 0xffd5de3;
  }
  FUN_008ac76c(param_1,&LAB_00830040,&DAT_00d1d898,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = (code *)&LAB_00830040;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d898);
  local_40 = 0x83db;
  uStack_48 = 0xd01913a2fe21efde;
  local_50 = (code *)0xdc140aa6fd39e6d8;
  if (((DAT_00d1d8c8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d8c8), iVar6 != 0)) {
                    /* try { // try from 0082fb84 to 0082fb93 has its CatchHandler @ 0082fd20 */
    FUN_00830c84(&DAT_00d1d8b0,&local_50);
    __cxa_atexit(&LAB_00830d20,&DAT_00d1d8b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d8c8);
  }
  FUN_00830e2c(&DAT_00d1d8b0);
  FUN_008ac76c(param_1,&LAB_00830060,&DAT_00d1d8b0,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = (code *)&LAB_00830060;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d8b0);
  local_40 = 0x3bdf;
  uStack_48 = 0xac17de864ad57da;
  local_50 = (code *)0x6cc64ec67b55ec8;
  if (((DAT_00d1d8e8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d8e8), iVar6 != 0)) {
                    /* try { // try from 0082fbd0 to 0082fbdf has its CatchHandler @ 0082fd10 */
    FUN_00830d2c(&DAT_00d1d8d0,&local_50);
    __cxa_atexit(&LAB_00830dc8,&DAT_00d1d8d0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d8e8);
  }
  FUN_00830e6c(&DAT_00d1d8d0);
  FUN_008ac76c(param_1,&LAB_00830080,&DAT_00d1d8d0,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = (code *)&LAB_00830080;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d8d0);
  if (((DAT_00d1d980 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d980), iVar6 != 0)) {
    _DAT_00d1d978 = 0x1a7e5ccbb07f8de;
    DAT_00d1d970 = 0x5ed3e4ceb81cf2db;
    __cxa_atexit(&LAB_00830e08,&DAT_00d1d970,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d980);
  }
  uVar3 = _DAT_00d1d978;
  if (DAT_00d1d97f == '\x01') {
    bVar5 = DAT_00d1d97c;
    _DAT_00d1d978 = _DAT_00d1d978 & 0xffffffffffffff;
    uVar4 = _DAT_00d1d978;
    _DAT_00d1d978 = (uint5)(bVar5 ^ 0xa3) << 0x20;
    DAT_00d1d97d = SUB81(uVar4,5);
    DAT_00d1d970 = DAT_00d1d970 ^ 0x3fa781a3d3739db3;
    _DAT_00d1d978 =
         (ulong)CONCAT34((int3)(CONCAT16(DAT_00d1d97e,CONCAT15(DAT_00d1d97d,_DAT_00d1d978)) >> 0x20)
                         ,(int)uVar3) ^ 0xa78100d3739db3;
  }
  FUN_008ac76c(param_1,&LAB_008300c0,&DAT_00d1d970,0,0);
  puVar7 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (code *)*puVar7;
  FUN_00807f14(&DAT_00d1d790,&local_50,&local_50);
  local_50 = (code *)&LAB_008300c0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d970);
  if (((DAT_00d1d9a0 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d9a0), iVar6 != 0)) {
    uRam0000000000d1d998 = 0x15f323f33aae66d;
    _DAT_00d1d990 = 0x4a2d200c34a0e274;
    __cxa_atexit(&LAB_00830e14,&DAT_00d1d990,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d9a0);
  }
  FUN_0083060c(param_1,&LAB_00830020,&DAT_00d1d990);
  if (((DAT_00d1d9b8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d1d9b8), iVar6 != 0)) {
    DAT_00d1d9b6 = 1;
    DAT_00d1d9a8 = 0x908c750cd0e89a6c;
    DAT_00d1d9b0 = 0xd9ed9465;
    DAT_00d1d9b4 = 0x72a;
    __cxa_atexit(&LAB_00830e20,&DAT_00d1d9a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d9b8);
  }
  FUN_00830738(param_1,&LAB_00830040,&DAT_00d1d9a8);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

