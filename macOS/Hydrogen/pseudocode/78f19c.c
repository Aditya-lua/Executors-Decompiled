
void FUN_0078f19c(char *param_1)

{
  char cVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long *unaff_x19;
  byte unaff_w20;
  undefined8 *unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x26;
  ulong unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined1 auStack_7ffffffe [2147483622];
  
  while (param_1 != (char *)0x0) {
LAB_0078f12c:
    for (; *param_1 == ' ' || *param_1 == '\t'; param_1 = param_1 + 1) {
    }
    iVar2 = func_0x0077e6f8(param_1,"auth");
    if (iVar2 == 0) {
      iVar2 = func_0x0077e6f8(param_1,"auth-int");
      unaff_w20 = iVar2 != 0 | unaff_w20;
      param_1 = (char *)_strtok_r(0);
    }
    else {
      unaff_x28 = 1;
      param_1 = (char *)_strtok_r(0);
    }
  }
code_r0x0078f1a4:
  (*(code *)*unaff_x23)(unaff_x24);
  if ((unaff_x28 & 1) == 0) {
    if ((unaff_w20 & 1) == 0) goto code_r0x0078efec;
    (*(code *)*unaff_x23)(unaff_x19[4]);
    lVar3 = (*(code *)*unaff_x26)("auth-int");
    unaff_x19[4] = lVar3;
  }
  else {
    (*(code *)*unaff_x23)(unaff_x19[4]);
    lVar3 = (*(code *)*unaff_x26)("auth");
    unaff_x19[4] = lVar3;
  }
joined_r0x0078f1d8:
  do {
    if (lVar3 == 0) {
LAB_0078f37c:
      uVar4 = 0x1b;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return;
      }
code_r0x0078f3d4:
      puVar5 = (undefined8 *)___stack_chk_fail(uVar4);
      (*pcRam0000000000a2b5f0)(*puVar5);
      *puVar5 = 0;
      (*pcRam0000000000a2b5f0)(puVar5[1]);
      puVar5[1] = 0;
      (*pcRam0000000000a2b5f0)(puVar5[2]);
      puVar5[2] = 0;
      (*pcRam0000000000a2b5f0)(puVar5[3]);
      puVar5[3] = 0;
      (*pcRam0000000000a2b5f0)(puVar5[4]);
      puVar5[4] = 0;
      (*pcRam0000000000a2b5f0)(puVar5[5]);
      puVar5[5] = 0;
      *(undefined4 *)(puVar5 + 6) = 0;
      *(undefined1 *)((long)puVar5 + 0x34) = 0;
      *(byte *)((long)puVar5 + 0x35) = *(byte *)((long)puVar5 + 0x35) & 0xfc;
      return;
    }
code_r0x0078efec:
    for (; (cVar1 = *uStack0000000000000018, cVar1 == '\t' || (cVar1 == ' '));
        uStack0000000000000018 = uStack0000000000000018 + 1) {
    }
    if (cVar1 == ',') {
      uStack0000000000000018 = uStack0000000000000018 + 1;
    }
    if (*uStack0000000000000018 == ' ' || *uStack0000000000000018 == '\t') {
      do {
        uStack0000000000000018 = uStack0000000000000018 + 1;
      } while (*uStack0000000000000018 == ' ' || *uStack0000000000000018 == '\t');
    }
    iVar2 = func_0x0078e1ac(uStack0000000000000018,auStack_7ffffffe + 0x8000041e,
                            &uStack0000000000000020,&uStack0000000000000018);
    if (iVar2 == 0) {
      if ((((in_stack_00000008 == 0) || ((*(byte *)((long)unaff_x19 + 0x35) & 1) != 0)) &&
          (*unaff_x19 != 0)) &&
         ((unaff_x19[4] != 0 || ((*(byte *)((long)unaff_x19 + 0x34) & 1) == 0)))) {
        uVar4 = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return;
        }
      }
      else {
code_r0x0078f3b8:
        uVar4 = 0x3d;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return;
        }
      }
      goto code_r0x0078f3d4;
    }
    iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e);
    if (iVar2 == 0) {
      iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e);
      if (iVar2 == 0) {
        iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"realm");
        if (iVar2 != 0) {
          (*(code *)*unaff_x23)(unaff_x19[2]);
          lVar3 = (*(code *)*unaff_x26)(&uStack0000000000000020);
          unaff_x19[2] = lVar3;
          goto joined_r0x0078f1d8;
        }
        iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"opaque");
        if (iVar2 != 0) {
          (*(code *)*unaff_x23)(unaff_x19[3]);
          lVar3 = (*(code *)*unaff_x26)(&uStack0000000000000020);
          unaff_x19[3] = lVar3;
          goto joined_r0x0078f1d8;
        }
        iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"qop");
        if (iVar2 != 0) {
          unaff_x24 = (*(code *)*unaff_x26)(&uStack0000000000000020);
          if (unaff_x24 == 0) goto LAB_0078f37c;
          param_1 = (char *)_strtok_r();
          if (param_1 != (char *)0x0) goto LAB_0078f12c;
          goto code_r0x0078f1a4;
        }
        iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"algorithm");
        if (iVar2 == 0) {
          iVar2 = func_0x0077e6f8(auStack_7ffffffe + 0x8000041e,"userhash");
          if ((iVar2 != 0) && (iVar2 = func_0x0077e6f8(&uStack0000000000000020,"true"), iVar2 != 0))
          {
            *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) | 2;
          }
        }
        else {
          (*(code *)*unaff_x23)(unaff_x19[5]);
          lVar3 = (*(code *)*unaff_x26)(&uStack0000000000000020);
          unaff_x19[5] = lVar3;
          if (lVar3 == 0) goto LAB_0078f37c;
          iVar2 = func_0x0077e6f8(&uStack0000000000000020,"MD5-sess");
          if (iVar2 == 0) {
            iVar2 = func_0x0077e6f8(&uStack0000000000000020,"MD5");
            if (iVar2 == 0) {
              iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-256");
              if (iVar2 == 0) {
                iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-256-SESS");
                if (iVar2 == 0) {
                  iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-512-256");
                  if (iVar2 == 0) {
                    iVar2 = func_0x0077e6f8(&uStack0000000000000020,"SHA-512-256-SESS");
                    if (iVar2 == 0) goto code_r0x0078f3b8;
                    *(undefined1 *)((long)unaff_x19 + 0x34) = 5;
                  }
                  else {
                    *(undefined1 *)((long)unaff_x19 + 0x34) = 4;
                  }
                }
                else {
                  *(undefined1 *)((long)unaff_x19 + 0x34) = 3;
                }
              }
              else {
                *(undefined1 *)((long)unaff_x19 + 0x34) = 2;
              }
            }
            else {
              *(undefined1 *)((long)unaff_x19 + 0x34) = 0;
            }
          }
          else {
            *(undefined1 *)((long)unaff_x19 + 0x34) = 1;
          }
        }
      }
      else {
        iVar2 = func_0x0077e6f8(&uStack0000000000000020,"true");
        if (iVar2 != 0) {
          *(byte *)((long)unaff_x19 + 0x35) = *(byte *)((long)unaff_x19 + 0x35) | 1;
          *(undefined4 *)(unaff_x19 + 6) = 1;
        }
      }
      goto code_r0x0078efec;
    }
    (*(code *)*unaff_x23)(*unaff_x19);
    lVar3 = (*(code *)*unaff_x26)(&uStack0000000000000020);
    *unaff_x19 = lVar3;
  } while( true );
}

