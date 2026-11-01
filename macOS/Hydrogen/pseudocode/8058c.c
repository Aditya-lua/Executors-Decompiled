
void FUN_0008058c(undefined8 param_1)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  uint unaff_w20;
  char *pcVar4;
  long unaff_x21;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(param_1,0x20);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  if (in_stack_00000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar1 = *(uint *)(unaff_x21 + 0x20);
  if (uVar1 == 0xe) {
    uStack0000000000000020 = *(undefined8 *)(unaff_x21 + 0x90);
    func_0x000801a4(&uStack0000000000000008,unaff_x21 + 0x28);
    uStack0000000000000000._7_1_ = 0x27;
    func_0x00084e40(&uStack0000000000000028,&uStack0000000000000020,"; last read: \'",
                    &uStack0000000000000008,(long)&uStack0000000000000000 + 7);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (in_stack_00000038 < 0) {
      __ZdlPv(uStack0000000000000028);
    }
    if (-1 < in_stack_00000018._7_1_) goto LAB_00080708;
    uVar3 = uStack0000000000000008;
  }
  else {
    if (uVar1 < 0x11) {
      pcVar4 = *(char **)(&UNK_009ba020 + (long)(int)uVar1 * 8);
    }
    else {
      pcVar4 = "unknown token";
    }
    uStack0000000000000028 = 0;
    in_stack_00000030 = 0;
    in_stack_00000038 = 0;
    lVar2 = _strlen(pcVar4);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
              (&uStack0000000000000028,lVar2 + 0xb);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000028,"unexpected ",0xb);
    uVar3 = _strlen(pcVar4);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000028,pcVar4,uVar3);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (-1 < in_stack_00000038) goto LAB_00080708;
    uVar3 = uStack0000000000000028;
  }
  __ZdlPv(uVar3);
LAB_00080708:
  if (unaff_w20 != 0) {
    if (unaff_w20 < 0x11) {
      pcVar4 = *(char **)(&UNK_009ba0a8 + (long)(int)(unaff_w20 - 1) * 8);
    }
    else {
      pcVar4 = "unknown token";
    }
    uStack0000000000000028 = 0;
    in_stack_00000030 = 0;
    in_stack_00000038 = 0;
    lVar2 = _strlen(pcVar4);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
              (&uStack0000000000000028,lVar2 + 0xb);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000028,"; expected ",0xb);
    uVar3 = _strlen(pcVar4);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000028,pcVar4,uVar3);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    if (in_stack_00000038 < 0) {
      __ZdlPv(uStack0000000000000028);
      return;
    }
  }
  return;
}

