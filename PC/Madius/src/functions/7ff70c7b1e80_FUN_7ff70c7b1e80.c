/* 7ff70c7b1e80 FUN_7ff70c7b1e80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b1e80(undefined8 *param_1,undefined8 param_2,undefined1 param_3)

{
  code *pcVar1;
  char cVar2;
  longlong *plVar3;
  char *pcVar4;
  longlong lVar5;
  undefined8 unaff_RBX;
  undefined1 auStack_160 [152];
  undefined1 auStack_c8 [96];
  longlong alStack_68 [4];
  undefined8 *puStack_48;
  undefined8 uStack_40;
  
  uStack_40 = 0xfffffffffffffffe;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  puStack_48 = param_1;
  FUN_7ff70c788040(auStack_160,param_2,3,1);
  pcVar1 = _DAT_7ff70cb95d40;
  alStack_68[0] = 0;
  alStack_68[1] = 0;
  alStack_68[2] = 0;
  alStack_68[3] = 0xf;
  while( true ) {
    plVar3 = (longlong *)
             FUN_7ff70c788980(auStack_160,alStack_68,
                              CONCAT71((int7)((ulonglong)unaff_RBX >> 8),param_3) & 0xffffffff);
    cVar2 = (*pcVar1)((longlong)*(int *)(*plVar3 + 4) + (longlong)plVar3);
    if (cVar2 != '\0') break;
    FUN_7ff70c7b4280(puStack_48,alStack_68);
  }
  if (0xf < (ulonglong)alStack_68[3]) {
    lVar5 = alStack_68[0];
    if ((0xfff < alStack_68[3] + 1U) &&
       (lVar5 = *(longlong *)(alStack_68[0] + -8), 0x1f < (ulonglong)((alStack_68[0] + -8) - lVar5))
       ) {
                    /* WARNING: Does not return */
      pcVar1 = (code *)invalidInstructionException();
      (*pcVar1)();
    }
    thunk_FUN_7ff70ca90250(lVar5);
  }
  FUN_7ff70ca35d40(auStack_c8);
  pcVar4 = (char *)func_0x7ff70d87cd8e();
  *pcVar4 = *pcVar4 + (char)pcVar4;
  return;
}


