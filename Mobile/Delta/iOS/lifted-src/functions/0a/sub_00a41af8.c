/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41af8..0xa41d14 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a41af8_0 {
    char padding_0[248];
    unsigned long long field_f8;
    unsigned long long field_100;
} st_a41af8_0;

extern unsigned long long g_9b8864;
extern unsigned long long g_9b8de4;
extern unsigned long long g_9b9120;
extern unsigned long long g_9b96e0;
extern unsigned long long g_9b9740;
extern unsigned long long g_9ba220;
extern unsigned long long g_9bb300;
extern unsigned long long g_9be930;
extern unsigned long long g_9bebf0;
extern unsigned long long g_9bf170;
extern unsigned int g_f0d568;

unsigned long long sub_a41af8(long long a0, long long a1, unsigned long a2, unsigned long long a3)
{
    st_a41af8_0 *v2;  // x19
    unsigned long long v3;  // w0
    st_a41af8_0 *v12;  // x2
    long long v13;  // x0
    long long v14;  // x1
    st_a41af8_0 *v15;  // x2
    long long v16;  // x19
    long long v17;  // x20
    long long v4;  // x22
    unsigned int v5;  // w20
    unsigned long long v6;  // 4118
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    long long v10;  // x0
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v3 = (unsigned int)sub_a50904(a0);
    if (v3 >= 1)
    {
        v4 = v3 * 8;
        v5 = sub_a4fdf4(sub_a2d030(a0));
        if (!(!a3 && (v6 = arm64g_calculate_condition(49, v5 - 3, 2, 0), !(v6 & 1))))
        {
            if (g_f0d568 >> 2 & 1)
            {
                v7 = sub_9b9440(a1, v4, v2);
                v2->field_f8 = &g_9b96e0;
                v2->field_100 = 0;
                switch (v5)
                {
                case 2:
                    v2->field_100 = &g_9ba220;
                    break;
                case 5:
                    v2->field_100 = &g_9bb300;
                    break;
                default:
                    goto LABEL_a41cbc;
                }
                goto LABEL_a41cbc;
            }
            if (v5 == 5 && g_f0d568 & 1)
            {
                v7 = sub_9b8880(a1, v4, v2);
                v8 = &g_9b8de4;
                v9 = "_ ";
            }
            else
            {
                v13 = a1;
                v14 = v4;
                v15 = v2;
                if (g_f0d568 & 1)
                {
                    v7 = sub_9bf0e0(v13, v14, v15);
                    v8 = &g_9be930;
                    goto LABEL_a41c80;
                }
                else
                {
                    v7 = sub_9b8880(v13, v14, v15);
                    v8 = &g_9b8de4;
                    goto LABEL_a41ca8;
                }
            }
        }
        else if (g_f0d568 >> 2 & 1)
        {
            v7 = sub_9b9660(a1, v4, v2);
            v8 = &g_9b9740;
            v9 = &g_9ba220;
            goto LABEL_a41cb0;
        }
        else if (v5 == 2 && g_f0d568 & 1)
        {
            v7 = sub_9b8ba4(a1, v4, v2);
            v8 = &g_9b9120;
            v9 = "_";
        }
        else
        {
            v10 = a1;
            v11 = v4;
            v12 = v2;
            if (g_f0d568 & 1)
            {
                v7 = sub_9bf120(v10, v11, v12);
                v8 = &g_9bebf0;
LABEL_a41c80:
                v9 = &g_9bf170;
            }
            else
            {
                v7 = sub_9b8ba4(v10, v11, v12);
                v8 = &g_9b9120;
LABEL_a41ca8:
                v9 = &g_9b8864;
            }
LABEL_a41cb0:
            if (v5 != 2)
                v9 = 0;
        }
        v2->field_f8 = v8;
        v2->field_100 = v9;
LABEL_a41cbc:
        if (!(v7 >> 31 & 1))
            return 1;
        v16 = 143;
        v17 = 2504;
    }
    else
    {
        v16 = 130;
        v17 = 2423;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/e_aes.c", v17, "aes_init_key");
    sub_a36abc(6, v16, 0);
    return 0;
}
