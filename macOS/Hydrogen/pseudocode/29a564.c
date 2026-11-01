
undefined1 *
FUN_0029a564(undefined1 *param_1,undefined8 param_2,ulong param_3,long param_4,ulong *param_5,
            uint *param_6,int param_7,code *param_8)

{
  byte bVar1;
  byte bVar2;
  ulong *puVar3;
  ulong *puVar4;
  undefined1 *puVar5;
  code *pcVar6;
  ulong uVar7;
  ulong uVar8;
  byte *unaff_x20;
  ulong unaff_x21;
  long lVar9;
  byte *pbVar10;
  long lVar11;
  byte *pbVar12;
  byte *unaff_x23;
  uint uVar13;
  byte *unaff_x24;
  ulong uVar14;
  undefined8 uVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined7 uStack0000000000000001;
  undefined1 uStack0000000000000008;
  long in_stack_00000018;
  
  if (*param_6 == 0) {
    pcVar6 = param_8;
    if (param_3 != 0) {
      uVar14 = param_3;
      if (param_7 == 0) {
        do {
          uVar15 = *(undefined8 *)(unaff_x20 + 8);
          uStack0000000000000008 = (undefined1)uVar15;
          uStack0000000000000001 = (undefined7)((ulong)*(undefined8 *)unaff_x20 >> 8);
          param_3 = unaff_x21;
          param_1 = (undefined1 *)(*param_8)();
          bVar1 = *unaff_x24;
          *unaff_x23 = *unaff_x20 ^ bVar1;
          *(ulong *)unaff_x20 = CONCAT17(uStack0000000000000008,uStack0000000000000001);
          *(undefined8 *)(unaff_x20 + 7) = uVar15;
          unaff_x20[0xf] = bVar1;
          uVar14 = uVar14 - 1;
          unaff_x23 = unaff_x23 + 1;
          unaff_x24 = unaff_x24 + 1;
        } while (uVar14 != 0);
      }
      else {
        do {
          uVar15 = *(undefined8 *)(unaff_x20 + 8);
          uStack0000000000000008 = (undefined1)uVar15;
          uStack0000000000000001 = (undefined7)((ulong)*(undefined8 *)unaff_x20 >> 8);
          param_3 = unaff_x21;
          param_1 = (undefined1 *)(*param_8)();
          bVar1 = *unaff_x24;
          bVar2 = *unaff_x20;
          *unaff_x23 = bVar2 ^ bVar1;
          *(ulong *)unaff_x20 = CONCAT17(uStack0000000000000008,uStack0000000000000001);
          *(undefined8 *)(unaff_x20 + 7) = uVar15;
          unaff_x20[0xf] = bVar2 ^ bVar1;
          uVar14 = uVar14 - 1;
          unaff_x23 = unaff_x23 + 1;
          unaff_x24 = unaff_x24 + 1;
        } while (uVar14 != 0);
      }
    }
    param_8 = pcVar6;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
      return param_1;
    }
  }
  else {
    func_0x0079d984();
  }
  auVar16 = ___stack_chk_fail();
  puVar5 = auVar16._0_8_;
  if ((((puVar5 == (undefined1 *)0x0) || (auVar16._8_8_ == 0)) || (param_4 == 0)) ||
     (param_5 == (ulong *)0x0)) {
    auVar17 = func_0x0079d9d0();
    puVar5 = auVar17._0_8_;
    if (((param_6 == (uint *)0x0) || (puVar5 == (undefined1 *)0x0)) ||
       ((auVar17._8_8_ == 0 || ((param_4 == 0 || (param_5 == (ulong *)0x0)))))) {
      func_0x0079d9d0();
      if (param_3 < 0x10) {
        return (undefined1 *)0x0;
      }
      if (param_7 == 0) {
        func_0x00379780();
        return (undefined1 *)((long)&MACH_HEADER.magic + 1);
      }
      func_0x00378ee0();
      return (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    uVar13 = *param_6;
    if (param_7 == 0) {
      if (uVar13 == 0 || param_3 == 0) {
        uVar14 = param_3 - 0x10;
      }
      else {
        do {
          uVar14 = param_3;
          pbVar10 = auVar17._8_8_;
          pbVar12 = auVar17._0_8_;
          bVar1 = *pbVar12;
          auVar17._8_8_ = pbVar10 + 1;
          auVar17._0_8_ = pbVar12 + 1;
          *pbVar10 = bVar1 ^ *(byte *)((long)param_5 + (ulong)uVar13);
          *(byte *)((long)param_5 + (ulong)uVar13) = bVar1;
          param_3 = uVar14 - 1;
          uVar13 = uVar13 + 1 & 0xf;
          if (uVar13 == 0) break;
        } while (uVar14 != 1);
        uVar14 = uVar14 - 0x11;
      }
      if (0xf < param_3) {
        puVar5 = (undefined1 *)(*param_8)(param_5,param_5,param_4);
        if (uVar13 < 0x10) {
          uVar7 = (ulong)uVar13;
          uVar8 = *(ulong *)(auVar17._0_8_ + uVar7);
          *(ulong *)(auVar17._8_8_ + uVar7) = *(ulong *)((long)param_5 + uVar7) ^ uVar8;
          *(ulong *)((long)param_5 + uVar7) = uVar8;
          if (uVar13 < 8) {
            lVar9 = uVar7 + 8;
            uVar7 = *(ulong *)(auVar17._0_8_ + lVar9);
            *(ulong *)(auVar17._8_8_ + lVar9) = *(ulong *)((long)param_5 + lVar9) ^ uVar7;
            *(ulong *)((long)param_5 + lVar9) = uVar7;
          }
        }
        while( true ) {
          lVar9 = auVar17._8_8_;
          lVar11 = auVar17._0_8_;
          puVar4 = (ulong *)(lVar11 + 0x10);
          puVar3 = (ulong *)(lVar9 + 0x10);
          auVar17._8_8_ = puVar3;
          auVar17._0_8_ = puVar4;
          if (uVar14 < 0x10) break;
          puVar5 = (undefined1 *)(*param_8)(param_5,param_5,param_4);
          uVar7 = *puVar4;
          *puVar3 = *param_5 ^ uVar7;
          *param_5 = uVar7;
          uVar7 = *(ulong *)(lVar11 + 0x18);
          *(ulong *)(lVar9 + 0x18) = param_5[1] ^ uVar7;
          param_5[1] = uVar7;
          uVar14 = uVar14 - 0x10;
        }
        uVar13 = 0;
        param_3 = uVar14;
      }
      if (param_3 != 0) {
        puVar5 = (undefined1 *)(*param_8)(param_5,param_5,param_4);
        do {
          uVar14 = (ulong)uVar13;
          bVar1 = *(byte *)(auVar17._0_8_ + uVar14);
          *(byte *)(auVar17._8_8_ + uVar14) = bVar1 ^ *(byte *)((long)param_5 + uVar14);
          *(byte *)((long)param_5 + uVar14) = bVar1;
          uVar13 = uVar13 + 1;
          param_3 = param_3 - 1;
        } while (param_3 != 0);
      }
    }
    else {
      if (uVar13 == 0 || param_3 == 0) {
        uVar14 = param_3 - 0x10;
      }
      else {
        do {
          uVar14 = param_3;
          pbVar10 = auVar17._8_8_;
          pbVar12 = auVar17._0_8_;
          bVar1 = *(byte *)((long)param_5 + (ulong)uVar13) ^ *pbVar12;
          *(byte *)((long)param_5 + (ulong)uVar13) = bVar1;
          auVar17._8_8_ = pbVar10 + 1;
          auVar17._0_8_ = pbVar12 + 1;
          *pbVar10 = bVar1;
          param_3 = uVar14 - 1;
          uVar13 = uVar13 + 1 & 0xf;
          if (uVar13 == 0) break;
        } while (uVar14 != 1);
        uVar14 = uVar14 - 0x11;
      }
      if (0xf < param_3) {
        puVar5 = (undefined1 *)(*param_8)(param_5,param_5,param_4);
        if (uVar13 < 0x10) {
          uVar7 = (ulong)uVar13;
          uVar8 = *(ulong *)(auVar17._0_8_ + uVar7) ^ *(ulong *)((long)param_5 + uVar7);
          *(ulong *)((long)param_5 + uVar7) = uVar8;
          *(ulong *)(auVar17._8_8_ + uVar7) = uVar8;
          if (uVar13 < 8) {
            lVar9 = uVar7 + 8;
            uVar7 = *(ulong *)(auVar17._0_8_ + lVar9) ^ *(ulong *)((long)param_5 + lVar9);
            *(ulong *)((long)param_5 + lVar9) = uVar7;
            *(ulong *)(auVar17._8_8_ + lVar9) = uVar7;
          }
        }
        while( true ) {
          lVar9 = auVar17._8_8_;
          lVar11 = auVar17._0_8_;
          puVar4 = (ulong *)(lVar11 + 0x10);
          puVar3 = (ulong *)(lVar9 + 0x10);
          auVar17._8_8_ = puVar3;
          auVar17._0_8_ = puVar4;
          if (uVar14 < 0x10) break;
          puVar5 = (undefined1 *)(*param_8)(param_5,param_5,param_4);
          uVar7 = *puVar4 ^ *param_5;
          *param_5 = uVar7;
          *puVar3 = uVar7;
          uVar7 = *(ulong *)(lVar11 + 0x18) ^ param_5[1];
          param_5[1] = uVar7;
          *(ulong *)(lVar9 + 0x18) = uVar7;
          uVar14 = uVar14 - 0x10;
        }
        uVar13 = 0;
        param_3 = uVar14;
      }
      if (param_3 != 0) {
        puVar5 = (undefined1 *)(*param_8)(param_5,param_5,param_4);
        do {
          uVar14 = (ulong)uVar13;
          bVar1 = *(byte *)((long)param_5 + uVar14) ^ *(byte *)(auVar17._0_8_ + uVar14);
          *(byte *)((long)param_5 + uVar14) = bVar1;
          *(byte *)(auVar17._8_8_ + uVar14) = bVar1;
          uVar13 = uVar13 + 1;
          param_3 = param_3 - 1;
        } while (param_3 != 0);
      }
    }
    *param_6 = uVar13;
    return puVar5;
  }
  uVar13 = *param_6;
  if (param_7 == 0) {
    if (param_3 == 0 || uVar13 == 0) {
      uVar14 = param_3 - 0x10;
    }
    else {
      do {
        uVar14 = param_3;
        pbVar10 = auVar16._8_8_;
        pbVar12 = auVar16._0_8_;
        bVar1 = *pbVar12;
        auVar16._8_8_ = pbVar10 + 1;
        auVar16._0_8_ = pbVar12 + 1;
        *pbVar10 = bVar1 ^ *(byte *)((long)param_5 + (ulong)uVar13);
        *(byte *)((long)param_5 + (ulong)uVar13) = bVar1;
        param_3 = uVar14 - 1;
        uVar13 = uVar13 + 1 & 0xf;
        if (uVar13 == 0) break;
      } while (uVar14 != 1);
      uVar14 = uVar14 - 0x11;
    }
    if (0xf < param_3) {
      puVar5 = (undefined1 *)func_0x002967ec(param_5,param_5,param_4);
      if (uVar13 < 0x10) {
        uVar7 = (ulong)uVar13;
        uVar8 = *(ulong *)(auVar16._0_8_ + uVar7);
        *(ulong *)(auVar16._8_8_ + uVar7) = *(ulong *)((long)param_5 + uVar7) ^ uVar8;
        *(ulong *)((long)param_5 + uVar7) = uVar8;
        if (uVar13 < 8) {
          lVar9 = uVar7 + 8;
          uVar7 = *(ulong *)(auVar16._0_8_ + lVar9);
          *(ulong *)(auVar16._8_8_ + lVar9) = *(ulong *)((long)param_5 + lVar9) ^ uVar7;
          *(ulong *)((long)param_5 + lVar9) = uVar7;
        }
      }
      while( true ) {
        lVar9 = auVar16._8_8_;
        lVar11 = auVar16._0_8_;
        puVar4 = (ulong *)(lVar11 + 0x10);
        puVar3 = (ulong *)(lVar9 + 0x10);
        auVar16._8_8_ = puVar3;
        auVar16._0_8_ = puVar4;
        if (uVar14 < 0x10) break;
        puVar5 = (undefined1 *)func_0x002967ec(param_5,param_5,param_4);
        uVar7 = *puVar4;
        *puVar3 = *param_5 ^ uVar7;
        *param_5 = uVar7;
        uVar7 = *(ulong *)(lVar11 + 0x18);
        *(ulong *)(lVar9 + 0x18) = param_5[1] ^ uVar7;
        param_5[1] = uVar7;
        uVar14 = uVar14 - 0x10;
      }
      uVar13 = 0;
      param_3 = uVar14;
    }
    if (param_3 != 0) {
      puVar5 = (undefined1 *)func_0x002967ec(param_5,param_5,param_4);
      do {
        uVar14 = (ulong)uVar13;
        bVar1 = *(byte *)(auVar16._0_8_ + uVar14);
        *(byte *)(auVar16._8_8_ + uVar14) = bVar1 ^ *(byte *)((long)param_5 + uVar14);
        *(byte *)((long)param_5 + uVar14) = bVar1;
        uVar13 = uVar13 + 1;
        param_3 = param_3 - 1;
      } while (param_3 != 0);
    }
  }
  else {
    if (param_3 == 0 || uVar13 == 0) {
      uVar14 = param_3 - 0x10;
    }
    else {
      do {
        uVar14 = param_3;
        pbVar10 = auVar16._8_8_;
        pbVar12 = auVar16._0_8_;
        bVar1 = *(byte *)((long)param_5 + (ulong)uVar13) ^ *pbVar12;
        *(byte *)((long)param_5 + (ulong)uVar13) = bVar1;
        auVar16._8_8_ = pbVar10 + 1;
        auVar16._0_8_ = pbVar12 + 1;
        *pbVar10 = bVar1;
        param_3 = uVar14 - 1;
        uVar13 = uVar13 + 1 & 0xf;
        if (uVar13 == 0) break;
      } while (uVar14 != 1);
      uVar14 = uVar14 - 0x11;
    }
    if (0xf < param_3) {
      puVar5 = (undefined1 *)func_0x002967ec(param_5,param_5,param_4);
      if (uVar13 < 0x10) {
        uVar7 = (ulong)uVar13;
        uVar8 = *(ulong *)(auVar16._0_8_ + uVar7) ^ *(ulong *)((long)param_5 + uVar7);
        *(ulong *)((long)param_5 + uVar7) = uVar8;
        *(ulong *)(auVar16._8_8_ + uVar7) = uVar8;
        if (uVar13 < 8) {
          lVar9 = uVar7 + 8;
          uVar7 = *(ulong *)(auVar16._0_8_ + lVar9) ^ *(ulong *)((long)param_5 + lVar9);
          *(ulong *)((long)param_5 + lVar9) = uVar7;
          *(ulong *)(auVar16._8_8_ + lVar9) = uVar7;
        }
      }
      while( true ) {
        lVar9 = auVar16._8_8_;
        lVar11 = auVar16._0_8_;
        puVar4 = (ulong *)(lVar11 + 0x10);
        puVar3 = (ulong *)(lVar9 + 0x10);
        auVar16._8_8_ = puVar3;
        auVar16._0_8_ = puVar4;
        if (uVar14 < 0x10) break;
        puVar5 = (undefined1 *)func_0x002967ec(param_5,param_5,param_4);
        uVar7 = *puVar4 ^ *param_5;
        *param_5 = uVar7;
        *puVar3 = uVar7;
        uVar7 = *(ulong *)(lVar11 + 0x18) ^ param_5[1];
        param_5[1] = uVar7;
        *(ulong *)(lVar9 + 0x18) = uVar7;
        uVar14 = uVar14 - 0x10;
      }
      uVar13 = 0;
      param_3 = uVar14;
    }
    if (param_3 != 0) {
      puVar5 = (undefined1 *)func_0x002967ec(param_5,param_5,param_4);
      do {
        uVar14 = (ulong)uVar13;
        bVar1 = *(byte *)((long)param_5 + uVar14) ^ *(byte *)(auVar16._0_8_ + uVar14);
        *(byte *)((long)param_5 + uVar14) = bVar1;
        *(byte *)(auVar16._8_8_ + uVar14) = bVar1;
        uVar13 = uVar13 + 1;
        param_3 = param_3 - 1;
      } while (param_3 != 0);
    }
  }
  *param_6 = uVar13;
  return puVar5;
}

