/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2a58..0x1a2b8c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2a58_0 {
    char field_0;
} st_1a2a58_0;


unsigned long long sub_1a2a58(long long a0)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // 4110
    unsigned int v10;  // w8
    st_1a2a58_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a2a58_0 *v1;  // [bp-0x38]
    st_1a2a58_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_1a2a58_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (!sub_6b08())
        return 1;
    if (sub_6b08(a0) == 1)
    {
        v6 = 0;
    }
    else
    {
        v7 = sub_6b08(a0);
        v8 = sub_1b2e24(*(char *)sub_2fa10(a0, 0));
        if (v7 == 2)
        {
            if (v8 & 1)
                v6 = 1;
            else
                return 0;
        }
        else
        {
            if (!(unsigned int)v8)
                return (unsigned int)v8;
            v6 = 1;
            v9 = arm64g_calculate_condition(146, sub_6b08(a0) - 3, 3, 0);
            if (v9 & 1)
            {
                do
                {
                    v10 = *(char *)sub_2fa10(a0, v6);
                    if (v10 != 9 && v10 != 32 && !(sub_1b2e24((char)v10) & 1))
                        return 0;
                } while ((v6 += 1, sub_6b08(a0) - 1 > v6));
            }
        }
    }
    return (unsigned int)sub_1b2e24(*(char *)sub_2fa10(a0, v6));
}
