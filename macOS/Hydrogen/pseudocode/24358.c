
void FUN_00024358(long param_1)

{
  byte bVar1;
  char cVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  int in_w9;
  long *in_x10;
  long *plVar7;
  long in_x11;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long lVar8;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  if (-1 < in_w9) {
    in_x11 = param_1;
    in_x10 = unaff_x19;
  }
  lVar8 = (long)in_x10 + unaff_x21;
  lVar5 = lVar8 + in_x11;
  while (iVar4 = (**(code **)(*(long *)unaff_x20[6] + 0x28))
                           ((long *)unaff_x20[6],&uStack0000000000000010,lVar8,lVar5,
                            &uStack0000000000000008), iVar4 == 1) {
    if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
      plVar7 = (long *)*unaff_x19;
      lVar8 = uStack0000000000000008 - (long)plVar7;
      uVar6 = lVar8 * 2;
      if (uVar6 <= (ulong)unaff_x19[1]) {
        unaff_x19[1] = uVar6;
        goto LAB_0002440c;
      }
LAB_00024370:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
    }
    else {
      lVar8 = uStack0000000000000008 - (long)unaff_x19;
      uVar6 = lVar8 * 2;
      if (*(byte *)((long)unaff_x19 + 0x17) < uVar6) goto LAB_00024370;
      *(byte *)((long)unaff_x19 + 0x17) = (byte)uVar6 & 0x7e;
      plVar7 = unaff_x19;
LAB_0002440c:
      *(undefined1 *)((long)plVar7 + uVar6) = 0;
    }
    bVar1 = *(byte *)((long)unaff_x19 + 0x17);
    plVar7 = (long *)*unaff_x19;
    if (-1 < (char)bVar1) {
      plVar7 = unaff_x19;
    }
    lVar8 = (long)plVar7 + lVar8;
    uVar6 = unaff_x19[1];
    if (-1 < (char)bVar1) {
      uVar6 = (ulong)bVar1;
    }
    lVar5 = (long)plVar7 + uVar6;
  }
  if (iVar4 == 0) {
    if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
      plVar7 = (long *)*unaff_x19;
      uVar6 = uStack0000000000000008 - (long)plVar7;
      if (uVar6 <= (ulong)unaff_x19[1]) {
code_r0x000244e8:
        unaff_x19[1] = uVar6;
        goto code_r0x000244f0;
      }
    }
    else {
      uVar6 = uStack0000000000000008 - (long)unaff_x19;
      if (uVar6 <= *(byte *)((long)unaff_x19 + 0x17)) {
code_r0x000244a8:
        *(byte *)((long)unaff_x19 + 0x17) = (byte)uVar6 & 0x7f;
        plVar7 = unaff_x19;
code_r0x000244f0:
        *(undefined1 *)((long)plVar7 + uVar6) = 0;
        goto LAB_000244f8;
      }
    }
code_r0x000244c4:
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
  }
  else {
    if (iVar4 == 3) {
      if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
        plVar7 = (long *)*unaff_x19;
        uVar6 = lVar8 - (long)plVar7;
        if (uVar6 <= (ulong)unaff_x19[1]) goto code_r0x000244e8;
      }
      else {
        uVar6 = lVar8 - (long)unaff_x19;
        if (uVar6 <= *(byte *)((long)unaff_x19 + 0x17)) goto code_r0x000244a8;
      }
      goto code_r0x000244c4;
    }
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      __ZdlPv(*unaff_x19);
      cVar2 = *(char *)((long)unaff_x20 + 0x17);
    }
    else {
      cVar2 = *(char *)((long)unaff_x20 + 0x17);
    }
    if (cVar2 < '\0') {
      if (unaff_x20[1] == 0) goto LAB_00024544;
      func_0x00017634();
    }
    else {
      if (cVar2 == '\0') goto LAB_00024544;
      lVar8 = *unaff_x20;
      unaff_x19[1] = unaff_x20[1];
      *unaff_x19 = lVar8;
      unaff_x19[2] = unaff_x20[2];
    }
  }
LAB_000244f8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  ___stack_chk_fail();
LAB_00024544:
  func_0x00023e84("wstring_convert: to_bytes error");
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x24554);
  (*pcVar3)();
}

