
undefined8 FUN_0007053c(void)

{
  int iVar1;
  long lVar2;
  int *unaff_x19;
  undefined8 in_stack_00000060;
  
  _munmap();
  unaff_x19[4] = 0;
  unaff_x19[5] = 0;
  if (*unaff_x19 != -1) {
    _close();
    *unaff_x19 = -1;
  }
  unaff_x19[2] = 0;
  unaff_x19[3] = 0;
  iVar1 = _open();
  *unaff_x19 = iVar1;
  if (iVar1 == -1) {
    return 0;
  }
  iVar1 = _fstat();
  if (iVar1 == -1) {
    if (*(long *)(unaff_x19 + 4) != 0) {
      _munmap(*(long *)(unaff_x19 + 4),*(undefined8 *)(unaff_x19 + 2));
      unaff_x19[4] = 0;
      unaff_x19[5] = 0;
    }
    if (*unaff_x19 != -1) {
      _close();
      *unaff_x19 = -1;
    }
    unaff_x19[2] = 0;
    unaff_x19[3] = 0;
    return 0;
  }
  *(undefined8 *)(unaff_x19 + 2) = in_stack_00000060;
  lVar2 = _mmap(0,in_stack_00000060,1,2,*unaff_x19,0);
  *(long *)(unaff_x19 + 4) = lVar2;
  if ((lVar2 != -1) || (*(long *)(unaff_x19 + 2) != 0)) {
    return 1;
  }
  _munmap(0xffffffffffffffff,0);
  unaff_x19[4] = 0;
  unaff_x19[5] = 0;
  if (*unaff_x19 != -1) {
    _close();
    *unaff_x19 = -1;
  }
  unaff_x19[2] = 0;
  unaff_x19[3] = 0;
  *(undefined1 *)(unaff_x19 + 6) = 1;
  return 0;
}

