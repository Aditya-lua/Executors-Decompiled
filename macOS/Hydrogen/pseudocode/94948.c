
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00094948(undefined8 param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  char *pcVar6;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  long lVar7;
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x26;
  undefined8 unaff_x28;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  char *in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined *in_stack_00000018;
  undefined *in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 uStack0000000000000048;
  undefined8 *in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined *in_stack_00000060;
  undefined *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  
  while( true ) {
    _objc_alloc(param_1);
    uVar3 = func_0x007b6b40(0,0,0x4072c00000000000,0x4038000000000000);
    auVar9 = _objc_alloc(*(undefined8 *)(unaff_x26 + 0x510));
    puVar1 = (undefined8 *)*unaff_x20;
    if (-1 < *(char *)((long)unaff_x20 + 0x17)) {
      puVar1 = unaff_x20;
    }
    auVar9 = func_0x007b6bc0(auVar9._0_8_,auVar9._8_8_,puVar1);
    func_0x007b7b60(uVar3,auVar9._8_8_,auVar9._0_8_);
    func_0x007b74a0(unaff_x28,extraout_x1_02,uVar3);
    func_0x007b6d60(unaff_x28);
    auVar9 = func_0x007b7f20(unaff_x28);
    func_0x007b6ec0(auVar9._0_8_,auVar9._8_8_,0);
    func_0x007b7e80(unaff_x19);
    func_0x007b6ea0(auVar9._0_8_,extraout_x1_03,uVar3);
    func_0x007b7460(uVar3,extraout_x1_04,0);
    lVar4 = func_0x007b73c0(unaff_x28);
    if (lVar4 != 0x3ea) break;
    uVar3 = func_0x007b6a80(uRam0000000000a274e8);
    func_0x007b6560();
    func_0x007b7b40(uVar3);
    uVar3 = func_0x007b7cc0(uRam0000000000a27520);
    auVar9 = func_0x007b60e0(uRam0000000000a27528);
    func_0x007b70a0(uVar3,auVar9._8_8_,auVar9._0_8_);
    uVar5 = func_0x007b6ca0(uRam0000000000a274f8);
    if ((uVar5 & 1) == 0) {
      in_stack_00000028 = &uStack0000000000000048;
      uStack0000000000000048 = 0;
      in_stack_00000058 = _UNK_0080be48;
      in_stack_00000060 = &DAT_00094c10;
      in_stack_00000068 = &DAT_00094c2c;
      in_stack_00000078 = 0;
      in_stack_00000070 = 0;
      in_stack_00000088 = 0;
      in_stack_00000080 = 0;
      uStack0000000000000008 = PTR___NSConcreteStackBlock_009b0030;
      in_stack_00000010 = _UNK_0080be50;
      in_stack_00000018 = &DAT_00094c40;
      in_stack_00000020 = &UNK_009ba450;
      in_stack_00000050 = in_stack_00000028;
      _dispatch_sync(PTR___dispatch_main_q_009b0208,&uStack0000000000000008);
      if (*(char *)((long)in_stack_00000050 + 0x47) < '\0') {
        func_0x00017634(in_stack_00000000,in_stack_00000050[6],in_stack_00000050[7]);
      }
      else {
        uVar8 = in_stack_00000050[7];
        uVar3 = in_stack_00000050[6];
        *(undefined8 *)(in_stack_00000000 + 0x10) = in_stack_00000050[8];
        *(undefined8 *)(in_stack_00000000 + 8) = uVar8;
        *(undefined8 *)in_stack_00000000 = uVar3;
      }
      __Block_object_dispose(&uStack0000000000000048,8);
      if (in_stack_00000088 < 0) {
        __ZdlPv(in_stack_00000078);
      }
      return;
    }
    auVar9 = func_0x007b7ca0(uRam0000000000a27500);
    unaff_x19 = auVar9._0_8_;
    func_0x007b61e0(unaff_x19,auVar9._8_8_,1);
    unaff_x28 = _objc_alloc_init(uRam0000000000a27508);
    auVar9 = _objc_alloc(*(undefined8 *)(unaff_x26 + 0x510));
    puVar1 = (undefined8 *)*unaff_x22;
    if (-1 < *(char *)((long)unaff_x22 + 0x17)) {
      puVar1 = unaff_x22;
    }
    auVar9 = func_0x007b6bc0(auVar9._0_8_,auVar9._8_8_,puVar1);
    func_0x007b78c0(unaff_x28,auVar9._8_8_,auVar9._0_8_);
    auVar9 = _objc_alloc(*(undefined8 *)(unaff_x26 + 0x510));
    puVar1 = (undefined8 *)*unaff_x21;
    if (-1 < *(char *)((long)unaff_x21 + 0x17)) {
      puVar1 = unaff_x21;
    }
    auVar9 = func_0x007b6bc0(auVar9._0_8_,auVar9._8_8_,puVar1);
    func_0x007b7820(unaff_x28,auVar9._8_8_,auVar9._0_8_);
    func_0x007b6200(unaff_x28,extraout_x1,0xa207b0);
    func_0x007b6200(unaff_x28,extraout_x1_00,0xa207d0);
    func_0x007b6200(unaff_x28,extraout_x1_01,0xa207f0);
    param_1 = uRam0000000000a27518;
  }
  if (lVar4 != 1000) {
    in_stack_00000000[0x17] = '\t';
    in_stack_00000000[8] = 'd';
    in_stack_00000000[9] = '\0';
    *(undefined8 *)in_stack_00000000 = s_cancelled_008d39bc._0_8_;
    return;
  }
  func_0x007b7d60(uVar3);
  uVar3 = func_0x007b6100();
  uVar5 = _strlen();
  if (0x7ffffffffffffff7 < uVar5) {
    uVar3 = func_0x0001748c(in_stack_00000000);
    __Block_object_dispose(&uStack0000000000000048,8);
    if (in_stack_00000088 < 0) {
      __ZdlPv(in_stack_00000078);
    }
    auVar9 = __Unwind_Resume(uVar3);
    lVar7 = auVar9._8_8_;
    lVar4 = auVar9._0_8_;
    uVar8 = *(undefined8 *)(lVar7 + 0x38);
    uVar3 = *(undefined8 *)(lVar7 + 0x30);
    *(undefined8 *)(lVar4 + 0x40) = *(undefined8 *)(lVar7 + 0x40);
    *(undefined8 *)(lVar4 + 0x38) = uVar8;
    *(undefined8 *)(lVar4 + 0x30) = uVar3;
    *(undefined8 *)(lVar7 + 0x38) = 0;
    *(undefined8 *)(lVar7 + 0x40) = 0;
    *(undefined8 *)(lVar7 + 0x30) = 0;
    return;
  }
  if (uVar5 < 0x17) {
    in_stack_00000000[0x17] = (char)uVar5;
    pcVar6 = in_stack_00000000;
    if (uVar5 == 0) goto code_r0x00094bbc;
  }
  else {
    uVar2 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar2 = uVar5 | 7;
    }
    pcVar6 = (char *)__Znwm(uVar2 + 1);
    *(ulong *)(in_stack_00000000 + 8) = uVar5;
    *(ulong *)(in_stack_00000000 + 0x10) = uVar2 + 1 | 0x8000000000000000;
    *(char **)in_stack_00000000 = pcVar6;
  }
  _memmove(pcVar6,uVar3,uVar5);
  in_stack_00000000 = pcVar6;
code_r0x00094bbc:
  in_stack_00000000[uVar5] = '\0';
  return;
}

