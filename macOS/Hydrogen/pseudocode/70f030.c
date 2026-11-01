
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

void FUN_0070f030(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  short *psVar6;
  long lVar7;
  ulong in_x9;
  long *unaff_x19;
  long *plVar8;
  long *unaff_x20;
  short *unaff_x21;
  long lVar9;
  long unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long lVar10;
  undefined8 unaff_x25;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar11;
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
  
code_r0x0070f030:
  if (in_x9 != 0x17) {
    param_1 = in_x9;
  }
  psVar6 = (short *)__Znwm(param_1 + 1);
  _uStack0000000000000050 = param_1 + 1 | 0x8000000000000000;
  uStack0000000000000040 = psVar6;
  in_stack_00000048 = unaff_x24;
  do {
    _memmove(psVar6,unaff_x25,unaff_x24);
    do {
      *(undefined1 *)((long)psVar6 + unaff_x24) = 0;
      uVar1 = in_stack_00000048;
      if (-1 < (long)_uStack0000000000000050) {
        uVar1 = _uStack0000000000000050 >> 0x38;
      }
      if (uVar1 == 3) {
        psVar6 = uStack0000000000000040;
        if (-1 < (long)_uStack0000000000000050) {
          psVar6 = unaff_x21;
        }
        if (*psVar6 != 0x7375 || (char)psVar6[1] != 'e') goto code_r0x0070f138;
code_r0x0070f0dc:
        lVar10 = *unaff_x20;
        if (*(int *)(lVar10 + 8) != *(int *)(unaff_x22 + 0xa88)) {
          func_0x00798aa4(&uStack0000000000000028,"Only constant string allowed as value for \'%s\'"
                         );
          puVar4 = (undefined8 *)unaff_x19[1];
          if (puVar4 < (undefined8 *)unaff_x19[2]) goto LAB_0070f160;
          lVar10 = func_0x00724c94();
          goto LAB_0070f198;
        }
      }
      else {
        if (uVar1 == 6) {
          psVar6 = uStack0000000000000040;
          if (-1 < (long)_uStack0000000000000050) {
            psVar6 = unaff_x21;
          }
          iVar3 = _memcmp(psVar6,"reason");
          if (iVar3 == 0) goto code_r0x0070f0dc;
        }
code_r0x0070f138:
        lVar10 = unaff_x20[-1];
        func_0x00798aa4(&uStack0000000000000028,
                        "Unknown argument \'%s\' for @deprecated. Only string constants for \'use\' and \'reason\' are allowed"
                       );
        puVar4 = (undefined8 *)unaff_x19[1];
        if (puVar4 < (undefined8 *)unaff_x19[2]) {
LAB_0070f160:
          uVar11 = *(undefined8 *)(lVar10 + 0xc);
          puVar4[1] = *(undefined8 *)(lVar10 + 0x14);
          *puVar4 = uVar11;
          puVar4[3] = in_stack_00000030;
          puVar4[2] = uStack0000000000000028;
          puVar4[4] = CONCAT17(cStack000000000000003f,uStack0000000000000038);
          unaff_x19[1] = (long)(puVar4 + 5);
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
        puVar4 = (undefined8 *)unaff_x19[1];
        if (puVar4 < (undefined8 *)unaff_x19[2]) {
          uVar11 = *(undefined8 *)(*unaff_x20 + 0xc);
          puVar4[1] = *(undefined8 *)(*unaff_x20 + 0x14);
          *puVar4 = uVar11;
          puVar5 = (undefined8 *)__Znwm(0x50);
          puVar4[2] = puVar5;
          puVar4[4] = in_stack_00000018;
          puVar4[3] = in_stack_00000010;
          uVar11 = unaff_x23[4];
          uVar13 = unaff_x23[7];
          uVar12 = unaff_x23[6];
          puVar5[5] = unaff_x23[5];
          puVar5[4] = uVar11;
          puVar5[7] = uVar13;
          puVar5[6] = uVar12;
          uVar11 = *(undefined8 *)((long)unaff_x23 + 0x3c);
          *(undefined8 *)((long)puVar5 + 0x44) = *(undefined8 *)((long)unaff_x23 + 0x44);
          *(undefined8 *)((long)puVar5 + 0x3c) = uVar11;
          uVar13 = *unaff_x23;
          uVar12 = unaff_x23[3];
          uVar11 = unaff_x23[2];
          puVar5[1] = unaff_x23[1];
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
        plVar8 = unaff_x20;
      }
      lVar10 = plVar8[2];
      if (*(int *)(lVar10 + 8) != *(int *)(unaff_x22 + 0xa88)) {
        lVar10 = 0;
      }
      unaff_x24 = *(ulong *)(lVar10 + 0x28);
      if (0x7ffffffffffffff7 < unaff_x24) {
        func_0x0001748c(&uStack0000000000000040);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x70f2c0);
        (*pcVar2)();
      }
      unaff_x25 = *(undefined8 *)(lVar10 + 0x20);
      if (0x16 < unaff_x24) {
        param_1 = (unaff_x24 & 0xfffffffffffffff8) + 8;
        in_x9 = unaff_x24 | 7;
        goto code_r0x0070f030;
      }
      _uStack0000000000000050 = CONCAT17((char)unaff_x24,uStack0000000000000050);
      psVar6 = (short *)&uStack0000000000000040;
    } while (unaff_x24 == 0);
  } while( true );
}

