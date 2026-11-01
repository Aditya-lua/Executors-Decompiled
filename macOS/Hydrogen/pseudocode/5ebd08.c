
void FUN_005ebd08(void)

{
  char cVar1;
  char cVar2;
  char cVar3;
  long *plVar4;
  code *in_x9;
  char *unaff_x19;
  code *unaff_x23;
  
  cVar3 = (*in_x9)();
  cVar2 = *unaff_x19;
  cVar1 = cVar2;
  if (cVar2 != cVar3) {
    cVar1 = '\x01';
  }
  if (cVar2 != '\x03') {
    cVar3 = cVar1;
  }
  *unaff_x19 = cVar3;
  plVar4 = (long *)(*unaff_x23)();
  *plVar4 = *plVar4 + -1;
  *(undefined1 *)(plVar4 + 4) = 1;
  return;
}

