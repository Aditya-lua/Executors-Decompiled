/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3bffc..0xa3c0e4 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3bffc_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    long long field_1c;
    long long field_20;
} st_a3bffc_0;


unsigned long long sub_a3bffc(unsigned long long a0, long long a1, st_a3bffc_0 *a2)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // x22
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3bbe8();
    if ((int)v2 < 1)
        return v2;
    if ((unsigned int)a0 != 8)
    {
        if ((unsigned int)a0 == 1 && a2->field_8 == 2)
            goto LABEL_a3c040;
    }
    else
    {
        if (a2->field_8 == 1)
        {
LABEL_a3c040:
            v3 = &a2[1].padding_c[4];
            sub_a99b48(v3, 50, a2->field_1c, 0);
            a2->field_1c = v3;
            *(unsigned int *)&(a2->padding_c)[1] = 0;
        }
    }
    v4 = sub_a3aef4(a0, a1, a2);
    if ((int)v4 < 1)
        return v4;
    if ((unsigned int)a0 != 2)
    {
        if ((unsigned int)a0 != 7)
        {
            return v4;
        }
        else if (a2->field_8 != 2)
        {
            return v4;
        }
    }
    else
    {
        if (a2->field_8 != 1)
            return v4;
    }
    a2->field_1c = sub_a997a4(a2->field_1c, 0);
    return v4;
}
