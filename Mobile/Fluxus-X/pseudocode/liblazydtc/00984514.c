/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984514
 */

/* ix::Socket::poll(bool, int, int, std::__ndk1::unique_ptr<ix::SelectInterrupt,
   std::__ndk1::default_delete<ix::SelectInterrupt> > const&) */

undefined4 ix::Socket::poll(bool param_1,int param_2,int param_3,unique_ptr *param_4)

{
  long lVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  long lVar5;
  int *piVar6;
  uint uVar7;
  undefined4 uVar8;
  socklen_t local_78;
  int local_74;
  void *local_70;
  pollfd local_68;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_68.events = 9;
  if (!param_1) {
    local_68.events = 0xc;
  }
  local_60 = 0;
  local_68.fd = param_3;
  local_68.revents = 0;
  if (*(long **)param_4 == (long *)0x0) {
LAB_009845f8:
    pvVar4 = (void *)0x0;
LAB_009845fc:
    iVar2 = -1;
    uVar7 = 1;
LAB_00984604:
    local_70 = pvVar4;
    iVar3 = ix::poll(&local_68,uVar7,param_2,&local_70);
    if (iVar3 < 0) {
LAB_0098476c:
      uVar8 = 3;
      goto LAB_00984770;
    }
    if (iVar3 == 0) {
      uVar8 = 2;
      if (((pvVar4 != (void *)0x0) || (iVar2 != -1)) || (*(long **)param_4 == (long *)0x0))
      goto LAB_00984770;
      lVar5 = (**(code **)(**(long **)param_4 + 0x28))();
      if (lVar5 != 1) {
        uVar8 = 5;
        if (lVar5 != 2) {
          uVar8 = 2;
        }
        goto LAB_00984770;
      }
    }
    else {
      if (((iVar2 == -1) || ((local_60 & 0x1000000000000) == 0)) &&
         ((pvVar4 == (void *)0x0 || (local_70 == (void *)0x0)))) {
        if (((param_1) && (param_3 != -1)) && (uVar8 = 0, ((ulong)local_68 & 0x1000000000000) != 0))
        goto LAB_00984770;
        if ((param_3 == -1 || param_1) || (((byte)local_68.revents >> 2 & 1) == 0)) {
          if (param_3 == -1) {
            uVar8 = 0;
          }
          else {
            uVar8 = 0;
            if (((ulong)local_68 & 0x38000000000000) != 0) {
              uVar8 = 3;
            }
          }
          goto LAB_00984770;
        }
        local_78 = 4;
        local_74 = -1;
        uVar8 = 1;
        iVar3 = getsockopt(param_3,1,4,&local_74,&local_78);
        iVar2 = local_74;
        if ((iVar3 != -1) && (local_74 == 0)) goto LAB_00984770;
        piVar6 = (int *)__errno();
        *piVar6 = iVar2;
        goto LAB_0098476c;
      }
      lVar5 = (**(code **)(**(long **)param_4 + 0x28))();
      if (lVar5 != 1) {
        uVar8 = 5;
        if (lVar5 != 2) {
          uVar8 = 0;
        }
        goto LAB_00984770;
      }
    }
  }
  else {
    iVar2 = (**(code **)(**(long **)param_4 + 0x30))();
    pvVar4 = (void *)(**(code **)(**(long **)param_4 + 0x38))(*(long **)param_4);
    if (iVar2 != -1) {
      uVar7 = 2;
      local_60._0_6_ = CONCAT24(1,iVar2);
      goto LAB_00984604;
    }
    if (pvVar4 != (void *)0x0) goto LAB_009845fc;
    lVar5 = (**(code **)(**(long **)param_4 + 0x28))();
    if (lVar5 != 1) {
      if (lVar5 == 2) {
        uVar8 = 5;
        goto LAB_00984770;
      }
      goto LAB_009845f8;
    }
  }
  uVar8 = 4;
LAB_00984770:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar8;
}

