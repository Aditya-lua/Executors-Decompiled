/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0160..0x9d0274 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0160_1 {
    char padding_0[40];
    unsigned long long field_28;
} st_9d0160_1;

typedef struct st_9d0160_0 {
    unsigned long long field_0;
} st_9d0160_0;


unsigned long long sub_9d0160(st_9d0160_0 **a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4, st_9d0160_1 *a5)
{
    unsigned long long *v5;  // x19
    unsigned long long v6;  // x0
    long long v7;  // x1
    unsigned long long v0;  // [bp-0x44]
    unsigned long long v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = a1;
    v0 = 0;
    v5 = *a0;
    if (!v5)
    {
        v5 = sub_a6bffc(8, "crypto/asn1/x_int64.c", 31);
        *a0 = v5;
        if (!v5)
            return v5;
    }
    if (!a2)
    {
LABEL_9d0254:
        *v5 = v1;
        return 1;
    }
    v6 = sub_9c1d3c(&v1, &v0, &v2, a2);
    if (!(unsigned int)v6)
        return v6;
    if (!(a5->field_28 >> 1 & 1) && v0)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/x_int64.c", 95, "uint64_c2i");
        v7 = 226;
    }
    else if (a5->field_28 >> 1 & 1 && !v0 && (long long)v1 < 0)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/x_int64.c", 100, "uint64_c2i");
        v7 = 223;
    }
    else if (v0)
    {
        v1 = -v1;
        goto LABEL_9d0254;
    }
    sub_a36abc(13, v7, 0);
    return 0;
}
