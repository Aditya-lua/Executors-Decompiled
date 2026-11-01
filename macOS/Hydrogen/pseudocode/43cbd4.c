
void FUN_0043cbd4(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  int iVar5;
  uint in_w8;
  long lVar6;
  undefined8 *puVar7;
  uint in_w9;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  ulong unaff_x21;
  long *unaff_x22;
  code *pcVar11;
  ulong uVar12;
  long *unaff_x27;
  long unaff_x28;
  long in_stack_00000010;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
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
  long in_stack_00001528;
  undefined8 in_stack_00001530;
  undefined8 in_stack_00001538;
  long in_stack_00001bf0;
  long in_stack_00001bf8;
  long in_stack_00001c00;
  long in_stack_00001c08;
  long in_stack_00001c10;
  long in_stack_00001c18;
  ulong in_stack_00001e00;
  undefined1 auStack_7ffffffe [2147483646];
  
  if ((in_w8 != (in_w9 & 0xffff | 0xcffa0000)) &&
     (func_0x0043d840(auStack_7ffffffe + 0x80001526,param_2,in_stack_00001530,in_stack_00001538),
     in_stack_00001528 != -0x8000000000000000)) {
    in_stack_00001e00 = 0x8000000000000000;
    func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                    auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
    lVar10 = uStack0000000000000050;
    if (uStack0000000000000050 != -0x8000000000000000) {
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
      lVar6 = *unaff_x22;
      goto joined_r0x0043cc94;
    }
  }
  func_0x003f7334(auStack_7ffffffe + 0x80001bee);
  _munmap(in_stack_00000038,in_stack_00000030);
  lVar10 = -0x8000000000000000;
  lVar6 = *unaff_x22;
  in_stack_00001c18 = in_stack_00001348;
  in_stack_00001c10 = in_stack_00001340;
  in_stack_00001c08 = in_stack_00001338;
  in_stack_00001c00 = in_stack_00001330;
  in_stack_00001bf8 = in_stack_00001328;
  in_stack_00001bf0 = in_stack_00001320;
joined_r0x0043cc94:
  if ((lVar6 != -0x7fffffffffffffff) && (lVar6 != -0x8000000000000000)) {
    func_0x003f70a4();
    _munmap(unaff_x22[0x41],unaff_x22[0x42]);
    func_0x003f7334(unaff_x22 + 0x43);
  }
  *unaff_x22 = lVar10;
  _memcpy(unaff_x22 + 1,auStack_7ffffffe + 0x800009ae,0x200);
  unaff_x22[0x41] = in_stack_00000038;
  unaff_x22[0x42] = in_stack_00000030;
  unaff_x22[0x44] = in_stack_00001bf8;
  unaff_x22[0x43] = in_stack_00001bf0;
  unaff_x22[0x46] = in_stack_00001c08;
  unaff_x22[0x45] = in_stack_00001c00;
  unaff_x22[0x48] = in_stack_00001c18;
  unaff_x22[0x47] = in_stack_00001c10;
  if (((lVar10 != -0x7fffffffffffffff) && (lVar10 != -0x8000000000000000)) &&
     (uVar12 = *(ulong *)(unaff_x28 + 0x10), uVar12 != 0)) {
    lVar6 = *(long *)(unaff_x28 + 8);
    uVar3 = *in_stack_00000040;
    uVar8 = in_stack_00000040[1];
    lVar10 = 0;
    if (uVar12 != 1) {
      do {
        lVar1 = (uVar12 >> 1) + lVar10;
        puVar7 = (undefined8 *)(lVar6 + lVar1 * 0x18);
        uVar4 = puVar7[1];
        uVar9 = uVar4;
        if (uVar8 <= uVar4) {
          uVar9 = uVar8;
        }
        iVar5 = _memcmp(*puVar7,uVar3,uVar9);
        lVar2 = uVar4 - uVar8;
        if (iVar5 != 0) {
          lVar2 = (long)iVar5;
        }
        if (lVar2 < 1) {
          lVar10 = lVar1;
        }
        uVar12 = uVar12 - (uVar12 >> 1);
      } while (1 < uVar12);
    }
    puVar7 = (undefined8 *)(lVar6 + lVar10 * 0x18);
    uVar9 = puVar7[1];
    uVar12 = uVar9;
    if (uVar8 <= uVar9) {
      uVar12 = uVar8;
    }
    iVar5 = _memcmp(*puVar7,uVar3,uVar12);
    lVar1 = uVar9 - uVar8;
    if (iVar5 != 0) {
      lVar1 = (long)iVar5;
    }
    if ((lVar1 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x28,
                        (unaff_x21 - in_stack_00000040[2]) + *(long *)(lVar6 + lVar10 * 0x18 + 0x10)
                       ), in_stack_000009b0 != 5)) {
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
        pcVar11 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar11)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              in_stack_00001e00 < 2) {
          (*pcVar11)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
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
  uVar12 = unaff_x27[1];
  if (uVar12 != 0) {
    lVar10 = *unaff_x27;
    if (uVar12 == 1) {
      uVar8 = 0;
    }
    else {
      uVar8 = 0;
      uVar9 = uVar12;
      do {
        uVar4 = (uVar9 >> 1) + uVar8;
        if (*(ulong *)(lVar10 + uVar4 * 0x18 + 0x10) <= unaff_x21) {
          uVar8 = uVar4;
        }
        uVar9 = uVar9 - (uVar9 >> 1);
      } while (1 < uVar9);
    }
    uVar9 = *(ulong *)(lVar10 + uVar8 * 0x18 + 0x10);
    if (uVar9 != unaff_x21) {
      if (uVar9 < unaff_x21) {
        uVar8 = uVar8 + 1;
      }
      if (uVar8 == 0) {
        return;
      }
      uVar8 = uVar8 - 1;
    }
    if (uVar8 < uVar12) {
      puVar7 = (undefined8 *)(lVar10 + uVar8 * 0x18);
      uStack0000000000000058 = *puVar7;
      in_stack_00000060 = puVar7[1];
      uStack0000000000000050 = CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
}

