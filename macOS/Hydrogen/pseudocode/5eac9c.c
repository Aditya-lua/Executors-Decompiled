
/* WARNING: Removing unreachable block (ram,0x005ead44) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005eac9c(long *param_1)

{
  undefined8 *puVar1;
  bool bVar2;
  code *pcVar3;
  ulong *puVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long in_xzr;
  undefined8 uStack0000000000000008;
  long *in_stack_00000010;
  byte bStack0000000000000018;
  undefined7 uStack0000000000000019;
  undefined8 uStack0000000000000038;
  
  puVar1 = (undefined8 *)(*param_1 + unaff_x24 * 0x10);
  *puVar1 = unaff_x19;
  puVar1[1] = unaff_x20;
  param_1[1] = unaff_x24 + 1;
  if ((((unaff_x21 & 1) == 0) && ((*unaff_x22 & 0x7fffffffffffffff) != 0)) &&
     (uVar6 = func_0x007a1140(), (uVar6 & 1) == 0)) {
    *(undefined1 *)(unaff_x23 + 0xa40) = 1;
  }
  func_0x00430048(uRam0000000000a2aa38);
  func_0x005e8a7c(&uStack0000000000000008,0xa2aa28);
  pcVar3 = *(code **)(unaff_x20 + 0x18);
  uStack0000000000000038 = (**(code **)(unaff_x20 + 0x20))();
  func_0x005e8df4(&uStack0000000000000008,&uStack0000000000000038);
  (*pcVar3)();
  plVar5 = in_stack_00000010;
  if (uStack0000000000000008 != 0) {
    if (uStack0000000000000008 == 1) {
      puVar4 = (ulong *)CONCAT71(uStack0000000000000019,bStack0000000000000018);
      uVar6 = *puVar4;
      do {
        while (((uint)uVar6 >> 1 & 1) != 0) {
          if (((uint)uVar6 >> 3 & 1) == 0) {
            func_0x007a1a98();
            return;
          }
          uVar7 = uVar6 & 0xfffffffffffffff6;
          bVar2 = *puVar4 == uVar6;
          uVar6 = *puVar4;
          if (bVar2) {
            *puVar4 = uVar7;
            return;
          }
        }
        uVar7 = 0;
        if (uVar6 - 0x11 != 0) {
          uVar7 = uVar6 - 0x11 | 1;
        }
        bVar2 = *puVar4 != uVar6;
        uVar6 = *puVar4;
      } while (bVar2);
      *puVar4 = uVar7;
    }
    else {
      if ((((bStack0000000000000018 & 1) == 0) &&
          ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
           0x7fffffffffffffff) != 0)) && (uVar6 = func_0x007a1140(), (uVar6 & 1) == 0)) {
        *(undefined1 *)(plVar5 + 1) = 1;
      }
      if (*plVar5 == 1) {
        *plVar5 = in_xzr;
      }
      else {
        func_0x007a1ae8(plVar5);
      }
    }
  }
  return;
}

