/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a6ff4..0x9a7218 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a6ff4_2 {
    int field_0;
    char padding_4[212];
    struct st_9a6ff4_0 *field_d8;
} st_9a6ff4_2;

typedef struct st_9a6ff4_4 {
    char padding_0[24];
    struct st_9a6ff4_2 *field_18;
    char padding_20[140];
    int field_ac;
    char padding_b0[64];
    unsigned int field_f0;
    char padding_f4[524];
    unsigned long long field_300;
    char padding_308[136];
    struct st_9a6ff4_5 *field_390;
    char padding_398[1336];
    long long field_8d0;
    char padding_8d8[40];
    struct st_9a6ff4_3 *field_900;
    char padding_908[170];
    char field_9b2;
    char padding_9b3[29];
    long long field_9d0;
    char padding_9d8[464];
    unsigned int field_ba8;
} st_9a6ff4_4;

typedef struct st_9a6ff4_5 {
    unsigned int field_0;
} st_9a6ff4_5;

typedef struct st_9a6ff4_3 {
    char padding_0[752];
    unsigned int field_2f0;
    char padding_2f4[4];
    unsigned long long field_2f8;
} st_9a6ff4_3;

typedef struct st_9a6ff4_0 {
    struct st_9a6ff4_1 *field_0;
    char padding_8[8];
    struct st_9a6ff4_1 *field_10;
    char padding_18[56];
    char field_50;
} st_9a6ff4_0;

typedef struct st_9a6ff4_1 {
    unsigned long long field_0;
} st_9a6ff4_1;


unsigned long long sub_9a6ff4(st_9a6ff4_4 *a0)
{
    int v2;  // w8
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    st_9a6ff4_0 *v5;  // x8
    unsigned long long v6;  // x0
    st_9a6ff4_3 *v7;  // x9
    unsigned int *v8;  // x10
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned long long *)&a0->padding_f4[20] = 0;
    if (a0->field_ac > 0x11)
    {
        switch (v2)
        {
        case 18:
            v5 = a0->field_18->field_d8;
            if (!(v5->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772)
                if (a0->field_18->field_0 != 0x10000)
                    goto LABEL_9a7208;
                else
                    goto LABEL_9a708c;
LABEL_9a708c:
            if ((int)a0->field_8d0 == 1)
                goto LABEL_9a7208;
            if (a0->field_f0 == 2 && *(int *)&a0[1].padding_908[140])
            {
                v6 = sub_96f630();
                if ((unsigned int)v6)
                    goto LABEL_9a7208;
                return v6;
            }
            v7 = a0->field_900;
            v7->field_2f8 = a0->field_300;
            v8 = a0->field_390;
            if (v8)
                v8 = *v8;
            v7->field_2f0 = (unsigned int)v8;
            v5->field_0();
        case 20:
            if (sub_9a6654() == 1)
            {
                if (a0->field_18->field_d8->field_50 >> 3 & 1)
                    goto LABEL_9a7208;
                if (a0->field_18->field_0 < 772)
                    goto LABEL_9a7208;
                if (a0->field_18->field_0 == 0x10000)
                    goto LABEL_9a7208;
                v4 = sub_9afaf0(a0);
                if (!(unsigned int)v4)
                    return v4;
                if (a0->field_ba8 == 4)
                    goto LABEL_9a7208;
                a0->field_18->field_d8->field_10();
            }
            else
            {
                return 5;
            }
        case 47:
            if (sub_9a6654() == 1)
            {
                v3 = sub_970188(a0, 1);
                if ((unsigned int)v3)
                    goto LABEL_9a7208;
                return v3;
            }
            return 4;
        default:
LABEL_9a7208:
            break;
        }
    }
    else
    {
        switch (v2)
        {
        case 13:
            if (a0->field_f0 != 2 || !*(int *)&a0[1].padding_908[140])
            {
                a0 = a0;
                if (!sub_9a6654())
                    return 4;
            }
            else if (!(a0->field_9b2 >> 4 & 1))
            {
                a0 = a0;
                if (!sub_96f630())
                    return 0;
            }
            if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
                goto LABEL_9a7208;
            *(unsigned int *)&a0->field_9d0 = 1;
            goto LABEL_9a7208;
        case 16:
            v9 = sub_9a7218();
            if ((unsigned int)v9)
                goto LABEL_9a7208;
            return v9;
        default:
LABEL_9a7208:
            break;
        }
    }
    return 2;
}
