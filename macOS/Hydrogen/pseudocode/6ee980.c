
void FUN_006ee980(ulong param_1)

{
  char cVar1;
  char cVar2;
  long lVar3;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
code_r0x006ee980:
  if (param_1 <= in_x9) {
    return;
  }
  lVar3 = **(long **)(param_1 + 8);
  if (*(char *)(lVar3 + 3) != '\0') goto LAB_006ee9cc;
  do {
    (**(code **)(unaff_x20 + 0x1e0))();
    cVar1 = *(char *)(unaff_x21 + 0x6b8);
    cVar2 = *(char *)(unaff_x19 + 3);
    while( true ) {
      if (cVar1 == '\0') {
        if (cVar2 != '\0') {
          return;
        }
        param_1 = *(ulong *)(unaff_x19 + 0x20);
        in_x9 = *(ulong *)(unaff_x19 + 0x40);
        goto code_r0x006ee980;
      }
      if ((cVar2 != '\0') && (cVar2 != '\x7f')) {
        return;
      }
      if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x40)) {
        return;
      }
      *(undefined1 *)(unaff_x19 + 3) = 0;
      lVar3 = **(long **)(*(ulong *)(unaff_x19 + 0x20) + 8);
      if (*(char *)(lVar3 + 3) == '\0') break;
LAB_006ee9cc:
      (*(code *)(*(long *)(lVar3 + 0x20) + lVar3 + 0x20))();
      if (*(char *)(unaff_x19 + 3) == '\x01') {
        return;
      }
      if (*(char *)(unaff_x19 + 3) == '\x06') {
        return;
      }
      func_0x00700a04();
      cVar1 = *(char *)(unaff_x21 + 0x6b8);
      cVar2 = *(char *)(unaff_x19 + 3);
    }
  } while( true );
}

