/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9704..0xad979c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9704_0 {
    unsigned int field_0;
    char padding_4[28];
    long long field_20;
    char field_28;
    char padding_29[7];
    long long field_30;
} st_ad9704_0;


int sub_ad9704(st_ad9704_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long *v12;  // x20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = &a0->field_30;
        sub_ad9384(a0->field_30);
        sub_ad93b4(*v12);
        if (a0->field_0 & 5)
        {
            sub_ad93e4(&a0->field_28);
            sub_ad93e4(v12);
            sub_ad94ec(a0 + 1);
            sub_a6c2e4(a0->field_20, "crypto/thread/arch.c", 128);
            sub_a6c2e4(a0, "crypto/thread/arch.c", 129);
            a0 = 1;
        }
        else
        {
            a0 = 0;
        }
    }
    return (unsigned int)a0;
}
