/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x968218..0x9682b8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_968218_2 {
    char padding_0[8];
    struct st_968218_1 *field_8;
} st_968218_2;

typedef struct st_968218_1 {
    char padding_0[1648];
    struct st_968218_0 *field_670;
    unsigned long long field_678;
} st_968218_1;

typedef struct st_968218_0 {
    char padding_0[28];
    unsigned short field_1c;
} st_968218_0;

extern unsigned short g_d280f4;

unsigned long long sub_968218(st_968218_2 *a0, unsigned long long a1, unsigned long a2)
{
    unsigned long v4;  // x8
    unsigned short *v5;  // x9
    unsigned long v6;  // x8
    unsigned short *v7;  // x9
    unsigned long long v8;  // x10
    unsigned long long v9;  // x10
    char v0;  // [bp-0x12]
    char v1;  // [bp-0x11]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_8->field_678;
    if (!a0->field_8->field_678)
        return 0;
    v5 = &a0->field_8->field_670->field_1c;
    do
    {
        v6 = v4;
        if (*v5 == a1)
        {
            v0 = a1 >> 8;
            v1 = a1;
            if (a1)
            {
                v7 = &g_d280f4;
                v8 = 45;
                do
                {
                    v9 = v8;
                    if (*v7 == a1)
                        goto LABEL_968290;
                } while ((v7 += 4, v8 = v9 - 1, v9 != 1));
            }
LABEL_968290:
            return (unsigned int)sub_959e54();
        }
    } while ((v5 += 28, v4 = v6 - 1, v6 != 1));
    return 0;
}
