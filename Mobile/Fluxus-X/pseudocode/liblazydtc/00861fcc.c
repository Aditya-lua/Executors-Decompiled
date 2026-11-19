/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00861fcc
 */

ulong FUN_00861fcc(undefined8 param_1,undefined8 param_2,undefined8 param_3,char *param_4,
                  undefined8 *param_5,undefined8 param_6)

{
  void *pvVar1;
  long lVar2;
  uint uVar3;
  void *pvVar4;
  int iVar5;
  size_t sVar6;
  void *pvVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  ulong uVar13;
  uint uVar14;
  undefined8 *puVar15;
  uint unaff_w26;
  void *local_e8;
  void *local_e0;
  long local_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined1 local_b0 [32];
  long *local_90;
  byte local_80;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_b0[0] = 0;
  local_80 = 0;
  local_d0 = param_2;
  uStack_c8 = param_3;
  if (DAT_00d1ed30 == (char *)0x0) {
LAB_00862068:
    uVar14 = 0;
    uVar13 = 0;
  }
  else {
    iVar5 = strcmp(param_4,DAT_00d1ed30);
    puVar15 = &DAT_00d1ed30;
    while (iVar5 != 0) {
      if ((char *)puVar15[10] == (char *)0x0) goto LAB_00862068;
      iVar5 = strcmp(param_4,(char *)puVar15[10]);
      puVar15 = puVar15 + 10;
    }
    uVar14 = *(uint *)(puVar15 + 1);
    uVar13 = (ulong)uVar14;
                    /* try { // try from 00862050 to 0086205b has its CatchHandler @ 008622ec */
    FUN_0086fa58(local_b0,puVar15 + 2);
    unaff_w26 = uVar14 >> 8;
    uVar14 = 1;
  }
  if (*PTR_DAT_00cc4630 == '\x01') {
    iVar5 = strcmp(param_4,PTR_s_debugnoinline_00cc45e0);
    uVar3 = DAT_00cc45e8;
    if (iVar5 != 0) goto LAB_00862098;
    uVar13 = (ulong)DAT_00cc45e8;
                    /* try { // try from 008620e0 to 008620e7 has its CatchHandler @ 008622e0 */
    FUN_0086fa58(local_b0,&DAT_00cc45f0);
    unaff_w26 = uVar3 >> 8;
    uVar14 = 1;
LAB_008620f4:
    lVar9 = param_5[1] * 8;
    lVar10 = (param_5[2] + param_5[1]) * 8;
    if (lVar9 != lVar10) {
      lVar11 = *(long *)*param_5;
      plVar12 = (long *)(lVar9 + lVar11);
      do {
        if (*(uint *)(*plVar12 + 0x1c) == ((uint)uVar13 & 0xff | unaff_w26 << 8)) {
                    /* try { // try from 00862208 to 0086221b has its CatchHandler @ 008622f8 */
          FUN_00860ecc(param_1,&local_d0,"Cannot duplicate attribute \'@%s\'",param_4);
        }
        plVar12 = plVar12 + 1;
      } while (plVar12 != (long *)(lVar10 + lVar11));
    }
    if ((local_80 & 1) != 0) {
      uStack_b8 = uStack_c8;
      local_c0 = local_d0;
      if (local_90 == (long *)0x0) {
        if (*(long *)(lVar2 + 0x28) != local_68) goto LAB_00862360;
                    /* try { // try from 008622dc to 008622df has its CatchHandler @ 008622f4 */
        uVar8 = FUN_00870bb8();
                    /* catch() { ... } // from try @ 008620e0 with catch @ 008622e0 */
                    /* catch() { ... } // from try @ 00862208 with catch @ 008622f8 */
        if (local_80 == 1) {
          if (local_90 == (long *)local_b0) {
            lVar9 = 0x20;
          }
          else {
            if (local_90 == (long *)0x0) goto LAB_00862344;
            lVar9 = 0x28;
          }
          (**(code **)(*local_90 + lVar9))();
        }
LAB_00862344:
        if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar8);
        }
        goto LAB_00862360;
      }
                    /* try { // try from 0086212c to 0086213b has its CatchHandler @ 008622f4 */
      (**(code **)(*local_90 + 0x30))(&local_e8,local_90,&local_c0,param_6);
      pvVar4 = local_e0;
      pvVar7 = local_e8;
      for (pvVar1 = local_e8; local_e8 = pvVar7, pvVar1 != pvVar4;
          pvVar1 = (void *)((long)pvVar1 + 0x28)) {
        lVar9 = (long)pvVar1 + 0x11;
        if ((*(byte *)((long)pvVar1 + 0x10) & 1) != 0) {
          lVar9 = *(long *)((long)pvVar1 + 0x20);
        }
                    /* try { // try from 00862168 to 00862177 has its CatchHandler @ 00862300 */
        FUN_00860ecc(param_1,pvVar1,&DAT_002b6c62,lVar9);
        pvVar7 = local_e8;
      }
      if (pvVar7 != (void *)0x0) {
        if (pvVar7 != local_e0) {
          do {
            if ((*(byte *)((long)local_e0 + -0x18) & 1) != 0) {
              operator_delete(*(void **)((long)local_e0 + -8),
                              *(ulong *)((long)local_e0 + -0x18) & 0xfffffffffffffffe);
            }
            local_e0 = (void *)((long)local_e0 + -0x28);
          } while (local_e0 != pvVar7);
          pvVar7 = local_e8;
        }
        operator_delete(pvVar7,local_d8 - (long)pvVar7);
      }
    }
  }
  else {
LAB_00862098:
    if (uVar14 != 0) goto LAB_008620f4;
    sVar6 = strlen(param_4);
    if (sVar6 == 0) {
                    /* try { // try from 00862228 to 0086223b has its CatchHandler @ 008622e4 */
      FUN_00860ecc(param_1,&local_d0,"Attribute name is missing");
    }
    else {
                    /* try { // try from 008620b4 to 008620cb has its CatchHandler @ 008622e4 */
      FUN_00860ecc(param_1,&local_d0,"Invalid attribute \'@%s\'",param_4);
    }
  }
  if (local_80 == 1) {
    if (local_90 == (long *)local_b0) {
      lVar9 = 0x20;
    }
    else {
      if (local_90 == (long *)0x0) goto LAB_0086228c;
      lVar9 = 0x28;
    }
    (**(code **)(*local_90 + lVar9))();
  }
LAB_0086228c:
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return (ulong)(unaff_w26 << 8) | uVar13 & 0xff | (ulong)uVar14 << 0x20;
  }
LAB_00862360:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

