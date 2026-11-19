/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c038bc
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00c038bc(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (((DAT_00d27b38 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27b38), iVar1 != 0)) {
    __cxa_atexit(&LAB_00c0b984,0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d27b38);
  }
  FUN_00bc5e50(&DAT_00d278f8,L"January",7);
  FUN_00bc5e50(&DAT_00d27910,L"February",8);
  FUN_00bc5e50(&DAT_00d27928,L"March",5);
  FUN_00bc5e50(&DAT_00d27940,L"April",5);
  if ((DAT_00d27958 & 1) == 0) {
    DAT_00d27958 = 6;
    puVar2 = &DAT_00d2795c;
  }
  else {
    ram0x00d27960 = 3;
    puVar2 = ram0x00d27968;
  }
  *puVar2 = 0x610000004d;
  puVar2[1] = 0x79;
  if ((DAT_00d27970 & 1) == 0) {
    DAT_00d27970 = 8;
    puVar2 = (undefined8 *)&DAT_00d27974;
  }
  else {
    DAT_00d27978 = 4;
    puVar2 = DAT_00d27980;
  }
  *(undefined4 *)(puVar2 + 2) = 0;
  puVar2[1] = 0x650000006e;
  *puVar2 = 0x750000004a;
  if ((DAT_00d27988 & 1) == 0) {
    DAT_00d27988 = 8;
    puVar2 = (undefined8 *)&DAT_00d2798c;
  }
  else {
    DAT_00d27990 = 4;
    puVar2 = DAT_00d27998;
  }
  puVar2[1] = 0x790000006c;
  *puVar2 = 0x750000004a;
  *(undefined4 *)(puVar2 + 2) = 0;
  FUN_00bc5e50(&DAT_00d279a0,L"August",6);
  FUN_00bc5e50(&DAT_00d279b8,L"September",9);
  FUN_00bc5e50(&DAT_00d279d0,L"October",7);
  FUN_00bc5e50(&DAT_00d279e8,L"November",8);
  FUN_00bc5e50(&DAT_00d27a00,L"December",8);
  if ((DAT_00d27a18 & 1) == 0) {
    DAT_00d27a18 = 6;
    puVar2 = &DAT_00d27a1c;
  }
  else {
    ram0x00d27a20 = 3;
    puVar2 = ram0x00d27a28;
  }
  *puVar2 = 0x610000004a;
  puVar2[1] = 0x6e;
  if ((DAT_00d27a30 & 1) == 0) {
    DAT_00d27a30 = 6;
    puVar2 = &DAT_00d27a34;
  }
  else {
    ram0x00d27a38 = 3;
    puVar2 = ram0x00d27a40;
  }
  *puVar2 = 0x6500000046;
  puVar2[1] = 0x62;
  if ((DAT_00d27a48 & 1) == 0) {
    DAT_00d27a48 = 6;
    puVar2 = &DAT_00d27a4c;
  }
  else {
    ram0x00d27a50 = 3;
    puVar2 = ram0x00d27a58;
  }
  *puVar2 = 0x610000004d;
  puVar2[1] = 0x72;
  if ((DAT_00d27a60 & 1) == 0) {
    DAT_00d27a60 = 6;
    puVar2 = &DAT_00d27a64;
  }
  else {
    ram0x00d27a68 = 3;
    puVar2 = ram0x00d27a70;
  }
  *puVar2 = 0x7000000041;
  puVar2[1] = 0x72;
  if ((DAT_00d27a78 & 1) == 0) {
    DAT_00d27a78 = 6;
    puVar2 = &DAT_00d27a7c;
  }
  else {
    ram0x00d27a80 = 3;
    puVar2 = ram0x00d27a88;
  }
  *puVar2 = 0x610000004d;
  puVar2[1] = 0x79;
  if ((DAT_00d27a90 & 1) == 0) {
    DAT_00d27a90 = 6;
    puVar2 = &DAT_00d27a94;
  }
  else {
    ram0x00d27a98 = 3;
    puVar2 = ram0x00d27aa0;
  }
  *puVar2 = 0x750000004a;
  puVar2[1] = 0x6e;
  if ((DAT_00d27aa8 & 1) == 0) {
    DAT_00d27aa8 = 6;
    puVar2 = &DAT_00d27aac;
  }
  else {
    ram0x00d27ab0 = 3;
    puVar2 = ram0x00d27ab8;
  }
  *puVar2 = 0x750000004a;
  puVar2[1] = 0x6c;
  if ((DAT_00d27ac0 & 1) == 0) {
    DAT_00d27ac0 = 6;
    puVar2 = &DAT_00d27ac4;
  }
  else {
    ram0x00d27ac8 = 3;
    puVar2 = ram0x00d27ad0;
  }
  *puVar2 = 0x7500000041;
  puVar2[1] = 0x67;
  if ((DAT_00d27ad8 & 1) == 0) {
    DAT_00d27ad8 = 6;
    puVar2 = &DAT_00d27adc;
  }
  else {
    ram0x00d27ae0 = 3;
    puVar2 = ram0x00d27ae8;
  }
  *puVar2 = 0x6500000053;
  puVar2[1] = 0x70;
  if (((byte)DAT_00d27af0 & 1) == 0) {
    DAT_00d27af0._0_1_ = 6;
    puVar2 = (undefined8 *)((long)&DAT_00d27af0 + 4);
  }
  else {
    _DAT_00d27af8 = 3;
    puVar2 = ram0x00d27b00;
  }
  *puVar2 = 0x630000004f;
  puVar2[1] = 0x74;
  if (((byte)DAT_00d27b08 & 1) == 0) {
    DAT_00d27b08._0_1_ = 6;
    puVar2 = (undefined8 *)((long)&DAT_00d27b08 + 4);
  }
  else {
    _DAT_00d27b10 = 3;
    puVar2 = ram0x00d27b18;
  }
  *puVar2 = 0x6f0000004e;
  puVar2[1] = 0x76;
  if (((byte)DAT_00d27b20 & 1) == 0) {
    DAT_00d27b20._0_1_ = 6;
    puVar2 = (undefined8 *)((long)&DAT_00d27b20 + 4);
  }
  else {
    _DAT_00d27b28 = 3;
    puVar2 = ram0x00d27b30;
  }
  *puVar2 = 0x6500000044;
  puVar2[1] = 99;
  return;
}

