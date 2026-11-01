
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

void FUN_0070f100(undefined8 *param_1)

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
  long *plVar9;
  long *unaff_x20;
  short *unaff_x21;
  long lVar10;
  long unaff_x22;
  undefined8 *unaff_x23;
  ulong uVar11;
  long unaff_x24;
  undefined8 uVar12;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined7 uStack0000000000000038;
  char cStack000000000000003f;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000048;
  undefined7 uStack0000000000000050;
  
code_r0x0070f100:
  func_0x00798aa4(param_1,"Only constant string allowed as value for \'%s\'");
  puVar4 = (undefined8 *)unaff_x19[1];
  if (puVar4 < (undefined8 *)unaff_x19[2]) goto LAB_0070f160;
  lVar7 = func_0x00724c94();
  do {
    unaff_x19[1] = lVar7;
    if (cStack000000000000003f < '\0') {
      __ZdlPv(uStack0000000000000028);
    }
joined_r0x0070f1c4:
    plVar9 = unaff_x20;
    if ((long)_uStack0000000000000050 < 0) {
      __ZdlPv(uStack0000000000000040);
    }
    while( true ) {
      unaff_x20 = plVar9 + 3;
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
        lVar7 = *unaff_x19;
        if (lVar7 != 0) {
          lVar10 = unaff_x19[1];
          lVar8 = lVar7;
          if (lVar10 != lVar7) {
            do {
              lVar10 = lVar10 + -0x28;
            } while (lVar10 != lVar7);
            lVar8 = *unaff_x19;
          }
          unaff_x19[1] = lVar7;
          __ZdlPv(lVar8);
        }
        return;
      }
      if ((int)plVar9[1] == 1) break;
      puVar4 = (undefined8 *)unaff_x19[1];
      if (puVar4 < (undefined8 *)unaff_x19[2]) {
        uVar12 = *(undefined8 *)(*unaff_x20 + 0xc);
        puVar4[1] = *(undefined8 *)(*unaff_x20 + 0x14);
        *puVar4 = uVar12;
        puVar5 = (undefined8 *)__Znwm(0x50);
        puVar4[2] = puVar5;
        puVar4[4] = in_stack_00000018;
        puVar4[3] = in_stack_00000010;
        uVar12 = unaff_x23[4];
        uVar14 = unaff_x23[7];
        uVar13 = unaff_x23[6];
        puVar5[5] = unaff_x23[5];
        puVar5[4] = uVar12;
        puVar5[7] = uVar14;
        puVar5[6] = uVar13;
        uVar12 = *(undefined8 *)((long)unaff_x23 + 0x3c);
        *(undefined8 *)((long)puVar5 + 0x44) = *(undefined8 *)((long)unaff_x23 + 0x44);
        *(undefined8 *)((long)puVar5 + 0x3c) = uVar12;
        uVar14 = *unaff_x23;
        uVar13 = unaff_x23[3];
        uVar12 = unaff_x23[2];
        puVar5[1] = unaff_x23[1];
        *puVar5 = uVar14;
        puVar5[3] = uVar13;
        puVar5[2] = uVar12;
        *(undefined1 *)((long)puVar5 + 0x4c) = 0;
        puVar4 = puVar4 + 5;
        unaff_x19[1] = (long)puVar4;
      }
      else {
        puVar4 = (undefined8 *)func_0x00724e78();
      }
      unaff_x19[1] = (long)puVar4;
      plVar9 = unaff_x20;
    }
    lVar7 = plVar9[2];
    if (*(int *)(lVar7 + 8) != *(int *)(unaff_x22 + 0xa88)) {
      lVar7 = 0;
    }
    uVar11 = *(ulong *)(lVar7 + 0x28);
    if (unaff_x27 <= uVar11) {
      func_0x0001748c(&uStack0000000000000040);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x70f2c0);
      (*pcVar2)();
    }
    uVar12 = *(undefined8 *)(lVar7 + 0x20);
    if (uVar11 < 0x17) {
      _uStack0000000000000050 = CONCAT17((char)uVar11,uStack0000000000000050);
      psVar6 = (short *)&uStack0000000000000040;
      if (uVar11 != 0) goto code_r0x0070f058;
    }
    else {
      uVar1 = (uVar11 & 0xfffffffffffffff8) + 8;
      if ((uVar11 | 7) != 0x17) {
        uVar1 = uVar11 | 7;
      }
      psVar6 = (short *)__Znwm(uVar1 + 1);
      _uStack0000000000000050 = uVar1 + 1 | 0x8000000000000000;
      unaff_x27 = 0x7ffffffffffffff8;
      uStack0000000000000040 = psVar6;
      in_stack_00000048 = uVar11;
code_r0x0070f058:
      _memmove(psVar6,uVar12,uVar11);
    }
    *(undefined1 *)((long)psVar6 + uVar11) = 0;
    uVar11 = in_stack_00000048;
    if (-1 < (long)_uStack0000000000000050) {
      uVar11 = _uStack0000000000000050 >> 0x38;
    }
    if (uVar11 == 3) {
      psVar6 = uStack0000000000000040;
      if (-1 < (long)_uStack0000000000000050) {
        psVar6 = unaff_x21;
      }
      if (*psVar6 != 0x7375 || (char)psVar6[1] != 'e') goto code_r0x0070f138;
code_r0x0070f0dc:
      unaff_x24 = *unaff_x20;
      if (*(int *)(unaff_x24 + 8) != *(int *)(unaff_x22 + 0xa88)) {
        param_1 = &uStack0000000000000028;
        goto code_r0x0070f100;
      }
      goto joined_r0x0070f1c4;
    }
    if (uVar11 == 6) {
      psVar6 = uStack0000000000000040;
      if (-1 < (long)_uStack0000000000000050) {
        psVar6 = unaff_x21;
      }
      iVar3 = _memcmp(psVar6,"reason");
      if (iVar3 == 0) goto code_r0x0070f0dc;
    }
code_r0x0070f138:
    unaff_x24 = plVar9[2];
    func_0x00798aa4(&uStack0000000000000028,
                    "Unknown argument \'%s\' for @deprecated. Only string constants for \'use\' and \'reason\' are allowed"
                   );
    puVar4 = (undefined8 *)unaff_x19[1];
    if (puVar4 < (undefined8 *)unaff_x19[2]) {
LAB_0070f160:
      uVar12 = *(undefined8 *)(unaff_x24 + 0xc);
      puVar4[1] = *(undefined8 *)(unaff_x24 + 0x14);
      *puVar4 = uVar12;
      puVar4[3] = in_stack_00000030;
      puVar4[2] = uStack0000000000000028;
      puVar4[4] = CONCAT17(cStack000000000000003f,uStack0000000000000038);
      unaff_x19[1] = (long)(puVar4 + 5);
      goto joined_r0x0070f1c4;
    }
    lVar7 = func_0x00724c94();
  } while( true );
}

