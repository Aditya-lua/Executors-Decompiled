
void FUN_0018b53c(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined *puVar3;
  long unaff_x24;
  
  puVar3 = (undefined *)(unaff_x23 + 0x698);
  do {
    if (*unaff_x21 == 0) {
LAB_0018b58c:
      func_0x007a11c0(&UNK_00819d21,0x22,puVar3);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x18b5a4);
      (*pcVar1)();
    }
    lVar2 = _CFRetain();
    if (lVar2 == 0) {
      puVar3 = &UNK_009c06b0;
      goto LAB_0018b58c;
    }
    *(long *)(unaff_x24 + unaff_x20 * 8) = lVar2;
    unaff_x20 = unaff_x20 + 1;
    unaff_x21 = unaff_x21 + 1;
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) {
      *(long *)(unaff_x19 + 0x10) = unaff_x20;
      return;
    }
  } while( true );
}

