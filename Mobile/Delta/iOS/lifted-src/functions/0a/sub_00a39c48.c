/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39c48..0xa39cb4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a39c48_0 {
    char padding_0[24];
    long long field_18;
} st_a39c48_0;


int sub_a39c48(st_a39c48_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a39c48_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_975ffc();
        if (v8)
        {
            sub_a4bca0(v8->field_18);
            sub_a6c4e8(v8, 0x1150, "crypto/evp/bio_enc.c", 97);
            sub_9d3d24(a0, 0);
            sub_9d3d2c(a0, 0);
            v8 = 1;
        }
        a0 = v8;
    }
    return (unsigned int)a0;
}
