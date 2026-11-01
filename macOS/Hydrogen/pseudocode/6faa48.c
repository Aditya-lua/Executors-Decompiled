
undefined8 FUN_006faa48(undefined8 *param_1,long *param_2,int *param_3)

{
  byte *pbVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  int in_w8;
  byte *in_x9;
  int in_w10;
  int in_w11;
  uint in_w12;
  
  while (pbVar1 = in_x9 + 1, in_w12 < 10 && in_w8 < in_w10) {
    *param_2 = (long)pbVar1;
    in_w8 = (uint)*in_x9 + in_w8 * in_w11 + -0x30;
    in_x9 = pbVar1;
    in_w12 = (int)(char)*pbVar1 - 0x30;
  }
  if (in_w8 < 0x40000001 && 9 < in_w12) {
    if (0xffffffef < in_w8 - 0x11U) {
      *param_3 = in_w8;
      return 1;
    }
  }
  else {
    param_1 = (undefined8 *)func_0x006e644c(*param_1,"size specifier is too large");
  }
  puVar3 = (undefined8 *)func_0x006e644c(*param_1,"integral size (%d) out of limits [1,%d]");
  *param_3 = -1;
  puVar3 = (undefined8 *)func_0x006e644c(*puVar3,"missing size for format option \'c\'");
  puVar3 = (undefined8 *)func_0x006e644c(*puVar3,"invalid format option \'%c\'");
  uVar4 = func_0x006e644c(*puVar3,"integral size (%d) out of limits [1,%d]");
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar4 = ___cxa_guard_acquire(0xa278d0), (int)uVar4 == 0)
     ) {
    return uVar4;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa28b60), iVar2 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar4 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar4;
}

