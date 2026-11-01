
undefined8 FUN_0027f8f4(undefined2 *param_1)

{
  ulong uVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long *unaff_x19;
  ulong *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar5;
  undefined8 in_stack_00000008;
  
  if (param_1 != (undefined2 *)0x0) {
    *param_1 = in_stack_00000008._2_2_;
    if (unaff_x23 != 2) {
      uVar5 = 2;
      do {
        iVar3 = func_0x0027e418();
        if (iVar3 == -1) break;
        if (iVar3 == 0) {
          *unaff_x21 = uVar5;
          return 1;
        }
        uVar5 = uVar5 + (long)iVar3;
        if ((unaff_x23 < unaff_x22) && (unaff_x23 - uVar5 < 0x800)) {
          uVar1 = unaff_x23 + 0x1000;
          bVar2 = unaff_x23 < 0xfffffffffffff000;
          unaff_x23 = unaff_x22;
          if (uVar1 <= unaff_x22 && bVar2) {
            unaff_x23 = uVar1;
          }
          lVar4 = func_0x0036e48c(*unaff_x19,unaff_x23);
          if (lVar4 == 0) break;
          *unaff_x19 = lVar4;
        }
      } while (uVar5 != unaff_x23);
    }
    func_0x0036e3d8(*unaff_x19);
  }
  func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x2d7);
  return 0;
}

