/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83b18..0x83bf8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_83b18_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_83b18_0;

extern st_83b18_0 g_cbfd18;

unsigned long long sub_83b18(unsigned short *a0, char a1, unsigned int *a2, unsigned int a3)
{
    char v0;  // x8
    unsigned int v1;  // w11
    unsigned int v10;  // w1
    unsigned int v11;  // w4
    unsigned short v12;  // x1
    unsigned short v13;  // x4
    unsigned int v14;  // w13
    unsigned short v16;  // x10
    unsigned int v2;  // w10
    unsigned int v3;  // x12
    unsigned int v4;  // x12
    unsigned int v5;  // x13
    unsigned int *v6;  // x14
    unsigned short *v7;  // x15
    unsigned int i;  // w17
    unsigned int v9;  // w17

    v0 = 8 - a1;
    v1 = a3 + 1;
    if (2 > v1)
    {
        v2 = 0;
        v3 = 0;
    }
    else
    {
        v4 = 0;
        v5 = 0;
        v2 = v1 & 0xfffffffe;
        v6 = a2 + 1;
        v7 = a0 + 1;
        i = v2;
        do
        {
            v9 = i;
            v10 = *(short *)((char *)v7 - 2);
            v11 = *v7;
            v7 += 2;
            if (v10 != 0xffff)
                v12 = v10;
            else
                v12 = 1;
            if (v11 != 0xffff)
                v13 = v11;
            else
                v13 = 1;
            v4 += *(int *)((char *)v6 - 4) * (&g_cbfd18.field_0)[v12 << (v0 & 31)];
            v5 += *v6 * (&g_cbfd18.field_0)[v13 << (v0 & 31)];
            v6 += 2;
            i = v9 - 2;
        } while (i);
        v3 = v5 + v4;
        if (v1 == v2)
            return v5 + v4 >> 8;
    }
    do
    {
        v14 = a0[v2];
        if (v14 != 0xffff)
            v16 = v14;
        else
            v16 = 1;
    } while ((v3 += a2[v2] * (&g_cbfd18.field_0)[v16 << (v0 & 31)], v2 += 1, v2 <= a3));
    return v3 >> 8;
}
