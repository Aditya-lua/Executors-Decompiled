/* 7ff70c982ea0 FUN_7ff70c982ea0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c982ea0(longlong param_1,code *param_2,undefined8 param_3)

{
  longlong lVar1;
  longlong lVar2;
  code *pcVar3;
  char cVar4;
  longlong lVar5;
  
  lVar5 = (*_DAT_7ff70cb95618)(*(undefined8 *)(param_1 + 0x20),0);
  if (lVar5 != 0) {
    lVar1 = *(longlong *)(param_1 + 8);
    lVar2 = *(longlong *)(lVar5 + 8);
    cVar4 = (*param_2)(lVar5,lVar1 != lVar2,param_3);
    pcVar3 = _DAT_7ff70cb95618;
    while( true ) {
      if (cVar4 == '\0') {
        (*_DAT_7ff70cb95640)(lVar5);
        return;
      }
      lVar5 = (*pcVar3)(*(undefined8 *)(param_1 + 0x20),lVar5);
      if (lVar5 == 0) break;
      cVar4 = (*param_2)(lVar5,lVar1 != lVar2,param_3);
    }
  }
  return;
}


