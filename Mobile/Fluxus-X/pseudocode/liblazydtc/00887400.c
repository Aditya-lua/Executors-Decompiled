/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00887400
 */

void FUN_00887400(undefined8 *param_1,long param_2)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  ulong *puVar11;
  undefined4 local_80 [2];
  undefined8 local_78;
  undefined8 *local_70;
  undefined8 *local_68;
  long local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar7 = *(ulong *)(param_2 + 0x20);
  if (param_1[0x2e] != 0) {
    uVar9 = ((ulong)(uint)((int)uVar7 << 3) + 8 ^ uVar7 >> 0x20) * -0x622015f714c7d297;
    uVar9 = (uVar7 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
    uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
      do {
        puVar11 = (ulong *)(param_1[0x29] + uVar9 * 0x30);
        if (*puVar11 == uVar7) {
          if (((int)puVar11[1] == 1) || (((int)puVar11[1] == 2 && ((puVar11[2] & 1) == 0))))
          goto LAB_00887970;
          break;
        }
        uVar9 = uVar9 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
    }
  }
  if ((((*(int *)(uVar7 + 8) == DAT_00d1b0a0) && (uVar7 != 0)) && (*(int *)(uVar7 + 0x1c) == 0xe))
     && (param_1[0x2e] != 0)) {
    uVar9 = *(ulong *)(uVar7 + 0x28);
    uVar10 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
    uVar10 = (uVar9 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
    uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
LAB_00887598:
      puVar11 = (ulong *)(param_1[0x29] + uVar10 * 0x30);
      if (*puVar11 != uVar9) goto code_r0x008875a8;
      if (((int)puVar11[1] == 1) || (((int)puVar11[1] == 2 && ((puVar11[2] & 1) == 0)))) {
        FUN_00889800(param_1,*(undefined8 *)(uVar7 + 0x20));
LAB_00887970:
        if (*(long *)(param_2 + 0x30) != 0) {
          if (*(long *)(lVar1 + 0x28) == local_58) {
            FUN_0088506c(param_1);
            return;
          }
          goto LAB_00887a6c;
        }
        goto LAB_008878b8;
      }
    }
  }
LAB_008875e0:
  if ((DAT_00d1ece0 == '\x01') && (*(long *)(param_2 + 0x60) != 0)) {
    if (*(long *)(lVar1 + 0x28) == local_58) {
      FUN_0088c8ec(param_1,param_2);
      return;
    }
    goto LAB_00887a6c;
  }
  if (*(long *)(param_2 + 0x30) == 0) {
    lVar8 = *(long *)(param_2 + 0x28);
    if ((lVar8 == 0) || (*(int *)(lVar8 + 8) != DAT_00d1b0f0)) {
      if (*(int *)(lVar8 + 8) == DAT_00d1b130) goto LAB_008877b4;
      goto LAB_00887638;
    }
    if ((*(long *)(lVar8 + 0x28) != 1) || (*(int *)(**(long **)(lVar8 + 0x20) + 8) != DAT_00d1b130))
    goto LAB_00887638;
LAB_008877b4:
    uVar7 = FUN_0088cba0(param_1,*(undefined8 *)(param_1[0xfb] + -0x18));
    if ((uVar7 & 1) != 0) goto LAB_00887638;
    local_70 = (undefined8 *)0x0;
    local_68 = (undefined8 *)0x0;
    local_60 = 0;
                    /* try { // try from 008877d4 to 008877e7 has its CatchHandler @ 00887a08 */
    FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),0,&local_70,1);
    puVar3 = local_68;
    for (puVar2 = local_70; puVar2 != puVar3; puVar2 = puVar2 + 1) {
      local_78 = *puVar2;
      local_80[0] = 0;
                    /* try { // try from 00887800 to 0088780b has its CatchHandler @ 00887a18 */
      FUN_00888244(param_1 + 0xf7,local_80);
    }
