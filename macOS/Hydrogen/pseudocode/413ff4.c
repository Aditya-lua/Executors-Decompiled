
void FUN_00413ff4(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  bool bVar2;
  ulong uVar3;
  code *pcVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *extraout_x1;
  long *extraout_x8;
  ulong *puVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  undefined8 uStack_c8;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  ulong uStack_90;
  ulong uStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  ulong uStack_68;
  
  func_0x00187bd4(param_1,param_2,1);
  __Unwind_Resume();
  func_0x0042eea4();
  plVar5 = (long *)__NSGetEnviron();
  plVar5 = (long *)*plVar5;
  lVar11 = 8;
  lStack_a8 = 0;
  lStack_a0 = 8;
  lStack_98 = 0;
  if (plVar5 == (long *)0x0) {
    lVar10 = 0;
  }
  else {
    lVar12 = *plVar5;
    if (lVar12 == 0) {
      lVar10 = 0;
      lVar11 = 8;
    }
    else {
      lVar10 = 0;
      lVar11 = 8;
      uStack_c8 = 1;
      do {
        uVar6 = _strlen(lVar12);
        if (uVar6 != 0) {
          if (uVar6 < 0x11) {
            if (uVar6 != 1) {
              lVar13 = 0;
              do {
                if (*(char *)(lVar12 + 1 + lVar13) == '=') goto LAB_004140fc;
                lVar13 = lVar13 + 1;
              } while (uVar6 - 1 != lVar13);
            }
          }
          else {
            auVar14 = func_0x0046b0fc(0x3d);
            lVar13 = auVar14._8_8_;
            if ((auVar14._0_8_ & 1) != 0) {
LAB_004140fc:
              uVar9 = lVar13 + 1;
              if (uVar6 < uVar9) {
                func_0x007a28b0(uVar9,uVar6,&UNK_009db708);
                goto code_r0x004142d4;
              }
              if ((long)uVar9 < 0) {
                uStack_c8 = 0;
code_r0x004142a4:
                func_0x007a1f00(uStack_c8,uVar9,&UNK_009d9be8);
                goto code_r0x004142d4;
              }
              if (uVar9 == 0) {
                uVar7 = 1;
              }
              else {
                uVar7 = func_0x00187bd0(uVar9,1);
                if (uVar7 == 0) goto code_r0x004142a4;
              }
              _memcpy(uVar7,lVar12,uVar9);
              uVar1 = lVar13 + 2;
              if (uVar6 <= uVar9) {
                func_0x007a28a4(uVar1,uVar6,&UNK_009db720);
                goto code_r0x004142d4;
              }
              uVar3 = uVar6 - uVar1;
              if ((long)uVar3 < 0) {
                uStack_c8 = 0;
code_r0x004142c0:
                func_0x007a1f00(uStack_c8,uVar3,&UNK_009d9be8);
code_r0x004142d4:
                    /* WARNING: Does not return */
                pcVar4 = (code *)SoftwareBreakpoint(1,0x4142d8);
                (*pcVar4)();
              }
              if (uVar6 == uVar1) {
                uVar6 = 1;
              }
              else {
                uVar6 = func_0x00187bd0(uVar3,1);
                if (uVar6 == 0) goto code_r0x004142c0;
              }
              _memcpy(uVar6,lVar12 + uVar1,uVar3);
              uStack_90 = uVar9;
              uStack_88 = uVar7;
              uStack_80 = uVar9;
              uStack_78 = uVar3;
              uStack_70 = uVar6;
              uStack_68 = uVar3;
              if (lVar10 == lStack_a8) {
                func_0x00404378(&lStack_a8,&UNK_009db6f0);
                lVar11 = lStack_a0;
              }
              puVar8 = (ulong *)(lVar11 + lVar10 * 0x30);
              puVar8[3] = uStack_78;
              puVar8[2] = uStack_80;
              puVar8[5] = uStack_68;
              puVar8[4] = uStack_70;
              puVar8[1] = uStack_88;
              *puVar8 = uStack_90;
              lVar10 = lVar10 + 1;
              lStack_98 = lVar10;
            }
          }
        }
        plVar5 = plVar5 + 1;
        lVar12 = *plVar5;
      } while (lVar12 != 0);
    }
  }
  lVar12 = lStack_a8;
  uVar6 = *extraout_x1;
  while( true ) {
    while (((uint)uVar6 >> 1 & 1) == 0) {
      uVar9 = 0;
      if (uVar6 - 0x11 != 0) {
        uVar9 = uVar6 - 0x11 | 1;
      }
      bVar2 = *extraout_x1 == uVar6;
      uVar6 = *extraout_x1;
      if (bVar2) {
        *extraout_x1 = uVar9;
        goto code_r0x00414234;
      }
    }
    if (((uint)uVar6 >> 3 & 1) == 0) break;
    uVar9 = uVar6 & 0xfffffffffffffff6;
    bVar2 = *extraout_x1 == uVar6;
    uVar6 = *extraout_x1;
    if (bVar2) {
      *extraout_x1 = uVar9;
code_r0x00414234:
      *extraout_x8 = lVar11;
      extraout_x8[1] = lVar11;
      extraout_x8[2] = lVar12;
      extraout_x8[3] = lVar11 + lVar10 * 0x30;
      return;
    }
  }
  func_0x007a1a98(extraout_x1);
  goto code_r0x00414234;
}

