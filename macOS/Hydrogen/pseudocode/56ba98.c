
void FUN_0056ba98(long *param_1,long param_2)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  undefined4 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  if (*(long *)(param_2 + 0x10) == 0) goto LAB_0056bbec;
  plVar5 = *(long **)(param_2 + 8);
  lVar3 = *plVar5;
  if (lVar3 < 6) {
    if (lVar3 < 4) {
      if (lVar3 - 1U < 3) goto LAB_0056bbec;
    }
    else if (lVar3 != 4) {
      uVar2 = func_0x005ca810(plVar5 + 1);
      goto joined_r0x0056bb08;
    }
  }
  else if (lVar3 < 9) {
    if (lVar3 != 6) {
      if (lVar3 == 7) goto LAB_0056bbec;
      uVar2 = func_0x005ca90c(plVar5 + 1);
joined_r0x0056bb08:
      if ((uVar2 & 1) != 0) goto LAB_0056bbec;
    }
  }
  else {
    if (lVar3 == 9) {
      uVar2 = func_0x005c0b7c(plVar5 + 1);
      goto joined_r0x0056bb08;
    }
    if ((lVar3 != 10) && (plVar5[1] != -0x8000000000000000)) goto LAB_0056bbec;
  }
  plVar4 = *(long **)(param_2 + 0x18);
  if (((*plVar4 == 7) && (plVar6 = (long *)plVar4[2], *plVar6 == 6)) &&
     (-0x7ffffffffffffffc < plVar6[1])) {
    lVar3 = plVar4[1];
    iVar1 = func_0x00566a14(lVar3,plVar5);
    if (iVar1 != 0) {
      func_0x0046b8d0(&uStack0000000000000008,plVar6[2],plVar6[3]);
      if ((uStack0000000000000008 & 1) == 0) {
        param_1[1] = in_stack_00000010;
        param_1[2] = in_stack_00000018;
      }
      else {
        lVar3 = 0;
      }
      *param_1 = lVar3;
      return;
    }
  }
LAB_0056bbec:
  *param_1 = 0;
  return;
}

