/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0bcb8..0xb0bd04 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0bcb8_0 {
    char padding_0[576];
    unsigned long long field_240;
} st_b0bcb8_0;


int sub_b0bcb8(st_b0bcb8_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_240 = 0;
    sub_9fc26c(a1, &a0->padding_0[192]);
    sub_9fc26c(a1 + 8, &a0->padding_0[320]);
    sub_9fc26c(a1 + 16, &a0->padding_0[448]);
    return 1;
}
