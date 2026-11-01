
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_001514a8(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  int in_w11;
  ulong uVar2;
  long unaff_x19;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  int unaff_w24;
  long lVar3;
  
  if (*(int *)(unaff_x23 + 0x104) != 0) {
    uVar1 = 0;
    do {
      Hint_Prefetch(*(long *)(unaff_x19 + 0x18) + uVar1,0,1,0);
      uVar2 = uVar1 >> 2;
      uVar1 = uVar1 + 0x40;
    } while (uVar2 < 0xff1);
  }
  if (unaff_w24 == 3) {
    if (in_w11 == 0) {
      uVar1 = func_0x00159e1c(param_2);
    }
    else {
      uVar1 = func_0x00159b58();
    }
  }
  else if (in_w11 == 0) {
    uVar1 = func_0x0015d2c0(&UNK_00002838 + unaff_x19);
  }
  else {
    uVar1 = func_0x00159acc();
  }
  if (*(int *)(unaff_x23 + 0x1a8) == 2) {
    _memcpy(&UNK_000076a4 + unaff_x19,*(long *)(&UNK_00007698 + unaff_x19) + -0x10000,0x10000);
    _memmove(*(long *)(&UNK_00007690 + unaff_x19) + 0xffe0,*(long *)(&UNK_00007690 + unaff_x19),
             unaff_x22 + -0x10000);
    lVar3 = *(long *)(&UNK_00007690 + unaff_x19) + _UNK_00813b60;
    *(long *)(&UNK_00007698 + unaff_x19) = *(long *)(&UNK_00007698 + unaff_x19) + _UNK_00813b68;
    *(long *)(&UNK_00007690 + unaff_x19) = lVar3;
  }
  if (0xffffffffffffff88 < uVar1) {
    return 0xffffffffffffffec;
  }
  *(undefined8 *)(&UNK_000075a8 + unaff_x19) = *(undefined8 *)(&UNK_00007690 + unaff_x19);
  *(long *)(&UNK_000075c8 + unaff_x19) = unaff_x22;
  *(undefined4 *)(unaff_x23 + 0x38) = 1;
  if (unaff_w24 == 2) {
    *(undefined **)(unaff_x19 + 0x18) = &UNK_00002838 + unaff_x19;
    return unaff_x21;
  }
  return unaff_x21;
}

