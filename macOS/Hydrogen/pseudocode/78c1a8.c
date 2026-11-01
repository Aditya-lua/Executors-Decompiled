
/* WARNING: Removing unreachable block (ram,0x0078c1fc) */
/* WARNING: Removing unreachable block (ram,0x0078c230) */
/* WARNING: Removing unreachable block (ram,0x0078c2d0) */
/* WARNING: Removing unreachable block (ram,0x0078c2e8) */
/* WARNING: Removing unreachable block (ram,0x0078c238) */
/* WARNING: Removing unreachable block (ram,0x0078c24c) */
/* WARNING: Removing unreachable block (ram,0x0078c250) */
/* WARNING: Removing unreachable block (ram,0x0078c258) */
/* WARNING: Removing unreachable block (ram,0x0078c274) */
/* WARNING: Type propagation algorithm not settling */

ulong FUN_0078c1a8(ulong param_1)

{
  bool bVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x19;
  long lVar6;
  long unaff_x29;
  undefined8 in_stack_00000030;
  
  if ((param_1 & 1) == 0) {
    func_0x0073c9e4();
    uVar5 = 1;
  }
  else {
    func_0x00734f0c();
    if ((*(long *)(unaff_x29 + -0x58) != 0) &&
       (lVar6 = *(long *)(*(long *)(unaff_x29 + -0x58) + 1000), lVar6 != 0)) {
      lVar2 = lVar6 + 0x58;
      iVar3 = func_0x007298e4(lVar2);
      do {
        if (iVar3 != 0) {
          lVar4 = func_0x0072a62c(lVar2,&DAT_0078c2ec);
          if (lVar4 < 0) {
            return (ulong)in_stack_00000030._4_4_;
          }
          iVar3 = (int)*(undefined8 *)(unaff_x19 + 0xa1a);
          if (lVar4 == 0) {
            if ((iVar3 < 0) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            return 0x34;
          }
          if (iVar3 < 0) {
            if (*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0) {
              if (0 < iRam0000000000a2b5a0) goto code_r0x0078c138;
            }
            else {
              bVar1 = *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8) < 1;
              if ((!bVar1 && iRam0000000000a2b5a0 != 0) && (bVar1 || -1 < iRam0000000000a2b5a0)) {
code_r0x0078c138:
                func_0x007298b8(lVar2);
                func_0x0073d364();
              }
            }
          }
        }
        uVar5 = func_0x0078c328(lVar6 + 8);
        in_stack_00000030._4_4_ = (uint)uVar5;
        if (in_stack_00000030._4_4_ == 0) {
          iVar3 = func_0x007298e4(lVar2);
        }
        else {
          if (in_stack_00000030._4_4_ != 0x51) {
            return uVar5;
          }
          func_0x0078c95c(lVar6 + 8);
          iVar3 = func_0x007298e4(lVar2);
        }
      } while( true );
    }
    func_0x0073c9e4();
    uVar5 = 0x2b;
  }
  return uVar5;
}

