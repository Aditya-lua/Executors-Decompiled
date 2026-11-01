
/* WARNING: Removing unreachable block (ram,0x0043ca0c) */
/* WARNING: Removing unreachable block (ram,0x0043ca1c) */
/* WARNING: Removing unreachable block (ram,0x0043ca68) */
/* WARNING: Removing unreachable block (ram,0x0043ca54) */
/* WARNING: Removing unreachable block (ram,0x0043ca64) */

void FUN_0043c778(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  int iVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long lVar13;
  ulong unaff_x21;
  long *unaff_x22;
  code *pcVar14;
  long unaff_x26;
  long *unaff_x27;
  long unaff_x28;
  undefined1 auVar15 [16];
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  int in_stack_000009b0;
  undefined4 in_stack_000009b4;
  undefined8 in_stack_000009c8;
  undefined8 in_stack_000009d0;
  undefined8 in_stack_000009d8;
  undefined8 in_stack_000009e0;
  undefined8 in_stack_000009e8;
  undefined8 in_stack_000009f0;
  long in_stack_000009f8;
  undefined8 in_stack_00000a00;
  long in_stack_00001320;
  long in_stack_00001328;
  long in_stack_00001330;
  long in_stack_00001338;
  long in_stack_00001340;
  long in_stack_00001348;
  long in_stack_00001bf0;
  long in_stack_00001bf8;
  long in_stack_00001c00;
  long in_stack_00001c08;
  long in_stack_00001c10;
  long in_stack_00001c18;
  ulong in_stack_00001e00;
  undefined1 auStack_7ffffffe [2147483646];
  
  uVar8 = func_0x0043fb2c();
  if ((uVar8 & 1) != 0) {
    auVar15 = func_0x0043fb2c(in_stack_00000038 + 8,0x14,10);
    uVar8 = auVar15._8_8_;
    if ((auVar15._0_8_ & 1) != 0) {
      if (uVar8 == 0) {
        uVar9 = 0;
        lVar13 = 1;
code_r0x0043c9e4:
        *(undefined1 *)(unaff_x26 + 0x38) = 0;
        do {
          while( true ) {
            if (uVar9 == 0) goto code_r0x0043cc70;
            lVar10 = lVar13 + 0x14;
            uVar9 = uVar9 - 1;
            auVar15 = func_0x0043fb2c(lVar13,0x14,10);
            uVar8 = auVar15._8_8_;
            if ((((auVar15._0_8_ & 1) != 0) && (uVar8 <= in_stack_00000030)) &&
               (0x6f < in_stack_00000030 - uVar8)) break;
code_r0x0043cb70:
            uVar9 = 0;
            lVar13 = 1;
          }
          auVar15 = func_0x0043fb2c(in_stack_00000038 + uVar8 + 0x6c,4,10);
          uVar12 = auVar15._8_8_;
          if ((auVar15._0_8_ & 1) == 0) goto code_r0x0043cb70;
          uVar1 = uVar8 + 0x70;
          if ((in_stack_00000030 < uVar1) || (in_stack_00000030 - uVar1 < uVar12))
          goto code_r0x0043cb70;
          uVar3 = uVar12 + uVar1;
          uVar2 = uVar3 + 1;
          if (uVar3 == 0xffffffffffffffff) {
            uVar2 = 0xffffffffffffffff;
          }
          if ((uVar3 & 1) != 0) {
            uVar3 = uVar2;
          }
          if ((in_stack_00000030 < uVar3 || in_stack_00000030 - uVar3 < 2) ||
             (*(short *)(in_stack_00000038 + uVar3) != 0xa60)) goto code_r0x0043cb70;
          auVar15 = func_0x0043fb2c(in_stack_00000038 + uVar8,0x14,10);
          uVar8 = auVar15._8_8_;
          if ((auVar15._0_8_ & 1) == 0) goto code_r0x0043cb70;
          uVar3 = uVar3 + 2;
          lVar13 = lVar10;
        } while ((uVar12 != in_stack_00000028) ||
                (iVar7 = _memcmp(in_stack_00000038 + uVar1,in_stack_00000018,in_stack_00000028),
                iVar7 != 0));
        if (uVar3 == 0) {
          uVar8 = 0;
          lVar13 = 1;
        }
        else {
          if ((in_stack_00000030 < uVar3) || (in_stack_00000030 - uVar3 < uVar8))
          goto code_r0x0043cc70;
          lVar13 = in_stack_00000038 + uVar3;
        }
        func_0x0043d660(auStack_7ffffffe + 0x80001526,lVar13,uVar8);
        if (MACH_HEADER._1_4_ != -0x30051202) {
          func_0x0043d840(auStack_7ffffffe + 0x80001526,1,lVar10,uVar9);
          in_stack_00001e00 = 0x8000000000000000;
          func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                          auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
          lVar13 = uStack0000000000000050;
          if (uStack0000000000000050 != -0x8000000000000000) {
            _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
            lVar10 = *unaff_x22;
            in_stack_00001320 = in_stack_00001bf0;
            in_stack_00001328 = in_stack_00001bf8;
            in_stack_00001330 = in_stack_00001c00;
            in_stack_00001338 = in_stack_00001c08;
            in_stack_00001340 = in_stack_00001c10;
            in_stack_00001348 = in_stack_00001c18;
            goto joined_r0x0043cfcc;
          }
        }
      }
      else if ((uVar8 <= in_stack_00000030) && (0x6f < in_stack_00000030 - uVar8)) {
        auVar15 = func_0x0043fb2c(in_stack_00000038 + uVar8 + 0x6c,4,10);
        if ((auVar15._0_8_ & 1) != 0) {
          uVar12 = uVar8 + 0x70;
          if ((uVar12 <= in_stack_00000030) && (auVar15._8_8_ <= in_stack_00000030 - uVar12)) {
            uVar12 = auVar15._8_8_ + uVar12;
            uVar9 = uVar12 + 1;
            if (uVar12 == 0xffffffffffffffff) {
              uVar9 = 0xffffffffffffffff;
            }
            if ((uVar12 & 1) != 0) {
              uVar12 = uVar9;
            }
            if (((uVar12 <= in_stack_00000030) && (1 < in_stack_00000030 - uVar12)) &&
               (*(short *)(in_stack_00000038 + uVar12) == 0xa60)) {
              auVar15 = func_0x0043fb2c(in_stack_00000038 + uVar8,0x14,10);
              uVar8 = auVar15._8_8_;
              if ((((auVar15._0_8_ & 1) != 0) && (uVar12 = uVar12 + 2, uVar12 != 0)) &&
                 ((uVar12 <= in_stack_00000030 &&
                  ((uVar8 <= in_stack_00000030 - uVar12 && (0x13 < uVar8)))))) {
                auVar15 = func_0x0043fb2c(in_stack_00000038 + uVar12,0x14,10);
                uVar9 = auVar15._8_8_;
                if (((auVar15._0_8_ & 1) != 0) &&
                   ((auVar15._8_8_ = 0, auVar15._0_8_ = uVar9,
                    SUB168(auVar15 * ZEXT816(0x14),8) == 0 && (uVar9 * 0x14 <= uVar8 - 0x14)))) {
                  lVar13 = in_stack_00000038 + uVar12 + 0x14;
                  goto code_r0x0043c9e4;
                }
              }
            }
          }
        }
      }
    }
  }
code_r0x0043cc70:
  func_0x003f7334(auStack_7ffffffe + 0x80001bee);
  _munmap(in_stack_00000038,in_stack_00000030);
  lVar13 = -0x8000000000000000;
  lVar10 = *unaff_x22;
joined_r0x0043cfcc:
  if ((lVar10 != -0x7fffffffffffffff) && (lVar10 != -0x8000000000000000)) {
    func_0x003f70a4();
    _munmap(unaff_x22[0x41],unaff_x22[0x42]);
    func_0x003f7334(unaff_x22 + 0x43);
  }
  *unaff_x22 = lVar13;
  _memcpy(unaff_x22 + 1,auStack_7ffffffe + 0x800009ae,0x200);
  unaff_x22[0x41] = in_stack_00000038;
  unaff_x22[0x42] = in_stack_00000030;
  unaff_x22[0x44] = in_stack_00001328;
  unaff_x22[0x43] = in_stack_00001320;
  unaff_x22[0x46] = in_stack_00001338;
  unaff_x22[0x45] = in_stack_00001330;
  unaff_x22[0x48] = in_stack_00001348;
  unaff_x22[0x47] = in_stack_00001340;
  if (((lVar13 != -0x7fffffffffffffff) && (lVar13 != -0x8000000000000000)) &&
     (uVar8 = *(ulong *)(unaff_x28 + 0x10), uVar8 != 0)) {
    lVar10 = *(long *)(unaff_x28 + 8);
    uVar6 = *in_stack_00000040;
    uVar12 = in_stack_00000040[1];
    lVar13 = 0;
    if (uVar8 != 1) {
      do {
        lVar4 = (uVar8 >> 1) + lVar13;
        puVar11 = (undefined8 *)(lVar10 + lVar4 * 0x18);
        uVar1 = puVar11[1];
        uVar9 = uVar1;
        if (uVar12 <= uVar1) {
          uVar9 = uVar12;
        }
        iVar7 = _memcmp(*puVar11,uVar6,uVar9);
        lVar5 = uVar1 - uVar12;
        if (iVar7 != 0) {
          lVar5 = (long)iVar7;
        }
        if (lVar5 < 1) {
          lVar13 = lVar4;
        }
        uVar8 = uVar8 - (uVar8 >> 1);
      } while (1 < uVar8);
    }
    puVar11 = (undefined8 *)(lVar10 + lVar13 * 0x18);
    uVar9 = puVar11[1];
    uVar8 = uVar9;
    if (uVar12 <= uVar9) {
      uVar8 = uVar12;
    }
    iVar7 = _memcmp(*puVar11,uVar6,uVar8);
    lVar4 = uVar9 - uVar12;
    if (iVar7 != 0) {
      lVar4 = (long)iVar7;
    }
    if ((lVar4 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x28,
                        (unaff_x21 - in_stack_00000040[2]) +
                        *(long *)(lVar10 + lVar13 * 0x18 + 0x10)), in_stack_000009b0 != 5)) {
      uStack0000000000000050 = CONCAT44(in_stack_000009b4,in_stack_000009b0);
      in_stack_00000068 = in_stack_000009c8;
      in_stack_00000070 = in_stack_000009d0;
      in_stack_00000078 = in_stack_000009d8;
      in_stack_00000080 = in_stack_000009e0;
      in_stack_00000088 = in_stack_000009e8;
      in_stack_00000090 = in_stack_000009f0;
      in_stack_00000098 = in_stack_000009f8;
      in_stack_000000a0 = in_stack_00000a00;
      func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050);
      if (in_stack_00001e00 < 2) {
        pcVar14 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar14)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              in_stack_00001e00 < 2) {
          (*pcVar14)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        }
      }
      if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
        func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
      }
      if (in_stack_00001e00 < 2) {
        return;
      }
    }
  }
  uVar8 = unaff_x27[1];
  if (uVar8 != 0) {
    lVar13 = *unaff_x27;
    if (uVar8 == 1) {
      uVar12 = 0;
    }
    else {
      uVar12 = 0;
      uVar9 = uVar8;
      do {
        uVar1 = (uVar9 >> 1) + uVar12;
        if (*(ulong *)(lVar13 + uVar1 * 0x18 + 0x10) <= unaff_x21) {
          uVar12 = uVar1;
        }
        uVar9 = uVar9 - (uVar9 >> 1);
      } while (1 < uVar9);
    }
    uVar9 = *(ulong *)(lVar13 + uVar12 * 0x18 + 0x10);
    if (uVar9 != unaff_x21) {
      if (uVar9 < unaff_x21) {
        uVar12 = uVar12 + 1;
      }
      if (uVar12 == 0) {
        return;
      }
      uVar12 = uVar12 - 1;
    }
    if (uVar12 < uVar8) {
      puVar11 = (undefined8 *)(lVar13 + uVar12 * 0x18);
      uStack0000000000000058 = *puVar11;
      in_stack_00000060 = puVar11[1];
      uStack0000000000000050 = CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
}

