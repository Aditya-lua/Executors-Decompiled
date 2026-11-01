
/* WARNING: Type propagation algorithm not settling */

ulong FUN_004274e4(long param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  undefined *puVar7;
  undefined8 uVar8;
  long *plVar9;
  long *******ppppppplVar10;
  ulong uVar11;
  long ******pppppplVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  undefined1 auStack_168 [24];
  undefined8 *puStack_150;
  undefined8 uStack_148;
  undefined *puStack_118;
  undefined8 uStack_110;
  long *******ppppppplStack_108;
  undefined8 uStack_100;
  undefined *puStack_f8;
  undefined8 uStack_f0;
  long lStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long lStack_d0;
  long lStack_c8;
  long *******ppppppplStack_c0;
  undefined *puStack_b8;
  long *******ppppppplStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long *******ppppppplStack_90;
  undefined *puStack_88;
  long *plStack_80;
  undefined *puStack_78;
  long *******ppppppplStack_70;
  undefined *puStack_68;
  
  if (*(char *)((long)param_2 + 0x12) < '\0') {
    func_0x00469240(&puStack_118,param_2,&UNK_0088768e,7);
    uVar8 = func_0x004653b0(&puStack_118,&UNK_00887695,7,param_1 + 0x98,&UNK_009dbed0);
    func_0x004653b0(uVar8,&UNK_008884c4,4,param_1,&UNK_009dbef0);
    if (((*(byte *)(param_1 + 0x90) & 1) != 0) || (*(long *)(param_1 + 0x88) != 0)) {
      func_0x004653b0(&puStack_118,&UNK_0088769c,3,param_1 + 0x78,&UNK_009dbf10);
    }
    if (*(long *)(param_1 + 0xa8) != 0) {
      func_0x004653b0(&puStack_118,&UNK_0088769f,3,(long *)(param_1 + 0xa8),&UNK_009dbf30);
    }
    if (*(int *)(param_1 + 0x48) != 0) {
      func_0x004653b0(&puStack_118,&UNK_008876a2,3,(int *)(param_1 + 0x48),&UNK_009dbf50);
    }
    if (*(int *)(param_1 + 0x50) != 0) {
      func_0x004653b0(&puStack_118,&UNK_008876a5,3,(int *)(param_1 + 0x50),&UNK_009dbf50);
    }
    if (*(long *)(param_1 + 0xb8) != 0) {
      func_0x004653b0(&puStack_118,&UNK_008876a8,6,(long *)(param_1 + 0xb8),&UNK_009dbf70);
    }
    if (*(int *)(param_1 + 0x60) == 5) {
      iVar5 = *(int *)(param_1 + 0x68);
    }
    else {
      func_0x004653b0(&puStack_118,&UNK_0088667d,5,(int *)(param_1 + 0x60),&UNK_009dbf90);
      iVar5 = *(int *)(param_1 + 0x68);
    }
    if (iVar5 == 5) {
      iVar5 = *(int *)(param_1 + 0x70);
    }
    else {
      func_0x004653b0(&puStack_118,&UNK_008863d0,6,param_1 + 0x68,&UNK_009dbf90);
      iVar5 = *(int *)(param_1 + 0x70);
    }
    if (iVar5 == 5) {
      iVar5 = *(int *)(param_1 + 0x58);
    }
    else {
      func_0x004653b0(&puStack_118,&UNK_008863d6,6,param_1 + 0x70,&UNK_009dbf90);
      iVar5 = *(int *)(param_1 + 0x58);
    }
    if (iVar5 != 0) {
      func_0x004653b0(&puStack_118,&UNK_008876ae,6,param_1 + 0x58,&UNK_009dbfb0);
    }
    uVar6 = func_0x00465628(&puStack_118);
    return uVar6;
  }
  if (*(long *******)(param_1 + 0xa8) != (long ******)0x0) {
    ppppppplStack_c0 = (long *******)&ppppppplStack_90;
    puStack_b8 = &DAT_003f3f90;
    puStack_118 = &UNK_009dbe18;
    uStack_110 = 2;
    ppppppplStack_108 = (long *******)&ppppppplStack_c0;
    uStack_100 = 1;
    puStack_f8 = (undefined *)0x0;
    ppppppplStack_90 = (long *******)(param_1 + 0xa8);
    uVar6 = func_0x0046849c(*param_2,param_2[1],&puStack_118);
    if ((uVar6 & 1) != 0) {
      return 1;
    }
  }
  if ((*(byte *)(param_1 + 0x90) & 1) == 0) {
    lVar13 = *(long *)(param_1 + 0x78);
    bVar4 = lVar13 != 0;
    puStack_118 = (undefined *)(ulong)bVar4;
    uVar16 = *(undefined8 *)(param_1 + 0x88);
    uVar8 = *(undefined8 *)(param_1 + 0x80);
    uStack_110 = 0;
    uStack_f0 = 0;
    lVar14 = -(ulong)((long)((ulong)CONCAT14(bVar4,(uint)bVar4) << 0x3f) < 0);
    lVar15 = -(ulong)((long)((ulong)bVar4 << 0x3f) < 0);
    uStack_100 = CONCAT17((byte)((ulong)uVar8 >> 0x38) & (byte)((ulong)lVar14 >> 0x38),
                          CONCAT16((byte)((ulong)uVar8 >> 0x30) & (byte)((ulong)lVar14 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar8 >> 0x28) &
                                            (byte)((ulong)lVar14 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar8 >> 0x20) &
                                                     (byte)((ulong)lVar14 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar8 >> 0x18) &
                                                              (byte)((ulong)lVar14 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar8 >> 0x10)
                                                                       & (byte)((ulong)lVar14 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar8
                                                                                      >> 8) &
                                                                                (byte)((ulong)lVar14
                                                                                      >> 8),
                                                                                (byte)uVar8 &
                                                                                (byte)lVar14)))))));
    uStack_d8 = CONCAT17((byte)((ulong)uVar16 >> 0x38) & (byte)((ulong)lVar15 >> 0x38),
                         CONCAT16((byte)((ulong)uVar16 >> 0x30) & (byte)((ulong)lVar15 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar16 >> 0x28) &
                                           (byte)((ulong)lVar15 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar16 >> 0x20) &
                                                    (byte)((ulong)lVar15 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar16 >> 0x18) &
                                                             (byte)((ulong)lVar15 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar16 >> 0x10)
                                                                      & (byte)((ulong)lVar15 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar16
                                                                                     >> 8) &
                                                                               (byte)((ulong)lVar15
                                                                                     >> 8),
                                                                               (byte)uVar16 &
                                                                               (byte)lVar15)))))));
    ppppppplStack_108 = (long *******)lVar13;
    puStack_f8 = puStack_118;
    lStack_e8 = lVar13;
    uStack_e0 = uStack_100;
    auVar17 = func_0x003f3480(&puStack_118);
    if (auVar17._0_8_ != 0) {
      bVar4 = false;
      do {
        if (*auVar17._8_8_ == -0x8000000000000000) {
          uVar1 = *(undefined8 *)(auVar17._0_8_ + 8);
          uVar3 = *(undefined8 *)(auVar17._0_8_ + 0x10);
          uVar2 = *param_2;
          lVar14 = param_2[1];
          if ((!bVar4) &&
             (uVar6 = (**(code **)(lVar14 + 0x18))(uVar2,&UNK_008884c0,4), (uVar6 & 1) != 0)) {
            return 1;
          }
          func_0x0045b558(&ppppppplStack_90,uVar1,uVar3);
          ppppppplStack_70 = (long *******)&ppppppplStack_90;
          puStack_68 = &DAT_0040b454;
          ppppppplStack_c0 = (long *******)&UNK_009dbe38;
          puStack_b8 = (undefined *)0x2;
          uStack_a8 = 1;
          uStack_a0 = 0;
          ppppppplStack_b0 = (long *******)&ppppppplStack_70;
          iVar5 = func_0x0046849c(uVar2,lVar14,&ppppppplStack_c0);
          if (iVar5 != 0) {
            if (((ulong)ppppppplStack_90 | 0x8000000000000000) == 0x8000000000000000) {
              return 1;
            }
            puVar7 = puStack_88;
            ppppppplVar10 = ppppppplStack_90;
            goto code_r0x004364e4;
          }
          if (((ulong)ppppppplStack_90 | 0x8000000000000000) != 0x8000000000000000) {
            func_0x00187bd4(puStack_88,ppppppplStack_90,1);
          }
          bVar4 = true;
        }
        auVar17 = func_0x003f3480(&puStack_118);
      } while (auVar17._0_8_ != 0);
    }
  }
  else {
    uVar6 = (**(code **)(param_2[1] + 0x18))(*param_2,&UNK_00887684,7);
    if ((uVar6 & 1) != 0) {
      return 1;
    }
    lVar13 = *(long *)(param_1 + 0x78);
    uVar16 = *(undefined8 *)(param_1 + 0x88);
    uVar8 = *(undefined8 *)(param_1 + 0x80);
  }
  bVar4 = lVar13 != 0;
  puStack_118 = (undefined *)(ulong)bVar4;
  uStack_110 = 0;
  uStack_f0 = 0;
  lVar14 = -(ulong)((long)((ulong)CONCAT14(bVar4,(uint)bVar4) << 0x3f) < 0);
  lVar15 = -(ulong)((long)((ulong)bVar4 << 0x3f) < 0);
  uStack_100 = CONCAT17((byte)((ulong)uVar8 >> 0x38) & (byte)((ulong)lVar14 >> 0x38),
                        CONCAT16((byte)((ulong)uVar8 >> 0x30) & (byte)((ulong)lVar14 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar8 >> 0x28) &
                                          (byte)((ulong)lVar14 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar8 >> 0x20) &
                                                   (byte)((ulong)lVar14 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar8 >> 0x18) &
                                                            (byte)((ulong)lVar14 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar8 >> 0x10) &
                                                                     (byte)((ulong)lVar14 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar8 >>
                                                                                    8) &
                                                                              (byte)((ulong)lVar14
                                                                                    >> 8),
                                                                              (byte)uVar8 &
                                                                              (byte)lVar14)))))));
  uStack_d8 = CONCAT17((byte)((ulong)uVar16 >> 0x38) & (byte)((ulong)lVar15 >> 0x38),
                       CONCAT16((byte)((ulong)uVar16 >> 0x30) & (byte)((ulong)lVar15 >> 0x30),
                                CONCAT15((byte)((ulong)uVar16 >> 0x28) &
                                         (byte)((ulong)lVar15 >> 0x28),
                                         CONCAT14((byte)((ulong)uVar16 >> 0x20) &
                                                  (byte)((ulong)lVar15 >> 0x20),
                                                  CONCAT13((byte)((ulong)uVar16 >> 0x18) &
                                                           (byte)((ulong)lVar15 >> 0x18),
                                                           CONCAT12((byte)((ulong)uVar16 >> 0x10) &
                                                                    (byte)((ulong)lVar15 >> 0x10),
                                                                    CONCAT11((byte)((ulong)uVar16 >>
                                                                                   8) &
                                                                             (byte)((ulong)lVar15 >>
                                                                                   8),(byte)uVar16 &
                                                                                      (byte)lVar15))
                                                          )))));
  ppppppplStack_108 = (long *******)lVar13;
  puStack_f8 = puStack_118;
  lStack_e8 = lVar13;
  uStack_e0 = uStack_100;
  auVar17 = func_0x003f3480(&puStack_118);
  if (auVar17._0_8_ != 0) {
    do {
      plVar9 = auVar17._8_8_;
      if (*plVar9 != -0x8000000000000000) {
        lStack_d0 = plVar9[1];
        lStack_c8 = plVar9[2];
        func_0x0045b558(&ppppppplStack_70,*(undefined8 *)(auVar17._0_8_ + 8),
                        *(undefined8 *)(auVar17._0_8_ + 0x10));
        ppppppplStack_90 = (long *******)&ppppppplStack_70;
        puStack_88 = &DAT_0040b454;
        puStack_78 = &
                     __ZN62__LT_std__ffi__os_str__Display_u20_as_u20_core__fmt__Debug_GT_3fmt17h69fc2bfe17cef155E
        ;
        ppppppplStack_c0 = (long *******)&UNK_009dbea0;
        puStack_b8 = (undefined *)0x3;
        uStack_a8 = 2;
        uStack_a0 = 0;
        ppppppplStack_b0 = (long *******)&ppppppplStack_90;
        plStack_80 = &lStack_d0;
        iVar5 = func_0x0046849c(*param_2,param_2[1],&ppppppplStack_c0);
        if (iVar5 != 0) {
          if (((ulong)ppppppplStack_70 | 0x8000000000000000) == 0x8000000000000000) {
            return 1;
          }
          puVar7 = puStack_68;
          ppppppplVar10 = ppppppplStack_70;
code_r0x004364e4:
          func_0x00187bd4(puVar7,ppppppplVar10,1);
          return 1;
        }
        if (((ulong)ppppppplStack_70 | 0x8000000000000000) != 0x8000000000000000) {
          func_0x00187bd4(puStack_68,ppppppplStack_70,1);
        }
      }
      auVar17 = func_0x003f3480(&puStack_118);
    } while (auVar17._0_8_ != 0);
  }
  lVar13 = *(long *)(param_1 + 0x10);
  if (lVar13 == 0) {
    uVar8 = func_0x007a2570(0,0,&UNK_009dbe58);
    if (((ulong)ppppppplStack_90 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(puStack_88,ppppppplStack_90,1);
    }
    auVar17 = __Unwind_Resume(uVar8);
    puStack_150 = param_2;
    uStack_148 = uVar8;
    func_0x00469960(auStack_168,auVar17._8_8_,&UNK_008849b0,0x10);
    func_0x004656a8(auStack_168,auVar17._0_8_,&UNK_009dbfd0);
    uVar6 = func_0x004658b0();
    return uVar6;
  }
  pppppplVar12 = *(long *******)(param_1 + 8);
  if (*(long ******)(param_1 + 0xa0) == pppppplVar12[1]) {
    iVar5 = _memcmp(*(long ******)(param_1 + 0x98),*pppppplVar12);
    uVar8 = *param_2;
    uVar16 = param_2[1];
    if (iVar5 == 0) goto code_r0x00436478;
  }
  else {
    uVar8 = *param_2;
    uVar16 = param_2[1];
  }
  puStack_b8 = &
               __ZN63__LT_alloc__ffi__c_str__CString_u20_as_u20_core__fmt__Debug_GT_3fmt17h929e693e91dc938dE
  ;
  puStack_118 = &UNK_009dbe70;
  uStack_110 = 2;
  ppppppplStack_108 = (long *******)&ppppppplStack_c0;
  uStack_100 = 1;
  puStack_f8 = (undefined *)0x0;
  ppppppplStack_c0 = (long *******)(param_1 + 0x98);
  uVar6 = func_0x0046849c(uVar8,uVar16,&puStack_118);
  if ((uVar6 & 1) != 0) {
    return 1;
  }
code_r0x00436478:
  puStack_b8 = &
               __ZN63__LT_alloc__ffi__c_str__CString_u20_as_u20_core__fmt__Debug_GT_3fmt17h929e693e91dc938dE
  ;
  uVar11 = 1;
  puStack_118 = &UNK_007fc120;
  uStack_110 = 1;
  uStack_100 = 1;
  puStack_f8 = (undefined *)0x0;
  ppppppplStack_108 = (long *******)&ppppppplStack_c0;
  ppppppplStack_c0 = (long *******)pppppplVar12;
  uVar6 = func_0x0046849c(uVar8,uVar16,&puStack_118);
  if ((uVar6 & 1) == 0) {
    lVar13 = lVar13 * 0x10;
    if (lVar13 == 0x10) {
      uVar11 = 0;
    }
    else {
      lVar13 = lVar13 + -0x20;
      do {
        pppppplVar12 = pppppplVar12 + 2;
        puStack_b8 = &DAT_003f3f90;
        puStack_118 = &UNK_009dbe90;
        uStack_110 = 1;
        uStack_100 = 1;
        puStack_f8 = (undefined *)0x0;
        ppppppplStack_108 = (long *******)&ppppppplStack_c0;
        ppppppplStack_c0 = (long *******)&ppppppplStack_90;
        ppppppplStack_90 = (long *******)pppppplVar12;
        uVar11 = func_0x0046849c(uVar8,uVar16,&puStack_118);
        if ((uVar11 & 1) != 0) {
          return uVar11;
        }
        bVar4 = lVar13 != 0;
        lVar13 = lVar13 + -0x10;
      } while (bVar4);
    }
  }
  return uVar11;
}

