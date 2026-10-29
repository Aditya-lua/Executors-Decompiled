/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadf0b8..0xadf368 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adf0b8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_adf0b8_0;

extern unsigned long long g_c7c2eb;

int sub_adf0b8(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    long long v7;  // x21
    unsigned long v8;  // x22
    long long *v9;  // x28
    unsigned long v10;  // x25
    st_adf0b8_0 *v11;  // x23
    unsigned long v12;  // x27
    long long v13;  // x0
    long long v14;  // x0
    unsigned long v15;  // x24
    unsigned long long v0;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x88]
    long long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v8 = 0;
    v3 = (unsigned int)a3 + 8;
    v4 = (unsigned int)a3 + 4;
    v2 = v7;
    while (1)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2) < 1)
            break;
        v9 = sub_ad69f8(v7, v8);
        if ((int)sub_ad69e4(*v9) >= 1)
        {
            v10 = 0;
            do
            {
                v0 = v4;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(a2, "%*sAllowed Attribute Type or Values:\n") < 1)
                    return 0;
                v11 = sub_ad69f8(*v9, v10);
                if (v11->field_0 == 1)
                {
                    v12 = v11->field_8;
                    v13 = sub_af17c0(v12);
                    v14 = sub_a99eac(v13);
                    v0 = v3;
                    v1 = &g_c7c2eb;
                    if ((int)sub_9d524c(a2, "%*sAttribute Values: ") < 1 || (int)sub_9c3060(a2, v13) < 1 || (int)sub_9d4888(a2, "\n") < 1)
                        goto LABEL_adf33c;
                    if ((int)sub_af1728(v12) < 1)
                        continue;
                    v15 = 0;
                    do
                    {
                        if ((int)sub_af961c(a2, v14, sub_af1810(v12, v15), (unsigned int)a3 + 12) < 1 || (int)sub_9d4888(a2, "\n") < 1)
                            goto LABEL_adf33c;
                    } while ((v15 = (unsigned int)v15 + 1, (int)v15 < (int)sub_af1728(v12)));
                }
                else if (!v11->field_0 && (v0 = v3, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*sAttribute Type: ") >= 1 && (int)sub_9c3060(a2, v11->field_8) >= 1 && 1 <= (int)sub_9d4888(a2, "\n")))
                {
                    continue;
                }
            } while ((v10 = (unsigned int)v10 + 1, (int)v10 < (int)sub_ad69e4(*v9)));
        }
        v0 = v4;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2, "%*sHolder Domain: ") < 1 || (int)sub_aec458(a2, v9[1]) < 1 || (int)sub_9d4888(a2, "\n") <= 0)
            break;
        v8 = (unsigned int)v8 + 1;
        v7 = v2;
        if ((int)v8 >= (int)sub_ad69e4(v7))
            return 1;
    }
LABEL_adf33c:
    return 0;
}
