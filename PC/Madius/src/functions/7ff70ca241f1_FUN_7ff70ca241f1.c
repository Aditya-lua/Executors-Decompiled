/* 7ff70ca241f1 FUN_7ff70ca241f1 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70d7e4a62) overlaps instruction at (ram,0x7ff70d7e4a5d)
    */

void FUN_7ff70ca241f1(longlong param_1,undefined8 param_2)

{
  int *piVar1;
  code *pcVar2;
  uint uVar3;
  uint7 uVar6;
  char *pcVar4;
  undefined8 uVar5;
  byte bVar8;
  longlong lVar7;
  undefined2 uVar9;
  longlong unaff_RBX;
  longlong unaff_RBP;
  ulonglong unaff_RSI;
  ulonglong unaff_RDI;
  byte *pbVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  bool bVar13;
  longlong alStackX_8 [4];
  undefined4 in_stack_00000038;
  uint in_stack_00000060;
  
  uVar9 = (undefined2)((ulonglong)param_2 >> 8);
  uVar11 = unaff_RDI < 0xffffffff94804b32;
  pbVar10 = (byte *)(unaff_RDI + 0x6b7fb4ce);
  bVar13 = (longlong)pbVar10 < 0;
  uVar12 = pbVar10 == (byte *)0x0;
  func_0x7ff70d9c3ebd();
  if (bVar13) {
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  FUN_7ff70d926ac2();
  func_0x7ff70d633851();
  (&stack0x00000030)[unaff_RBX * 2] = uVar11;
  if ((bool)uVar11) {
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  if (!(bool)uVar12) {
    func_0x7ff70d6b1d3c();
    func_0x7ff70d9c2392();
    return;
  }
  piVar1 = (int *)((longlong)&stack0x00000060 + unaff_RBX * 2);
  *piVar1 = -*piVar1;
  *(longlong *)((longlong)alStackX_8 + unaff_RBX) =
       *(longlong *)((longlong)alStackX_8 + unaff_RBX) + -0x411a3e60;
  in_stack_00000060 = in_stack_00000060 & 0xffffffb4;
  in_stack_00000060 = in_stack_00000060 + 0x8b2c64a9;
  uVar3 = func_0x7ff70d7d3f57();
  pcVar4 = (char *)((unaff_RSI & 0xffffffff) + 0x10);
  *pcVar4 = -*pcVar4;
  bVar8 = *pbVar10;
  *pbVar10 = *pbVar10 + (byte)param_1;
  lVar7 = param_1 + -1;
  if (lVar7 != 0 && *pbVar10 == 0) {
    uVar6 = (uint7)((ulonglong)pbVar10 >> 8) & 0xffffff;
    pcVar4 = (char *)CONCAT71(uVar6,0xe8);
    *pcVar4 = *pcVar4 + (char)uVar6 + CARRY1(bVar8,(byte)param_1);
    *pcVar4 = *pcVar4 + (char)((ushort)uVar9 >> 8);
    out(*(undefined4 *)(ulonglong)uVar3,uVar9);
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  pcVar4 = (char *)((unaff_RSI & 0xffffffff) - 9);
  *pcVar4 = *pcVar4 + (char)lVar7;
  FUN_7ff70d67d54a(lVar7,in_stack_00000038);
  bVar8 = (byte)((ulonglong)lVar7 >> 8);
  uVar5 = FUN_7ff70d9e5b0e();
  bRamb0975ab64926a254 = bRamb0975ab64926a254 ^ bVar8;
  uVar11 = in(0xc2);
  *(int *)(unaff_RBP + 0x5f) =
       *(int *)(unaff_RBP + 0x5f) + (int)CONCAT71((int7)((ulonglong)uVar5 >> 8),uVar11);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


