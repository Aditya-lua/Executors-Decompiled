/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafa634..0xafa6a8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afa634_0 {
    struct st_afa634_0 *field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
} st_afa634_0;

extern long long g_afa344;

st_afa634_0 * sub_afa634(st_afa634_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_afa634_0 *v12;  // x20
    st_afa634_0 *v13;  // x0
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
    v12 = a0->field_0;
    if (v12)
    {
        sub_9ebcf4(v12->field_10);
        sub_ad6958(v12->field_0, &g_afa344);
        sub_a6c2e4(v12->field_18, "crypto/x509/x_name.c", 126);
        v13 = sub_a6c2e4(v12, "crypto/x509/x_name.c", 127);
        a0->field_0 = 0;
        a0 = v13;
    }
    return a0;
}
