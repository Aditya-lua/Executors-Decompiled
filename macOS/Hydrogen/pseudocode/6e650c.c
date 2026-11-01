
void FUN_006e650c(void)

{
  int iVar1;
  long lVar2;
  long extraout_x8;
  long unaff_x19;
  long unaff_x22;
  
code_r0x006e650c:
  do {
    func_0x006fe8d4();
    if (unaff_x22 != 0) goto LAB_006e6548;
    func_0x006e644c();
    do {
      func_0x006e644c();
LAB_006e6548:
      func_0x006e644c();
      unaff_x22 = (extraout_x8 + 0x28) - *(long *)(extraout_x8 + 0x28);
      if ((unaff_x22 != 0) && (iVar1 = _strcmp(unaff_x22,"__namecall"), iVar1 == 0)) {
        unaff_x22 = 0;
        if (*(long *)(unaff_x19 + 0x70) != 0) {
          unaff_x22 = *(long *)(unaff_x19 + 0x70) + 0x18;
        }
      }
      lVar2 = func_0x006e1710();
      if (lVar2 != 0) goto code_r0x006e650c;
    } while (unaff_x22 != 0);
    func_0x006e644c();
  } while( true );
}

