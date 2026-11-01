
undefined8 FUN_00223d74(undefined8 param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  long unaff_x21;
  long unaff_x22;
  long lStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long lStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined *puStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined *puStack0000000000000048;
  
  uVar1 = *param_2;
  uVar2 = param_2[1];
  do {
    _uStack0000000000000010 = &UNK_008284b0;
    puStack0000000000000048 = &DAT_0024156c;
    uStack0000000000000018 = 1;
    puStack0000000000000030 = &UNK_008284c0;
    uStack0000000000000038 = 1;
    uStack0000000000000028 = 1;
    lStack0000000000000008 = unaff_x22;
    lStack0000000000000020 = (long)register0x00000008 + 0x40;
    iVar3 = func_0x0046849c(uVar1,uVar2,&uStack0000000000000010);
    if (iVar3 != 0) {
      return 1;
    }
    unaff_x22 = unaff_x22 + 1;
    unaff_x21 = unaff_x21 + -1;
  } while (unaff_x21 != 0);
  return 0;
}

