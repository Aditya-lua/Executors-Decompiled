
/* WARNING: Type propagation algorithm not settling */

void FUN_0040df10(void)

{
  undefined1 auVar1 [16];
  long ***ppplVar2;
  long ****pppplVar3;
  code *pcVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  long *in_x3;
  long ****extraout_x8;
  long ****extraout_x8_00;
  short sVar8;
  ulong uVar9;
  long ***ppplVar10;
  uint uVar11;
  ulong extraout_x10;
  ulong uVar12;
  ulong extraout_x11;
  ulong uVar13;
  undefined8 unaff_x20;
  long ***ppplVar14;
  long ****unaff_x23;
  long unaff_x24;
  long ***ppplVar15;
  long *plVar16;
  long unaff_x29;
  undefined1 auVar17 [16];
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined1 uStack00000000000000a8;
  long in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined1 uStack00000000000000d8;
  long ***ppplStack_128;
  long ***ppplStack_120;
  long ****pppplStack_118;
  long ***ppplStack_110;
  long ***ppplStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_d0;
  long ****pppplStack_c8;
  undefined8 uStack_c0;
  undefined1 auStack_b8 [16];
  long ****pppplStack_a8;
  long lStack_a0;
  long lStack_98;
  long ***ppplStack_90;
  byte bStack_88;
  byte bStack_87;
  uint6 uStack_86;
  long ****pppplStack_80;
  short sStack_78;
  undefined6 uStack_76;
  
  func_0x003f7594(&uStack00000000000000a8);
  func_0x003f7670();
  func_0x003f64d8(&uStack00000000000000d8);
  if (in_stack_000000c0 == 0) {
LAB_0040e028:
    __Unwind_Resume(unaff_x20);
  }
  else {
    func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
    uVar6 = __Unwind_Resume();
    if (unaff_x24 != 0) {
      func_0x00187bd4();
    }
    func_0x0016b01c(unaff_x29 + -0x98);
    func_0x003f64d8(&uStack00000000000000d8);
    if (in_stack_000000c0 != 0) {
      func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
    }
    func_0x003f7594(&uStack00000000000000a8);
    unaff_x20 = __Unwind_Resume(uVar6);
    if (in_stack_00000030 != 0) {
      func_0x00187bd4();
    }
    if (in_stack_00000088 != 0) {
      func_0x00187bd4(in_stack_00000038,in_stack_00000088 * 0x18,8);
    }
    if (in_stack_00000090 == 0) goto LAB_0040e028;
  }
  lVar7 = 2;
  func_0x00187bd4(in_stack_00000080,in_stack_00000090 << 2);
  auVar17 = __Unwind_Resume(unaff_x20);
  auVar17._8_8_ = auVar17._8_8_;
  auVar17._0_8_ = auVar17._0_8_;
  if (*(char *)(auVar17._8_8_ + 0x43) == 'P') {
    if (*(int *)(auVar17._8_8_ + 10) == 1) {
      ppplVar14 = auVar17._8_8_[0x31];
      if (ppplVar14 != (long ***)0x0) {
        unaff_x23 = (long ****)auVar17._8_8_[0x32];
      }
      ppplVar15 = auVar17._8_8_[0xb];
      ppplStack_110 = auVar17._8_8_[0x2e] + 2;
      ppplStack_128 = auVar17._8_8_[5];
      ppplStack_120 = auVar17._8_8_[6];
      ppplStack_108 = (long ***)0x0;
      uStack_d0 = 0;
      pppplStack_118 = auVar17._8_8_;
      func_0x004071b4(&pppplStack_c8,&ppplStack_128);
      ppplVar10 = ppplStack_108;
      uVar9 = (ulong)pppplStack_c8 & 0xff;
      if ((char)pppplStack_c8 == 'O') {
        if (ppplStack_108 == (long ***)0x0) {
          uVar9 = 0x45;
          pppplVar3 = extraout_x8;
          uVar12 = extraout_x10;
          uVar13 = extraout_x11;
          goto code_r0x0040e330;
        }
        sVar8 = 0x2130;
        if (4 < *(ushort *)((long)auVar17._8_8_ + 0x4a)) {
          sVar8 = 0x76;
        }
        auVar17 = func_0x00445ad4(uStack_f8);
        pppplStack_c8 = (long ****)ppplVar10;
        uStack_c0 = (long ****)uStack_100;
        pppplStack_a8 = &ppplStack_108;
        if (auVar17._8_8_ == 0) {
          plVar16 = (long *)*in_x3;
          lVar5 = *plVar16;
          *plVar16 = lVar5 + 1;
          auStack_b8._8_8_ = 0;
          ppplVar2 = (long ***)0x0;
          pppplStack_80 = extraout_x8_00;
          goto joined_r0x0040e2d8;
        }
        do {
          pppplVar3 = pppplStack_a8;
          auStack_b8._8_8_ = auVar17._8_8_;
          auStack_b8._0_8_ = auVar17._0_8_;
          auVar1._8_8_ = auStack_b8._8_8_ + -1;
          auVar1._0_8_ = (long *)(auStack_b8._0_8_ + 0x10);
          auStack_b8 = auVar17;
          if (auStack_b8._8_8_ + -1 == -1) {
            if (((ulong)pppplStack_a8[5] & 1) == 0) {
              ppplVar10 = (long ***)((long)pppplStack_c8 - (long)*pppplStack_a8);
              pppplStack_a8[5] = (long ***)0x1;
              pppplVar3[6] = ppplVar10;
            }
            plVar16 = (long *)*in_x3;
            lVar5 = *plVar16;
            *plVar16 = lVar5 + 1;
            ppplVar2 = (long ***)0x0;
            pppplStack_80 = pppplVar3;
            auVar17 = auStack_b8;
            goto joined_r0x0040e2d8;
          }
          lStack_98 = *(long *)(auStack_b8._0_8_ + 8);
          lStack_a0 = *(long *)auStack_b8._0_8_;
          func_0x00405760(&ppplStack_90,&pppplStack_c8,*(undefined4 *)(pppplStack_a8[3] + 9),
                          &lStack_a0);
          if (ppplStack_90 == (long ***)0x2e) {
            uVar9 = (ulong)bStack_88;
            uVar12 = (ulong)bStack_87;
            uVar13 = (ulong)uStack_86;
            pppplVar3 = pppplStack_80;
            goto code_r0x0040e330;
          }
          auStack_b8._8_8_ = CONCAT62(uStack_76,sStack_78);
          auVar17 = auVar1;
        } while (sVar8 != sStack_78);
        uStack_c0._0_2_ = CONCAT11(bStack_87,bStack_88);
        uStack_c0._0_6_ = CONCAT42((int)uStack_86,(undefined2)uStack_c0);
        uStack_c0 = (long ****)CONCAT26((short)(uStack_86 >> 0x20),(undefined6)uStack_c0);
        pppplStack_c8 = (long ****)ppplStack_90;
        auStack_b8._0_8_ = pppplStack_80;
        func_0x00406c1c(&ppplStack_90,&pppplStack_c8);
        uVar9 = (ulong)bStack_88;
        uVar12 = (ulong)bStack_87;
        uVar13 = (ulong)uStack_86;
        pppplVar3 = pppplStack_80;
        if (ppplStack_90 == (long ***)0x2f) goto code_r0x0040e330;
        pppplStack_c8 = (long ****)ppplStack_90;
        uStack_c0._0_2_ = CONCAT11(bStack_87,bStack_88);
        uStack_c0._0_6_ = CONCAT42((int)uStack_86,(undefined2)uStack_c0);
        uStack_c0 = (long ****)CONCAT26((short)(uStack_86 >> 0x20),(undefined6)uStack_c0);
        auStack_b8._0_8_ = pppplStack_80;
        auVar17._8_8_ = auStack_b8._8_8_;
        auVar17._0_8_ = pppplStack_80;
        plVar16 = (long *)*in_x3;
        if (ppplStack_90 == (long ***)0x2e) {
          lVar5 = *plVar16;
          *plVar16 = lVar5 + 1;
          ppplVar2 = (long ***)0x0;
          pppplStack_c8 = (long ****)ppplStack_90;
joined_r0x0040e2d8:
          if (lVar5 < 0) {
                    /* WARNING: Does not return */
            pcVar4 = (code *)SoftwareBreakpoint(1,0x40e428);
            auStack_b8 = auVar17;
            (*pcVar4)();
          }
          if (plVar16 != (long *)0x0) {
            auVar17._0_8_[0xb] = (long)in_x3;
            auVar17._0_8_[10] = (long)auVar17._8_8_;
            auVar17._0_8_[0xc] = lVar7;
            *auVar17._0_8_ = (long)plVar16;
            auVar17._0_8_[1] = (long)ppplVar15;
            auVar17._0_8_[2] = (long)ppplVar14;
            auVar17._0_8_[3] = (long)unaff_x23;
            auVar17._0_8_[4] = (long)ppplVar2;
            auVar17._0_8_[5] = (long)pppplStack_80;
            auVar17._0_8_[6] = (long)auVar17._8_8_;
            auVar17._0_8_[7] = (long)in_x3;
            auVar17._0_8_[8] = (long)auVar17._8_8_;
            auVar17._0_8_[9] = (long)auVar17._8_8_;
            return;
          }
          uVar9 = (ulong)ppplVar15 & 0xffffffffffffff00;
          goto code_r0x0040e394;
        }
        func_0x004096ac(&ppplStack_128,plVar16 + 2,*(undefined1 *)((long)auVar17._8_8_ + 0x49),
                        auVar17._8_8_[0x34],&pppplStack_c8);
        auVar17._8_8_ = auStack_b8._8_8_;
        auVar17._0_8_ = auStack_b8._0_8_;
        if ((int)ppplStack_128 != 1) {
          lVar5 = *plVar16;
          *plVar16 = lVar5 + 1;
          ppplVar2 = ppplStack_120;
          pppplStack_80 = pppplStack_118;
          goto joined_r0x0040e2d8;
        }
        uVar11 = (uint)*(byte *)(auVar17._8_8_ + 0x43);
        if (uVar11 == 0x50) goto code_r0x0040e34c;
      }
      else {
        uVar12 = (ulong)pppplStack_c8 >> 8 & 0xff;
        uVar13 = (ulong)pppplStack_c8 >> 0x10;
        pppplVar3 = uStack_c0;
code_r0x0040e330:
        pppplStack_118 = pppplVar3;
        ppplStack_120 = (long ***)(uVar9 | (uVar12 & 0xff) << 8 | uVar13 << 0x10);
        uVar11 = (uint)*(byte *)(auVar17._8_8_ + 0x43);
        if (*(byte *)(auVar17._8_8_ + 0x43) == 0x50) {
code_r0x0040e34c:
          uVar11 = (uint)ppplStack_120 & 0xff;
          *(char *)(auVar17._8_8_ + 0x43) = (char)ppplStack_120;
          *(char *)((long)auVar17._8_8_ + 0x21f) = (char)((ulong)ppplStack_120 >> 0x38);
          *(short *)((long)auVar17._8_8_ + 0x21d) = (short)((ulong)ppplStack_120 >> 0x28);
          *(int *)((long)auVar17._8_8_ + 0x219) = (int)((ulong)ppplStack_120 >> 8);
          auVar17._8_8_[0x44] = (long ***)pppplStack_118;
        }
      }
      if (uVar11 == 0x4f) goto code_r0x0040e0a8;
code_r0x0040e37c:
      ppplVar14 = auVar17._8_8_[0x43];
      ppplVar15 = (long ***)0x3;
      unaff_x23 = (long ****)auVar17._8_8_[0x44];
    }
    else {
      *(undefined1 *)(auVar17._8_8_ + 0x43) = 0x4f;
      auVar17._8_8_[0x44] = (long ***)0x0;
code_r0x0040e0d8:
      ppplVar15 = (long ***)0x0;
      ppplVar14 = (long ***)(*in_x3 + 0x10);
      unaff_x23 = auVar17._8_8_;
    }
  }
  else {
    if (*(char *)(auVar17._8_8_ + 0x43) != 'O') goto code_r0x0040e37c;
code_r0x0040e0a8:
    unaff_x23 = (long ****)auVar17._8_8_[0x44];
    if (unaff_x23 == (long ****)0x0) goto code_r0x0040e0d8;
    ppplVar14 = unaff_x23[0x38] + 2;
    ppplVar15 = (long ***)0x2;
  }
  uVar9 = 0;
code_r0x0040e394:
  ppplStack_128 = (long ***)((ulong)ppplVar15 & 0xff | uVar9);
  ppplStack_120 = ppplVar14;
  pppplStack_118 = unaff_x23;
  pppplStack_c8 = auVar17._8_8_;
  uStack_c0 = (long ****)in_x3;
  auStack_b8._0_8_ = lVar7;
  func_0x0040e428(auVar17._0_8_ + 1,&pppplStack_c8,&ppplStack_128);
  *auVar17._0_8_ = 0;
  return;
}

