/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00814948
 */

undefined4 FUN_00814948(byte *param_1)

{
  size_t sVar1;
  byte bVar2;
  int iVar3;
  size_t sVar4;
  undefined4 uVar5;
  byte *pbVar6;
  
  if (((DAT_00d1bb20 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1bb20), iVar3 != 0)) {
    DAT_00d1bb1c = '\x01';
    DAT_00d1bb18 = 0x67673ec4;
    __cxa_atexit(&LAB_00814f94,&DAT_00d1bb18,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bb20);
  }
  if (DAT_00d1bb1c == '\x01') {
    DAT_00d1bb1c = '\0';
    DAT_00d1bb18 = DAT_00d1bb18 ^ 0x67055da1;
  }
  sVar4 = strlen((char *)&DAT_00d1bb18);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar4 == sVar1) {
    if (sVar4 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00814d70 to 00814d73 has its CatchHandler @ 00814d8c */
      FUN_00814f80();
    }
    pbVar6 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar6 = param_1 + 1;
    }
    iVar3 = memcmp(pbVar6,&DAT_00d1bb18,sVar4);
    if (iVar3 == 0) {
      return 4;
    }
  }
  if (((DAT_00d1bb30 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1bb30), iVar3 != 0)) {
    DAT_00d1bb2c = '\x01';
    DAT_00d1bb28 = 0x7995f3dc;
    __cxa_atexit(&LAB_00814f9c,&DAT_00d1bb28,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bb30);
  }
  if (DAT_00d1bb2c == '\x01') {
    DAT_00d1bb2c = '\0';
    DAT_00d1bb28 = DAT_00d1bb28 ^ 0x79e787bf;
  }
  sVar4 = strlen((char *)&DAT_00d1bb28);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar4 == sVar1) {
    if (sVar4 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00814d74 to 00814d77 has its CatchHandler @ 00814d88 */
      FUN_00814f80();
    }
    pbVar6 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar6 = param_1 + 1;
    }
    iVar3 = memcmp(pbVar6,&DAT_00d1bb28,sVar4);
    if (iVar3 == 0) {
      return 0xd;
    }
  }
  if (((DAT_00d1bb40 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1bb40), iVar3 != 0)) {
    DAT_00d1bb3c = '\x01';
    DAT_00d1bb38 = 0x8fddf148;
    __cxa_atexit(&LAB_00814fa4,&DAT_00d1bb38,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bb40);
  }
  if (DAT_00d1bb3c == '\x01') {
    DAT_00d1bb3c = '\0';
    DAT_00d1bb38 = DAT_00d1bb38 ^ 0x8fbf972b;
  }
  sVar4 = strlen((char *)&DAT_00d1bb38);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar4 == sVar1) {
    if (sVar4 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00814d78 to 00814d7b has its CatchHandler @ 00814d84 */
      FUN_00814f80();
    }
    pbVar6 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar6 = param_1 + 1;
    }
    iVar3 = memcmp(pbVar6,&DAT_00d1bb38,sVar4);
    if (iVar3 == 0) {
      return 10;
    }
  }
  if (((DAT_00d1bb50 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1bb50), iVar3 != 0)) {
    DAT_00d1bb4c = '\x01';
    DAT_00d1bb48 = 0x7a12da2;
    __cxa_atexit(&LAB_00814fac,&DAT_00d1bb48,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1bb50);
  }
  if (DAT_00d1bb4c == '\x01') {
    DAT_00d1bb4c = '\0';
    DAT_00d1bb48 = DAT_00d1bb48 ^ 0x7c34bcd;
  }
  sVar4 = strlen((char *)&DAT_00d1bb48);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar4 == sVar1) {
    if (sVar4 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00814d7c to 00814d7f has its CatchHandler @ 00814d80 */
      FUN_00814f80();
    }
    pbVar6 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar6 = param_1 + 1;
    }
    iVar3 = memcmp(pbVar6,&DAT_00d1bb48,sVar4);
    uVar5 = 0x49;
    if (iVar3 != 0) {
      uVar5 = 7;
    }
  }
  else {
    uVar5 = 7;
  }
  return uVar5;
}

