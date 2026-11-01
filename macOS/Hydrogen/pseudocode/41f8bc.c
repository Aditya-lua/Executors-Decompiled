
undefined1  [16] FUN_0041f8bc(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long *plVar4;
  ulong uVar5;
  uint *puVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong uVar9;
  long unaff_x23;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [12];
  ulong uStack_68;
  
  func_0x003f67e4();
  __Unwind_Resume();
  auVar14 = func_0x007a2668();
  plVar4 = auVar14._0_8_;
  uStack_68 = 0;
  lVar2 = *plVar4;
  uVar3 = plVar4[1];
  if (0x7ffffffd < uVar3) {
    uVar3 = 0x7ffffffe;
  }
  uVar9 = plVar4[2];
  uVar5 = plVar4[3];
  uVar10 = plVar4[4];
  do {
    while( true ) {
      uVar8 = 1;
      if (uVar9 < uVar5) break;
      uVar5 = _read(0,lVar2,uVar3);
      if (uVar5 != 0xffffffffffffffff) {
        uVar11 = uVar5;
        if (uVar5 <= uVar10) {
          uVar11 = uVar10;
        }
        uVar9 = 0;
        plVar4[2] = 0;
        plVar4[3] = uVar5;
        plVar4[4] = uVar11;
        uVar10 = uVar11;
        break;
      }
      puVar6 = (uint *)___error();
      uVar5 = 0;
      uVar11 = (ulong)*puVar6 << 0x20 | 2;
      uVar9 = 0;
      plVar4[2] = 0;
      plVar4[3] = 0;
      plVar4[4] = uVar10;
      if (uVar11 == 0) break;
      uVar5 = 0;
      uVar9 = 0;
      if (uVar11 == 0x900000002) break;
LAB_0041f9dc:
      uVar7 = uVar11 & 3;
      if (uVar7 < 2) {
        if (uVar7 == 0) {
          if (*(char *)(uVar11 + 0x10) != '#') goto code_r0x0041fafc;
        }
        else {
          if (*(char *)(uVar11 + 0xf) != '#') goto code_r0x0041fafc;
          unaff_x23 = *(long *)(uVar11 - 1);
          puVar12 = *(undefined8 **)(uVar11 + 7);
          if ((code *)*puVar12 != (code *)0x0) {
            (*(code *)*puVar12)(unaff_x23);
          }
          if (puVar12[1] != 0) {
            func_0x00187bd4(unaff_x23,puVar12[1],puVar12[2]);
          }
          func_0x00187bd4(uVar11 - 1,0x18,8);
        }
      }
      else if (uVar7 == 2) {
        if (uVar11 >> 0x20 != 4) goto code_r0x0041fafc;
      }
      else if (uVar11 >> 0x20 != 0x23) goto code_r0x0041fafc;
    }
    uVar11 = uVar5 - uVar9;
    if (lVar2 == 0) goto LAB_0041f9dc;
    lVar1 = lVar2 + uVar9;
    if (uVar11 < 0x10) {
      if (uVar11 != 0) {
        uVar7 = 0;
        do {
          if ((uint)*(byte *)(lVar1 + uVar7) == (auVar14._8_4_ & 0xff)) goto LAB_0041fb28;
          uVar7 = uVar7 + 1;
        } while (uVar11 != uVar7);
      }
    }
    else {
      auVar13 = func_0x0046b0fc(auVar14._8_4_,lVar1,uVar11);
      uVar7 = auVar13._8_8_;
      if ((auVar13._0_8_ & 1) != 0) {
        if (uVar7 == 0xffffffffffffffff) {
          func_0x007a28fc(&UNK_009da7b8);
code_r0x0041fb9c:
          func_0x007a28b0(unaff_x23,uVar11,&UNK_009da7b8);
code_r0x0041fbb0:
          func_0x007a0000(param_3,uVar10,unaff_x23,1,1);
          uVar10 = param_3[2];
        }
        else {
LAB_0041fb28:
          unaff_x23 = uVar7 + 1;
          if (uVar11 <= uVar7) goto code_r0x0041fb9c;
          uVar10 = param_3[2];
          if (*param_3 - uVar10 <= uVar7) goto code_r0x0041fbb0;
        }
        _memcpy(param_3[1] + uVar10,lVar1,unaff_x23);
        param_3[2] = uVar10 + unaff_x23;
        if (uVar9 + unaff_x23 <= uVar5) {
          uVar5 = uVar9 + unaff_x23;
        }
        plVar4[2] = uVar5;
        uStack_68 = unaff_x23 + uStack_68;
        break;
      }
    }
    unaff_x23 = param_3[2];
    if ((ulong)(*param_3 - unaff_x23) < uVar11) {
      func_0x007a0000(param_3,unaff_x23,uVar11,1,1);
      unaff_x23 = param_3[2];
    }
    _memcpy(param_3[1] + unaff_x23,lVar1,uVar11);
    param_3[2] = unaff_x23 + uVar11;
    uVar7 = uVar9 + uVar11;
    uVar9 = uVar5;
    if (uVar7 <= uVar5) {
      uVar9 = uVar7;
    }
    plVar4[2] = uVar9;
    uStack_68 = uVar11 + uStack_68;
  } while (uVar11 != 0);
  uVar8 = 0;
  uVar11 = uStack_68;
code_r0x0041fafc:
  auVar13._8_8_ = uVar11;
  auVar13._0_8_ = uVar8;
  return auVar13;
}

