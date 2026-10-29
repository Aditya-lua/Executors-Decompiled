/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972498..0x972574 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_972498_0 {
    char field_0;
    char padding_1[3];
    char field_4;
    char field_5;
    char field_6;
    char padding_7[1];
    struct st_972498_1 *field_8;
    char padding_10[56];
    unsigned long long field_48;
} st_972498_0;

typedef struct st_972498_1 {
    char field_0;
} st_972498_1;


char sub_972498(st_972498_0 *a0)
{
    char v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // x8
    char v10;  // w9
    char v11;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_4)
        return 0;
    v5 = a0->field_6;
    if (v5 == 1)
    {
        return v5;
    }
    else if (v5 == 2)
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        v9 = a0->field_48;
        v10 = a0->field_5;
        if (v10)
        {
            v11 = v10 - 1;
            goto LABEL_9724fc;
        }
        else
        {
            if (v9)
            {
                v9 -= 1;
                v11 = 7;
LABEL_9724fc:
                if (!((char)(*(char *)&a0->field_8[v9]) >> (v11 & 31) & 1))
                {
                    a0->field_4 = 1;
                    return 0;
                }
                sub_9721c8();
                if (a0->field_4)
                    return 0;
                sub_97228c(a0);
            }
            else if (a0->field_0 & 1)
            {
                sub_9721c8();
            }
            else
            {
                a0->field_6 = 1;
                return 1;
            }
            a0->field_6 = 1;
            return 1;
        }
    }
    else
    {
        a0->field_4 = 1;
        return 0;
    }
}
