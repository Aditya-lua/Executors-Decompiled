/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23c78..0x23cd0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23c78_1 {
    unsigned long long field_0;
} st_23c78_1;

typedef struct st_23c78_0 {
    struct st_23c78_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_23c78_0;

extern st_23c78_0 g_e61f80;

void sub_23c78(unsigned long a0, int *a1, int *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 == a2)
        return;
    (&g_e61f80.field_0)[*a1]();
}
