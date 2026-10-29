/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5b15c..0x5b3b4 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5b15c_1 {
    char padding_0[1];
    char field_1;
} st_5b15c_1;

typedef struct st_5b15c_0 {
    char field_0;
} st_5b15c_0;

extern unsigned long long g_e693a8;
extern unsigned long long g_e693e0;
extern st_5b15c_1 g_f011d0;

long long sub_5b15c(st_5b15c_1 *a0, unsigned int *a1)
{
    unsigned int v2;  // w17
    unsigned int v3;  // w16
    unsigned int v12;  // w4
    unsigned int v13;  // w4
    unsigned int v14;  // w17
    unsigned int v15;  // w17
    unsigned int v16;  // w3
    unsigned int v17;  // w17
    unsigned int v18;  // w17
    unsigned int v19;  // w17
    unsigned int v20;  // w17
    unsigned int v4;  // w2
    unsigned int v5;  // w3
    unsigned int v6;  // w4
    unsigned int v7;  // w5
    unsigned int v8;  // w6
    unsigned int v9;  // w4
    unsigned int v10;  // w5
    unsigned int v11;  // w2
    st_5b15c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_5b15c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0 == &g_f011d0.padding_0[0])
        return !*(char *)a1;
    v2 = 0;
    while (1)
    {
        v3 = (&a0->field_1)[v2];
        if (v3 == *(char *)a1)
        {
            v4 = v2 + ~v2 * 2;
            v5 = v2 + 1;
            v6 = v4 + v5;
            v7 = (v2 - 1 ^ 0xfffffffe) - (__ROL__(v2 - 1, 1) & 2 & 3) + 1;
            v8 = (v7 ^ v6) + (v6 + (v7 | ~v6)) * 2 + 3;
            v9 = ((v8 ^ (v7 ^ ~v6 | 0xfffffffe)) + (v8 & (v7 ^ ~v6 | 0xfffffffe)) * 2 ^ 1) + (v8 ^ (v7 ^ ~v6 | 0xfffffffe)) + (v8 & (v7 ^ ~v6 | 0xfffffffe)) * 2 + ((v8 ^ (v7 ^ ~v6 | 0xfffffffe)) & 1) + (~((v8 ^ (v7 ^ ~v6 | 0xfffffffe)) + (v8 & (v7 ^ ~v6 | 0xfffffffe)) * 2) | 1) + 1;
            v10 = v2 & 1;
            v11 = (1 & ~(v9 ^ -v10 - (v4 | 1))) + (v9 ^ -v10 - (v4 | 1)) + (v9 & -v10 - (v4 | 1)) * 2 + (~((v9 ^ -v10 - (v4 | 1)) + (v9 & -v10 - (v4 | 1)) * 2) + ((v9 ^ -v10 - (v4 | 1)) + (v9 & -v10 - (v4 | 1)) * 2) * 2 ^ 1) - (~((v9 ^ -v10 - (v4 | 1)) + (v9 & -v10 - (v4 | 1)) * 2) + ((v9 ^ -v10 - (v4 | 1)) + (v9 & -v10 - (v4 | 1)) * 2) * 2 | 1);
            v12 = 0xfffffffe - v2;
            v13 = (__ROL__(v12, 1) & 2 & 3) + (v12 ^ 1);
            v14 = (v2 ^ 1) + (__ROL__(v2, 1) & 2 & 3) + v13 * 4;
            v15 = (unsigned int)((v12 | 1) + v5 - (v5 | 1)) + (v10 + v2) * 2 + (v14 + ~(v13 * 2) + 2 ^ -(v14 - v13 * 2 | 1)) + (v14 + ~(v13 * 2) + 2 & -(v14 - v13 * 2 | 1)) * 2 - ((v14 + ~(v13 * 2) + 2 ^ -(v14 - v13 * 2 | 1)) & 1) + (v14 + ~(v13 * 2) + 2 ^ -(v14 - v13 * 2 | 1) | 0xfffffffe);
            v16 = ((__ROL__(v15 + 3, 1) & 2 & 3) + (v15 + 3 ^ 1)) * 2 - v15 * 4 - 16;
            v17 = (v16 | (unsigned int)(0xfffffffb - v15)) + v15 + (v16 | v15 + 4);
            v18 = (v11 & v17 + 5) + (unsigned int)(0xfffffffa - v17) + (v11 & (unsigned int)(0xfffffffa - v17));
            v19 = v18 + (v18 & 1) + (~v18 | 0xfffffffe) + 2;
            v20 = v19 + (v19 & 0xfffffffe) + (~v19 | 1) - 1;
            v2 = (v20 ^ 2) + (v20 * 2 & 4) - 1;
            if (v3)
                a1 = (char *)a1 + 1;
            if ((int)v2 > 6)
                goto *((void *)(g_e693a8));
        }
        else
        {
            goto *((void *)(g_e693e0));
        }
    }
}
