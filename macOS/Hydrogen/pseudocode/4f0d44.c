
void FUN_004f0d44(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5
                 ,long param_6,long param_7,long *param_8,uint param_9,undefined8 param_10,
                 undefined8 param_11)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  long *plVar4;
  long lVar5;
  undefined *puVar6;
  undefined *puVar7;
  undefined8 uVar8;
  ulong uVar9;
  long lVar10;
  undefined **ppuVar11;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000180;
  long in_stack_000001b0;
  long in_stack_000001b8;
  ulong in_stack_000001c0;
  ulong in_stack_000001c8;
  ulong in_stack_000001d0;
  ulong in_stack_000001d8;
  ulong in_stack_000001e0;
  ulong in_stack_000001e8;
  ulong in_stack_000001f0;
  undefined8 in_stack_000001f8;
  undefined1 auStack_7ffffffe [2147483214];
  undefined8 uStack_1b0;
  undefined8 *puStack_180;
  undefined *puStack_178;
  undefined8 uStack_170;
  long lStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined *puStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  long *plStack_130;
  undefined8 uStack_128;
  undefined8 *puStack_120;
  undefined *puStack_118;
  undefined8 uStack_110;
  long lStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined *puStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 *puStack_d8;
  undefined *puStack_d0;
  undefined8 uStack_c8;
  long lStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined *puStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 auStack_71 [17];
  
  if (param_1 != 0) {
    param_4 = 8;
    func_0x00187bd4(in_stack_00000120,in_stack_000001f8);
  }
  if (in_stack_000001b8 != 0) {
    param_4 = 4;
    func_0x00187bd4(in_stack_00000148,in_stack_000001b8 << 3);
  }
  if (in_stack_000001b0 != 0) {
    param_4 = 8;
    func_0x00187bd4(in_stack_00000180,param_11);
  }
  if ((in_stack_000001c0 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_00000080,in_stack_000001c0);
  }
  if ((in_stack_000001c8 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_00000088,in_stack_000001c8);
  }
  if ((in_stack_000001d0 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_00000090,in_stack_000001d0);
  }
  if ((in_stack_000001d8 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_00000098,in_stack_000001d8);
  }
  if ((in_stack_000001e0 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_000000a0,in_stack_000001e0);
  }
  if ((in_stack_000001e8 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_000000a8,in_stack_000001e8);
  }
  if ((in_stack_000001f0 | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(in_stack_000000b0,in_stack_000001f0);
  }
  if ((*(ulong *)(unaff_x29 + -0xf8) | 0x8000000000000000) != 0x8000000000000000) {
    param_4 = 1;
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xf0));
    unaff_x20 = __Unwind_Resume();
    if (unaff_x21 != 0) {
      param_4 = 1;
      func_0x00187bd4();
    }
    func_0x004ea2e4(auStack_7ffffffe + 0x8000020e);
  }
  __Unwind_Resume(unaff_x20);
  auVar12 = func_0x007a2668();
  puVar3 = auVar12._0_8_;
  ppuVar11 = &puStack_118;
  if (((param_9 & 1) == 0) && ((*(uint *)(param_7 + 0x250) >> 7 & 1) != 0)) {
    if ((*(uint *)(param_7 + 0x10) & 1) == 0) {
      func_0x007a23d8(&UNK_008a3952,99,&UNK_009e8240);
      goto LAB_004f12e0;
    }
    if (*(long *)(param_7 + 0x18) == 0) {
      func_0x004f17d0(&puStack_180);
      if (puStack_180 != (undefined8 *)0x8000000000000009) {
        puStack_118 = puStack_178;
        puStack_120 = puStack_180;
        lStack_108 = lStack_168;
        uStack_110 = uStack_170;
        uStack_f8 = uStack_158;
        uStack_100 = uStack_160;
        uStack_e8 = uStack_148;
        puStack_f0 = puStack_150;
        uStack_e0 = uStack_140;
        uVar8 = 0x8000000000000002;
        if (param_5 != 0) {
          uVar8 = 0x8000000000000003;
        }
        *puVar3 = uVar8;
        uVar9 = (ulong)puStack_180 ^ 0x8000000000000000;
        if (8 < uVar9) {
          uVar9 = 4;
        }
        if (1 < uVar9 - 6) {
          if (uVar9 == 4) {
            if (puStack_180 != (undefined8 *)0x0) {
              func_0x00187bd4(puStack_178,puStack_180,1);
            }
            if (lStack_108 != 0) {
              func_0x00187bd4(uStack_100,lStack_108 << 4,8);
            }
            ppuVar11 = &puStack_f0;
          }
          else if (uVar9 != 0) {
            return;
          }
        }
        puVar7 = *ppuVar11;
        if (puVar7 == (undefined *)0x0) {
          return;
        }
        puVar6 = ppuVar11[1];
        goto LAB_004f12a0;
      }
      puVar3[5] = uStack_158;
      puVar3[4] = uStack_160;
      puVar3[7] = uStack_148;
      puVar3[6] = puStack_150;
      puVar3[8] = uStack_140;
      goto LAB_004f1120;
    }
    uStack_90 = 0;
    uStack_88 = 1;
    uStack_80 = 0;
    uStack_110 = 0xe0000020;
    puStack_120 = &uStack_90;
    puStack_118 = &UNK_009e8008;
    iVar2 = func_0x0050f9f0(param_7,&puStack_120);
    if (iVar2 == 0) {
      puVar3[2] = uStack_88;
      puVar3[1] = uStack_90;
      puVar3[3] = uStack_80;
      *puVar3 = 0x8000000000000006;
      return;
    }
  }
  else {
    if (param_5 == 0) {
      lVar5 = func_0x004f15d8(auVar12._8_8_,param_8);
      if (lVar5 != 0) {
        *puVar3 = 0x8000000000000009;
        puVar3[1] = lVar5;
        return;
      }
      lVar5 = *(long *)(param_7 + 0x218);
      lVar10 = *(long *)(param_7 + 0x220);
      if (*param_8 == 2) {
        *param_8 = 0;
        param_8[2] = 0;
        param_8[3] = 8;
        param_8[4] = 0;
        param_8[5] = lVar5;
        param_8[6] = lVar10;
        *(char *)(param_8 + 7) = (char)param_4;
      }
      *puVar3 = 0x8000000000000001;
      puVar3[1] = lVar5;
      puVar3[2] = lVar10;
      return;
    }
    plVar4 = (long *)func_0x00187bd0(0x18,8);
    if (plVar4 != (long *)0x0) {
      if (-1 < param_6) {
        if (param_6 == 0) {
          lVar5 = 1;
        }
        else {
          uStack_1b0 = 1;
          lVar5 = func_0x00187bd0(param_6,1);
          if (lVar5 == 0) goto LAB_004f1318;
        }
        _memcpy(lVar5,param_5,param_6);
        *plVar4 = param_6;
        plVar4[1] = lVar5;
        plVar4[2] = param_6;
        uStack_138 = 1;
        uStack_128 = 1;
        plStack_130 = plVar4;
        func_0x004f17d0(&puStack_d8,auVar12._8_8_,param_4,2,param_7,&uStack_138,0);
        if (puStack_d8 != (undefined8 *)0x8000000000000009) {
          puStack_118 = puStack_d0;
          puStack_120 = puStack_d8;
          lStack_108 = lStack_c0;
          uStack_110 = uStack_c8;
          uStack_f8 = uStack_b0;
          uStack_100 = uStack_b8;
          uStack_e8 = uStack_a0;
          puStack_f0 = puStack_a8;
          uStack_e0 = uStack_98;
          *puVar3 = 0x8000000000000002;
          uVar9 = (ulong)puStack_d8 ^ 0x8000000000000000;
          if (8 < uVar9) {
            uVar9 = 4;
          }
          if (1 < uVar9 - 6) {
            if (uVar9 == 4) {
              if (puStack_d8 != (undefined8 *)0x0) {
                func_0x00187bd4(puStack_d0,puStack_d8,1);
              }
              ppuVar11 = &puStack_f0;
              if (lStack_108 != 0) {
                func_0x00187bd4(uStack_100,lStack_108 << 4,8);
              }
            }
            else if (uVar9 != 0) {
              return;
            }
          }
          puVar7 = *ppuVar11;
          if (puVar7 == (undefined *)0x0) {
            return;
          }
          puVar6 = ppuVar11[1];
LAB_004f12a0:
          func_0x00187bd4(puVar6,puVar7,1);
          return;
        }
        puVar3[5] = uStack_b0;
        puVar3[4] = uStack_b8;
        puVar3[7] = uStack_a0;
        puVar3[6] = puStack_a8;
        puVar3[8] = uStack_98;
        uStack_170 = uStack_c8;
        lStack_168 = lStack_c0;
        puStack_178 = puStack_d0;
LAB_004f1120:
        puVar3[1] = puStack_178;
        *puVar3 = 0x8000000000000009;
        puVar3[3] = lStack_168;
        puVar3[2] = uStack_170;
        return;
      }
      uStack_1b0 = 0;
LAB_004f1318:
      func_0x007a1f00(uStack_1b0,param_6,&UNK_009e80a0);
      goto LAB_004f132c;
    }
LAB_004f12e0:
    func_0x007a1f18(8,0x18);
  }
  func_0x007a2810(&UNK_008a36e0,0x37,auStack_71,&UNK_009e8068,&UNK_009e8038);
LAB_004f132c:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4f1330);
  (*pcVar1)();
}

