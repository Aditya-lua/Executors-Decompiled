/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98830c..0x98836c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98830c_0 {
    long long field_0;
    struct st_98830c_0 *field_8;
    long long field_10;
} st_98830c_0;

extern long long g_98836c;

void sub_98830c(st_98830c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a66664(a0->field_10);
    if (a0->field_8)
    {
        sub_a66c58(a0->field_8, &g_98836c);
        sub_a66664(a0->field_8);
    }
    sub_a4bca0(a0->field_0);
}
