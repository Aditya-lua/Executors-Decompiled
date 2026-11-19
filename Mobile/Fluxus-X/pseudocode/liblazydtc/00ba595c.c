/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba595c
 */

ulong mbedtls_rsa_complete(long param_1)

{
  bool bVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  bool bVar7;
  bool bVar8;
  bool bVar9;
  bool bVar10;
  bool bVar11;
  bool bVar12;
  bool bVar13;
  int iVar14;
  int iVar15;
  int iVar16;
  int iVar17;
  int iVar18;
  int iVar19;
  undefined8 uVar20;
  ulong uVar21;
  
  lVar2 = param_1 + 0x10;
  iVar14 = mbedtls_mpi_cmp_int(lVar2,0);
  lVar3 = param_1 + 0x40;
  iVar15 = mbedtls_mpi_cmp_int(lVar3,0);
  bVar10 = iVar15 != 0;
  lVar4 = param_1 + 0x50;
  iVar16 = mbedtls_mpi_cmp_int(lVar4,0);
  bVar11 = iVar16 != 0;
  lVar5 = param_1 + 0x30;
  iVar17 = mbedtls_mpi_cmp_int(lVar5,0);
  bVar12 = iVar17 == 0;
  lVar6 = param_1 + 0x20;
  bVar1 = !bVar12;
  iVar17 = mbedtls_mpi_cmp_int(lVar6,0);
  bVar13 = iVar17 != 0;
  iVar17 = mbedtls_mpi_cmp_int(param_1 + 0x60,0);
  iVar18 = mbedtls_mpi_cmp_int(param_1 + 0x70,0);
  iVar19 = mbedtls_mpi_cmp_int(param_1 + 0x80,0);
  bVar7 = iVar14 != 0;
  bVar8 = iVar16 == 0;
  bVar9 = iVar15 == 0;
  if ((!bVar13 || (bVar1 || (iVar14 == 0 || (iVar16 != 0 || iVar15 != 0)))) &&
     (!bVar13 ||
      ((!bVar10 || !bVar11) || !bVar12) &&
      (!bVar1 || (!bVar10 || !bVar11) && (!bVar7 || (!bVar8 || !bVar9))))) {
    return 0xffffbf80;
  }
  if (((iVar14 == 0) && (iVar15 != 0)) && (iVar16 != 0)) {
    iVar14 = mbedtls_mpi_mul_mpi(lVar2,lVar3,lVar4);
    if (iVar14 != 0) goto LAB_00ba5b64;
    uVar20 = mbedtls_mpi_size(lVar2);
    *(undefined8 *)(param_1 + 8) = uVar20;
  }
  if (bVar13 && (bVar1 && (bVar7 && (bVar8 && bVar9)))) {
    iVar14 = mbedtls_rsa_deduce_primes(lVar2,lVar6,lVar5,lVar3,lVar4);
joined_r0x00ba5b18:
    if (iVar14 != 0) goto LAB_00ba5b64;
  }
  else if (bVar13 && ((bVar10 && bVar11) && bVar12)) {
    iVar14 = mbedtls_rsa_deduce_private_exponent(lVar3,lVar4,lVar6,lVar5);
    goto joined_r0x00ba5b18;
  }
  if ((((iVar17 != 0 && iVar18 != 0) && iVar19 != 0) ||
      (!bVar13 ||
       ((!bVar10 || !bVar11) || !bVar12) &&
       (!bVar1 || (!bVar10 || !bVar11) && (!bVar7 || (!bVar8 || !bVar9))))) ||
     (iVar14 = mbedtls_rsa_deduce_crt
                         (lVar3,lVar4,lVar5,param_1 + 0x60,param_1 + 0x70,param_1 + 0x80),
     iVar14 == 0)) {
    uVar21 = FUN_00ba6554(param_1,bVar13 && ((bVar10 && bVar11) && bVar12 ||
                                            bVar1 && (bVar10 && bVar11 || bVar7 && (bVar8 && bVar9))
                                            ));
    return uVar21;
  }
LAB_00ba5b64:
  return (ulong)(iVar14 - 0x4080);
}

