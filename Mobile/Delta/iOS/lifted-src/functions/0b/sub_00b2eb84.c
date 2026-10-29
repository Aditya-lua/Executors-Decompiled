/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2eb84..0xb2ee4c (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2eb84_1 {
    struct st_b2eb84_1 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
} st_b2eb84_1;

typedef struct st_b2eb84_0 {
    long long field_0;
    char *field_8;
    struct st_b2eb84_1 *field_10;
    struct st_b2eb84_1 *field_18;
    char padding_20[8];
    struct st_b2eb84_1 *field_28;
    char field_30;
    char padding_31[7];
    char field_38;
    char padding_39[7];
    char field_40;
    char padding_41[7];
    char field_48;
    char padding_49[7];
    char field_50;
    char padding_51[7];
    char field_58;
    char padding_59[11];
    struct st_b2eb84_1 *field_64;
} st_b2eb84_0;


char * sub_b2eb84(st_b2eb84_0 *a0, char *a1)
{
    long long v3;  // x0
    char *v4;  // x0
    char *v13;  // x0
    char *v14;  // x0
    char *v15;  // x0
    char *v16;  // x0
    char *v5;  // x0
    char *v7;  // x0
    char *v8;  // w8
    char *v9;  // x0
    char *v10;  // x0
    char *v11;  // x0
    char *v12;  // x0
    char *v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9f2aec(a0->field_0);
    if (!a1 || !*(long long *)a1)
        return 1;
    v4 = sub_afe4cc(&a0->field_10, a1, 0, 0, 0, v3);
    if (!(unsigned int)v4)
        return v4;
    v5 = a0->field_10;
    if (v5)
    {
        *(unsigned int *)&(a0->padding_59)[1] = 0;
        if (sub_a5842c(sub_954340(v5), "KMAC128") || sub_a5842c(sub_954340(a0->field_10), "KMAC256"))
        {
            *(unsigned int *)&(a0->padding_59)[1] = 1;
        }
        else if (!sub_a5842c(sub_954340(a0->field_10), "HMAC") && !sub_a5842c(sub_954340(a0->field_10), "CMAC"))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/kbkdf.c", 393, "kbkdf_set_ctx_params");
            sub_a36abc(57, 151, 0);
            return 0;
        }
    }
    v7 = sub_a6fbc4(a1, "mode");
    if (v7)
    {
        if (sub_a6e258("counter", *(long long *)&v7[16], *(long long *)&v7[24]))
        {
            if (sub_a6e258("feedback", *(long long *)&v7[16], *(long long *)&v7[24]))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/kbkdf.c", 406, "kbkdf_set_ctx_params");
                sub_a36abc(57, 125, 0);
                return 0;
            }
            v8 = (char *)1;
        }
        else
        {
            v8 = (char *)0;
        }
        *(unsigned int *)&a0->field_8 = (unsigned int)v8;
    }
    if (sub_a6fbc4(a1, "key"))
    {
        v9 = sub_a718d4();
        if (!(unsigned int)v9)
            return v9;
    }
    v10 = sub_a718d4(a1, "salt", &a0->field_30, &a0->field_38);
    if (!(unsigned int)v10)
        return v10;
    v11 = sub_a71994(a1, "info", &a0->field_40, &a0->field_48, 0);
    if (!(unsigned int)v11)
        return v11;
    v12 = sub_a718d4(a1, "seed", &a0->field_50, &a0->field_58);
    if (!(unsigned int)v12)
        return v12;
    if (sub_a6fbc4(a1, "use-l"))
    {
        v13 = sub_a6fc2c();
        if (!(unsigned int)v13)
            return v13;
    }
    if (sub_a6fbc4(a1, "r"))
    {
        v0 = (char *)0;
        if (!sub_a6fc2c() || 3 < ((v0 - 8) * 0x20000000 | v0 - 8 >> 3))
            return 0;
        *(unsigned int *)&a0->field_18 = (unsigned int)v0;
    }
    if (sub_a6fbc4(a1, "use-separator"))
    {
        v14 = sub_a6fc2c();
        if (!(unsigned int)v14)
            return v14;
    }
    if (a0->field_10 && a0->field_28)
    {
        if (*(int *)&(a0->padding_59)[1])
        {
            v15 = sub_b2f17c();
            if (!(unsigned int)v15)
                return v15;
        }
        v16 = sub_a58104();
        if (!(unsigned int)v16)
            return v16;
    }
    return 1;
}
