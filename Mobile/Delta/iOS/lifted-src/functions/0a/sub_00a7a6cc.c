/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a6cc..0xa7a764 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a6cc_0 {
    char padding_0[56];
    long long field_38;
} st_a7a6cc_0;


void sub_a7a6cc(st_a7a6cc_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (sub_a6fbc4(a1, "openssl-version"))
        sub_a71744();
    if (sub_a6fbc4(a1, "provider-name"))
        sub_a71744();
    v12 = sub_a6fbc4(a1, "module-filename");
    if (v12)
        sub_a71744(v12, sub_a0459c(a0->field_38));
}
