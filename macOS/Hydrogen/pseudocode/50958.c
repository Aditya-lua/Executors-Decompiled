
undefined8 FUN_00050958(int *param_1)

{
  code *pcVar1;
  undefined1 in_ZR;
  undefined4 uVar2;
  int iVar3;
  int *piVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  long lVar9;
  uint in_w9;
  undefined8 unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  int unaff_w22;
  undefined8 *puVar10;
  int *unaff_x23;
  undefined8 *puVar11;
  uint unaff_w24;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  while (!(bool)in_ZR || in_w9 != unaff_w24) {
    lVar9 = (long)unaff_x23 - ((long)param_1 + 1);
    if ((lVar9 < 5) ||
       (param_1 = (int *)_memchr((long)param_1 + 1,0x77,lVar9 + -4), param_1 == (int *)0x0))
    goto LAB_00050984;
    in_w9 = (uint)*(byte *)(param_1 + 1);
    in_ZR = *param_1 == unaff_w22;
  }
  if ((param_1 == unaff_x23) || (param_1 != unaff_x20)) {
LAB_00050984:
    if (5 < unaff_x21) {
      while (piVar4 = (int *)_memchr(), piVar4 != (int *)0x0) {
        if (*piVar4 == 0x3a737377 && (short)piVar4[1] == 0x2f2f) {
          if ((piVar4 != unaff_x23) && (piVar4 == unaff_x20)) goto LAB_000509fc;
          break;
        }
        if ((long)unaff_x23 - ((long)piVar4 + 1) < 6) break;
      }
    }
  }
  else {
LAB_000509fc:
    if (unaff_x21 == 6) {
      iVar3 = _memcmp();
      if (iVar3 != 0) goto LAB_00050a40;
    }
    else if ((unaff_x21 != 5) || (*unaff_x20 != unaff_w22 || (char)unaff_x20[1] != '/')) {
LAB_00050a40:
      lVar9 = func_0x007414ec();
      if (lVar9 == 0) {
        func_0x006e644c();
      }
      else {
        puVar5 = (undefined8 *)__Znwm(0x88);
        puVar5[4] = 0;
        puVar5[3] = 0;
        puVar5[8] = 0;
        puVar5[7] = 0;
        puVar5[6] = 0;
        puVar5[5] = 0;
        puVar5[2] = 0;
        puVar5[1] = 0;
        puVar5[9] = 0x32aaaba7;
        puVar5[0xb] = 0;
        puVar5[10] = 0;
        puVar5[0xd] = 0;
        puVar5[0xc] = 0;
        puVar5[0xf] = 0;
        puVar5[0xe] = 0;
        puVar5[0x10] = 0;
        *puVar5 = unaff_x19;
        puVar5[4] = lVar9;
        func_0x006e1e34();
        func_0x006e3d18();
        func_0x006e3d18();
        func_0x006e3964();
        func_0x006e383c();
        func_0x006e4c80();
        uVar2 = func_0x006e1c18();
        *(undefined4 *)((long)puVar5 + 0x14) = uVar2;
        uVar6 = func_0x006e33ec();
        func_0x006e1d54();
        puVar5[5] = uVar6;
        func_0x006e1e34();
        func_0x006e3d18();
        func_0x006e3d18();
        func_0x006e3964();
        func_0x006e383c();
        func_0x006e4c80();
        uVar2 = func_0x006e1c18();
        *(undefined4 *)(puVar5 + 3) = uVar2;
        uVar6 = func_0x006e33ec();
        func_0x006e1d54();
        puVar5[6] = uVar6;
        uVar6 = func_0x006e1a48();
        puVar5[1] = uVar6;
        uVar2 = func_0x006e1c18();
        *(undefined4 *)(puVar5 + 2) = uVar2;
        *(undefined1 *)(puVar5 + 7) = 0;
        lVar7 = _malloc(0x4000);
        puVar5[8] = lVar7;
        if (lVar7 == 0) {
          func_0x00051184(puVar5,0);
          func_0x006e644c();
        }
        else {
          func_0x006e1d54();
          func_0x007795c4(lVar9,&UNK_00002712);
          func_0x007795c4(lVar9,0x40);
          func_0x007795c4(lVar9,0x51);
          func_0x007795c4(lVar9,0x8d);
          func_0x007795c4(lVar9,0xd);
          iVar3 = func_0x00741600(lVar9);
          if (iVar3 == 0) {
            *(undefined1 *)(puVar5 + 7) = 1;
            __ZNSt3__15mutex4lockEv(0xa288e8);
            puVar8 = puRam0000000000a33950;
            if (puRam0000000000a33950 == (undefined8 *)0x0) {
              puVar10 = (undefined8 *)0xa33950;
              puVar11 = (undefined8 *)0xa33950;
            }
            else {
              do {
                while (puVar10 = puVar8, (undefined8 *)puVar10[4] <= puVar5) {
                  if (puVar5 <= (undefined8 *)puVar10[4]) goto code_r0x00050d0c;
                  puVar8 = (undefined8 *)puVar10[1];
                  if ((undefined8 *)puVar10[1] == (undefined8 *)0x0) {
                    puVar11 = puVar10 + 1;
                    goto code_r0x00050cc4;
                  }
                }
                puVar8 = (undefined8 *)*puVar10;
                puVar11 = puVar10;
              } while ((undefined8 *)*puVar10 != (undefined8 *)0x0);
            }
code_r0x00050cc4:
            puVar8 = (undefined8 *)__Znwm(0x28);
            puVar8[4] = puVar5;
            *puVar8 = 0;
            puVar8[1] = 0;
            puVar8[2] = puVar10;
            *puVar11 = puVar8;
            if ((long *)*plRam0000000000a33948 != (long *)0x0) {
              puVar8 = (undefined8 *)*puVar11;
              plRam0000000000a33948 = (long *)*plRam0000000000a33948;
            }
            func_0x0003767c(puRam0000000000a33950,puVar8);
            lRam0000000000a33958 = lRam0000000000a33958 + 1;
code_r0x00050d0c:
            __ZNSt3__15mutex6unlockEv(0xa288e8);
            func_0x006e3c4c();
            func_0x006e3d18();
            func_0x006e4a40();
            if (in_stack_00000018 < 0) {
              __ZdlPv(in_stack_00000008);
            }
            return 1;
          }
          func_0x00051184(puVar5,0);
          func_0x006e644c();
        }
      }
      goto LAB_00050dd4;
    }
  }
  func_0x006e63b0();
LAB_00050dd4:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x50dd8);
  (*pcVar1)();
}

