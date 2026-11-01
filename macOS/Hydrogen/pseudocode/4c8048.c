
/* WARNING: Possible PIC construction at 0x004c876c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004c87d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004c87ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004c884c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004c8708: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004c87b0) */
/* WARNING: Removing unreachable block (ram,0x004c87d8) */
/* WARNING: Removing unreachable block (ram,0x004c87dc) */
/* WARNING: Removing unreachable block (ram,0x004c88c8) */
/* WARNING: Removing unreachable block (ram,0x004c88e0) */
/* WARNING: Removing unreachable block (ram,0x004c87e8) */
/* WARNING: Removing unreachable block (ram,0x004c87f4) */
/* WARNING: Removing unreachable block (ram,0x004c88ec) */
/* WARNING: Removing unreachable block (ram,0x004c8800) */
/* WARNING: Removing unreachable block (ram,0x004c8770) */
/* WARNING: Removing unreachable block (ram,0x004c8850) */
/* WARNING: Removing unreachable block (ram,0x004c870c) */
/* WARNING: Removing unreachable block (ram,0x004c8710) */
/* WARNING: Removing unreachable block (ram,0x004c8854) */
/* WARNING: Type propagation algorithm not settling */

void FUN_004c8048(long param_1)

{
  ulong ***pppuVar1;
  uint uVar2;
  ulong ***pppuVar3;
  ulong ****ppppuVar4;
  code *pcVar5;
  undefined1 *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 extraout_x1;
  long *plVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong ***pppuVar15;
  ulong uVar16;
  ulong ***pppuVar17;
  ulong uVar18;
  uint *puVar19;
  ulong unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  ulong uVar20;
  long *unaff_x24;
  long lVar21;
  undefined1 *puVar22;
  undefined *puVar23;
  undefined1 auVar24 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000d0;
  undefined1 auStack_1e0 [8];
  ulong ***pppuStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 ****ppppuStack_1c0;
  ulong ***pppuStack_1b8;
  ulong ****ppppuStack_1b0;
  undefined8 ****ppppuStack_1a0;
  ulong ***pppuStack_198;
  ulong ****ppppuStack_190;
  ulong ***pppuStack_188;
  undefined8 uStack_180;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 ****ppppuStack_70;
  ulong ***pppuStack_68;
  ulong ****ppppuStack_60;
  undefined1 auStack_6 [6];
  
  if (param_1 != 0) {
    func_0x00187bd4();
  }
  func_0x00490c98(&uStack00000000000000d0);
  func_0x00490c98(&uStack0000000000000090);
  func_0x004a3874(&uStack0000000000000030);
  func_0x004d0c00(&uStack0000000000000010);
  auVar24 = __Unwind_Resume();
  lVar12 = auVar24._0_8_;
  puVar22 = auStack_6 + -10;
  uVar20 = auVar24._8_8_ & 0xffffffff;
  if ((*(ulong *)(lVar12 + 0x40) <= uVar20) ||
     (plVar10 = (long *)(*(long *)(lVar12 + 0x38) + (auVar24._8_8_ & 0xffffffff) * 0x30),
     *plVar10 == -0x8000000000000000)) {
    func_0x007a23bc(&UNK_009e6888);
LAB_004c8600:
    uVar7 = func_0x007a23bc(&UNK_009e6958);
    func_0x004d3808(&ppppuStack_1a0);
    func_0x004bb068(&pppuStack_1d8);
    puVar23 = (undefined *)0x4c86b0;
    auVar24 = __Unwind_Resume(uVar7);
    uVar8 = auVar24._8_8_;
    plVar10 = auVar24._0_8_;
    puVar6 = auStack_1e0;
SUB_004c86b0:
    *(long **)(puVar6 + -0x40) = unaff_x24;
    *(ulong *)(puVar6 + -0x38) = uVar20;
    *(long **)(puVar6 + -0x30) = unaff_x22;
    *(long **)(puVar6 + -0x28) = unaff_x21;
    *(ulong *)(puVar6 + -0x20) = unaff_x20;
    *(undefined8 *)(puVar6 + -0x18) = uVar7;
    *(undefined1 **)(puVar6 + -0x10) = puVar22;
    *(undefined **)(puVar6 + -8) = puVar23;
    puVar22 = puVar6 + -0x10;
    if (plVar10[2] == 0) {
      return;
    }
    unaff_x20 = plVar10[1];
    unaff_x22 = (long *)(plVar10[2] * 0x108);
    uVar20 = 1;
    uVar9 = uVar8;
    do {
      lVar12 = *(long *)(unaff_x20 + 0x18);
      uVar7 = uVar8;
      if (lVar12 < 0x14) {
        if (lVar12 == 0x10) {
          unaff_x24 = *(long **)(unaff_x20 + 0x60);
          unaff_x21 = unaff_x24 + 1;
          if ((char)*unaff_x21 == '\0') {
            *(char *)unaff_x21 = '\x01';
          }
          else {
            func_0x007aff64(unaff_x21,uVar9,1000000000);
          }
          plVar10 = unaff_x24 + 2;
          puVar23 = (undefined *)0x4c87d8;
          puVar6 = puVar6 + -0x60;
          goto SUB_004c86b0;
        }
        if (lVar12 == 0x11) {
          func_0x0045cd08(puVar6 + -0x58,unaff_x20);
          func_0x004d19a0(uVar8,puVar6 + -0x58);
          uVar9 = extraout_x1;
        }
        else if (lVar12 == 0x13) goto code_r0x004c874c;
      }
      else {
        if (lVar12 == 0x14) {
          unaff_x24 = *(long **)(unaff_x20 + 0x60);
          unaff_x21 = unaff_x24 + 1;
          if ((char)*unaff_x21 == '\0') {
            *(char *)unaff_x21 = '\x01';
          }
          else {
            func_0x007aff64(unaff_x21,uVar9,1000000000);
          }
          plVar10 = unaff_x24 + 2;
          puVar23 = &LAB_004c870c;
          puVar6 = puVar6 + -0x60;
          goto SUB_004c86b0;
        }
        if (lVar12 == 0x17) {
          unaff_x24 = *(long **)(unaff_x20 + 0xe8);
          unaff_x21 = unaff_x24 + 1;
          if ((char)*unaff_x21 == '\0') {
            *(char *)unaff_x21 = '\x01';
          }
          else {
            func_0x007aff64(unaff_x21,uVar9,1000000000);
          }
          plVar10 = unaff_x24 + 2;
          puVar23 = (undefined *)0x4c8850;
          puVar6 = puVar6 + -0x60;
          goto SUB_004c86b0;
        }
        if (lVar12 == 0x1a) {
          unaff_x24 = *(long **)(unaff_x20 + 0x50);
          unaff_x21 = unaff_x24 + 1;
          if ((char)*unaff_x21 == '\0') {
            *(char *)unaff_x21 = '\x01';
          }
          else {
            func_0x007aff64(unaff_x21,uVar9,1000000000);
          }
          plVar10 = unaff_x24 + 2;
          puVar23 = (undefined *)0x4c87b0;
          puVar6 = puVar6 + -0x60;
          goto SUB_004c86b0;
        }
      }
      unaff_x20 = unaff_x20 + 0x108;
      unaff_x22 = unaff_x22 + -0x21;
      if (unaff_x22 == (long *)0x0) {
        return;
      }
    } while( true );
  }
  unaff_x20 = (ulong)*(uint *)(plVar10 + 5);
  pppuVar3 = (ulong ***)(ulong)*(uint *)((long)plVar10 + 0x2c);
  if ((char)plVar10[3] == '\0') {
    func_0x0058485c(&ppppuStack_1a0,lVar12,pppuVar3);
    lVar11 = 0;
    pppuVar1 = (ulong ***)((ulong)ppppuStack_190 >> 0x20);
    pppuVar15 = (ulong ***)((ulong)ppppuStack_190 & 0xffffffff);
    do {
      for (; pppuVar17 = pppuVar1, pppuVar15 < pppuStack_198;
          pppuVar15 = (ulong ***)(ulong)*(uint *)(ppppuStack_1a0 + (long)pppuVar15 * 6 + 4)) {
        lVar11 = lVar11 + 1;
      }
      do {
        if (pppuStack_198 <= pppuVar17) {
          if (lVar11 != 1) goto LAB_004c81bc;
          func_0x00584800(&ppppuStack_1a0,lVar12,unaff_x20);
          lVar11 = 0;
          pppuVar1 = (ulong ***)((ulong)ppppuStack_190 >> 0x20);
          pppuVar15 = (ulong ***)((ulong)ppppuStack_190 & 0xffffffff);
          goto joined_r0x004c817c;
        }
        pppuVar1 = (ulong ***)(ulong)*(uint *)((long)ppppuStack_1a0 + (long)pppuVar17 * 0x30 + 0x24)
        ;
        lVar21 = (long)pppuVar17 * 6;
        pppuVar17 = pppuVar1;
      } while (*(int *)(ppppuStack_1a0 + lVar21 + 5) == (int)pppuStack_188);
      lVar11 = lVar11 + 1;
    } while( true );
  }
LAB_004c81bc:
  ppppuStack_70 = &pppuStack_1d8;
  pppuStack_68 = (ulong ***)
                 &
                 __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
  ;
  ppppuStack_1a0 = (undefined8 ****)&UNK_009e68e8;
  pppuStack_198 = (ulong ***)0x1;
  pppuStack_188 = (ulong ***)0x1;
  uStack_180 = 0;
  ppppuStack_190 = (ulong ****)&ppppuStack_70;
  pppuStack_1d8 = pppuVar3;
  func_0x00459f08(&ppppuStack_1c0,&ppppuStack_1a0);
  plVar10 = (long *)func_0x005847cc(lVar12,pppuVar3);
  if (plVar10 == (long *)0x0) {
    puVar23 = &UNK_009e68f8;
  }
  else {
    unaff_x24 = &lStack_90;
    if ((plVar10[2] == 0) || (*(long *)(plVar10[1] + 0x18) != 0x12)) {
      func_0x0045cd08(&ppppuStack_1a0,&ppppuStack_1c0);
      pppuStack_68 = pppuStack_198;
      ppppuStack_70 = ppppuStack_1a0;
      ppppuStack_60 = ppppuStack_190;
      func_0x004d16c0(lVar12 + 0xb0,&ppppuStack_70,pppuVar3);
      func_0x0045cd08(&ppppuStack_70,&ppppuStack_1c0);
      pppuStack_198 = pppuStack_68;
      ppppuStack_1a0 = ppppuStack_70;
      ppppuStack_190 = ppppuStack_60;
      pppuStack_188 = (ulong ***)0x12;
      lVar11 = plVar10[2];
      if (lVar11 == *plVar10) {
        func_0x005bd0a4(plVar10,&UNK_009e6910);
      }
      lVar21 = plVar10[1];
      if (lVar11 != 0) {
        _memmove(lVar21 + 0x108,lVar21,lVar11 * 0x108);
      }
      _memcpy(lVar21,&ppppuStack_1a0,0x108);
      plVar10[2] = lVar11 + 1;
    }
    unaff_x21 = (long *)func_0x00584f94(lVar12);
    unaff_x22 = (long *)func_0x005847cc(lVar12,unaff_x21);
    if (unaff_x22 != (long *)0x0) {
      pppuStack_198 = pppuStack_1b8;
      ppppuStack_1a0 = ppppuStack_1c0;
      ppppuStack_190 = ppppuStack_1b0;
      pppuStack_188 = (ulong ***)0x11;
      lVar11 = unaff_x22[2];
      if (lVar11 == *unaff_x22) {
        func_0x005bd0a4(unaff_x22,&UNK_009e6940);
      }
      _memcpy(unaff_x22[1] + lVar11 * 0x108,&ppppuStack_1a0,0x108);
      unaff_x22[2] = lVar11 + 1;
      uVar13 = *(ulong *)(lVar12 + 0x40);
      if (uVar20 < uVar13) {
        lVar11 = *(long *)(lVar12 + 0x38);
        plVar10 = (long *)(lVar11 + uVar20 * 0x30);
        if (*plVar10 != -0x8000000000000000) {
          uVar14 = *(ulong *)(lVar12 + 0x28);
          uVar18 = plVar10[5] & 0xffffffff;
          if (uVar18 < uVar14) {
            uVar2 = *(uint *)((long)plVar10 + 0x24);
            uVar16 = (ulong)plVar10[5] >> 0x20;
            lVar21 = *(long *)(lVar12 + 0x20);
            puVar19 = (uint *)(lVar21 + uVar18 * 0x20 + 0x18);
            uVar18 = (ulong)*puVar19;
            if (uVar18 == uVar20) {
              *puVar19 = *(uint *)(plVar10 + 4);
            }
            else {
              do {
                if (uVar13 <= uVar18) goto LAB_004c83bc;
                puVar19 = (uint *)(lVar11 + uVar18 * 0x30 + 0x20);
                uVar18 = (ulong)*puVar19;
              } while (uVar18 != uVar20);
              *puVar19 = *(uint *)(plVar10 + 4);
            }
LAB_004c83bc:
            if (uVar16 < uVar14) {
              puVar19 = (uint *)(lVar21 + uVar16 * 0x20 + 0x1c);
              uVar14 = (ulong)*puVar19;
              if (uVar14 == uVar20) {
                *puVar19 = uVar2;
              }
              else {
                do {
                  if (uVar13 <= uVar14) goto LAB_004c8500;
                  puVar19 = (uint *)(lVar11 + uVar14 * 0x30 + 0x24);
                  uVar14 = (ulong)*puVar19;
                } while (uVar14 != uVar20);
                *puVar19 = uVar2;
              }
            }
          }
LAB_004c8500:
          *(undefined4 *)(plVar10 + 4) = *(undefined4 *)(lVar12 + 0x5c);
          *(undefined8 *)((long)plVar10 + 0x24) = 0xffffffffffffffff;
          *(undefined4 *)((long)plVar10 + 0x2c) = 0xffffffff;
          *(int *)(lVar12 + 0x5c) = auVar24._8_4_;
          *(long *)(lVar12 + 0x50) = *(long *)(lVar12 + 0x50) + -1;
          lStack_90 = *plVar10;
          *plVar10 = -0x8000000000000000;
          if (lStack_90 != -0x8000000000000000) {
            lStack_80 = plVar10[2];
            lStack_88 = plVar10[1];
            lStack_78 = plVar10[3];
            func_0x004d5990(lVar12 + 0x18,unaff_x20,unaff_x21,&lStack_90);
            return;
          }
        }
      }
      goto LAB_004c8600;
    }
    puVar23 = &UNK_009e6928;
  }
  func_0x007a23bc(puVar23);
LAB_004c85d0:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x4c85d4);
  (*pcVar5)();
