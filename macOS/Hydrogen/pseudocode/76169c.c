
void FUN_0076169c(void)

{
  undefined8 *puVar1;
  int iVar2;
  char *pcVar3;
  char *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  
code_r0x0076169c:
  iVar2 = func_0x007408a0();
  while (iVar2 == 0) {
    unaff_x19 = unaff_x19 + 1;
    if (*unaff_x19 == '\0') break;
    pcVar3 = (char *)*unaff_x20;
    puVar1 = unaff_x21;
    while (pcVar3 != (char *)0x0) {
      if (*pcVar3 == *unaff_x19) goto code_r0x0076169c;
      pcVar3 = (char *)*puVar1;
      puVar1 = puVar1 + 1;
    }
    iVar2 = func_0x0074075c();
  }
  func_0x00740a58();
  return;
}

