
/* WARNING: Possible PIC construction at 0x002b5670: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002b5674) */
/* WARNING: Removing unreachable block (ram,0x002b5678) */
/* WARNING: Removing unreachable block (ram,0x002b56b0) */
/* WARNING: Removing unreachable block (ram,0x002b568c) */
/* WARNING: Removing unreachable block (ram,0x002b56bc) */
/* WARNING: Removing unreachable block (ram,0x002b56c4) */
/* WARNING: Removing unreachable block (ram,0x002b56ac) */
/* WARNING: Removing unreachable block (ram,0x002b56cc) */

undefined8
FUN_002b5430(undefined8 param_1,undefined8 param_2,segment_command *param_3,long param_4,
            undefined8 param_5)

{
  uint uVar1;
  uint uVar2;
  ushort uVar3;
  ushort uVar4;
  ushort uVar5;
  ushort uVar6;
  ushort uVar7;
  ushort uVar8;
  ushort uVar9;
  ushort uVar10;
  ushort uVar11;
  ushort uVar12;
  ushort uVar13;
  ushort uVar14;
  ushort uVar15;
  ushort uVar16;
  char cVar17;
  int iVar18;
  long lVar19;
  undefined8 uVar20;
  long *plVar21;
  uint *unaff_x19;
  long unaff_x29;
  undefined *puVar22;
  int in_stack_00000000;
  segment_command sStack0000000000000008;
  char cStack_178;
  undefined1 uStack_177;
  undefined1 uStack_176;
  undefined1 uStack_175;
  undefined1 uStack_174;
  undefined1 uStack_173;
  undefined1 uStack_172;
  byte bStack_171;
  undefined1 uStack_170;
  undefined1 uStack_16f;
  undefined1 uStack_16e;
  undefined1 uStack_16d;
  undefined1 uStack_16c;
  undefined1 uStack_16b;
  undefined1 uStack_16a;
  byte bStack_169;
  long lStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined1 *puStack_150;
  undefined *puStack_148;
  long alStack_130 [27];
  long lStack_58;
  undefined1 auStack_6 [6];
  
  if (sStack0000000000000008._0_8_ == 4) {
    if (in_stack_00000000 != 0) {
      *unaff_x19 = *unaff_x19 | 0x40;
code_r0x002b5450:
      sStack0000000000000008._0_8_ = 4;
      param_3 = &sStack0000000000000008;
      param_4 = 0;
      param_5 = 0;
      iVar18 = _sysctlbyname("hw.optional.armv8_2_sha3");
      if (iVar18 == 0) {
        if (sStack0000000000000008._0_8_ == 4) {
          if (in_stack_00000000 != 0) {
            *unaff_x19 = *unaff_x19 | 0x800;
          }
          goto LAB_002b5498;
        }
        goto LAB_002b55a0;
      }
LAB_002b5498:
      iVar18 = _sysctlbyname("machdep.cpu.brand_string",&sStack0000000000000008);
      if ((iVar18 == 0) && (iVar18 = _strncmp(&sStack0000000000000008,"Apple M"), iVar18 == 0)) {
        *unaff_x19 = *unaff_x19 | 0x2000;
      }
      sStack0000000000000008._0_8_ = 4;
      param_3 = &sStack0000000000000008;
      param_4 = 0;
      param_5 = 0;
      iVar18 = _sysctlbyname("hw.optional.arm.FEAT_DIT");
      if (iVar18 != 0) {
LAB_002b5540:
        lVar19 = _getenv("OPENSSL_armcap");
        uVar20 = 0;
        if (lVar19 != 0) {
          uVar20 = func_0x002b5140(0xa334f8,lVar19);
        }
        uRam0000000000a334fc = 1;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
          return uVar20;
        }
        ___stack_chk_fail();
        goto LAB_002b559c;
      }
      if (sStack0000000000000008._0_8_ == 4) {
        *unaff_x19 = *unaff_x19 | 0x18000;
        goto LAB_002b5540;
      }
      goto LAB_002b55a4;
    }
    sStack0000000000000008._0_8_ = 4;
    param_3 = &sStack0000000000000008;
    param_4 = 0;
    param_5 = 0;
    iVar18 = _sysctlbyname("hw.optional.armv8_2_sha512");
    if ((iVar18 != 0) || (sStack0000000000000008._0_8_ == 4)) goto code_r0x002b5450;
  }
  else {
LAB_002b559c:
    func_0x0079e3e4();
LAB_002b55a0:
    func_0x0079e3e4();
LAB_002b55a4:
    func_0x0079e3e4();
  }
  func_0x0079e3e4();
  uVar20 = func_0x0079e3bc();
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (param_3 == &segment_command_00000020) {
    func_0x00373e9c(0xa29678,&DAT_002b45d8);
    param_4 = 0xa3a8c0;
  }
  else {
    if (param_3 != (segment_command *)&MACH_HEADER.ncmds) {
      uVar20 = 0;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
        return 0;
      }
      puVar22 = &_aws_lc_0_24_0_CMAC_Init;
      plVar21 = (long *)___stack_chk_fail();
      goto code_r0x002b5778;
    }
    func_0x00373e9c(0xa29668,&DAT_002b4228);
    param_4 = 0xa3a880;
  }
  alStack_130[0x11] = 0;
  alStack_130[0x10] = 0;
  alStack_130[0xd] = 0;
  alStack_130[0xc] = 0;
  alStack_130[0xf] = 0;
  alStack_130[0xe] = 0;
  alStack_130[9] = 0;
  alStack_130[8] = 0;
  alStack_130[0xb] = 0;
  alStack_130[10] = 0;
  alStack_130[5] = 0;
  alStack_130[4] = 0;
  alStack_130[7] = 0;
  alStack_130[6] = 0;
  alStack_130[1] = 0;
  alStack_130[0] = 0;
  alStack_130[3] = 0;
  alStack_130[2] = 0;
  alStack_130[0x12] = 1;
  plVar21 = alStack_130;
  puVar22 = (undefined *)0x2b5674;
