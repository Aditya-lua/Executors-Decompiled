/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009024d8
 */

undefined4 curl_easy_perform(ulong param_1)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  ulong uVar8;
  bool bVar9;
  undefined1 auStack_9c [4];
  _union_1457 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  _union_1457 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_1 == 0) {
    uVar6 = 0x2b;
  }
  else {
    if (*(undefined1 **)(param_1 + 0x1c8) != (undefined1 *)0x0) {
      **(undefined1 **)(param_1 + 0x1c8) = 0;
    }
    *(undefined4 *)(param_1 + 0xcb8) = 0;
    if (*(long *)(param_1 + 0xc0) == 0) {
      uVar4 = param_1;
      uVar8 = *(ulong *)(param_1 + 200);
      if ((*(ulong *)(param_1 + 200) == 0) &&
         (uVar4 = FUN_0092a9e8(1,3,7), uVar8 = uVar4, uVar4 == 0)) {
        uVar6 = 0x1b;
        param_1 = uVar4;
      }
      else if ((*(byte *)(uVar8 + 0x231) >> 2 & 1) == 0) {
        curl_multi_setopt(uVar8,6,*(undefined4 *)(param_1 + 0xa7c));
        *(undefined8 *)(param_1 + 200) = 0;
        iVar2 = curl_multi_add_handle(uVar8,param_1);
        if (iVar2 == 0) {
          *(ulong *)(param_1 + 200) = uVar8;
          local_78 = 0;
          uStack_80 = 0;
          local_88 = 0;
          uStack_90 = 0;
          local_98.sa_handler = (__sighandler_t)0x0;
          if (*(int *)(param_1 + 0xa82) < 0) {
            sigaction(0xd,(sigaction *)&local_98,(sigaction *)0x0);
            iVar2 = *(int *)(param_1 + 0xa82);
            local_78 = CONCAT71(local_78._1_7_,(byte)((uint)iVar2 >> 0x1f));
            if (-1 < iVar2) {
              sigaction(0xd,(sigaction *)0x0,(sigaction *)&local_98);
              local_70.sa_handler = local_98.sa_handler;
              uStack_58 = uStack_80;
              uStack_60 = local_88;
              uStack_68 = 1;
              sigaction(0xd,(sigaction *)&local_70,(sigaction *)0x0);
            }
          }
          bVar9 = false;
          uVar6 = 0;
          do {
            local_70.sa_handler = (__sighandler_t)((ulong)local_70.sa_handler & 0xffffffff00000000);
            iVar2 = curl_multi_poll(uVar8,0,0,1000,0);
            if (iVar2 == 0) {
              iVar2 = curl_multi_perform(uVar8,&local_70);
            }
            if ((local_70._0_4_ == 0 && iVar2 == 0) &&
               (lVar5 = curl_multi_info_read(uVar8,auStack_9c), lVar5 != 0)) {
              uVar6 = *(undefined4 *)(lVar5 + 0x10);
              bVar9 = true;
            }
          } while ((iVar2 == 0) && (!bVar9));
          uVar7 = 0x1b;
          if (iVar2 != 3) {
            uVar7 = 0x2b;
          }
          if (iVar2 != 0) {
            uVar6 = uVar7;
          }
          param_1 = curl_multi_remove_handle(uVar8,param_1);
          if ((char)local_78 == '\0') {
            uVar3 = sigaction(0xd,(sigaction *)&local_98,(sigaction *)0x0);
            param_1 = (ulong)uVar3;
          }
        }
        else {
          param_1 = curl_multi_cleanup(uVar8);
          uVar6 = 0x1b;
          if (iVar2 != 3) {
            uVar6 = 2;
          }
        }
      }
      else {
        uVar6 = 0x5d;
        param_1 = uVar4;
      }
    }
    else {
      param_1 = FUN_00904b80(param_1,"easy handle already used in multi handle");
      uVar6 = 2;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1);
  }
  return uVar6;
}

