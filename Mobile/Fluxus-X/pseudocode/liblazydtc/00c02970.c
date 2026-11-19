/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02970
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00c02970(void)

{
  int iVar1;
  char *pcVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  
  if (((DAT_00d27550 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27550), iVar1 != 0)) {
    __cxa_atexit(&LAB_00c0b878,0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d27550);
  }
  if ((DAT_00d27400 & 1) == 0) {
    DAT_00d27400 = 0xc;
    puVar4 = &DAT_00d27401;
  }
  else {
    DAT_00d27408 = 6;
    puVar4 = DAT_00d27410;
  }
  *(undefined1 *)((long)puVar4 + 6) = 0;
  *(undefined2 *)(puVar4 + 1) = 0x7961;
  *puVar4 = 0x646e7553;
  if ((DAT_00d27418 & 1) == 0) {
    DAT_00d27418 = 0xc;
    puVar4 = &DAT_00d27419;
  }
  else {
    DAT_00d27420 = 6;
    puVar4 = DAT_00d27428;
  }
  *(undefined1 *)((long)puVar4 + 6) = 0;
  *(undefined2 *)(puVar4 + 1) = 0x7961;
  *puVar4 = 0x646e6f4d;
  if ((DAT_00d27430 & 1) == 0) {
    DAT_00d27430 = 0xe;
    puVar4 = &DAT_00d27431;
  }
  else {
    DAT_00d27438 = 7;
    puVar4 = DAT_00d27440;
  }
  *(undefined1 *)((long)puVar4 + 7) = 0;
  *(undefined4 *)((long)puVar4 + 3) = 0x79616473;
  *puVar4 = 0x73657554;
  if ((DAT_00d27448 & 1) == 0) {
    DAT_00d27448 = 0x12;
    pcVar2 = (char *)&DAT_00d27449;
  }
  else {
    ram0x00d27450 = 9;
    pcVar2 = DAT_00d27458;
  }
  builtin_strncpy(pcVar2,"Wednesday",10);
  if ((DAT_00d27460 & 1) == 0) {
    DAT_00d27460 = 0x10;
    puVar3 = &DAT_00d27461;
  }
  else {
    ram0x00d27468 = 8;
    puVar3 = DAT_00d27470;
  }
  *(undefined1 *)(puVar3 + 1) = 0;
  *puVar3 = 0x7961647372756854;
  if ((DAT_00d27478 & 1) == 0) {
    DAT_00d27478 = 0xc;
    puVar4 = &DAT_00d27479;
  }
  else {
    DAT_00d27480 = 6;
    puVar4 = DAT_00d27488;
  }
  *(undefined1 *)((long)puVar4 + 6) = 0;
  *(undefined2 *)(puVar4 + 1) = 0x7961;
  *puVar4 = 0x64697246;
  if ((DAT_00d27490 & 1) == 0) {
    DAT_00d27490 = 0x10;
    puVar3 = &DAT_00d27491;
  }
  else {
    ram0x00d27498 = 8;
    puVar3 = DAT_00d274a0;
  }
  *(undefined1 *)(puVar3 + 1) = 0;
  *puVar3 = 0x7961647275746153;
  if ((DAT_00d274a8 & 1) == 0) {
    DAT_00d274a8 = 6;
    puVar4 = &DAT_00d274a9;
  }
  else {
    DAT_00d274b0 = 3;
    puVar4 = DAT_00d274b8;
  }
  *puVar4 = 0x6e7553;
  if ((DAT_00d274c0 & 1) == 0) {
    DAT_00d274c0 = 6;
    puVar4 = &DAT_00d274c1;
  }
  else {
    DAT_00d274c8 = 3;
    puVar4 = DAT_00d274d0;
  }
  *puVar4 = 0x6e6f4d;
  if ((DAT_00d274d8 & 1) == 0) {
    DAT_00d274d8 = 6;
    puVar4 = &DAT_00d274d9;
  }
  else {
    DAT_00d274e0 = 3;
    puVar4 = DAT_00d274e8;
  }
  *puVar4 = 0x657554;
  if ((DAT_00d274f0 & 1) == 0) {
    DAT_00d274f0 = 6;
    puVar4 = &DAT_00d274f1;
  }
  else {
    DAT_00d274f8 = 3;
    puVar4 = DAT_00d27500;
  }
  *puVar4 = 0x646557;
  if (((byte)DAT_00d27508 & 1) == 0) {
    DAT_00d27508._0_1_ = 6;
    puVar4 = (undefined4 *)((long)&DAT_00d27508 + 1);
  }
  else {
    DAT_00d27510 = 3;
    puVar4 = DAT_00d27518;
  }
  *puVar4 = 0x756854;
  if (((byte)DAT_00d27520 & 1) == 0) {
    DAT_00d27520._0_1_ = 6;
    puVar4 = (undefined4 *)((long)&DAT_00d27520 + 1);
  }
  else {
    DAT_00d27528 = 3;
    puVar4 = DAT_00d27530;
  }
  *puVar4 = 0x697246;
  if (((byte)DAT_00d27538 & 1) == 0) {
    DAT_00d27538._0_1_ = 6;
    puVar4 = (undefined4 *)((long)&DAT_00d27538 + 1);
  }
  else {
    DAT_00d27540 = 3;
    puVar4 = DAT_00d27548;
  }
  *puVar4 = 0x746153;
  return;
}

