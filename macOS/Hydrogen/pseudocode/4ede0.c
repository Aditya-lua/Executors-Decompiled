
void FUN_0004ede0(long param_1)

{
  long *plVar1;
  bool bVar2;
  int iVar3;
  long in_x9;
  long *unaff_x20;
  long *unaff_x21;
  long *plVar4;
  
  do {
    plVar4 = unaff_x21;
    if (param_1 == in_x9) goto LAB_0004ee24;
    while( true ) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
      if (unaff_x20[3] == unaff_x20[4]) {
        (**(code **)(*unaff_x20 + 0x50))(unaff_x20);
      }
      else {
        unaff_x20[3] = unaff_x20[3] + 1;
      }
      plVar1 = unaff_x20;
      if (unaff_x20 == (long *)0x0) {
        bVar2 = true;
      }
      else if (unaff_x20[3] == unaff_x20[4]) {
        iVar3 = (**(code **)(*unaff_x20 + 0x48))(unaff_x20);
        bVar2 = iVar3 == -1;
        plVar1 = (long *)0x0;
        if (!bVar2) {
          plVar1 = unaff_x20;
        }
      }
      else {
        bVar2 = false;
      }
      unaff_x20 = plVar1;
      if (plVar4 != (long *)0x0) break;
      if (bVar2 != false) {
        return;
      }
      unaff_x21 = (long *)0x0;
      plVar4 = unaff_x21;
      if (unaff_x20[3] == unaff_x20[4]) {
LAB_0004ee24:
        (**(code **)(*unaff_x20 + 0x48))(unaff_x20);
        plVar4 = unaff_x21;
      }
    }
    if (plVar4[3] == plVar4[4]) {
      iVar3 = (**(code **)(*plVar4 + 0x48))(plVar4);
      unaff_x21 = (long *)0x0;
      if (iVar3 != -1) {
        unaff_x21 = plVar4;
      }
      if (bVar2 == (iVar3 == -1)) {
        return;
      }
    }
    else {
      unaff_x21 = plVar4;
      if (bVar2 == false) {
        return;
      }
    }
    param_1 = unaff_x20[3];
    in_x9 = unaff_x20[4];
  } while( true );
}

