/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa244..0xaaa360 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaa244_0 {
    unsigned int field_0;
    char padding_4[232];
    char field_ec;
    char padding_ed[3];
    unsigned int field_f0;
    unsigned int field_f4;
    unsigned int field_f8;
    unsigned int field_fc;
} st_aaa244_0;


unsigned long long * sub_aaa244(unsigned long long *a0, st_aaa244_0 *a1)
{
    unsigned int v0;  // w13
    unsigned int v1;  // w15
    unsigned int v10;  // w2
    unsigned int v11;  // w12
    unsigned int v12;  // w10
    unsigned int v13;  // w13
    unsigned int v2;  // w11
    unsigned int v3;  // w14
    unsigned int *v4;  // x8
    unsigned int v5;  // w10
    unsigned int v6;  // w12
    unsigned int v7;  // w16
    unsigned int v8;  // w17
    unsigned long long v9;  // x15

    v0 = (unsigned int)*a0 & 0xffff;
    v1 = *a0 >> 16;
    v2 = (unsigned int)a0[1] & 0xffff;
    v3 = a0[1] >> 16;
    v4 = &a1->field_fc;
    v5 = 3;
    v6 = 5;
    while (1)
    {
        v7 = (v3 * 0x800 | v3 >> 5) - (v0 & ~v2 | v2 & v1) - *v4;
        v3 = v7 & 0xffff;
        v8 = (v2 * 0x2000 | v2 >> 3) - ((v1 & v0) + *(int *)((char *)v4 - 4)) - (v7 & ~v1);
        v2 = v8 & 0xffff;
        v9 = (v1 * 0x4000 | v1 >> 2) - ((v7 & v0) + *(int *)((char *)v4 - 8)) - (v8 & ~v0);
        v10 = (v0 * 0x8000 | v0 >> 1) - (*(int *)((char *)v4 - 12) + (v8 & v7)) - ((unsigned int)v9 & ~v3);
        v0 = v10 & 0xffff;
        v11 = v6 - 1;
        if (v6 == 1)
        {
            v12 = v5 - 1;
            if (v5 == 1)
                break;
            if (v12 != 2)
                v11 = 5;
            else
                v11 = 6;
            v13 = v7 - (&a1->field_0)[v8 & 63];
            v3 = v13 & 0xffff;
            v2 = v8 - (&a1->field_0)[(unsigned int)v9 & 63] & 0xffff;
            v9 -= (&a1->field_0)[v10 & 63];
            v0 = v10 - (&a1->field_0)[v13 & 63] & 0xffff;
            v5 = v12;
        }
        v1 = (unsigned int)v9 & 0xffff;
        v4 = (char *)v4 - 16;
        v6 = v11;
    }
    *a0 = v0 | (unsigned int)v9 * 0x10000;
    a0[1] = v2 | v7 * 0x10000;
    return a0;
}
