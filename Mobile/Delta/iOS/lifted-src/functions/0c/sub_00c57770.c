/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc57770..0xc57854 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c57770_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_c57770_0;

extern long long g_efcfe8;

double sub_c57770(st_c57770_0 *a0, long long a1, long long a2, unsigned short *a3, unsigned long a4)
{
    unsigned long long i;  // x22
    unsigned short *v8;  // x25
    unsigned long v9;  // x23
    unsigned long long v10;  // x22
    unsigned long v11;  // x8
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    char v3;  // [bp-0x68]
    uint128_t v4;  // [bp-0x60]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a4)
    {
        i = a4 * 4;
        v8 = a3 + 1;
        v9 = 46;
        do
        {
            v10 = i;
            sub_c57ce4(&v3, a1, a2, *v8);
            v11 = v3;
            v2 = v4;
            if (v11 == 46)
            {
                *(uint128_t *)&(&a0->field_0)[1] = v2;
                a0->field_0 = 46;
                return (unsigned long long)v2;
            }
            v1 = v2;
            if (*(short *)((char *)v8 - 2) == 1)
            {
                v0 = v1;
                v9 = v11;
            }
            v8 += 2;
            i = v10 - 4;
        } while (i);
        if (v9 != 46)
        {
            *(uint128_t *)&(&a0->field_0)[1] = v0;
            a0->field_0 = v9;
            return (unsigned long long)v0;
        }
    }
    sub_c73c64(&g_efcfe8);
}