code_r0x002b5778:
  lStack_168 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_160 = param_5;
  uStack_158 = uVar20;
  puStack_150 = auStack_6 + -10;
  puStack_148 = puVar22;
  if (((param_4 == 0) || (iVar18 = *(int *)(param_4 + 4), iVar18 != 0x10 && iVar18 != 8)) ||
     ((segment_command *)(ulong)*(uint *)(param_4 + 8) != param_3)) {
    uVar20 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_168) {
      return 0;
    }
  }
  else {
    uVar20 = func_0x002b2bd8(plVar21,param_4);
    if ((int)uVar20 == 0) goto code_r0x002b5a5c;
    if (plVar21 == (long *)0x0) goto code_r0x002b5a20;
    if (*plVar21 == 0) {
      uVar20 = 0x22d;
      goto code_r0x002b5a54;
    }
    uVar20 = (**(code **)(*plVar21 + 0x28))(plVar21,&cStack_178,&UNK_008310f0,iVar18);
    if ((int)uVar20 == 0) goto code_r0x002b5a5c;
    uVar20 = func_0x002b2bd8(plVar21,0);
    if ((int)uVar20 == 0) goto code_r0x002b5a5c;
    cVar17 = (char)((ulong)(long)(int5)((uint5)CONCAT11(cStack_178,uStack_177) << 0x18) >> 0x1f);
    *(char *)(plVar21 + 0x13) = cVar17;
    uVar3 = CONCAT11(uStack_177,uStack_176) >> 7;
    uVar4 = CONCAT11(uStack_176,uStack_175) >> 7;
    *(char *)((long)plVar21 + 0x99) = (char)uVar3;
    *(char *)((long)plVar21 + 0x9a) = (char)uVar4;
    uVar5 = CONCAT11(uStack_175,uStack_174) >> 7;
    *(char *)((long)plVar21 + 0x9b) = (char)uVar5;
    uVar6 = CONCAT11(uStack_174,uStack_173) >> 7;
    *(char *)((long)plVar21 + 0x9c) = (char)uVar6;
    uVar7 = CONCAT11(uStack_173,uStack_172) >> 7;
    *(char *)((long)plVar21 + 0x9d) = (char)uVar7;
    uVar8 = CONCAT11(uStack_172,bStack_171) >> 7;
    *(char *)((long)plVar21 + 0x9e) = (char)uVar8;
    uVar2 = (uint)cVar17;
    if (iVar18 == 0x10) {
      uVar9 = CONCAT11(bStack_171,uStack_170) >> 7;
      *(char *)((long)plVar21 + 0x9f) = (char)uVar9;
      uVar10 = CONCAT11(uStack_170,uStack_16f) >> 7;
      *(char *)(plVar21 + 0x14) = (char)uVar10;
      uVar11 = CONCAT11(uStack_16f,uStack_16e) >> 7;
      uVar12 = CONCAT11(uStack_16e,uStack_16d) >> 7;
      *(char *)((long)plVar21 + 0xa1) = (char)uVar11;
      *(char *)((long)plVar21 + 0xa2) = (char)uVar12;
      uVar13 = CONCAT11(uStack_16d,uStack_16c) >> 7;
      *(char *)((long)plVar21 + 0xa3) = (char)uVar13;
      uVar14 = CONCAT11(uStack_16c,uStack_16b) >> 7;
      *(char *)((long)plVar21 + 0xa4) = (char)uVar14;
      uVar15 = CONCAT11(uStack_16b,uStack_16a) >> 7;
      *(char *)((long)plVar21 + 0xa5) = (char)uVar15;
      uVar16 = CONCAT11(uStack_16a,bStack_169) >> 7;
      *(char *)((long)plVar21 + 0xa6) = (char)uVar16;
      uVar1 = (int)cStack_178 >> 7 & 0xffffff87U ^ (uint)bStack_169 << 1;
      *(char *)((long)plVar21 + 0xa7) = (char)uVar1;
      *(char *)(plVar21 + 0x15) = (char)(CONCAT44(uVar2,(uint)uVar3 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xa9) = (char)(CONCAT24(uVar3,(uint)uVar4 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xaa) = (char)(CONCAT24(uVar4,(uint)uVar5 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xab) = (char)(CONCAT24(uVar5,(uint)uVar6 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xac) = (char)(CONCAT24(uVar6,(uint)uVar7 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xad) = (char)(CONCAT24(uVar7,(uint)uVar8 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xae) = (char)(CONCAT24(uVar8,(uint)uVar9 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xaf) = (char)(CONCAT24(uVar9,(uint)uVar10 << 0x18) >> 0x1f);
      *(char *)(plVar21 + 0x16) = (char)(CONCAT24(uVar10,(uint)uVar11 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xb1) = (char)(CONCAT24(uVar11,(uint)uVar12 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xb2) = (char)(CONCAT24(uVar12,(uint)uVar13 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xb3) = (char)(CONCAT24(uVar13,(uint)uVar14 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xb4) = (char)(CONCAT24(uVar14,(uint)uVar15 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xb5) = (char)(CONCAT24(uVar15,(uint)uVar16 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xb6) = (char)(CONCAT24(uVar16,uVar1 << 0x18) >> 0x1f);
      *(byte *)((long)plVar21 + 0xb7) = (byte)(uVar2 >> 7) & 0x87 ^ (byte)(uVar1 << 1);
    }
    else {
      uVar1 = (uint)(int)cStack_178 >> 7 & 0x1b ^ (uint)bStack_171 << 1;
      *(char *)((long)plVar21 + 0x9f) = (char)uVar1;
      *(char *)(plVar21 + 0x15) = (char)(CONCAT44(uVar2,(uint)uVar3 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xa9) = (char)(CONCAT24(uVar3,(uint)uVar4 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xaa) = (char)(CONCAT24(uVar4,(uint)uVar5 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xab) = (char)(CONCAT24(uVar5,(uint)uVar6 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xac) = (char)(CONCAT24(uVar6,(uint)uVar7 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xad) = (char)(CONCAT24(uVar7,(uint)uVar8 << 0x18) >> 0x1f);
      *(char *)((long)plVar21 + 0xae) = (char)(CONCAT24(uVar8,(uint)bStack_171 << 0x19) >> 0x1f);
      *(byte *)((long)plVar21 + 0xaf) = (byte)(uVar2 >> 7) & 0x1b ^ (byte)(uVar1 << 1);
    }
    *(undefined4 *)(plVar21 + 0x19) = 0;
    uVar20 = 1;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_168) {
      return 1;
    }
  }
  do {
    ___stack_chk_fail(uVar20);
code_r0x002b5a20:
    uVar20 = 0x22c;
code_r0x002b5a54:
    func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",uVar20);
    uVar20 = 0;
code_r0x002b5a5c:
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_168);
  return uVar20;
}

