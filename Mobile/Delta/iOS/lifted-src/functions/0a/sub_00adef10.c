/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadef10..0xadf094 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adef10_0 {
    unsigned int field_0;
    char padding_4[4];
    char *field_8;
} st_adef10_0;

extern unsigned long long g_c7c2eb;

unsigned long long sub_adef10(long long a0, st_adef10_0 *a1, long long a2)
{
    unsigned long v4;  // x21
    unsigned long long v5;  // x9
    unsigned long long v6;  // x25
    char *v7;  // x26
    unsigned long long v8;  // x27
    unsigned int v9;  // w28
    unsigned int v10;  // w21
    unsigned long long v12;  // x9
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_0;
    if ((int)v4 < 1)
        return sub_9d3fec(a0, "\n", 1) == 1;
    if ((int)sub_9d4cf4(a0, a2) < 1)
        return 0;
    v5 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
    if ((unsigned int)v4 == 1)
        v5 = &g_c7c2eb;
    v0 = *a1->field_8;
    v1 = v5;
    if ((int)sub_9d524c() >= 1)
    {
        v6 = ((unsigned int)v4 & ~((int)((unsigned int)v4) >> 31)) - 1;
        v7 = a1->field_8 + 1;
        v8 = v4 - 2;
        v9 = 0xffffffff;
        v10 = 1;
        do
        {
            if (!v6)
                return sub_9d3fec(a0, "\n", 1) == 1;
            if (!(v9 + v10 / 18 * 18) && ((int)sub_9d3fec(a0, "\n", 1) < 1 || 1 > (int)sub_9d4cf4(a0, a2, a2)))
                break;
            v12 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
            if (!v8)
                v12 = &g_c7c2eb;
            v0 = *v7;
            v1 = v12;
            v6 -= 1;
            v9 -= 1;
            v10 += 1;
            v8 -= 1;
            v7 += 1;
        } while ((int)sub_9d524c() >= 1);
    }
    return 0;
}
