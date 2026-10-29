/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaccf8..0xaacd40 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaccf8_0 {
    char padding_0[8];
    struct st_aaccf8_1 *field_8;
} st_aaccf8_0;

typedef struct st_aaccf8_1 {
    unsigned int field_0;
} st_aaccf8_1;


long long sub_aaccf8(st_aaccf8_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aaf27c(a1, 0, 0);
    if (!v2)
        return v2;
    sub_a5ab14(a0, *(int *)a0->field_8, v2);
    return 1;
}
