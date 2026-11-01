
undefined8 FUN_005ac020(undefined8 param_1,long param_2)

{
  long ***ppplVar1;
  long *plVar2;
  byte bVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  bool bVar7;
  bool bVar8;
  bool in_ZR;
  undefined8 uVar9;
  ulong *puVar10;
  long lVar11;
  ulong uVar12;
  byte *pbVar13;
  undefined8 *puVar14;
  long *plVar15;
  undefined8 *puVar16;
  undefined1 auVar17 [16];
  undefined8 in_stack_00000038;
  undefined *puStack_80;
  long *plStack_78;
  long ***ppplStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  long **pplStack_50;
  undefined *puStack_48;
  long *plStack_40;
  long lStack_38;
  
  auVar17._8_8_ = param_2;
  auVar17._0_8_ = param_1;
  if (in_ZR || param_2 == 0) {
    auVar17 = __Unwind_Resume();
  }
  func_0x00187bd4(in_stack_00000038,auVar17._8_8_,1);
  auVar17 = __Unwind_Resume(auVar17._0_8_);
  puVar14 = auVar17._0_8_;
  puVar10 = (ulong *)*auVar17._8_8_;
  uVar12 = *puVar10;
  if (uVar12 < 2 || uVar12 == 7) {
LAB_005ac078:
    uVar12 = func_0x005ab01c(puVar14);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
  }
  else {
    if (uVar12 == 0xb) {
      uVar12 = puVar10[1] ^ 0x8000000000000000;
      if (1 < uVar12) {
        uVar12 = 2;
      }
      if (uVar12 - 1 < 2) goto LAB_005ac078;
    }
    uVar12 = (**(code **)(((undefined8 *)*puVar14)[1] + 0x18))
                       (*(undefined8 *)*puVar14,&UNK_008aec78,1);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
    uVar12 = func_0x005ab01c(puVar14,puVar10);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
    uVar12 = (**(code **)(((undefined8 *)*puVar14)[1] + 0x18))
                       (*(undefined8 *)*puVar14,&UNK_008aec79,1);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
  }
  plVar15 = (long *)auVar17._8_8_[1];
  if ((*plVar15 != 6) || (plVar15[1] < -0x7ffffffffffffffb)) goto LAB_005ac518;
  pbVar13 = (byte *)plVar15[2];
  lVar11 = plVar15[3];
  if (lVar11 != 0) {
    bVar3 = *pbVar13;
    if ((bVar3 - 0x41 < 0x1a) || (bVar3 == 0x5f || bVar3 - 0x61 < 0x1a)) {
      do {
        lVar11 = lVar11 + -1;
        if (lVar11 == 0) goto LAB_005ac0dc;
        pbVar13 = pbVar13 + 1;
        bVar3 = *pbVar13;
      } while ((bVar3 - 0x30 < 10 || bVar3 - 0x41 < 0x1a) || (bVar3 == 0x5f || bVar3 - 0x61 < 0x1a))
      ;
    }
    goto LAB_005ac518;
  }
LAB_005ac0dc:
  func_0x0046b8d0(&puStack_80);
  plVar2 = plStack_78;
  if ((int)puStack_80 != 0) {
    plVar2 = (long *)((long)&MACH_HEADER.magic + 1);
  }
  ppplVar1 = (long ***)0;
  if ((int)puStack_80 == 0) {
    ppplVar1 = ppplStack_70;
  }
  if (ppplVar1 == (long ***)0x3) {
    if ((short)*plVar2 == 0x6e61 && *(char *)((long)plVar2 + 2) == 'd') goto LAB_005ac518;
LAB_005ac214:
    bVar4 = false;
LAB_005ac218:
    if (ppplVar1 != (long ***)0x6) {
      if (ppplVar1 == (long ***)0x4) {
        if ((int)*plVar2 == 0x65736c65) goto LAB_005ac518;
        bVar5 = false;
        bVar7 = true;
      }
      else {
        bVar5 = false;
        bVar7 = false;
      }
      goto LAB_005ac2a8;
    }
    if ((int)*plVar2 == 0x65736c65 && *(short *)((long)plVar2 + 4) == 0x6669) goto LAB_005ac518;
    bVar5 = false;
    bVar7 = false;
    bVar8 = false;
    bVar6 = true;
    if (bVar4) goto LAB_005ac2d8;
  }
  else {
    if (ppplVar1 != (long ***)0x2) {
      if (ppplVar1 != (long ***)0x5) goto LAB_005ac214;
      if ((int)*plVar2 == 0x61657262 && *(char *)((long)plVar2 + 4) == 'k') goto LAB_005ac518;
      bVar4 = true;
      goto LAB_005ac218;
    }
    if ((short)*plVar2 == 0x6f64) goto LAB_005ac518;
    bVar4 = false;
    bVar7 = false;
    bVar5 = true;
LAB_005ac2a8:
    if ((ppplVar1 == (long ***)0x3) &&
       ((short)*plVar2 == 0x6e65 && *(char *)((long)plVar2 + 2) == 'd')) goto LAB_005ac518;
    bVar6 = false;
    bVar8 = false;
    if (bVar4) {
LAB_005ac2d8:
      if ((int)*plVar2 == 0x736c6166 && *(char *)((long)plVar2 + 4) == 'e') goto LAB_005ac518;
      bVar8 = true;
    }
    if (ppplVar1 == (long ***)0x3) {
      if ((short)*plVar2 == 0x6f66 && *(char *)((long)plVar2 + 2) == 'r') goto LAB_005ac518;
    }
    else if ((ppplVar1 == (long ***)0x8) && (*plVar2 == 0x6e6f6974636e7566)) goto LAB_005ac518;
  }
  if (bVar5) {
    if (((short)*plVar2 == 0x6669) || ((short)*plVar2 == 0x6e69)) goto LAB_005ac518;
    bVar4 = true;
    if (bVar8) goto LAB_005ac388;
    bVar5 = false;
  }
  else {
    bVar4 = false;
    bVar5 = false;
    if (bVar8) {
LAB_005ac388:
      if ((int)*plVar2 == 0x61636f6c && *(char *)((long)plVar2 + 4) == 'l') goto LAB_005ac518;
      bVar5 = true;
    }
  }
  if ((((((ppplVar1 == (long ***)0x3) &&
         (((short)*plVar2 == 0x696e && *(char *)((long)plVar2 + 2) == 'l' ||
          ((short)*plVar2 == 0x6f6e && *(char *)((long)plVar2 + 2) == 't')))) ||
        ((bVar4 && ((short)*plVar2 == 0x726f)))) ||
       ((bVar6 && (((int)*plVar2 == 0x65706572 && *(short *)((long)plVar2 + 4) == 0x7461 ||
                   ((int)*plVar2 == 0x75746572 && *(short *)((long)plVar2 + 4) == 0x6e72)))))) ||
      ((bVar7 && (((int)*plVar2 == 0x6e656874 || ((int)*plVar2 == 0x65757274)))))) ||
     ((bVar5 && (((int)*plVar2 == 0x69746e75 && *(char *)((long)plVar2 + 4) == 'l' ||
                 ((int)*plVar2 == 0x6c696877 && *(char *)((long)plVar2 + 4) == 'e')))))) {
LAB_005ac518:
    uVar12 = (**(code **)(((undefined8 *)*puVar14)[1] + 0x18))
                       (*(undefined8 *)*puVar14,&UNK_008aecab,1);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
    uVar12 = func_0x005ab01c(puVar14,plVar15);
    if ((uVar12 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x005ac590. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar9 = (**(code **)(((undefined8 *)*puVar14)[1] + 0x18))
                        (*(undefined8 *)*puVar14,&UNK_008aed3e,1);
      return uVar9;
    }
    return 1;
  }
  puVar14 = (undefined8 *)*puVar14;
  func_0x0046b8d0(&puStack_80,plVar15[2],plVar15[3]);
  if ((int)puStack_80 != 1) {
    plStack_40 = plStack_78;
    lStack_38 = (long)ppplStack_70;
    pplStack_50 = &plStack_40;
    puStack_48 = &DAT_005d1a0c;
    puStack_80 = &UNK_009f2028;
    plStack_78 = (long *)0x1;
    uStack_68 = 1;
    uStack_60 = 0;
    ppplStack_70 = &pplStack_50;
    uVar9 = func_0x0046849c(*puVar14,puVar14[1],&puStack_80);
    return uVar9;
  }
  lStack_38 = (long)ppplStack_70;
  plStack_40 = plStack_78;
  auVar17 = func_0x007a2810(&UNK_008aeaf3,0x2b,&plStack_40,&UNK_009f1cd8,&UNK_009f2010);
  lVar11 = auVar17._8_8_;
  puVar14 = auVar17._0_8_;
  puVar10 = *(ulong **)(lVar11 + 0x18);
  uVar12 = *puVar10;
  if (uVar12 < 2 || uVar12 == 7) {
code_r0x005ac5ec:
    uVar12 = func_0x005ab01c(puVar14);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
    puVar16 = (undefined8 *)*puVar14;
  }
  else {
    if (uVar12 == 0xb) {
      uVar12 = puVar10[1] ^ 0x8000000000000000;
      if (1 < uVar12) {
        uVar12 = 2;
      }
      if (uVar12 - 1 < 2) goto code_r0x005ac5ec;
    }
    uVar12 = (**(code **)(((undefined8 *)*puVar14)[1] + 0x18))
                       (*(undefined8 *)*puVar14,&UNK_008aec78,1);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
    uVar12 = func_0x005ab01c(puVar14,puVar10);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
    puVar16 = (undefined8 *)*puVar14;
    uVar12 = (**(code **)(puVar16[1] + 0x18))(*puVar16,&UNK_008aec79,1);
    if ((uVar12 & 1) != 0) {
      return 1;
    }
  }
  uVar12 = (**(code **)(puVar16[1] + 0x18))(*puVar16,&UNK_008aec78,1);
  if (((uVar12 & 1) == 0) &&
     (uVar12 = func_0x005ab4d8(puVar14,*(undefined8 *)(lVar11 + 8),*(undefined8 *)(lVar11 + 0x10)),
     (uVar12 & 1) == 0)) {
                    /* WARNING: Could not recover jumptable at 0x005ac64c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar9 = (**(code **)(((undefined8 *)*puVar14)[1] + 0x18))
                      (*(undefined8 *)*puVar14,&UNK_008aec79,1);
    return uVar9;
  }
  return 1;
}

