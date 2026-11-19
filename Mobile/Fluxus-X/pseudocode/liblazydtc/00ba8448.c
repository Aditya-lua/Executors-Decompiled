/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8448
 */

void FUN_00ba8448(int param_1,uint param_2,void *param_3,ulong param_4,undefined2 *param_5)

{
  undefined1 *puVar1;
  undefined2 *puVar2;
  long lVar3;
  char cVar4;
  ulong __n;
  byte bVar5;
  int iVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong __n_00;
  size_t __n_01;
  void *local_78;
  ulong local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  __n_00 = (ulong)param_2;
  local_78 = (void *)0x0;
  local_70 = 0;
  if (param_1 == 0) {
    uVar8 = __n_00;
    if (__n_00 <= param_4) goto LAB_00ba8518;
  }
  else {
    mbedtls_md_info_from_type(param_1);
    bVar5 = mbedtls_md_get_size();
    if (bVar5 != 0) {
      iVar6 = mbedtls_oid_get_oid_by_md(param_1,&local_78,&local_70);
      uVar7 = 0xffffbf80;
      if ((((bVar5 != param_2) || (iVar6 != 0)) || (uVar7 = 0xffffbf80, 0xfffffff5 < param_2)) ||
         (0x7f < local_70 + (param_2 + 8))) goto LAB_00ba85e0;
      uVar8 = local_70 + (param_2 + 10);
      uVar7 = 0xffffbf80;
      if ((CARRY8(local_70,(ulong)(param_2 + 10))) || (param_4 < uVar8)) goto LAB_00ba85e0;
LAB_00ba8518:
      __n = local_70;
      if (10 < param_4 - uVar8) {
        __n_01 = (param_4 - uVar8) - 3;
        *param_5 = 0x100;
        memset(param_5 + 1,0xff,__n_01);
        puVar1 = (undefined1 *)((long)(param_5 + 1) + __n_01);
        *puVar1 = 0;
        if (param_1 == 0) {
          memcpy(puVar1 + 1,param_3,__n_00);
        }
        else {
          cVar4 = (char)__n;
          puVar1[1] = 0x30;
          puVar1[3] = 0x30;
          puVar1[4] = cVar4 + '\x04';
          puVar1[5] = 6;
          puVar1[2] = (char)param_2 + cVar4 + '\b';
          puVar1[6] = cVar4;
          memcpy(puVar1 + 7,local_78,__n);
          puVar2 = (undefined2 *)(puVar1 + 7 + __n);
          *puVar2 = 5;
          *(undefined1 *)(puVar2 + 1) = 4;
          *(char *)((long)puVar2 + 3) = (char)param_2;
          memcpy(puVar2 + 2,param_3,__n_00);
          if ((undefined1 *)((long)(puVar2 + 2) + __n_00) != (undefined1 *)((long)param_5 + param_4)
             ) {
            mbedtls_platform_zeroize(param_5,param_4);
            goto LAB_00ba85dc;
          }
        }
        uVar7 = 0;
        goto LAB_00ba85e0;
      }
    }
  }
LAB_00ba85dc:
  uVar7 = 0xffffbf80;
LAB_00ba85e0:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

