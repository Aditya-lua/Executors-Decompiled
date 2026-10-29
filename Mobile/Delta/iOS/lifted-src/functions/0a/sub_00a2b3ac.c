/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b3ac..0xa2b3f4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2b3ac_0 {
    char padding_0[8];
    struct st_a2b3ac_1 *field_8;
} st_a2b3ac_0;

typedef struct st_a2b3ac_1 {
    unsigned int field_0;
} st_a2b3ac_1;


long long sub_a2b3ac(st_a2b3ac_0 *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2a704(a1, a2, a3);
    if (!v2)
        return v2;
    sub_a5ab14(a0, *(int *)a0->field_8, v2);
    return 1;
}
