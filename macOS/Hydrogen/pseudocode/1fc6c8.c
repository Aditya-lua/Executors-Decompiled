
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001fc6c8(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 uVar5;
  code *pcVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000018;
  undefined7 uStack0000000000000019;
  undefined1 uStack0000000000000020;
  undefined7 uStack0000000000000021;
  undefined1 uStack0000000000000028;
  undefined7 uStack0000000000000029;
  undefined1 uStack0000000000000030;
  undefined7 uStack0000000000000031;
  undefined1 uStack0000000000000038;
  undefined7 uStack0000000000000039;
  undefined1 uStack0000000000000040;
  undefined7 uStack0000000000000041;
  undefined1 uStack0000000000000048;
  undefined7 uStack0000000000000049;
  undefined1 in_stack_00000050;
  undefined7 uStack0000000000000051;
  undefined1 in_stack_00000058;
  undefined7 uStack0000000000000059;
  undefined1 in_stack_00000060;
  undefined7 uStack0000000000000061;
  undefined1 in_stack_00000068;
  undefined7 uStack0000000000000069;
  undefined7 uStack_58;
  undefined1 uStack_51;
  undefined7 uStack_50;
  undefined1 uStack_49;
  undefined7 uStack_48;
  undefined1 uStack_41;
  undefined7 uStack_40;
  
  uVar12 = param_2[4];
  uVar1 = *param_2;
  uVar3 = param_2[1];
  func_0x00244c18(&uStack0000000000000000,0x100);
  uStack0000000000000069 = uStack0000000000000049;
  in_stack_00000068 = uStack0000000000000048;
  uStack0000000000000061 = uStack0000000000000041;
  in_stack_00000060 = uStack0000000000000040;
  uStack0000000000000059 = uStack0000000000000039;
  uVar5 = uStack0000000000000018;
  uStack_41 = (undefined1)in_stack_00000010;
  uStack_40 = (undefined7)((ulong)in_stack_00000010 >> 8);
  uStack_49 = (undefined1)in_stack_00000008;
  uStack_48 = (undefined7)((ulong)in_stack_00000008 >> 8);
  uStack_51 = (undefined1)uStack0000000000000000;
  uStack_50 = (undefined7)((ulong)uStack0000000000000000 >> 8);
  in_stack_00000008 = 1;
  uStack0000000000000000 = 1;
  uStack0000000000000041 = uStack0000000000000021;
  uStack0000000000000048 = uStack0000000000000028;
  uStack0000000000000039 = uStack0000000000000019;
  uStack0000000000000040 = uStack0000000000000020;
  uStack0000000000000051 = uStack0000000000000031;
  in_stack_00000058 = uStack0000000000000038;
  uStack0000000000000049 = uStack0000000000000029;
  in_stack_00000050 = uStack0000000000000030;
  uStack0000000000000021 = uStack_50;
  uStack0000000000000028 = uStack_49;
  uStack0000000000000019 = uStack_58;
  uStack0000000000000020 = uStack_51;
  in_stack_00000010 = 0;
  uStack0000000000000018 = 0;
  uStack0000000000000031 = uStack_40;
  uStack0000000000000038 = uVar5;
  uStack0000000000000029 = uStack_48;
  uStack0000000000000030 = uStack_41;
  puVar7 = (undefined8 *)func_0x00187bd0(0x70,8);
  if (puVar7 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x70);
  }
  else {
    puVar7[9] = CONCAT71(uStack0000000000000049,uStack0000000000000048);
    puVar7[8] = CONCAT71(uStack0000000000000041,uStack0000000000000040);
    puVar7[0xb] = CONCAT71(uStack0000000000000059,in_stack_00000058);
    puVar7[10] = CONCAT71(uStack0000000000000051,in_stack_00000050);
    puVar7[0xd] = CONCAT71(uStack0000000000000069,in_stack_00000068);
    puVar7[0xc] = CONCAT71(uStack0000000000000061,in_stack_00000060);
    puVar7[1] = in_stack_00000008;
    *puVar7 = uStack0000000000000000;
    puVar7[3] = CONCAT71(uStack0000000000000019,uStack0000000000000018);
    puVar7[2] = in_stack_00000010;
    puVar7[5] = CONCAT71(uStack0000000000000029,uStack0000000000000028);
    puVar7[4] = CONCAT71(uStack0000000000000021,uStack0000000000000020);
    puVar7[7] = CONCAT71(uStack0000000000000039,uStack0000000000000038);
    puVar7[6] = CONCAT71(uStack0000000000000031,uStack0000000000000030);
    puVar8 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar8 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x10);
    }
    else {
      puVar8[1] = 1;
      *puVar8 = 1;
      uVar14 = param_2[3];
      uVar13 = param_2[2];
      puVar9 = (undefined8 *)func_0x00187bd0(0x10,8);
      if (puVar9 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x10);
      }
      else {
        puVar9[1] = 1;
        *puVar9 = 1;
        uVar2 = param_2[5];
        uVar4 = param_2[6];
        lVar10 = func_0x00187bd0(0x20,8);
        if (lVar10 == 0) {
          func_0x007a1f00(8,0x20,&UNK_009c61e8);
        }
        else {
          uStack0000000000000038 = 0;
          uStack0000000000000039 = 0;
          uStack0000000000000040 = 0;
          uStack0000000000000041 = 0;
          in_stack_00000008 = 1;
          uStack0000000000000000 = 1;
          uStack0000000000000018 = (undefined1)_UNK_007fc128;
          uStack0000000000000019 = (undefined7)((ulong)_UNK_007fc128 >> 8);
          in_stack_00000010 = _UNK_007fc120;
          uStack0000000000000020 = 0;
          uStack0000000000000028 = 4;
          uStack0000000000000029 = 0;
          uStack0000000000000030 = (undefined1)lVar10;
          uStack0000000000000031 = (undefined7)((ulong)lVar10 >> 8);
          uStack0000000000000048 = 4;
          uStack0000000000000049 = 0;
          puVar11 = (undefined8 *)func_0x00187bd0(0x50,8);
          if (puVar11 != (undefined8 *)0x0) {
            puVar11[5] = CONCAT71(uStack0000000000000029,uStack0000000000000028);
            puVar11[4] = CONCAT71(uStack0000000000000021,uStack0000000000000020);
            puVar11[7] = CONCAT71(uStack0000000000000039,uStack0000000000000038);
            puVar11[6] = CONCAT71(uStack0000000000000031,uStack0000000000000030);
            puVar11[9] = CONCAT71(uStack0000000000000049,uStack0000000000000048);
            puVar11[8] = CONCAT71(uStack0000000000000041,uStack0000000000000040);
            puVar11[1] = in_stack_00000008;
            *puVar11 = uStack0000000000000000;
            puVar11[3] = CONCAT71(uStack0000000000000019,uStack0000000000000018);
            puVar11[2] = in_stack_00000010;
            *param_1 = 0;
            param_1[0xc] = puVar7;
            param_1[0xd] = &UNK_009c5c80;
            param_1[0xe] = puVar8;
            param_1[0xf] = &UNK_009c5cc0;
            param_1[0x10] = param_3;
            param_1[0x11] = param_4;
            param_1[3] = 8;
            param_1[2] = 0;
            param_1[0x1a] = uVar14;
            param_1[0x19] = uVar13;
            param_1[0x12] = uVar1;
            param_1[0x13] = uVar3;
            param_1[0x14] = puVar9;
            param_1[0x15] = &UNK_009c5a60;
            param_1[0x1b] = 2;
            param_1[0x1c] = 0;
            param_1[0x16] = uVar2;
            param_1[0x17] = uVar4;
            param_1[4] = 0;
            param_1[5] = 0;
            param_1[0x18] = puVar11;
            param_1[6] = 8;
            param_1[7] = 0;
            param_1[8] = 0;
            param_1[9] = 8;
            param_1[10] = 0;
            param_1[0xb] = uVar12;
            return;
          }
          func_0x007a1f18(8,0x50);
        }
      }
    }
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x1fca48);
  (*pcVar6)();
}

