
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_006dd980(void)

{
  char cVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong unaff_x19;
  long unaff_x20;
  long *plVar7;
  ulong unaff_x21;
  ulong unaff_x23;
  ulong *puVar8;
  undefined4 uStack0000000000000000;
  long in_stack_00000018;
  
  if (in_stack_00000018 < 0) {
    if (unaff_x23 != 0) {
LAB_006dd9d4:
      plVar7 = *(long **)(unaff_x20 + 8);
      lVar2 = plVar7[1];
      if ((ulong)(lVar2 * 3) >> 2 <= (ulong)plVar7[2]) {
        if ((plVar7[2] != 0) && (plVar7[3] != unaff_x19)) {
          uVar3 = 0;
          uVar5 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
          do {
            uVar5 = uVar5 & lVar2 - 1U;
            uVar6 = *(ulong *)(*plVar7 + uVar5 * 0x20);
            if (uVar6 == unaff_x19) goto LAB_006dda40;
            uVar3 = uVar3 + 1;
            uVar5 = uVar3 + uVar5;
          } while (uVar6 != plVar7[3] && uVar3 <= lVar2 - 1U);
        }
        func_0x006df034(plVar7);
        lVar2 = plVar7[1];
      }
LAB_006dda40:
      uVar3 = 0;
      uVar5 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
      lVar4 = *plVar7;
      while( true ) {
        uVar5 = uVar5 & lVar2 - 1U;
        uVar6 = *(ulong *)(lVar4 + uVar5 * 0x20);
        if (uVar6 == plVar7[3]) {
          puVar8 = (ulong *)(lVar4 + uVar5 * 0x20);
          *puVar8 = unaff_x19;
          plVar7[2] = plVar7[2] + 1;
          cVar1 = *(char *)((long)puVar8 + 0x1f);
          goto joined_r0x006ddaf8;
        }
        if (uVar6 == unaff_x19) break;
        uVar3 = uVar3 + 1;
        uVar5 = uVar3 + uVar5;
        if (lVar2 - 1U < uVar3) {
          puVar8 = (ulong *)0x0;
          cVar1 = MACH_HEADER.reserved._3_1_;
joined_r0x006ddaf8:
          if (cVar1 < '\0') {
            __ZdlPv(puVar8[1]);
          }
          puVar8[1] = unaff_x21;
          puVar8[2] = unaff_x23;
          *(undefined4 *)(puVar8 + 3) = uStack0000000000000000;
          *(int *)((long)puVar8 + 0x1b) = (int)((ulong)_uStack0000000000000000 >> 0x18);
          *(char *)((long)puVar8 + 0x1f) = in_stack_00000018._7_1_;
          return 1;
        }
      }
      puVar8 = (ulong *)(lVar4 + uVar5 * 0x20);
      cVar1 = *(char *)((long)puVar8 + 0x1f);
      goto joined_r0x006ddaf8;
    }
  }
  else if (in_stack_00000018._7_1_ != '\0') goto LAB_006dd9d4;
  if (in_stack_00000018 < 0) {
    __ZdlPv();
  }
  return 1;
}

