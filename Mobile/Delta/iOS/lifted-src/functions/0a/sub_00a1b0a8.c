/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b0a8..0xa1b11c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b0a8_1 {
    struct st_a1b0a8_0 *field_0;
} st_a1b0a8_1;

typedef struct st_a1b0a8_0 {
    char padding_0[88];
    struct st_a1b0a8_1 *field_58;
} st_a1b0a8_0;


st_a1b0a8_0 ** sub_a1b0a8(st_a1b0a8_0 **a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a1b0a8_0 **v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a1a56c(a1);
    if (v8)
    {
        v8 = v8;
        if (!sub_a1a654())
        {
            if (*v8->field_58)
                *v8->field_58();
            sub_a6c2e4(v8, "crypto/ec/ec_lib.c", 754);
            v8 = 0;
        }
    }
    return v8;
}
