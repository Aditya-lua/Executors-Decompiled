/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97af4..0xa97b68 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97af4_0 {
    uint128_t field_0;
    char padding_10[16];
    long long field_20;
    long long field_28;
    long long field_30;
} st_a97af4_0;


unsigned long long sub_a97af4(st_a97af4_0 *a0, st_a97af4_0 *a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = a1->field_0;
    v2 = a0->field_20;
    if (!v2)
    {
        v2 = sub_a4bc70(0);
        a0->field_20 = v2;
        if (!v2)
            return v2;
    }
    v3 = sub_a4de68(v2, a1->field_20);
    if (!(unsigned int)v3)
        return v3;
    sub_a57f0c(a0->field_30);
    v4 = sub_a57f5c(a1->field_30);
    a0->field_30 = v4;
    if (!v4)
        return v4;
    v5 = a1->field_28;
    a0->field_28 = v5;
    if (!v5)
        return 1;
    sub_a382a4(v5);
    return 1;
}
