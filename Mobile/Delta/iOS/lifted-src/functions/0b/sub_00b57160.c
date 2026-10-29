/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb57160..0xb57188 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b57160_0 {
    char padding_0[320];
    unsigned long long field_140;
} st_b57160_0;


int sub_b57160(st_b57160_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_140 = 0;
    sub_9fc26c(a1, &a0->padding_0[192]);
    return 1;
}
