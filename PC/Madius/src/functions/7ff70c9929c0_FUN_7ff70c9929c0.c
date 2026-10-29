/* 7ff70c9929c0 FUN_7ff70c9929c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_7ff70c9929c0(longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4)

{
  longlong *plVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  
  lVar4 = *param_1;
  if (lVar4 == 0) {
    lVar4 = (*_DAT_7ff70cbebad0)((longlong)(int)param_1[4] << 5);
    *param_1 = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    iVar2 = (int)param_1[4];
    if (0 < iVar2) {
      lVar4 = 0;
      lVar5 = 0;
      do {
        FUN_7ff70c990fa0(*param_1 + lVar4,&UNK_7ff70c992b30);
        lVar5 = lVar5 + 1;
        iVar2 = (int)param_1[4];
        lVar4 = lVar4 + 0x20;
      } while (lVar5 < iVar2);
      lVar4 = *param_1;
    }
  }
  else {
    iVar2 = (int)param_1[4];
  }
  lVar3 = (*(code *)param_1[1])(param_2,param_3,(longlong)iVar2);
  lVar5 = lVar4 + lVar3 * 0x20;
  plVar1 = *(longlong **)(lVar4 + lVar3 * 0x20);
  do {
    if (plVar1 == (longlong *)0x0) {
      lVar4 = (*_DAT_7ff70cbebad0)(param_3 + 0x30);
joined_r0x7ff70c992ad5:
      if (lVar4 == 0) {
        return 0;
      }
      FUN_7ff70cb12b60(lVar4 + 0x28,param_2,param_3);
      *(longlong *)(lVar4 + 0x20) = param_3;
      *(undefined8 *)(lVar4 + 0x18) = param_4;
      FUN_7ff70c990fc0(lVar5,*(undefined8 *)(lVar5 + 8),lVar4,lVar4);
      param_1[5] = param_1[5] + 1;
      return param_4;
    }
    lVar4 = (*(code *)param_1[2])(*plVar1 + 0x28,*(undefined8 *)(*plVar1 + 0x20),param_2,param_3);
    if (lVar4 != 0) {
      FUN_7ff70c991030(lVar5,plVar1,param_1);
      param_1[5] = param_1[5] + -1;
      lVar4 = (*_DAT_7ff70cbebad0)(param_3 + 0x30);
      goto joined_r0x7ff70c992ad5;
    }
    plVar1 = (longlong *)plVar1[2];
  } while( true );
}


