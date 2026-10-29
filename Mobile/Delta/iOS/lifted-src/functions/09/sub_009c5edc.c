/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5edc..0x9c6040 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5edc_0 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    long long field_10;
} st_9c5edc_0;

extern char g_f08398;
extern char g_f127a0;

st_9c5edc_0 * sub_9c5edc(char a0, long long a1, unsigned long long a2)
{
    unsigned long long len;  // x20
    unsigned long long v4;  // 4178
    char v5;  // x0
    unsigned int v6;  // w0
    unsigned long long v7;  // 4112
    unsigned int v8;  // w8
    unsigned long v9;  // x22
    unsigned long v10;  // x26
    st_9c5edc_0 *v11;  // x23
    char v0;  // [bp-0x68], Other Possible Types: long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    len = a2;
    v4 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
    if (v4 & 1)
    {
        len = _strlen(a1);
        if (a0)
        {
LABEL_9c5f28:
            v5 = sub_a34cd4(&v0, a1, len);
            if (v5)
            {
                if (!sub_a32d54(v0))
                    v5 = 0;
                sub_a330d4();
                *(long long *)a0 = v0;
                return v5;
            }
            *(unsigned long long *)a0 = 0;
        }
    }
    else if (a0)
    {
        goto LABEL_9c5f28;
    }
    if (*(long long *)&g_f127a0)
    {
        v6 = sub_ad69e4(*(long long *)&g_f127a0);
        v7 = arm64g_calculate_condition(177, v6, 14, 0);
        if (v7 & 1)
            goto LABEL_9c6018;
        v8 = v6 + 15;
    }
    else
    {
        v8 = 15;
    }
    v9 = v8 - 16;
    v10 = v8;
    do
    {
        if (15 >= v10)
        {
            v11 = *(long long *)(&(&g_f08398)[8 * v10] - 8);
            if (v11->field_8 & 1)
                continue;
        }
        else
        {
            v11 = sub_ad69f8(*(long long *)&g_f127a0, v9);
            if (v11->field_8 & 1)
                continue;
        }
        if ((unsigned int)len == _strlen(v11->field_10) && !sub_a6e258(v11->field_10, a1, (int)len))
            return v11;
    } while ((v10 -= 1, v9 = (unsigned int)v9 - 1, v10 + 1 > 1));
LABEL_9c6018:
    return 0;
}
