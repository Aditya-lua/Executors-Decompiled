/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc62520..0xc625b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c62520_0 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    long long field_38;
    char padding_40[40];
    char field_68;
} st_c62520_0;


long long sub_c62520(long long a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_c62520_0 *v8;  // x19
    unsigned int v9;  // w8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (3 < a1)
    {
        return a0;
    }
    else if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = a0 + a1 * 208;
        v9 = v8->field_68;
        if (v9 != 4)
        {
            if (2 >= v9 - 1)
            {
                sub_990908(v8);
                if (v8->field_30)
                {
                    sub_a4bca0(v8->field_30);
                    v8->field_30 = 0;
                }
                sub_a66ec0(&v8[1].padding_0[1], 16);
                if (v8->field_38)
                {
                    sub_a4bca0(v8->field_38);
                    v8->field_38 = 0;
                }
                sub_a66ec0(&v8[1].padding_0[0x11], 16);
            }
            a0 = sub_a3f52c(v8->field_28);
            v8->field_28 = 0;
            v8->field_68 = 4;
        }
        return a0;
    }
    else
    {
        return a0;
    }
}
