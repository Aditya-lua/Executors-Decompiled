/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b0e8..0xa4b1f4 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4b0e8_0 {
    char padding_0[92];
    char field_5c;
} st_a4b0e8_0;


char sub_a4b0e8(st_a4b0e8_0 *a0, unsigned long a1, char *a2, unsigned int a3)
{
    char *v0;  // x8
    char v1;  // x0
    unsigned long long v10;  // 4102
    char *v11;  // x9
    char v12;  // x12
    char *v2;  // x9
    unsigned int v3;  // w3
    unsigned long v4;  // x11
    unsigned long long v5;  // x10
    unsigned int v6;  // w12
    unsigned long v7;  // x13
    char *v8;  // x14
    unsigned long long v9;  // x13

    if (!a0 || !(a0->field_5c >> 1 & 1))
    {
        v0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        if ((int)a3 < 1)
        {
            *(char *)a1 = 0;
            return 0;
        }
    }
    else
    {
        v0 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz./";
        if (1 > (int)a3)
        {
            *(char *)a1 = 0;
            return 0;
        }
    }
    v1 = 0;
    v2 = a2 + 1;
    while (1)
    {
        v3 = a3;
        v4 = *(v2 - 1);
        v5 = v4 * 0x10000;
        if (v3 <= 2)
            break;
        v6 = *v2;
        v7 = v2[1];
        v8 = a1 + v1;
        *v8 = v0[v4 >> 2];
        v9 = (unsigned int)v7 & 0xffff0000 | ((unsigned int)v7 & 0xffff00ff | (v6 * 0x100 | v6 >> 24) & 0xff00) & 0xffff;
        v8[1] = v0[((v6 * 0x100 | (unsigned int)v5) * 0x10000000000000 | (v6 * 0x100 | (unsigned int)v5) >> 12) & 0xfff000000000003f & 63];
        v8[2] = v0[(v9 * 0x400000000000000 | v9 >> 6) & 18158513697557839935 & 63];
        v8[3] = v0[v7 & 63];
        v1 += 4;
        v2 += 3;
        a3 = v3 - 3;
        if (v3 == 3)
        {
            *(char *)(a1 + v1) = 0;
            return v1;
        }
    }
    v10 = arm64g_calculate_condition(19, v3, 2, 0);
    if (!(v10 & 1))
        v5 |= *v2 * 0x100;
    v11 = a1 + v1;
    *v11 = v0[v5 >> 18];
    v11[1] = v0[(v5 * 0x10000000000000 | v5 >> 12) & 0xfff000000000003f & 63];
    v12 = 61;
    if (v3 != 1)
        v12 = v0[(v5 * 0x400000000000000 | v5 >> 6) & 18158513697557839935 & 63];
    v11[2] = v12;
    v11[3] = 61;
    v11[4] = 0;
    return v1 + 4;
}
