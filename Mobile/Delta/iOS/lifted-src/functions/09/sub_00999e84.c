/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999e84..0x999f98 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_999e84_0 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[48];
    char field_50;
    char padding_51[1607];
    unsigned long long field_698;
    long long field_6a0;
    char padding_6a8[8];
    long long field_6b0;
    char padding_6b8[2328];
    unsigned long long field_fd0;
    unsigned long long field_fd8;
    unsigned long long field_fe0;
    unsigned int field_fe8;
} st_999e84_0;

typedef struct st_999e84_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_999e84_1;


char sub_999e84(st_999e84_0 *a0)
{
    unsigned long v2;  // x21
    st_999e84_1 *iter;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_1c == 1)
    {
        v2 = a0->field_698;
        if (v2 > (unsigned long long)*(long long *)&a0->padding_51[1599])
        {
            if (v2 != 1)
            {
                return 0;
            }
            else if (*(long long *)&a0->padding_51[47])
            {
                return 0;
            }
        }
        else
        {
            if (!v2)
                goto LABEL_999f48;
        }
        iter = &(a0->padding_20)[v2 + 16];
        do
        {
            if (!*(int *)&iter->padding_0[40])
                sub_a6c2e4(*(long long *)&iter->padding_0[0], "ssl/record/methods/tls_common.c", 0x88);
            else
                *(unsigned int *)&iter->padding_0[40] = 0;
        } while ((*(unsigned long long *)&iter->padding_0[0] = 0, iter = (char *)iter - 48, v2 -= 1, v2));
LABEL_999f48:
        a0->field_698 = 0;
    }
    else
    {
        if (a0->field_fd8 < a0->field_fd0 || a0->field_fd8 != a0->field_fe0 || *(long long *)&a0->padding_6b8[8] || a0->field_fe8 == 241)
            return 0;
        if (a0->field_50 >> 1 & 1)
            sub_a66ec0(a0->field_6a0, a0->field_6b0);
        sub_a6c2e4(a0->field_6a0, "ssl/record/methods/tls_common.c", 284);
        a0->field_6a0 = 0;
        *(uint128_t *)&a0[1].padding_0[4] = 0;
    }
    return 1;
}
