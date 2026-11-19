/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00953c88
 */

ulong FUN_00953c88(long param_1)

{
  int __fd;
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined *puVar6;
  long lVar7;
  ulong uVar8;
  socklen_t local_d0;
  int local_cc;
  sockaddr asStack_c8 [8];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  lVar7 = *(long *)(param_1 + 0x20);
  __fd = *(int *)(lVar7 + 0x224);
  local_d0 = 0x80;
  local_cc = -1;
  iVar2 = getsockname(__fd,asStack_c8,&local_d0);
  if (iVar2 == 0) {
    local_d0 = 0x80;
    local_cc = accept(__fd,asStack_c8,&local_d0);
    if (local_cc != -1) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Connection accepted from server");
      }
      *(ulong *)(lVar7 + 0x3a0) = *(ulong *)(lVar7 + 0x3a0) & 0xffffffffffffdfff;
      FUN_009308ec(local_cc,1);
      uVar4 = FUN_0090dc30(param_1,lVar7,1,&local_cc);
      uVar8 = uVar4 & 0xffffffff;
      if ((int)uVar4 == 0) {
        if (*(long *)(param_1 + 0x268) == 0) {
          uVar8 = 0;
        }
        else {
          FUN_0092f198(param_1,1);
          uVar5 = (**(code **)(param_1 + 0x268))(*(undefined8 *)(param_1 + 0x270),local_cc,1);
          uVar8 = uVar5 & 0xffffffff;
          uVar4 = FUN_0092f198(param_1,0);
          if ((int)uVar5 != 0) {
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               (((*(long *)(param_1 + 0x12a0) == 0 ||
                 (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) && (0 < DAT_00cc46c0)))) {
              if (*(long *)(param_1 + 0x20) == 0) {
                puVar6 = &DAT_002c11b5;
              }
              else {
                puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
              }
              FUN_00905258(param_1,"[%s] closing DATA connection",puVar6);
            }
            FUN_00906fc0(param_1,1);
            uVar4 = FUN_00906f54(param_1,*(undefined8 *)(param_1 + 0x20),1);
            uVar8 = 0x2a;
          }
        }
      }
      else {
        uVar3 = close(local_cc);
        uVar4 = (ulong)uVar3;
      }
      goto LAB_00953cec;
    }
  }
  uVar4 = FUN_00904b80(param_1,"Error accept()ing server connect");
  uVar8 = 0x1e;
LAB_00953cec:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return uVar8;
}

