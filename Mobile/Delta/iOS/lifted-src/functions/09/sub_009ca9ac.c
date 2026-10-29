/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ca9ac..0x9cab08 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern unsigned int g_fffffffffffffffc;

unsigned long long sub_9ca9ac(long long a0, char *a1, unsigned long long a2, long long a3)
{
    unsigned long long v4;  // x0
    unsigned long long i;  // x23
    unsigned long long v6;  // x9
    char *v7;  // x26
    unsigned long long v8;  // x27
    unsigned long long v9;  // x28
    unsigned long long v10;  // 4117
    unsigned long long v11;  // x0
    unsigned long long v13;  // x9
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a2)
        return (int)sub_9d3fec(a0, "\n", 1) > 0;
    v4 = sub_9d4cf4(a0, a3, 128);
    if (!(unsigned int)v4)
        return v4;
    i = a2 - 1;
    if (a2 == 1)
        v6 = &g_c7c2eb;
    else
        v6 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
    v0 = *a1;
    v1 = v6;
    if ((int)sub_9d524c() < 1)
    {
        return 0;
    }
    else if (a2 != 1)
    {
        v7 = a1 + 1;
        v8 = (char *)&g_fffffffffffffffc + 3;
        v9 = 1;
        do
        {
            v10 = arm64g_calculate_condition(18, v8 - v9 / 15, v9 / 15 * 16, 0);
            if (!(v10 & 1))
            {
                if ((int)sub_9d4888(a0, "\n") >= 1)
                {
                    v11 = sub_9d4cf4(a0, a3, 128);
                    if (!(unsigned int)v11)
                        return v11;
                }
                else
                {
                    return 0;
                }
            }
            if (i == 1)
                v13 = &g_c7c2eb;
            else
                v13 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
            v0 = *v7;
            v1 = v13;
            if ((int)sub_9d524c() < 1)
                return 0;
            v9 += 1;
            v7 += 1;
            v8 -= 1;
            i -= 1;
        } while (i);
    }
    return (int)sub_9d3fec(a0, "\n", 1) > 0;
}
