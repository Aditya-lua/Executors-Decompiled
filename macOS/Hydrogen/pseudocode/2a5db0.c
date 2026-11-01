
bool FUN_002a5db0(long param_1,undefined1 param_2 [16])

{
  ulong *puVar1;
  ulong uVar2;
  long in_x10;
  long lVar3;
  long in_x11;
  undefined4 *unaff_x20;
  long unaff_x21;
  long unaff_x25;
  long unaff_x28;
  undefined1 auVar4 [16];
  
  auVar4 = NEON_ext(param_2,param_2,8,1);
  uVar2 = CONCAT17(param_2[7] | auVar4[7],
                   CONCAT16(param_2[6] | auVar4[6],
                            CONCAT15(param_2[5] | auVar4[5],
                                     CONCAT14(param_2[4] | auVar4[4],
                                              CONCAT13(param_2[3] | auVar4[3],
                                                       CONCAT12(param_2[2] | auVar4[2],
                                                                CONCAT11(param_2[1] | auVar4[1],
                                                                         param_2[0] | auVar4[0])))))
                           ));
  if (in_x10 != in_x11) {
    lVar3 = unaff_x28 - param_1;
    puVar1 = (ulong *)(unaff_x25 + param_1 * 8);
    do {
      uVar2 = *puVar1 | uVar2;
      lVar3 = lVar3 + -1;
      puVar1 = puVar1 + 1;
    } while (lVar3 != 0);
  }
  if (uVar2 == 0) {
    *(undefined4 *)(unaff_x21 + 0x10) = 0;
    *(undefined4 *)(unaff_x21 + 8) = 0;
  }
  else {
    *unaff_x20 = 1;
    func_0x0028f83c(3,0,0x70,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",0xb7);
  }
  return uVar2 == 0;
}

