
void FUN_0077eac0(void)

{
  int iVar1;
  undefined1 *puVar2;
  int *piVar3;
  char *unaff_x19;
  int unaff_w22;
  
  iVar1 = _strerror_r();
  if ((iVar1 != 0) && (*unaff_x19 == '\0')) {
    func_0x00764560();
  }
  puVar2 = (undefined1 *)_strrchr();
  if ((puVar2 != (undefined1 *)0x0) && (1 < (long)puVar2 - (long)unaff_x19)) {
    *puVar2 = 0;
  }
  puVar2 = (undefined1 *)_strrchr();
  if ((puVar2 != (undefined1 *)0x0) && (0 < (long)puVar2 - (long)unaff_x19)) {
    *puVar2 = 0;
  }
  piVar3 = (int *)___error();
  if (*piVar3 != unaff_w22) {
    piVar3 = (int *)___error();
    *piVar3 = unaff_w22;
  }
  return;
}

