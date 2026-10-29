/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ca8cc..0x9ca938 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ca8cc_1 {
    char padding_0[8];
    struct st_9ca8cc_0 *field_8;
    long long field_10;
} st_9ca8cc_1;

typedef struct st_9ca8cc_0 {
    struct st_9ca8cc_0 *field_0;
} st_9ca8cc_0;


int sub_9ca8cc(st_9ca8cc_0 **a0, st_9ca8cc_0 **a1, unsigned int *a2, st_9ca8cc_0 **a3, st_9ca8cc_1 *a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
        *a0 = *(long long *)a4->field_8;
    if (a1)
    {
        *a1 = sub_c4c40(a4->field_10);
        *a2 = sub_9c7b68(a4->field_10);
    }
    if (a3)
        *a3 = a4->field_8;
    return 1;
}
