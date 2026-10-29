/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20620..0xa207d4 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_a20620(long long a0, unsigned long long a1, char *a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x25
    unsigned long long v10;  // x26
    unsigned long long v13;  // x9
    unsigned long long v14;  // x0
    unsigned long v0;  // [bp-0x110], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x108]
    unsigned long n;  // [bp-0x100]
    char v3;  // [bp-0xf5]
    char v4;  // [bp-0xf4]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (a4 >= 1)
    {
        if (a4 < 128)
            v8 = a4;
        else
            v8 = 128;
        ___memset_chk();
        if (1 > (int)sub_9d3fec(a0, &v3, v8))
        {
            if (*(long long *)&g_10002b0 == v5)
                return 0;
            ___stack_chk_fail();
        }
    }
    else
    {
        v8 = 0;
    }
    v0 = a1;
    if ((int)sub_9d524c(a0, "%s") >= 1)
    {
        v9 = 0;
        v10 = 0;
        n = (unsigned int)v8 + 4;
        do
        {
            if (!a3)
            {
                v14 = (int)sub_9d3fec(a0, "\n", 1) > 0;
                if (*(long long *)&g_10002b0 == v5)
                    return v14;
                ___stack_chk_fail();
            }
            if (!(v9 - v10 / 15 + v10 / 15 * 16) && !(v3 = 10, ___memset_chk(&v4, 32, n, 132), 1 <= (int)sub_9d3fec(a0, &v3, (unsigned int)v8 + 5)))
                break;
            v10 += 1;
            if (a3 == 1)
                v13 = &g_c7c2eb;
            else
                v13 = L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
            v0 = *a2;
            v1 = v13;
            v9 -= 1;
            a2 += 1;
            a3 -= 1;
        } while ((int)sub_9d524c() >= 1);
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
