/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02e28
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00c02e28(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (((DAT_00d276a8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d276a8), iVar1 != 0)) {
    __cxa_atexit(&LAB_00c0b8d0,0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d276a8);
  }
  FUN_00bc5e50(&DAT_00d27558,L"Sunday",6);
  FUN_00bc5e50(&DAT_00d27570,L"Monday",6);
  FUN_00bc5e50(&DAT_00d27588,L"Tuesday",7);
  FUN_00bc5e50(&DAT_00d275a0,L"Wednesday",9);
  FUN_00bc5e50(&DAT_00d275b8,L"Thursday",8);
  FUN_00bc5e50(&DAT_00d275d0,L"Friday",6);
  FUN_00bc5e50(&DAT_00d275e8,L"Saturday",8);
  if ((DAT_00d27600 & 1) == 0) {
    DAT_00d27600 = 6;
    puVar2 = &DAT_00d27604;
  }
  else {
    ram0x00d27608 = 3;
    puVar2 = ram0x00d27610;
  }
  *puVar2 = 0x7500000053;
  puVar2[1] = 0x6e;
  if ((DAT_00d27618 & 1) == 0) {
    DAT_00d27618 = 6;
    puVar2 = &DAT_00d2761c;
  }
  else {
    ram0x00d27620 = 3;
    puVar2 = ram0x00d27628;
  }
  *puVar2 = 0x6f0000004d;
  puVar2[1] = 0x6e;
  if ((DAT_00d27630 & 1) == 0) {
    DAT_00d27630 = 6;
    puVar2 = &DAT_00d27634;
  }
  else {
    ram0x00d27638 = 3;
    puVar2 = ram0x00d27640;
  }
  *puVar2 = 0x7500000054;
  puVar2[1] = 0x65;
  if ((DAT_00d27648 & 1) == 0) {
    DAT_00d27648 = 6;
    puVar2 = &DAT_00d2764c;
  }
  else {
    ram0x00d27650 = 3;
    puVar2 = ram0x00d27658;
  }
  *puVar2 = 0x6500000057;
  puVar2[1] = 100;
  if (((byte)DAT_00d27660 & 1) == 0) {
    DAT_00d27660._0_1_ = 6;
    puVar2 = (undefined8 *)((long)&DAT_00d27660 + 4);
  }
  else {
    _DAT_00d27668 = 3;
    puVar2 = ram0x00d27670;
  }
  *puVar2 = 0x6800000054;
  puVar2[1] = 0x75;
  if (((byte)DAT_00d27678 & 1) == 0) {
    DAT_00d27678._0_1_ = 6;
    puVar2 = (undefined8 *)((long)&DAT_00d27678 + 4);
  }
  else {
    _DAT_00d27680 = 3;
    puVar2 = ram0x00d27688;
  }
  *puVar2 = 0x7200000046;
  puVar2[1] = 0x69;
  if (((byte)DAT_00d27690 & 1) == 0) {
    DAT_00d27690._0_1_ = 6;
    puVar2 = (undefined8 *)((long)&DAT_00d27690 + 4);
  }
  else {
    _DAT_00d27698 = 3;
    puVar2 = ram0x00d276a0;
  }
  *puVar2 = 0x6100000053;
  puVar2[1] = 0x74;
  return;
}

