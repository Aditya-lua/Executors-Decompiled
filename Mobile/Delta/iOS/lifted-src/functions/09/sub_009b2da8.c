/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2da8..0x9b2fec (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b2da8_2 {
    int field_0;
    char padding_4[212];
    struct st_9b2da8_0 *field_d8;
} st_9b2da8_2;

typedef struct st_9b2da8_4 {
    char padding_0[24];
    struct st_9b2da8_2 *field_18;
    char padding_20[140];
    int field_ac;
    char padding_b0[64];
    unsigned int field_f0;
    char padding_f4[108];
    unsigned long long field_160;
    char padding_168[1944];
    struct st_9b2da8_3 *field_900;
    char padding_908[528];
    unsigned int field_b18;
} st_9b2da8_4;

typedef struct st_9b2da8_3 {
    char padding_0[760];
    unsigned long long field_2f8;
} st_9b2da8_3;

typedef struct st_9b2da8_0 {
    struct st_9b2da8_1 *field_0;
    char padding_8[8];
    struct st_9b2da8_1 *field_10;
    char padding_18[56];
    char field_50;
} st_9b2da8_0;

typedef struct st_9b2da8_1 {
    unsigned long long field_0;
} st_9b2da8_1;


unsigned long long sub_9b2da8(st_9b2da8_4 *a0)
{
    int v2;  // w9
    st_9b2da8_0 *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_ac;
    if (v2 <= 23)
    {
        switch (v2)
        {
        case 1:
LABEL_9b2e80:
        case 21:
            *(unsigned int *)&a0->padding_20[100] = 0;
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
            {
                sub_953584();
                break;
            }
            break;
        case 23:
            *(unsigned int *)&a0->padding_20[100] = 0;
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
            {
                sub_953584();
                *(unsigned int *)&a0->padding_b0[24] = 0;
                break;
            }
            break;
        default:
            return 2;
        }
    }
    else if (38 >= v2)
    {
        switch (v2)
        {
        case 24:
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
            {
                *(unsigned int *)&a0->padding_b0[24] = 1;
                break;
            }
            break;
        case 37:
            if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
            {
                if (a0->field_18->field_0 < 772)
                    return 2;
                if (a0->field_18->field_0 == 0x10000)
                    return 2;
                if (!*(long long *)&a0[1].padding_908[308] && !*(int *)&a0->padding_908[348])
                    goto LABEL_9b2e80;
            }
            else
            {
                *(unsigned int *)&a0->padding_b0[24] = 0;
                break;
            }
        default:
            return 2;
        }
    }
    else
    {
        switch (v2)
        {
        case 39:
            v3 = a0->field_18->field_d8;
            if (v3->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
            {
                if (!a0->field_900->field_2f8)
                {
                    a0->field_900->field_2f8 = *(long long *)&a0->padding_168[408];
                }
                else if (a0->field_900->field_2f8 != *(long long *)&a0->padding_168[408])
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 818, "ossl_statem_server_pre_work");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    return 0;
                }
                v3->field_0();
            }
            break;
        case 50:
            if ((a0->field_f0 == 9 || a0->field_160 >> 11 & 1) && a0->field_160 >> 13 & 1 && a0->field_f0 != 12 && a0->field_b18 == 2)
            {
                a0->field_f0 = 12;
                a0->field_18->field_d8->field_10();
            }
            break;
        default:
            return 2;
        }
    }
    return 2;
}
