
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001c9f30(undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  undefined1 (*pauVar5) [16];
  ulong uVar6;
  undefined8 *puVar7;
  ulong *puVar8;
  undefined1 *puVar9;
  ulong uVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000028;
  undefined1 *in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  undefined1 (*in_stack_00000058) [16];
  
  auVar13 = func_0x00255a98(&UNK_0081e350);
  if (auVar13._0_8_ == 0) {
    puVar7 = (undefined8 *)func_0x00187bd0(0x15,1);
    uVar3 = _UNK_0081e385;
    if (puVar7 != (undefined8 *)0x0) {
      puVar7[1] = CONCAT35(_UNK_0081e392,_UNK_0081e38d);
      *puVar7 = uVar3;
      *(ulong *)((long)puVar7 + 0xd) = CONCAT53(_UNK_0081e395,_UNK_0081e392);
      *param_1 = 0x800000000000001e;
      param_1[1] = 0x15;
      param_1[2] = puVar7;
      param_1[3] = 0x15;
      return;
    }
    func_0x007a1f00(1,0x15,&UNK_009c28e8);
  }
  else {
    _uStack0000000000000010 = auVar13;
    uVar3 = func_0x00276030((ulong)&uStack0000000000000010 | 8);
    uVar10 = *(ulong *)(uStack0000000000000010 + 8);
    uStack0000000000000040 = uVar10;
    if ((long)uVar10 < 0) {
      uVar11 = 0;
LAB_001ca1c0:
      func_0x007a1f00(uVar11,uVar10,&UNK_009ca8e0);
      goto LAB_001ca218;
    }
    if (uVar10 == 0) {
      puVar4 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      iVar2 = func_0x002d9df0(uVar3,1,&uStack0000000000000040);
      if (iVar2 == 1) {
LAB_001ca028:
        uVar12 = uStack0000000000000040;
        if (uVar10 <= uStack0000000000000040) {
          uVar12 = uVar10;
        }
        func_0x002d8de8(uVar3);
        auVar13 = _uStack0000000000000010;
        in_stack_00000028 = uVar10;
        in_stack_00000030 = puVar4;
        in_stack_00000038 = uVar12;
        pauVar5 = (undefined1 (*) [16])func_0x00187bd0(0x10,8);
        if (pauVar5 == (undefined1 (*) [16])0x0) {
          func_0x007a1f18(8,0x10);
        }
        else {
          *pauVar5 = auVar13;
          if (uVar12 == 0) {
            uVar6 = 1;
          }
          else {
            uVar6 = func_0x00187bd0(uVar12,1);
            if (uVar6 == 0) {
              func_0x007a1f00(1,uVar12,&UNK_009c28e8);
              goto LAB_001ca218;
            }
          }
          _memcpy(uVar6,puVar4,uVar12);
          uStack0000000000000040 = uVar12;
          in_stack_00000048 = uVar6;
          in_stack_00000050 = uVar12;
          in_stack_00000058 = pauVar5;
          puVar8 = (ulong *)func_0x00187bd0(0x20,8);
          if (puVar8 != (ulong *)0x0) {
            puVar8[1] = in_stack_00000048;
            *puVar8 = uStack0000000000000040;
            puVar8[3] = (ulong)in_stack_00000058;
            puVar8[2] = in_stack_00000050;
            param_1[1] = puVar8;
            param_1[2] = &UNK_009c2a40;
            *param_1 = 0x8000000000000027;
            if (uVar12 != 0) {
              puVar9 = puVar4;
              do {
                *puVar9 = 0;
                uVar12 = uVar12 - 1;
                puVar9 = puVar9 + 1;
              } while (uVar12 != 0);
              uVar10 = in_stack_00000028;
            }
            in_stack_00000038 = 0;
            for (; uVar10 != 0; uVar10 = uVar10 - 1) {
              *puVar4 = 0;
              puVar4 = puVar4 + 1;
            }
            if (in_stack_00000028 == 0x8000000000000000 || in_stack_00000028 == 0) {
              return;
            }
            func_0x00187bd4(in_stack_00000030,in_stack_00000028,1);
            return;
          }
          func_0x007a1f18(8,0x20);
        }
        goto LAB_001ca218;
      }
    }
    else {
      uVar11 = 1;
      puVar4 = (undefined1 *)func_0x00187bdc(uVar10,1);
      if (puVar4 == (undefined1 *)0x0) goto LAB_001ca1c0;
      iVar2 = func_0x002d9df0(uVar3,puVar4,&uStack0000000000000040);
      if (iVar2 == 1) goto LAB_001ca028;
      func_0x00187bd4(puVar4,uVar10,1);
    }
    func_0x002d8de8(uVar3);
    puVar7 = (undefined8 *)func_0x00187bd0(0xd,1);
    if (puVar7 != (undefined8 *)0x0) {
      *puVar7 = CONCAT35(_UNK_0081e37d,_UNK_0081e378);
      *(ulong *)((long)puVar7 + 5) = CONCAT53(_UNK_0081e380,_UNK_0081e37d);
      uVar3 = _UNK_0081e810;
      param_1[1] = _UNK_0081e818;
      *param_1 = uVar3;
      param_1[2] = puVar7;
      param_1[3] = 0xd;
      func_0x002d8de8(in_stack_00000018);
      return;
    }
  }
  func_0x007a1f00(1,0xd,&UNK_009c28e8);
LAB_001ca218:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1ca21c);
  (*pcVar1)();
}

