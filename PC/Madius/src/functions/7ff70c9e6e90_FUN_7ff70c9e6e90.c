/* 7ff70c9e6e90 FUN_7ff70c9e6e90 */

/* WARNING: Instruction at (ram,0x7ff70c9e6ecc) overlaps instruction at (ram,0x7ff70c9e6ec7)
    */

ulonglong FUN_7ff70c9e6e90(ulonglong *param_1)

{
  code *pcVar1;
  int iVar2;
  ulonglong uVar3;
  ulonglong *puVar4;
  longlong unaff_RBP;
  byte bVar5;
  ulonglong uStack_b0;
  undefined1 auStack_a8 [28];
  undefined4 auStack_8c [15];
  undefined1 auStack_50 [72];
  
  puVar4 = (ulonglong *)auStack_a8;
  uVar3 = *param_1;
  if (uVar3 != 0) {
    if ((char)param_1[1] == '\x01') {
      puVar4 = &uStack_b0;
      uStack_b0 = uVar3;
      uVar3 = func_0x7ff70d6ccac0(uVar3);
      if ((int)uVar3 == 0) {
        auStack_8c[0] = func_0x7ff70d876a69();
        FUN_7ff70c9e79f0(auStack_50,&UNK_7ff70cb90c7d,auStack_8c);
        FUN_7ff70cb12a50(auStack_50,&UNK_7ff70cbcadd0);
        pcVar1 = (code *)swi(3);
        uVar3 = (*pcVar1)();
        return uVar3;
      }
    }
    bVar5 = *(char *)((longlong)param_1 + 9) == '\0';
    if (*(char *)((longlong)param_1 + 9) == '\x01') {
      uVar3 = *param_1;
      *(undefined **)((longlong)puVar4 + -8) = &UNK_7ff70c9e6ec7;
      iVar2 = func_0x7ff70d76ca10(uVar3);
      uVar3 = (ulonglong)(iVar2 + *(int *)(unaff_RBP + 0x482174c0) + (uint)bVar5);
    }
  }
  return uVar3;
}


