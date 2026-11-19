/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945f80
 */

int FUN_00945f80(long *param_1,long param_2,int param_3,undefined4 *param_4)

{
  int iVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  undefined1 auStack_b0 [28];
  int local_94;
  undefined1 auStack_90 [8];
  undefined8 local_88;
  undefined1 auStack_80 [24];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  lVar6 = *(long *)(param_2 + 0x798);
  lVar8 = *(long *)(param_2 + 0x20);
  if (lVar6 == 0) {
    lVar6 = *(long *)*param_1;
  }
  uVar7 = *(undefined8 *)(param_2 + 0x918);
  FUN_00907b8c(param_2,0,&local_88,auStack_90,&local_94);
  FUN_00925214(auStack_b0);
  FUN_00925214(auStack_80);
  *param_4 = 1;
  iVar3 = (int)param_1[1];
  if (iVar3 == 0x11) {
    iVar1 = *(int *)(*param_1 + 0x34);
    *param_4 = 2;
    *(undefined4 *)(param_1 + 1) = 0;
    iVar3 = 0;
    if (iVar1 != param_3) {
      iVar3 = 0x43;
    }
    goto LAB_00946340;
  }
  if (iVar3 == 0x10) {
    *(ushort *)(param_1 + 3) = *(ushort *)(param_1 + 3) ^ *(ushort *)((long)param_1 + 0x1c);
    iVar3 = FUN_00945ab0(param_1,param_2,*(byte *)((long)param_1 + 0x1e) >> 2 & 1,param_4);
    goto LAB_00946340;
  }
  if (iVar3 == 0xe) {
    lVar5 = *param_1;
switchD_009460c8_caseD_e:
    if (*(int *)(lVar5 + 0x34) == param_3) {
      iVar3 = 0;
      *param_4 = 2;
      *(undefined4 *)(param_1 + 1) = 0;
      goto LAB_00946340;
    }
    if (*(int *)(lVar5 + 0x30) == param_3) {
      FUN_0092525c(auStack_80,&DAT_002d74cf,1,0);
      goto LAB_00946100;
    }
LAB_00946140:
    *param_4 = 2;
    *(undefined4 *)(param_1 + 1) = 0;
    iVar3 = 0x43;
    goto LAB_00946340;
  }
  lVar5 = *param_1;
  if (*(int *)(lVar5 + 0x30) != param_3) goto LAB_00946140;
  uVar4 = 0x11;
  switch(iVar3) {
  case 0:
    iVar3 = 0;
    *param_4 = 2;
    goto LAB_00946340;
  case 1:
    iVar3 = FUN_00963a84(*(undefined8 *)(lVar8 + 0x1e0),*(undefined8 *)(lVar8 + 0x1c8),
                         *(undefined8 *)(lVar8 + 0x1d0),auStack_80);
    goto LAB_009462f0;
  case 2:
    FUN_00963bb4(*(undefined8 *)(lVar8 + 0x1c8),auStack_80);
    uVar4 = 3;
  case 7:
switchD_009460c8_caseD_7:
    FUN_00925220(auStack_b0);
    goto LAB_0094610c;
  case 3:
    FUN_00963bb4(*(undefined8 *)(lVar8 + 0x1d0),auStack_80);
    goto LAB_00946100;
  case 4:
    FUN_00963be8(*(undefined8 *)(lVar8 + 0x1c8),auStack_80);
LAB_00946100:
    uVar4 = 0x11;
    goto switchD_009460c8_caseD_7;
  case 5:
    iVar3 = FUN_00946378(param_1,param_2,auStack_b0);
    if (iVar3 == 0) {
      iVar3 = FUN_00963c1c(auStack_b0,*(undefined8 *)(lVar8 + 0x1c8),*(undefined8 *)(lVar8 + 0x1d0),
                           auStack_80);
    }
    goto LAB_009462f0;
  case 6:
    iVar3 = FUN_00946378(param_1,param_2,auStack_b0);
    if (iVar3 != 0) goto LAB_009462f0;
    iVar3 = FUN_00963d98(param_2,auStack_b0,*(undefined8 *)(lVar8 + 0x1c8),
                         *(undefined8 *)(lVar8 + 0x1d0),lVar6,auStack_80);
    uVar4 = 0x11;
    if (iVar3 == 0) {
      uVar4 = 0x11;
      if ((*(byte *)(*param_1 + 0x3a) & 1) != 0) {
        uVar4 = 7;
      }
      goto switchD_009460c8_caseD_7;
    }
    break;
  case 8:
    iVar3 = FUN_009670b4(param_2,*(undefined8 *)(lVar8 + 0x1c8),*(undefined8 *)(lVar8 + 0x1d0),lVar6
                         ,local_88,lVar8 + 0x3f8,auStack_80);
    uVar4 = 9;
    break;
  case 9:
    iVar3 = FUN_00946378(param_1,param_2,auStack_b0);
    if (iVar3 == 0) {
      iVar3 = FUN_00966ec0(param_2,auStack_b0,lVar8 + 0x3f8);
      if (iVar3 == 0) {
        iVar3 = FUN_009671d0(param_2,*(undefined8 *)(lVar8 + 0x1c8),*(undefined8 *)(lVar8 + 0x1d0),
                             lVar8 + 0x3f8,auStack_80);
      }
    }
LAB_009462f0:
    uVar4 = 0x11;
    break;
  default:
    FUN_00904b80(param_2,"Unsupported SASL authentication mechanism");
    FUN_00925220(auStack_b0);
    iVar3 = 1;
    goto LAB_00946328;
  case 0xd:
    if (*(short *)((long)param_1 + 0x1c) != 0x100) {
      iVar3 = FUN_009678ac(*(undefined8 *)(lVar8 + 0x1c8),uVar7,auStack_80);
      goto LAB_009462f0;
    }
    iVar3 = FUN_0096781c(*(undefined8 *)(lVar8 + 0x1c8),local_88,(long)local_94,uVar7,auStack_80);
    uVar4 = 0xe;
    break;
  case 0xe:
    goto switchD_009460c8_caseD_e;
  }
  FUN_00925220(auStack_b0);
  if (iVar3 == 0) {
LAB_0094610c:
    iVar3 = FUN_00945e90(param_1,auStack_80);
    if (iVar3 == 0) {
      iVar3 = (**(code **)(*param_1 + 0x10))(param_2,param_1[2],auStack_80);
    }
  }
  else if (iVar3 == 0x3d) {
    iVar3 = (**(code **)(*param_1 + 0x18))(param_2,param_1[2]);
    uVar4 = 0x10;
  }
  else {
LAB_00946328:
    uVar4 = 0;
    *param_4 = 2;
  }
  FUN_00925220(auStack_80);
  *(undefined4 *)(param_1 + 1) = uVar4;
LAB_00946340:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

