
/* WARNING: Possible PIC construction at 0x002b3658: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002b31c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002b32e4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002b31c4) */
/* WARNING: Removing unreachable block (ram,0x002b3348) */
/* WARNING: Removing unreachable block (ram,0x002b3370) */
/* WARNING: Removing unreachable block (ram,0x002b3368) */
/* WARNING: Removing unreachable block (ram,0x002b31c8) */
/* WARNING: Removing unreachable block (ram,0x002b365c) */
/* WARNING: Removing unreachable block (ram,0x002b3660) */
/* WARNING: Removing unreachable block (ram,0x002b3668) */
/* WARNING: Removing unreachable block (ram,0x002b3764) */
/* WARNING: Removing unreachable block (ram,0x002b3790) */
/* WARNING: Removing unreachable block (ram,0x002b3670) */
/* WARNING: Removing unreachable block (ram,0x002b3678) */
/* WARNING: Removing unreachable block (ram,0x002b3684) */
/* WARNING: Removing unreachable block (ram,0x002b32e8) */
/* WARNING: Removing unreachable block (ram,0x002b32f8) */
/* WARNING: Removing unreachable block (ram,0x002b3318) */
/* WARNING: Removing unreachable block (ram,0x002b3324) */
/* WARNING: Removing unreachable block (ram,0x002b3328) */
/* WARNING: Removing unreachable block (ram,0x002b3338) */

ulong FUN_002b3d50(undefined8 param_1,undefined8 param_2,uint *param_3,ulong param_4,ulong param_5)

