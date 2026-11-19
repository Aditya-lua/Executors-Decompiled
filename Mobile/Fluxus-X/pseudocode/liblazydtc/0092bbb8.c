/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092bbb8
 */

void curl_multi_fdset(int *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                     int *param_5)

{
  int iVar1;
  byte bVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  int iVar7;
  ulong uVar8;
  int local_88 [4];
  undefined8 local_78;
  byte abStack_70 [8];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar4 = 1;
  }
  else if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) == 0) {
    abStack_70[0] = 0;
    abStack_70[1] = 0;
    abStack_70[2] = 0;
    abStack_70[3] = 0;
    abStack_70[4] = 0;
    abStack_70[5] = 0;
    abStack_70[6] = 0;
    abStack_70[7] = 0;
    local_78 = 0;
    local_88[2] = 0;
    local_88[3] = 0;
    local_88[0] = 0;
    local_88[1] = 0;
    lVar6 = *(long *)(param_1 + 2);
    if (lVar6 == 0) {
      iVar7 = -1;
    }
    else {
      iVar7 = -1;
      do {
        FUN_0092bcf8(lVar6,local_88);
        uVar5 = (ulong)local_78._4_4_;
        if (local_78._4_4_ != 0) {
          uVar8 = 0;
          do {
            if (local_88[uVar8] < 0x400) {
              bVar2 = abStack_70[uVar8];
              if ((bVar2 & 1) != 0) {
                __FD_SET_chk(local_88[uVar8],param_2,0xffffffffffffffff);
                bVar2 = abStack_70[uVar8];
              }
              if ((bVar2 >> 1 & 1) != 0) {
                __FD_SET_chk(local_88[uVar8],param_3,0xffffffffffffffff);
              }
              uVar5 = local_78 >> 0x20;
              iVar1 = local_88[uVar8];
              if (local_88[uVar8] <= iVar7) {
                iVar1 = iVar7;
              }
              iVar7 = iVar1;
            }
            uVar8 = uVar8 + 1;
          } while (uVar8 < uVar5);
        }
        lVar6 = *(long *)(lVar6 + 0x10);
      } while (lVar6 != 0);
    }
    uVar4 = 0;
    *param_5 = iVar7;
  }
  else {
    uVar4 = 8;
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

