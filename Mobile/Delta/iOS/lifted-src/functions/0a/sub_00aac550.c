/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaac550..0xaac61c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aac550(unsigned int *a0, void* a1)
{
    unsigned int *v2;  // x21
    unsigned long v3;  // x9
    unsigned long v4;  // x8
    unsigned int v5;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1 + 28;
    v3 = (int)a1[92];
    *((char *)v2 + v3) = 128;
    v4 = v3 + 1;
    if ((unsigned int)v3 >= 56)
    {
        _bzero((char *)v2 + v4, 63 - v3);
        sub_aaae94(a1, v2, 1);
        v4 = 0;
    }
    _bzero((char *)v2 + v4, 56 - v4);
    v5 = (int)a1[24];
    *(int *)&a1[84] = (int)a1[20];
    *(unsigned int *)&a1[88] = v5;
    sub_aaae94(a1, v2, 1);
    *(unsigned int *)&a1[92] = 0;
    sub_a66ec0(v2, 64);
    *a0 = *(int *)a1;
    a0[1] = (int)a1[4];
    a0[2] = (int)a1[8];
    a0[3] = (int)a1[12];
    a0[4] = (int)a1[16];
    return 1;
}
