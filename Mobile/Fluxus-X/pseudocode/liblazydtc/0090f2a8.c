/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090f2a8
 */

int FUN_0090f2a8(char *param_1,char *param_2,addrinfo *param_3,long *param_4)

{
  long lVar1;
  int iVar2;
  size_t sVar3;
  undefined8 *puVar4;
  char *pcVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  size_t __n;
  undefined8 *puVar8;
  addrinfo *paVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  addrinfo *local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *param_4 = 0;
  iVar2 = getaddrinfo(param_1,param_2,param_3,&local_70);
  if (iVar2 != 0) goto LAB_0090f42c;
  if (local_70 == (addrinfo *)0x0) {
    puVar7 = (undefined8 *)0x0;
LAB_0090f41c:
    iVar2 = 8;
  }
  else {
    puVar7 = (undefined8 *)0x0;
    paVar9 = local_70;
    puVar8 = (undefined8 *)0x0;
    do {
      while( true ) {
        if (paVar9->ai_addr == (sockaddr *)0x0) {
          sVar3 = 0;
        }
        else {
          sVar3 = strlen((char *)paVar9->ai_addr);
          sVar3 = sVar3 + 1;
        }
        if (paVar9->ai_family == 2) break;
        if (paVar9->ai_family == 10) {
          __n = 0x1c;
          pcVar5 = paVar9->ai_canonname;
          goto joined_r0x0090f3d0;
        }
LAB_0090f3d4:
        paVar9 = paVar9->ai_next;
        puVar6 = puVar7;
        if (paVar9 == (addrinfo *)0x0) goto LAB_0090f3dc;
      }
      __n = 0x10;
      pcVar5 = paVar9->ai_canonname;
joined_r0x0090f3d0:
      if (((pcVar5 == (char *)0x0) || (paVar9->ai_addrlen == 0)) || (paVar9->ai_addrlen < __n))
      goto LAB_0090f3d4;
      puVar4 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(sVar3 + __n + 0x30);
      if (puVar4 == (undefined8 *)0x0) {
        iVar2 = 6;
        if (local_70 == (addrinfo *)0x0) goto LAB_0090f3ec;
        goto LAB_0090f3e8;
      }
      uVar11 = *(undefined8 *)&paVar9->ai_socktype;
      uVar10 = *(undefined8 *)paVar9;
      puVar6 = puVar4 + 6;
      *(int *)(puVar4 + 2) = (int)__n;
      puVar4[4] = puVar6;
      puVar4[5] = 0;
      puVar4[1] = uVar11;
      *puVar4 = uVar10;
      puVar4[3] = 0;
      memcpy(puVar6,paVar9->ai_canonname,__n);
      if (sVar3 != 0) {
        puVar4[3] = (void *)((long)puVar6 + __n);
        memcpy((void *)((long)puVar6 + __n),paVar9->ai_addr,sVar3);
      }
      puVar6 = puVar4;
      if (puVar7 != (undefined8 *)0x0) {
        puVar6 = puVar7;
      }
      if (puVar8 != (undefined8 *)0x0) {
        puVar8[5] = puVar4;
      }
      paVar9 = paVar9->ai_next;
      puVar7 = puVar6;
      puVar8 = puVar4;
    } while (paVar9 != (addrinfo *)0x0);
LAB_0090f3dc:
    iVar2 = 0;
    puVar7 = puVar6;
    if (local_70 != (addrinfo *)0x0) {
LAB_0090f3e8:
      freeaddrinfo(local_70);
    }
LAB_0090f3ec:
    if (iVar2 == 0) {
      if (puVar7 == (undefined8 *)0x0) goto LAB_0090f41c;
    }
    else if (puVar7 != (undefined8 *)0x0) {
      do {
        puVar8 = (undefined8 *)puVar7[5];
        (*(code *)PTR_free_00cc4678)(puVar7);
        puVar7 = puVar8;
      } while (puVar8 != (undefined8 *)0x0);
      puVar7 = (undefined8 *)0x0;
    }
  }
  *param_4 = (long)puVar7;
LAB_0090f42c:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

