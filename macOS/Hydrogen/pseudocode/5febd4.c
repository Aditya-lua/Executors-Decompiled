
/* WARNING: Possible PIC construction at 0x005fec1c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005fe6bc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005fe758: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005fe6c0) */
/* WARNING: Removing unreachable block (ram,0x005fec20) */
/* WARNING: Removing unreachable block (ram,0x005fec4c) */
/* WARNING: Removing unreachable block (ram,0x005fe584) */
/* WARNING: Removing unreachable block (ram,0x005fe5cc) */
/* WARNING: Removing unreachable block (ram,0x005fe690) */
/* WARNING: Removing unreachable block (ram,0x005fe6c4) */
/* WARNING: Removing unreachable block (ram,0x005fe6e0) */
/* WARNING: Removing unreachable block (ram,0x005fe6d0) */
/* WARNING: Removing unreachable block (ram,0x005fe6e4) */
/* WARNING: Removing unreachable block (ram,0x005fe704) */
/* WARNING: Removing unreachable block (ram,0x005fe714) */
/* WARNING: Removing unreachable block (ram,0x005fe718) */
/* WARNING: Removing unreachable block (ram,0x005fe738) */
/* WARNING: Removing unreachable block (ram,0x005fe6ac) */
/* WARNING: Removing unreachable block (ram,0x005fec38) */
/* WARNING: Removing unreachable block (ram,0x005fe75c) */
/* WARNING: Removing unreachable block (ram,0x005fe760) */
/* WARNING: Removing unreachable block (ram,0x005fe764) */
/* WARNING: Removing unreachable block (ram,0x005fe768) */
/* WARNING: Removing unreachable block (ram,0x005fe774) */
/* WARNING: Removing unreachable block (ram,0x005fe77c) */
/* WARNING: Removing unreachable block (ram,0x005fe7b0) */
/* WARNING: Removing unreachable block (ram,0x005fe7bc) */
/* WARNING: Removing unreachable block (ram,0x005fe7c8) */
/* WARNING: Removing unreachable block (ram,0x005fe7dc) */
/* WARNING: Removing unreachable block (ram,0x005fe7e4) */
/* WARNING: Removing unreachable block (ram,0x005fe794) */

void FUN_005febd4(long param_1,undefined8 param_2,ulong param_3,int param_4)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  code *pcVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  long *plVar12;
  byte bVar13;
  ulong *puVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  byte abStack_d8 [24];
  long alStack_70 [7];
  undefined8 uStack_38;
  
  uStack_38 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  func_0x0060ecc4(alStack_70);
  uVar5 = (**(code **)(alStack_70[0] + 0x98))(alStack_70);
  if (uVar5 < param_3) {
    uVar7 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(abStack_d8,"Integer: input length is too small");
    func_0x0002703c(uVar7,abStack_d8);
    ___cxa_throw(uVar7,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x5feb98);
    (*pcVar4)();
  }
  (**(code **)(alStack_70[0] + 0xb8))(alStack_70,abStack_d8);
  *(uint *)(param_1 + 0x28) = (uint)(param_4 == 1 && (char)abStack_d8[0] < '\0');
  for (; param_3 != 0; param_3 = param_3 - 1) {
    bVar13 = 0xff;
    if (*(int *)(param_1 + 0x28) == 0) {
      bVar13 = 0;
    }
    if (abStack_d8[0] != bVar13) {
      uVar5 = param_3 + 7;
      uVar8 = uVar5 >> 3;
      if (uVar5 < 0x48) goto code_r0x005fe8b4;
      if (uVar5 < 0x88) {
        uVar5 = 0x10;
      }
      else if (uVar5 < 0x108) {
        uVar5 = 0x20;
      }
      else if (uVar5 < 0x208) {
        uVar5 = 0x40;
      }
      else {
        uVar10 = 0;
        uVar5 = 0x40;
        do {
          uVar3 = uVar10 + (uint)uVar5 >> 1;
          uVar1 = uVar3;
          if (uVar8 - 1 >> ((ulong)uVar3 & 0x3f) != 0) {
            uVar1 = (uint)uVar5;
            uVar10 = uVar3;
          }
          uVar5 = (ulong)uVar1;
        } while (1 < uVar1 - uVar10);
        uVar5 = 1L << (uVar5 & 0x3f);
      }
      goto code_r0x005fe8c0;
    }
    (**(code **)(alStack_70[0] + 200))(alStack_70,1);
    (**(code **)(alStack_70[0] + 0xb8))(alStack_70,abStack_d8);
  }
  param_3 = 0;
  uVar8 = 0;
