
/* WARNING: Removing unreachable block (ram,0x0043cb84) */
/* WARNING: Removing unreachable block (ram,0x0043ca98) */
/* WARNING: Removing unreachable block (ram,0x0043caa0) */
/* WARNING: Removing unreachable block (ram,0x0043cacc) */
/* WARNING: Removing unreachable block (ram,0x0043cad4) */
/* WARNING: Removing unreachable block (ram,0x0043cadc) */
/* WARNING: Removing unreachable block (ram,0x0043caf8) */
/* WARNING: Removing unreachable block (ram,0x0043cb04) */
/* WARNING: Removing unreachable block (ram,0x0043cb10) */
/* WARNING: Removing unreachable block (ram,0x0043cb18) */
/* WARNING: Removing unreachable block (ram,0x0043cb20) */
/* WARNING: Removing unreachable block (ram,0x0043cb28) */
/* WARNING: Removing unreachable block (ram,0x0043cb2c) */
/* WARNING: Removing unreachable block (ram,0x0043cb30) */
/* WARNING: Removing unreachable block (ram,0x0043cb40) */
/* WARNING: Removing unreachable block (ram,0x0043cb70) */
/* WARNING: Removing unreachable block (ram,0x0043cb54) */
/* WARNING: Removing unreachable block (ram,0x0043cb6c) */
/* WARNING: Removing unreachable block (ram,0x0043cbcc) */
/* WARNING: Removing unreachable block (ram,0x0043cbe0) */
/* WARNING: Removing unreachable block (ram,0x0043cc04) */
/* WARNING: Removing unreachable block (ram,0x0043cf94) */
/* WARNING: Removing unreachable block (ram,0x0043cfd0) */
/* WARNING: Removing unreachable block (ram,0x0043cd0c) */
/* WARNING: Removing unreachable block (ram,0x0043cd1c) */
/* WARNING: Removing unreachable block (ram,0x0043cd34) */
/* WARNING: Removing unreachable block (ram,0x0043cd4c) */
/* WARNING: Removing unreachable block (ram,0x0043cd60) */
/* WARNING: Removing unreachable block (ram,0x0043cd68) */
/* WARNING: Removing unreachable block (ram,0x0043cd78) */
/* WARNING: Removing unreachable block (ram,0x0043cd88) */
/* WARNING: Removing unreachable block (ram,0x0043cd9c) */
/* WARNING: Removing unreachable block (ram,0x0043cda8) */
/* WARNING: Removing unreachable block (ram,0x0043cdd4) */
/* WARNING: Removing unreachable block (ram,0x0043ce20) */
/* WARNING: Removing unreachable block (ram,0x0043ce30) */
/* WARNING: Removing unreachable block (ram,0x0043ce64) */
/* WARNING: Removing unreachable block (ram,0x0043ce80) */
/* WARNING: Removing unreachable block (ram,0x0043ce90) */
/* WARNING: Removing unreachable block (ram,0x0043cec0) */
/* WARNING: Removing unreachable block (ram,0x0043ced0) */
/* WARNING: Removing unreachable block (ram,0x0043ced8) */
/* WARNING: Removing unreachable block (ram,0x0043cee8) */

void FUN_0043d288(void)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  long *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x26;
  long *unaff_x27;
  undefined1 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  long in_stack_00001320;
  long in_stack_00001328;
  long in_stack_00001330;
  long in_stack_00001338;
  long in_stack_00001340;
  long in_stack_00001348;
  long in_stack_00002258;
  undefined8 in_stack_00002268;
  long in_stack_00002270;
  ulong in_stack_00002278;
  ulong in_stack_00002280;
  undefined1 auStack_7ffffffe [2147483646];
  
  *(undefined1 *)(unaff_x26 + 0x38) = in_stack_00000008;
  do {
    uVar5 = unaff_x19;
    if (in_stack_00000030 <= uVar5) goto code_r0x0043cc70;
    func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,in_stack_00000030,
                    auStack_7ffffffe + 0x8000152e,unaff_x20,unaff_x23,
                    *(undefined1 *)(unaff_x26 + 0x38));
    unaff_x19 = in_stack_00000030;
  } while (((in_stack_00002258 == 2) || (unaff_x19 = uVar5, in_stack_00002270 != in_stack_00000028))
          || (iVar2 = _memcmp(in_stack_00002268,in_stack_00000018,in_stack_00000028), iVar2 != 0));
  if (in_stack_00002278 == 0) {
    in_stack_00002280 = 0;
    lVar3 = 1;
  }
  else {
    if ((in_stack_00000030 < in_stack_00002278) ||
       (in_stack_00000030 - in_stack_00002278 < in_stack_00002280)) goto code_r0x0043cc70;
    lVar3 = in_stack_00000038 + in_stack_00002278;
  }
  func_0x0043d660(auStack_7ffffffe + 0x80001526,lVar3,in_stack_00002280);
code_r0x0043cc70:
  func_0x003f7334(auStack_7ffffffe + 0x80001bee);
  _munmap(in_stack_00000038,in_stack_00000030);
  if ((*unaff_x22 != -0x7fffffffffffffff) && (*unaff_x22 != -0x8000000000000000)) {
    func_0x003f70a4();
    _munmap(unaff_x22[0x41],unaff_x22[0x42]);
    func_0x003f7334(unaff_x22 + 0x43);
  }
  *unaff_x22 = -0x8000000000000000;
  _memcpy(unaff_x22 + 1,auStack_7ffffffe + 0x800009ae,0x200);
  unaff_x22[0x41] = in_stack_00000038;
  unaff_x22[0x42] = in_stack_00000030;
  unaff_x22[0x44] = in_stack_00001328;
  unaff_x22[0x43] = in_stack_00001320;
  unaff_x22[0x46] = in_stack_00001338;
  unaff_x22[0x45] = in_stack_00001330;
  unaff_x22[0x48] = in_stack_00001348;
  unaff_x22[0x47] = in_stack_00001340;
  uVar5 = unaff_x27[1];
  if (uVar5 != 0) {
    lVar3 = *unaff_x27;
    if (uVar5 == 1) {
      uVar6 = 0;
    }
    else {
      uVar6 = 0;
      uVar7 = uVar5;
      do {
        uVar1 = (uVar7 >> 1) + uVar6;
        if (*(ulong *)(lVar3 + uVar1 * 0x18 + 0x10) <= unaff_x21) {
          uVar6 = uVar1;
        }
        uVar7 = uVar7 - (uVar7 >> 1);
      } while (1 < uVar7);
    }
    uVar7 = *(ulong *)(lVar3 + uVar6 * 0x18 + 0x10);
    if (uVar7 != unaff_x21) {
      if (uVar7 < unaff_x21) {
        uVar6 = uVar6 + 1;
      }
      if (uVar6 == 0) {
        return;
      }
      uVar6 = uVar6 - 1;
    }
    if (uVar6 < uVar5) {
      puVar4 = (undefined8 *)(lVar3 + uVar6 * 0x18);
      in_stack_00000058 = *puVar4;
      in_stack_00000060 = puVar4[1];
      uStack0000000000000050 = CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
}

