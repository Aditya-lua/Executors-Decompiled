
undefined8 * FUN_00674cf0(undefined8 *param_1,undefined8 *param_2)

{
  char *pcVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined4 uVar6;
  char cVar7;
  undefined8 *puVar8;
  undefined8 *unaff_x20;
  long unaff_x21;
  int unaff_w25;
  ulong unaff_x26;
  undefined8 uStack0000000000000008;
  ulong uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined3 uStack0000000000000038;
  undefined1 uStack000000000000003b;
  undefined3 uStack000000000000003c;
  
  if (unaff_x26 < 0x17) {
    uStack0000000000000008 = (undefined8 *)0x0;
    puVar8 = &uStack0000000000000008;
    uStack0000000000000018 = unaff_x26 << 0x38;
  }
  else {
    uVar3 = (unaff_x26 & 0xfffffffffffffff8) + 8;
    if ((unaff_x26 | 7) != 0x17) {
      uVar3 = unaff_x26 | 7;
    }
    puVar8 = (undefined8 *)__Znwm(uVar3 + 1);
    uStack0000000000000018 = uVar3 + 1 | 0x8000000000000000;
    uStack0000000000000008 = puVar8;
    if (unaff_x21 == 0) goto LAB_00674d60;
  }
  puVar2 = (undefined8 *)*param_2;
  if (-1 < unaff_w25) {
    puVar2 = param_2;
  }
  _memmove(puVar8,puVar2);
LAB_00674d60:
  pcVar1 = (char *)((long)puVar8 + unaff_x21);
  *(ulong *)(pcVar1 + 8) =
       CONCAT53(s___unexpected_channel_name___008e93c6._11_5_,
                s___unexpected_channel_name___008e93c6._8_3_);
  *(undefined8 *)pcVar1 = s___unexpected_channel_name___008e93c6._0_8_;
  *(undefined8 *)(pcVar1 + 0x13) = s___unexpected_channel_name___008e93c6._19_8_;
  *(ulong *)(pcVar1 + 0xb) =
       CONCAT35(s___unexpected_channel_name___008e93c6._16_3_,
                s___unexpected_channel_name___008e93c6._11_5_);
  pcVar1[0x1b] = '\0';
  uVar3 = unaff_x20[1];
  puVar8 = (undefined8 *)*unaff_x20;
  if (-1 < (char)*(byte *)((long)unaff_x20 + 0x17)) {
    uVar3 = (ulong)*(byte *)((long)unaff_x20 + 0x17);
    puVar8 = unaff_x20;
  }
  puVar8 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000008,puVar8,uVar3);
  in_stack_00000028 = puVar8[1];
  uStack0000000000000020 = *puVar8;
  in_stack_00000030 = puVar8[2];
  puVar8[1] = 0;
  puVar8[2] = 0;
  *puVar8 = 0;
  puVar8 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000020,"\"",1);
  uVar4 = *puVar8;
  uVar5 = puVar8[1];
  uVar6 = *(undefined4 *)((long)puVar8 + 0x13);
  uStack0000000000000038 = (undefined3)*(undefined4 *)(puVar8 + 2);
  uStack000000000000003b = (undefined1)uVar6;
  uStack000000000000003c = (undefined3)((uint)uVar6 >> 8);
  cVar7 = *(char *)((long)puVar8 + 0x17);
  puVar8[1] = 0;
  puVar8[2] = 0;
  *puVar8 = 0;
  *param_1 = &UNK_009b2ec8;
  *(undefined4 *)(param_1 + 1) = 1;
  if (cVar7 < '\0') {
    func_0x00017634(param_1 + 2,uVar4);
    *param_1 = &UNK_009b2f08;
    __ZdlPv(uVar4);
  }
  else {
    param_1[2] = uVar4;
    param_1[3] = uVar5;
    *(undefined4 *)(param_1 + 4) = _uStack0000000000000038;
    *(undefined4 *)((long)param_1 + 0x23) = uVar6;
    *(char *)((long)param_1 + 0x27) = cVar7;
    *param_1 = &UNK_009b2f08;
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((long)uStack0000000000000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  *param_1 = &UNK_00a0ef88;
  return param_1;
}

