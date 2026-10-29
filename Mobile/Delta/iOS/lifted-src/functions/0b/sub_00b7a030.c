/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7a030..0xb7a1a0 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7a030_4 {
    long long field_0;
    struct st_b7a030_2 *field_8;
} st_b7a030_4;

typedef struct st_b7a030_0 {
    long long field_0;
    long long field_8;
    char field_10;
} st_b7a030_0;

typedef struct st_b7a030_2 {
    char padding_0[24];
    struct st_b7a030_3 *field_18;
} st_b7a030_2;

typedef struct st_b7a030_3 {
    unsigned long long field_0;
} st_b7a030_3;

extern unsigned long long g_b96074;
extern long long g_cb89da;

unsigned long long sub_b7a030(st_b7a030_4 **a0, st_b7a030_0 *a1)
{
    unsigned long v4;  // x21
    st_b7a030_4 *v5;  // x23
    char *v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_10;
    if (sub_b94cf4(a1->field_0, v4) & 1)
        *a0->field_8->field_18();
    if (sub_b79024(a0, a1->field_0) & 1)
        return 1;
    v5 = *a0;
    v0 = &a1->field_10;
    v1 = &g_b96074;
    if (!(sub_be769c(v5->field_0, v5->field_8, &g_cb89da, &v0) & 1))
    {
        if (sub_b94e50(a1->field_8, v4) & 1)
        {
            v5->field_8->field_18();
        }
        else if (!(sub_b79024(a0, a1->field_8) & 1))
        {
            return 0;
        }
    }
    return 1;
}