code_r0x005fe8b4:
  uVar5 = (ulong)*(uint *)(&UNK_008babcc + uVar8 * 4);
code_r0x005fe8c0:
  puVar14 = (ulong *)(param_1 + 0x18);
  uVar8 = *puVar14;
  lVar6 = *(long *)(param_1 + 0x20);
  if (uVar8 != uVar5) {
    if (lVar6 != 0) {
      if (uVar8 != 0) {
        do {
          *(undefined8 *)(lVar6 + -8 + uVar8 * 8) = 0;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
      }
      func_0x00611644();
    }
    func_0x006108a0(uVar5);
    if (uVar5 == 0) {
      *puVar14 = 0;
      *(undefined8 *)(param_1 + 0x20) = 0;
      *(undefined8 *)(param_1 + 0x10) = 0x1fffffffffffffff;
      goto joined_r0x005fe918;
    }
    lVar6 = func_0x006115d0(uVar5 << 3);
  }
  *(ulong *)(param_1 + 0x18) = uVar5;
  *(long *)(param_1 + 0x20) = lVar6;
  if (lVar6 != 0) {
    _bzero(lVar6,uVar5 << 3);
  }
  *(undefined8 *)(param_1 + 0x10) = 0x1fffffffffffffff;
joined_r0x005fe918:
  if (param_3 != 0) {
    uVar8 = param_3 * 8;
    uVar5 = param_3;
    do {
      uVar8 = uVar8 - 8;
      uVar5 = uVar5 - 1;
      (**(code **)(alStack_70[0] + 0xa8))(alStack_70,abStack_d8);
      *(ulong *)(*(long *)(param_1 + 0x20) + (uVar5 & 0xfffffffffffffff8)) =
           *(ulong *)(*(long *)(param_1 + 0x20) + (uVar5 & 0xfffffffffffffff8)) |
           (ulong)abStack_d8[0] << (uVar8 & 0x38);
    } while (uVar5 != 0);
  }
  if (*(int *)(param_1 + 0x28) == 1) {
    uVar5 = *(ulong *)(param_1 + 0x18);
    plVar2 = *(long **)(param_1 + 0x20);
    if (param_3 < uVar5 << 3) {
      uVar8 = param_3 << 3;
      do {
        *(ulong *)((long)plVar2 + (param_3 & 0xfffffffffffffff8)) =
             *(ulong *)((long)plVar2 + (param_3 & 0xfffffffffffffff8)) | 0xffL << (uVar8 & 0x38);
        param_3 = param_3 + 1;
        uVar5 = *puVar14;
        uVar8 = uVar8 + 8;
      } while (param_3 < uVar5 << 3);
    }
    lVar6 = *plVar2;
    *plVar2 = lVar6 + -1;
    if ((uVar5 < 2) || (lVar6 != 0)) {
      if (uVar5 == 0) {
        return;
      }
    }
    else {
      uVar8 = 2;
      uVar11 = 1;
      do {
        uVar9 = uVar8;
        lVar6 = plVar2[uVar11];
        plVar2[uVar11] = lVar6 + -1;
        uVar8 = (ulong)((int)uVar9 + 1);
        uVar11 = uVar9;
      } while ((lVar6 == 0 && uVar9 <= uVar5) && (lVar6 != 0 || uVar5 != uVar9));
    }
    if (uVar5 < 10) {
      uVar8 = 0;
      uVar10 = 0;
    }
    else {
      uVar10 = 0;
      uVar8 = 0;
      if (((int)(uVar5 - 1) != -1) && (uVar5 - 1 >> 0x20 == 0)) {
        uVar8 = uVar5 & 0xfffffffffffffff8;
        uVar10 = (uint)uVar8;
        plVar12 = plVar2 + 4;
        uVar11 = uVar8;
        do {
          lVar15 = plVar12[-3];
          lVar6 = plVar12[-4];
          lVar17 = plVar12[-1];
          lVar16 = plVar12[-2];
          lVar19 = plVar12[1];
          lVar18 = *plVar12;
          lVar21 = plVar12[3];
          lVar20 = plVar12[2];
          plVar12[-3] = CONCAT17(~(byte)((ulong)lVar15 >> 0x38),
                                 CONCAT16(~(byte)((ulong)lVar15 >> 0x30),
                                          CONCAT15(~(byte)((ulong)lVar15 >> 0x28),
                                                   CONCAT14(~(byte)((ulong)lVar15 >> 0x20),
                                                            CONCAT13(~(byte)((ulong)lVar15 >> 0x18),
                                                                     CONCAT12(~(byte)((ulong)lVar15
                                                                                     >> 0x10),
                                                                              CONCAT11(~(byte)((
                                                  ulong)lVar15 >> 8),~(byte)lVar15)))))));
          plVar12[-4] = CONCAT17(~(byte)((ulong)lVar6 >> 0x38),
                                 CONCAT16(~(byte)((ulong)lVar6 >> 0x30),
                                          CONCAT15(~(byte)((ulong)lVar6 >> 0x28),
                                                   CONCAT14(~(byte)((ulong)lVar6 >> 0x20),
                                                            CONCAT13(~(byte)((ulong)lVar6 >> 0x18),
                                                                     CONCAT12(~(byte)((ulong)lVar6
                                                                                     >> 0x10),
                                                                              CONCAT11(~(byte)((
                                                  ulong)lVar6 >> 8),~(byte)lVar6)))))));
          plVar12[-1] = CONCAT17(~(byte)((ulong)lVar17 >> 0x38),
                                 CONCAT16(~(byte)((ulong)lVar17 >> 0x30),
                                          CONCAT15(~(byte)((ulong)lVar17 >> 0x28),
                                                   CONCAT14(~(byte)((ulong)lVar17 >> 0x20),
                                                            CONCAT13(~(byte)((ulong)lVar17 >> 0x18),
                                                                     CONCAT12(~(byte)((ulong)lVar17
                                                                                     >> 0x10),
                                                                              CONCAT11(~(byte)((
                                                  ulong)lVar17 >> 8),~(byte)lVar17)))))));
          plVar12[-2] = CONCAT17(~(byte)((ulong)lVar16 >> 0x38),
                                 CONCAT16(~(byte)((ulong)lVar16 >> 0x30),
                                          CONCAT15(~(byte)((ulong)lVar16 >> 0x28),
                                                   CONCAT14(~(byte)((ulong)lVar16 >> 0x20),
                                                            CONCAT13(~(byte)((ulong)lVar16 >> 0x18),
                                                                     CONCAT12(~(byte)((ulong)lVar16
                                                                                     >> 0x10),
                                                                              CONCAT11(~(byte)((
                                                  ulong)lVar16 >> 8),~(byte)lVar16)))))));
          plVar12[1] = CONCAT17(~(byte)((ulong)lVar19 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar19 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar19 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar19 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar19 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar19
                                                                                    >> 0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar19 >> 8),~(byte)lVar19)))))));
          *plVar12 = CONCAT17(~(byte)((ulong)lVar18 >> 0x38),
                              CONCAT16(~(byte)((ulong)lVar18 >> 0x30),
                                       CONCAT15(~(byte)((ulong)lVar18 >> 0x28),
                                                CONCAT14(~(byte)((ulong)lVar18 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)lVar18 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)lVar18 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  lVar18 >> 8),~(byte)lVar18)))))));
          plVar12[3] = CONCAT17(~(byte)((ulong)lVar21 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar21 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar21 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar21 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar21 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar21
                                                                                    >> 0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar21 >> 8),~(byte)lVar21)))))));
          plVar12[2] = CONCAT17(~(byte)((ulong)lVar20 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar20 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar20 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar20 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar20 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar20
                                                                                    >> 0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar20 >> 8),~(byte)lVar20)))))));
          uVar11 = uVar11 - 8;
          plVar12 = plVar12 + 8;
        } while (uVar11 != 0);
        if (uVar5 == uVar8) {
          return;
        }
      }
    }
    do {
      uVar10 = uVar10 + 1;
      plVar2[uVar8] = ~plVar2[uVar8];
      uVar8 = (ulong)uVar10;
    } while (uVar8 < uVar5);
  }
  return;
}

