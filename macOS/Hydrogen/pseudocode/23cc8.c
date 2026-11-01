
void FUN_00023cc8(void)

{
  long lVar1;
  ulong uVar2;
  byte bVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *puVar7;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  
  _memcpy();
  *(undefined4 *)(unaff_x21 + unaff_x20) = 0;
  uVar2 = in_stack_00000010;
  puVar4 = uStack0000000000000008;
  if (-1 < (char)in_stack_00000018._7_1_) {
    uVar2 = (ulong)in_stack_00000018._7_1_;
    puVar4 = &uStack0000000000000008;
  }
  bVar3 = *(byte *)((long)unaff_x19 + 0x17);
  uVar5 = (ulong)bVar3;
  if ((char)bVar3 < '\0') {
    uVar5 = unaff_x19[1];
    uVar6 = ((unaff_x19[2] & 0x7fffffffffffffff) - 1) - uVar5;
  }
  else {
    uVar6 = 4 - uVar5;
  }
  if (uVar6 < uVar2) {
    __ZNSt3__112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE21__grow_by_and_replaceEmmmmmmPKw
              ();
  }
  else if (uVar2 != 0) {
    puVar7 = unaff_x19;
    if ((char)bVar3 < '\0') {
      puVar7 = (undefined8 *)*unaff_x19;
    }
    _memmove((long)puVar7 + uVar5 * 4,puVar4,uVar2 << 2);
    lVar1 = uVar5 + uVar2;
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      unaff_x19[1] = lVar1;
      *(undefined4 *)((long)puVar7 + lVar1 * 4) = 0;
    }
    else {
      *(byte *)((long)unaff_x19 + 0x17) = (byte)lVar1 & 0x7f;
      *(undefined4 *)((long)puVar7 + lVar1 * 4) = 0;
    }
  }
  if ((char)in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  return;
}