joined_r0x004c817c:
  for (; pppuVar17 = pppuVar1, pppuVar15 < pppuStack_198;
      pppuVar15 = (ulong ***)(ulong)*(uint *)(ppppuStack_1a0 + (long)pppuVar15 * 6 + 4)) {
    lVar11 = lVar11 + 1;
  }
  do {
    if (pppuStack_198 <= pppuVar17) {
      if (lVar11 == 1) {
        func_0x0058497c(&pppuStack_1d8,lVar12,pppuVar3);
        func_0x00584fc4(&ppppuStack_1a0,lVar12,pppuVar3);
        if (ppppuStack_1a0 != (undefined8 ****)0x8000000000000000) {
          pppuStack_1b8 = pppuStack_198;
          ppppuStack_1c0 = ppppuStack_1a0;
          ppppuStack_1b0 = ppppuStack_190;
          plVar10 = (long *)func_0x005847cc(lVar12,unaff_x20);
          ppppuVar4 = ppppuStack_1b0;
          pppuVar3 = pppuStack_1b8;
          if (plVar10 != (long *)0x0) {
            lVar11 = (long)ppppuStack_1b0 * 0x108;
            pppuStack_188 = pppuStack_1b8 + (long)ppppuStack_1b0 * 0x21;
            ppppuStack_1a0 = (undefined8 ****)pppuStack_1b8;
            pppuStack_198 = pppuStack_1b8;
            ppppuStack_190 = ppppuStack_1c0;
            lVar21 = plVar10[2];
            if ((ulong ****)(*plVar10 - lVar21) < ppppuStack_1b0) {
              func_0x007a535c(plVar10,lVar21,ppppuStack_1b0,8,0x108);
              lVar21 = plVar10[2];
            }
            _memcpy(plVar10[1] + lVar21 * 0x108,pppuVar3,lVar11);
            plVar10[2] = lVar21 + (long)ppppuVar4;
            pppuStack_188 = pppuVar3;
            func_0x004d3808(&ppppuStack_1a0);
            pppuStack_198 = (ulong ***)uStack_1d0;
            ppppuStack_1a0 = (undefined8 ****)pppuStack_1d8;
            ppppuStack_190 = (ulong ****)uStack_1c8;
            func_0x00584c34(&ppppuStack_70,lVar12,unaff_x20,&ppppuStack_1a0);
            func_0x004ce364(&ppppuStack_70);
            if (ppppuStack_70 == (undefined8 ****)0x0) {
              return;
            }
            func_0x00187bd4(pppuStack_68,(long)ppppuStack_70 * 0x28,8);
            return;
          }
          func_0x007a23bc(&UNK_009e68b8);
          goto LAB_004c85d0;
        }
      }
      else {
        func_0x007a247c(&UNK_008a2592,0x45,&UNK_009e68d0);
      }
      func_0x007a23bc(&UNK_009e68a0);
      goto LAB_004c85d0;
    }
    pppuVar1 = (ulong ***)(ulong)*(uint *)((long)ppppuStack_1a0 + (long)pppuVar17 * 0x30 + 0x24);
    lVar21 = (long)pppuVar17 * 6;
    pppuVar17 = pppuVar1;
  } while (*(int *)(ppppuStack_1a0 + lVar21 + 5) == (int)pppuStack_188);
  lVar11 = lVar11 + 1;
  goto joined_r0x004c817c;
code_r0x004c874c:
  unaff_x24 = *(long **)(unaff_x20 + 0x60);
  unaff_x21 = unaff_x24 + 1;
  if ((char)*unaff_x21 == '\0') {
    *(char *)unaff_x21 = '\x01';
  }
  else {
    func_0x007aff64(unaff_x21,uVar9,1000000000);
  }
  plVar10 = unaff_x24 + 2;
  puVar23 = (undefined *)0x4c8770;
  puVar6 = puVar6 + -0x60;
  goto SUB_004c86b0;
}

