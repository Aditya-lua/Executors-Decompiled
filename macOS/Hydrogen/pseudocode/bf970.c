
void FUN_000bf970(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  int *unaff_x21;
  
  *(undefined8 *)(&UNK_00005eb8 + unaff_x19) = 0;
  iVar1 = _strlen();
  if (iVar1 < unaff_x21[1]) {
    uVar2 = 0;
  }
  else {
    func_0x000ba578();
    uVar2 = *(undefined8 *)(&UNK_00005eb8 + unaff_x19);
  }
  *unaff_x21 = iVar1 + 1;
  _memcpy(uVar2);
  *(undefined1 *)(*(long *)(&UNK_00005eb8 + unaff_x19) + (long)iVar1) = 0;
  return;
}

