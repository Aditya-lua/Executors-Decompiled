/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03df4..0xb03e54 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03df4_0 {
    char padding_0[8];
    struct st_b03df4_1 *field_8;
} st_b03df4_0;

typedef struct st_b03df4_1 {
    unsigned long long field_0;
} st_b03df4_1;

typedef struct st_b03df4_2 {
    char padding_0[104];
    struct st_b03df4_0 *field_68;
} st_b03df4_2;


void sub_b03df4(st_b03df4_2 *a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return;
    a0->field_68->field_8();
}
