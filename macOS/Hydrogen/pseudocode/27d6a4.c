
/* WARNING: Possible PIC construction at 0x0027d858: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0027d85c) */
/* WARNING: Removing unreachable block (ram,0x0027d864) */
/* WARNING: Removing unreachable block (ram,0x0027d8e4) */
/* WARNING: Removing unreachable block (ram,0x0027d878) */
/* WARNING: Removing unreachable block (ram,0x0027d884) */

ulong FUN_0027d6a4(undefined8 *param_1,undefined8 param_2,ulong param_3)

{
  char *pcVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  char *pcVar5;
  ulong uVar6;
  ulong *puVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined8 uVar10;
  char *unaff_x20;
  char *pcVar11;
  undefined8 *puVar12;
  long unaff_x29;
  undefined1 auVar13 [16];
  char cStack0000000000000008;
  undefined1 auStack_c8 [16];
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined8 uStack_a0;
  undefined4 uStack_98;
  undefined1 auStack_40 [16];
  undefined1 auStack_30 [16];
  char *pcStack_20;
  ulong uStack_18;
  
  *(undefined8 *)(unaff_x29 + -0x28) = *param_1;
  if ((param_3 == 0) || (*(long *)(param_3 + 0x18) == 0)) {
    uVar9 = 4;
    uVar3 = func_0x0027e76c();
    if (uVar3 != 4) {
      uVar3 = 0xffffffff;
    }
    uVar6 = (ulong)uVar3;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return uVar6;
    }
  }
  else {
    pcVar11 = &cStack0000000000000008;
    uVar9 = param_3;
    iVar2 = func_0x0036f964(&cStack0000000000000008,0x50,param_3,0);
    if (iVar2 < 0x50) {
      pcVar5 = (char *)0x0;
    }
    else {
      pcVar5 = (char *)func_0x0036e274(iVar2 + 1);
      if (pcVar5 == (char *)0x0) {
        uVar6 = 0xffffffff;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return 0xffffffff;
        }
        goto LAB_0027d7f8;
      }
      iVar2 = func_0x0036f964(pcVar5,iVar2 + 1,param_3,0);
      pcVar11 = pcVar5;
    }
    pcVar1 = "<INVALID>";
    if (0 < iVar2) {
      pcVar1 = pcVar11;
    }
    uVar6 = _strlen(pcVar1);
    if (uVar6 >> 0x1f == 0) {
      uVar9 = uVar6;
      uVar4 = func_0x0027e76c();
      uVar3 = (uint)uVar6;
      if (uVar4 != uVar3) {
        uVar3 = 0xffffffff;
      }
      uVar6 = (ulong)uVar3;
    }
    else {
      uVar9 = 0x45;
      func_0x0028f83c(0xc,0,0x45,"/aws-lc/crypto/asn1/a_object.c",0x65);
      uVar6 = 0xffffffff;
    }
    func_0x0036e3d8(pcVar5);
    unaff_x20 = pcVar5;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return uVar6;
    }
  }
LAB_0027d7f8:
  auVar13 = ___stack_chk_fail();
  puVar7 = auVar13._0_8_;
  if ((long)uVar9 < 0) {
    return 0;
  }
  pcStack_20 = unaff_x20;
  uStack_18 = uVar6;
  func_0x00283a8c(auStack_30,*auVar13._8_8_);
  iVar2 = func_0x002843d4(auStack_30,auStack_40,6);
  if (iVar2 == 0) {
    func_0x0028f83c(0xc,0,0x6d,"/aws-lc/crypto/asn1/a_object.c",0x8e);
    return 0;
  }
  uVar8 = func_0x00283abc(auStack_40);
  uVar9 = func_0x00283ac4(auStack_40);
  if ((long)uVar9 < 0) {
    uVar8 = 0x92;
    uVar10 = 0x9f;
  }
  else {
    func_0x00283a8c(auStack_c8,uVar8);
    iVar2 = func_0x00284e04(auStack_c8);
    if (iVar2 == 0) {
      uVar8 = 0x92;
      uVar10 = 0xa6;
    }
    else {
      if (uVar9 >> 0x1f == 0) {
        uStack_b8 = 0;
        uStack_b0 = 0;
        uStack_a4 = (undefined4)uVar9;
        uStack_a8 = 0;
        uStack_98 = 0xd;
        uStack_a0 = uVar8;
        uVar9 = func_0x0036f080(&uStack_b8);
        if (uVar9 == 0) {
          return 0;
        }
        if (puVar7 == (ulong *)0x0) {
          return uVar9;
        }
        puVar12 = (undefined8 *)*puVar7;
        if (puVar12 != (undefined8 *)0x0) {
          uVar3 = *(uint *)(puVar12 + 4);
          if ((uVar3 >> 2 & 1) != 0) {
            func_0x0036e3d8(*puVar12);
            func_0x0036e3d8(puVar12[1]);
            *puVar12 = 0;
            puVar12[1] = 0;
            uVar3 = *(uint *)(puVar12 + 4);
          }
          if ((uVar3 >> 3 & 1) != 0) {
            func_0x0036e3d8(puVar12[3]);
            puVar12[3] = 0;
            *(undefined4 *)((long)puVar12 + 0x14) = 0;
            uVar3 = *(uint *)(puVar12 + 4);
          }
          if ((uVar3 & 1) != 0) {
            func_0x0036e3d8(puVar12);
          }
        }
        *puVar7 = uVar9;
        return uVar9;
      }
      uVar8 = 0xad;
      uVar10 = 0xd9;
    }
  }
  func_0x0028f83c(0xc,0,uVar8,"/aws-lc/crypto/asn1/a_object.c",uVar10);
  return 0;
}

