/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4988..0xaf4b20 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4988_1 {
    char padding_0[32];
    struct st_af4988_0 *field_20;
    char padding_28[16];
    struct st_af4988_2 *field_38;
    char padding_40[88];
    long long field_98;
    char padding_a0[12];
    unsigned int field_ac;
    unsigned int field_b0;
    char padding_b4[4];
    unsigned long long field_b8;
} st_af4988_1;

typedef struct st_af4988_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_af4988_0;

typedef struct st_af4988_2 {
    unsigned long long field_0;
} st_af4988_2;


unsigned long long sub_af4988(st_af4988_1 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x20
    unsigned long long v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v8;  // x0
    unsigned int v9;  // w8
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a1;
    if (a0->field_20->field_18 >> 1 & 1)
    {
        v4 = &a0->field_20->padding_0[8];
    }
    else if (!(a0->field_20->field_18 >> 21 & 1))
    {
        v4 = 0;
    }
    else
    {
        return 1;
    }
    v5 = sub_af4c74(sub_975fec(v3), v4);
    if (v2 >> 31 & 1 && !(v5 >> 31 & 1))
        return 0;
    if (!(unsigned int)v5)
    {
        if (!(v2 >> 31 & 1))
        {
            a0->field_ac = v2;
            v10 = v3;
            if (!v10)
                goto LABEL_af4a20;
        }
        else
        {
            v10 = v3;
            if (!v3)
            {
LABEL_af4a20:
                v10 = sub_ad69f8(a0->field_98);
            }
        }
        a0->field_b8 = v10;
        a0->field_b0 = 13;
        a0->field_38();
    }
    else if ((int)v5 >= 1)
    {
        if (!(v2 >> 31 & 1))
        {
            a0->field_ac = v2;
            v6 = v3;
            if (!v6)
                goto LABEL_af49f8;
        }
        else
        {
            v6 = v3;
            if (!v3)
            {
LABEL_af49f8:
                v6 = sub_ad69f8(a0->field_98);
            }
        }
        a0->field_b8 = v6;
        a0->field_b0 = 9;
        a0->field_38();
    }
    else
    {
        v8 = sub_af4c74(sub_975ffc(v3), v4);
        if (!(v2 >> 31 & 1) || 1 <= (int)v8)
        {
            if (!(unsigned int)v8)
            {
                if (!(v2 >> 31 & 1))
                {
                    a0->field_ac = v2;
                    if (!v3)
                        goto LABEL_af4aac;
                }
                else
                {
                    v2 = a0->field_ac;
                    if (!v3)
                    {
LABEL_af4aac:
                        v3 = sub_ad69f8(a0->field_98, v2);
                    }
                }
                a0->field_b8 = v3;
                v9 = 14;
            }
            else if (v8 >> 31 & 1)
            {
                if (!(v2 >> 31 & 1))
                    a0->field_ac = v2;
                else
                    v2 = a0->field_ac;
                if (!v3)
                    v3 = sub_ad69f8(a0->field_98, v2);
                a0->field_b8 = v3;
                v9 = 10;
            }
            else
            {
                return 1;
            }
            a0->field_b0 = v9;
            a0->field_38();
        }
    }
    return 0;
}
