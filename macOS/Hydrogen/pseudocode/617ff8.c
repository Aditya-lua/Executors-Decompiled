
void FUN_00617ff8(long param_1,undefined8 param_2)

{
  uint uVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  uint uVar7;
  undefined1 uStack0000000000000008;
  
  func_0x00618170(param_2,"BaseN_Decoder","DecodingLookupArray",param_1 + 0x30);
  func_0x00617be8(param_2,"BaseN_Decoder","Log2Base",param_1 + 0x38);
  if (*(int *)(param_1 + 0x38) - 8U < 0xfffffff9) {
    uVar5 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(&uStack0000000000000008,
                    "BaseN_Decoder: Log2Base must be between 1 and 7 inclusive");
    func_0x0002703c(uVar5,&uStack0000000000000008);
    ___cxa_throw(uVar5,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x618134);
    (*pcVar3)();
  }
  uVar7 = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  do {
    uVar7 = *(int *)(param_1 + 0x38) + uVar7;
  } while ((uVar7 & 7) != 0);
  uVar1 = uVar7 + 7;
  if (-1 < (int)uVar7) {
    uVar1 = uVar7;
  }
  *(int *)(param_1 + 0x3c) = (int)uVar1 >> 3;
  lVar2 = (long)((ulong)uVar1 << 0x20) >> 0x23;
  lVar6 = *(long *)(param_1 + 0x58);
  lVar4 = *(long *)(param_1 + 0x60);
  if (lVar6 != lVar2) {
    if (lVar4 != 0) {
      if (lVar6 != 0) {
        do {
          *(undefined1 *)(lVar4 + -1 + lVar6) = 0;
          lVar6 = lVar6 + -1;
        } while (lVar6 != 0);
      }
      func_0x00611644();
    }
    if (uVar7 + 7 < 0xf) {
      lVar4 = 0;
    }
    else {
      lVar4 = func_0x006115d0(lVar2);
    }
  }
  *(long *)(param_1 + 0x58) = lVar2;
  *(long *)(param_1 + 0x60) = lVar4;
  *(undefined8 *)(param_1 + 0x50) = 0xffffffffffffffff;
  return;
}

