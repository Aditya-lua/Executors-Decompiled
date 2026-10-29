/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae405c..0xae4284 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae405c_0 {
    struct st_ae405c_1 *field_0;
    struct st_ae405c_1 *field_8;
} st_ae405c_0;

typedef struct st_ae405c_1 {
    long long field_0;
    long long field_8;
} st_ae405c_1;

typedef struct st_ae405c_2 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ae405c_0 *field_8;
} st_ae405c_2;

extern unsigned long long g_c7c2eb;

int sub_ae405c(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v6;  // x27
    long long v7;  // x21
    unsigned long v8;  // x22
    long long v9;  // x25
    st_ae405c_2 *v10;  // x26
    long long *v11;  // x9
    long long *v12;  // x8
    long long v13;  // x0
    long long v14;  // x0
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a3;
    v7 = a1;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v8 = 0;
    v9 = " == ";
    v2 = v6;
    v3 = v7;
    do
    {
        v10 = sub_ad69f8(v7, v8);
        v0 = v6;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2, "%*s") < 1)
        {
LABEL_ae4260:
            return 0;
        }
        if (v10->field_0 != 1)
        {
            if (v10->field_0)
                return 0;
            if ((int)sub_9c3060(a2, v10->field_8->field_0) >= 1 && (int)sub_9d4888(a2, v9) >= 1 && 1 <= (int)sub_9c3060(a2, v10->field_8->field_8))
                continue;
            goto LABEL_ae4260;
        }
        v11 = &v10->field_8->field_0->field_0;
        v12 = &v10->field_8->field_8->field_0;
        v13 = sub_a99eac(*v11);
        v14 = sub_a99eac(*v12);
        if ((int)sub_9c3060(a2, *v11) < 1 || (int)sub_9d4888(a2, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺") < 1 || (int)sub_af961c(a2, v13, v11[1], 0) < 1 || (int)sub_9d4888(a2, v9) < 1 || (int)sub_9c3060(a2, *v12) < 1 || (int)sub_9d4888(a2, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺") < 1 || !(v6 = v2, v7 = v3, (int)sub_af961c(a2, v14, v12[1], 0) >= 1))
            goto LABEL_ae4260;
        if ((int)sub_9d4888(a2, "\n") <= 0)
            return 0;
        v8 = (unsigned int)v8 + 1;
    } while ((int)v8 < (int)sub_ad69e4(v7));
    return 1;
}
