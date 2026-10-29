/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b9a8..0x99b9f0 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b9a8_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[2468];
    unsigned long long field_a20;
    char padding_a28[312];
    unsigned int field_b60;
} st_99b9a8_0;


int sub_99b9a8(st_99b9a8_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_78)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_b60 = 0;
    sub_a6c2e4(a0->field_a20, "ssl/statem/extensions.c", 930);
    a0->field_a20 = 0;
    return 1;
}
