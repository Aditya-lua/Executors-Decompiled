/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3570..0xaf368c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3570_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_af3570_0;


st_af3570_0 * sub_af3570(long long a0, st_af3570_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x21
    unsigned int i;  // w0
    st_af3570_0 *v5;  // x0
    unsigned int v6;  // w8
    st_af3570_0 *v7;  // x23
    unsigned long long v8;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad66d4();
    if (v2 >> 31 & 1)
        return 0;
    v3 = v2;
    if (2 <= a1->field_0 - 1)
        return sub_ad69f8();
    i = sub_ad69e4(a0);
    if ((int)i > (int)v3)
    {
        do
        {
            v5 = sub_ad69f8(a0, v3);
            v6 = v5->field_0;
            if (v6 != a1->field_0)
                break;
            v7 = v5;
            if (v6 != 2)
            {
                if (v6 != 1)
                    continue;
                v8 = (unsigned int)sub_af1928(v7->field_8, a1->field_8);
            }
            else
            {
                v8 = (unsigned int)sub_af1934(v7->field_8, a1->field_8);
            }
            if (v8)
                break;
            v6 = a1->field_0;
            if (v6 == 2)
            {
                if (!sub_af1940(v7->field_8, a1->field_8))
                    return v7;
            }
            else
            {
                if (v6 != 1)
                {
                    return v7;
                }
                else if (!sub_af1a9c(v7->field_8, a1->field_8))
                {
                    return v7;
                }
            }
            v3 = (unsigned int)v3 + 1;
        } while (i != (unsigned int)v3);
    }
    return 0;
}
