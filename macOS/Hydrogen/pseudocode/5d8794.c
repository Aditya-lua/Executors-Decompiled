
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005d8794(long param_1,undefined1 param_2 [16],long param_3)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long in_x9;
  long in_x10;
  long *in_x11;
  long lVar7;
  long lVar8;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  lVar6 = _UNK_008ae548;
  lVar5 = _UNK_008ae540;
  lVar4 = _UNK_008ae538;
  lVar3 = _UNK_008ae530;
  lVar2 = _UNK_008ae528;
  lVar1 = _UNK_008ae520;
  lVar7 = param_1;
  lVar8 = unaff_x22;
  do {
    in_x11[-3] = lVar8 + param_2._8_8_;
    in_x11[-4] = lVar8 + param_2._0_8_;
    in_x11[-1] = lVar8 + lVar2;
    in_x11[-2] = lVar8 + lVar1;
    in_x11[1] = lVar8 + lVar4;
    *in_x11 = lVar8 + lVar3;
    in_x11[3] = lVar8 + lVar6;
    in_x11[2] = lVar8 + lVar5;
    lVar8 = lVar8 + 0xc0;
    lVar7 = lVar7 + -8;
    in_x11 = in_x11 + 8;
  } while (lVar7 != 0);
  if (in_x10 != param_1) {
    do {
      *(long *)(param_3 + param_1 * 8) = in_x9;
      in_x9 = in_x9 + 0x18;
      param_1 = param_1 + 1;
    } while (in_x9 != unaff_x22 + unaff_x21 * 0x18);
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_3;
  unaff_x19[2] = param_1;
  return;
}

