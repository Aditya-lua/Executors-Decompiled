/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00890298
 */

void FUN_00890298(undefined8 *param_1,long param_2,undefined4 param_3,uint param_4)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulong uVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong *puVar13;
  undefined8 *local_70;
  undefined8 *local_68;
  long local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if ((DAT_00d1ece0 == '\x01') && (*(long *)(param_2 + 0x48) != 0)) {
    if (*(long *)(lVar1 + 0x28) == local_58) {
      FUN_00893fb0(param_1,param_2,param_3,param_4 & 1);
      return;
    }
    goto LAB_008907f0;
  }
  uVar8 = *(ulong *)(param_2 + 0x20);
  if (param_1[0x2e] != 0) {
    uVar10 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
    uVar10 = (uVar8 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
    uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    lVar11 = param_1[0x2c];
    if ((*(ulong *)(lVar11 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
      uVar12 = uVar10;
      do {
        puVar13 = (ulong *)(param_1[0x29] + uVar12 * 0x30);
        if (*puVar13 == uVar8) {
          if ((int)puVar13[1] != 0) goto LAB_008903e4;
          break;
        }
        uVar12 = uVar12 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(lVar11 + (uVar12 >> 6) * 8) >> (uVar12 & 0x3f) & 1) != 0);
    }
  }
  iVar4 = FUN_0088df20(param_1);
  if (-1 < iVar4) {
    iVar5 = FUN_0088df20(param_1,*(undefined8 *)(param_2 + 0x30));
    uVar8 = *(ulong *)(param_2 + 0x40);
    if (iVar4 == iVar5) {
      iVar5 = FUN_0088df20(param_1,uVar8);
      uVar8 = *(ulong *)(param_2 + 0x40);
      if (-1 < iVar5) {
LAB_0089044c:
        if (*(long *)(lVar1 + 0x28) != local_58) goto LAB_008907f0;
        uVar9 = 0;
        goto LAB_008905b4;
      }
      if (param_1[0x2e] != 0) {
        uVar10 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
        uVar10 = (uVar8 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
        uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
        if ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
          do {
            puVar13 = (ulong *)(param_1[0x29] + uVar10 * 0x30);
            if (*puVar13 == uVar8) {
              if ((int)puVar13[1] != 0) goto LAB_0089044c;
              break;
            }
            uVar10 = uVar10 + 1 & param_1[0x2d] - 1;
          } while ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
        }
      }
    }
    iVar5 = FUN_0088df20(param_1,uVar8);
    if (iVar4 == iVar5) {
      iVar5 = FUN_0088df20(param_1,*(undefined8 *)(param_2 + 0x30));
      uVar8 = *(ulong *)(param_2 + 0x30);
      if (-1 < iVar5) {
LAB_0089059c:
        if (*(long *)(lVar1 + 0x28) == local_58) {
          uVar9 = 1;
LAB_008905b4:
          FUN_00894244(param_1,uVar9,iVar4,uVar8,param_3);
          return;
        }
        goto LAB_008907f0;
      }
      if (param_1[0x2e] != 0) {
        uVar10 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
        uVar10 = (uVar8 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
        uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
        if ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
          do {
            puVar13 = (ulong *)(param_1[0x29] + uVar10 * 0x30);
            if (*puVar13 == uVar8) {
              if ((int)puVar13[1] != 0) goto LAB_0089059c;
              break;
            }
            uVar10 = uVar10 + 1 & param_1[0x2d] - 1;
          } while ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
        }
      }
    }
  }
  local_70 = (undefined8 *)0x0;
  local_68 = (undefined8 *)0x0;
  local_60 = 0;
                    /* try { // try from 00890694 to 008906bb has its CatchHandler @ 008907b4 */
  FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),0,&local_70,0);
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x30),param_3,param_4 & 1);
                    /* try { // try from 008906c0 to 008906db has its CatchHandler @ 008907b0 */
  uVar9 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,0x17,0,0);
                    /* try { // try from 008906e0 to 008906fb has its CatchHandler @ 008907ac */
  uVar6 = FUN_00875ec8(*param_1);
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x40),param_3,param_4 & 1);
                    /* try { // try from 00890700 to 00890703 has its CatchHandler @ 008907bc */
  uVar7 = FUN_00875ec8(*param_1);
  puVar3 = local_68;
  for (puVar2 = local_70; puVar2 != puVar3; puVar2 = puVar2 + 1) {
                    /* try { // try from 0089071c to 00890723 has its CatchHandler @ 008907b8 */
    uVar8 = FUN_00875ed8(*param_1,*puVar2,uVar6);
    if ((uVar8 & 1) == 0) goto LAB_0089078c;
  }
                    /* try { // try from 00890738 to 008907ab has its CatchHandler @ 008907bc */
  uVar8 = FUN_00875ed8(*param_1,uVar9,uVar7);
  if ((uVar8 & 1) == 0) {
LAB_0089078c:
    if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
  }
  else {
    if (local_70 != (undefined8 *)0x0) {
      local_68 = local_70;
      operator_delete(local_70,local_60 - (long)local_70);
    }
    if (*(long *)(lVar1 + 0x28) == local_58) {
      return;
    }
  }
  goto LAB_008907f0;
  while (uVar10 = uVar10 + 1 & param_1[0x2d] - 1,
        (*(ulong *)(lVar11 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
LAB_008903e4:
    puVar13 = (ulong *)(param_1[0x29] + uVar10 * 0x30);
    if (*puVar13 == uVar8) {
      if ((1 < (uint)puVar13[1]) && (((uint)puVar13[1] != 2 || ((char)puVar13[2] != '\0')))) {
        uVar9 = *(undefined8 *)(param_2 + 0x30);
        goto LAB_00890534;
      }
      break;
    }
  }
  uVar9 = *(undefined8 *)(param_2 + 0x40);
LAB_00890534:
  if (*(long *)(lVar1 + 0x28) == local_58) {
    FUN_0088d1d0(param_1,uVar9,param_3,param_4 & 1);
    return;
  }
LAB_008907f0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

