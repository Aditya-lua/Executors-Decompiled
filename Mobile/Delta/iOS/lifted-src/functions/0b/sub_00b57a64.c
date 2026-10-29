/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb57a64..0xb57adc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b57a64_0 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[40];
    char field_6c;
} st_b57a64_0;


int sub_b57a64(st_b57a64_0 *a0, long long a1)
{
    char v0;  // [bp-0xf8]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(a0->field_6c >> 1 & 1) && 1 < a0->field_40 - 3)
    {
        sub_a66288(a1, &v0);
        sub_a663dc(&v0, &a0[1].padding_44[15]);
        sub_a66ec0(&v0, 216);
        return 1;
    }
    sub_a66288(a1, &a0[1].padding_44[15]);
    return 1;
}
