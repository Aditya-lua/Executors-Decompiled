/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa430a0..0xa4312c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a430a0_1 {
    char padding_0[248];
    char field_f8;
    char padding_f9[247];
    struct st_a430a0_1 *field_1f0;
    unsigned long long field_1f8;
} st_a430a0_1;

typedef struct st_a430a0_0 {
    char padding_0[248];
    char field_f8;
    char padding_f9[247];
    struct st_a430a0_0 *field_1f0;
    struct st_a430a0_0 *field_1f8;
} st_a430a0_0;


int sub_a430a0(unsigned long a0, st_a430a0_0 *a1, unsigned long a2, long long a3)
{
    st_a430a0_0 **v2;  // x0
    st_a430a0_1 *v3;  // x0
    st_a430a0_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    switch (a1)
    {
    case 0:
        v2[62] = 0;
        v2[63] = 0;
        break;
    case 8:
        v3 = sub_9ffdd8(a3);
        v4 = v2;
        if (v4->field_1f0)
        {
            if (v4->field_1f0 == v4)
                v3->field_1f0 = v3;
            else
                return 0;
        }
        if (v4->field_1f8)
        {
            if (v4->field_1f8 != &v4->field_f8)
                return 0;
            v3->field_1f8 = &v3->field_f8;
            break;
        }
        break;
    default:
        return 0xffffffff;
    }
    return 1;
}
