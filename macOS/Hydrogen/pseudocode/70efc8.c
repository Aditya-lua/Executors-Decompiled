
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

void FUN_0070efc8(void)

{
  ulong uVar1;
  short *psVar2;
  code *pcVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  long *unaff_x19;
  long *plVar8;
  long *unaff_x20;
  short *unaff_x21;
  long lVar9;
  long unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long lVar10;
  undefined8 uVar11;
  short *unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined7 uStack0000000000000038;
  char cStack000000000000003f;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000048;
  undefined7 uStack0000000000000050;
  
LAB_0070f068:
  *(undefined1 *)((long)unaff_x26 + unaff_x24) = 0;
  uVar1 = in_stack_00000048;
  if (-1 < (long)_uStack0000000000000050) {
    uVar1 = _uStack0000000000000050 >> 0x38;
  }
  if (uVar1 == 3) {
    psVar2 = uStack0000000000000040;
    if (-1 < (long)_uStack0000000000000050) {
      psVar2 = unaff_x21;
    }
    if (*psVar2 != 0x7375 || (char)psVar2[1] != 'e') goto code_r0x0070f138;
code_r0x0070f0dc:
    lVar10 = *unaff_x20;
    if (*(int *)(lVar10 + 8) != *(int *)(unaff_x22 + 0xa88)) {
      func_0x00798aa4(&uStack0000000000000028,"Only constant string allowed as value for \'%s\'");
      puVar5 = (undefined8 *)unaff_x19[1];
      if (puVar5 < (undefined8 *)unaff_x19[2]) goto LAB_0070f160;
      lVar10 = func_0x00724c94();
      goto LAB_0070f198;
    }
  }
  else {
    if (uVar1 == 6) {
      psVar2 = uStack0000000000000040;
      if (-1 < (long)_uStack0000000000000050) {
        psVar2 = unaff_x21;
      }
      iVar4 = _memcmp(psVar2,"reason");
      if (iVar4 == 0) goto code_r0x0070f0dc;
    }
code_r0x0070f138:
    lVar10 = unaff_x20[-1];
    func_0x00798aa4(&uStack0000000000000028,
                    "Unknown argument \'%s\' for @deprecated. Only string constants for \'use\' and \'reason\' are allowed"
                   );
    puVar5 = (undefined8 *)unaff_x19[1];
    if (puVar5 < (undefined8 *)unaff_x19[2]) {
LAB_0070f160:
      uVar11 = *(undefined8 *)(lVar10 + 0xc);
      puVar5[1] = *(undefined8 *)(lVar10 + 0x14);
      *puVar5 = uVar11;
      puVar5[3] = in_stack_00000030;
      puVar5[2] = uStack0000000000000028;
      puVar5[4] = CONCAT17(cStack000000000000003f,uStack0000000000000038);
      unaff_x19[1] = (long)(puVar5 + 5);
    }
    else {
      lVar10 = func_0x00724c94();
LAB_0070f198:
      unaff_x19[1] = lVar10;
      if (cStack000000000000003f < '\0') {
        __ZdlPv(uStack0000000000000028);
      }
    }
  }
  plVar8 = unaff_x20;
  if ((long)_uStack0000000000000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  while( true ) {
    unaff_x20 = plVar8 + 3;
    unaff_x28 = unaff_x28 + -0x18;
    if (unaff_x28 == 0) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return;
      }
      ___stack_chk_fail();
      if (cStack000000000000003f < '\0') {
        __ZdlPv(uStack0000000000000028);
      }
      if ((long)_uStack0000000000000050 < 0) {
        __ZdlPv(uStack0000000000000040);
      }
      lVar10 = *unaff_x19;
      if (lVar10 != 0) {
        lVar9 = unaff_x19[1];
        lVar7 = lVar10;
        if (lVar9 != lVar10) {
          do {
            lVar9 = lVar9 + -0x28;
          } while (lVar9 != lVar10);
          lVar7 = *unaff_x19;
        }
        unaff_x19[1] = lVar10;
        __ZdlPv(lVar7);
      }
      return;
    }
    if ((int)plVar8[1] == 1) break;
    puVar5 = (undefined8 *)unaff_x19[1];
    if (puVar5 < (undefined8 *)unaff_x19[2]) {
      uVar11 = *(undefined8 *)(*unaff_x20 + 0xc);
      puVar5[1] = *(undefined8 *)(*unaff_x20 + 0x14);
      *puVar5 = uVar11;
      puVar6 = (undefined8 *)__Znwm(0x50);
      puVar5[2] = puVar6;
      puVar5[4] = in_stack_00000018;
      puVar5[3] = in_stack_00000010;
      uVar11 = unaff_x23[4];
      uVar13 = unaff_x23[7];
      uVar12 = unaff_x23[6];
      puVar6[5] = unaff_x23[5];
      puVar6[4] = uVar11;
      puVar6[7] = uVar13;
      puVar6[6] = uVar12;
      uVar11 = *(undefined8 *)((long)unaff_x23 + 0x3c);
      *(undefined8 *)((long)puVar6 + 0x44) = *(undefined8 *)((long)unaff_x23 + 0x44);
      *(undefined8 *)((long)puVar6 + 0x3c) = uVar11;
      uVar13 = *unaff_x23;
      uVar12 = unaff_x23[3];
      uVar11 = unaff_x23[2];
      puVar6[1] = unaff_x23[1];
      *puVar6 = uVar13;
      puVar6[3] = uVar12;
      puVar6[2] = uVar11;
      *(undefined1 *)((long)puVar6 + 0x4c) = 0;
      puVar5 = puVar5 + 5;
      unaff_x19[1] = (long)puVar5;
    }
    else {
      puVar5 = (undefined8 *)func_0x00724e78();
    }
    unaff_x19[1] = (long)puVar5;
    plVar8 = unaff_x20;
  }
  lVar10 = plVar8[2];
  if (*(int *)(lVar10 + 8) != *(int *)(unaff_x22 + 0xa88)) {
    lVar10 = 0;
  }
  unaff_x24 = *(ulong *)(lVar10 + 0x28);
  if (unaff_x27 <= unaff_x24) {
    func_0x0001748c(&uStack0000000000000040);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x70f2c0);
    (*pcVar3)();
  }
  uVar11 = *(undefined8 *)(lVar10 + 0x20);
  if (unaff_x24 < 0x17) goto code_r0x0070efbc;
  uVar1 = (unaff_x24 & 0xfffffffffffffff8) + 8;
  if ((unaff_x24 | 7) != 0x17) {
    uVar1 = unaff_x24 | 7;
  }
  unaff_x26 = (short *)__Znwm(uVar1 + 1);
  _uStack0000000000000050 = uVar1 + 1 | 0x8000000000000000;
  unaff_x27 = 0x7ffffffffffffff8;
  uStack0000000000000040 = unaff_x26;
  in_stack_00000048 = unaff_x24;
  goto code_r0x0070f058;
code_r0x0070efbc:
  _uStack0000000000000050 = CONCAT17((char)unaff_x24,uStack0000000000000050);
  unaff_x26 = (short *)&uStack0000000000000040;
  if (unaff_x24 != 0) {
code_r0x0070f058:
    _memmove(unaff_x26,uVar11,unaff_x24);
  }
  goto LAB_0070f068;
}

