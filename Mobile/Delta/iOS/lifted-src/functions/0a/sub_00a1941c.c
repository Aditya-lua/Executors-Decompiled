/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1941c..0xa194c4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1941c_0 {
    char padding_0[16];
    long long field_10;
} st_a1941c_0;

typedef struct st_a1941c_1 {
    char padding_0[24];
    struct st_a1941c_0 *field_18;
} st_a1941c_1;


unsigned long long sub_a1941c(st_a1941c_1 *a0)
{
    long long v2;  // x19
    long long v3;  // x0
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 786690;
    if (a0 && a0->field_18 && *(long long *)&a0[1].padding_0[8])
    {
        v3 = sub_9e4624();
        if (!(sub_9e5528(*(long long *)&a0[1].padding_0[8], v3) >> 31 & 1) && sub_9e5528(*(long long *)&a0[1].padding_0[8], a0->field_18->field_10) >> 31 & 1)
            return 1;
        v2 = 123;
        v4 = 560;
    }
    else
    {
        v4 = 555;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_key.c", v4, "ossl_ec_key_private_check");
    sub_a36abc(16, v2, 0);
    return 0;
}
