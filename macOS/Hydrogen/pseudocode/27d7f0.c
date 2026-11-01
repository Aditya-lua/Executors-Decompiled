
/* WARNING: Possible PIC construction at 0x0027d858: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0027d85c) */
/* WARNING: Removing unreachable block (ram,0x0027d864) */
/* WARNING: Removing unreachable block (ram,0x0027d8e4) */
/* WARNING: Removing unreachable block (ram,0x0027d878) */
/* WARNING: Removing unreachable block (ram,0x0027d884) */

long FUN_0027d7f0(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  uint uVar1;
  int iVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  long in_x9;
  long unaff_x19;
  undefined8 *puVar8;
  undefined1 auVar9 [16];
  undefined1 auStack_c8 [16];
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined8 uStack_a0;
  undefined4 uStack_98;
  undefined1 auStack_40 [16];
  undefined1 auStack_30 [16];
  
  if (in_x9 == param_1) {
    return unaff_x19;
  }
  auVar9 = ___stack_chk_fail();
  plVar3 = auVar9._0_8_;
  if (param_4 < 0) {
    return 0;
  }
  func_0x00283a8c(auStack_30,*auVar9._8_8_);
  iVar2 = func_0x002843d4(auStack_30,auStack_40,6);
  if (iVar2 == 0) {
    func_0x0028f83c(0xc,0,0x6d,"/aws-lc/crypto/asn1/a_object.c",0x8e);
    return 0;
  }
  uVar4 = func_0x00283abc(auStack_40);
  uVar5 = func_0x00283ac4(auStack_40);
  if ((long)uVar5 < 0) {
    uVar4 = 0x92;
    uVar7 = 0x9f;
  }
  else {
    func_0x00283a8c(auStack_c8,uVar4);
    iVar2 = func_0x00284e04(auStack_c8);
    if (iVar2 == 0) {
      uVar4 = 0x92;
      uVar7 = 0xa6;
    }
    else {
      if (uVar5 >> 0x1f == 0) {
        uStack_b8 = 0;
        uStack_b0 = 0;
        uStack_a4 = (undefined4)uVar5;
        uStack_a8 = 0;
        uStack_98 = 0xd;
        uStack_a0 = uVar4;
        lVar6 = func_0x0036f080(&uStack_b8);
        if (lVar6 == 0) {
          return 0;
        }
        if (plVar3 == (long *)0x0) {
          return lVar6;
        }
        puVar8 = (undefined8 *)*plVar3;
        if (puVar8 != (undefined8 *)0x0) {
          uVar1 = *(uint *)(puVar8 + 4);
          if ((uVar1 >> 2 & 1) != 0) {
            func_0x0036e3d8(*puVar8);
            func_0x0036e3d8(puVar8[1]);
            *puVar8 = 0;
            puVar8[1] = 0;
            uVar1 = *(uint *)(puVar8 + 4);
          }
          if ((uVar1 >> 3 & 1) != 0) {
            func_0x0036e3d8(puVar8[3]);
            puVar8[3] = 0;
            *(undefined4 *)((long)puVar8 + 0x14) = 0;
            uVar1 = *(uint *)(puVar8 + 4);
          }
          if ((uVar1 & 1) != 0) {
            func_0x0036e3d8(puVar8);
          }
        }
        *plVar3 = lVar6;
        return lVar6;
      }
      uVar4 = 0xad;
      uVar7 = 0xd9;
    }
  }
  func_0x0028f83c(0xc,0,uVar4,"/aws-lc/crypto/asn1/a_object.c",uVar7);
  return 0;
}

