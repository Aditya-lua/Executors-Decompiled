
void FUN_006ee9dc(code *param_1)

{
  char cVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
code_r0x006ee9dc:
  (*param_1)();
  if ((*(char *)(unaff_x19 + 3) != '\x01') && (*(char *)(unaff_x19 + 3) != '\x06')) {
    func_0x00700a04();
    cVar1 = *(char *)(unaff_x19 + 3);
    if (*(char *)(unaff_x21 + 0x6b8) != '\0') goto LAB_006ee99c;
    while ((cVar1 == '\0' && (*(ulong *)(unaff_x19 + 0x40) < *(ulong *)(unaff_x19 + 0x20)))) {
      lVar2 = **(long **)(*(ulong *)(unaff_x19 + 0x20) + 8);
      cVar1 = *(char *)(lVar2 + 3);
      while( true ) {
        if (cVar1 != '\0') {
          param_1 = (code *)(*(long *)(lVar2 + 0x20) + lVar2 + 0x20);
          goto code_r0x006ee9dc;
        }
        (**(code **)(unaff_x20 + 0x1e0))();
        cVar1 = *(char *)(unaff_x19 + 3);
        if (*(char *)(unaff_x21 + 0x6b8) == '\0') break;
LAB_006ee99c:
        if ((cVar1 != '\0') && (cVar1 != '\x7f')) {
          return;
        }
        if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x40)) {
          return;
        }
        *(undefined1 *)(unaff_x19 + 3) = 0;
        lVar2 = **(long **)(*(ulong *)(unaff_x19 + 0x20) + 8);
        cVar1 = *(char *)(lVar2 + 3);
      }
    }
  }
  return;
}

