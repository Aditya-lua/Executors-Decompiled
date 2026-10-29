/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fcd54..0x9fcd9c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fcd54_0 {
    char padding_0[8];
    struct st_9fcd54_1 *field_8;
} st_9fcd54_0;

typedef struct st_9fcd54_1 {
    unsigned int field_0;
} st_9fcd54_1;


long long sub_9fcd54(st_9fcd54_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9fdac0(a1, 0, 0);
    if (!v2)
        return v2;
    sub_a5ab14(a0, *(int *)a0->field_8, v2);
    return 1;
}
