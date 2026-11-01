
bool FUN_004e5378(long param_1,long param_2,long param_3,long param_4)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  long *plVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  
  if (param_2 == param_4) {
    if (param_2 == 0) {
      bVar3 = true;
    }
    else {
      lVar8 = 0;
      do {
        lVar1 = param_1 + lVar8 * 0x18;
        lVar2 = param_3 + lVar8 * 0x18;
        lVar7 = *(long *)(lVar1 + 0x10);
        bVar3 = lVar7 == *(long *)(lVar2 + 0x10);
        if (!bVar3) {
          return bVar3;
        }
        lVar8 = lVar8 + 1;
        lVar7 = lVar7 + 1;
        plVar5 = (long *)(*(long *)(lVar1 + 8) + 0x10);
        plVar6 = (long *)(*(long *)(lVar2 + 8) + 0x10);
        while (lVar7 = lVar7 + -1, lVar7 != 0) {
          if (*plVar5 != *plVar6) goto LAB_004e542c;
          iVar4 = _memcmp(plVar5[-1],plVar6[-1]);
          plVar5 = plVar5 + 3;
          plVar6 = plVar6 + 3;
          if (iVar4 != 0) goto LAB_004e542c;
        }
      } while (lVar8 != param_2);
    }
  }
  else {
LAB_004e542c:
    bVar3 = false;
  }
  return bVar3;
}

