/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64344..0xa64404 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a64344_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    char padding_10[8];
    long long field_18;
} st_a64344_0;

extern char g_10002b0;

unsigned int sub_a64344(st_a64344_0 *a0, long long a1, long long a2)
{
    unsigned int v5;  // w0
    unsigned int v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (*(long long *)&a0->field_0 && sub_a3ff7c(a0->field_8, &v1, &v0) && sub_a40520(a0->field_8, a0->field_18) && sub_a3fe10(a0->field_8, &v1, v0) && sub_a3ff7c(a0->field_8, a1, a2))
        v5 = 1;
    else
        v5 = 0;
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
