/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c5eb4..0x3c6020 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c5eb4_0 {
    char field_0;
} st_3c5eb4_0;

extern unsigned long long g_f0d3e0;
extern void g_f11d28;

void* sub_3c5eb4(void* a0, unsigned long long a1)
{
    char v6;  // x22
    unsigned long long v7;  // x11
    unsigned long long v8;  // x12
    unsigned long v9;  // x8
    unsigned long long v10;  // x8
    unsigned long iter;  // x21
    unsigned long idx;  // x0
    void* v13;  // x0
    st_3c5eb4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3c5eb4_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = 1 << ((char)a1 & 31);
    *(char *)&a0[2] = (char)a0[2] | v6;
    if (!*(long long *)&g_f11d28)
    {
        v3 = 8943553016693020797;
        v2 = 8943553016693020677;
        v7 = v2 ^ v3;
        v8 = v7 & g_f0d3e0;
        v9 = g_f0d3e0 + 1;
        v10 = v9 + v7 + (v7 + (v2 ^ ~v3) * 2 + 1 | v9 + ~g_f0d3e0 * 2);
        (*(long long *)(v8 + (v10 | ~v8) + (v10 | v8) + 1))();
    }
    *(long long *)&a0[64] = *(long long *)&g_f11d28;
    if (!(int)a0[156])
        return a0;
    iter = 0;
    while (1)
    {
        idx = *(long long *)((long long)a0[24] + iter * 8);
        if (*(int *)(idx + 156) < 1)
        {
            *(char *)(idx + 2) = *(char *)(idx + 2) | v6;
            *(long long *)(idx + 64) = *(long long *)&g_f11d28;
            iter += 1;
            if ((int)a0[156] <= iter)
                return idx;
        }
        else
        {
            v13 = sub_3c5eb4(idx, a1);
            iter += 1;
            if (iter >= (int)a0[156])
                return v13;
        }
    }
}
