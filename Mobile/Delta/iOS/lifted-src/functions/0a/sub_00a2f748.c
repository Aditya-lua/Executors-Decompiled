/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f748..0xa2f9e0 (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f748_0 {
    char padding_0[48];
    struct st_a2f748_1 *field_30;
} st_a2f748_0;

typedef struct st_a2f748_1 {
    unsigned long long field_0;
} st_a2f748_1;


st_a2f748_0 * sub_a2f748(st_a2f748_0 *a0, st_a2f748_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1)
    {
        sub_a77638(sub_a3032c(a1));
        a1->field_30();
    }
    sub_c66d68();
    return 0;
}
