
undefined8 * FUN_00068df0(void)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  char cVar6;
  long *plVar7;
  int iVar8;
  long *plVar9;
  undefined8 *puVar10;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  
  plVar9 = (long *)__Unwind_Resume();
  bVar5 = *(byte *)((long)plVar9 + 0x17);
  uVar13 = (ulong)bVar5;
  uVar14 = plVar9[1];
  uVar15 = 0;
  uVar1 = uVar14;
  if (-1 < (char)bVar5) {
    uVar1 = uVar13;
  }
  if (uVar1 == 0) {
LAB_00068e64:
    if (uVar15 < uVar1) {
      lVar16 = 0;
      plVar11 = (long *)*plVar9;
      plVar2 = plVar11;
      if (-1 < (char)bVar5) {
        plVar2 = plVar9;
      }
      do {
        uVar17 = uVar15;
        if (uVar15 < uVar1) {
          do {
            cVar6 = *(char *)((long)plVar2 + uVar17);
            if (cVar6 == '\0') {
              return (undefined8 *)0x0;
            }
            if (cVar6 == '/') goto LAB_00068ed0;
            if (cVar6 == '\\') {
              return (undefined8 *)0x0;
            }
            uVar17 = uVar17 + 1;
          } while (uVar1 != uVar17);
          uVar17 = uVar1;
        }
LAB_00068ed0:
        uVar4 = uVar14;
        plVar7 = plVar11;
        if (-1 < (char)bVar5) {
          uVar4 = uVar13;
          plVar7 = plVar9;
        }
        if (uVar4 < uVar15) {
LAB_00068ff8:
          puVar10 = (undefined8 *)func_0x00049dd0(plVar9);
          *puVar10 = &UNK_009b8b58;
          plVar9 = (long *)puVar10[2];
          if (plVar9 != (long *)0x0) {
            LOAcquire();
            lVar16 = plVar9[1];
            plVar9[1] = lVar16 + -1;
            LORelease();
            if (lVar16 == 0) {
              (**(code **)(*plVar9 + 0x10))(plVar9);
              __ZNSt3__119__shared_weak_count14__release_weakEv(plVar9);
              return puVar10;
            }
          }
          return puVar10;
        }
        uVar12 = uVar17 - uVar15;
        uVar3 = uVar4 - uVar15;
        if (uVar12 <= uVar4 - uVar15) {
          uVar3 = uVar12;
        }
        iVar8 = _memcmp((long)plVar7 + uVar15,".",uVar3 != 0);
        if ((uVar3 != 1) || (iVar8 != 0)) {
          uVar4 = uVar14;
          plVar7 = plVar11;
          if (-1 < (char)bVar5) {
            uVar4 = uVar13;
            plVar7 = plVar9;
          }
          if (uVar4 < uVar15) goto LAB_00068ff8;
          uVar3 = uVar4 - uVar15;
          if (uVar12 <= uVar4 - uVar15) {
            uVar3 = uVar12;
          }
          uVar4 = uVar3;
          if (1 < uVar3) {
            uVar4 = 2;
          }
          iVar8 = _memcmp((long)plVar7 + uVar15,"..",uVar4);
          if ((uVar3 == 2) && (iVar8 == 0)) {
            if (lVar16 == 0) {
              return (undefined8 *)0x0;
            }
            lVar16 = lVar16 + -1;
          }
          else {
            lVar16 = lVar16 + 1;
          }
        }
        if (uVar17 < uVar1) {
          while (*(char *)((long)plVar2 + uVar17) == '/') {
            uVar17 = uVar17 + 1;
            if (uVar1 == uVar17) goto LAB_00068fcc;
          }
        }
        uVar15 = uVar17;
        if (uVar1 <= uVar17) {
          return (undefined8 *)((long)&MACH_HEADER.magic + 1);
        }
      } while( true );
    }
  }
  else {
    plVar2 = (long *)*plVar9;
    if (-1 < (char)bVar5) {
      plVar2 = plVar9;
    }
    do {
      if (*(char *)((long)plVar2 + uVar15) != '/') goto LAB_00068e64;
      uVar15 = uVar15 + 1;
    } while (uVar1 != uVar15);
  }
LAB_00068fcc:
  return (undefined8 *)((long)&MACH_HEADER.magic + 1);
}

