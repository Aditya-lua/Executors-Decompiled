
/* WARNING: Possible PIC construction at 0x00270fec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0027140c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00271410) */
/* WARNING: Removing unreachable block (ram,0x00271458) */
/* WARNING: Removing unreachable block (ram,0x00271494) */
/* WARNING: Removing unreachable block (ram,0x0027149c) */
/* WARNING: Removing unreachable block (ram,0x002714c8) */
/* WARNING: Removing unreachable block (ram,0x002714a4) */
/* WARNING: Removing unreachable block (ram,0x00271468) */
/* WARNING: Removing unreachable block (ram,0x00271470) */
/* WARNING: Removing unreachable block (ram,0x00271488) */
/* WARNING: Removing unreachable block (ram,0x0027148c) */
/* WARNING: Removing unreachable block (ram,0x002714cc) */

long * FUN_00270fbc(undefined8 param_1)

{
  long *plVar1;
  code *pcVar2;
  undefined1 *puVar3;
  uint uVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  long *plVar9;
  long lVar10;
  ulong uVar11;
  long *plVar12;
  ulong uVar13;
  undefined8 *extraout_x8;
  undefined8 uVar14;
  long *extraout_x8_00;
  ulong *extraout_x8_01;
  ulong *extraout_x8_02;
  long unaff_x20;
  undefined8 *******unaff_x29;
  undefined *puVar15;
  undefined1 auStack_220 [128];
  undefined8 *******pppppppuStack_170;
  undefined *puStack_168;
  undefined8 *******pppppppuStack_130;
  undefined *puStack_128;
  undefined1 auStack_120 [8];
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 *puStack_a0;
  undefined8 ******ppppppuStack_90;
  undefined8 uStack_88;
  int iStack_74;
  undefined *puStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 *****pppppuStack_20;
  undefined8 ***pppuStack_18;
  
  uVar6 = func_0x007a28b0(param_1,0x85);
  if (unaff_x20 != 0) {
    puVar3 = (undefined1 *)register0x00000008;
    puVar15 = (undefined *)0x270ff0;
code_r0x00187bd4:
    *(undefined8 ********)(puVar3 + -0x10) = unaff_x29;
    *(undefined **)(puVar3 + -8) = puVar15;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar9 = (long *)(*(code *)PTR__free_00a24e58)();
    return plVar9;
  }
  lVar7 = __Unwind_Resume(uVar6);
  if (*(ulong *)(lVar7 + 0x10) < 0x86) {
    return (long *)(lVar7 + 0x18);
  }
  puVar8 = (undefined8 *)func_0x007a28b0(*(ulong *)(lVar7 + 0x10),0x85,&UNK_009cc3f0);
  pppuStack_18 = (undefined8 ***)0x271028;
  uVar6 = *puVar8;
  lVar7 = puVar8[1];
  pppppuStack_20 = (undefined8 *****)((long)register0x00000008 + -0x10);
  plVar9 = (long *)func_0x002d8e40(lVar7);
  iStack_74 = (int)plVar9;
  if (iStack_74 == 1) {
    if (lVar7 != 0) {
      uVar14 = puVar8[0xd];
      extraout_x8[0xe] = puVar8[0xe];
      extraout_x8[0xd] = uVar14;
      uVar14 = puVar8[0xf];
      extraout_x8[0x10] = puVar8[0x10];
      extraout_x8[0xf] = uVar14;
      uVar14 = puVar8[0x11];
      extraout_x8[0x12] = puVar8[0x12];
      extraout_x8[0x11] = uVar14;
      *(undefined8 *)((long)extraout_x8 + 0x95) = *(undefined8 *)((long)puVar8 + 0x95);
      uVar14 = puVar8[5];
      extraout_x8[6] = puVar8[6];
      extraout_x8[5] = uVar14;
      uVar14 = puVar8[7];
      extraout_x8[8] = puVar8[8];
      extraout_x8[7] = uVar14;
      uVar14 = puVar8[9];
      extraout_x8[10] = puVar8[10];
      extraout_x8[9] = uVar14;
      uVar14 = puVar8[0xb];
      extraout_x8[0xc] = puVar8[0xc];
      extraout_x8[0xb] = uVar14;
      uVar14 = puVar8[3];
      extraout_x8[4] = puVar8[4];
      extraout_x8[3] = uVar14;
      uVar14 = puVar8[2];
      *extraout_x8 = uVar6;
      extraout_x8[1] = lVar7;
      extraout_x8[2] = uVar14;
      return plVar9;
    }
  }
  else {
    puStack_70 = &UNK_009ccb38;
    uStack_68 = 1;
    uStack_58 = 0;
    uStack_50 = 0;
    uStack_60 = 8;
    func_0x0079ffdc(0,&UNK_0082d5c4,&iStack_74,&puStack_70,&UNK_009ccb48);
  }
  lVar7 = func_0x007a2810(&UNK_0082d5c8,0x20,&puStack_70,&UNK_009cca80,&UNK_009ccb20);
  uStack_88 = 0x271128;
  uVar6 = *(undefined8 *)(lVar7 + 8);
  puStack_a0 = puVar8;
  ppppppuStack_90 = &pppppuStack_20;
  uVar4 = func_0x002d9108(uVar6);
  if (-1 < (int)uVar4) {
    func_0x00281e30(&uStack_118,(ulong)uVar4 * 0x28);
    iVar5 = func_0x00290560(&uStack_118,uVar6);
    if (iVar5 == 1) {
      uStack_c8 = uStack_110;
      uStack_d0 = uStack_118;
      uStack_b8 = uStack_100;
      uStack_c0 = uStack_108;
      uStack_a8 = uStack_f0;
      uStack_b0 = uStack_f8;
      plVar9 = (long *)func_0x00276f24(&lStack_e8,&uStack_d0);
      if (lStack_e8 == -0x7fffffffffffffff) {
        *extraout_x8_00 = -0x7fffffffffffffff;
      }
      else {
        extraout_x8_00[1] = lStack_e0;
        *extraout_x8_00 = lStack_e8;
        extraout_x8_00[2] = lStack_d8;
      }
    }
    else {
      *extraout_x8_00 = -0x7fffffffffffffff;
      plVar9 = (long *)func_0x00281ecc(&uStack_118);
    }
    return plVar9;
  }
  plVar9 = (long *)func_0x007a2810(&UNK_0082cacd,0xc,&uStack_d0,&UNK_009cc328,&UNK_009cc408);
  puStack_128 = &
                __ZN137__LT_aws_lc_rs__agreement__PublicKey_u20_as_u20_aws_lc_rs__encoding__AsBigEndian_LT_aws_lc_rs__encoding__EcPublicKeyCompressedBin_GT__GT_11as_be_bytes17h68df9c174be8e3baE
  ;
  lVar7 = *plVar9;
  if (lVar7 != 3) {
    pppppppuStack_130 = &ppppppuStack_90;
    lVar10 = func_0x002d99c0(plVar9[1]);
    plVar9 = (long *)0x0;
    if (lVar10 != 0) {
      plVar9 = *(long **)(&UNK_0082cb00 + (ulong)**(byte **)(&UNK_009cc488 + lVar7 * 8) * 8);
      uVar11 = func_0x00187bdc(plVar9,1);
      if (uVar11 != 0) {
        lVar7 = func_0x002c2900(lVar10);
        if (((lVar7 != 0) && (lVar10 = func_0x002c3e68(lVar10), lVar10 != 0)) &&
           (plVar12 = (long *)func_0x002cb544(lVar7,lVar10,2,uVar11,plVar9,0),
           plVar12 != (long *)0x0)) {
          plVar1 = plVar12;
          if (plVar9 <= plVar12) {
            plVar1 = plVar9;
          }
          *extraout_x8_01 = (ulong)plVar9;
          extraout_x8_01[1] = uVar11;
          extraout_x8_01[2] = (ulong)plVar1;
          return plVar12;
        }
        *extraout_x8_01 = 0x8000000000000001;
        puVar3 = auStack_120;
        unaff_x29 = pppppppuStack_130;
        puVar15 = puStack_128;
        goto code_r0x00187bd4;
      }
      plVar9 = (long *)func_0x007a1f00(1,plVar9,&UNK_009cc420);
      puVar3 = auStack_220 + 0x80;
      puStack_168 = &
                    __ZN139__LT_aws_lc_rs__agreement__PublicKey_u20_as_u20_aws_lc_rs__encoding__AsBigEndian_LT_aws_lc_rs__encoding__EcPublicKeyUncompressedBin_GT__GT_11as_be_bytes17heed9391bc93906dbE
      ;
      unaff_x29 = &pppppppuStack_170;
      if (**(char **)(&UNK_009cc4a0 + *plVar9 * 8) == '\x03') {
        *extraout_x8_02 = 0x8000000000000001;
        return plVar9;
      }
      uVar11 = plVar9[2];
      pppppppuStack_170 = &pppppppuStack_130;
      if ((long)uVar11 < 0) {
        uVar6 = 0;
      }
      else {
        if (uVar11 == 0) {
          uVar13 = 1;
code_r0x002713a0:
          plVar9 = (long *)_memcpy(uVar13,plVar9 + 3,uVar11);
          *extraout_x8_02 = uVar11;
          extraout_x8_02[1] = uVar13;
          extraout_x8_02[2] = uVar11;
          return plVar9;
        }
        uVar6 = 1;
        uVar13 = func_0x00187bdc(uVar11,1);
        if (uVar13 != 0) {
          if (0x85 < uVar11) {
            func_0x007a28b0(uVar11,0x85,&UNK_009cc450);
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x2713e4);
            (*pcVar2)();
          }
          goto code_r0x002713a0;
        }
      }
      func_0x007a1f00(uVar6,uVar11,&UNK_009cc438);
      puVar15 = &UNK_00271410;
      goto code_r0x00187bd4;
    }
  }
  *extraout_x8_01 = 0x8000000000000001;
  return plVar9;
}

