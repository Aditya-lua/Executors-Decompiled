/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x992a58..0x992b38 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_992a58_4 {
    char padding_0[8];
    long long field_8;
} st_992a58_4;

typedef struct st_992a58_1 {
    char padding_0[216];
    struct st_992a58_0 *field_d8;
} st_992a58_1;

typedef struct st_992a58_5 {
    unsigned int field_0;
    char padding_4[20];
    struct st_992a58_1 *field_18;
    char padding_20[3152];
    struct st_992a58_2 *field_c70;
    char padding_c78[104];
    struct st_992a58_4 *field_ce0;
    char padding_ce8[32];
    unsigned long long field_d08;
    char padding_d10[20];
    char field_d24;
    char padding_d25[19];
    unsigned long long field_d38;
} st_992a58_5;

typedef struct st_992a58_2 {
    char padding_0[32];
    struct st_992a58_3 *field_20;
} st_992a58_2;

typedef struct st_992a58_0 {
    char padding_0[80];
    char field_50;
} st_992a58_0;

typedef struct st_992a58_3 {
    unsigned long long field_0;
} st_992a58_3;


char sub_992a58(st_992a58_5 *a0)
{
    unsigned long v3;  // x8
    char v4;  // x19
    unsigned long v5;  // x8
    char i;  // x0
    unsigned long long *v7;  // x9
    unsigned long v8;  // x8
    unsigned long long *v9;  // x9
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
        return 0;
    v3 = a0->field_0;
    if (!(unsigned int)v3 || v3 >> 7 & 1 && (a0 = sub_980dc8(), a0))
    {
        if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
        {
            v4 = 0;
            v5 = a0->field_d08;
            if (a0->field_d08)
                goto LABEL_992af0;
        }
        else
        {
            v0 = sub_954340(a0->field_ce0->field_8);
            i = sub_9543a4(&v0);
            v4 = 0;
            if (i)
            {
                do
                {
                    v4 += *(long long *)(*(long long *)(i + 8) + 32);
                    i = sub_9543a4(&v0);
                } while (i);
            }
            v5 = a0->field_d08;
            if (a0->field_d08)
            {
LABEL_992af0:
                v7 = &a0->field_d38;
                do
                {
                    v8 = v5;
                    if (*((char *)v7 - 20) != 23)
                        return v4;
                } while ((v9 = v7 + 8, v4 += *v7, v5 = v8 - 1, v7 += 8, v8 != 1));
            }
        }
        a0->field_c70->field_20();
    }
    return 0;
}
