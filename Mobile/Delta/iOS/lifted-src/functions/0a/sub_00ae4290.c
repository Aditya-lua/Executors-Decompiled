/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4290..0xae4448 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4290_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    unsigned long long field_20;
} st_ae4290_0;

extern unsigned long long g_c7c2eb;

unsigned long long sub_ae4290(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v4;  // x22
    unsigned long v5;  // x23
    st_ae4290_0 *v6;  // x25
    unsigned long long v0;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v4 = 0;
    v5 = (unsigned int)a3 + 4;
    do
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2, "%*sIssuer-Serials:\n") < 1)
            return 0;
        v6 = sub_ad69f8(a1, v4);
        if (v6->field_0)
        {
            v0 = v5;
            v1 = &g_c7c2eb;
            sub_9d524c(a2, "%*sIssuer Names:\n");
            sub_af091c(a2, v6->field_0, v5);
            sub_9d4888(a2, "\n");
        }
        else
        {
            v0 = v5;
            v1 = &g_c7c2eb;
            sub_9d524c(a2, "%*sIssuer Names: <none>\n");
        }
        v0 = v5;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sIssuer Serial: ");
        if ((int)sub_9c994c(a2, &v6->field_8) < 1)
            return 0;
        sub_9d4888(a2, "\n");
        if (v6->field_20)
        {
            v0 = v5;
            v1 = &g_c7c2eb;
            sub_9d524c(a2, "%*sIssuer UID: ");
            if ((int)sub_9c9acc(a2, v6->field_20, 3) < 1)
                return 0;
            sub_9d4888(a2, "\n");
        }
        else
        {
            v0 = v5;
            v1 = &g_c7c2eb;
            sub_9d524c(a2, "%*sIssuer UID: <none>\n");
        }
        if ((int)sub_9d4888(a2, "\n") <= 0)
            return 0;
        v4 = (unsigned int)v4 + 1;
    } while ((int)v4 < (int)sub_ad69e4(a1));
    return 1;
}
