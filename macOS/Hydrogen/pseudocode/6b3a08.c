
void FUN_006b3a08(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  undefined8 *puVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  ulong uVar11;
  long *unaff_x19;
  uint uVar12;
  ulong unaff_x20;
  ulong uVar13;
  long unaff_x21;
  long unaff_x22;
  ulong uVar14;
  long unaff_x23;
  long *plVar15;
  ulong unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long *unaff_x27;
  ulong uVar16;
  long unaff_x28;
  undefined8 uVar17;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000020;
  byte bStack000000000000003f;
  
  while( true ) {
    iVar7 = _memcmp(param_1,unaff_x23);
    if (iVar7 != 0) goto LAB_006b39b4;
    unaff_x20 = unaff_x20 + 1;
    unaff_x27 = unaff_x27 + 3;
    if (unaff_x24 == unaff_x20) break;
    while( true ) {
      param_1 = unaff_x27[-1];
      if ((param_1 != 0) && (*unaff_x27 == *(long *)(unaff_x22 + 600))) break;
LAB_006b39b4:
      while( true ) {
        do {
          uVar13 = unaff_x20;
          if (uVar13 == unaff_x24) goto code_r0x006b3a68;
          puVar9 = (undefined8 *)(unaff_x25 + uVar13 * unaff_x28);
          uVar17 = *puVar9;
          puVar5 = (undefined8 *)(unaff_x21 + (ulong)(*(int *)(puVar9 + 2) - 1) * 0x10);
          puVar5[1] = puVar9[1];
          *puVar5 = uVar17;
          unaff_x20 = uVar13 + 1;
        } while (unaff_x24 <= unaff_x20);
        unaff_x23 = *(long *)(unaff_x22 + 0x250);
        if (unaff_x23 != 0) break;
        plVar15 = (long *)(in_stack_00000008 + uVar13 * unaff_x28);
        while (*plVar15 == 0) {
          unaff_x20 = unaff_x20 + 1;
          plVar15 = plVar15 + 3;
          if (unaff_x24 == unaff_x20) goto code_r0x006b3a68;
        }
      }
      unaff_x27 = (long *)(in_stack_00000010 + uVar13 * unaff_x28);
    }
  }
code_r0x006b3a68:
  uVar13 = (ulong)(unaff_x26 - unaff_x21) >> 4;
  do {
    uVar12 = (uint)uVar13;
    bStack000000000000003f = (byte)uVar13 & 0x7f | (0x7f < uVar12) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    uVar13 = (ulong)(uVar12 >> 7);
  } while (0x7f < uVar12);
  if (unaff_x21 != unaff_x26) {
    do {
      uVar13 = (ulong)*(uint *)(unaff_x21 + 8);
      do {
        uVar12 = (uint)uVar13;
        bVar4 = (byte)uVar13 & 0x7f | (0x7f < uVar12) << 7;
        bVar3 = *(byte *)((long)unaff_x19 + 0x17);
        if ((char)bVar3 < '\0') {
          uVar11 = unaff_x19[1];
          uVar16 = unaff_x19[2] & 0x7fffffffffffffff;
          uVar14 = uVar16 - 1;
          if (uVar14 != uVar11) {
            plVar15 = (long *)*unaff_x19;
            goto code_r0x006b3bbc;
          }
          if (uVar16 == 0x7ffffffffffffff7) {
            func_0x0001748c();
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x6b3c50);
            (*pcVar6)();
          }
          plVar15 = (long *)*unaff_x19;
          uVar11 = 0x7ffffffffffffff7;
          if (uVar14 < 0x3ffffffffffffff3) goto code_r0x006b3b58;
code_r0x006b3b80:
          lVar8 = __Znwm(uVar11);
          if (uVar14 != 0) {
            _memmove(lVar8,plVar15,uVar14);
          }
          *(byte *)(lVar8 + uVar14) = bVar4;
          if (uVar14 != 0x16) {
            __ZdlPv(plVar15);
          }
          unaff_x19[1] = uVar16;
          unaff_x19[2] = uVar11 | 0x8000000000000000;
          *unaff_x19 = lVar8;
          puVar10 = (undefined1 *)(lVar8 + uVar16);
        }
        else {
          uVar11 = (ulong)bVar3;
          plVar15 = unaff_x19;
          if (bVar3 == 0x16) {
            uVar16 = 0x17;
            uVar14 = 0x16;
code_r0x006b3b58:
            uVar1 = uVar16;
            if (uVar16 <= uVar14 * 2) {
              uVar1 = uVar14 * 2;
            }
            uVar2 = (uVar1 & 0x7ffffffffffffff8) + 8;
            if ((uVar1 | 7) != 0x17) {
              uVar2 = uVar1 | 7;
            }
            uVar11 = 0x17;
            if (0x16 < uVar1) {
              uVar11 = uVar2 + 1;
            }
            goto code_r0x006b3b80;
          }
code_r0x006b3bbc:
          *(byte *)((long)plVar15 + uVar11) = bVar4;
          lVar8 = uVar11 + 1;
          if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
            unaff_x19[1] = lVar8;
            puVar10 = (undefined1 *)((long)plVar15 + lVar8);
          }
          else {
            *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar8 & 0x7f;
            puVar10 = (undefined1 *)((long)plVar15 + lVar8);
          }
        }
        *puVar10 = 0;
        uVar13 = uVar13 >> 7;
      } while (0x7f < uVar12);
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