LAB_0088794c:
    if (local_70 != (undefined8 *)0x0) {
      uVar7 = local_60 - (long)local_70;
      local_68 = local_70;
      goto LAB_008878b4;
    }
  }
  else {
LAB_00887638:
    if (*(long *)(*(long *)(param_2 + 0x28) + 0x28) == 1) {
      lVar8 = **(long **)(*(long *)(param_2 + 0x28) + 0x20);
      if (*(int *)(lVar8 + 8) != DAT_00d1b140) {
        lVar8 = 0;
      }
      if (((*(long *)(param_2 + 0x30) == 0) && (lVar8 != 0)) &&
         (uVar7 = FUN_0088cba0(param_1,*(undefined8 *)(param_1[0xfb] + -0x10)), (uVar7 & 1) == 0)) {
        if (*(long *)(param_1[0xfb] + -8) == 0) {
          *(long *)(param_1[0xfb] + -8) = lVar8;
        }
        local_70 = (undefined8 *)0x0;
        local_68 = (undefined8 *)0x0;
        local_60 = 0;
                    /* try { // try from 00887900 to 00887913 has its CatchHandler @ 00887a0c */
        FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),0,&local_70,1);
        puVar3 = local_68;
        for (puVar2 = local_70; puVar2 != puVar3; puVar2 = puVar2 + 1) {
          local_78 = *puVar2;
          local_80[0] = 1;
                    /* try { // try from 00887930 to 0088793b has its CatchHandler @ 00887a20 */
          FUN_00888244(param_1 + 0xf7,local_80);
        }
        goto LAB_0088794c;
      }
    }
    local_70 = (undefined8 *)0x0;
    local_68 = (undefined8 *)0x0;
    local_60 = 0;
                    /* try { // try from 00887690 to 008876cf has its CatchHandler @ 00887a1c */
    FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),0,&local_70,0);
    FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x28));
    if ((*(long *)(param_2 + 0x30) == 0) || (local_68 == local_70)) {
                    /* try { // try from 00887724 to 00887727 has its CatchHandler @ 00887a38 */
      uVar4 = FUN_00875ec8(*param_1);
      puVar3 = local_68;
      for (puVar2 = local_70; puVar2 != puVar3; puVar2 = puVar2 + 1) {
                    /* try { // try from 00887740 to 00887747 has its CatchHandler @ 00887a34 */
        uVar7 = FUN_00875ed8(*param_1,*puVar2,uVar4);
        if ((uVar7 & 1) == 0) {
          if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* try { // try from 008879b8 to 008879c7 has its CatchHandler @ 00887a38 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile")
            ;
          }
          goto LAB_00887a6c;
        }
      }
    }
    else {
      uVar7 = FUN_0089acdc(param_1 + 0x29,*(undefined8 *)(param_2 + 0x28));
      if ((uVar7 & 1) == 0) {
                    /* try { // try from 0088781c to 00887837 has its CatchHandler @ 00887a14 */
        uVar4 = FUN_00875ec8(*param_1);
        FUN_00875cac(*param_1,0x17,0,0);
                    /* try { // try from 0088783c to 0088784f has its CatchHandler @ 00887a10 */
        uVar5 = FUN_00875ec8(*param_1);
        FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x30));
                    /* try { // try from 00887854 to 00887857 has its CatchHandler @ 00887a30 */
        uVar6 = FUN_00875ec8(*param_1);
        puVar3 = local_68;
        for (puVar2 = local_70; puVar2 != puVar3; puVar2 = puVar2 + 1) {
                    /* try { // try from 00887870 to 00887877 has its CatchHandler @ 00887a28 */
          uVar7 = FUN_00875ed8(*param_1,*puVar2,uVar5);
          if ((uVar7 & 1) == 0) goto LAB_008879c8;
        }
                    /* try { // try from 0088788c to 00887897 has its CatchHandler @ 00887a30 */
        uVar7 = FUN_00875ed8(*param_1,uVar4,uVar6);
        if ((uVar7 & 1) == 0) {
LAB_008879c8:
          if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* try { // try from 008879d8 to 008879e7 has its CatchHandler @ 00887a30 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile")
            ;
          }
          goto LAB_00887a6c;
        }
      }
      else {
                    /* try { // try from 008876dc to 008876ef has its CatchHandler @ 00887a2c */
        uVar4 = FUN_00875ec8(*param_1);
        FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x30));
        puVar3 = local_68;
        for (puVar2 = local_70; puVar2 != puVar3; puVar2 = puVar2 + 1) {
                    /* try { // try from 00887704 to 0088770b has its CatchHandler @ 00887a24 */
          uVar7 = FUN_00875ed8(*param_1,*puVar2,uVar4);
          if ((uVar7 & 1) == 0) {
            if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* try { // try from 008879f8 to 00887a07 has its CatchHandler @ 00887a2c */
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(param_2 + 0xc,
                           "Exceeded jump distance limit; simplify the code to compile");
            }
            goto LAB_00887a6c;
          }
        }
      }
    }
    if (local_70 != (undefined8 *)0x0) {
      uVar7 = local_60 - (long)local_70;
      local_68 = local_70;
LAB_008878b4:
      local_70 = local_68;
      operator_delete(local_68,uVar7);
    }
  }
LAB_008878b8:
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return;
  }
LAB_00887a6c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
code_r0x008875a8:
  uVar10 = uVar10 + 1 & param_1[0x2d] - 1;
  if ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) == 0)
  goto LAB_008875e0;
  goto LAB_00887598;
}

