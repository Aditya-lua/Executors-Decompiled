
/* WARNING: Type propagation algorithm not settling */

undefined8 thunk_FUN_00753408(void)

{
  linkedit_data_command *plVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  byte bVar5;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  char *pcVar6;
  long *unaff_x23;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  while ((iVar2 = func_0x0077e76c(*unaff_x23), iVar2 == 0 ||
         ((*(byte *)(*unaff_x23 + 0x13) & 0xfe) != 0x3a))) {
    unaff_x23 = (long *)unaff_x23[1];
    if (unaff_x23 == (long *)0x0) {
      uStack0000000000000020 = 0;
      uStack0000000000000028 = 0;
      plVar1 = &linkedit_data_command_00001328;
      if (unaff_w21 == 0) {
        plVar1 = (linkedit_data_command *)&dylib_command_000012d0.dylib.current_version;
      }
      lVar3 = func_0x00764704("%s:%s");
      if (lVar3 == 0) {
        return 0x1b;
      }
      uVar4 = _strlen();
      uVar4 = func_0x00729570(lVar3,uVar4,&uStack0000000000000020,&uStack0000000000000028);
      if ((int)uVar4 == 0) {
        if (uStack0000000000000020 == 0) {
          uVar4 = 9;
        }
        else {
          (*pcRam0000000000a2b5f0)(*(undefined8 *)((long)&plVar1->cmd + unaff_x20));
          uVar4 = func_0x00764704("%sAuthorization: Basic %s\r\n");
          *(undefined8 *)((long)&plVar1->cmd + unaff_x20) = uVar4;
          (*pcRam0000000000a2b5f0)(uStack0000000000000020);
          if (*(long *)((long)&plVar1->cmd + unaff_x20) != 0) {
            (*pcRam0000000000a2b5f0)(lVar3);
            pcVar6 = "Basic";
code_r0x00753434:
            *(byte *)(unaff_x19 + 0x18) = *(byte *)(unaff_x19 + 0x18) | 1;
            if (*(long *)(unaff_x19 + 8) == 0x40) {
              if ((((unaff_w21 & 1) == 0) && (*(long *)(unaff_x20 + 0x8a0) != 0)) &&
                 (lVar3 = func_0x00782efc(), lVar3 == 0)) {
                (*pcRam0000000000a2b5f0)
                          (*(undefined8 *)
                            ((long)&dylib_command_000012d0.dylib.current_version + unaff_x20));
                lVar3 = func_0x00764704("Authorization: Bearer %s\r\n");
                *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x20) = lVar3;
                if (lVar3 == 0) {
                  return 0x1b;
                }
                pcVar6 = "Bearer";
              }
              *(byte *)(unaff_x19 + 0x18) = *(byte *)(unaff_x19 + 0x18) | 1;
            }
            if (pcVar6 == (char *)0x0) {
              bVar5 = *(byte *)(unaff_x19 + 0x18) & 0xfd;
            }
            else {
              if (((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x20 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x20 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
              bVar5 = ((*(byte *)(unaff_x19 + 0x18) & 1) << 1 | *(byte *)(unaff_x19 + 0x18) & 0xfd)
                      ^ 2;
            }
            *(byte *)(unaff_x19 + 0x18) = bVar5;
            return 0;
          }
          uVar4 = 0x1b;
        }
      }
      (*pcRam0000000000a2b5f0)(lVar3);
      return uVar4;
    }
  }
  pcVar6 = (char *)0x0;
  goto code_r0x00753434;
}

