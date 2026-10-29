/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaacc74..0xaaccf0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aacc74_0 {
    char padding_0[32];
    struct st_aacc74_1 *field_20;
} st_aacc74_0;

typedef struct st_aacc74_1 {
    char padding_0[40];
    long long field_28;
    long long field_30;
} st_aacc74_1;


unsigned long long sub_aacc74(st_aacc74_0 *a0, st_aacc74_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(sub_aafc24(a0->field_20) & 1) && !(sub_aafc24(a1->field_20) & 1))
    {
        if (sub_9e5528(a1->field_20->field_28, a0->field_20->field_28))
            return 0;
        return !sub_9e5528(a1->field_20->field_30, a0->field_20->field_30);
    }
    return 1;
}
