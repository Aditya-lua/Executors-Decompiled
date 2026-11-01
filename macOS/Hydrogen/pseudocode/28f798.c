
void FUN_0028f798(long param_1)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 unaff_x19;
  undefined *unaff_x20;
  long unaff_x21;
  char *unaff_x22;
  undefined1 *unaff_x23;
  char *unaff_x24;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  
  do {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
      return;
    }
    uVar4 = ___stack_chk_fail();
    *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x28;
    *(undefined8 *)((long)register0x00000008 + -0x48) = unaff_x27;
    *(char **)((long)register0x00000008 + -0x40) = unaff_x24;
    *(undefined1 **)((long)register0x00000008 + -0x38) = unaff_x23;
    *(char **)((long)register0x00000008 + -0x30) = unaff_x22;
    *(long *)((long)register0x00000008 + -0x28) = unaff_x21;
    *(undefined **)((long)register0x00000008 + -0x20) = unaff_x20;
    *(undefined8 *)((long)register0x00000008 + -0x18) = unaff_x19;
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = 0x28f800;
    unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
    *(undefined8 *)((long)register0x00000008 + -0x58) =
         *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    unaff_x21 = func_0x00373eb8(0);
    if (((unaff_x21 == 0) && (unaff_x21 = _calloc(1,400), unaff_x21 != 0)) &&
       (iVar2 = func_0x00373f5c(0,unaff_x21,&DAT_00290080), iVar2 == 0)) {
      unaff_x21 = 0;
    }
    unaff_x23 = (undefined1 *)((long)register0x00000008 + -0xd0);
    unaff_x24 = "";
    unaff_x22 = "%lu:%s:%s:%d:%s\n";
    do {
      uVar3 = func_0x0028ebe8(1,0,(undefined1 *)((long)register0x00000008 + -0x4d8),
                              (undefined1 *)((long)register0x00000008 + -0x4e4),
                              (undefined1 *)((long)register0x00000008 + -0x4e0),
                              (undefined1 *)((long)register0x00000008 + -0x4e8));
      if ((int)uVar3 == 0) break;
      func_0x0028f43c(uVar3,(undefined1 *)((long)register0x00000008 + -0xd0),0x78);
      pcVar1 = "";
      if ((*(uint *)((long)register0x00000008 + -0x4e8) & 1) != 0) {
        pcVar1 = *(char **)((long)register0x00000008 + -0x4e0);
      }
      *(ulong *)((long)register0x00000008 + -0x4f8) =
           (ulong)*(uint *)((long)register0x00000008 + -0x4e4);
      *(char **)((long)register0x00000008 + -0x4f0) = pcVar1;
      *(undefined1 **)((long)register0x00000008 + -0x508) = unaff_x23;
      *(undefined8 *)((long)register0x00000008 + -0x500) =
           *(undefined8 *)((long)register0x00000008 + -0x4d8);
      *(long *)((long)register0x00000008 + -0x510) = unaff_x21;
      _snprintf((undefined1 *)((long)register0x00000008 + -0x4d0),0x400,"%lu:%s:%s:%d:%s\n");
      uVar3 = _strlen((undefined1 *)((long)register0x00000008 + -0x4d0));
      iVar2 = (*(code *)&DAT_0028f810)
                        ((undefined1 *)((long)register0x00000008 + -0x4d0),uVar3,uVar4);
    } while (0 < iVar2);
    param_1 = *(long *)((long)register0x00000008 + -0x58);
    register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x510);
    unaff_x19 = uVar4;
    unaff_x20 = &DAT_0028f810;
  } while( true );
}

