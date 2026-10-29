/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2c74..0x9f2d14 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2c74_1 {
    char padding_0[16];
    long long field_10;
} st_9f2c74_1;

typedef struct st_9f2c74_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
} st_9f2c74_0;


unsigned long long sub_9f2c74(st_9f2c74_1 *a0, st_9f2c74_0 *a1, unsigned long long *a2)
{
    long long v2;  // x20
    unsigned long long v3;  // x0
    unsigned long v4;  // x0
    long long *v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    *a2 = a1->field_0;
    v3 = sub_ad68a0(v2, a2);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_a66794(a0->field_10, a2);
    if (!v4)
        return 1;
    v5 = v4;
    sub_ad65b4(v2, v5);
    sub_a6c2e4(v5[1], "crypto/conf/conf_api.c", 59);
    sub_a6c2e4(v5[2], "crypto/conf/conf_api.c", 60);
    sub_a6c2e4(v5, "crypto/conf/conf_api.c", 61);
    return 1;
}
