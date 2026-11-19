/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00804318
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00804318(long param_1)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  uint3 uVar4;
  bool bVar5;
  int iVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  char *pcVar10;
  byte local_50;
  undefined7 uStack_4f;
  ulong uStack_48;
  char *local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  FUN_0080719c(&local_50,DAT_00cca958);
  bVar5 = (local_50 & 1) != 0;
  uVar1 = (ulong)(local_50 >> 1);
  if (bVar5) {
    uVar1 = uStack_48;
  }
  if (uVar1 != 0) {
    pcVar10 = local_40;
    if (!bVar5) {
      pcVar10 = (char *)&uStack_4f;
    }
    if (*pcVar10 != '\0') {
                    /* try { // try from 0080437c to 00804383 has its CatchHandler @ 00804664 */
      std::__ndk1::mutex::lock((mutex *)(param_1 + 0x38));
      lVar8 = *(long *)(param_1 + 0x10);
      lVar9 = *(long *)(param_1 + 0x18);
      lVar2 = 0;
      if (lVar9 != lVar8) {
        lVar2 = (lVar9 - lVar8 >> 3) * 0xaa + -1;
      }
      if (lVar2 == *(long *)(param_1 + 0x30) + *(long *)(param_1 + 0x28)) {
                    /* try { // try from 008043b4 to 008043bb has its CatchHandler @ 00804654 */
        FUN_007feb50(param_1 + 8);
        lVar8 = *(long *)(param_1 + 0x10);
        lVar9 = *(long *)(param_1 + 0x18);
      }
      if (lVar9 == lVar8) {
        puVar7 = (undefined8 *)0x0;
        if ((local_50 & 1) == 0) goto LAB_00804400;
LAB_00804578:
                    /* try { // try from 0080457c to 0080457f has its CatchHandler @ 00804654 */
        FUN_007ff40c(puVar7,local_40,uStack_48);
      }
      else {
        uVar1 = *(long *)(param_1 + 0x30) + *(long *)(param_1 + 0x28);
        puVar7 = (undefined8 *)(*(long *)(lVar8 + (uVar1 / 0xaa) * 8) + (uVar1 % 0xaa) * 0x18);
        if ((local_50 & 1) != 0) goto LAB_00804578;
LAB_00804400:
        puVar7[2] = local_40;
        puVar7[1] = uStack_48;
        *puVar7 = CONCAT71(uStack_4f,local_50);
      }
      *(long *)(param_1 + 0x30) = *(long *)(param_1 + 0x30) + 1;
      std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x38));
      goto joined_r0x00804534;
    }
  }
  if (((DAT_00ccb1c8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccb1c8), iVar6 != 0)) {
    _DAT_00ccb1c0 = 0x11dac96;
    __cxa_atexit(&LAB_008047fc,&DAT_00ccb1c0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00ccb1c8);
  }
  if (DAT_00ccb1c3 == '\x01') {
    uVar4 = (uint3)_DAT_00ccb1c0;
    _DAT_00ccb1c0 = (uint)(uVar4 ^ 0x1ddfb3);
  }
  uVar1 = (ulong)(local_50 >> 1);
  if ((local_50 & 1) != 0) {
    uVar1 = uStack_48;
  }
  if (uVar1 < 2) {
    if (((DAT_00ccb1e0 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccb1e0), iVar6 != 0)) {
      _DAT_00ccb1dc = 0x79ef;
      DAT_00ccb1de = '\x01';
      DAT_00ccb1d0 = 0x691415f453849618;
      DAT_00ccb1d8 = 0x4c9b8b1e;
      __cxa_atexit(&LAB_00804808,&DAT_00ccb1d0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccb1e0);
    }
    pcVar10 = (char *)&DAT_00ccb1d0;
    if (DAT_00ccb1de == '\x01') {
      DAT_00ccb1de = '\0';
      DAT_00ccb1d0 = DAT_00ccb1d0 ^ 0x4971799d23e9f97b;
      DAT_00ccb1d8 = DAT_00ccb1d8 ^ 0x23e9f97b;
      _DAT_00ccb1dc = _DAT_00ccb1dc ^ 0x799d;
    }
  }
  else {
    pcVar10 = (char *)((ulong)&local_50 | 2);
    if ((local_50 & 1) != 0) {
      pcVar10 = local_40 + 1;
    }
  }
                    /* try { // try from 00804520 to 0080452f has its CatchHandler @ 00804668 */
  (*DAT_00ccb160)(3,&DAT_00ccb1c0,pcVar10);
joined_r0x00804534:
  if ((local_50 & 1) != 0) {
    operator_delete(local_40,CONCAT71(uStack_4f,local_50) & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

