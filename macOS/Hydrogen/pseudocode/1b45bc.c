
/* WARNING: Possible PIC construction at 0x001b4788: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001b478c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001b45bc(undefined8 *param_1)

{
  long lVar1;
  undefined2 uVar2;
  undefined2 uVar3;
  code *pcVar4;
  uint uVar5;
  undefined8 *in_x9;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  ulong uVar6;
  long lVar7;
  long unaff_x24;
  long *plVar8;
  undefined8 unaff_x29;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined1 uStack00000000000000c0;
  
  uVar11 = *in_x9;
  uVar10 = in_x9[3];
  uVar9 = in_x9[2];
  param_1[1] = in_x9[1];
  *param_1 = uVar11;
  param_1[3] = uVar10;
  param_1[2] = uVar9;
  lVar7 = unaff_x24 + 0x20;
  unaff_x21[2] = lVar7;
  uVar6 = *(ulong *)(unaff_x22 + 0x38);
  if (lVar7 == *unaff_x21) {
    func_0x00458a18();
  }
  *(char *)(unaff_x21[1] + lVar7) = (char)uVar6;
  lVar7 = unaff_x24 + 0x21;
  unaff_x21[2] = lVar7;
  if (0x20 < uVar6) {
    func_0x007a28b0(uVar6,0x20,&UNK_009c25c0);
code_r0x001b48d8:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x1b48dc);
    (*pcVar4)();
  }
  if ((ulong)(*unaff_x21 - lVar7) < uVar6) {
    func_0x0079b61c();
    lVar7 = unaff_x21[2];
  }
  _memcpy(unaff_x21[1] + lVar7,unaff_x22 + 0x18,uVar6);
  lVar7 = lVar7 + uVar6;
  unaff_x21[2] = lVar7;
  uVar2 = *(undefined2 *)(unaff_x22 + 0x44);
  uVar3 = *(undefined2 *)(unaff_x22 + 0x46);
  if ((ulong)(*unaff_x21 - lVar7) < 2) {
    func_0x0079b61c();
    lVar7 = unaff_x21[2];
  }
  uVar5 = func_0x001f5ae0(uVar2,uVar3);
  *(ushort *)(unaff_x21[1] + lVar7) =
       (ushort)(uVar5 >> 8) & 0xff | (ushort)((uVar5 & 0xff00ff) << 8);
  lVar1 = lVar7 + 2;
  unaff_x21[2] = lVar1;
  if (lVar1 == *unaff_x21) {
    func_0x00458a18();
  }
  *(undefined1 *)(unaff_x21[1] + lVar1) = 0;
  lVar7 = lVar7 + 3;
  unaff_x21[2] = lVar7;
  if (unaff_x20 == -0x7fffffffffffffff) {
    if ((ulong)(*unaff_x21 - lVar7) < 2) {
      func_0x0079b61c();
      lVar7 = unaff_x21[2];
    }
    *(undefined2 *)(unaff_x21[1] + lVar7) = 0xffff;
    unaff_x21[2] = lVar7 + 2;
    uStack0000000000000010 = 0x16;
    if (*(long *)(unaff_x22 + 0x10) != 0) {
      lVar7 = *(long *)(unaff_x22 + 0x10) << 5;
      in_stack_00000008 = _UNK_0081e0a8;
      in_stack_00000000 = _UNK_0081e0a0;
      plVar8 = *(long **)(unaff_x22 + 8);
      do {
        uVar6 = *plVar8 + 0x7fffffffffffffff;
        if (3 < uVar6) {
          uVar6 = 4;
        }
        if ((2 < uVar6) && ((uVar6 == 3 || ((short)plVar8[3] == 0x28)))) {
          lVar7 = func_0x00187bdc(8,1);
          if (lVar7 != 0) {
            in_stack_00000058 = 8;
            in_stack_00000048 = in_stack_00000008;
            uStack0000000000000040 = in_stack_00000000;
            in_stack_00000050 = lVar7;
            func_0x001b33d8(&uStack0000000000000040);
            uVar9 = 0x1b478c;
            goto code_r0x00187bd4;
          }
          func_0x007a1f00(1,8,&UNK_009c2690);
          goto code_r0x001b48d8;
        }
        func_0x001b33d8();
        lVar7 = lVar7 + -0x20;
        plVar8 = plVar8 + 4;
      } while (lVar7 != 0);
    }
    func_0x0024031c(&uStack0000000000000010);
  }
  else {
    func_0x001a777c();
  }
  if ((unaff_x20 < -0x7ffffffffffffffe) || (unaff_x20 == 0)) {
    return;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack00000000000000c0;
  unaff_x29 = in_stack_000000b0;
  uVar9 = in_stack_000000b8;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar9;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

