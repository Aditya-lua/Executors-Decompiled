
/* WARNING: Removing unreachable block (ram,0x00436284) */

ulong FUN_00436288(code *param_1)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  long *plVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar6;
  ulong uVar7;
  undefined8 unaff_x22;
  long lVar8;
  undefined8 unaff_x23;
  undefined8 *puVar9;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined *in_stack_00000078;
  long in_stack_00000080;
  undefined1 auStack_38 [24];
  
  uVar3 = (*param_1)(unaff_x22,&UNK_008884c0,4);
  if ((uVar3 & 1) == 0) {
    while( true ) {
      func_0x0045b558(unaff_x29 + -0x90,unaff_x24,unaff_x25);
      *(long *)(unaff_x29 + -0x70) = unaff_x29 + -0x90;
      *(undefined **)(unaff_x29 + -0x68) = &DAT_0040b454;
      uStack0000000000000070 = (undefined8 *)&UNK_009dbe38;
      in_stack_00000078 = (undefined *)0x2;
      in_stack_00000080 = unaff_x29 + -0x70;
      iVar2 = func_0x0046849c(unaff_x22,unaff_x23,&uStack0000000000000070);
      uVar3 = *(ulong *)(unaff_x29 + -0x90);
      if (iVar2 != 0) break;
      if ((uVar3 | 0x8000000000000000) != unaff_x27) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x88),uVar3,1);
      }
      do {
        auVar10 = func_0x003f3480(&uStack0000000000000018);
        lVar8 = auVar10._0_8_;
        if (lVar8 == 0) {
          uStack0000000000000018 = (undefined *)(ulong)(unaff_x26 != 0);
          in_stack_00000020 = 0;
          auVar10 = func_0x003f3480(&uStack0000000000000018);
          if (auVar10._0_8_ == 0) goto code_r0x004363fc;
          goto code_r0x00436394;
        }
      } while (*auVar10._8_8_ != unaff_x27);
      unaff_x24 = *(undefined8 *)(lVar8 + 8);
      unaff_x25 = *(undefined8 *)(lVar8 + 0x10);
      unaff_x22 = *unaff_x20;
      unaff_x23 = unaff_x20[1];
    }
    if ((uVar3 | 0x8000000000000000) != 0x8000000000000000) {
      uVar4 = *(undefined8 *)(unaff_x29 + -0x88);
code_r0x004364e4:
      func_0x00187bd4(uVar4,uVar3,1);
    }
  }
  return 1;
code_r0x00436394:
  do {
    plVar5 = auVar10._8_8_;
    if (*plVar5 != -0x8000000000000000) {
      uStack0000000000000060 = plVar5[1];
      in_stack_00000068 = plVar5[2];
      func_0x0045b558(unaff_x29 + -0x70,*(undefined8 *)(auVar10._0_8_ + 8),
                      *(undefined8 *)(auVar10._0_8_ + 0x10));
      *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x70;
      *(undefined **)(unaff_x29 + -0x88) = &DAT_0040b454;
      *(undefined8 **)(unaff_x29 + -0x80) = &uStack0000000000000060;
      *(undefined **)(unaff_x29 + -0x78) =
           &
           __ZN62__LT_std__ffi__os_str__Display_u20_as_u20_core__fmt__Debug_GT_3fmt17h69fc2bfe17cef155E
      ;
      uStack0000000000000070 = (undefined8 *)&UNK_009dbea0;
      in_stack_00000078 = (undefined *)0x3;
      in_stack_00000080 = unaff_x29 + -0x90;
      iVar2 = func_0x0046849c(*unaff_x20,unaff_x20[1],&uStack0000000000000070);
      uVar3 = *(ulong *)(unaff_x29 + -0x70);
      if (iVar2 != 0) {
        if ((uVar3 | 0x8000000000000000) == 0x8000000000000000) {
          return 1;
        }
        uVar4 = *(undefined8 *)(unaff_x29 + -0x68);
        goto code_r0x004364e4;
      }
      if ((uVar3 | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68),uVar3,1);
      }
    }
    auVar10 = func_0x003f3480(&uStack0000000000000018);
  } while (auVar10._0_8_ != 0);
code_r0x004363fc:
  lVar8 = *(long *)(unaff_x19 + 0x10);
  if (lVar8 == 0) {
    uVar4 = func_0x007a2570(0,0,&UNK_009dbe58);
    if ((*(ulong *)(unaff_x29 + -0x90) | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x88),*(ulong *)(unaff_x29 + -0x90),1);
    }
    auVar10 = __Unwind_Resume(uVar4);
    func_0x00469960(auStack_38,auVar10._8_8_,&UNK_008849b0,0x10);
    func_0x004656a8(auStack_38,auVar10._0_8_,&UNK_009dbfd0);
    uVar3 = func_0x004658b0();
    return uVar3;
  }
  puVar9 = *(undefined8 **)(unaff_x19 + 8);
  if (*(long *)(unaff_x19 + 0xa0) == puVar9[1]) {
    iVar2 = _memcmp(*(undefined8 *)(unaff_x19 + 0x98),*puVar9);
    uVar4 = *unaff_x20;
    uVar6 = unaff_x20[1];
    if (iVar2 == 0) goto code_r0x00436478;
  }
  else {
    uVar4 = *unaff_x20;
    uVar6 = unaff_x20[1];
  }
  in_stack_00000078 =
       &
       __ZN63__LT_alloc__ffi__c_str__CString_u20_as_u20_core__fmt__Debug_GT_3fmt17h929e693e91dc938dE
  ;
  uStack0000000000000018 = &UNK_009dbe70;
  in_stack_00000020 = 2;
  uStack0000000000000070 = (undefined8 *)(unaff_x19 + 0x98);
  uVar3 = func_0x0046849c(uVar4,uVar6,&uStack0000000000000018);
  if ((uVar3 & 1) != 0) {
    return 1;
  }
code_r0x00436478:
  in_stack_00000078 =
       &
       __ZN63__LT_alloc__ffi__c_str__CString_u20_as_u20_core__fmt__Debug_GT_3fmt17h929e693e91dc938dE
  ;
  uVar7 = 1;
  uStack0000000000000018 = &UNK_007fc120;
  in_stack_00000020 = 1;
  uStack0000000000000070 = puVar9;
  uVar3 = func_0x0046849c(uVar4,uVar6,&uStack0000000000000018);
  if ((uVar3 & 1) == 0) {
    lVar8 = lVar8 * 0x10;
    if (lVar8 == 0x10) {
      uVar7 = 0;
    }
    else {
      lVar8 = lVar8 + -0x20;
      do {
        puVar9 = puVar9 + 2;
        *(undefined8 **)(unaff_x29 + -0x90) = puVar9;
        in_stack_00000078 = &DAT_003f3f90;
        uStack0000000000000018 = &UNK_009dbe90;
        in_stack_00000020 = 1;
        uStack0000000000000070 = (undefined8 *)(unaff_x29 + -0x90);
        uVar7 = func_0x0046849c(uVar4,uVar6,&uStack0000000000000018);
        if ((uVar7 & 1) != 0) {
          return uVar7;
        }
        bVar1 = lVar8 != 0;
        lVar8 = lVar8 + -0x10;
      } while (bVar1);
    }
  }
  return uVar7;
}

