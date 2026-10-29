/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00acc..0xa00afc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00acc_1 {
    char padding_0[32];
    struct st_a00acc_0 *field_20;
} st_a00acc_1;

typedef struct st_a00acc_0 {
    char padding_0[104];
    long long field_68;
} st_a00acc_0;


long long sub_a00acc(st_a00acc_1 *a0, st_a00acc_1 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    return !sub_9e5528(a1->field_20->field_68, a0->field_20->field_68);
}
