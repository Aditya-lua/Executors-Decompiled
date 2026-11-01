
void FUN_006e6574(undefined8 param_1,char *param_2)

{
  int iVar1;
  long lVar2;
  long extraout_x8;
  long unaff_x19;
  long unaff_x22;
  
  do {
    iVar1 = _strcmp(unaff_x22,param_2);
    if (iVar1 == 0) {
      unaff_x22 = 0;
      if (*(long *)(unaff_x19 + 0x70) != 0) {
        unaff_x22 = *(long *)(unaff_x19 + 0x70) + 0x18;
      }
    }
    do {
      lVar2 = func_0x006e1710();
      if (lVar2 == 0) {
        if (unaff_x22 == 0) {
          func_0x006e644c();
          goto code_r0x006e6508;
        }
code_r0x006e6530:
        func_0x006e644c();
      }
      else {
code_r0x006e6508:
        func_0x006fe8d4();
        if (unaff_x22 == 0) {
          func_0x006e644c();
          goto code_r0x006e6530;
        }
      }
      func_0x006e644c();
      unaff_x22 = (extraout_x8 + 0x28) - *(long *)(extraout_x8 + 0x28);
    } while (unaff_x22 == 0);
    param_2 = "__namecall";
  } while( true );
}

