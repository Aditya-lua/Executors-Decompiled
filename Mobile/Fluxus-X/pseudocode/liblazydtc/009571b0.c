/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009571b0
 */

int FUN_009571b0(long param_1,undefined1 *param_2)

{
  undefined2 *puVar1;
  undefined1 *puVar2;
  byte bVar3;
  char *__s;
  long lVar4;
  long lVar5;
  int iVar6;
  size_t __n;
  size_t __n_00;
  undefined1 *__s_00;
  size_t sVar7;
  long lVar8;
  char *pcVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long *plVar13;
  size_t __n_01;
  byte local_84 [4];
  long local_80;
  undefined5 uStack_78;
  undefined3 local_73;
  undefined4 uStack_70;
  undefined1 uStack_6c;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  *param_2 = 0;
  local_84[0] = 0;
  local_84[1] = 0;
  local_84[2] = 0;
  local_84[3] = 0;
  uStack_70 = 0;
  uStack_6c = 0;
  uStack_78 = 0x6c727563;
  local_73 = 0;
  pcVar9 = "";
  if (*(char **)(param_1 + 0x12f0) != (char *)0x0) {
    pcVar9 = *(char **)(param_1 + 0x12f0);
  }
  __n = strlen(pcVar9);
  __s = "";
  if (*(char **)(param_1 + 0x12f8) != (char *)0x0) {
    __s = *(char **)(param_1 + 0x12f8);
  }
  __n_00 = strlen(__s);
  lVar4 = 0x10;
  if (__n == 0) {
    lVar4 = 0xe;
  }
  lVar4 = __n_00 + __n + lVar4;
  lVar8 = lVar4 + 2;
  if (__n_00 == 0) {
    lVar8 = lVar4;
  }
  if (lVar8 + 10U == 0) {
    uVar10 = 0;
  }
  else {
    uVar10 = 0;
    uVar11 = lVar8 + 10U;
    do {
      uVar12 = uVar11 >> 7;
      bVar3 = (byte)uVar11 & 0x7f;
      if (uVar12 != 0) {
        bVar3 = (byte)uVar11 | 0x80;
      }
      local_84[uVar10] = bVar3;
      uVar10 = uVar10 + 1;
    } while ((uVar10 < 4) && (uVar11 = uVar12, uVar12 != 0));
  }
  __n_01 = (size_t)(int)uVar10;
  uVar10 = lVar8 + __n_01 + 0xb;
  if (uVar10 >> 0x1c == 0) {
    __s_00 = (undefined1 *)(*(code *)PTR_malloc_00cc4670)(uVar10);
    if (__s_00 == (undefined1 *)0x0) {
      iVar6 = 0x1b;
    }
    else {
      memset(__s_00,0,uVar10);
      *__s_00 = 0x10;
      memcpy(__s_00 + 1,local_84,__n_01);
      *(undefined8 *)(__s_00 + __n_01 + 1) = 0x2045454514d0400;
      *(undefined2 *)(__s_00 + __n_01 + 9) = 0x3c00;
      iVar6 = FUN_00932640(param_1,(ulong)&uStack_78 | 4,9);
      sVar7 = strlen((char *)&uStack_78);
      if (sVar7 == 0xc) {
        puVar1 = (undefined2 *)(__s_00 + __n_01 + 0xb);
        *puVar1 = 0xc00;
        lVar4 = __n_01 + 8;
        *(undefined4 *)(puVar1 + 5) = uStack_70;
        *(ulong *)(puVar1 + 1) = CONCAT35(local_73,uStack_78);
        if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"Using client id \'%s\'",&uStack_78);
        }
        lVar8 = __n + __n_01 + 0x19;
        if (__n != 0) {
          if (__n >> 0x10 != 0) {
            pcVar9 = "Username is too large: [%zu]";
            sVar7 = __n;
            goto LAB_009573e0;
          }
          puVar2 = __s_00 + __n_01 + 0x19;
          lVar8 = lVar8 + 2;
          __s_00[lVar4] = __s_00[lVar4] | 0x80;
          *puVar2 = (char)(__n >> 8);
          puVar2[1] = (char)__n;
          memcpy(puVar2 + 2,pcVar9,__n);
        }
        if (__n_00 != 0) {
          if (__n_00 >> 0x10 != 0) {
            pcVar9 = "Password is too large: [%zu]";
            sVar7 = __n_00;
            goto LAB_009573e0;
          }
          puVar2 = __s_00 + lVar8;
          __s_00[lVar4] = __s_00[lVar4] | 0x40;
          *puVar2 = (char)(__n_00 >> 8);
          puVar2[1] = (char)__n_00;
          memcpy(puVar2 + 2,__s,__n_00);
        }
        if (iVar6 == 0) {
          plVar13 = *(long **)(param_1 + 0x1a0);
          iVar6 = FUN_009434ec(param_1,__s_00,uVar10,&local_80);
          if (iVar6 == 0) {
            FUN_00904a98(param_1,2,__s_00,local_80);
            lVar4 = uVar10 - local_80;
            if (lVar4 == 0) {
              iVar6 = 0;
              *plVar13 = 0;
              plVar13[1] = 0;
            }
            else {
              lVar8 = FUN_009418f0(__s_00 + local_80,lVar4);
              if (lVar8 == 0) {
                iVar6 = 0x1b;
              }
              else {
                iVar6 = 0;
                *plVar13 = lVar8;
                plVar13[1] = lVar4;
              }
            }
          }
        }
      }
      else {
        pcVar9 = "Client ID length mismatched: [%zu]";
LAB_009573e0:
        FUN_00904b80(param_1,pcVar9,sVar7);
        iVar6 = 8;
      }
      (*(code *)PTR_free_00cc4678)(__s_00);
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12f0));
      *(undefined8 *)(param_1 + 0x12f0) = 0;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12f8));
      *(undefined8 *)(param_1 + 0x12f8) = 0;
      if (iVar6 == 0) {
        *(undefined8 *)(*(long *)(param_1 + 0x20) + 0x428) = 0x200000000;
        goto LAB_00957434;
      }
    }
  }
  else {
    iVar6 = 8;
  }
  FUN_00904b80(param_1,"Error %d sending MQTT CONNECT request",iVar6);
LAB_00957434:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

