
/* WARNING: Possible PIC construction at 0x005ae3b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae1ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae85c) */
/* WARNING: Removing unreachable block (ram,0x005ae864) */
/* WARNING: Removing unreachable block (ram,0x005ae870) */
/* WARNING: Removing unreachable block (ram,0x005ae87c) */
/* WARNING: Removing unreachable block (ram,0x005ae894) */
/* WARNING: Removing unreachable block (ram,0x005ae8bc) */
/* WARNING: Removing unreachable block (ram,0x005ae89c) */
/* WARNING: Removing unreachable block (ram,0x005ae884) */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */

void FUN_005bb3ac(void)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  long *extraout_x8;
  undefined *puVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined1 *unaff_x29;
  long lStack_160;
  long lStack_158;
  long lStack_150;
  long lStack_148;
  long lStack_140;
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long *plStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  undefined1 auStack_88 [56];
  undefined8 uStack_8;
  
  __Unwind_Resume();
  plVar3 = (long *)func_0x007a2668();
  uStack_8 = (undefined *)0x5bb3b8;
  puVar1 = (undefined1 *)register0x00000008;
  switch(plVar3[3]) {
  case 0xc:
    puVar5 = &UNK_008b4a1b;
    goto code_r0x005bb680;
  case 0xd:
    extraout_x8[1] = (long)&UNK_008b4a44;
    extraout_x8[2] = 0x28;
    *extraout_x8 = -0x8000000000000000;
    puVar1 = auStack_88 + 0x48;
    unaff_x29 = auStack_88 + 0x78;
    lVar6 = plVar3[7];
    func_0x005adc80(lVar6);
    lVar7 = 0x40;
    uVar4 = 8;
    uStack_8 = &UNK_005ae1f0;
    goto code_r0x00187bd4;
  case 0xe:
    extraout_x8[1] = (long)&UNK_008b4a6c;
    extraout_x8[2] = 0x2e;
    *extraout_x8 = -0x8000000000000000;
    puVar1 = auStack_88 + 0x48;
    unaff_x29 = auStack_88 + 0x78;
    lVar6 = plVar3[10];
    func_0x005adc80(lVar6);
    lVar7 = 0x40;
    uVar4 = 8;
    uStack_8 = &UNK_005ae85c;
    goto code_r0x00187bd4;
  case 0xf:
    puVar5 = &UNK_008b4a9a;
    lVar6 = 0x2a;
    goto code_r0x005bb5d4;
  case 0x10:
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    lStack_118 = plVar3[0xd];
    plStack_120 = (long *)plVar3[0xc];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    extraout_x8[1] = (long)&UNK_008b4ac4;
    extraout_x8[2] = 0x26;
    *extraout_x8 = -0x8000000000000000;
    func_0x005ae0f0(&lStack_160);
    break;
  case 0x11:
    extraout_x8[1] = (long)&UNK_008b4aea;
    extraout_x8[2] = 0x28;
    *extraout_x8 = -0x8000000000000000;
    lVar7 = *plVar3;
    goto joined_r0x005bb73c;
  case 0x12:
    extraout_x8[1] = (long)&UNK_008b4b12;
    extraout_x8[2] = 0x29;
    *extraout_x8 = -0x8000000000000000;
    lVar7 = *plVar3;
joined_r0x005bb73c:
    if (lVar7 == 0) {
      return;
    }
    lVar6 = plVar3[1];
    uVar4 = 1;
code_r0x005bb8fc:
    goto code_r0x00187bd4;
  case 0x13:
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    plStack_120 = (long *)plVar3[0xc];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    extraout_x8[1] = (long)&UNK_008b4b3b;
    extraout_x8[2] = 0x29;
    *extraout_x8 = -0x8000000000000000;
    func_0x005adc80(&lStack_160);
    goto code_r0x005bb86c;
  case 0x14:
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    plStack_120 = (long *)plVar3[0xc];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    extraout_x8[1] = (long)&UNK_008b4b64;
    extraout_x8[2] = 0x2a;
    *extraout_x8 = -0x8000000000000000;
    func_0x005adc80(&lStack_160);
code_r0x005bb86c:
    lVar6 = *plStack_120;
    *plStack_120 = lVar6 + -1;
    LORelease();
    if (lVar6 == 1) {
      func_0x005d2c74(&plStack_120);
    }
    break;
  default:
    _memcpy(&lStack_160,plVar3,0x108);
    extraout_x8[1] = (long)&UNK_008b4b8e;
    extraout_x8[2] = 0x2e;
    *extraout_x8 = -0x8000000000000000;
    func_0x005aec78(&lStack_160);
    func_0x005aec78(&lStack_108);
    func_0x005aec78(&lStack_b0);
    break;
  case 0x16:
    lStack_b8 = plVar3[0x19];
    lStack_c0 = plVar3[0x18];
    lStack_a8 = plVar3[0x1b];
    lStack_b0 = plVar3[0x1a];
    lStack_98 = plVar3[0x1d];
    lStack_a0 = plVar3[0x1c];
    lStack_90 = plVar3[0x1e];
    lStack_f8 = plVar3[0x11];
    lStack_100 = plVar3[0x10];
    lStack_e8 = plVar3[0x13];
    lStack_f0 = plVar3[0x12];
    lStack_d8 = plVar3[0x15];
    lStack_e0 = plVar3[0x14];
    lStack_c8 = plVar3[0x17];
    lStack_d0 = plVar3[0x16];
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    lStack_118 = plVar3[0xd];
    plStack_120 = (long *)plVar3[0xc];
    lStack_108 = plVar3[0xf];
    lStack_110 = plVar3[0xe];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    extraout_x8[1] = (long)&UNK_008b4bbc;
    extraout_x8[2] = 0x2e;
    *extraout_x8 = -0x8000000000000000;
    func_0x005aec78(&lStack_e0);
    func_0x005adc80(&lStack_160);
    func_0x005adc80(&plStack_120);
    break;
  case 0x17:
    lStack_b8 = plVar3[0x19];
    lStack_c0 = plVar3[0x18];
    lStack_a8 = plVar3[0x1b];
    lStack_b0 = plVar3[0x1a];
    lStack_98 = plVar3[0x1d];
    lStack_a0 = plVar3[0x1c];
    lStack_f8 = plVar3[0x11];
    lStack_100 = plVar3[0x10];
    lStack_e8 = plVar3[0x13];
    lStack_f0 = plVar3[0x12];
    lStack_d8 = plVar3[0x15];
    lStack_e0 = plVar3[0x14];
    lStack_c8 = plVar3[0x17];
    lStack_d0 = plVar3[0x16];
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    lStack_118 = plVar3[0xd];
    plStack_120 = (long *)plVar3[0xc];
    lStack_108 = plVar3[0xf];
    lStack_110 = plVar3[0xe];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    extraout_x8[1] = (long)&UNK_008b4bea;
    extraout_x8[2] = 0x2e;
    *extraout_x8 = -0x8000000000000000;
    func_0x005ae72c(&lStack_160);
    break;
  case 0x18:
    puVar5 = &UNK_008b4c18;
    lVar6 = 0x32;
code_r0x005bb5d4:
    extraout_x8[1] = (long)puVar5;
    extraout_x8[2] = lVar6;
    *extraout_x8 = -0x8000000000000000;
    uStack_8 = (undefined *)0x5bb3b8;
    lVar6 = plVar3[5];
    lVar7 = plVar3[6] + 1;
    lVar8 = lVar6;
    while (lVar7 = lVar7 + -1, lVar7 != 0) {
      func_0x0059cd8c(lVar8);
      lVar8 = lVar8 + 0x18;
    }
    if (plVar3[4] == 0) {
      lVar6 = plVar3[8];
      lVar7 = plVar3[9] + 1;
      lVar8 = lVar6;
      while (lVar7 = lVar7 + -1, lVar7 != 0) {
        func_0x0059ce88(lVar8);
        lVar8 = lVar8 + 0x40;
      }
      if (plVar3[7] == 0) {
        return;
      }
      lVar7 = plVar3[7] << 6;
      uVar4 = 8;
    }
    else {
      lVar7 = plVar3[4] * 0x18;
      uVar4 = 8;
      uStack_8 = &UNK_005ae3b4;
      puVar1 = auStack_88 + 0x48;
      unaff_x29 = auStack_88 + 0x78;
    }
code_r0x00187bd4:
    *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
    *(undefined **)(puVar1 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(lVar6,lVar7,uVar4);
    return;
  case 0x19:
    lStack_f8 = plVar3[0x11];
    lStack_100 = plVar3[0x10];
    lStack_e8 = plVar3[0x13];
    lStack_f0 = plVar3[0x12];
    lStack_d8 = plVar3[0x15];
    lStack_e0 = plVar3[0x14];
    lStack_d0 = plVar3[0x16];
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    lStack_118 = plVar3[0xd];
    plStack_120 = (long *)plVar3[0xc];
    lStack_108 = plVar3[0xf];
    lStack_110 = plVar3[0xe];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    extraout_x8[1] = (long)&UNK_008b4c4a;
    extraout_x8[2] = 0x32;
    *extraout_x8 = -0x8000000000000000;
    func_0x005aeb9c(&lStack_160);
    break;
  case 0x1a:
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_130 = plVar3[10];
    extraout_x8[1] = (long)&UNK_008b4c7c;
    extraout_x8[2] = 0x2e;
    *extraout_x8 = -0x8000000000000000;
    func_0x005ae550(&lStack_160);
    break;
  case 0x1b:
    extraout_x8[1] = (long)&UNK_008b4caa;
    extraout_x8[2] = 0x2a;
    *extraout_x8 = -0x8000000000000000;
    lVar6 = plVar3[1];
    lVar7 = plVar3[2] + 1;
    lVar8 = lVar6;
    while (lVar7 = lVar7 + -1, lVar7 != 0) {
      func_0x0059ce88(lVar8);
      lVar8 = lVar8 + 0x40;
    }
    if (*plVar3 == 0) {
      return;
    }
    lVar7 = *plVar3 << 6;
    goto code_r0x005bb8f4;
  case 0x1c:
    puVar5 = &UNK_008b4cd4;
    lVar6 = 0x2c;
    goto code_r0x005bb684;
  case 0x1d:
    puVar5 = &UNK_008b4d00;
code_r0x005bb680:
    lVar6 = 0x29;
code_r0x005bb684:
    extraout_x8[1] = (long)puVar5;
    extraout_x8[2] = lVar6;
    *extraout_x8 = -0x8000000000000000;
    break;
  case 0x1e:
    extraout_x8[1] = (long)&UNK_008b4d29;
    extraout_x8[2] = 0x29;
    *extraout_x8 = -0x8000000000000000;
    lVar6 = plVar3[1];
    if (plVar3[2] != 0) {
      lVar7 = 0;
      lVar8 = 1 - plVar3[2];
      do {
        lVar2 = **(long **)(lVar6 + lVar7);
        **(long **)(lVar6 + lVar7) = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          func_0x005d2ac4(lVar6 + lVar7);
        }
        lVar7 = lVar7 + 8;
        lVar8 = lVar8 + 1;
      } while (lVar8 != 1);
    }
    if (*plVar3 == 0) {
      return;
    }
    lVar7 = *plVar3 << 3;
code_r0x005bb8f4:
    uVar4 = 8;
    goto code_r0x005bb8fc;
  case 0x1f:
    lStack_118 = plVar3[0xd];
    plStack_120 = (long *)plVar3[0xc];
    lStack_108 = plVar3[0xf];
    lStack_110 = plVar3[0xe];
    lStack_100 = plVar3[0x10];
    lStack_158 = plVar3[5];
    lStack_160 = plVar3[4];
    lStack_148 = plVar3[7];
    lStack_150 = plVar3[6];
    lStack_138 = plVar3[9];
    lStack_140 = plVar3[8];
    lStack_128 = plVar3[0xb];
    lStack_130 = plVar3[10];
    extraout_x8[1] = (long)&UNK_008b4d52;
    extraout_x8[2] = 0x2b;
    *extraout_x8 = -0x8000000000000000;
    func_0x005aea88(&lStack_160);
    break;
  case 0x20:
    lVar6 = *plVar3;
    extraout_x8[1] = plVar3[1];
    *extraout_x8 = lVar6;
    extraout_x8[2] = plVar3[2];
  }
  return;
}

