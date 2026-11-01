
/* WARNING: Possible PIC construction at 0x001b5018: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001b501c) */

void FUN_001b5004(void)

{
  long lVar1;
  undefined2 uVar2;
  undefined2 uVar3;
  code *pcVar4;
  uint uVar5;
  long lVar6;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  ulong uVar7;
  long lVar8;
  long unaff_x24;
  byte bVar9;
  long unaff_x25;
  undefined8 unaff_x29;
  undefined8 uVar10;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined1 uStack0000000000000070;
  
  unaff_x21[2] = unaff_x24;
  if (unaff_x25 != 0) {
    uVar10 = 0x1b501c;
    goto code_r0x00187bd4;
  }
  uVar7 = *(ulong *)(unaff_x22 + 0x58);
  if (unaff_x24 == *unaff_x21) {
    func_0x00458a18();
  }
  *(char *)(unaff_x21[1] + unaff_x24) = (char)uVar7;
  lVar8 = unaff_x24 + 1;
  unaff_x21[2] = lVar8;
  if (0x20 < uVar7) {
    func_0x007a28b0(uVar7,0x20,&UNK_009c25c0);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x1b51e0);
    (*pcVar4)();
  }
  if ((ulong)(*unaff_x21 - lVar8) < uVar7) {
    func_0x0079b61c();
    lVar8 = unaff_x21[2];
  }
  _memcpy(unaff_x21[1] + lVar8,unaff_x22 + 0x38,uVar7);
  lVar8 = lVar8 + uVar7;
  unaff_x21[2] = lVar8;
  uVar2 = *(undefined2 *)(unaff_x22 + 100);
  uVar3 = *(undefined2 *)(unaff_x22 + 0x66);
  if ((ulong)(*unaff_x21 - lVar8) < 2) {
    func_0x0079b61c();
    lVar8 = unaff_x21[2];
  }
  uVar5 = func_0x001f5ae0(uVar2,uVar3);
  *(ushort *)(unaff_x21[1] + lVar8) =
       (ushort)(uVar5 >> 8) & 0xff | (ushort)((uVar5 & 0xff00ff) << 8);
  lVar1 = lVar8 + 2;
  unaff_x21[2] = lVar1;
  bVar9 = *(byte *)(unaff_x22 + 0x68);
  if (bVar9 < 2) {
LAB_001b5100:
    lVar6 = *unaff_x21;
  }
  else {
    if (bVar9 == 3) {
      bVar9 = *(byte *)(unaff_x22 + 0x69);
      goto LAB_001b5100;
    }
    bVar9 = 0x40;
    lVar6 = *unaff_x21;
  }
  if (lVar1 == lVar6) {
    func_0x00458a18();
  }
  *(byte *)(unaff_x21[1] + lVar1) = bVar9;
  unaff_x21[2] = lVar8 + 3;
  if (*(long *)(unaff_x22 + 0x10) != 0) {
    func_0x001a6c60();
  }
  if ((unaff_x20 < -0x7ffffffffffffffe) || (unaff_x20 == 0)) {
    return;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000070;
  unaff_x29 = in_stack_00000060;
  uVar10 = in_stack_00000068;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar10;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

