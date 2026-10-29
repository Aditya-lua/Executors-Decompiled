/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b8d8..0xa2b938 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2b8d8_0 {
    char padding_0[120];
    struct st_a2b8d8_1 *field_78;
} st_a2b8d8_0;

typedef struct st_a2b8d8_1 {
    unsigned int field_0;
} st_a2b8d8_1;


int sub_a2b8d8(st_a2b8d8_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2a41c(0, 0, 0, *(int *)a0->field_78, 2, 0, 0);
    if (v2)
    {
        sub_a5ab14(a1, *(int *)a0->field_78, v2);
        v2 = 1;
    }
    return v2;
}
