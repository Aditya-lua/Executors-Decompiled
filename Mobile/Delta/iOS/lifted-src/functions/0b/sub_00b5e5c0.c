/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e5c0..0xb5e628 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e5c0_1 {
    unsigned long long field_0;
} st_b5e5c0_1;

typedef struct st_b5e5c0_0 {
    char padding_0[56];
    struct st_b5e5c0_1 *field_38;
    char padding_40[44];
    char field_6c;
} st_b5e5c0_0;


int sub_b5e5c0(st_b5e5c0_0 *a0, unsigned long a1, long long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_38)
    {
        a0->field_38();
    }
    else if (!(a0->field_6c >> 1 & 1))
    {
        sub_a92eec(a2);
        return 1;
    }
    else
    {
        sub_a92d00(a2);
        return 1;
    }
}
