
long FUN_004fd1f8(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  
  lVar4 = *(long *)(*(long *)*param_1 + 0x90);
  if (lVar4 != 0) {
    lVar5 = *(long *)(*(long *)*param_1 + 0x88);
    uVar1 = *param_2;
    lVar2 = param_2[1];
    lVar4 = lVar4 * 600;
    do {
      if ((*(long *)(lVar5 + 0x220) == lVar2) &&
         (iVar3 = _memcmp(*(undefined8 *)(lVar5 + 0x218),uVar1,lVar2), iVar3 == 0)) {
        return lVar5;
      }
      lVar5 = lVar5 + 600;
      lVar4 = lVar4 + -600;
    } while (lVar4 != 0);
  }
  return 0;
}

