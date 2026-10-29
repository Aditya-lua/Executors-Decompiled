/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97fcc8..0x97fd74 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97fcc8_1 {
    struct st_97fcc8_0 *field_0;
    unsigned short field_8;
    char padding_a[6];
    long long field_10;
    long long field_18;
} st_97fcc8_1;

typedef struct st_97fcc8_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97fcc8_0;


unsigned long long sub_97fcc8(st_97fcc8_1 *a0)
{
    st_97fcc8_0 *v2;  // x20
    long long v3;  // x0
    unsigned short v4;  // x0
    long long v5;  // x0
    unsigned short v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!(v2->field_150 >> 5 & 1) && !sub_977368(v2->field_a0) && sub_97733c(v2->field_a0))
    {
        v3 = sub_97724c(a0->field_0->field_a0);
        v4 = sub_98952c(v3, a0->field_18);
        *(unsigned long long *)&a0->field_8 = v4;
        if (!v4)
        {
            v5 = sub_97724c(a0->field_0->field_a0);
            v6 = sub_98952c(v5, a0->field_18 | 2);
            *(unsigned long long *)&a0->field_8 = v6;
            return v6 != 0;
        }
        return 1;
    }
    sub_97c738(a0->field_10);
    return 0xffffffff;
}
