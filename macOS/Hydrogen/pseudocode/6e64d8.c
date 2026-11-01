
void FUN_006e64d8(long param_1)

{
  int iVar1;
  long lVar2;
  long extraout_x8;
  int in_w9;
  long unaff_x19;
  long lVar3;
  
  if (in_w9 != 0) goto LAB_006e6560;
  lVar3 = 0;
  do {
    lVar2 = func_0x006e1710();
    if (lVar2 == 0) {
      if (lVar3 == 0) {
        func_0x006e644c();
        goto LAB_006e6508;
      }
LAB_006e6530:
      func_0x006e644c();
    }
    else {
LAB_006e6508:
      func_0x006fe8d4();
      if (lVar3 == 0) {
        func_0x006e644c();
        goto LAB_006e6530;
      }
    }
    func_0x006e644c();
    param_1 = extraout_x8;
LAB_006e6560:
    lVar3 = (param_1 + 0x28) - *(long *)(param_1 + 0x28);
    if ((lVar3 != 0) && (iVar1 = _strcmp(lVar3,"__namecall"), iVar1 == 0)) {
      lVar3 = 0;
      if (*(long *)(unaff_x19 + 0x70) != 0) {
        lVar3 = *(long *)(unaff_x19 + 0x70) + 0x18;
      }
    }
  } while( true );
}

