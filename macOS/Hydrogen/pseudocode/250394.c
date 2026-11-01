
void FUN_00250394(undefined8 param_1)

{
  ulong *puVar1;
  code *pcVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong *extraout_x8;
  ulong uVar6;
  long *plVar7;
  long *plVar8;
  ulong *puVar9;
  undefined *puVar10;
  long unaff_x19;
  undefined8 uVar11;
  byte bVar12;
  undefined8 uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong unaff_x26;
  undefined8 uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  long *plStack_68;
  ulong uStack_60;
  ulong uStack_58;
  
  func_0x002458bc();
  lVar5 = *(long *)(unaff_x19 + 0x2d8);
  if ((lVar5 != -0x8000000000000000) && (lVar5 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x2e0),lVar5,1);
  }
  func_0x0016e8dc(unaff_x19 + 0x2f0);
  func_0x0016de34(unaff_x19 + 0x50);
  func_0x0016de34(unaff_x19 + 0x88);
  lVar5 = *(long *)(unaff_x19 + 0x308);
  if ((lVar5 != -0x8000000000000000) && (lVar5 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x310),lVar5,1);
  }
  func_0x002459c0(unaff_x19 + 0xc0);
  if (*(long *)(unaff_x19 + 0x368) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x370),*(long *)(unaff_x19 + 0x368) * 0x28,8);
  }
  lVar5 = __Unwind_Resume(param_1);
  if (*(long *)(lVar5 + 1000) == -0x7fffffffffffffd9) {
                    /* WARNING: Could not recover jumptable at 0x002504e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)(lVar5 + 0x3f8) + 0x30))(*(undefined8 *)(lVar5 + 0x3f0));
    return;
  }
  puVar1 = (ulong *)(lVar5 + 1000);
  uVar6 = *puVar1 + 0x7fffffffffffffef;
  if (0x15 < uVar6) {
    uVar6 = 0xb;
  }
  plVar8 = (long *)&UNK_00829c85;
  puVar10 = &UNK_00253d1c + (ulong)(byte)(&UNK_00829c85)[uVar6] * 4;
  switch(*puVar1) {
  case 0x8000000000000011:
    uVar15 = *(ulong *)(lVar5 + 0x400);
    uVar6 = uVar15 << 1;
    if ((long)(uVar6 | uVar15) < 0) {
code_r0x00254060:
      uVar13 = 0;
    }
    else {
      uVar11 = *(undefined8 *)(lVar5 + 0x3f8);
      if (uVar6 == 0) {
        uVar14 = 0;
        uVar4 = 1;
code_r0x00253f24:
        _memcpy(uVar4,uVar11,uVar6);
        extraout_x8[2] = uVar4;
        extraout_x8[3] = uVar15;
        *(undefined2 *)(extraout_x8 + 4) = *(undefined2 *)(lVar5 + 0x408);
        *extraout_x8 = 0x8000000000000011;
        extraout_x8[1] = uVar14;
        return;
      }
      uVar13 = 1;
      uVar4 = func_0x00187bd0(uVar6,1);
      if (uVar4 != 0) {
        uVar14 = uVar15;
        goto code_r0x00253f24;
      }
    }
    goto code_r0x00254064;
  case 0x8000000000000012:
    uVar15 = *(ulong *)(lVar5 + 0x400);
    uVar6 = uVar15 << 1;
    if ((long)(uVar6 | uVar15) < 0) goto code_r0x00254060;
    uVar11 = *(undefined8 *)(lVar5 + 0x3f8);
    if (uVar6 == 0) {
      uVar14 = 0;
      uVar4 = 1;
code_r0x00253f50:
      _memcpy(uVar4,uVar11,uVar6);
      extraout_x8[2] = uVar4;
      extraout_x8[3] = uVar15;
      *(undefined2 *)(extraout_x8 + 4) = *(undefined2 *)(lVar5 + 0x408);
      *extraout_x8 = 0x8000000000000012;
      extraout_x8[1] = uVar14;
      return;
    }
    uVar13 = 1;
    uVar4 = func_0x00187bd0(uVar6,1);
    if (uVar4 != 0) {
      uVar14 = uVar15;
      goto code_r0x00253f50;
    }
code_r0x00254064:
    func_0x007a1f00(uVar13,uVar6,&UNK_009c24c0);
code_r0x00254078:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x25407c);
    (*pcVar2)();
  case 0x8000000000000013:
    *(undefined1 *)(extraout_x8 + 1) = *(undefined1 *)(lVar5 + 0x3f0);
    uVar6 = 0x8000000000000013;
    break;
  case 0x8000000000000014:
  case 0x800000000000001b:
  case 0x8000000000000025:
    uVar6 = *puVar1;
    uVar14 = *(ulong *)(lVar5 + 0x400);
    uVar15 = *(ulong *)(lVar5 + 0x3f8);
    extraout_x8[1] = *(ulong *)(lVar5 + 0x3f0);
    *extraout_x8 = uVar6;
    extraout_x8[3] = uVar14;
    extraout_x8[2] = uVar15;
    uVar6 = *(ulong *)(lVar5 + 0x408);
    extraout_x8[5] = *(ulong *)(lVar5 + 0x410);
    extraout_x8[4] = uVar6;
    extraout_x8[6] = *(ulong *)(lVar5 + 0x418);
    return;
  case 0x8000000000000015:
    uVar6 = 0x8000000000000015;
    break;
  case 0x8000000000000016:
    uVar6 = 0x8000000000000016;
    break;
  case 0x8000000000000017:
    uVar6 = 0x8000000000000017;
    break;
  case 0x8000000000000018:
    uVar6 = 0x8000000000000018;
    break;
  case 0x8000000000000019:
    lVar3 = *(long *)(lVar5 + 0x3f0);
    plVar7 = (long *)0x8000000000000001;
    switch(lVar3) {
    case -0x7fffffffffffffff:
      break;
    case -0x7ffffffffffffffe:
      plVar7 = (long *)0x8000000000000002;
      break;
    case -0x7ffffffffffffffd:
      plVar7 = (long *)0x8000000000000003;
      break;
    case -0x7ffffffffffffffc:
      plVar7 = (long *)0x8000000000000004;
      break;
    case -0x7ffffffffffffffb:
      plVar7 = (long *)0x8000000000000005;
      break;
    case -0x7ffffffffffffffa:
      plVar7 = (long *)0x8000000000000006;
      break;
    case -0x7ffffffffffffff9:
      plVar7 = (long *)0x8000000000000007;
      break;
    case -0x7ffffffffffffff8:
      plVar7 = (long *)0x8000000000000008;
      break;
    case -0x7ffffffffffffff7:
      plVar7 = (long *)0x8000000000000009;
      break;
    case -0x7ffffffffffffff6:
      plVar7 = (long *)0x800000000000000a;
      break;
    case -0x7ffffffffffffff5:
      plVar7 = (long *)0x800000000000000b;
      break;
    case -0x7ffffffffffffff4:
      plVar7 = (long *)0x800000000000000c;
      break;
    case -0x7ffffffffffffff3:
      plVar7 = (long *)0x800000000000000d;
      break;
    case -0x7ffffffffffffff2:
      plVar7 = (long *)0x800000000000000e;
      break;
    case -0x7ffffffffffffff1:
      plVar7 = (long *)0x800000000000000f;
      break;
    case -0x7ffffffffffffff0:
      plVar7 = (long *)0x8000000000000010;
      break;
    case -0x7fffffffffffffef:
      plVar7 = (long *)0x8000000000000011;
      break;
    case -0x7fffffffffffffee:
      plVar7 = (long *)0x8000000000000012;
      break;
    case -0x7fffffffffffffed:
      plVar7 = (long *)0x8000000000000013;
      break;
    case -0x7fffffffffffffec:
      plVar7 = (long *)0x8000000000000014;
      break;
    case -0x7fffffffffffffeb:
      plVar7 = (long *)0x8000000000000015;
      break;
    default:
      plVar7 = (long *)0x8000000000000000;
      if (lVar3 != -0x8000000000000000) {
        func_0x001a24cc(&plStack_68,(long *)(lVar5 + 0x3f0),&UNK_009ca6e0);
        uStack_78 = uStack_58;
        uStack_80 = uStack_60;
        plVar7 = plStack_68;
      }
    }
    extraout_x8[3] = uStack_78;
    extraout_x8[2] = uStack_80;
    uVar6 = 0x8000000000000019;
    goto code_r0x00254058;
  case 0x800000000000001a:
    *(undefined1 *)(extraout_x8 + 1) = *(undefined1 *)(lVar5 + 0x3f0);
    uVar6 = 0x800000000000001a;
    break;
  default:
    uVar6 = 0x8000000000000005;
    switch(*puVar1 ^ 0x8000000000000000) {
    case 0:
      uVar6 = 0x8000000000000000;
      break;
    case 1:
      uVar6 = 0x8000000000000001;
      break;
    case 2:
    case 4:
    case 10:
      uVar6 = *puVar1;
      uVar14 = *(ulong *)(lVar5 + 0x400);
      uVar15 = *(ulong *)(lVar5 + 0x3f8);
      extraout_x8[1] = *(ulong *)(lVar5 + 0x3f0);
      *extraout_x8 = uVar6;
      extraout_x8[3] = uVar14;
      extraout_x8[2] = uVar15;
      uVar6 = *(ulong *)(lVar5 + 0x408);
      extraout_x8[5] = *(ulong *)(lVar5 + 0x410);
      extraout_x8[4] = uVar6;
      extraout_x8[6] = *(ulong *)(lVar5 + 0x418);
      return;
    case 3:
      uVar6 = 0x8000000000000003;
      break;
    case 5:
      break;
    case 6:
      uVar6 = 0x8000000000000006;
      break;
    case 7:
      uVar6 = 0x8000000000000007;
      break;
    case 8:
      uVar6 = 0x8000000000000008;
      break;
    case 9:
      uVar6 = 0x8000000000000009;
      break;
    case 0xb:
      uVar6 = 0x800000000000000b;
      break;
    case 0xc:
      uVar6 = 0x800000000000000c;
      break;
    default:
      bVar12 = *(byte *)(lVar5 + 0x400);
      if ((bVar12 & 1) == 0) {
        puVar9 = (ulong *)(lVar5 + 0x408);
        if (*puVar9 == 0x8000000000000000) {
          uStack_58 = *(ulong *)(lVar5 + 0x410);
          uStack_60 = *puVar9;
          unaff_x26 = *(ulong *)(lVar5 + 0x418);
        }
        else {
          func_0x0045cd08(&uStack_60,puVar9);
        }
        bVar12 = 0;
        puVar9 = &uStack_60;
        uVar6 = uStack_58;
      }
      else {
        uStack_80 = (ulong)CONCAT43(*(undefined4 *)(lVar5 + 0x404),
                                    (int3)*(undefined4 *)(lVar5 + 0x401));
        puVar9 = (ulong *)(lVar5 + 0x408);
        unaff_x26 = *(ulong *)(lVar5 + 0x418);
        uVar6 = *(ulong *)(lVar5 + 0x410);
      }
      uVar15 = *puVar9;
      func_0x001a2104(&uStack_78,puVar1,&UNK_009ca6f8);
      *(byte *)(extraout_x8 + 3) = bVar12;
      *(undefined4 *)((long)extraout_x8 + 0x19) = (undefined4)uStack_80;
      *(undefined4 *)((long)extraout_x8 + 0x1c) = uStack_80._3_4_;
      extraout_x8[4] = uVar15;
      extraout_x8[5] = uVar6;
      extraout_x8[6] = unaff_x26;
      extraout_x8[1] = uStack_70;
      *extraout_x8 = uStack_78;
      extraout_x8[2] = (ulong)plStack_68;
      return;
    case 0xe:
      uVar6 = 0x800000000000000e;
      break;
    case 0xf:
      uVar6 = 0x800000000000000f;
      break;
    case 0x10:
      plVar8 = *(long **)(lVar5 + 0x3f0);
      lVar3 = *plVar8;
      *plVar8 = lVar3 + 1;
      if (lVar3 < 0) {
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x254238);
        (*pcVar2)();
      }
      uVar6 = *(ulong *)(lVar5 + 0x3f8);
      extraout_x8[1] = (ulong)plVar8;
      extraout_x8[2] = uVar6;
      uVar6 = 0x8000000000000010;
    }
    *extraout_x8 = uVar6;
    return;
  case 0x800000000000001d:
    plVar7 = *(long **)(lVar5 + 0x3f0);
    if ((dword *)plVar7 == &MACH_HEADER.cputype) {
      plVar8 = *(long **)(lVar5 + 0x3f8);
      lVar3 = *plVar8;
      *plVar8 = lVar3 + 1;
      if (lVar3 < 0) goto code_r0x00254078;
      puVar10 = *(undefined **)(lVar5 + 0x400);
    }
    extraout_x8[2] = (ulong)plVar8;
    extraout_x8[3] = (ulong)puVar10;
    uVar6 = 0x800000000000001d;
code_r0x00254058:
    *extraout_x8 = uVar6;
    extraout_x8[1] = (ulong)plVar7;
    return;
  case 0x800000000000001e:
    func_0x0045cd08(extraout_x8 + 1,lVar5 + 0x3f0);
    *extraout_x8 = 0x800000000000001e;
    return;
  case 0x800000000000001f:
    uVar6 = 0x800000000000001f;
    break;
  case 0x8000000000000020:
    uVar6 = 0x8000000000000020;
    break;
  case 0x8000000000000021:
    uVar6 = 0x8000000000000021;
    break;
  case 0x8000000000000022:
    uVar6 = 0x8000000000000022;
    break;
  case 0x8000000000000023:
    uVar6 = 0x8000000000000023;
    break;
  case 0x8000000000000024:
    uVar6 = 0x8000000000000024;
    break;
  case 0x8000000000000026:
    plVar7 = *(long **)(lVar5 + 0x3f0);
    lVar3 = *plVar7;
    *plVar7 = lVar3 + 1;
    if (-1 < lVar3) {
      extraout_x8[2] = *(ulong *)(lVar5 + 0x3f8);
      uVar6 = 0x8000000000000026;
      goto code_r0x00254058;
    }
    goto code_r0x00254078;
  }
  *extraout_x8 = uVar6;
  return;
}

