
void FUN_000243e4(ulong param_1)

{
  byte bVar1;
  char cVar2;
  code *pcVar3;
  int iVar4;
  ulong uVar5;
  long *plVar6;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  long lVar7;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
code_r0x000243e4:
  *(byte *)((long)unaff_x19 + 0x17) = (byte)param_1 & 0x7e;
  plVar6 = unaff_x19;
LAB_0002440c:
  *(undefined1 *)((long)plVar6 + param_1) = 0;
  do {
    bVar1 = *(byte *)((long)unaff_x19 + 0x17);
    plVar6 = (long *)*unaff_x19;
    if (-1 < (char)bVar1) {
      plVar6 = unaff_x19;
    }
    lVar7 = (long)plVar6 + unaff_x21;
    uVar5 = unaff_x19[1];
    if (-1 < (char)bVar1) {
      uVar5 = (ulong)bVar1;
    }
    iVar4 = (**(code **)(*(long *)unaff_x20[6] + 0x28))
                      ((long *)unaff_x20[6],&uStack0000000000000010,lVar7,(long)plVar6 + uVar5,
                       &uStack0000000000000008);
    if (iVar4 != 1) {
      if (iVar4 == 0) {
        if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
          plVar6 = (long *)*unaff_x19;
          uVar5 = uStack0000000000000008 - (long)plVar6;
          if (uVar5 <= (ulong)unaff_x19[1]) {
code_r0x000244e8:
            unaff_x19[1] = uVar5;
            goto code_r0x000244f0;
          }
        }
        else {
          uVar5 = uStack0000000000000008 - (long)unaff_x19;
          if (uVar5 <= *(byte *)((long)unaff_x19 + 0x17)) {
code_r0x000244a8:
            *(byte *)((long)unaff_x19 + 0x17) = (byte)uVar5 & 0x7f;
            plVar6 = unaff_x19;
code_r0x000244f0:
            *(undefined1 *)((long)plVar6 + uVar5) = 0;
            goto LAB_000244f8;
          }
        }
code_r0x000244c4:
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
      }
      else {
        if (iVar4 == 3) {
          if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
            plVar6 = (long *)*unaff_x19;
            uVar5 = lVar7 - (long)plVar6;
            if (uVar5 <= (ulong)unaff_x19[1]) goto code_r0x000244e8;
          }
          else {
            uVar5 = lVar7 - (long)unaff_x19;
            if (uVar5 <= *(byte *)((long)unaff_x19 + 0x17)) goto code_r0x000244a8;
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
          lVar7 = *unaff_x20;
          unaff_x19[1] = unaff_x20[1];
          *unaff_x19 = lVar7;
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
    if ((char)*(byte *)((long)unaff_x19 + 0x17) < '\0') {
      plVar6 = (long *)*unaff_x19;
      unaff_x21 = uStack0000000000000008 - (long)plVar6;
      param_1 = unaff_x21 * 2;
      if (param_1 <= (ulong)unaff_x19[1]) break;
    }
    else {
      unaff_x21 = uStack0000000000000008 - (long)unaff_x19;
      param_1 = unaff_x21 * 2;
      if (param_1 <= *(byte *)((long)unaff_x19 + 0x17)) goto code_r0x000243e4;
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
  } while( true );
  unaff_x19[1] = param_1;
  goto LAB_0002440c;
}

