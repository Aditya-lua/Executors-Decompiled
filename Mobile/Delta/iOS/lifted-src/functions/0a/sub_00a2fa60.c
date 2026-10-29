/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2fa60..0xa2fd10 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2fa60_0 {
    char field_0;
    char field_1;
} st_a2fa60_0;

extern unsigned long long g_c7c2eb;

unsigned int sub_a2fa60(long long a0, unsigned int a1, long long a2)
{
    unsigned long long v9;  // x25
    unsigned long long v10;  // x24
    unsigned int v19;  // w9
    unsigned long v20;  // cc_dep1
    st_a2fa60_0 *v21;  // x23
    unsigned long long v22;  // 4108
    unsigned long long v23;  // 4108
    unsigned long long v24;  // x8
    unsigned int v25;  // w8
    char *v26;  // w24
    unsigned long v27;  // x25
    unsigned long v28;  // x25
    unsigned long long v11;  // 4108
    unsigned long long v29;  // x26
    unsigned int v30;  // x19
    unsigned long long v12;  // 4108
    unsigned long long v13;  // x22
    unsigned long long *v14;  // x21
    unsigned long long v15;  // x8
    unsigned int v16;  // x0
    long long v17;  // x20
    char *v18;  // x8
    char *v0;  // [bp-0xa0], Other Possible Types: unsigned int, unsigned long long
    unsigned long long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x78]
    char v6[8];  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    strcpy(v6, "    ");
    if (!a2)
        return 0;
    v9 = &g_c7c2eb;
    if (!a1)
    {
        v10 = &g_c7c2eb;
        v11 = arm64g_calculate_condition(4, a1, 0, 0);
        if (!(v11 & 1))
            goto LABEL_a2fab2;
LABEL_a2fab1:
        v13 = &g_c7c2eb;
    }
    else
    {
        v10 = a1;
        v12 = arm64g_calculate_condition(4, a1, 0, 0);
        if (v12 & 1)
            goto LABEL_a2fab1;
LABEL_a2fab2:
        v13 = " ";
    }
    if (sub_9e4828())
    {
        v0 = v10;
        v1 = v13;
    }
    else if (64 >= (int)sub_9e46a8(a2))
    {
        v14 = sub_954340(a2);
        v15 = "-";
        if (!sub_9e5c94(a2))
            v15 = &g_c7c2eb;
        v4 = v15;
        v5 = *v14;
        v2 = v15;
        v3 = *v14;
        v0 = v10;
        v1 = v13;
    }
    else
    {
        v16 = sub_9dd574(a2);
        if (!v16)
            return v16;
        v17 = v16;
        v18 = (char *)v16;
        v19 = *v18;
        v20 = v19 & 0xff;
        if (v19 != 45)
        {
            v21 = (st_a2fa60_0 *)v16;
            v22 = arm64g_calculate_condition(3, v20, 45, 0);
            if (!(v22 & 1))
                goto LABEL_a2fb7a;
            v24 = " (Negative)";
LABEL_a2fb79:
        }
        else
        {
            v21 = v18 + 1;
            v23 = arm64g_calculate_condition(3, v20, 45, 0);
            if (v23 & 1)
                goto LABEL_a2fb79;
LABEL_a2fb7a:
            v24 = &g_c7c2eb;
        }
        v0 = v10;
        v1 = v24;
        if ((int)sub_9d524c() >= 1 && !(v0 = &v6[0], (int)sub_9d524c(a0, "%s") < 1))
        {
            v25 = v21->field_0;
            if (56 <= (int)v25)
            {
                v0 = 0;
                if ((int)sub_9d524c(a0, "%02x") < 1)
                    goto LABEL_a2fcf0;
                if (v21->field_0)
                {
                    v9 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
                    v26 = (char *)2;
LABEL_a2fc04:
                    v1 = ___tolower();
                    v2 = ___tolower(v21->field_1);
                    v0 = v9;
                    if ((int)sub_9d524c(a0, "%s%c%c") < 1)
                        goto LABEL_a2fcf0;
                    if (v21[1].field_0)
                    {
                        v27 = (v19 == 45) + v17 + 4;
                        do
                        {
                            v28 = v27;
                            v29 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
                            if (0x11111111 >= v26 * 4008636143)
                            {
                                v0 = &v6[0];
                                if ((int)sub_9d524c(a0, ":\n%s") < 1)
                                    goto LABEL_a2fcf0;
                                v29 = &g_c7c2eb;
                            }
                            v1 = ___tolower();
                            v2 = ___tolower(*(char *)(v28 - 1));
                            v0 = v29;
                            if ((int)sub_9d524c(a0, "%s%c%c") < 1)
                                goto LABEL_a2fcf0;
                        } while ((v26 += 1, v27 = v28 + 2, *(char *)v28));
                    }
                }
            }
            else if ((char)v25)
            {
                v26 = (char *)1;
                goto LABEL_a2fc04;
            }
            v30 = (int)sub_9d524c(a0, "\n") > 0;
        }
        else
        {
LABEL_a2fcf0:
            v30 = 0;
        }
        sub_a6c2e4(v17, "crypto/encode_decode/encoder_lib.c", 781);
        return v30;
    }
    return sub_9d524c(a0);
}
