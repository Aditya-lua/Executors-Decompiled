/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2fec..0x9b33f4 (1032 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b2fec_0 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_9b2fec_0;

typedef struct st_9b2fec_2 {
    char padding_0[24];
    struct st_9b2fec_0 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[28];
    long long field_68;
    char padding_70[60];
    int field_ac;
    char padding_b0[592];
    struct st_9b2fec_1 *field_300;
    char padding_308[512];
    unsigned int field_508;
    char padding_50c[964];
    long long field_8d0;
    char padding_8d8[120];
    unsigned int field_950;
    char padding_954[92];
    unsigned long long field_9b0;
    char field_9b4;
    char padding_9b5[27];
    long long field_9d0;
    char padding_9d8[464];
    unsigned int field_ba8;
} st_9b2fec_2;

typedef struct st_9b2fec_1 {
    char padding_0[32];
    unsigned int field_20;
} st_9b2fec_1;


unsigned long long sub_9b2fec(st_9b2fec_2 *a0)
{
    unsigned int v2;  // w8
    st_9b2fec_0 *v3;  // x8
    unsigned int v12;  // w8
    st_9b2fec_2 *v4;  // x19
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long v8;  // x10
    unsigned long v9;  // x9
    unsigned long long v10;  // x10
    void* v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned long long *)&a0->padding_b0[88] = 0;
    if (36 >= a0->field_ac)
    {
        switch (v2)
        {
        case 24:
            if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1)
                goto LABEL_9b33e0;
            if (a0->field_18->field_0 < 772)
                goto LABEL_9b33e0;
            if (a0->field_18->field_0 == 0x10000)
                goto LABEL_9b33e0;
            if ((int)a0->field_8d0 == 1)
            {
                if (a0->field_9b0 >> 20 & 1)
                    goto LABEL_9b33e0;
                if (sub_9a6654() == 1)
                    goto LABEL_9b33e0;
                return 4;
            }
            else if (a0->field_9b0 >> 20 & 1)
            {
                if ((int)a0->field_8d0 != 2)
                    goto LABEL_9b33e0;
                else
                    goto LABEL_9b30d0;
            }
        case 21:
            if (sub_9a6654() == 1)
            {
                v6 = sub_954420(a0);
                if ((unsigned int)v6)
                    goto LABEL_9b33e0;
                return v6;
            }
            break;
        case 28:
            if (*(int *)&a0->padding_9d8[456] == 3)
            {
                if (sub_9a6654() == 1)
                    goto LABEL_9b33e0;
                return 4;
            }
            v3 = a0->field_18;
            if ((char)((char)v3->field_d8[80]) >> 3 & 1)
            {
                *(unsigned int *)&a0->padding_9d8[348] = 0;
                goto LABEL_9b33e0;
            }
            goto LABEL_9b3374;
        case 23:
            v4 = a0;
            if (sub_9a6654() == 1)
            {
                if (v4->field_48 != 0x100)
                {
                    v5 = sub_954420(v4);
                    v4 = v4;
                    if (!(unsigned int)v5)
                        return v5;
                }
                *(unsigned int *)&v4->padding_9b5[23] = 1;
                goto LABEL_9b33e0;
            }
            break;
        case 29:
            if (sub_9a6654() == 1)
                goto LABEL_9b33e0;
            return 4;
        default:
LABEL_9b33e0:
            return 2;
        }
    }
    else
    {
        switch (v2)
        {
        case 40:
            if (sub_9a6654() == 1)
            {
                if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1)
                    goto LABEL_9b33e0;
                if (a0->field_18->field_0 < 772)
                    goto LABEL_9b33e0;
                if (a0->field_18->field_0 == 0x10000)
                    goto LABEL_9b33e0;
                (long long)a0->field_18->field_d8[8]();
            }
            break;
        case 37:
            *(unsigned int *)___error() = 0;
            if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1)
                goto LABEL_9b33e0;
            if (a0->field_18->field_0 < 772)
                goto LABEL_9b33e0;
            if (a0->field_18->field_0 == 0x10000)
                goto LABEL_9b33e0;
            if (sub_9a6654(a0) == 1)
                goto LABEL_9b33e0;
            if (sub_9625a4(a0, 0) == 5)
            {
                v12 = *(int *)___error();
                if (*(int *)___error() == 54 || *(int *)___error() == 32)
                {
                    *(unsigned int *)&a0->field_68 = 1;
                    goto LABEL_9b33e0;
                }
            }
            break;
        case 41:
            if (a0->field_508)
                goto LABEL_9b33e0;
            v8 = a0->field_950;
            v3 = a0->field_18;
            v9 = (int)v3->field_d8[80];
            if (v8 & 1 && (v9 >> 3 & 1 || !(v8 >> 3 & 1) || v3->field_0 < 772 || v3->field_0 == 0x10000 || *(int *)&a0->padding_9d8[456] == 3) && (!(v8 >> 2 & 1) || *(int *)&a0[1].padding_0[12] <= 0))
            {
                if (a0->field_300->field_20 & 4)
                    v10 = ((unsigned int)v8 * 0x80000000 | (unsigned int)v8 >> 1) & 0x80000001 & 1;
                else
                    v10 = 1;
                if (!(a0->field_300->field_20 & 80))
                    if (!(v10 & 1))
                        goto LABEL_9b32b4;
                    else
                        goto LABEL_9b33e0;
            }
LABEL_9b32b4:
            if (v9 >> 3 & 1)
            {
                *(unsigned int *)&a0->padding_9d8[348] = 0;
                goto LABEL_9b33e0;
            }
LABEL_9b3374:
            if (v3->field_0 < 772)
            {
                *(unsigned int *)&a0->padding_9d8[348] = 0;
                goto LABEL_9b33e0;
            }
            else if (v3->field_0 != 0x10000)
            {
                if (!(*((char *)&a0->field_9b0 + 4) & 1))
                    goto LABEL_9b33e0;
                *(unsigned int *)&a0->padding_9d8[348] = 0;
                goto LABEL_9b33e0;
            }
            else
            {
                *(unsigned int *)&a0->padding_9d8[348] = 0;
                goto LABEL_9b33e0;
            }
        case 39:
LABEL_9b30d0:
            if ((int)a0->field_8d0 == 1)
            {
                if (sub_9a6654())
                    goto LABEL_9b33e0;
                return 4;
            }
            v11 = a0->field_18->field_d8;
            if (!((char)((char)v11[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
                (*(long long *)v11)();
            (long long)v11[16]();
        case 46:
            if (sub_9a6654() == 1)
            {
                v7 = sub_970188(a0, 1);
                if ((unsigned int)v7)
                    goto LABEL_9b33e0;
                return v7;
            }
            break;
        default:
LABEL_9b33e0:
            goto LABEL_9b33e0;
        }
    }
    return 4;
}