{
  byte bVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long *plVar7;
  ulong extraout_x1;
  undefined8 uVar8;
  uint *puVar9;
  int iVar10;
  undefined8 uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  uint uVar15;
  undefined1 *puVar16;
  long *plVar17;
  undefined8 *puVar18;
  undefined1 *puVar19;
  long *plVar20;
  undefined8 *puVar21;
  long *unaff_x19;
  uint *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long lVar22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  undefined8 unaff_x28;
  undefined *puVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined1 uStack0000000000000010;
  
  auVar31._8_8_ = param_2;
  auVar31._0_8_ = param_1;
  puVar2 = &uStack0000000000000010;
  do {
    plVar7 = auVar31._0_8_;
    *(ulong *)(puVar2 + -0x40) = unaff_x24;
    *(ulong *)(puVar2 + -0x38) = unaff_x23;
    *(long *)(puVar2 + -0x30) = unaff_x22;
    *(ulong *)(puVar2 + -0x28) = unaff_x21;
    *(uint **)(puVar2 + -0x20) = unaff_x20;
    *(long **)(puVar2 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar2 + -0x10) = in_stack_00000000;
    *(undefined **)(puVar2 + -8) = in_stack_00000008;
    if (plVar7 == (long *)0x0) {
      uVar5 = 0xe;
      uVar8 = 0x43;
      uVar11 = 0x16b;
code_r0x002b3400:
      func_0x0028f83c(uVar5,0,uVar8,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",uVar11);
      return 0;
    }
    if ((int)plVar7[0x12] != 0) {
      uVar5 = 0x1e;
      uVar8 = 0x42;
      uVar11 = 0x16e;
      goto code_r0x002b3400;
    }
    lVar22 = *plVar7;
    if (lVar22 == 0) {
      uVar5 = 0xe;
      uVar8 = 0x43;
      uVar11 = 0x171;
      goto code_r0x002b3400;
    }
    if ((*(byte *)(lVar22 + 0x15) >> 2 & 1) != 0) {
      uVar4 = (**(code **)(lVar22 + 0x28))(plVar7,auVar31._8_8_,0,0);
      if ((int)uVar4 < 0) {
        return 0;
      }
      *param_3 = uVar4;
      return 1;
    }
    uVar4 = *(uint *)(lVar22 + 4);
    if (uVar4 < 0x21) {
      if (uVar4 != 1) {
        uVar15 = *(uint *)((long)plVar7 + 100);
        if ((*(byte *)((long)plVar7 + 0x21) >> 3 & 1) == 0) {
          if (uVar15 < uVar4) {
            _memset((long)plVar7 + (ulong)uVar15 + 0x44,uVar4 - uVar15,(ulong)(uVar4 + ~uVar15) + 1)
            ;
          }
          uVar6 = (**(code **)(lVar22 + 0x28))
                            (plVar7,auVar31._8_8_,(long)plVar7 + 0x44,(ulong)uVar4);
          if ((int)uVar6 == 0) {
            return uVar6;
          }
          *param_3 = uVar4;
          return 1;
        }
        if (uVar15 != 0) {
          uVar5 = 0x1e;
          uVar8 = 0x6a;
          uVar11 = 0x188;
          goto code_r0x002b3400;
        }
      }
      *param_3 = 0;
      return 1;
    }
    unaff_x20 = param_3;
    auVar30 = func_0x0079e320();
    unaff_x22 = auVar30._8_8_;
    unaff_x19 = auVar30._0_8_;
    puVar3 = puVar2 + -0x90;
    *(long *)(puVar2 + -0x90) = unaff_x26;
    *(ulong *)(puVar2 + -0x88) = unaff_x25;
    *(ulong *)(puVar2 + -0x80) = unaff_x24;
    *(long *)(puVar2 + -0x78) = lVar22;
    *(ulong *)(puVar2 + -0x70) = (ulong)uVar4;
    *(undefined1 (*) [16])(puVar2 + -0x68) = auVar31;
    *(uint **)(puVar2 + -0x58) = param_3;
    *(undefined1 **)(puVar2 + -0x50) = puVar2 + -0x10;
    *(undefined **)(puVar2 + -0x48) = &_aws_lc_0_24_0_EVP_DecryptUpdate;
    puVar16 = puVar2 + -0x50;
    if (unaff_x19 == (long *)0x0) {
      uVar5 = 0xe;
      uVar8 = 0x43;
      uVar11 = 0x1a0;
code_r0x002b35b8:
      func_0x0028f83c(uVar5,0,uVar8,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",uVar11);
      return 0;
    }
    if ((int)unaff_x19[0x12] != 0) {
      uVar5 = 0x1e;
      uVar8 = 0x42;
      uVar11 = 0x1a2;
      goto code_r0x002b35b8;
    }
    lVar22 = *unaff_x19;
    if (lVar22 == 0) {
      uVar5 = 0xe;
      uVar8 = 0x43;
      uVar11 = 0x1a9;
      goto code_r0x002b35b8;
    }
    uVar4 = *(uint *)(lVar22 + 4);
    uVar6 = (ulong)uVar4;
    iVar10 = (int)param_5;
    if (1 < uVar4 && (int)(uVar4 ^ 0x7fffffff) < iVar10) {
      uVar5 = 0x1e;
      uVar8 = 0x45;
      uVar11 = 0x1ac;
      goto code_r0x002b35b8;
    }
    if ((*(byte *)(lVar22 + 0x15) >> 2 & 1) != 0) {
      uVar4 = (**(code **)(lVar22 + 0x28))(unaff_x19,unaff_x22,param_4,(long)iVar10);
      *unaff_x20 = uVar4 & ((int)uVar4 >> 0x1f ^ 0xffffffffU);
      return (ulong)(~uVar4 >> 0x1f);
    }
    if (iVar10 < 1) {
      *unaff_x20 = 0;
      return (ulong)(iVar10 == 0);
    }
    if ((*(byte *)((long)unaff_x19 + 0x21) >> 3 & 1) == 0) {
      if (0x20 < uVar4) {
        puVar9 = unaff_x20;
        auVar31 = func_0x0079e348();
        lVar22 = auVar31._8_8_;
        plVar7 = auVar31._0_8_;
        *(long *)(puVar2 + -0xb0) = unaff_x22;
        *(uint **)(puVar2 + -0xa8) = unaff_x20;
        *(undefined1 **)(puVar2 + -0xa0) = puVar16;
        *(undefined **)(puVar2 + -0x98) = &_aws_lc_0_24_0_EVP_DecryptFinal_ex;
        *puVar9 = 0;
        if (plVar7 == (long *)0x0) {
          func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x1e6);
          return 0;
        }
        if ((int)plVar7[0x12] != 0) {
          func_0x0028f83c(0x1e,0,0x42,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x1ed);
          return 0;
        }
        lVar12 = *plVar7;
        if (lVar12 == 0) {
          func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x1f0);
          return 0;
        }
        if ((*(byte *)(lVar12 + 0x15) >> 2 & 1) != 0) {
          uVar4 = (**(code **)(lVar12 + 0x28))(plVar7,lVar22,0,0);
          if ((int)uVar4 < 0) {
            return 0;
          }
          *puVar9 = uVar4;
          return 1;
        }
        if ((*(byte *)((long)plVar7 + 0x21) >> 3 & 1) != 0) {
          if (*(int *)((long)plVar7 + 100) == 0) {
            return 1;
          }
          func_0x0028f83c(0x1e,0,0x6a,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x1fe);
          return 0;
        }
        uVar4 = *(uint *)(lVar12 + 4);
        if (uVar4 < 2) {
          return 1;
        }
        if ((*(int *)((long)plVar7 + 100) != 0) || (*(int *)((long)plVar7 + 0x6c) == 0)) {
          func_0x0028f83c(0x1e,0,0x7b,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x207);
          return 0;
        }
        if (0x20 < uVar4) {
          plVar7 = (long *)func_0x0079e370();
          *(undefined1 **)(puVar2 + -0xc0) = puVar2 + -0xa0;
          *(undefined **)(puVar2 + -0xb8) = &_aws_lc_0_24_0_EVP_Cipher;
          if (plVar7 == (long *)0x0) {
            func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22c);
            return 0;
          }
          if (*plVar7 == 0) {
            func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22d);
            return 0;
          }
                    /* WARNING: Could not recover jumptable at 0x002b3a90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar6 = (**(code **)(*plVar7 + 0x28))();
          return uVar6;
        }
        uVar6 = (ulong)(uVar4 - 1);
        bVar1 = *(byte *)((long)plVar7 + uVar6 + 0x70);
        uVar15 = (uint)bVar1;
        if (bVar1 == 0 || uVar4 < bVar1) {
          func_0x0028f83c(0x1e,0,0x65,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x210);
          return 0;
        }
        do {
          if ((uint)*(byte *)((long)plVar7 + uVar6 + 0x70) != (uint)bVar1) {
            func_0x0028f83c(0x1e,0,0x65,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x216);
            return 0;
          }
          uVar6 = (ulong)((int)uVar6 - 1);
          uVar15 = uVar15 - 1;
        } while (uVar15 != 0);
        uVar4 = uVar4 - bVar1;
        uVar6 = (ulong)uVar4;
        if ((int)uVar4 < 1) goto code_r0x002b39b0;
        if ((uVar4 < 8) || ((lVar22 - (long)plVar7) - 0x70U < 0x40)) {
          uVar13 = 0;
        }
        else {
          if (uVar4 < 0x40) {
            uVar14 = 0;
          }
          else {
            uVar13 = uVar6 & 0xffffffc0;
            plVar17 = plVar7 + 0x14;
            plVar20 = (long *)(lVar22 + 0x20);
            uVar14 = uVar13;
            do {
              lVar12 = plVar17[-6];
              lVar25 = plVar17[-3];
              lVar24 = plVar17[-4];
              lVar27 = plVar17[-1];
              lVar26 = plVar17[-2];
              lVar29 = plVar17[1];
              lVar28 = *plVar17;
              plVar20[-3] = plVar17[-5];
              plVar20[-4] = lVar12;
              plVar20[-1] = lVar25;
              plVar20[-2] = lVar24;
              plVar20[1] = lVar27;
              *plVar20 = lVar26;
              plVar20[3] = lVar29;
              plVar20[2] = lVar28;
              plVar17 = plVar17 + 8;
              uVar14 = uVar14 - 0x40;
              plVar20 = plVar20 + 8;
            } while (uVar14 != 0);
            if (uVar13 == uVar6) goto code_r0x002b39b0;
            uVar14 = uVar13;
            if ((uVar4 & 0x38) == 0) goto code_r0x002b3990;
          }
          uVar13 = uVar6 & 0xfffffff8;
          lVar12 = uVar14 - uVar13;
          puVar18 = (undefined8 *)((long)plVar7 + uVar14 + 0x70);
          puVar21 = (undefined8 *)(lVar22 + uVar14);
          do {
            *puVar21 = *puVar18;
            lVar12 = lVar12 + 8;
            puVar18 = puVar18 + 1;
            puVar21 = puVar21 + 1;
          } while (lVar12 != 0);
          if (uVar13 == uVar6) goto code_r0x002b39b0;
        }
code_r0x002b3990:
        lVar12 = uVar6 - uVar13;
        puVar16 = (undefined1 *)(lVar22 + uVar13);
        puVar19 = (undefined1 *)((long)plVar7 + uVar13 + 0x70);
        do {
          *puVar16 = *puVar19;
          lVar12 = lVar12 + -1;
          puVar16 = puVar16 + 1;
          puVar19 = puVar19 + 1;
        } while (lVar12 != 0);
code_r0x002b39b0:
        *puVar9 = uVar4;
        return 1;
      }
      unaff_x25 = (ulong)*(uint *)((long)unaff_x19 + 0x6c);
      if (*(uint *)((long)unaff_x19 + 0x6c) != 0) {
        if (uVar4 != 0) {
          _memcpy(unaff_x22,unaff_x19 + 0xe,uVar6);
        }
        unaff_x22 = unaff_x22 + uVar6;
      }
      puVar23 = &UNK_002b365c;
      puVar9 = unaff_x20;
      lVar22 = unaff_x22;
      plVar7 = unaff_x19;
      uVar14 = param_4;
      uVar13 = param_5;
    }
    else {
      puVar16 = *(undefined1 **)(puVar2 + -0x50);
      puVar23 = *(undefined **)(puVar2 + -0x48);
      lVar22 = *(long *)(puVar2 + -0x60);
      puVar9 = *(uint **)(puVar2 + -0x58);
      uVar6 = *(ulong *)(puVar2 + -0x70);
      plVar7 = *(long **)(puVar2 + -0x68);
      uVar13 = *(ulong *)(puVar2 + -0x80);
      uVar14 = *(ulong *)(puVar2 + -0x78);
      puVar3 = puVar2 + -0x40;
      unaff_x26 = *(long *)(puVar2 + -0x90);
      unaff_x25 = *(ulong *)(puVar2 + -0x88);
    }
    *(undefined8 *)(puVar3 + -0x60) = unaff_x28;
    *(ulong *)(puVar3 + -0x58) = unaff_x27;
    *(long *)(puVar3 + -0x50) = unaff_x26;
    *(ulong *)(puVar3 + -0x48) = unaff_x25;
    *(ulong *)(puVar3 + -0x40) = uVar13;
    *(ulong *)(puVar3 + -0x38) = uVar14;
    *(ulong *)(puVar3 + -0x30) = uVar6;
    *(long **)(puVar3 + -0x28) = plVar7;
    *(long *)(puVar3 + -0x20) = lVar22;
    *(uint **)(puVar3 + -0x18) = puVar9;
    *(undefined1 **)(puVar3 + -0x10) = puVar16;
    *(undefined **)(puVar3 + -8) = puVar23;
    if (unaff_x19 == (long *)0x0) {
      uVar5 = 0xe;
      uVar8 = 0x43;
      uVar11 = 0x10c;
code_r0x002b3148:
      func_0x0028f83c(uVar5,0,uVar8,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",uVar11);
      return 0;
    }
    if ((int)unaff_x19[0x12] != 0) {
      uVar5 = 0x1e;
      uVar8 = 0x42;
      uVar11 = 0x10e;
      goto code_r0x002b3148;
    }
    *(undefined4 *)(unaff_x19 + 0x12) = 1;
    lVar22 = *unaff_x19;
    if (lVar22 == 0) {
      uVar5 = 0xe;
      uVar8 = 0x43;
      uVar11 = 0x118;
      goto code_r0x002b3148;
    }
    uVar4 = *(uint *)(lVar22 + 4);
    unaff_x24 = (ulong)uVar4;
    if (1 < (int)uVar4 && (int)(uVar4 ^ 0x7fffffff) < iVar10) {
      uVar5 = 0x1e;
      uVar8 = 0x45;
      uVar11 = 0x11b;
      goto code_r0x002b3148;
    }
    if ((*(byte *)(lVar22 + 0x15) >> 2 & 1) != 0) {
      uVar4 = (**(code **)(lVar22 + 0x28))(unaff_x19,unaff_x22,param_4,(long)iVar10);
      if ((int)uVar4 < 0) {
        return 0;
      }
      *unaff_x20 = uVar4;
code_r0x002b333c:
      *(undefined4 *)(unaff_x19 + 0x12) = 0;
      return 1;
    }
    if (iVar10 < 1) {
      *unaff_x20 = 0;
      if (iVar10 != 0) {
        return 0;
      }
      goto code_r0x002b333c;
    }
    uVar15 = *(uint *)((long)unaff_x19 + 100);
    uVar6 = param_5;
    param_3 = unaff_x20;
    unaff_x21 = param_4;
    unaff_x23 = param_5;
    if (uVar15 == 0) {
      puVar23 = &UNK_002b31c4;
    }
    else if ((int)uVar4 < 0x21) {
      if (uVar15 == 0) {
        unaff_x24 = 0;
      }
      else {
        unaff_x25 = (ulong)(int)uVar4;
        lVar22 = (long)(int)uVar15;
        unaff_x26 = unaff_x25 - lVar22;
        unaff_x27 = (ulong)(uint)(iVar10 - (int)unaff_x26);
        if (iVar10 < (int)unaff_x26) {
          _memcpy((long)unaff_x19 + lVar22 + 0x44,param_4,param_5 & 0xffffffff);
          *(int *)((long)unaff_x19 + 100) = *(int *)((long)unaff_x19 + 100) + iVar10;
          *unaff_x20 = 0;
          goto code_r0x002b333c;
        }
        param_3 = (uint *)((long)unaff_x19 + 0x44);
        if (uVar4 != uVar15) {
          _memcpy((long)unaff_x19 + lVar22 + 0x44,param_4,unaff_x26);
        }
        uVar6 = unaff_x25;
        uVar13 = (**(code **)(*unaff_x19 + 0x28))(unaff_x19,unaff_x22);
        if ((int)uVar13 == 0) {
          return uVar13;
        }
        unaff_x21 = param_4 + unaff_x26;
        unaff_x22 = unaff_x22 + unaff_x25;
        param_4 = uVar6;
        uVar6 = unaff_x27;
      }
      *unaff_x20 = (uint)unaff_x24;
      uVar4 = *(uint *)(*unaff_x19 + 4);
      puVar23 = &UNK_002b32e8;
      unaff_x23 = uVar6;
    }
    else {
      puVar23 = &DAT_002b337c;
      uVar4 = func_0x0079e2a8();
      uVar6 = extraout_x1;
    }
    puVar2 = puVar3 + -0x70;
    in_stack_00000000 = puVar3 + -0x70;
    *(undefined1 **)(puVar3 + -0x70) = puVar3 + -0x10;
    *(undefined **)(puVar3 + -0x68) = puVar23;
    if (uVar4 == 0) {
      func_0x0079e2d0();
    }
    else if ((uVar4 & uVar4 - 1) == 0) {
      return (ulong)(uVar4 - 1 & (uint)uVar6);
    }
    in_stack_00000008 = &_aws_lc_0_24_0_EVP_EncryptFinal_ex;
    auVar31 = func_0x0079e2f8();
  } while( true );
}

