/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb976b4..0xb9790c (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b976b4_2 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_9;
} st_b976b4_2;

extern unsigned long long g_b81964;
extern long long g_cb97d2;
extern long long g_e07fc0;
extern long long g_efa758;

st_b976b4_2 * sub_b976b4(st_b976b4_2 *a0, unsigned long a1, unsigned long a2)
{
    void* v8;  // x25
    unsigned long iter;  // x26
    unsigned long long v10;  // x0
    unsigned long v11;  // x8
    uint128_t v0;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x88]
    char *v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x71]
    unsigned long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a1 == a2)
        return a0;
    v8 = a0->field_0;
    iter = a1 + 4;
    v10 = 1;
    if (!((char)a0->field_8 & 1))
    {
        v11 = *((char *)&a0->field_8 + 1);
        if ((char)v8[18] >= 0)
        {
            if (v11 & 1)
                (*(long long *)((long long)v8[8] + 24))();
            v0 = a1;
            v1 = &g_b81964;
            v10 = sub_be769c(*(long long *)v8, (long long)v8[8], &g_cb97d2, &v0);
        }
        else
        {
            if (!(v11 & 1))
                (*(long long *)((long long)v8[8] + 24))();
            v3 = 1;
            v0 = *(int128_t *)v8;
            v2 = &v3;
            v4 = a1;
            v5 = &g_b81964;
            if (sub_be769c(&v0, &g_efa758, &g_cb97d2, &v4) & 1)
                v10 = 1;
            else
                v10 = sub_be8048(&v0, &g_e07fc0, 2);
        }
    }
    *(char *)&a0->field_8 = v10;
    *((char *)&a0->field_8 + 1) = 1;
    if (iter == a2)
        return a0;
    while (1)
    {
        if (v10 & 1)
        {
LABEL_b9782c:
            v10 = 1;
            iter += 4;
            *(char *)&a0->field_8 = 1;
            *((char *)&a0->field_8 + 1) = 1;
            if (iter == a2)
                return a0;
        }
        else
        {
            if ((char)v8[18] >= 0)
                (*(long long *)((long long)v8[8] + 24))();
            v3 = 1;
            v0 = *(int128_t *)v8;
            v2 = &v3;
            v4 = iter;
            v5 = &g_b81964;
            if (sub_be769c(&v0, &g_efa758, &g_cb97d2, &v4))
                goto LABEL_b9782c;
            v10 = sub_be8048(&v0, &g_e07fc0, 2);
            iter += 4;
            *(char *)&a0->field_8 = v10;
            *((char *)&a0->field_8 + 1) = 1;
            if (iter == a2)
                return a0;
        }
    }
}
