
/* WARNING: Possible PIC construction at 0x001b4788: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001b478c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001b4810(void)

{
  long lVar1;
  undefined8 *puVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  code *pcVar8;
  uint uVar9;
  long lVar10;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  uint unaff_w23;
  ulong uVar11;
  long *plVar12;
  undefined8 unaff_x29;
  undefined *puVar13;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_000000b0;
  undefined *in_stack_000000b8;
  undefined1 uStack00000000000000c0;
  
  func_0x0079b61c();
  lVar10 = unaff_x21[2];
  *(ushort *)(unaff_x21[1] + lVar10) =
       (ushort)(unaff_w23 >> 8) & 0xff | (ushort)((unaff_w23 & 0xff00ff) << 8);
  lVar10 = lVar10 + 2;
  unaff_x21[2] = lVar10;
  if ((ulong)(*unaff_x21 - lVar10) < 0x20) {
    func_0x0079b61c();
    lVar10 = unaff_x21[2];
  }
  uVar7 = _UNK_0081ddb8;
  uVar6 = _UNK_0081ddb0;
  uVar5 = _UNK_0081dda0;
  puVar2 = (undefined8 *)(unaff_x21[1] + lVar10);
  puVar2[1] = _UNK_0081dda8;
  *puVar2 = uVar5;
  puVar2[3] = uVar7;
  puVar2[2] = uVar6;
  lVar1 = lVar10 + 0x20;
  unaff_x21[2] = lVar1;
  uVar11 = *(ulong *)(unaff_x22 + 0x38);
  if (lVar1 == *unaff_x21) {
    func_0x00458a18();
  }
  *(char *)(unaff_x21[1] + lVar1) = (char)uVar11;
  lVar10 = lVar10 + 0x21;
  unaff_x21[2] = lVar10;
  if (0x20 < uVar11) {
    func_0x007a28b0(uVar11,0x20,&UNK_009c25c0);
code_r0x001b48d8:
                    /* WARNING: Does not return */
    pcVar8 = (code *)SoftwareBreakpoint(1,0x1b48dc);
    (*pcVar8)();
  }
  if ((ulong)(*unaff_x21 - lVar10) < uVar11) {
    func_0x0079b61c();
    lVar10 = unaff_x21[2];
  }
  _memcpy(unaff_x21[1] + lVar10,unaff_x22 + 0x18,uVar11);
  lVar10 = lVar10 + uVar11;
  unaff_x21[2] = lVar10;
  uVar3 = *(undefined2 *)(unaff_x22 + 0x44);
  uVar4 = *(undefined2 *)(unaff_x22 + 0x46);
  if ((ulong)(*unaff_x21 - lVar10) < 2) {
    func_0x0079b61c();
    lVar10 = unaff_x21[2];
  }
  uVar9 = func_0x001f5ae0(uVar3,uVar4);
  *(ushort *)(unaff_x21[1] + lVar10) =
       (ushort)(uVar9 >> 8) & 0xff | (ushort)((uVar9 & 0xff00ff) << 8);
  lVar1 = lVar10 + 2;
  unaff_x21[2] = lVar1;
  if (lVar1 == *unaff_x21) {
    func_0x00458a18();
  }
  *(undefined1 *)(unaff_x21[1] + lVar1) = 0;
  lVar10 = lVar10 + 3;
  unaff_x21[2] = lVar10;
  if (unaff_x20 == -0x7fffffffffffffff) {
    if ((ulong)(*unaff_x21 - lVar10) < 2) {
      func_0x0079b61c();
      lVar10 = unaff_x21[2];
    }
    *(undefined2 *)(unaff_x21[1] + lVar10) = 0xffff;
    unaff_x21[2] = lVar10 + 2;
    uStack0000000000000010 = 0x16;
    if (*(long *)(unaff_x22 + 0x10) != 0) {
      lVar10 = *(long *)(unaff_x22 + 0x10) << 5;
      in_stack_00000008 = _UNK_0081e0a8;
      in_stack_00000000 = _UNK_0081e0a0;
      plVar12 = *(long **)(unaff_x22 + 8);
      do {
        uVar11 = *plVar12 + 0x7fffffffffffffff;
        if (3 < uVar11) {
          uVar11 = 4;
        }
        if ((2 < uVar11) && ((uVar11 == 3 || ((short)plVar12[3] == 0x28)))) {
          lVar10 = func_0x00187bdc(8,1);
          if (lVar10 != 0) {
            in_stack_00000058 = 8;
            in_stack_00000048 = in_stack_00000008;
            uStack0000000000000040 = in_stack_00000000;
            in_stack_00000050 = lVar10;
            func_0x001b33d8(&uStack0000000000000040);
            puVar13 = &UNK_001b478c;
            goto code_r0x00187bd4;
          }
          func_0x007a1f00(1,8,&UNK_009c2690);
          goto code_r0x001b48d8;
        }
        func_0x001b33d8();
        lVar10 = lVar10 + -0x20;
        plVar12 = plVar12 + 4;
      } while (lVar10 != 0);
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
  puVar13 = in_stack_000000b8;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar13;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

