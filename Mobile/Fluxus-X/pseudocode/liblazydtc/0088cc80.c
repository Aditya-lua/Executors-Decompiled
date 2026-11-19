/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088cc80
 */

void FUN_0088cc80(undefined8 *param_1,ulong param_2,byte *param_3,undefined8 param_4,byte param_5)

{
  undefined8 *puVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  undefined4 uVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  undefined4 uVar9;
  ulong uVar10;
  ulong *puVar11;
  uint uVar12;
  undefined8 *local_80;
  undefined8 *local_78;
  long local_70;
  long local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
LAB_0088ccf0:
  do {
    if (param_1[0x2e] != 0) {
      uVar10 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
      uVar10 = (param_2 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
      uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
               ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
        do {
          puVar11 = (ulong *)(param_1[0x29] + uVar10 * 0x30);
          if (*puVar11 == param_2) {
            iVar3 = (int)puVar11[1];
            if (iVar3 != 0) {
              if (iVar3 == 2) {
                param_5 = param_5 ^ (byte)puVar11[2];
joined_r0x0088cfcc:
                if ((param_5 & 1) != 0) goto LAB_0088d01c;
              }
              else {
                if (iVar3 == 1) goto joined_r0x0088cfcc;
                if ((param_5 & 1) == 0) goto LAB_0088d01c;
              }
              if (param_3 != (byte *)0x0) {
                FUN_0088d1d0(param_1,param_2,*param_3,1);
              }
              local_80 = (undefined8 *)FUN_00875ec8(*param_1);
              FUN_00894350(param_4,&local_80);
              FUN_00875cac(*param_1,0x17,0,0);
              goto LAB_0088d01c;
            }
            break;
          }
          uVar10 = uVar10 + 1 & param_1[0x2d] - 1;
        } while ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
      }
    }
    iVar3 = *(int *)(param_2 + 8);
    if ((param_2 != 0) && (iVar3 == DAT_00d1b0a0)) {
      iVar4 = *(int *)(param_2 + 0x1c);
      if (iVar4 - 0xeU < 2) {
        if ((bool)(param_5 & 1) != (iVar4 != 0xe)) {
          local_80 = (undefined8 *)0x0;
          local_78 = (undefined8 *)0x0;
          local_70 = 0;
                    /* try { // try from 0088ceb8 to 0088cee3 has its CatchHandler @ 0088d0a0 */
          FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),0,&local_80,(param_5 ^ 0xff) & 1);
          FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x28),param_3,param_4,param_5 & 1);
                    /* try { // try from 0088cee8 to 0088ceeb has its CatchHandler @ 0088d0b8 */
          uVar8 = FUN_00875ec8(*param_1);
          puVar7 = local_78;
          puVar1 = local_80;
          goto joined_r0x0088cef4;
        }
        FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),param_3,param_4);
        param_2 = *(ulong *)(param_2 + 0x28);
        goto LAB_0088ccf0;
      }
      if (iVar4 - 8U < 6) {
        if (param_3 != (byte *)0x0) {
          FUN_00875b54(*param_1,3,*param_3,param_5 & 1,0);
        }
        local_80 = (undefined8 *)FUN_00893480(param_1,param_2,(param_5 ^ 0xff) & 1);
        FUN_00894434(param_4,&local_80);
        goto LAB_0088d01c;
      }
    }
    uVar10 = param_2;
    if (iVar3 != DAT_00d1b090) {
      uVar10 = 0;
    }
    if (((param_3 == (byte *)0x0) && (uVar10 != 0)) && (*(int *)(uVar10 + 0x1c) == 0)) {
      param_2 = *(ulong *)(uVar10 + 0x20);
      param_3 = (byte *)0x0;
      param_5 = param_5 ^ 1;
    }
    else {
      if ((param_2 == 0) || (iVar3 != DAT_00d1afc0)) break;
      param_2 = *(ulong *)(param_2 + 0x20);
    }
  } while( true );
  uVar5 = *(undefined4 *)((long)param_1 + 0x64c);
  if (param_3 == (byte *)0x0) {
                    /* try { // try from 0088cf3c to 0088cf83 has its CatchHandler @ 0088d0a8 */
    uVar12 = FUN_0088df20(param_1,param_2);
    if ((int)uVar12 < 0) {
      iVar3 = *(int *)((long)param_1 + 0x64c);
      uVar12 = iVar3 + 1;
      if (0xff < uVar12) {
        if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088d088 to 0088d09f has its CatchHandler @ 0088d0a8 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                       0xff);
        }
        goto LAB_0088d0f0;
      }
      *(uint *)((long)param_1 + 0x64c) = uVar12;
      uVar2 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar12) {
        uVar2 = uVar12;
      }
      *(uint *)(param_1 + 0xca) = uVar2;
      uVar12 = FUN_00891438(param_1,param_2,iVar3,0xff);
    }
  }
  else {
    uVar12 = (uint)*param_3;
                    /* try { // try from 0088ce78 to 0088ce8b has its CatchHandler @ 0088d0a8 */
    FUN_0088d1d0(param_1,param_2,uVar12,1);
  }
                    /* try { // try from 0088cf8c to 0088cf9f has its CatchHandler @ 0088d0a4 */
  local_80 = (undefined8 *)FUN_00875ec8(*param_1);
  FUN_00894350(param_4,&local_80);
  uVar9 = 0x19;
  if ((param_5 & 1) == 0) {
    uVar9 = 0x1a;
  }
                    /* try { // try from 0088cfb0 to 0088cfbb has its CatchHandler @ 0088d0a8 */
  FUN_00875cac(*param_1,uVar9,uVar12,0);
  *(undefined4 *)((long)param_1 + 0x64c) = uVar5;
  goto LAB_0088d01c;
joined_r0x0088cef4:
  if (puVar1 == puVar7) goto LAB_0088cf20;
                    /* try { // try from 0088cf04 to 0088cf0b has its CatchHandler @ 0088d0b4 */
  uVar10 = FUN_00875ed8(*param_1,*puVar1,uVar8);
  if ((uVar10 & 1) == 0) {
    if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088d064 to 0088d073 has its CatchHandler @ 0088d0b8 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
    goto LAB_0088d0f0;
  }
  puVar1 = puVar1 + 1;
  goto joined_r0x0088cef4;
LAB_0088cf20:
  if (local_80 != (undefined8 *)0x0) {
    local_78 = local_80;
    operator_delete(local_80,local_70 - (long)local_80);
  }
LAB_0088d01c:
  if (*(long *)(lVar6 + 0x28) == local_68) {
    return;
  }
LAB_0088d0f0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

