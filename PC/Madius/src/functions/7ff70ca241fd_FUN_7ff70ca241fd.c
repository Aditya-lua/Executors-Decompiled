/* 7ff70ca241fd FUN_7ff70ca241fd */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70d7e4a62) overlaps instruction at (ram,0x7ff70d7e4a5d)
    */

void FUN_7ff70ca241fd(longlong param_1,undefined8 param_2)

{
  int *piVar1;
  code *pcVar2;
  undefined1 uVar3;
  uint uVar4;
  uint7 uVar7;
  char *pcVar5;
  undefined8 uVar6;
  byte bVar9;
  longlong lVar8;
  undefined2 uVar10;
  longlong unaff_RBX;
  longlong unaff_RBP;
  ulonglong unaff_RSI;
  byte *unaff_RDI;
  undefined1 in_CF;
  undefined1 in_ZF;
  bool in_SF;
  longlong alStackX_8 [4];
  undefined4 in_stack_00000038;
  uint in_stack_00000060;
  
  uVar10 = (undefined2)((ulonglong)param_2 >> 8);
  if (in_SF) {
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  FUN_7ff70d926ac2();
  func_0x7ff70d633851();
  (&stack0x00000030)[unaff_RBX * 2] = in_CF;
  if ((bool)in_CF) {
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  if (!(bool)in_ZF) {
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
  uVar4 = func_0x7ff70d7d3f57();
  pcVar5 = (char *)((unaff_RSI & 0xffffffff) + 0x10);
  *pcVar5 = -*pcVar5;
  bVar9 = *unaff_RDI;
  *unaff_RDI = *unaff_RDI + (byte)param_1;
  lVar8 = param_1 + -1;
  if (lVar8 != 0 && *unaff_RDI == 0) {
    uVar7 = (uint7)((ulonglong)unaff_RDI >> 8) & 0xffffff;
    pcVar5 = (char *)CONCAT71(uVar7,0xe8);
    *pcVar5 = *pcVar5 + (char)uVar7 + CARRY1(bVar9,(byte)param_1);
    *pcVar5 = *pcVar5 + (char)((ushort)uVar10 >> 8);
    out(*(undefined4 *)(ulonglong)uVar4,uVar10);
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  pcVar5 = (char *)((unaff_RSI & 0xffffffff) - 9);
  *pcVar5 = *pcVar5 + (char)lVar8;
  FUN_7ff70d67d54a(lVar8,in_stack_00000038);
  bVar9 = (byte)((ulonglong)lVar8 >> 8);
  uVar6 = FUN_7ff70d9e5b0e();
  bRamb0975ab64926a254 = bRamb0975ab64926a254 ^ bVar9;
  uVar3 = in(0xc2);
  *(int *)(unaff_RBP + 0x5f) =
       *(int *)(unaff_RBP + 0x5f) + (int)CONCAT71((int7)((ulonglong)uVar6 >> 8),uVar3);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


