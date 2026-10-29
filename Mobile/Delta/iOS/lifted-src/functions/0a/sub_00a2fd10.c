/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2fd10..0xa2fe88 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

long long sub_a2fd10(long long a0, unsigned long long a1, char *a2, unsigned long a3)
{
    unsigned long v4;  // x23
    unsigned long long v5;  // x9
    char *v6;  // x26
    unsigned long long v7;  // x27
    unsigned long v8;  // x28
    unsigned long long v9;  // 4117
    unsigned long long v11;  // x9
    unsigned long long v0;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a1;
    if ((int)sub_9d524c() < 1)
        return 0;
    if (!a3)
    {
        return (int)sub_9d524c(a0, "\n") > 0;
    }
    else if ((int)sub_9d524c(a0, "    ") >= 1)
    {
        v4 = a3 - 1;
        if (a3 == 1)
            v5 = &g_c7c2eb;
        else
            v5 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
        v0 = *a2;
        v1 = v5;
        if ((int)sub_9d524c() >= 1)
        {
            if (a3 != 1)
            {
                v6 = a2 + 1;
                v7 = 0xffffffffffffffff;
                v8 = 1;
                while (1)
                {
                    v9 = arm64g_calculate_condition(18, v7 - v8 / 15, v8 / 15 * 16, 0);
                    if (!(v9 & 1) && ((int)sub_9d524c(a0, "\n") < 1 || (int)sub_9d524c(a0, "    ") < 1))
                        break;
                    if (v4 == 1)
                        v11 = &g_c7c2eb;
                    else
                        v11 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
                    v0 = *v6;
                    v1 = v11;
                    if ((int)sub_9d524c() < 1)
                        return 0;
                    v8 += 1;
                    v6 += 1;
                    v7 -= 1;
                    v4 -= 1;
                    if (!v4)
                        return (int)sub_9d524c(a0, "\n") > 0;
                }
            }
            else
            {
                return (int)sub_9d524c(a0, "\n") > 0;
            }
        }
    }
    return 0;
}
