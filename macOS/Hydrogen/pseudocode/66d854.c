
void FUN_0066d854(code *param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  uint uVar7;
  ulong unaff_x22;
  ulong uVar8;
  undefined8 uStack0000000000000008;
  
  iVar2 = (*param_1)();
  uVar7 = (uint)unaff_x22;
  if (iVar2 == 0) {
    if (uVar7 == 0) {
      uVar3 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,
                      "StreamTransformationFilter: ciphertext length is not a multiple of block size"
                     );
      func_0x005f3d74(uVar3,&uStack0000000000000008);
      ___cxa_throw(uVar3,&DAT_009b6548,&DAT_005f3df4);
LAB_0066ddb8:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x66ddbc);
      (*pcVar1)();
    }
  }
  else if ((int)unaff_x19[0x18] == 1) {
    if (uVar7 == 0 || unaff_x20 < unaff_x22) {
      if (uVar7 <= *(uint *)((long)unaff_x19 + 0xc4)) {
        uVar7 = *(uint *)((long)unaff_x19 + 0xc4);
      }
      uVar8 = (ulong)uVar7;
      uVar3 = (**(code **)(*unaff_x19 + 0x160))();
      lVar4 = func_0x0066de50(unaff_x19 + 0x12,uVar3,&UNK_008ba5c8,uVar8);
      if (unaff_x21 != 0) {
        _memcpy(lVar4);
      }
      _bzero(lVar4 + unaff_x20,uVar8 - unaff_x20);
      uVar3 = (**(code **)(*(long *)unaff_x19[0x17] + 0x50))
                        ((long *)unaff_x19[0x17],lVar4,uVar8,lVar4,uVar8);
      plVar5 = (long *)(**(code **)(*unaff_x19 + 0x160))();
                    /* WARNING: Could not recover jumptable at 0x0066d930. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*plVar5 + 0x38))(plVar5,lVar4,uVar3,0,1);
      return;
    }
  }
  else if (uVar7 == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(&uStack0000000000000008,
                    "StreamTransformationFilter: plaintext length is not a multiple of block size and NO_PADDING is specified"
                   );
    func_0x0064d308(uVar3,&uStack0000000000000008);
    ___cxa_throw(uVar3,&UNK_009b6530,&DAT_0064d388);
    goto LAB_0066ddb8;
  }
  plVar5 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  uVar7 = *(uint *)(unaff_x19 + 0x19);
  uVar8 = (ulong)uVar7;
  if ((ulong)unaff_x19[0x15] < unaff_x20) {
    uStack0000000000000008 = unaff_x20;
    lVar4 = (**(code **)(*plVar5 + 0x128))(plVar5,&UNK_008ba5c8,&uStack0000000000000008);
    if (uStack0000000000000008 < unaff_x20) {
      uVar6 = unaff_x19[0x15];
      lVar4 = unaff_x19[0x16];
      if (uVar6 != uVar8) {
        if (lVar4 != 0) {
          if (uVar6 != 0) {
            do {
              *(undefined1 *)(lVar4 + -1 + uVar6) = 0;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          func_0x00611644(lVar4);
        }
        if (uVar7 == 0) {
          lVar4 = 0;
        }
        else {
          lVar4 = func_0x006115d0(uVar8);
        }
        unaff_x19[0x16] = lVar4;
      }
      unaff_x19[0x14] = -1;
      unaff_x19[0x15] = uVar8;
    }
  }
  else {
    lVar4 = unaff_x19[0x16];
  }
  uVar3 = (**(code **)(*(long *)unaff_x19[0x17] + 0x50))((long *)unaff_x19[0x17],lVar4);
  plVar5 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  (**(code **)(*plVar5 + 0x38))(plVar5,lVar4,uVar3,0,1);
  return;
}

