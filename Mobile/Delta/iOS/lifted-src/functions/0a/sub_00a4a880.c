/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4a880..0xa4a8d4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4a880_0 {
    char padding_0[128];
    unsigned long long field_80;
} st_a4a880_0;

typedef struct st_a4a880_1 {
    char padding_0[136];
    unsigned long long field_88;
} st_a4a880_1;


int sub_a4a880(long long a0, unsigned long long *a1)
{
    st_a4a880_0 *v3;  // x0
    st_a4a880_1 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9fc26c(a1, sub_9ffdd8());
    v3 = sub_9ffdd8(a0);
    v3->field_80 = a1[1];
    v4 = sub_9ffdd8(a0);
    v4->field_88 = a1[2];
    return 1;
}
