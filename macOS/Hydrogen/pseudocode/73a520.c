
long FUN_0073a520(void)

{
  long lVar1;
  undefined8 *puVar2;
  long *in_x3;
  int iVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  undefined8 *in_stack_00000008;
  
  *in_x3 = 0;
  lVar1 = _getaddrinfo();
  if ((int)lVar1 == 0) {
    if (in_stack_00000008 == (undefined8 *)0x0) {
      puVar5 = (undefined8 *)0x0;
    }
    else {
      puVar4 = (undefined8 *)0x0;
      puVar7 = in_stack_00000008;
      puVar8 = (undefined8 *)0x0;
      do {
        puVar5 = puVar4;
        if (puVar7[3] == 0) {
          lVar1 = 0;
          iVar3 = *(int *)((long)puVar7 + 4);
          if (iVar3 != 2) goto code_r0x0073a58c;
code_r0x0073a5b4:
          uVar6 = 0x10;
          if (puVar7[4] == 0) goto code_r0x0073a560;
code_r0x0073a5c0:
          if ((*(uint *)(puVar7 + 2) == 0) || (*(uint *)(puVar7 + 2) < uVar6))
          goto code_r0x0073a560;
          puVar2 = (undefined8 *)(*pcRam0000000000a2b5e8)(lVar1 + uVar6 + 0x30);
          if (puVar2 != (undefined8 *)0x0) {
            uVar9 = *puVar7;
            puVar2[1] = puVar7[1];
            *puVar2 = uVar9;
            puVar2[3] = 0;
            *(int *)(puVar2 + 2) = (int)uVar6;
            puVar5 = puVar2 + 6;
            puVar2[4] = 0;
            puVar2[5] = 0;
            puVar2[4] = puVar5;
            _memcpy(puVar5,puVar7[4],uVar6);
            if (lVar1 != 0) {
              puVar2[3] = (long)puVar5 + uVar6;
              _memcpy((long)puVar5 + uVar6,puVar7[3],lVar1);
            }
            puVar5 = puVar2;
            if (puVar4 != (undefined8 *)0x0) {
              puVar5 = puVar4;
            }
            if (puVar8 != (undefined8 *)0x0) {
              puVar8[5] = puVar2;
            }
            goto code_r0x0073a564;
          }
          if (in_stack_00000008 != (undefined8 *)0x0) {
            _freeaddrinfo();
          }
          while (puVar4 != (undefined8 *)0x0) {
            puVar5 = (undefined8 *)puVar4[5];
            (*pcRam0000000000a2b5f0)(puVar4);
            puVar4 = puVar5;
            puVar5 = (undefined8 *)0x0;
          }
          lVar1 = 6;
          goto code_r0x0073a664;
        }
        lVar1 = _strlen();
        lVar1 = lVar1 + 1;
        iVar3 = *(int *)((long)puVar7 + 4);
        if (iVar3 == 2) goto code_r0x0073a5b4;
code_r0x0073a58c:
        if ((iVar3 == 0x1e) && (uVar6 = 0x1c, puVar7[4] != 0)) goto code_r0x0073a5c0;
code_r0x0073a560:
        puVar2 = puVar8;
code_r0x0073a564:
        puVar7 = (undefined8 *)puVar7[5];
        puVar4 = puVar5;
        puVar8 = puVar2;
      } while (puVar7 != (undefined8 *)0x0);
      if (in_stack_00000008 != (undefined8 *)0x0) {
        _freeaddrinfo();
      }
    }
    lVar1 = (ulong)(puVar5 == (undefined8 *)0x0) << 3;
code_r0x0073a664:
    *in_x3 = (long)puVar5;
  }
  return lVar1;
}

