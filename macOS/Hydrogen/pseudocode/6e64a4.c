
void FUN_006e64a4(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long extraout_x8;
  
  if (((*(ulong *)(param_1 + 0x40) < *(ulong *)(param_1 + 0x20)) &&
      (lVar3 = **(long **)(*(ulong *)(param_1 + 0x20) + 8), lVar3 != 0)) &&
     (*(char *)(lVar3 + 3) != '\0')) goto LAB_006e6560;
  lVar3 = 0;
  do {
    lVar2 = func_0x006e1710(param_1,param_2);
    if (lVar2 == 0) {
      if (lVar3 == 0) {
        lVar2 = func_0x006e644c(param_1,"missing argument #%d (%s expected)");
        goto code_r0x006e6508;
      }
code_r0x006e6530:
      func_0x006e644c(param_1,"missing argument #%d to \'%s\' (%s expected)");
    }
    else {
code_r0x006e6508:
      func_0x006fe8d4(param_1,lVar2);
      if (lVar3 == 0) {
        func_0x006e644c(param_1,"invalid argument #%d (%s expected, got %s)");
        goto code_r0x006e6530;
      }
    }
    func_0x006e644c(param_1,"invalid argument #%d to \'%s\' (%s expected, got %s)");
    lVar3 = extraout_x8;
LAB_006e6560:
    lVar3 = (lVar3 + 0x28) - *(long *)(lVar3 + 0x28);
    if ((lVar3 != 0) && (iVar1 = _strcmp(lVar3,"__namecall"), iVar1 == 0)) {
      lVar3 = 0;
      if (*(long *)(param_1 + 0x70) != 0) {
        lVar3 = *(long *)(param_1 + 0x70) + 0x18;
      }
    }
  } while( true );
}

