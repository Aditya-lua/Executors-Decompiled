
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

void FUN_0070ef60(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  short *psVar6;
  long lVar7;
  long lVar8;
  long *unaff_x19;
  long *unaff_x20;
  short *unaff_x21;
  long lVar9;
  long unaff_x22;
  long unaff_x23;
  ulong uVar10;
  undefined8 uVar11;
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
  
  do {
    if ((int)unaff_x20[-2] == 1) {
      lVar8 = unaff_x20[-1];
      if (*(int *)(lVar8 + 8) != *(int *)(unaff_x22 + 0xa88)) {
        lVar8 = 0;
      }
      uVar10 = *(ulong *)(lVar8 + 0x28);
      if (unaff_x27 <= uVar10) {
        func_0x0001748c(&uStack0000000000000040);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x70f2c0);
        (*pcVar2)();
      }
      uVar11 = *(undefined8 *)(lVar8 + 0x20);
      if (uVar10 < 0x17) {
        _uStack0000000000000050 = CONCAT17((char)uVar10,uStack0000000000000050);
        psVar6 = (short *)&uStack0000000000000040;
        if (uVar10 != 0) goto code_r0x0070f058;
      }
      else {
        uVar1 = (uVar10 & 0xfffffffffffffff8) + 8;
        if ((uVar10 | 7) != 0x17) {
          uVar1 = uVar10 | 7;
        }
        psVar6 = (short *)__Znwm(uVar1 + 1);
        _uStack0000000000000050 = uVar1 + 1 | 0x8000000000000000;
        unaff_x27 = 0x7ffffffffffffff8;
        uStack0000000000000040 = psVar6;
        in_stack_00000048 = uVar10;
code_r0x0070f058:
        _memmove(psVar6,uVar11,uVar10);
      }
      *(undefined1 *)((long)psVar6 + uVar10) = 0;
      uVar10 = in_stack_00000048;
      if (-1 < (long)_uStack0000000000000050) {
        uVar10 = _uStack0000000000000050 >> 0x38;
      }
      if (uVar10 == 3) {
        psVar6 = uStack0000000000000040;
        if (-1 < (long)_uStack0000000000000050) {
          psVar6 = unaff_x21;
        }
        if (*psVar6 != 0x7375 || (char)psVar6[1] != 'e') goto code_r0x0070f138;
code_r0x0070f0dc:
        lVar8 = *unaff_x20;
        if (*(int *)(lVar8 + 8) != *(int *)(unaff_x22 + 0xa88)) {
          func_0x00798aa4(&uStack0000000000000028,"Only constant string allowed as value for \'%s\'"
                         );
          puVar4 = (undefined8 *)unaff_x19[1];
          if (puVar4 < (undefined8 *)unaff_x19[2]) goto LAB_0070f160;
          lVar8 = func_0x00724c94();
          goto LAB_0070f198;
        }
      }
      else {
        if (uVar10 == 6) {
          psVar6 = uStack0000000000000040;
          if (-1 < (long)_uStack0000000000000050) {
            psVar6 = unaff_x21;
          }
          iVar3 = _memcmp(psVar6,"reason");
          if (iVar3 == 0) goto code_r0x0070f0dc;
        }
code_r0x0070f138:
        lVar8 = unaff_x20[-1];
        func_0x00798aa4(&uStack0000000000000028,
                        "Unknown argument \'%s\' for @deprecated. Only string constants for \'use\' and \'reason\' are allowed"
                       );
        puVar4 = (undefined8 *)unaff_x19[1];
        if (puVar4 < (undefined8 *)unaff_x19[2]) {
LAB_0070f160:
          uVar11 = *(undefined8 *)(lVar8 + 0xc);
          puVar4[1] = *(undefined8 *)(lVar8 + 0x14);
          *puVar4 = uVar11;
          puVar4[3] = in_stack_00000030;
          puVar4[2] = uStack0000000000000028;
          puVar4[4] = CONCAT17(cStack000000000000003f,uStack0000000000000038);
          unaff_x19[1] = (long)(puVar4 + 5);
        }
        else {
          lVar8 = func_0x00724c94();
LAB_0070f198:
          unaff_x19[1] = lVar8;
          if (cStack000000000000003f < '\0') {
            __ZdlPv(uStack0000000000000028);
          }
        }
      }
      if ((long)_uStack0000000000000050 < 0) {
        __ZdlPv(uStack0000000000000040);
      }
    }
    else {
      puVar4 = (undefined8 *)unaff_x19[1];
      if (puVar4 < (undefined8 *)unaff_x19[2]) {
        uVar11 = *(undefined8 *)(*unaff_x20 + 0xc);
        puVar4[1] = *(undefined8 *)(*unaff_x20 + 0x14);
        *puVar4 = uVar11;
        puVar5 = (undefined8 *)__Znwm(0x50);
        puVar4[2] = puVar5;
        puVar4[4] = in_stack_00000018;
        puVar4[3] = in_stack_00000010;
        uVar11 = *(undefined8 *)(unaff_x23 + 0x288);
        uVar13 = *(undefined8 *)(unaff_x23 + 0x2a0);
        uVar12 = *(undefined8 *)(unaff_x23 + 0x298);
        puVar5[5] = *(undefined8 *)(unaff_x23 + 0x290);
        puVar5[4] = uVar11;
        puVar5[7] = uVar13;
        puVar5[6] = uVar12;
        uVar11 = *(undefined8 *)(unaff_x23 + 0x2a4);
        *(undefined8 *)((long)puVar5 + 0x44) = *(undefined8 *)(unaff_x23 + 0x2ac);
        *(undefined8 *)((long)puVar5 + 0x3c) = uVar11;
        uVar13 = *(undefined8 *)(unaff_x23 + 0x268);
        uVar12 = *(undefined8 *)(unaff_x23 + 0x280);
        uVar11 = *(undefined8 *)(unaff_x23 + 0x278);
        puVar5[1] = *(undefined8 *)(unaff_x23 + 0x270);
        *puVar5 = uVar13;
        puVar5[3] = uVar12;
        puVar5[2] = uVar11;
        *(undefined1 *)((long)puVar5 + 0x4c) = 0;
        puVar4 = puVar4 + 5;
        unaff_x19[1] = (long)puVar4;
      }
      else {
        puVar4 = (undefined8 *)func_0x00724e78();
      }
      unaff_x19[1] = (long)puVar4;
    }
    unaff_x20 = unaff_x20 + 3;
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
      lVar8 = *unaff_x19;
      if (lVar8 != 0) {
        lVar9 = unaff_x19[1];
        lVar7 = lVar8;
        if (lVar9 != lVar8) {
          do {
            lVar9 = lVar9 + -0x28;
          } while (lVar9 != lVar8);
          lVar7 = *unaff_x19;
        }
        unaff_x19[1] = lVar8;
        __ZdlPv(lVar7);
      }
      return;
    }
  } while( true );
}

