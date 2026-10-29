/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1f90..0xab2070 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1f90_0 {
    char padding_0[1];
    char field_1;
    char padding_2[62];
    struct st_ab1f90_0 *field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    char padding_68[32];
    long long field_88;
} st_ab1f90_0;


st_ab1f90_0 * sub_ab1f90(st_ab1f90_0 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_ab1f90_0 *v21;  // x24
    long long *v22;  // x25
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_ab1f90_0 *i;  // w0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (a0)
    {
        v0 = v11;
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = &v10;
        v9 = v19;
        if (a0->field_40)
        {
            sub_ad68a0(a1);
            sub_ad68a0(a1, a0->field_48);
            sub_ad68a0(a2, a0->field_50);
            sub_ad68a0(a2, a0->field_58);
            sub_ad68a0(a3, a0->field_60);
            i = (st_ab1f90_0 *)(unsigned int)sub_ad69e4(a0->field_88);
            if (i >= 1)
            {
                v21 = 0;
                do
                {
                    v22 = sub_ad69f8(a0->field_88, v21);
                    sub_ad68a0(a1, *v22);
                    sub_ad68a0(a2, v22[1]);
                    sub_ad68a0(a3, v22[2]);
                    v21 = (unsigned int)v21 + 1;
                } while (i != (unsigned int)v21);
            }
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
