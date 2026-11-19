/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00887a70
 */

void FUN_00887a70(undefined8 *param_1,long param_2)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *puVar10;
  long lVar11;
  long lVar12;
  undefined8 *local_80;
  undefined8 *local_78;
  long local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (((char)DAT_00d1ed00 == '\x01') && (*(long *)(param_2 + 0x48) != 0)) {
    if (*(long *)(lVar1 + 0x28) == local_68) {
      FUN_0089452c(param_1,param_2);
      return;
    }
  }
  else {
    if (param_1[0x2e] != 0) {
      uVar8 = *(ulong *)(param_2 + 0x20);
      uVar9 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
      uVar9 = (uVar8 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
      uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
        do {
          puVar10 = (ulong *)(param_1[0x29] + uVar9 * 0x30);
          if (*puVar10 == uVar8) {
            if (((int)puVar10[1] == 1) || (((int)puVar10[1] == 2 && ((char)puVar10[2] == '\0'))))
            goto LAB_00887d38;
            break;
          }
          uVar9 = uVar9 + 1 & param_1[0x2d] - 1;
        } while ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
      }
    }
    lVar11 = param_1[0xf8];
    lVar12 = param_1[0xf7];
    local_70 = 0;
    local_80 = (undefined8 *)((long)(param_1[0xd1] - param_1[0xd0]) >> 3);
    local_78 = local_80;
    FUN_008948a4(param_1 + 0xfa,&local_80);
    *(undefined1 *)(param_1 + 0xcc) = 1;
    uVar4 = FUN_00875ec8(*param_1);
    local_80 = (undefined8 *)0x0;
    local_78 = (undefined8 *)0x0;
    local_70 = 0;
                    /* try { // try from 00887c0c to 00887c2b has its CatchHandler @ 00887d8c */
    FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),0,&local_80,0);
    FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x28));
                    /* try { // try from 00887c30 to 00887c33 has its CatchHandler @ 00887d88 */
    uVar5 = FUN_00875ec8(*param_1);
                    /* try { // try from 00887c3c to 00887c77 has its CatchHandler @ 00887d90 */
    uVar6 = FUN_00875ec8(*param_1);
    if (0 < *(int *)((long)param_1 + 0xc)) {
      FUN_00876644(*param_1,*(int *)(*(long *)(param_2 + 0x20) + 0xc) + 1);
    }
    FUN_00875cac(*param_1,0x18,0,0);
                    /* try { // try from 00887c7c to 00887c93 has its CatchHandler @ 00887d98 */
    uVar7 = FUN_00875ec8(*param_1);
    uVar8 = FUN_00875ed8(*param_1,uVar6,uVar4);
    puVar3 = local_78;
    puVar2 = local_80;
    if ((uVar8 & 1) == 0) {
LAB_00887d68:
      if (*(long *)(lVar1 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
      }
    }
    else {
      for (; puVar2 != puVar3; puVar2 = puVar2 + 1) {
                    /* try { // try from 00887cac to 00887cb3 has its CatchHandler @ 00887d94 */
        uVar8 = FUN_00875ed8(*param_1,*puVar2,uVar7);
        if ((uVar8 & 1) == 0) goto LAB_00887d68;
      }
                    /* try { // try from 00887cc4 to 00887d87 has its CatchHandler @ 00887d98 */
      uVar9 = lVar11 - lVar12 >> 4;
      FUN_008949bc(param_1,param_2,uVar9,uVar7,uVar5);
      uVar8 = (long)(param_1[0xf8] - param_1[0xf7]) >> 4;
      if (uVar9 < uVar8 || uVar9 - uVar8 == 0) {
        if (uVar9 < uVar8) {
          param_1[0xf8] = param_1[0xf7] + (lVar11 - lVar12);
        }
      }
      else {
        FUN_00894a8c(param_1 + 0xf7,uVar9 - uVar8);
      }
      param_1[0xfb] = param_1[0xfb] + -0x18;
      if (local_80 != (undefined8 *)0x0) {
        local_78 = local_80;
        operator_delete(local_80,local_70 - (long)local_80);
      }
LAB_00887d38:
      if (*(long *)(lVar1 + 0x28) == local_68) {
        return;
      }
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

