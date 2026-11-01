
void FUN_006745ec(long param_1)

{
  char *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  int unaff_w24;
  ulong unaff_x25;
  
  uVar7 = param_1 + 8;
  if ((unaff_x25 | 7) != 0x17) {
    uVar7 = unaff_x25 | 7;
  }
  lVar6 = __Znwm(uVar7 + 1);
  uVar7 = uVar7 + 1 | 0x8000000000000000;
  if (unaff_x20 != 0) {
    puVar2 = (undefined8 *)*unaff_x21;
    if (-1 < unaff_w24) {
      puVar2 = unaff_x21;
    }
    _memmove(lVar6,puVar2);
  }
  uVar5 = s___Nonblocking_input_is_not_imple_008e92fe._24_8_;
  uVar4 = s___Nonblocking_input_is_not_imple_008e92fe._16_8_;
  uVar3 = s___Nonblocking_input_is_not_imple_008e92fe._0_8_;
  pcVar1 = (char *)(lVar6 + unaff_x20);
  *(undefined8 *)(pcVar1 + 8) = s___Nonblocking_input_is_not_imple_008e92fe._8_8_;
  *(undefined8 *)pcVar1 = uVar3;
  *(undefined8 *)(pcVar1 + 0x18) = uVar5;
  *(undefined8 *)(pcVar1 + 0x10) = uVar4;
  uVar3 = s___Nonblocking_input_is_not_imple_008e92fe._32_8_;
  *(ulong *)(pcVar1 + 0x28) =
       CONCAT26(s___Nonblocking_input_is_not_imple_008e92fe._46_2_,
                s___Nonblocking_input_is_not_imple_008e92fe._40_6_);
  *(undefined8 *)(pcVar1 + 0x20) = uVar3;
  *(ulong *)(pcVar1 + 0x2e) =
       CONCAT62(s___Nonblocking_input_is_not_imple_008e92fe._48_6_,
                s___Nonblocking_input_is_not_imple_008e92fe._46_2_);
  pcVar1[0x36] = '\0';
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  if ((long)uVar7 < 0) {
    func_0x00017634(unaff_x19 + 2,lVar6,unaff_x25);
    *unaff_x19 = &UNK_009b2ea0;
    __ZdlPv(lVar6);
  }
  else {
    unaff_x19[3] = unaff_x25;
    unaff_x19[2] = lVar6;
    unaff_x19[4] = uVar7;
    *unaff_x19 = &UNK_009b2ea0;
  }
  *unaff_x19 = &UNK_00a0ed40;
  return;
}

