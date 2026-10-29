/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96295c..0x962a1c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96295c_2 {
    char padding_0[88];
    long long field_58;
    long long field_60;
    char padding_68[3088];
    struct st_96295c_0 *field_c78;
} st_96295c_2;

typedef struct st_96295c_1 {
    unsigned long long field_0;
} st_96295c_1;

typedef struct st_96295c_0 {
    char padding_0[88];
    struct st_96295c_1 *field_58;
} st_96295c_0;


long long sub_96295c(st_96295c_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x0
    long long v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_60)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_9d3c1c(sub_9d1e30());
    if (v8)
    {
        v9 = v8;
        if (sub_9d4d58() > 0)
        {
            a0->field_60 = v9;
            a0->field_58 = sub_9d4ec8(v9, a0->field_58);
            a0->field_c78->field_58();
        }
    }
    sub_a368c8(sub_9d3c28());
    sub_a369bc("ssl/ssl_lib.c", 0x14f5, "ssl_init_wbio_buffer");
    sub_a36abc(20, 0x80007, 0);
    return 0;
}
