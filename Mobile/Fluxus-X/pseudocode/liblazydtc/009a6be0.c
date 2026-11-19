/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6be0
 */

undefined8 dtls1_handle_timeout(long param_1)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  undefined4 uVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  timeval local_30;
  
  if ((*(long *)(*(long *)(param_1 + 0x4b8) + 0x1f0) == 0) &&
     (*(long *)(*(long *)(param_1 + 0x4b8) + 0x1f8) == 0)) {
LAB_009a6cf0:
    uVar6 = 0;
  }
  else {
    gettimeofday(&local_30,(__timezone_ptr_t)0x0);
    lVar7 = *(long *)(param_1 + 0x4b8);
    lVar3 = *(long *)(lVar7 + 0x1f0) - local_30.tv_sec;
    if (local_30.tv_sec <= *(long *)(lVar7 + 0x1f0)) {
      if (lVar3 == 0) {
        lVar8 = *(long *)(lVar7 + 0x1f8);
        if (lVar8 <= local_30.tv_usec) goto LAB_009a6c88;
      }
      else {
        lVar8 = *(long *)(lVar7 + 0x1f8);
      }
      lVar8 = lVar8 - local_30.tv_usec;
      lVar1 = lVar8 + 1000000;
      if (-1 < lVar8) {
        lVar1 = lVar8;
      }
      lVar3 = lVar3 + (lVar8 >> 0x3f);
      if ((14999 < lVar1) || (lVar3 != 0)) {
        if (0 < lVar3) goto LAB_009a6cf0;
        if (0 < lVar1) {
          return 0;
        }
      }
    }
LAB_009a6c88:
    if (*(code **)(lVar7 + 0x208) == (code *)0x0) {
      uVar2 = *(int *)(lVar7 + 0x200) << 1;
      if (59999999 < uVar2) {
        uVar2 = 60000000;
      }
      *(uint *)(lVar7 + 0x200) = uVar2;
    }
    else {
      uVar4 = (**(code **)(lVar7 + 0x208))(param_1);
      *(undefined4 *)(*(long *)(param_1 + 0x4b8) + 0x200) = uVar4;
    }
    iVar5 = dtls1_check_timeout_num(param_1);
    if (-1 < iVar5) {
      dtls1_start_timer(param_1);
      uVar6 = dtls1_retransmit_buffered_messages(param_1);
      return uVar6;
    }
    uVar6 = 0xffffffff;
  }
  return uVar6;
}

