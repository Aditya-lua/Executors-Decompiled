
long * FUN_0062b188(void)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long lVar4;
  long unaff_x21;
  long lVar5;
  long unaff_x22;
  
  do {
    func_0x00611644();
    lVar4 = unaff_x22;
    do {
      unaff_x22 = lVar4 + -0x20;
      if (unaff_x22 == unaff_x21) {
        unaff_x19[1] = unaff_x21;
        __ZdlPv(*unaff_x19);
        __Unwind_Resume();
        plVar1 = (long *)func_0x0001753c();
        lVar4 = *plVar1;
        if (lVar4 != 0) {
          lVar5 = plVar1[1];
          lVar2 = lVar4;
          if (lVar5 != lVar4) {
            do {
              lVar2 = *(long *)(lVar5 + -8);
              uVar3 = *(ulong *)(lVar5 + -0x18);
              if (*(ulong *)(lVar5 + -0x10) <= *(ulong *)(lVar5 + -0x18)) {
                uVar3 = *(ulong *)(lVar5 + -0x10);
              }
              if (lVar2 != 0) {
                if (uVar3 != 0) {
                  do {
                    *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
                    uVar3 = uVar3 - 1;
                  } while (uVar3 != 0);
                }
                func_0x00611644();
              }
              lVar5 = lVar5 + -0x20;
            } while (lVar5 != lVar4);
            lVar2 = *plVar1;
          }
          plVar1[1] = lVar4;
          __ZdlPv(lVar2);
        }
        return plVar1;
      }
      lVar2 = *(long *)(lVar4 + -0x28);
      uVar3 = *(ulong *)(lVar4 + -0x38);
      if (*(ulong *)(lVar4 + -0x30) <= *(ulong *)(lVar4 + -0x38)) {
        uVar3 = *(ulong *)(lVar4 + -0x30);
      }
      lVar4 = unaff_x22;
    } while (lVar2 == 0);
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
  } while( true );
}

