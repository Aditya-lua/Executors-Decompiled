/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa634ac..0xa635e4 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a634ac_0 {
    struct st_a634ac_0 *field_0;
    struct st_a634ac_0 *field_8;
    unsigned long long field_10;
} st_a634ac_0;

typedef struct st_a634ac_1 {
    char padding_0[40];
    long long field_28;
    char padding_30[8];
    char field_38;
    char padding_39[7];
    uint128_t field_40;
    struct st_a634ac_0 *field_50;
} st_a634ac_1;

extern long long g_a6369c;

int sub_a634ac(st_a634ac_1 *a0)
{
    st_a634ac_0 *v3;  // x0
    st_a634ac_0 *v4;  // x20
    st_a634ac_0 *v5;  // x0
    st_a634ac_0 *v6;  // x0
    long long v7;  // x2
    long long v8;  // x0
    st_a634ac_0 *v9;  // x0
    long long v10;  // x0
    st_a634ac_0 *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a6bffc(24, "crypto/hashtable/hashtable.c", 290);
    v0 = v3;
    if (v3)
    {
        v4 = v3;
        v5 = sub_a6c0cc(0x400, 64, &v3->field_8, "crypto/hashtable/hashtable.c", 160);
        if (v5 || !(v5 = sub_a6bf4c(0x400, "crypto/hashtable/hashtable.c", 164), v4->field_8 = v5, !v5))
        {
            v8 = _bzero();
            v4->field_0 = v5;
            v4->field_10 = 15;
            v9 = sub_a7befc(v8, 0x400);
            if (v9)
            {
                v10 = sub_a7bf24(&a0->field_38);
                sub_a7bf2c(&a0->field_38, &v0);
                a0->field_40 = 16;
                sub_a7bf10(a0->field_28, v9, &g_a6369c, v10);
                v3 = 1;
                *(unsigned int *)&a0->field_50 = 1;
            }
            else
            {
                sub_a6c2e4(v4->field_8, "crypto/hashtable/hashtable.c", 305);
                v6 = v4;
                v7 = 306;
LABEL_a635c8:
                sub_a6c2e4(v6, "crypto/hashtable/hashtable.c", v7);
                v3 = 0;
            }
        }
        else
        {
            v4->field_0 = 0;
            v6 = v4;
            v7 = 297;
            goto LABEL_a635c8;
        }
    }
    return (unsigned int)v3;
}
