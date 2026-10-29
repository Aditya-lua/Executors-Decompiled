/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb028e8..0xb02ae0 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b028e8_0 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[40];
    char field_6c;
    char padding_6d[67];
    unsigned long long field_b0;
} st_b028e8_0;

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

unsigned long long sub_b028e8(st_b028e8_0 *a0, long long a1, unsigned int a2)
{
    unsigned int v2;  // w10
    unsigned long long v3;  // x0
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    unsigned int v7;  // w9
    unsigned long long v8;  // x10
    unsigned int v9;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_b0 = &a0[1].padding_0[8];
    v2 = a0->field_40;
    if (1 < v2 - 1 || a0->field_6c >> 1 & 1)
    {
        if (g_f0d568 >> 2 & 1)
        {
            v3 = sub_9b9440(a1, a2 * 8);
            a0->field_30 = &g_9b96e0;
            a0->field_38 = 0;
            v9 = a0->field_40;
            switch (v9)
            {
            case 1:
                a0->field_38 = "B@";
                break;
            case 5:
                a0->field_38 = &g_9bb300;
                break;
            case 2:
                a0->field_38 = &g_9ba220;
                break;
            default:
                goto LABEL_b02a98;
            }
            goto LABEL_b02a98;
        }
        if (!(g_f0d568 & 1))
        {
            v3 = sub_9b8880(a1, a2 * 8);
            v4 = &g_9b8de4;
            goto LABEL_b02974;
        }
        if (v2 == 5)
        {
            v3 = sub_9b8880();
            v4 = &g_9b8de4;
            v5 = "_ ";
        }
        else
        {
            v3 = sub_9bf0e0();
            v4 = &g_9be930;
            goto LABEL_b02a80;
        }
    }
    else if (g_f0d568 >> 2 & 1)
    {
        v3 = sub_9b9660(a1, a2 * 8);
        v4 = &g_9b9740;
        v6 = &g_9ba220;
        if (a0->field_40 != 2)
            v6 = 0;
        if (a0->field_40 == 1)
            v5 = "B@";
        else
            v5 = v6;
    }
    else if (!(g_f0d568 & 1))
    {
        v3 = sub_9b8ba4(a1, a2 * 8);
        v4 = &g_9b9120;
LABEL_b02974:
        v7 = a0->field_40;
        v8 = &g_9b8864;
        goto LABEL_b02a8c;
    }
    else if (v2 == 2)
    {
        v3 = sub_9b8ba4();
        v4 = &g_9b9120;
        v5 = "_";
    }
    else
    {
        v3 = sub_9bf120();
        v4 = &g_9bebf0;
LABEL_b02a80:
        v7 = a0->field_40;
        v8 = &g_9bf170;
LABEL_b02a8c:
        if (v7 == 2)
            v5 = v8;
        else
            v5 = 0;
    }
    a0->field_30 = v4;
    a0->field_38 = v5;
LABEL_b02a98:
    if (v3 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_hw.c", 121, "cipher_hw_aes_initkey");
        sub_a36abc(57, 101, 0);
        return 0;
    }
    return 1;
}
