/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b0600..0x9b0894 (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b0600_1 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_9b0600_1;

typedef struct st_9b0600_0 {
    char padding_0[288];
    char field_120;
} st_9b0600_0;

typedef struct st_9b0600_3 {
    char padding_0[8];
    struct st_9b0600_0 *field_8;
    char padding_10[8];
    struct st_9b0600_1 *field_18;
    char padding_20[80];
    unsigned long long field_70;
    unsigned int field_78;
    char padding_7c[124];
    long long field_f8;
    char padding_100[1008];
    unsigned long long field_4f0;
    char padding_4f8[1032];
    long long field_900;
    char padding_908[88];
    struct st_9b0600_4 *field_960;
    char padding_968[544];
    struct st_9b0600_2 *field_b88;
    char padding_b90[24];
    long long field_ba8;
} st_9b0600_3;

typedef struct st_9b0600_2 {
    char padding_0[80];
    char field_50;
} st_9b0600_2;

typedef struct st_9b0600_4 {
    char field_0;
} st_9b0600_4;

extern char g_9a5ae4;
extern char g_9a6620;

long long sub_9b0600(st_9b0600_3 *a0, unsigned long a1, char a2, char a3)
{
    char v2;  // w22
    st_9b0600_0 *v3;  // x23
    st_9b0600_1 *v4;  // x8
    unsigned long v5;  // x9
    unsigned long long idx;  // x8
    char *v7;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)&a0->padding_7c[0x44];
    v3 = a0->field_8;
    if (a2)
    {
        if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
        {
            sub_9ebcf4(a0->field_f8);
            a0->field_f8 = 0;
        }
        if (!sub_95f408(a0))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 1460, "tls_finish_handshake");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            return 0;
        }
        *(unsigned long long *)&a0->padding_100[8] = 0;
    }
    if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && !a0->field_78 && (int)a0->field_ba8 == 4)
        *(unsigned int *)&a0->field_ba8 = 1;
    if (v2)
    {
        *(unsigned int *)&a0->padding_b90[16] = 0;
        *(unsigned int *)&a0->padding_7c[0] = 0;
        *(unsigned int *)&a0->padding_7c[0x44] = 0;
        *(unsigned int *)&a0->padding_968[248] = 0;
        sub_9543e4(a0);
        v4 = a0->field_18;
        v5 = (int)v4->field_d8[80];
        if (a0->field_78)
        {
            if (v5 >> 3 & 1 || v4->field_0 < 772 || v4->field_0 == 0x10000)
                sub_962408(a0, 2);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            a0->field_70 = &g_9a6620;
        }
        else
        {
            if (v5 >> 3 & 1 || v4->field_0 < 772 || v4->field_0 == 0x10000)
            {
                sub_962408(a0, 1);
            }
            else if (a0->field_b88->field_50 & 1)
            {
                sub_966abc(a0->field_b88, a0->field_900);
            }
            if (*(int *)&a0->padding_4f8[16])
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
            }
            a0->field_70 = &g_9a5ae4;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
        }
        if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1)
        {
            idx = a0->field_4f0;
            *(unsigned short *)(idx + 272) = 0;
            *(unsigned int *)(idx + 268) = 0;
            sub_953538(a0);
        }
    }
    v7 = a0->field_960;
    if (a0->field_960)
    {
        sub_9a57a8(a0, 0);
    }
    else
    {
        v7 = *(long long *)&v3->field_120;
        sub_9a57a8(a0, 0);
        if (!v7)
            goto LABEL_9b0864;
    }
    if (v2 || (char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || !*(long long *)&a0->padding_100[352] || !*(long long *)&a0->padding_100[488])
        v7();
LABEL_9b0864:
    if (!a3)
    {
        sub_9a57a8(a0, 1);
        return 2;
    }
    return 1;
}
