
void FUN_006e6540(void)

{
  int iVar1;
  long lVar2;
  long extraout_x8;
  long unaff_x19;
  long lVar3;
  
code_r0x006e6540:
  do {
    func_0x006e644c();
    do {
      func_0x006e644c();
      lVar3 = (extraout_x8 + 0x28) - *(long *)(extraout_x8 + 0x28);
      if ((lVar3 != 0) && (iVar1 = _strcmp(lVar3,"__namecall"), iVar1 == 0)) {
        lVar3 = 0;
        if (*(long *)(unaff_x19 + 0x70) != 0) {
          lVar3 = *(long *)(unaff_x19 + 0x70) + 0x18;
        }
      }
      lVar2 = func_0x006e1710();
      if (lVar2 == 0) {
        if (lVar3 != 0) goto code_r0x006e6540;
        func_0x006e644c();
      }
      func_0x006fe8d4();
    } while (lVar3 != 0);
    func_0x006e644c();
  } while( true );
}

