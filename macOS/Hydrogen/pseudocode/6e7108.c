
char * FUN_006e7108(char *param_1)

{
  int iVar1;
  long lVar2;
  char *unaff_x21;
  char *unaff_x22;
  
  while( true ) {
    if (param_1 == (char *)0x0) {
      lVar2 = _strlen(unaff_x21);
      unaff_x22 = unaff_x21 + lVar2;
    }
    func_0x006e38d8();
    func_0x006e3ee0();
    iVar1 = func_0x006e21f8();
    if (iVar1 == 0) {
      func_0x006e1d54();
      func_0x006e4118();
      func_0x006e38d8();
      func_0x006e2154();
      func_0x006e4514();
    }
    else {
      iVar1 = func_0x006e21f8();
      if (iVar1 != 6) {
        func_0x006e1d54();
        return unaff_x21;
      }
    }
    func_0x006e1e44();
    unaff_x21 = unaff_x22 + 1;
    if (*unaff_x22 != '.') break;
    param_1 = (char *)_strchr(unaff_x21,0x2e);
    unaff_x22 = param_1;
  }
  return (char *)0x0;
}

