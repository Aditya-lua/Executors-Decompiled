/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x53c18..0x53d10 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_53c18_6 {
    char padding_0[8];
    unsigned long long field_8;
} st_53c18_6;

typedef struct st_53c18_2 {
    struct st_53c18_1 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
} st_53c18_2;

typedef struct st_53c18_1 {
    char padding_0[56];
    struct st_53c18_2 *field_38;
} st_53c18_1;

typedef struct st_53c18_5 {
    char padding_0[32];
    unsigned long long field_20;
    struct st_53c18_2 *field_28;
    struct st_53c18_4 *field_30;
    struct st_53c18_2 *field_38;
} st_53c18_5;

typedef struct st_53c18_3 {
    unsigned long long field_0;
} st_53c18_3;

typedef struct st_53c18_4 {
    struct st_53c18_3 *field_0;
} st_53c18_4;

typedef struct st_53c18_0 {
    char field_0;
} st_53c18_0;


st_53c18_2 * sub_53c18(long long a0, st_53c18_5 *a1)
{
    st_53c18_2 *v5;  // x21
    st_53c18_2 *v6;  // x22
    st_53c18_2 *v7;  // x0
    st_53c18_6 *v8;  // x0
    st_53c18_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_53c18_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_38)
    {
        (*(long long *)*(long long *)*(long long *)a1->field_30)();
    }
    else if (a1->field_28)
    {
        v5 = 0;
        v6 = 0;
        do
        {
            v2 = *(long long *)(a1->field_20 + (char *)v5);
            if (!*(long long *)(*(long long *)(a1->field_20 + (char *)v5) + 56) && a1->field_38 > v6)
            {
                v7 = sub_158b8(a0 + 192, a1->field_30 + v5);
                if (v7)
                {
                    sub_54a20(a0 + 152, &v2);
                    v8 = sub_12484(a0 + 152, &v2);
                    v8->field_8 = *(long long *)&v7->field_1;
                }
            }
        } while ((v6 = (char *)&v6->field_0 + 1, v5 = &v5->field_1, a1->field_28 > v6));
        return 0;
    }
    else
    {
        return 0;
    }
}
