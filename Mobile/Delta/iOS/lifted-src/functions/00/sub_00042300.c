/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42300..0x42404 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_42300_1 {
    struct st_42300_2 *field_0;
    struct st_42300_0 *field_8;
} st_42300_1;

typedef struct st_42300_0 {
    struct st_42300_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_42300_0;

typedef struct st_42300_2 {
    struct st_42300_0 *field_0;
} st_42300_2;

typedef struct st_42300_3 {
    char field_0;
} st_42300_3;

extern unsigned long long g_e66cb8;
extern unsigned long long g_e66cf0;

st_42300_0 * sub_42300(st_42300_1 *a0, int *a1)
{
    st_42300_0 *v4;  // x21
    unsigned long v5;  // x22
    unsigned long long idx;  // x0
    unsigned long v7;  // x8
    unsigned long long *v8;  // x24
    unsigned long v9;  // x20
    st_42300_3 **v0;  // [bp-0x60], Other Possible Types: char
    st_42300_3 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    if (!v4)
        return 0;
    v5 = *a1;
    idx = sub_10c04(v5, v4);
    if (*(long long *)&a0->field_0[idx])
    {
        v7 = *(long long *)*(long long *)&a0->field_0[idx];
        if (*(long long *)*(long long *)&a0->field_0[idx])
        {
            v8 = &g_e66cb8;
            do
            {
                v9 = v7;
                if (*(long long *)(v7 + 8) != v5)
                {
                    if (sub_10c04(*(long long *)(v7 + 8), v4) != idx)
                        break;
                    if (*(long long *)(v9 + 8) != v5)
                        continue;
                }
                if (*(int *)(v9 + 16) == *a1)
                {
                    v8 = &g_e66cf0;
                    break;
                }
            } while ((v7 = *(long long *)v9, *(long long *)v9));
            goto *((void *)(*v8));
        }
    }
    goto *((void *)(g_e66cb8));
}
