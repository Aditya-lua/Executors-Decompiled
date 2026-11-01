
/* WARNING: Possible PIC construction at 0x0010eea8: Changing call to branch */

ulong FUN_0010ecdc(uint param_1,undefined1 param_2 [16],undefined4 param_3,undefined4 param_4)

{
  undefined1 *puVar1;
  ulong uVar2;
  int iVar3;
  uint in_w9;
  long lVar4;
  undefined4 *unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  long unaff_x29;
  float fVar5;
  undefined4 uVar6;
  float fVar7;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined4 uStack0000000000000028;
  undefined4 uStack000000000000002c;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  
  if ((unaff_w20 >> 1 & 1) == 0) {
    iVar3 = 0x14;
    if ((unaff_w20 & 8) == 0) {
      iVar3 = -1;
    }
    if ((in_w9 >> 1 & 1) != 0) goto LAB_0010ed5c;
LAB_0010ed3c:
    fVar7 = 3.4028235e+38;
    _uStack0000000000000038 = (ulong)param_1;
  }
  else {
    iVar3 = 4;
    if ((in_w9 >> 1 & 1) == 0) goto LAB_0010ed3c;
LAB_0010ed5c:
    _uStack0000000000000038 = 0;
    _uStack0000000000000020 = 0x7f7fffff7f7fffff;
    fVar7 = *(float *)(unaff_x21 + 0x20);
    if (fVar7 <= 0.0) {
      _uStack0000000000000038 = (ulong)param_1;
    }
    if (0.0 < *(float *)(unaff_x21 + 0x24)) goto LAB_0010edb4;
  }
  if (iVar3 < 1) {
    fVar5 = 3.4028235e+38;
  }
  else {
    lVar4 = *unaff_x23;
    fVar7 = *(float *)(&UNK_000038f4 + lVar4);
    param_3 = 0x40000000;
    fVar5 = ((*(float *)(&UNK_00003d38 + lVar4) + *(float *)(&UNK_00003938 + lVar4)) * (float)iVar3
            - *(float *)(&UNK_00003938 + lVar4)) + fVar7 * 2.0;
  }
  _uStack0000000000000020 = CONCAT44(fVar5,0x7f7fffff);
LAB_0010edb4:
  func_0x000d4200(&uStack0000000000000038,&uStack0000000000000020,0,0);
  func_0x000b875c(&uStack0000000000000038,0x10,"##Combo_%02d");
  lVar4 = func_0x000d16f0(&uStack0000000000000038);
  if ((lVar4 != 0) && (*(char *)(lVar4 + 0xbf) != '\0')) {
    uStack0000000000000030._0_4_ = func_0x000d17e8(lVar4);
    uVar6 = 3;
    if ((unaff_w20 & 1) != 0) {
      uVar6 = 0;
    }
    *(undefined4 *)(lVar4 + 0xe0) = uVar6;
    uStack0000000000000030._4_4_ = fVar7;
    uVar6 = func_0x000dac74(lVar4);
    _uStack0000000000000020 = CONCAT44(fVar7,uVar6);
    uVar6 = unaff_x19[3];
    uStack0000000000000010 = CONCAT44(uVar6,*unaff_x19);
    uStack0000000000000028 = param_3;
    uStack000000000000002c = param_4;
    uStack0000000000000018._0_4_ =
         func_0x000da748(&uStack0000000000000010,&uStack0000000000000030,
                         (undefined4 *)(lVar4 + 0xe0),&uStack0000000000000020);
    uStack0000000000000010 = 0;
    uStack0000000000000018._4_4_ = uVar6;
    func_0x000d41c4(&uStack0000000000000018,0,&uStack0000000000000010);
  }
  _uStack0000000000000020 =
       CONCAT44(*(undefined4 *)(&UNK_000038f4 + unaff_x22),
                *(undefined4 *)(&UNK_00003924 + unaff_x22));
  func_0x000bbf24(2,&uStack0000000000000020);
  uVar2 = func_0x000c9774(&uStack0000000000000038,0,0x4000147);
  func_0x000bc00c(1);
  if ((uVar2 & 1) != 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return uVar2;
    }
    ___stack_chk_fail();
  }
  puVar1 = &UNK_00003f66 + lRam0000000000a334c0;
  lVar4 = *(long *)(lRam0000000000a334c0 + 0x4000);
  if (((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) == lVar4) &&
      ((&UNK_00004bc1)[lRam0000000000a334c0] != '\0')) &&
     (*(int *)(&UNK_00004b68 + lRam0000000000a334c0) == 0)) {
    *(uint *)(&UNK_00004bc4 + lRam0000000000a334c0) =
         *(uint *)(&UNK_00004bc4 + lRam0000000000a334c0) & 0xfffffff0 | 2;
  }
  if ((*(byte *)(lVar4 + 0x17) & 1) != 0) {
    *puVar1 = 1;
  }
  uVar2 = func_0x000cea90();
  *puVar1 = 0;
  return uVar2;
}

