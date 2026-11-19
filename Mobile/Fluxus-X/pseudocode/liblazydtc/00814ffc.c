/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00814ffc
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 FUN_00814ffc(byte *param_1)

{
  size_t sVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  size_t sVar6;
  undefined4 uVar7;
  byte *pbVar8;
  
  if (((DAT_00d1c110 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c110), iVar5 != 0)) {
    DAT_00d1c10c = '\x01';
    DAT_00d1c108 = 0x5f949f8e;
    __cxa_atexit(&LAB_00815734,&DAT_00d1c108,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c110);
  }
  if (DAT_00d1c10c == '\x01') {
    DAT_00d1c10c = '\0';
    DAT_00d1c108 = DAT_00d1c108 ^ 0x5fa1fbe3;
  }
  sVar6 = strlen((char *)&DAT_00d1c108);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar6 == sVar1) {
    if (sVar6 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00815618 to 0081561b has its CatchHandler @ 008156f4 */
      FUN_00814f80();
    }
    pbVar8 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar8 = param_1 + 1;
    }
    iVar5 = memcmp(pbVar8,&DAT_00d1c108,sVar6);
    if (iVar5 == 0) {
      return 3;
    }
  }
  if (((DAT_00d1c120 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c120), iVar5 != 0)) {
    DAT_00d1c118 = 0x76ead578;
    _DAT_00d1c11c = 0x1ad;
    __cxa_atexit(&LAB_0081573c,&DAT_00d1c118,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c120);
  }
  if (DAT_00d1c11d == '\x01') {
    _DAT_00d1c11c = (ushort)(DAT_00d1c11c ^ 0xad);
    DAT_00d1c118 = DAT_00d1c118 ^ 0x478bbd0b;
  }
  sVar6 = strlen((char *)&DAT_00d1c118);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar6 == sVar1) {
    if (sVar6 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00815674 to 00815677 has its CatchHandler @ 008156f0 */
      FUN_00814f80();
    }
    pbVar8 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar8 = param_1 + 1;
    }
    iVar5 = memcmp(pbVar8,&DAT_00d1c118,sVar6);
    if (iVar5 == 0) {
      return 5;
    }
  }
  if (((DAT_00d1c130 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c130), iVar5 != 0)) {
    _DAT_00d1c128 = 0x1b935f90fd45704;
    __cxa_atexit(&LAB_00815748,&DAT_00d1c128,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c130);
  }
  uVar4 = _DAT_00d1c128;
  if (DAT_00d1c12f == '\x01') {
    uVar3 = _DAT_00d1c128 >> 0x30;
    _DAT_00d1c128 = (uint5)(DAT_00d1c12c ^ 0xcb) << 0x20;
    _DAT_00d1c128 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c12d,_DAT_00d1c128)) >> 0x20),
                         (int)uVar4) ^ 0xb901003db53f77;
  }
  sVar6 = strlen((char *)&DAT_00d1c128);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar6 == sVar1) {
    if (sVar6 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008156d0 to 008156d3 has its CatchHandler @ 008156ec */
      FUN_00814f80();
    }
    pbVar8 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar8 = param_1 + 1;
    }
    iVar5 = memcmp(pbVar8,&DAT_00d1c128,sVar6);
    if (iVar5 == 0) {
      return 8;
    }
  }
  if (((DAT_00d1c140 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c140), iVar5 != 0)) {
    _DAT_00d1c138 = 0x1eb196c75d06718;
    __cxa_atexit(&LAB_00815754,&DAT_00d1c138,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c140);
  }
  uVar4 = _DAT_00d1c138;
  if (DAT_00d1c13f == '\x01') {
    uVar3 = _DAT_00d1c138 >> 0x30;
    _DAT_00d1c138 = (uint5)(DAT_00d1c13c ^ 0x59) << 0x20;
    _DAT_00d1c138 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c13d,_DAT_00d1c138)) >> 0x20),
                         (int)uVar4) ^ 0xeb2f0047b10f6b;
  }
  sVar6 = strlen((char *)&DAT_00d1c138);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar6 == sVar1) {
    if (sVar6 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008156d4 to 008156d7 has its CatchHandler @ 008156e8 */
      FUN_00814f80();
    }
    pbVar8 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar8 = param_1 + 1;
    }
    iVar5 = memcmp(pbVar8,&DAT_00d1c138,sVar6);
    if (iVar5 == 0) {
      return 9;
    }
  }
  if (((DAT_00d1c150 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c150), iVar5 != 0)) {
    _DAT_00d1c148 = 0x18bcd9dbcdc05cc;
    __cxa_atexit(&LAB_00815760,&DAT_00d1c148,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c150);
  }
  uVar4 = _DAT_00d1c148;
  if (DAT_00d1c14f == '\x01') {
    uVar3 = _DAT_00d1c148 >> 0x30;
    _DAT_00d1c148 = (uint5)(DAT_00d1c14c ^ 0xa5) << 0x20;
    _DAT_00d1c148 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c14d,_DAT_00d1c148)) >> 0x20),
                         (int)uVar4) ^ 0x8bf9008fbd6dbf;
  }
  sVar6 = strlen((char *)&DAT_00d1c148);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar6 == sVar1) {
    if (sVar6 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008156d8 to 008156db has its CatchHandler @ 008156e4 */
      FUN_00814f80();
    }
    pbVar8 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar8 = param_1 + 1;
    }
    iVar5 = memcmp(pbVar8,&DAT_00d1c148,sVar6);
    if (iVar5 == 0) {
      return 10;
    }
  }
  if (((DAT_00d1c160 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1c160), iVar5 != 0)) {
    _DAT_00d1c158 = 0x153419474062158;
    __cxa_atexit(&LAB_0081576c,&DAT_00d1c158,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c160);
  }
  uVar4 = _DAT_00d1c158;
  if (DAT_00d1c15f == '\x01') {
    uVar3 = _DAT_00d1c158 >> 0x30;
    _DAT_00d1c158 = (uint5)(DAT_00d1c15c ^ 0xa5) << 0x20;
    _DAT_00d1c158 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00d1c15d,_DAT_00d1c158)) >> 0x20),
                         (int)uVar4) ^ 0x5373004167492b;
  }
  sVar6 = strlen((char *)&DAT_00d1c158);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (sVar6 == sVar1) {
    if (sVar6 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008156dc to 008156df has its CatchHandler @ 008156e0 */
      FUN_00814f80();
    }
    pbVar8 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      pbVar8 = param_1 + 1;
    }
    iVar5 = memcmp(pbVar8,&DAT_00d1c158,sVar6);
    uVar7 = 0xb;
    if (iVar5 != 0) {
      uVar7 = 0;
    }
  }
  else {
    uVar7 = 0;
  }
  return uVar7;
}

