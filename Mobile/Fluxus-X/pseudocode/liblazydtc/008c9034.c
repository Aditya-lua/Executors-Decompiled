/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c9034
 */

void FUN_008c9034(long param_1,long param_2)

{
  undefined4 uVar1;
  undefined1 uVar2;
  long lVar3;
  char cVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  undefined1 *puVar8;
  undefined8 uVar9;
  undefined1 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long local_80;
  long lStack_78;
  long local_70;
  long local_68;
  
  cVar4 = DAT_00d1fe78;
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  lVar7 = *(long *)(param_2 + 0xe8);
  uVar2 = *(undefined1 *)(param_1 + 4);
  puVar8 = *(undefined1 **)(param_1 + 0x60);
  local_70 = 0;
  *(undefined1 *)(param_1 + 4) = *(undefined1 *)(param_2 + 1);
  *(int *)(lVar7 + 0x20) = *(int *)(lVar7 + 0x20) + 1;
  if (cVar4 == '\x01') {
    uVar10 = *puVar8;
    uVar9 = 0;
    *puVar8 = 1;
  }
  else {
    uVar9 = *(undefined8 *)(puVar8 + 8);
    uVar10 = 0;
    *(undefined8 *)(puVar8 + 8) = 0xffffffffffffffff;
  }
  local_80 = lVar7;
  lStack_78 = param_2;
  iVar5 = FUN_008b3edc(param_1,FUN_008c9314,&local_80);
  if (DAT_00d1fe78 == '\x01') {
    *puVar8 = uVar10;
  }
  else {
    *(undefined8 *)(puVar8 + 8) = uVar9;
  }
  *(undefined1 *)(param_1 + 4) = uVar2;
  if (iVar5 == 0) {
    if (*(long *)(param_2 + 0xe8) != 0) {
      uVar6 = *(undefined8 *)(local_70 + 0x18);
      *(undefined4 *)(param_2 + 0xb8) = *(undefined4 *)(local_70 + 0xb8);
      uVar9 = *(undefined8 *)(local_70 + 0xe0);
      *(undefined8 *)(param_2 + 0x18) = uVar6;
      uVar6 = *(undefined8 *)(local_70 + 0xac);
      uVar12 = *(undefined8 *)(local_70 + 0x30);
      uVar11 = *(undefined8 *)(local_70 + 0x28);
      *(undefined8 *)(param_2 + 0xe0) = uVar9;
      *(undefined8 *)(param_2 + 0xac) = uVar6;
      *(undefined8 *)(param_2 + 0x30) = uVar12;
      *(undefined8 *)(param_2 + 0x28) = uVar11;
      uVar11 = *(undefined8 *)(local_70 + 0x9c);
      uVar9 = *(undefined8 *)(local_70 + 0x38);
      uVar6 = *(undefined8 *)(local_70 + 0x90);
      *(undefined8 *)(param_2 + 0xa4) = *(undefined8 *)(local_70 + 0xa4);
      *(undefined8 *)(param_2 + 0x9c) = uVar11;
      *(undefined8 *)(param_2 + 0x38) = uVar9;
      uVar1 = *(undefined4 *)(local_70 + 0xb4);
      *(undefined8 *)(param_2 + 0x90) = uVar6;
      uVar6 = *(undefined8 *)(local_70 + 0x88);
      uVar9 = *(undefined8 *)(local_70 + 0x80);
      *(undefined4 *)(param_2 + 0xb4) = uVar1;
      uVar1 = *(undefined4 *)(local_70 + 0xbc);
      *(undefined4 *)(local_70 + 0x9c) = 0;
      *(undefined8 *)(param_2 + 0x88) = uVar6;
      *(undefined8 *)(param_2 + 0x80) = uVar9;
      uVar6 = *(undefined8 *)(local_70 + 0x10);
      uVar9 = *(undefined8 *)(local_70 + 8);
      *(undefined4 *)(param_2 + 0xbc) = uVar1;
      uVar1 = *(undefined4 *)(local_70 + 200);
      *(undefined4 *)(local_70 + 0xa4) = 0;
      *(undefined8 *)(param_2 + 0x10) = uVar6;
      *(undefined8 *)(param_2 + 8) = uVar9;
      *(undefined4 *)(param_2 + 200) = uVar1;
      *(undefined8 *)(local_70 + 0x90) = 0;
      *(undefined8 *)(param_2 + 0x40) = *(undefined8 *)(local_70 + 0x40);
      *(undefined8 *)(local_70 + 0x80) = 0;
      *(undefined8 *)(local_70 + 0x10) = 0;
      *(undefined8 *)(param_2 + 0xc0) = *(undefined8 *)(local_70 + 0xc0);
      *(undefined8 *)(local_70 + 0x30) = 0;
      *(undefined8 *)(local_70 + 0x28) = 0;
      *(undefined8 *)(local_70 + 0x40) = 0;
      *(undefined8 *)(local_70 + 0x38) = 0;
      *(undefined8 *)(local_70 + 0xb4) = 0;
      *(undefined8 *)(local_70 + 0xac) = 0;
      *(undefined8 *)(local_70 + 0xc4) = 0;
      *(undefined8 *)(local_70 + 0xbc) = 0;
      *(undefined8 *)(param_2 + 0xe8) = 0;
      if ((*(byte *)(param_2 + 2) >> 2 & 1) != 0) {
        FUN_008b63a4(param_1,param_2,param_2 + 0x20);
      }
      iVar5 = *(int *)(lVar7 + 0x20) + -1;
      *(int *)(lVar7 + 0x20) = iVar5;
      if (iVar5 == 0) {
        if (*(code **)(lVar7 + 0x18) != (code *)0x0) {
          (**(code **)(lVar7 + 0x18))(*(undefined8 *)(lVar7 + 0x10));
        }
        FUN_008b7a9c(param_1,*(undefined8 *)(lVar7 + 0x60),(ulong)*(uint *)(lVar7 + 0x68) << 2,
                     *(undefined1 *)(lVar7 + 0x38));
        FUN_008b7a9c(param_1,*(undefined8 *)(lVar7 + 0x70),(ulong)*(uint *)(lVar7 + 0x78) << 2,
                     *(undefined1 *)(lVar7 + 0x38));
        FUN_008b7a9c(param_1,lVar7,0x80,*(undefined1 *)(lVar7 + 0x38));
      }
    }
    iVar5 = *(int *)(lVar7 + 0x20) + -1;
    *(int *)(lVar7 + 0x20) = iVar5;
    if (iVar5 == 0) {
      if (*(code **)(lVar7 + 0x18) != (code *)0x0) {
        (**(code **)(lVar7 + 0x18))(*(undefined8 *)(lVar7 + 0x10));
      }
      FUN_008b7a9c(param_1,*(undefined8 *)(lVar7 + 0x60),(ulong)*(uint *)(lVar7 + 0x68) << 2,
                   *(undefined1 *)(lVar7 + 0x38));
      FUN_008b7a9c(param_1,*(undefined8 *)(lVar7 + 0x70),(ulong)*(uint *)(lVar7 + 0x78) << 2,
                   *(undefined1 *)(lVar7 + 0x38));
      FUN_008b7a9c(param_1,lVar7,0x80,*(undefined1 *)(lVar7 + 0x38));
    }
    if (*(long *)(lVar3 + 0x28) == local_68) {
      return;
    }
  }
  else {
    FUN_008c8f9c(param_1,lVar7);
    if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_008b3f9c(param_1,iVar5);
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

