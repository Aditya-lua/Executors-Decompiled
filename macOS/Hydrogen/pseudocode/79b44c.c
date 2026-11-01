
void FUN_0079b44c(long param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  long in_x9;
  undefined8 *in_x10;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long lStack0000000000000018;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  in_x10[1] = param_3._8_8_;
  *in_x10 = param_3._0_8_;
  in_x10[3] = param_2._8_8_;
  in_x10[2] = param_2._0_8_;
  lStack0000000000000018 = param_1 + 0x20;
  if ((ulong)(in_x9 - lStack0000000000000018) < 0x20) {
    func_0x0079b61c(&uStack0000000000000008,lStack0000000000000018,0x20,1,1);
    unaff_x26 = in_stack_00000010;
  }
  puVar1 = (undefined8 *)(unaff_x26 + lStack0000000000000018);
  uVar4 = unaff_x23[5];
  uVar6 = unaff_x23[8];
  uVar5 = unaff_x23[7];
  puVar1[1] = unaff_x23[6];
  *puVar1 = uVar4;
  puVar1[3] = uVar6;
  puVar1[2] = uVar5;
  lStack0000000000000018 = lStack0000000000000018 + 0x20;
  if (unaff_x25 != 0) {
    if (0xffff < unaff_x24) {
      func_0x007a247c(&UNK_0081e509,0x29,&UNK_009c2bb0);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x79b590);
      (*pcVar3)();
    }
    if ((ulong)(uStack0000000000000008 - lStack0000000000000018) < 2) {
      func_0x0079b61c(&uStack0000000000000008,lStack0000000000000018,2,1,1);
      unaff_x26 = in_stack_00000010;
    }
    *(ushort *)(unaff_x26 + lStack0000000000000018) =
         (ushort)(unaff_x24 >> 8) & 0xff | (ushort)(((uint)unaff_x24 & 0xff00ff) << 8);
    lStack0000000000000018 = lStack0000000000000018 + 2;
    if ((ulong)(uStack0000000000000008 - lStack0000000000000018) < unaff_x24) {
      func_0x0079b61c(&uStack0000000000000008,lStack0000000000000018);
    }
    lVar2 = lStack0000000000000018;
    unaff_x26 = in_stack_00000010;
    _memcpy(in_stack_00000010 + lStack0000000000000018);
    lStack0000000000000018 = lVar2 + unaff_x24;
  }
  (**(code **)(((undefined8 *)*unaff_x23)[1] + 0x20))(*(undefined8 *)*unaff_x23);
  if (uStack0000000000000008 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x26,uStack0000000000000008,1);
  return;
}

