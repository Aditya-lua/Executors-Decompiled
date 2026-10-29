/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabe458..0xabe540 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_abe458(unsigned int *a0, void* a1)
{
    unsigned int *v2;  // x21
    unsigned long v3;  // x9
    unsigned long v4;  // x8
    unsigned long v5;  // x9
    unsigned long v6;  // x8
    unsigned long v7;  // x8
    unsigned long v8;  // x8
    unsigned long v9;  // x8
    unsigned long v10;  // x8
    unsigned long v11;  // x8
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
        sub_abd100(a1, v2, 1);
        v4 = 0;
    }
    _bzero((char *)v2 + v4, 56 - v4);
    v5 = (int)a1[20];
    v6 = (int)a1[24];
    *(unsigned int *)&a1[84] = (((((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *(unsigned int *)&a1[88] = (((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    sub_abd100(a1, v2, 1);
    *(unsigned int *)&a1[92] = 0;
    sub_a66ec0(v2, 64);
    v7 = *(int *)a1;
    *a0 = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v8 = (int)a1[4];
    a0[1] = (((((v8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v8 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v8 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v9 = (int)a1[8];
    a0[2] = (((((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v10 = (int)a1[12];
    a0[3] = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v11 = (int)a1[16];
    a0[4] = (((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return 1;
}
