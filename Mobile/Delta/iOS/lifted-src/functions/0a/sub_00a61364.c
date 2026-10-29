/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa61364..0xa61584 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a61364_0 {
    char padding_0[8];
    struct st_a61364_1 *field_8;
    long long field_10;
    struct st_a61364_1 *field_18;
    struct st_a61364_1 *field_20;
    struct st_a61364_1 *field_28;
    unsigned int field_30;
} st_a61364_0;

typedef struct st_a61364_1 {
    char field_0;
} st_a61364_1;

extern unsigned long long g_c7c2eb;

char * sub_a61364(long long a0, st_a61364_0 *a1, unsigned long long a2)
{
    char *v4;  // x24
    char *v5;  // x25
    char *v6;  // x8
    char *v7;  // x25
    unsigned long long v8;  // x8
    unsigned long long v9;  // 4118
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!sub_9cab08() || !sub_9cab08(a0, "generator G:", a1->field_10, 0, a2) || a1->field_8 && !sub_9cab08(a0, "subgroup order Q:") || a1->field_18 && !sub_9cab08(a0, "subgroup factor:"))
        return 0;
    if (!a1->field_20)
    {
LABEL_a61518:
        v9 = arm64g_calculate_condition(1, a1->field_30, 1, 0);
        if (v9 & 1 || sub_9d4cf4(a0, a2, 128) && (v0 = a1->field_30, (int)sub_9d524c(a0, "counter: %d\n") > 0))
            return 1;
    }
    else if (sub_9d4cf4(a0, a2, 128) && (int)sub_9d4888(a0, "seed:") >= 1)
    {
        v4 = 0;
        v5 = 0;
        while (1)
        {
            v6 = a1->field_28;
            if (a1->field_28 <= v5)
                break;
            if (!&v4[-1 * v5 / 15 + 16 * v5 / 15])
            {
                if ((int)sub_9d4888(a0, "\n") < 1)
                {
                    return 0;
                }
                else if (sub_9d4cf4(a0, (unsigned int)a2 + 4, 128))
                {
                    v6 = a1->field_28;
                }
                else
                {
                    return 0;
                }
            }
            v7 = v5 + 1;
            if (v7 == v6)
                v8 = &g_c7c2eb;
            else
                v8 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
            v0 = *(char *)(a1->field_20 + v5);
            v1 = v8;
            v4 -= 1;
            v5 = v7;
            if ((int)sub_9d524c() < 1)
                return 0;
        }
        if ((int)sub_9d3fec(a0, "\n", 1) < 1)
            return 0;
        goto LABEL_a61518;
    }
    return 0;
}
