
/* WARNING: Removing unreachable block (ram,0x00030db0) */
/* WARNING: Removing unreachable block (ram,0x00030dc4) */
/* WARNING: Type propagation algorithm not settling */

byte * FUN_000308ac(void)

{
  ulong uVar1;
  code *pcVar2;
  uint uVar3;
  undefined8 uVar4;
  long lVar5;
  byte *pbVar6;
  byte *pbVar7;
  byte *pbVar8;
  byte *in_x3;
  byte bVar9;
  byte *pbVar10;
  byte *******pppppppbVar11;
  bool bVar12;
  byte *pbVar13;
  uint uVar14;
  undefined1 auVar15 [16];
  byte ******ppppppbStack_b0;
  undefined8 uStack_a8;
  long lStack_a0;
  byte *******pppppppbStack_90;
  ulong uStack_88;
  ulong uStack_80;
  byte *******pppppppbStack_70;
  ulong uStack_68;
  undefined8 uStack_60;
  byte *******pppppppbStack_58;
  ulong uStack_50;
  ulong uStack_48;
  
  __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE();
  pbVar8 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
  uVar4 = ___cxa_throw();
  ___cxa_free_exception();
  auVar15 = __Unwind_Resume(uVar4);
  pbVar6 = auVar15._8_8_;
  lVar5 = auVar15._0_8_;
  if (pbVar6 == pbVar8) {
    return pbVar6;
  }
  if (*pbVar6 == 0x5d) {
    return pbVar6;
  }
  pppppppbStack_70 = (byte *******)0x0;
  uStack_68 = 0;
  uStack_60 = 0;
  if ((pbVar6 + 1 != pbVar8) && (*pbVar6 == 0x5b)) {
    bVar9 = pbVar6[1];
    if (bVar9 == 0x2e) {
      pbVar13 = pbVar6 + 2;
      if (1 < (long)pbVar8 - (long)pbVar13) {
        pbVar10 = pbVar8 + (-4 - (long)pbVar6);
        pbVar6 = pbVar6 + 3;
        pbVar7 = pbVar13;
        if (*pbVar13 == 0x2e) goto code_r0x00030a64;
        do {
          do {
            pbVar7 = pbVar6;
            if (pbVar10 == (byte *)0x0) goto code_r0x00030dc8;
            pbVar10 = pbVar10 + -1;
            pbVar6 = pbVar7 + 1;
          } while (*pbVar7 != 0x2e);
code_r0x00030a64:
        } while (*pbVar6 != 0x5d);
        if (pbVar7 != pbVar8) {
          func_0x000320f0(&pppppppbStack_58,lVar5,pbVar13,pbVar7,0);
          if ((long)uStack_60 < 0) {
            __ZdlPv(pppppppbStack_70);
          }
          uStack_60 = uStack_48;
          uStack_68 = uStack_50;
          pppppppbStack_70 = pppppppbStack_58;
          uVar3 = (uint)(char)(uStack_48 >> 0x38);
          uVar1 = uStack_50;
          if (-1 < (int)uVar3) {
            uVar1 = uStack_48 >> 0x38;
          }
          if (1 < uVar1 - 1) {
            func_0x000320a4();
            goto code_r0x00030ddc;
          }
          pbVar6 = pbVar7 + 2;
          uVar14 = *(uint *)(lVar5 + 0x18) & 0x1f0;
          uVar1 = uStack_50;
          if (-1 < (int)uVar3) {
            uVar1 = (ulong)uVar3 & 0xff;
          }
          if (uVar1 == 0) goto code_r0x00030ae8;
          goto joined_r0x00030b44;
        }
      }
    }
    else {
      if (bVar9 != 0x3a) {
        if (bVar9 == 0x3d) {
          in_x3 = (byte *)func_0x00030e70(lVar5,pbVar6 + 2,pbVar8,in_x3);
          bVar12 = false;
          goto joined_r0x00030978;
        }
        goto code_r0x00030b24;
      }
      if (1 < (long)pbVar8 - (long)(pbVar6 + 2)) {
        pbVar13 = (byte *)0x0;
        pbVar7 = pbVar6;
        if (pbVar6[2] == 0x3a) goto code_r0x000309c8;
        do {
          do {
            if (pbVar8 + (-4 - (long)pbVar6) == pbVar13) goto code_r0x00030dc8;
            pbVar13 = pbVar13 + 1;
            pbVar7 = pbVar6 + (long)pbVar13;
          } while (pbVar7[2] != 0x3a);
code_r0x000309c8:
        } while (pbVar7[3] != 0x5d);
        if (pbVar6 + (long)(pbVar13 + 2) != pbVar8) {
          uVar3 = func_0x00032798(lVar5,pbVar6 + 2,pbVar6 + (long)(pbVar13 + 2),
                                  *(uint *)(lVar5 + 0x18) & 1,0);
          if (uVar3 == 0) {
            func_0x0003274c();
            goto code_r0x00030ddc;
          }
          bVar12 = false;
          *(uint *)(in_x3 + 0xa0) = *(uint *)(in_x3 + 0xa0) | uVar3;
          in_x3 = pbVar6 + (long)(pbVar13 + 4);
          goto joined_r0x00030978;
        }
      }
    }
code_r0x00030dc8:
    func_0x00030890();
code_r0x00030ddc:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x30de0);
    (*pcVar2)();
  }
