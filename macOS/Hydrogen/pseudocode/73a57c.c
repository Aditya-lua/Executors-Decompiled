
long FUN_0073a57c(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  int iVar3;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  undefined8 *unaff_x27;
  undefined8 uVar7;
  long in_stack_00000008;
  
code_r0x0073a57c:
  param_1 = param_1 + 1;
  iVar3 = *(int *)((long)unaff_x25 + 4);
  if (iVar3 == 2) goto LAB_0073a5b4;
  do {
    if (iVar3 == 0x1e) {
      uVar6 = 0x1c;
      puVar4 = unaff_x20;
      puVar5 = unaff_x27;
      if (unaff_x25[4] != 0) goto LAB_0073a5c0;
    }
    while( true ) {
      unaff_x25 = (undefined8 *)unaff_x25[5];
      if (unaff_x25 == (undefined8 *)0x0) {
        if (in_stack_00000008 != 0) {
          _freeaddrinfo();
        }
        lVar2 = (ulong)(unaff_x20 == (undefined8 *)0x0) << 3;
        goto LAB_0073a664;
      }
      if (unaff_x25[3] != 0) {
        param_1 = _strlen();
        goto code_r0x0073a57c;
      }
      param_1 = 0;
      iVar3 = *(int *)((long)unaff_x25 + 4);
      if (iVar3 != 2) break;
LAB_0073a5b4:
      uVar6 = 0x10;
      puVar4 = unaff_x20;
      puVar5 = unaff_x27;
      if (unaff_x25[4] != 0) {
LAB_0073a5c0:
        unaff_x20 = puVar4;
        unaff_x27 = puVar5;
        if ((*(uint *)(unaff_x25 + 2) != 0) && (uVar6 <= *(uint *)(unaff_x25 + 2))) {
          unaff_x27 = (undefined8 *)(*(code *)*unaff_x26)(param_1 + uVar6 + 0x30);
          if (unaff_x27 == (undefined8 *)0x0) {
            if (in_stack_00000008 != 0) {
              _freeaddrinfo();
            }
            while (puVar4 != (undefined8 *)0x0) {
              puVar5 = (undefined8 *)puVar4[5];
              (*pcRam0000000000a2b5f0)(puVar4);
              unaff_x20 = (undefined8 *)0x0;
              puVar4 = puVar5;
            }
            lVar2 = 6;
LAB_0073a664:
            *unaff_x19 = (long)unaff_x20;
            return lVar2;
          }
          uVar7 = *unaff_x25;
          unaff_x27[1] = unaff_x25[1];
          *unaff_x27 = uVar7;
          unaff_x27[3] = 0;
          *(int *)(unaff_x27 + 2) = (int)uVar6;
          puVar1 = unaff_x27 + 6;
          unaff_x27[4] = 0;
          unaff_x27[5] = 0;
          unaff_x27[4] = puVar1;
          _memcpy(puVar1,unaff_x25[4],uVar6);
          if (param_1 != 0) {
            unaff_x27[3] = (long)puVar1 + uVar6;
            _memcpy((long)puVar1 + uVar6,unaff_x25[3],param_1);
          }
          unaff_x20 = unaff_x27;
          if (puVar4 != (undefined8 *)0x0) {
            unaff_x20 = puVar4;
          }
          if (puVar5 != (undefined8 *)0x0) {
            puVar5[5] = unaff_x27;
          }
        }
      }
    }
  } while( true );
}

