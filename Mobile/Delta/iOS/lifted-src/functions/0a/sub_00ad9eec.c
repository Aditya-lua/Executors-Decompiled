/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9eec..0xad9f40 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9eec_2 {
    struct st_ad9eec_0 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    char padding_18[16];
    unsigned int field_28;
} st_ad9eec_2;

typedef struct st_ad9eec_0 {
    char padding_0[56];
    struct st_ad9eec_1 *field_38;
} st_ad9eec_0;

typedef struct st_ad9eec_1 {
    unsigned long long field_0;
} st_ad9eec_1;


unsigned long long sub_ad9eec(st_ad9eec_2 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x1
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    v3 = a0->field_28;
    if (!(v3 >> 1 & 1))
    {
        a0->field_10 = a1;
        a0->field_28 = (unsigned int)v3 & 0xfffffffd;
        return v2;
    }
    a0->field_0->field_38();
}
