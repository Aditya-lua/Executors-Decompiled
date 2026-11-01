
undefined8
FUN_0030572c(long param_1,undefined8 param_2,long param_3,long *param_4,ulong param_5,
            undefined8 param_6,long param_7,ulong param_8)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  char *pcVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  undefined1 uStack0000000000000038;
  undefined8 uStack000000000000003c;
  undefined4 uStack0000000000000044;
  long lStack0000000000000048;
  
  lStack0000000000000048 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (param_7 == 0) {
    if (param_5 < 0xc) {
      uVar2 = 0x67;
      uVar4 = 0x549;
      goto LAB_00305794;
    }
    func_0x002b0104(&uStack0000000000000038 + 4,0xc,&UNK_00831b38);
    param_7 = 0xc;
    pcVar3 = (char *)param_4;
    uVar2 = func_0x00304f0c(param_1 + 8,param_2,param_3,param_4,param_5 - 0xc,
                            &uStack0000000000000038 + 4,0xc);
    if ((int)uVar2 != 0) {
      if (param_5 < *param_4 + 0xcU) {
        uVar2 = func_0x0079f41c();
        goto LAB_00305888;
      }
      puVar1 = (undefined8 *)(param_3 + *param_4);
      *puVar1 = uStack000000000000003c;
      *(undefined4 *)(puVar1 + 1) = uStack0000000000000044;
      *param_4 = *param_4 + 0xc;
      uVar2 = 1;
    }
  }
  else {
    uVar2 = 0x6f;
    uVar4 = 0x543;
LAB_00305794:
    pcVar3 = "/aws-lc/crypto/fipsmodule/cipher/e_aes.c";
    func_0x0028f83c(0x1e,0,uVar2,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",uVar4);
    uVar2 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000048) {
    return uVar2;
  }
LAB_00305888:
  auVar5 = ___stack_chk_fail(uVar2);
  if ((long *)pcVar3 != (long *)0x0) {
    func_0x0028f83c(0x1e,0,0x6f,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x569);
    return 0;
  }
  if (param_8 < 0xc) {
    func_0x0028f83c(0x1e,0,0x65,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x56e);
    return 0;
  }
  uVar2 = func_0x003052a8(auVar5._0_8_ + 8,auVar5._8_8_,(param_8 - 0xc) + param_7,0xc);
  return uVar2;
}

