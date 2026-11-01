
void FUN_0007b9c8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5
                 )

{
  undefined4 *puVar1;
  uint uVar2;
  long *plVar3;
  ulong uVar4;
  int iVar5;
  byte bVar6;
  byte bVar7;
  undefined8 uVar8;
  code *UNRECOVERED_JUMPTABLE;
  undefined2 uVar9;
  uint in_w9;
  byte in_w10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  ulong unaff_x23;
  uint unaff_w24;
  long unaff_x26;
  uint unaff_w27;
  long unaff_x28;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000050;
  undefined1 uStack0000000000000058;
  
  uStack0000000000000010 = param_2;
  do {
    plVar3 = (long *)*unaff_x19;
    if ((in_w10 & 1) == 0) {
      plVar3 = unaff_x19;
    }
    bVar7 = *(byte *)((long)plVar3 + unaff_x23);
    uVar2 = unaff_w27 << 6;
    unaff_w27 = unaff_w24 >> (ulong)(*(byte *)(unaff_x28 + (ulong)bVar7) & 0x1f) & (uint)bVar7;
    if (in_w9 != 0) {
      unaff_w27 = bVar7 & 0x3f | uVar2;
    }
    bVar6 = *(byte *)((ulong)in_w9 * 0x10 + (ulong)(uint)*(byte *)(unaff_x28 + (ulong)bVar7) +
                      unaff_x28 + 0x100);
    in_w9 = (uint)bVar6;
    if (bVar6 == 1) {
      iVar5 = *(int *)(unaff_x20 + 0x4f);
      if (1 < iVar5 - 1U) {
        if (iVar5 != 0) {
          in_w9 = 1;
          goto LAB_0007b9dc;
        }
        uVar8 = ___cxa_allocate_exception(0x20);
        __ZNSt3__19to_stringEm(&uStack0000000000000040,unaff_x23);
        in_stack_00000038._7_1_ = 2;
        uStack0000000000000028._0_1_ = "0123456789ABCDEF"[bVar7 >> 4];
        uStack0000000000000028._2_1_ = 0;
        uStack0000000000000028._1_1_ = "0123456789ABCDEF"[(ulong)(uint)bVar7 & 0xf];
        func_0x0007c0e8(&uStack0000000000000058,"invalid UTF-8 byte at index ",
                        &uStack0000000000000040,": 0x",&uStack0000000000000028);
        func_0x00078d94(uVar8,0x13c,&uStack0000000000000058,0);
        ___cxa_throw(uVar8,&UNK_009b9410,&DAT_00078f60);
        goto LAB_0007bdec;
      }
      unaff_x23 = unaff_x23 - (param_1 != 0);
      if (iVar5 == 1) {
        puVar1 = (undefined4 *)(unaff_x22 + param_5);
        if (unaff_w21 == 0) {
          param_5 = param_5 + 3;
          *(undefined2 *)puVar1 = 0xbfef;
          *(undefined1 *)((long)puVar1 + 2) = 0xbd;
        }
        else {
          *puVar1 = (int)uStack0000000000000010;
          *(undefined2 *)(puVar1 + 1) = 0x6466;
          param_5 = param_5 + 6;
        }
        goto LAB_0007bb6c;
      }
LAB_0007b9d0:
      in_w9 = 0;
      param_1 = 0;
      unaff_x26 = param_5;
    }
    else if (bVar6 == 0) {
      switch(unaff_w27) {
      case 8:
        uVar9 = 0x625c;
        break;
      case 9:
        uVar9 = 0x745c;
        break;
      case 10:
        uVar9 = 0x6e5c;
        break;
      case 0xb:
      case 0xe:
      case 0xf:
      case 0x10:
      case 0x11:
      case 0x12:
      case 0x13:
      case 0x14:
      case 0x15:
      case 0x16:
      case 0x17:
      case 0x18:
      case 0x19:
      case 0x1a:
      case 0x1b:
      case 0x1c:
      case 0x1d:
      case 0x1e:
      case 0x1f:
      case 0x20:
      case 0x21:
LAB_0007bb04:
        uVar2 = 0;
        if (0x7e < unaff_w27) {
          uVar2 = unaff_w21;
        }
        if (unaff_w27 < 0x20 || uVar2 != 0) {
          if (unaff_w27 >> 0x10 == 0) {
            _snprintf(unaff_x22 + unaff_x26,7,"\\u%04x");
            param_5 = unaff_x26 + 6;
          }
          else {
            _snprintf(unaff_x22 + unaff_x26,0xd,"\\u%04x\\u%04x");
            param_5 = unaff_x26 + 0xc;
          }
        }
        else {
          param_5 = unaff_x26 + 1;
          *(undefined1 *)(unaff_x22 + unaff_x26) = *(undefined1 *)((long)plVar3 + unaff_x23);
        }
        goto LAB_0007bb6c;
      case 0xc:
        uVar9 = 0x665c;
        break;
      case 0xd:
        uVar9 = 0x725c;
        break;
      case 0x22:
        uVar9 = 0x225c;
        break;
      default:
        if (unaff_w27 != 0x5c) goto LAB_0007bb04;
        uVar9 = 0x5c5c;
      }
      *(undefined2 *)(unaff_x22 + unaff_x26) = uVar9;
      param_5 = unaff_x26 + 2;
LAB_0007bb6c:
      if (0xc < param_5 - 500U) goto LAB_0007b9d0;
      (**(code **)(*(long *)*unaff_x20 + 8))();
      in_w9 = 0;
      param_5 = 0;
      param_1 = 0;
      unaff_x26 = 0;
    }
    else {
      if ((unaff_w21 & 1) == 0) {
        *(undefined1 *)(unaff_x22 + unaff_x26) = *(undefined1 *)((long)plVar3 + unaff_x23);
        unaff_x26 = unaff_x26 + 1;
      }
      param_1 = param_1 + 1;
    }
LAB_0007b9dc:
    unaff_x23 = unaff_x23 + 1;
    in_w10 = (char)*(byte *)((long)unaff_x19 + 0x17) < '\0';
    uVar4 = unaff_x19[1];
    if (!(bool)in_w10) {
      uVar4 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
    }
  } while (unaff_x23 < uVar4);
  if (in_w9 == 0) {
    if (unaff_x26 == 0) {
      return;
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)*unaff_x20 + 8);
  }
  else {
    iVar5 = *(int *)(unaff_x20 + 0x4f);
    if (iVar5 == 1) {
      (**(code **)(*(long *)*unaff_x20 + 8))();
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)*unaff_x20 + 8);
    }
    else {
      if (iVar5 != 2) {
        if (iVar5 != 0) {
          return;
        }
        uVar8 = ___cxa_allocate_exception(0x20);
        uVar4 = unaff_x19[1];
        plVar3 = (long *)*unaff_x19;
        if (-1 < (char)*(byte *)((long)unaff_x19 + 0x17)) {
          uVar4 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
          plVar3 = unaff_x19;
        }
        bVar7 = *(byte *)((long)plVar3 + (uVar4 - 1));
        in_stack_00000050._7_1_ = 2;
        uStack0000000000000040._0_1_ = "0123456789ABCDEF"[bVar7 >> 4];
        uStack0000000000000040._2_1_ = 0;
        uStack0000000000000040._1_1_ = "0123456789ABCDEF"[(ulong)bVar7 & 0xf];
        func_0x0007c20c(&uStack0000000000000058,"incomplete UTF-8 string; last byte: 0x",
                        &uStack0000000000000040);
        func_0x00078d94(uVar8,0x13c,&uStack0000000000000058,0);
        ___cxa_throw(uVar8,&UNK_009b9410,&DAT_00078f60);
LAB_0007bdec:
                    /* WARNING: Does not return */
        UNRECOVERED_JUMPTABLE = (code *)SoftwareBreakpoint(1,0x7bdf0);
        (*UNRECOVERED_JUMPTABLE)();
      }
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)*unaff_x20 + 8);
    }
  }
                    /* WARNING: Could not recover jumptable at 0x0007bc18. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}

