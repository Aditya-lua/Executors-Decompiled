
void FUN_00023860(int param_1)

{
  char cVar1;
  code *pcVar2;
  long lVar3;
  byte bVar4;
  long *plVar5;
  undefined4 *puVar6;
  ulong uVar7;
  long *unaff_x19;
  ulong unaff_x21;
  long unaff_x23;
  ulong uVar8;
  long unaff_x29;
  
  if (param_1 != 3) {
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') goto LAB_000238d4;
    cVar1 = *(char *)(unaff_x21 + 0x2f);
    goto joined_r0x000238a0;
  }
  bVar4 = *(byte *)((long)unaff_x19 + 0x17);
  if ((char)bVar4 < '\0') {
    plVar5 = (long *)*unaff_x19;
    unaff_x21 = unaff_x19[1];
    uVar7 = unaff_x23 - (long)plVar5 >> 2;
    uVar8 = uVar7 - unaff_x21;
    if (uVar7 < unaff_x21 || uVar8 == 0) {
      unaff_x19[1] = uVar7;
      goto LAB_00023a70;
    }
    if (uVar8 == 0) goto LAB_00023a78;
    lVar3 = (unaff_x19[2] & 0x7fffffffffffffffU) - 1;
    bVar4 = (byte)((ulong)unaff_x19[2] >> 0x38);
LAB_00023954:
    if (lVar3 - unaff_x21 < uVar8) {
      __ZNSt3__112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE9__grow_byEmmmmmm();
      unaff_x19[1] = unaff_x21;
      bVar4 = *(byte *)((long)unaff_x19 + 0x17);
    }
    plVar5 = (long *)*unaff_x19;
    if (-1 < (char)bVar4) {
      plVar5 = unaff_x19;
    }
    _bzero((long)plVar5 + unaff_x21 * 4,uVar8 << 2);
    lVar3 = unaff_x21 + uVar8;
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      unaff_x19[1] = lVar3;
      puVar6 = (undefined4 *)((long)plVar5 + lVar3 * 4);
    }
    else {
      *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar3 & 0x7f;
      puVar6 = (undefined4 *)((long)plVar5 + lVar3 * 4);
    }
  }
  else {
    unaff_x21 = (ulong)bVar4;
    uVar7 = unaff_x23 - (long)unaff_x19 >> 2;
    uVar8 = uVar7 - unaff_x21;
    if (unaff_x21 <= uVar7 && uVar8 != 0) {
      if (uVar8 == 0) goto LAB_00023a78;
      lVar3 = 4;
      goto LAB_00023954;
    }
    *(byte *)((long)unaff_x19 + 0x17) = (byte)((uint)(unaff_x23 - (long)unaff_x19) >> 2) & 0x7f;
    plVar5 = unaff_x19;
LAB_00023a70:
    puVar6 = (undefined4 *)((long)plVar5 + uVar7 * 4);
  }
  *puVar6 = 0;
LAB_00023a78:
  func_0x00023b60();
  while( true ) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return;
    }
    while( true ) {
      ___stack_chk_fail();
LAB_000238d4:
      __ZdlPv(*unaff_x19);
      cVar1 = *(char *)(unaff_x21 + 0x2f);
joined_r0x000238a0:
      if (cVar1 < '\0') break;
      if (cVar1 == '\0') goto LAB_00023b24;
      lVar3 = *(long *)(unaff_x21 + 0x18);
      unaff_x19[1] = *(long *)(unaff_x21 + 0x20);
      *unaff_x19 = lVar3;
      unaff_x19[2] = *(long *)(unaff_x21 + 0x28);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
        return;
      }
    }
    if (*(long *)(unaff_x21 + 0x20) == 0) break;
    func_0x00023ef8();
  }
LAB_00023b24:
  func_0x00023e84("wstring_convert: from_bytes error");
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x23b34);
  (*pcVar2)();
}

