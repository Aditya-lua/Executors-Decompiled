
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_007a04cc(ulong param_1,long param_2,undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  uint *puVar6;
  ulong uVar7;
  ulong *puVar8;
  undefined8 extraout_x8;
  code *extraout_x9;
  long extraout_x12;
  ulong *unaff_x19;
  long *plVar9;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 uStack_70;
  undefined8 uStack_68;
  long *plStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  ulong uStack_40;
  
  if (param_1 - *(long *)(param_2 + 0x10) < param_4) {
    puVar4 = (undefined8 *)func_0x004182bc();
    if (puVar4 != (undefined8 *)0x0) {
      return puVar4;
    }
    param_1 = *unaff_x19;
  }
  if (unaff_x20 < param_1) {
    uVar7 = unaff_x19[2];
    _memcpy(unaff_x19[1] + uVar7);
    puVar5 = (undefined8 *)0x0;
    unaff_x19[2] = uVar7 + unaff_x20;
  }
  else {
    *(undefined1 *)(unaff_x19 + 3) = 1;
    if (unaff_x20 != 0) {
      puVar4 = (undefined8 *)&UNK_009da470;
      do {
        while( true ) {
          uVar7 = unaff_x20;
          if (0x7ffffffd < unaff_x20) {
            uVar7 = 0x7ffffffe;
          }
          uVar7 = _write(1,unaff_x21,uVar7);
          if (uVar7 == 0xffffffffffffffff) break;
          if (uVar7 == 0) goto code_r0x007a0588;
          uVar1 = unaff_x20 - uVar7;
          if (unaff_x20 < uVar7) {
            func_0x007a28a4(uVar7,unaff_x20,&UNK_009da7a0);
            func_0x007a11dc();
            func_0x007a144c();
            uStack_40 = unaff_x20;
            puVar8 = (ulong *)(*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)();
            uVar7 = *puVar8;
            if (uVar7 < 3) {
              if (uVar7 != 2) {
                plVar9 = (long *)func_0x007a0174();
                goto code_r0x007a06a0;
              }
              plVar9 = (long *)(*___ZN3std6thread7current2id2ID17h9e3d174fd3d40978E)
                                         (&__ZN3std6thread7current2id2ID17h9e3d174fd3d40978E);
              lVar3 = *plVar9;
              if (lVar3 != 0) {
code_r0x007a068c:
                uStack_70 = 0x8000000000000000;
                plVar9 = (long *)func_0x00412b1c(lVar3,&uStack_70);
                goto code_r0x007a06a0;
              }
              if (lRam0000000000a3bfe0 != -1) {
                lRam0000000000a3bfe0 = lRam0000000000a3bfe0 + 1;
                plVar9 = (long *)(*extraout_x9)(extraout_x8);
                *plVar9 = extraout_x12;
                lVar3 = extraout_x12;
                goto code_r0x007a068c;
              }
              func_0x007a0378();
            }
            else {
              plVar9 = (long *)(uVar7 - 0x10);
              lVar3 = *plVar9;
              *plVar9 = lVar3 + 1;
              if (lVar3 < 0) goto code_r0x007a0624;
code_r0x007a06a0:
              uStack_68 = 1;
              uStack_70 = 1;
              uStack_58 = 0;
              uStack_50 = 0;
              plStack_60 = plVar9;
              uStack_48 = (*
                          ___ZN3std4sync4mpmc5waker17current_thread_id5DUMMY29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h77a1ba387093e9e3E
                          )();
              puVar4 = (undefined8 *)func_0x00187bd0(0x30,8);
              if (puVar4 != (undefined8 *)0x0) {
                puVar4[1] = uStack_68;
                *puVar4 = uStack_70;
                puVar4[3] = uStack_58;
                puVar4[2] = plStack_60;
                puVar4[5] = uStack_48;
                puVar4[4] = uStack_50;
                return puVar4;
              }
            }
            func_0x007a1f18(8,0x30);
code_r0x007a0624:
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x7a0628);
            (*pcVar2)();
          }
          unaff_x21 = unaff_x21 + uVar7;
          unaff_x20 = uVar1;
          if (uVar1 == 0) goto LAB_007a0584;
        }
        puVar6 = (uint *)___error();
        if (*puVar6 != 4) {
          puVar4 = (undefined8 *)((ulong)*puVar6 << 0x20 | 2);
          goto code_r0x007a0588;
        }
      } while (unaff_x20 != 0);
    }
LAB_007a0584:
    puVar4 = (undefined8 *)0x0;
code_r0x007a0588:
    puVar5 = (undefined8 *)0x0;
    if (((ulong)puVar4 & 0xffffffff00000003) != 0x900000002) {
      puVar5 = puVar4;
    }
    *(undefined1 *)(unaff_x19 + 3) = 0;
  }
  return puVar5;
}