code_r0x00030b24:
  uVar3 = 0;
  uVar14 = *(uint *)(lVar5 + 0x18) & 0x1f0;
code_r0x00030ae8:
  if ((uVar14 | 0x40) == 0x40) {
    bVar9 = *pbVar6;
    if (bVar9 != 0x5c) goto code_r0x00030c00;
    if (uVar14 == 0) {
      pbVar6 = (byte *)func_0x000311d8(lVar5,pbVar6 + 1,pbVar8,&pppppppbStack_70,in_x3);
    }
    else {
      pbVar6 = (byte *)func_0x00031394(lVar5,pbVar6 + 1,pbVar8,&pppppppbStack_70);
    }
joined_r0x00030b44:
    if (pbVar6 != pbVar8) goto code_r0x00030b48;
code_r0x00030b54:
    if ((long)uStack_60 < 0) {
      if (uStack_68 != 0) {
        pppppppbVar11 = pppppppbStack_70;
        if (uStack_68 != 1) goto code_r0x00030c2c;
code_r0x00030b88:
        func_0x0002f0ac(in_x3,(long)(char)*(byte *)pppppppbVar11);
      }
    }
    else if (uStack_60._7_1_ != '\0') {
      pppppppbVar11 = (byte *******)&pppppppbStack_70;
      if (uStack_60._7_1_ == '\x01') goto code_r0x00030b88;
code_r0x00030c2c:
      func_0x00031cc4(in_x3,(long)(char)*(byte *)pppppppbVar11,
                      (long)(char)*(byte *)((long)pppppppbVar11 + 1));
    }
  }
  else {
    bVar9 = *pbVar6;
code_r0x00030c00:
    if ((int)uVar3 < 0) {
      uStack_68 = 1;
      *(byte *)pppppppbStack_70 = bVar9;
      *(byte *)((long)pppppppbStack_70 + 1) = 0;
    }
    else {
      uStack_60 = CONCAT17(1,(undefined7)uStack_60);
      pppppppbStack_70._0_2_ = (ushort)bVar9;
    }
    pbVar6 = pbVar6 + 1;
    if (pbVar6 == pbVar8) goto code_r0x00030b54;
code_r0x00030b48:
    if ((((*pbVar6 == 0x5d) || (pbVar13 = pbVar6 + 1, pbVar13 == pbVar8)) || (*pbVar6 != 0x2d)) ||
       (*pbVar13 == 0x5d)) goto code_r0x00030b54;
    pppppppbStack_58 = (byte *******)0x0;
    uStack_50 = 0;
    uStack_48 = 0;
    pbVar7 = pbVar6 + 2;
    if (((pbVar7 == pbVar8) || (*pbVar13 != 0x5b)) || (*pbVar7 != 0x2e)) {
      if ((uVar14 | 0x40) == 0x40) {
        bVar9 = *pbVar13;
        if (bVar9 == 0x5c) {
          if (uVar14 == 0) {
            pbVar7 = (byte *)func_0x000311d8(lVar5,pbVar7,pbVar8,&pppppppbStack_58,in_x3);
          }
          else {
            pbVar7 = (byte *)func_0x00031394(lVar5,pbVar7,pbVar8,&pppppppbStack_58);
          }
          goto code_r0x00030d28;
        }
      }
      else {
        bVar9 = *pbVar13;
      }
      uStack_48 = 0x100000000000000;
      pppppppbStack_58 = (byte *******)(ulong)bVar9;
    }
    else {
      pbVar7 = (byte *)func_0x000310dc(lVar5,pbVar6 + 3,pbVar8,&pppppppbStack_58);
    }
code_r0x00030d28:
    uStack_88 = uStack_68;
    pppppppbStack_90 = pppppppbStack_70;
    uStack_80 = uStack_60;
    uStack_68 = 0;
    uStack_60 = 0;
    pppppppbStack_70 = (byte *******)0x0;
    uStack_a8 = uStack_50;
    ppppppbStack_b0 = (byte ******)pppppppbStack_58;
    lStack_a0 = uStack_48;
    pppppppbStack_58 = (byte *******)0x0;
    uStack_50 = 0;
    uStack_48 = 0;
    func_0x00031798(in_x3,&pppppppbStack_90,&ppppppbStack_b0);
    if (lStack_a0 < 0) {
      __ZdlPv(ppppppbStack_b0);
    }
    pbVar6 = pbVar7;
    if ((long)uStack_80 < 0) {
      __ZdlPv(pppppppbStack_90);
    }
  }
  bVar12 = true;
joined_r0x00030978:
  if ((long)uStack_60 < 0) {
    __ZdlPv(pppppppbStack_70);
  }
  if (!bVar12) {
    return in_x3;
  }
  return pbVar6;
}

