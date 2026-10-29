/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0852c..0xb08598 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0852c_2 {
    char padding_0[168];
    struct st_b0852c_0 *field_a8;
} st_b0852c_2;

typedef struct st_b0852c_0 {
    char padding_0[24];
    struct st_b0852c_1 *field_18;
} st_b0852c_0;

typedef struct st_b0852c_1 {
    unsigned long long field_0;
} st_b0852c_1;


void sub_b0852c(st_b0852c_2 *a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return;
    a0->field_a8->field_18();
}
