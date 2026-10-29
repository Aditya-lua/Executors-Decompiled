/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6eed4..0xa6ef50 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6eed4_0 {
    char padding_0[16];
    long long field_10;
} st_a6eed4_0;


void sub_a6eed4(st_a6eed4_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int i;  // w0
    unsigned int v13;  // w20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    i = sub_ad69e4(a0->field_10);
    if ((int)i >= 1)
    {
        do
        {
            v13 = i;
            sub_a6c2e4(sub_ad692c(a0->field_10), "crypto/param_build.c", 110);
            i = v13 - 1;
        } while (i);
    }
    sub_ad6020(a0->field_10);
    sub_a6c2e4();
    return;
}
