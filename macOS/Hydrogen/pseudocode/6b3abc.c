
void FUN_006b3abc(void)

{
  long lVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  code *pcVar5;
  undefined1 *puVar6;
  ulong uVar7;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long lVar8;
  ulong uVar9;
  long *plVar10;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x27;
  ulong unaff_x28;
  long in_stack_00000018;
  long in_stack_00000020;
  
code_r0x006b3abc:
  unaff_x19[1] = unaff_x27;
  unaff_x19[2] = unaff_x24 | 0x8000000000000000;
  *unaff_x19 = unaff_x25;
  puVar6 = (undefined1 *)(unaff_x25 + unaff_x27);
  uVar7 = unaff_x20;
  lVar8 = unaff_x21;
LAB_006b3acc:
  *puVar6 = 0;
  unaff_x20 = uVar7 >> 7 & 0x1ffffff;
  unaff_x21 = lVar8;
  if ((uint)uVar7 < 0x80) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_x21 = lVar8 + 0x10;
    if (unaff_x21 == in_stack_00000018) {
      if (in_stack_00000020 != 0) {
        __ZdlPv(in_stack_00000020);
      }
      return;
    }
    unaff_x20 = (ulong)*(uint *)(lVar8 + 0x18);
  }
  bVar4 = (byte)unaff_x20 & 0x7f | (0x7f < (uint)unaff_x20) << 7;
  bVar3 = *(byte *)((long)unaff_x19 + 0x17);
  if ((char)bVar3 < '\0') {
    uVar7 = unaff_x19[1];
    unaff_x27 = unaff_x19[2] & 0x7fffffffffffffff;
    uVar9 = unaff_x27 - 1;
    if (uVar9 == uVar7) {
      if (unaff_x27 == 0x7ffffffffffffff7) {
        func_0x0001748c();
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x6b3c50);
        (*pcVar5)();
      }
      plVar10 = (long *)*unaff_x19;
      unaff_x24 = 0x7ffffffffffffff7;
      if (0x3ffffffffffffff2 < uVar9) goto LAB_006b3b80;
      goto LAB_006b3b58;
    }
    plVar10 = (long *)*unaff_x19;
  }
  else {
    uVar7 = (ulong)bVar3;
    plVar10 = unaff_x19;
    if (bVar3 == 0x16) goto code_r0x006b3b08;
  }
  *(byte *)((long)plVar10 + uVar7) = bVar4;
  lVar1 = uVar7 + 1;
  uVar7 = unaff_x20;
  lVar8 = unaff_x21;
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19[1] = lVar1;
    puVar6 = (undefined1 *)((long)plVar10 + lVar1);
  }
  else {
    *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar1 & 0x7f;
    puVar6 = (undefined1 *)((long)plVar10 + lVar1);
  }
  goto LAB_006b3acc;
code_r0x006b3b08:
  unaff_x27 = 0x17;
  uVar9 = 0x16;
LAB_006b3b58:
  uVar7 = unaff_x27;
  if (unaff_x27 <= uVar9 * 2) {
    uVar7 = uVar9 * 2;
  }
  uVar2 = (uVar7 & 0x7ffffffffffffff8) + 8;
  if ((uVar7 | 7) != 0x17) {
    uVar2 = uVar7 | 7;
  }
  unaff_x24 = unaff_x28;
  if (0x16 < uVar7) {
    unaff_x24 = uVar2 + 1;
  }
LAB_006b3b80:
  unaff_x25 = __Znwm(unaff_x24);
  if (uVar9 != 0) {
    _memmove(unaff_x25,plVar10,uVar9);
  }
  *(byte *)(unaff_x25 + uVar9) = bVar4;
  if (uVar9 != 0x16) {
    __ZdlPv(plVar10);
  }
  goto code_r0x006b3abc;
}

