
void FUN_00148698(void)

{
  char cVar1;
  long *plVar2;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  undefined8 uStack0000000000000008;
  long *in_stack_00000010;
  
  do {
    if (unaff_x21 == unaff_x20) {
      do {
        plVar2 = (long *)*unaff_x22;
        if (*(char *)((long)unaff_x22 + 0x47) < '\0') {
          __ZdlPv(unaff_x22[6]);
          cVar1 = *(char *)((long)unaff_x22 + 0x27);
        }
        else {
          cVar1 = *(char *)((long)unaff_x22 + 0x27);
        }
        if (cVar1 < '\0') {
          __ZdlPv(unaff_x22[2]);
        }
        __ZdlPv(unaff_x22);
        unaff_x22 = plVar2;
      } while (plVar2 != (long *)0x0);
      return;
    }
    uStack0000000000000008 = unaff_x22 + 2;
    in_stack_00000010 = unaff_x22 + 5;
    func_0x00148904(&uStack0000000000000008,unaff_x21 + 2);
    unaff_x22 = (long *)*unaff_x22;
    func_0x001487ac();
    unaff_x21 = (long *)*unaff_x21;
  } while (unaff_x22 != (long *)0x0);
  for (; unaff_x21 != unaff_x20; unaff_x21 = (long *)*unaff_x21) {
    func_0x001489fc(&uStack0000000000000008);
    func_0x001487ac();
  }
  return;
}

