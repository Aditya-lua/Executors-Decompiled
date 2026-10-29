/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x978518..0x97872c (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_978464;
extern long long g_97872c;
extern char g_10002b0;

char sub_978518(void* a0)
{
    char v13;  // x0
    void* v14;  // x20
    unsigned long v15;  // x8
    unsigned long v16;  // x0
    long long *v0;  // [bp-0x98], Other Possible Types: char
    char v1;  // [bp-0x90]
    long long v2;  // [bp-0x88]
    uint256_t v3;  // [bp-0x80]
    char v4;  // [bp-0x60]
    char v5;  // [bp-0x58]
    char v6;  // [bp-0x50], Other Possible Types: unsigned int
    unsigned long long v7;  // [bp-0x48]
    void* v8;  // [bp-0x40], Other Possible Types: char
    char v9;  // [bp-0x30]
    unsigned long v10;  // [bp-0x28]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    if ((unsigned long long)((long long)a0[1568]) >> 25 & 1)
    {
LABEL_9786e8:
        v13 = 0;
    }
    else if ((long long)a0[1568] & 7)
    {
LABEL_978548:
        v13 = 1;
    }
    else
    {
        v13 = sub_98b87c((long long)a0[216], a0 + 104);
        if (!v13)
        {
            if (*(long long *)&g_10002b0 == v10)
                return v13;
            ___stack_chk_fail();
        }
        if (!((char)((char)a0[1571]) >> 1 & 1) && sub_97f314(*(long long *)(*(long long *)a0 + 40), a0 + 104, &v0) && !sub_98b720((long long)a0[216], v0[3], v0[4], &g_97872c, v0))
            sub_97f2dc(v0);
        v14 = a0 + 1144;
        v13 = sub_985ac0(*(long long *)*(long long *)*(long long *)a0, *(long long *)(*(long long *)*(long long *)a0 + 8), v14, __ROL__((int)a0[1568], 7) & 0xffffff81 & 1, (long long)a0[1064], (long long)a0[1056]);
        if (!v13)
        {
            if (*(long long *)&g_10002b0 == v10)
                return v13;
            ___stack_chk_fail();
        }
        if ((int)a0[1568] & 0x2000100 || !(v13 = sub_978734(a0), !v13))
        {
            sub_978b1c(a0, 1);
            v15 = (long long)a0[1568];
            *(unsigned long long *)&a0[1568] = v15 & 0xffffffffffffffbf;
            v9 = 0;
            v6 = 0;
            v8 = 0;
            *(uint128_t *)((char *)&v3 + 16) = 0;
            v4 = 0;
            v16 = (long long)a0[72];
            if (!v16)
            {
                if (!(v15 >> 41 & 1) || v15 >> 25 & 1 && !*(char *)v14)
                {
                    v16 = 0;
                }
                else
                {
                    *(int128_t *)&v3 = *(int128_t *)v14;
                    *(long long *)((char *)&v3 + 13) = (long long)v14[13];
                    v4 = 0;
                    v5 = 0;
                    *(long long *)((char *)&v3 + 24) = (long long)a0[1600];
                    v6 = __ROL__((unsigned int)v15, 7) & 0xffffff81 & 1;
                    v7 = &g_978464;
                    v8 = a0;
                    v16 = sub_972f44(&v3);
                    *(unsigned long *)&a0[72] = v16;
                    if (!v16)
                        *(unsigned long long *)&a0[1568] = (long long)a0[1568] & 0xfffffdffffffffff;
                }
            }
            sub_973bec(v16, v14);
            v1 = 0;
            *(unsigned long long *)&a0[1568] = (long long)a0[1568] | 0x8000000;
            sub_98a3ec((long long)a0[40]);
            if (sub_98a6e8((long long)a0[40], &v3, &v2, &v1))
            {
                sub_979174(a0, *(unsigned long long *)&v3, 0, v2, v1, "ssl/quic/quic_channel.c", 2175, "ch_tick_tls");
                goto LABEL_9786e8;
            }
            else
            {
                sub_982d48(sub_981228(*(long long *)a0), 0);
                goto LABEL_978548;
            }
            goto LABEL_978548;
        }
    }
    if (*(long long *)&g_10002b0 == v10)
        return v13;
    ___stack_chk_fail();
}
