/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5af0..0xaa5ba8 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa5af0_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    struct st_aa5af0_1 *field_18;
} st_aa5af0_0;

typedef struct st_aa5af0_1 {
    unsigned long long field_0;
} st_aa5af0_1;


st_aa5af0_0 * sub_aa5af0(st_aa5af0_0 *a0, unsigned long a1, unsigned int a2, st_aa5af0_0 *a3, unsigned long a4)
{
    st_aa5af0_0 *v4;  // x0
    st_aa5af0_0 *v5;  // x0
    st_aa5af0_0 *v6;  // x20
    unsigned long v0;  // [bp-0x70]
    st_aa5af0_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0)
    {
        return 0;
    }
    else if ((int)a2 < 1)
    {
        return 0;
    }
    else if (a3)
    {
        v4 = sub_a7c17c(a0->field_10);
        if (!(unsigned int)v4)
            return v4;
        v5 = sub_a7b720(a0->field_8, a2);
        if (v5)
        {
            v0 = a1;
            v1 = a3;
            v6 = sub_a66b6c(v5->field_10, &v0);
            if (v6)
                v6->field_18();
        }
        else
        {
            v6 = 0;
        }
        sub_a7c1b4(a0->field_10);
        return v6;
    }
    else
    {
        return 0;
    }
}
