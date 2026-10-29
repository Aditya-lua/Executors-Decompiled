/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13a08..0x13b40 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13a08_1 {
    struct st_13a08_2 *field_0;
    struct st_13a08_0 *field_8;
} st_13a08_1;

typedef struct st_13a08_0 {
    struct st_13a08_0 *field_0;
    unsigned long long field_8;
} st_13a08_0;

typedef struct st_13a08_2 {
    struct st_13a08_0 *field_0;
} st_13a08_2;

typedef struct st_13a08_3 {
    char field_0;
} st_13a08_3;

extern unsigned long long g_e631e0;
extern unsigned long long g_e63218;

st_13a08_0 * sub_13a08(st_13a08_1 *a0, long long a1)
{
    long long v5;  // x0
    unsigned long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x21
    unsigned long long idx;  // x0
    unsigned long v10;  // x8
    unsigned long long *v11;  // x24
    unsigned long v12;  // x20
    st_13a08_3 **v0;  // [bp-0x68], Other Possible Types: char
    st_13a08_3 *v1;  // [bp-0x60]
    char v2;  // [bp-0x51]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_a0c8(a1);
    v6 = sub_a0c8(a1);
    v7 = sub_1a1bc(&v2, v5, v6 + sub_6b08(a1) - v5);
    if (!a0->field_8)
        return 0;
    v8 = v7;
    idx = sub_10c04();
    if (*(long long *)&a0->field_0[idx])
    {
        v10 = *(long long *)*(long long *)&a0->field_0[idx];
        if (*(long long *)*(long long *)&a0->field_0[idx])
        {
            v11 = &g_e631e0;
            do
            {
                v12 = v10;
                if (v8 != *(long long *)(v10 + 8))
                {
                    if (sub_10c04(*(long long *)(v10 + 8), a0->field_8) != idx)
                        break;
                    if (*(long long *)(v12 + 8) != v8)
                        continue;
                }
                if (sub_20b98(v12 + 16, a1))
                {
                    v11 = &g_e63218;
                    break;
                }
            } while ((v10 = *(long long *)v12, *(long long *)v12));
            goto *((void *)(*v11));
        }
    }
    goto *((void *)(g_e631e0));
}
