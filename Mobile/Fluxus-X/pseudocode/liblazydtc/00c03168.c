/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c03168
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00c03168(void)

{
  int iVar1;
  char *pcVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  
  if (((DAT_00d278f0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d278f0), iVar1 != 0)) {
    __cxa_atexit(&LAB_00c0b92c,0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d278f0);
  }
  if ((DAT_00d276b0 & 1) == 0) {
    DAT_00d276b0 = 0xe;
    puVar4 = &DAT_00d276b1;
  }
  else {
    DAT_00d276b8 = 7;
    puVar4 = DAT_00d276c0;
  }
  *(undefined1 *)((long)puVar4 + 7) = 0;
  *(undefined4 *)((long)puVar4 + 3) = 0x79726175;
  *puVar4 = 0x756e614a;
  if ((DAT_00d276c8 & 1) == 0) {
    DAT_00d276c8 = 0x10;
    puVar3 = &DAT_00d276c9;
  }
  else {
    ram0x00d276d0 = 8;
    puVar3 = DAT_00d276d8;
  }
  *(undefined1 *)(puVar3 + 1) = 0;
  *puVar3 = 0x7972617572626546;
  if ((DAT_00d276e0 & 1) == 0) {
    DAT_00d276e0 = 10;
    puVar4 = &DAT_00d276e1;
  }
  else {
    DAT_00d276e8 = 5;
    puVar4 = DAT_00d276f0;
  }
  *(undefined2 *)(puVar4 + 1) = 0x68;
  *puVar4 = 0x6372614d;
  if ((DAT_00d276f8 & 1) == 0) {
    DAT_00d276f8 = 10;
    puVar4 = &DAT_00d276f9;
  }
  else {
    DAT_00d27700 = 5;
    puVar4 = DAT_00d27708;
  }
  *(undefined2 *)(puVar4 + 1) = 0x6c;
  *puVar4 = 0x69727041;
  if ((DAT_00d27710 & 1) == 0) {
    DAT_00d27710 = 6;
    puVar4 = &DAT_00d27711;
  }
  else {
    DAT_00d27718 = 3;
    puVar4 = DAT_00d27720;
  }
  *puVar4 = 0x79614d;
  if ((DAT_00d27728 & 1) == 0) {
    DAT_00d27728 = 8;
    puVar4 = &DAT_00d27729;
  }
  else {
    DAT_00d27730 = 4;
    puVar4 = DAT_00d27738;
  }
  *(undefined1 *)(puVar4 + 1) = 0;
  *puVar4 = 0x656e754a;
  if ((DAT_00d27740 & 1) == 0) {
    DAT_00d27740 = 8;
    puVar4 = &DAT_00d27741;
  }
  else {
    DAT_00d27748 = 4;
    puVar4 = DAT_00d27750;
  }
  *(undefined1 *)(puVar4 + 1) = 0;
  *puVar4 = 0x796c754a;
  if ((DAT_00d27758 & 1) == 0) {
    DAT_00d27758 = 0xc;
    puVar4 = &DAT_00d27759;
  }
  else {
    DAT_00d27760 = 6;
    puVar4 = DAT_00d27768;
  }
  *(undefined1 *)((long)puVar4 + 6) = 0;
  *(undefined2 *)(puVar4 + 1) = 0x7473;
  *puVar4 = 0x75677541;
  if ((DAT_00d27770 & 1) == 0) {
    DAT_00d27770 = 0x12;
    pcVar2 = (char *)&DAT_00d27771;
  }
  else {
    ram0x00d27778 = 9;
    pcVar2 = DAT_00d27780;
  }
  builtin_strncpy(pcVar2,"September",10);
  if ((DAT_00d27788 & 1) == 0) {
    DAT_00d27788 = 0xe;
    puVar4 = &DAT_00d27789;
  }
  else {
    DAT_00d27790 = 7;
    puVar4 = DAT_00d27798;
  }
  *(undefined1 *)((long)puVar4 + 7) = 0;
  *(undefined4 *)((long)puVar4 + 3) = 0x7265626f;
  *puVar4 = 0x6f74634f;
  if ((DAT_00d277a0 & 1) == 0) {
    DAT_00d277a0 = 0x10;
    puVar3 = &DAT_00d277a1;
  }
  else {
    ram0x00d277a8 = 8;
    puVar3 = DAT_00d277b0;
  }
  *(undefined1 *)(puVar3 + 1) = 0;
  *puVar3 = 0x7265626d65766f4e;
  if ((DAT_00d277b8 & 1) == 0) {
    DAT_00d277b8 = 0x10;
    puVar3 = &DAT_00d277b9;
  }
  else {
    ram0x00d277c0 = 8;
    puVar3 = DAT_00d277c8;
  }
  *(undefined1 *)(puVar3 + 1) = 0;
  *puVar3 = 0x7265626d65636544;
  if ((DAT_00d277d0 & 1) == 0) {
    DAT_00d277d0 = 6;
    puVar4 = &DAT_00d277d1;
  }
  else {
    DAT_00d277d8 = 3;
    puVar4 = DAT_00d277e0;
  }
  *puVar4 = 0x6e614a;
  if ((DAT_00d277e8 & 1) == 0) {
    DAT_00d277e8 = 6;
    puVar4 = &DAT_00d277e9;
  }
  else {
    DAT_00d277f0 = 3;
    puVar4 = DAT_00d277f8;
  }
  *puVar4 = 0x626546;
  if ((DAT_00d27800 & 1) == 0) {
    DAT_00d27800 = 6;
    puVar4 = &DAT_00d27801;
  }
  else {
    DAT_00d27808 = 3;
    puVar4 = DAT_00d27810;
  }
  *puVar4 = 0x72614d;
  if ((DAT_00d27818 & 1) == 0) {
    DAT_00d27818 = 6;
    puVar4 = &DAT_00d27819;
  }
  else {
    DAT_00d27820 = 3;
    puVar4 = DAT_00d27828;
  }
  *puVar4 = 0x727041;
  if ((DAT_00d27830 & 1) == 0) {
    DAT_00d27830 = 6;
    puVar4 = &DAT_00d27831;
  }
  else {
    DAT_00d27838 = 3;
    puVar4 = DAT_00d27840;
  }
  *puVar4 = 0x79614d;
  if ((DAT_00d27848 & 1) == 0) {
    DAT_00d27848 = 6;
    puVar4 = &DAT_00d27849;
  }
  else {
    DAT_00d27850 = 3;
    puVar4 = DAT_00d27858;
  }
  *puVar4 = 0x6e754a;
  if ((DAT_00d27860 & 1) == 0) {
    DAT_00d27860 = 6;
    puVar4 = &DAT_00d27861;
  }
  else {
    DAT_00d27868 = 3;
    puVar4 = DAT_00d27870;
  }
  *puVar4 = 0x6c754a;
  if ((DAT_00d27878 & 1) == 0) {
    DAT_00d27878 = 6;
    puVar4 = &DAT_00d27879;
  }
  else {
    DAT_00d27880 = 3;
    puVar4 = DAT_00d27888;
  }
  *puVar4 = 0x677541;
  if ((DAT_00d27890 & 1) == 0) {
    DAT_00d27890 = 6;
    puVar4 = &DAT_00d27891;
  }
  else {
    DAT_00d27898 = 3;
    puVar4 = DAT_00d278a0;
  }
  *puVar4 = 0x706553;
  if (((byte)DAT_00d278a8 & 1) == 0) {
    DAT_00d278a8._0_1_ = 6;
    puVar4 = (undefined4 *)((long)&DAT_00d278a8 + 1);
  }
  else {
    DAT_00d278b0 = 3;
    puVar4 = DAT_00d278b8;
  }
  *puVar4 = 0x74634f;
  if (((byte)DAT_00d278c0 & 1) == 0) {
    DAT_00d278c0._0_1_ = 6;
    puVar4 = (undefined4 *)((long)&DAT_00d278c0 + 1);
  }
  else {
    DAT_00d278c8 = 3;
    puVar4 = DAT_00d278d0;
  }
  *puVar4 = 0x766f4e;
  if (((byte)DAT_00d278d8 & 1) == 0) {
    DAT_00d278d8._0_1_ = 6;
    puVar4 = (undefined4 *)((long)&DAT_00d278d8 + 1);
  }
  else {
    DAT_00d278e0 = 3;
    puVar4 = DAT_00d278e8;
  }
  *puVar4 = 0x636544;
  return;
}

