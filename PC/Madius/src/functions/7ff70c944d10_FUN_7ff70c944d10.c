/* 7ff70c944d10 FUN_7ff70c944d10 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70c944d11) overlaps instruction at (ram,0x7ff70c944d10)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c944d10(ulonglong param_1,undefined8 param_2,byte param_3)

{
  byte *pbVar1;
  uint *puVar2;
  byte bVar3;
  undefined8 uVar4;
  code *pcVar5;
  byte bVar6;
  undefined8 *puVar8;
  byte *pbVar9;
  undefined8 unaff_RBX;
  undefined1 *puVar10;
  undefined8 unaff_RBP;
  longlong unaff_RSI;
  undefined8 unaff_RDI;
  char unaff_R13B;
  longlong unaff_R14;
  undefined8 unaff_R15;
  undefined2 in_ES;
  char *pcVar7;
  
  while( true ) {
    puVar8 = (undefined8 *)(param_1 + 0xd88);
    *(undefined8 *)((longlong)register0x00000020 + -8) = unaff_R15;
    *(longlong *)((longlong)register0x00000020 + -0x10) = unaff_R14;
    *(longlong *)((longlong)register0x00000020 + -0x18) = unaff_RSI;
    *(undefined8 *)((longlong)register0x00000020 + -0x20) = unaff_RDI;
    *(undefined8 *)((longlong)register0x00000020 + -0x28) = unaff_RBP;
    *(undefined8 *)((longlong)register0x00000020 + -0x30) = unaff_RBX;
    puVar10 = (undefined1 *)((longlong)register0x00000020 + -0x58);
    unaff_R14 = *(longlong *)(param_1 + 0xd98);
    if (unaff_R14 == 0) {
      *(undefined8 *)(param_1 + 0xd98) = 0;
      uVar4 = *puVar8;
      *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944e22;
      (*_DAT_7ff70cbebad8)(uVar4);
      *puVar8 = 0;
      return;
    }
    unaff_RDI = *(undefined8 *)(unaff_R14 + 0x38);
    pbVar9 = *(byte **)(unaff_R14 + 0x18);
    unaff_RBX = *(undefined8 *)(unaff_R14 + 0x30);
    *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944d4d;
    pcVar7 = (char *)func_0x7ff70da4097f();
    bVar6 = (byte)pcVar7;
    *(undefined2 *)(pbVar9 + -0x75) = in_ES;
    unaff_RSI = param_1 + 0xd89;
    out(*(undefined1 *)puVar8,(short)param_2);
    pbVar9[-0x39] = pbVar9[-0x39] & bVar6;
    *pbVar9 = *pbVar9 & param_3;
    *pcVar7 = *pcVar7 + bVar6;
    pbVar1 = pbVar9 + -0x75;
    bVar3 = *pbVar1;
    *pbVar1 = *pbVar1 + (byte)pbVar9;
    if ((bool)(bVar6 - unaff_R13B) != CARRY1(bVar3,(byte)pbVar9)) break;
    param_1 = (ulonglong)((int)pbVar9 + 0xd88);
    register0x00000020 = (BADSPACEBASE *)((longlong)register0x00000020 + -0x58);
  }
  puVar2 = (uint *)(pbVar9 + -0x75);
  *puVar2 = *puVar2 >> 0xe | *puVar2 << 0x12;
  if ((int)unaff_RBP == 0) {
    *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944dfd;
    FUN_7ff70c983450();
  }
  else {
    if (pbVar9 != (byte *)0x0) {
      *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944d80;
      FUN_7ff70c983460(unaff_R14);
    }
    if (*(longlong *)(unaff_R14 + 0x18) != 0) {
      *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944d8d;
      func_0x7ff70d6f7d08();
                    /* WARNING: Does not return */
      pcVar5 = (code *)invalidInstructionException();
      (*pcVar5)();
    }
    uVar4 = *(undefined8 *)(unaff_R14 + 0x28);
    *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944da1;
    (*_DAT_7ff70cbebad8)(uVar4);
    if (*(longlong *)(unaff_R14 + 0x50) != 0) {
      *(undefined8 *)((longlong)register0x00000020 + -0x60) = 0x7ff70c944daf;
      FUN_7ff70c9834a0();
    }
    puVar10 = (undefined1 *)((longlong)register0x00000020 + -0x58);
    if (*(longlong *)(unaff_R14 + 0x40) != -1) {
      puVar10 = (undefined1 *)((longlong)register0x00000020 + -0x60);
      *(undefined8 *)((longlong)register0x00000020 + -0x60) = unaff_RDI;
      *(undefined8 *)((longlong)register0x00000020 + -0x68) = 0x7ff70c944dbf;
      func_0x7ff70d6b35f0();
    }
    *(undefined8 *)(unaff_R14 + 0x78) = 0;
    *(undefined8 *)(unaff_R14 + 0x80) = 0;
    *(undefined8 *)(unaff_R14 + 0x68) = 0;
    *(undefined8 *)(unaff_R14 + 0x70) = 0;
    *(undefined8 *)(unaff_R14 + 0x58) = 0;
    *(undefined8 *)(unaff_R14 + 0x60) = 0;
    *(undefined8 *)(unaff_R14 + 0x48) = 0;
    *(undefined8 *)(unaff_R14 + 0x50) = 0;
    *(undefined8 *)(unaff_R14 + 0x38) = 0;
    *(undefined8 *)(unaff_R14 + 0x40) = 0;
    *(undefined8 *)(unaff_R14 + 0x28) = 0;
    *(undefined8 *)(unaff_R14 + 0x30) = 0;
    *(longlong *)(unaff_R14 + 0x18) = 0;
    *(undefined8 *)(unaff_R14 + 0x20) = 0;
    *(undefined8 *)(unaff_R14 + 0x88) = 0;
    uVar4 = *(undefined8 *)(param_1 + 0xd99);
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c944df6;
    (*_DAT_7ff70cbebad8)(uVar4);
  }
  *(undefined8 *)(puVar10 + -8) = 0x7ff70c944e08;
  FUN_7ff70c94e690(unaff_RBX,unaff_RDI);
  *(undefined **)(puVar10 + -8) = &UNK_7ff70c944e10;
  pcVar7 = (char *)func_0x7ff70d9def8d();
  pcVar7[-0x39] = pcVar7[-0x39] | 0x46;
  *pcVar7 = *pcVar7 + (char)pcVar7;
  *pcVar7 = *pcVar7 + (char)pcVar7;
  pcVar7[-0x75] = pcVar7[-0x75] + (char)unaff_RDI;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


