/* 7ff70c944a00 FUN_7ff70c944a00 */

/* WARNING: Instruction at (ram,0x7ff70c944a77) overlaps instruction at (ram,0x7ff70c944a71)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

char * FUN_7ff70c944a00(ulonglong param_1)

{
  undefined1 *puVar1;
  char cVar2;
  int iVar3;
  char *pcVar4;
  longlong lVar5;
  undefined1 *puVar6;
  undefined8 unaff_RBP;
  longlong unaff_RDI;
  bool bVar7;
  undefined1 auStack_1d0 [8];
  undefined1 auStack_1c8 [40];
  short sStack_1a0;
  undefined1 auStack_198 [408];
  
  puVar1 = auStack_1c8;
  if ((param_1 & 2) != 0) {
    puVar6 = auStack_1d0;
    iVar3 = func_0x7ff70d6c7ca7(0x202,auStack_198);
    if (iVar3 != 0) {
      return (char *)0x2;
    }
    bVar7 = sStack_1a0 == 0x202;
    puVar1 = auStack_1d0;
    if (!bVar7) {
      pcVar4 = (char *)func_0x7ff70d72475b();
      if (!bVar7) {
        cVar2 = (char)pcVar4 + *pcVar4;
        pcVar4 = (char *)CONCAT71((int7)((ulonglong)pcVar4 >> 8),cVar2);
        *pcVar4 = *pcVar4 + cVar2;
        return pcVar4;
      }
      *pcVar4 = *pcVar4 + (char)pcVar4;
      goto LAB_7ff70c944a71;
    }
  }
  puVar6 = puVar1;
  *(undefined8 *)(puVar6 + -8) = 0x7ff70c944a11;
  pcVar4 = (char *)FUN_7ff70c982fb0();
  if ((int)pcVar4 != 0) {
    return pcVar4;
  }
  *(undefined8 *)(puVar6 + -8) = 0x7ff70c944a49;
  _DAT_7ff70cc1ad58 = FUN_7ff70c944ad0(&UNK_7ff70cb84deb);
  if (_DAT_7ff70cc1ad58 != 0) {
    *(undefined8 *)(puVar6 + -8) = 0x7ff70c944a64;
    lVar5 = func_0x7ff70d8a0220(_DAT_7ff70cc1ad58,&UNK_7ff70cb802e3);
    *(undefined1 *)(unaff_RDI + 0x48 + lVar5) = 0;
  }
LAB_7ff70c944a71:
  *(undefined4 *)(puVar6 + 0x20) = 3;
  *(undefined8 *)(puVar6 + -8) = 0x7ff70c944a8e;
  DAT_7ff70cc1ad60 = FUN_7ff70c983220(6,0,0,2);
  *(undefined8 *)(puVar6 + -8) = unaff_RBP;
  *(undefined8 *)(puVar6 + -0x10) = 0x7ff70c944aa1;
  func_0x7ff70d6e2d7a(&DAT_7ff70cc1ad68);
  return (char *)0x0;
}


