
void FUN_001eafd8(long *param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  code *pcVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined1 *puVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  undefined8 uStack0000000000000010;
  undefined1 *in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined1 *in_stack_00000050;
  long in_stack_00000058;
  
  func_0x001eb220(&uStack0000000000000010,3);
  lVar4 = in_stack_00000038;
  lVar3 = in_stack_00000028;
  lVar2 = in_stack_00000020;
  puVar8 = in_stack_00000018;
  if (uStack0000000000000010 != -0x7fffffffffffffd9) {
    param_1[2] = in_stack_00000020;
    param_1[3] = in_stack_00000028;
    *param_1 = uStack0000000000000010;
    param_1[1] = (long)in_stack_00000018;
    param_1[4] = in_stack_00000030;
    param_1[5] = in_stack_00000038;
    param_1[6] = in_stack_00000040;
    return;
  }
  func_0x00270d98(&uStack0000000000000010);
  lVar9 = in_stack_00000020;
  puVar1 = in_stack_00000018;
  lVar11 = uStack0000000000000010;
  if (uStack0000000000000010 == -0x7fffffffffffffff) {
    puVar6 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar6 != (undefined8 *)0x0) {
      puVar6[1] = 1;
      *puVar6 = 1;
      param_1[1] = (long)puVar6;
      param_1[2] = (long)&UNK_009c8188;
      *param_1 = -0x7fffffffffffffda;
      func_0x002d8de8(lVar4);
      if (puVar8 == (undefined1 *)0x0) {
        return;
      }
      func_0x00187bd4(lVar2,puVar8,1);
      return;
    }
    func_0x007a1f18(8,0x10);
  }
  else {
    in_stack_00000048 = uStack0000000000000010;
    in_stack_00000050 = in_stack_00000018;
    in_stack_00000058 = in_stack_00000020;
    if (in_stack_00000020 < 0) {
      uVar10 = 0;
    }
    else {
      if (in_stack_00000020 == 0) {
        lVar7 = 1;
LAB_001eb0f4:
        _memcpy(lVar7,puVar1,lVar9);
        param_1[2] = lVar2;
        param_1[3] = lVar3;
        param_1[4] = lVar9;
        param_1[5] = lVar7;
        param_1[6] = lVar9;
        *param_1 = -0x7fffffffffffffd9;
        param_1[1] = (long)puVar8;
        if (lVar11 != -0x8000000000000000) {
          if (lVar9 != 0) {
            puVar8 = puVar1;
            do {
              *puVar8 = 0;
              lVar9 = lVar9 + -1;
              puVar8 = puVar8 + 1;
            } while (lVar9 != 0);
            lVar11 = in_stack_00000048;
          }
          in_stack_00000058 = 0;
          for (; lVar11 != 0; lVar11 = lVar11 + -1) {
            *puVar1 = 0;
            puVar1 = puVar1 + 1;
          }
          if (in_stack_00000048 != -0x8000000000000000 && in_stack_00000048 != 0) {
            func_0x00187bd4(in_stack_00000050,in_stack_00000048,1);
          }
        }
        func_0x002d8de8(lVar4);
        return;
      }
      uVar10 = 1;
      lVar7 = func_0x00187bd0(in_stack_00000020,1);
      if (lVar7 != 0) goto LAB_001eb0f4;
    }
    func_0x007a1f00(uVar10,lVar9,&UNK_009c3768);
  }
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x1eb1c0);
  (*pcVar5)();
}

