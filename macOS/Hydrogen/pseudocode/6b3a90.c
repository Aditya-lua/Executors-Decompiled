
void FUN_006b3a90(void)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  code *pcVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong uVar8;
  long *unaff_x19;
  uint uVar9;
  ulong unaff_x20;
  ulong uVar10;
  long unaff_x21;
  ulong uVar11;
  long *plVar12;
  long unaff_x26;
  ulong uVar13;
  long in_stack_00000020;
  
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar9 = (uint)unaff_x20;
    unaff_x20 = unaff_x20 >> 7 & 0x1ffffff;
  } while (0x7f < uVar9);
  if (unaff_x21 != unaff_x26) {
    do {
      uVar10 = (ulong)*(uint *)(unaff_x21 + 8);
      do {
        uVar9 = (uint)uVar10;
        bVar4 = (byte)uVar10 & 0x7f | (0x7f < uVar9) << 7;
        bVar3 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar3 < '\0') {
          uVar8 = unaff_x19[1];
          uVar13 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar11 = uVar13 - 1;
          if (uVar11 != uVar8) {
            plVar12 = (long *)*unaff_x19;
            goto code_r0x006b3bbc;
          }
          if (uVar13 == 0x7ffffffffffffff7) {
            func_0x0001748c();
                    /* WARNING: Does not return */
            pcVar5 = (code *)SoftwareBreakpoint(1,0x6b3c50);
            (*pcVar5)();
          }
          plVar12 = (long *)*unaff_x19;
          uVar8 = 0x7ffffffffffffff7;
          if (uVar11 < 0x3ffffffffffffff3) goto code_r0x006b3b58;
code_r0x006b3b80:
          lVar6 = __Znwm(uVar8);
          if (uVar11 != 0) {
            _memmove(lVar6,plVar12,uVar11);
          }
          *(byte *)(lVar6 + uVar11) = bVar4;
          if (uVar11 != 0x16) {
            __ZdlPv(plVar12);
          }
          unaff_x19[1] = uVar13;
          unaff_x19[2] = uVar8 | 0x8000000000000000;
          *unaff_x19 = lVar6;
          puVar7 = (undefined1 *)(lVar6 + uVar13);
        }
        else {
          uVar8 = (ulong)bVar3;
          plVar12 = unaff_x19;
          if (bVar3 == 0x16) {
            uVar13 = 0x17;
            uVar11 = 0x16;
code_r0x006b3b58:
            uVar1 = uVar13;
            if (uVar13 <= uVar11 * 2) {
              uVar1 = uVar11 * 2;
            }
            uVar2 = (uVar1 & 0x7ffffffffffffff8) + 8;
            if ((uVar1 | 7) != 0x17) {
              uVar2 = uVar1 | 7;
            }
            uVar8 = 0x17;
            if (0x16 < uVar1) {
              uVar8 = uVar2 + 1;
            }
            goto code_r0x006b3b80;
          }
code_r0x006b3bbc:
          *(byte *)((long)plVar12 + uVar8) = bVar4;
          lVar6 = uVar8 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar6;
            puVar7 = (undefined1 *)((long)plVar12 + lVar6);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar6 & 0x7f;
            puVar7 = (undefined1 *)((long)plVar12 + lVar6);
          }
        }
        *puVar7 = 0;
        uVar10 = uVar10 >> 7;
      } while (0x7f < uVar9);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      unaff_x21 = unaff_x21 + 0x10;
    } while (unaff_x21 != unaff_x26);
    unaff_x26 = in_stack_00000020;
  }
  if (unaff_x26 != 0) {
    __ZdlPv(unaff_x26);
  }
  return;
}

