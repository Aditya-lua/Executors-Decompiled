/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9980f0..0x9981a4 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9980f0_1 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9980f0_1;

typedef struct st_9980f0_0 {
    char padding_0[20];
    unsigned int field_14;
} st_9980f0_0;


long long sub_9980f0(st_9980f0_0 *a0, st_9980f0_1 *a1)
{
    st_9980f0_0 *v2;  // x19
    unsigned long long v3;  // x8
    long long v4;  // x1
    long long v5;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1->field_0 == a0->field_14)
    {
        v3 = 17728;
        if (!*(long long *)&v2[173].padding_0[8])
            v3 = 16704;
        if (a1->field_8 <= v3)
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1016, "tls_default_validate_record_header");
        v4 = 22;
        v5 = 150;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1001, "tls_default_validate_record_header");
        v4 = 70;
        v5 = 267;
    }
    sub_996e84(v2, v4, v5, 0);
    return 0;
}
