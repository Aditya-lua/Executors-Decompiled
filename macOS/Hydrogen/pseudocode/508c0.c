
undefined8 FUN_000508c0(long param_1)

{
  int *piVar1;
  code *pcVar2;
  undefined4 uVar3;
  int iVar4;
  int *piVar5;
  int *piVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 unaff_x19;
  ulong unaff_x20;
  undefined8 *puVar14;
  undefined8 *puVar15;
  int iStack0000000000000008;
  
  uVar12 = param_1 + 8;
  if ((unaff_x20 | 7) != 0x17) {
    uVar12 = unaff_x20 | 7;
  }
  piVar5 = (int *)__Znwm(uVar12 + 1);
  uVar12 = uVar12 + 1 | 0x8000000000000000;
  _iStack0000000000000008 = piVar5;
  _memmove(piVar5);
  *(undefined1 *)((long)piVar5 + unaff_x20) = 0;
  piVar5 = _iStack0000000000000008;
  if (-1 < (long)uVar12) {
    piVar5 = &iStack0000000000000008;
    unaff_x20 = uVar12 >> 0x38;
  }
  if (4 < (long)unaff_x20) {
    piVar1 = (int *)((long)piVar5 + unaff_x20);
    piVar6 = piVar5;
    uVar13 = unaff_x20;
    while (piVar6 = (int *)_memchr(piVar6,0x77,uVar13 - 4), piVar6 != (int *)0x0) {
      if (*piVar6 == 0x2f3a7377 && (char)piVar6[1] == '/') {
        if ((piVar6 != piVar1) && (piVar6 == piVar5)) goto code_r0x000509fc;
        break;
      }
      piVar6 = (int *)((long)piVar6 + 1);
      uVar13 = (long)piVar1 - (long)piVar6;
      if ((long)uVar13 < 5) break;
    }
    if (5 < (long)unaff_x20) {
      piVar6 = piVar5;
      uVar13 = unaff_x20;
      while (piVar6 = (int *)_memchr(piVar6,0x77,uVar13 - 5), piVar6 != (int *)0x0) {
        if (*piVar6 == 0x3a737377 && (short)piVar6[1] == 0x2f2f) {
          if ((piVar6 != piVar1) && (piVar6 == piVar5)) goto code_r0x000509fc;
          break;
        }
        piVar6 = (int *)((long)piVar6 + 1);
        uVar13 = (long)piVar1 - (long)piVar6;
        if ((long)uVar13 < 6) break;
      }
    }
  }
LAB_000509d4:
  func_0x006e63b0();
code_r0x00050dd4:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x50dd8);
  (*pcVar2)();
code_r0x000509fc:
  if (unaff_x20 == 6) {
    iVar4 = _memcmp(piVar5,"wss://",6);
    if (iVar4 != 0) goto code_r0x00050a40;
  }
  else if ((unaff_x20 != 5) || (*piVar5 != 0x2f3a7377 || (char)piVar5[1] != '/')) {
code_r0x00050a40:
    lVar7 = func_0x007414ec();
    if (lVar7 == 0) {
      func_0x006e644c();
    }
    else {
      puVar8 = (undefined8 *)__Znwm(0x88);
      puVar8[4] = 0;
      puVar8[3] = 0;
      puVar8[8] = 0;
      puVar8[7] = 0;
      puVar8[6] = 0;
      puVar8[5] = 0;
      puVar8[2] = 0;
      puVar8[1] = 0;
      puVar8[9] = 0x32aaaba7;
      puVar8[0xb] = 0;
      puVar8[10] = 0;
      puVar8[0xd] = 0;
      puVar8[0xc] = 0;
      puVar8[0xf] = 0;
      puVar8[0xe] = 0;
      puVar8[0x10] = 0;
      *puVar8 = unaff_x19;
      puVar8[4] = lVar7;
      func_0x006e1e34();
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3964();
      func_0x006e383c();
      func_0x006e4c80();
      uVar3 = func_0x006e1c18();
      *(undefined4 *)((long)puVar8 + 0x14) = uVar3;
      uVar9 = func_0x006e33ec();
      func_0x006e1d54();
      puVar8[5] = uVar9;
      func_0x006e1e34();
      func_0x006e3d18();
      func_0x006e3d18();
      func_0x006e3964();
      func_0x006e383c();
      func_0x006e4c80();
      uVar3 = func_0x006e1c18();
      *(undefined4 *)(puVar8 + 3) = uVar3;
      uVar9 = func_0x006e33ec();
      func_0x006e1d54();
      puVar8[6] = uVar9;
      uVar9 = func_0x006e1a48();
      puVar8[1] = uVar9;
      uVar3 = func_0x006e1c18();
      *(undefined4 *)(puVar8 + 2) = uVar3;
      *(undefined1 *)(puVar8 + 7) = 0;
      lVar10 = _malloc(0x4000);
      puVar8[8] = lVar10;
      if (lVar10 == 0) {
        func_0x00051184(puVar8,0);
        func_0x006e644c();
      }
      else {
        func_0x006e1d54();
        func_0x007795c4(lVar7,&UNK_00002712);
        func_0x007795c4(lVar7,0x40);
        func_0x007795c4(lVar7,0x51);
        func_0x007795c4(lVar7,0x8d);
        func_0x007795c4(lVar7,0xd);
        iVar4 = func_0x00741600(lVar7);
        if (iVar4 == 0) {
          *(undefined1 *)(puVar8 + 7) = 1;
          __ZNSt3__15mutex4lockEv(0xa288e8);
          puVar11 = puRam0000000000a33950;
          if (puRam0000000000a33950 == (undefined8 *)0x0) {
            puVar14 = (undefined8 *)0xa33950;
            puVar15 = (undefined8 *)0xa33950;
          }
          else {
            do {
              while (puVar14 = puVar11, puVar8 < (undefined8 *)puVar14[4]) {
                puVar11 = (undefined8 *)*puVar14;
                puVar15 = puVar14;
                if ((undefined8 *)*puVar14 == (undefined8 *)0x0) goto code_r0x00050cc4;
              }
              if (puVar8 <= (undefined8 *)puVar14[4]) goto LAB_00050d0c;
              puVar11 = (undefined8 *)puVar14[1];
            } while ((undefined8 *)puVar14[1] != (undefined8 *)0x0);
            puVar15 = puVar14 + 1;
          }
code_r0x00050cc4:
          puVar11 = (undefined8 *)__Znwm(0x28);
          puVar11[4] = puVar8;
          *puVar11 = 0;
          puVar11[1] = 0;
          puVar11[2] = puVar14;
          *puVar15 = puVar11;
          if ((long *)*plRam0000000000a33948 != (long *)0x0) {
            puVar11 = (undefined8 *)*puVar15;
            plRam0000000000a33948 = (long *)*plRam0000000000a33948;
          }
          func_0x0003767c(puRam0000000000a33950,puVar11);
          lRam0000000000a33958 = lRam0000000000a33958 + 1;
LAB_00050d0c:
          __ZNSt3__15mutex6unlockEv(0xa288e8);
          func_0x006e3c4c();
          func_0x006e3d18();
          func_0x006e4a40();
          if ((long)uVar12 < 0) {
            __ZdlPv(_iStack0000000000000008);
          }
          return 1;
        }
        func_0x00051184(puVar8,0);
        func_0x006e644c();
      }
    }
    goto code_r0x00050dd4;
  }
  goto LAB_000509d4;
}

