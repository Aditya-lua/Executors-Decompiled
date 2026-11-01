
void FUN_006fa6e8(undefined8 *param_1)

{
  bool in_ZR;
  bool in_CY;
  int iVar1;
  undefined8 *puVar2;
  long in_x12;
  
  if (!in_CY || in_ZR) {
                    /* WARNING: Could not recover jumptable at 0x006fa704. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_006fa708 + (ulong)*(ushort *)(&UNK_008c839a + in_x12 * 2) * 4))(5);
    return;
  }
  puVar2 = (undefined8 *)func_0x006e644c(*param_1,"invalid format option \'%c\'");
  func_0x006e644c(*puVar2,"integral size (%d) out of limits [1,%d]");
  if (((bRam0000000000a278d0 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa278d0), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return;
}

