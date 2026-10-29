/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa148..0xaaa244 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_aaa148(unsigned long long *a0, unsigned int *a1)
{
    unsigned long long v0;  // x13
    unsigned long long v1;  // x8
    unsigned int v10;  // w16
    unsigned int v11;  // w10
    unsigned int v12;  // w16
    unsigned int v13;  // w8
    unsigned int *v14;  // x16
    unsigned int v15;  // w15
    unsigned int v16;  // w9
    unsigned int v18;  // w12
    unsigned long long v2;  // x10
    unsigned long long v3;  // x9
    unsigned int v4;  // w12
    unsigned int i;  // w14
    unsigned int *v6;  // x15
    unsigned int v7;  // w14
    unsigned int v8;  // w16
    unsigned int v9;  // w13

    v0 = *a0;
    v1 = a0[1];
    v2 = *a0 >> 16;
    v3 = a0[1] >> 16;
    v4 = 3;
    i = 5;
    v6 = a1;
    while (1)
    {
        do
        {
            v7 = i;
            v8 = ((unsigned int)v2 & ~(unsigned int)v3) + (unsigned int)v0 + ((unsigned int)v3 & (unsigned int)v1) + *v6;
            v9 = (v8 * 0x20000 | v8 >> 15) & 0xfffe0001 & 1;
            v0 = v9 & 0xfffe0000 | (v9 & 0xfffe0001 | (v8 * 2 | v8 >> 31) & 0x1fffe) & 0x1ffff;
            v10 = v6[1] + (unsigned int)v2 + ((unsigned int)v1 & ~(unsigned int)v0) + ((unsigned int)v0 & (unsigned int)v3);
            v11 = (v10 * 0x40000 | v10 >> 14) & 0xfffc0003 & 3;
            v2 = v11 & 0xfffc0000 | (v11 & 0xfffc0003 | (v10 * 4 | v10 >> 30) & 0x3fffc) & 0x3ffff;
            v12 = v6[2] + (unsigned int)v1 + ((unsigned int)v3 & ~(unsigned int)v2) + ((unsigned int)v2 & (unsigned int)v0);
            v13 = (v12 * 0x80000 | v12 >> 13) & 0xfff80007 & 7;
            v1 = v13 & 0xfff80000 | (v13 & 0xfff80007 | (v12 * 8 | v12 >> 29) & 0x7fff8) & 0x7ffff;
            v14 = v6 + 4;
            v15 = v6[3] + (unsigned int)v3 + ((unsigned int)v0 & ~(unsigned int)v1) + ((unsigned int)v1 & (unsigned int)v2);
            v16 = (v15 * 0x200000 | v15 >> 11) & 0xffe0001f & 31;
            v3 = v16 & 0xffe00000 | (v16 & 0xffe0001f | (v15 * 32 | v15 >> 27) & 0x1fffe0) & 0x1fffff;
            v6 = v14;
            i = v7 - 1;
        } while (i);
        v18 = v4 - 1;
        if (v4 == 1)
            break;
        if (v18 != 2)
            i = 5;
        else
            i = 6;
        v0 += a1[(unsigned int)v3 & 63];
        v2 += a1[(unsigned int)v0 & 63];
        v1 += a1[(unsigned int)v2 & 63];
        v3 += a1[(unsigned int)v1 & 63];
        v4 = v18;
        v6 = v14;
    }
    *a0 = (unsigned int)v0 & 0xffff | __ROL__((unsigned int)v2, 16) & 0xffff0000;
    a0[1] = (unsigned int)v1 & 0xffff | __ROL__((unsigned int)v3, 16) & 0xffff0000;
    return a0;
}
