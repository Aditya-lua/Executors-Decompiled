/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf7af4..0xaf7c00 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af7af4_1 {
    char padding_0[32];
    struct st_af7af4_0 *field_20;
    char padding_28[16];
    struct st_af7af4_2 *field_38;
    char padding_40[112];
    unsigned int field_b0;
    char padding_b4[20];
    long long field_c8;
    char field_d0;
} st_af7af4_1;

typedef struct st_af7af4_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_af7af4_0;

typedef struct st_af7af4_2 {
    unsigned long long field_0;
} st_af7af4_2;


unsigned long long sub_af7af4(st_af7af4_1 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // w0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_20->field_18 >> 1 & 1))
    {
        if (a0->field_20->field_18 >> 21 & 1)
            return 1;
        v2 = 0;
        if (a2)
            goto LABEL_af7b34;
    }
    else
    {
        v2 = &a0->field_20->padding_0[8];
        if (a2)
        {
LABEL_af7b34:
            a0->field_c8 = a1;
        }
    }
    v3 = (unsigned int)sub_af4c74(sub_975ff4(a1), v2);
    if (v3)
    {
        if (v3 >= 1)
        {
            if (a2)
            {
                a0->field_b0 = 11;
                a0->field_38();
            }
        }
        else
        {
            if (sub_962b90(a1))
            {
                v5 = sub_af4c74(sub_962b90(a1), v2);
                if ((unsigned int)v5)
                {
                    if (!(v5 >> 31 & 1) || a0->field_d0 >> 1 & 1)
                        goto LABEL_af7bb8;
                    if (a2)
                    {
                        a0->field_b0 = 12;
                        a0->field_38();
                    }
                }
                else if (a2)
                {
                    a0->field_b0 = 16;
                    a0->field_38();
                }
            }
            else
            {
LABEL_af7bb8:
                if (!a2)
                    return 1;
                a0->field_c8 = 0;
                return 1;
            }
        }
    }
    else
    {
        if (a2)
        {
            a0->field_b0 = 15;
            a0->field_38();
        }
    }
    return 0;
}
