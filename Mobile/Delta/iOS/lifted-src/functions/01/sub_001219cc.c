/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1219cc..0x1219f8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1219cc_0 {
    unsigned long long field_0;
    struct st_1219cc_1 *field_8;
} st_1219cc_0;

typedef struct st_1219cc_1 {
    unsigned long long field_0;
} st_1219cc_1;


unsigned long long sub_1219cc(st_1219cc_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    a0->field_0 = a1;
    if (!v2)
        return 0;
    a0->field_8();
}
