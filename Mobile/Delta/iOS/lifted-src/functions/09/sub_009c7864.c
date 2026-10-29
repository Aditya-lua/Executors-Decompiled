/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7864..0x9c7910 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7864_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    unsigned long long field_10;
} st_9c7864_0;


st_9c7864_0 * sub_9c7864(st_9c7864_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long idx;  // x0
    unsigned long long v13;  // w0
    unsigned long v14;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    idx = sub_a6bffc(24, "crypto/asn1/asn1_lib.c", 355);
    if (idx)
    {
        *(unsigned int *)(idx + 4) = a0->field_4;
        v13 = (unsigned int)sub_9c7770();
        v14 = *(long long *)(idx + 16);
        if (v13)
        {
            *(unsigned long long *)(idx + 16) = a0->field_10 & 0xffffffffffffff00 | (a0->field_10 & 0xffffffffffffff7f | (v14 >> 7) * 128 & 128) & 0xff;
        }
        else
        {
            if (!(v14 >> 4 & 1))
                sub_a6c2e4(*(long long *)(idx + 8), "crypto/asn1/asn1_lib.c", 367);
            if (!(v14 >> 7 & 1))
                sub_a6c2e4();
            idx = 0;
        }
    }
    return idx;
}
