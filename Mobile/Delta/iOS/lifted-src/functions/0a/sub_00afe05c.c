/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe05c..0xafe0c8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afe05c_1 {
    uint128_t field_0;
    long long field_10;
} st_afe05c_1;

typedef struct st_afe05c_0 {
    uint128_t field_0;
    long long field_8;
    long long field_10;
} st_afe05c_0;


double sub_afe05c(st_afe05c_1 *a0, st_afe05c_0 *a1)
{
    unsigned long v2;  // x8
    uint128_t v3;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(long long *)((char *)&a1->field_0 + 8) || sub_a40a98(*(long long *)((char *)&a1->field_0 + 8)))
    {
        if (!a1->field_8)
        {
            v2 = 0;
            goto LABEL_afe09c;
        }
        else if (sub_a32d54(a1->field_8))
        {
            v2 = a1->field_8;
LABEL_afe09c:
            a0->field_10 = v2;
            v3 = a1->field_0;
            a0->field_0 = v3;
        }
        else
        {
            sub_a3f52c(*(long long *)((char *)&a1->field_0 + 8));
        }
    }
    return (unsigned long long)v3;
}
