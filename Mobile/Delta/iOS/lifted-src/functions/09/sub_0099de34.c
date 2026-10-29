/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99de34..0x99dfcc (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99de34_0 {
    char padding_0[776];
    unsigned long long field_308;
    char padding_310[40];
    unsigned long long field_338;
    char padding_340[414];
    unsigned short field_4de;
    char padding_4e0[1008];
    unsigned int field_8d0;
} st_99de34_0;


long long sub_99de34(st_99de34_0 *a0, long long a1, unsigned int a2, unsigned long a3)
{
    unsigned long v3;  // x21
    unsigned long v4;  // x0
    long long v5;  // x23
    long long v6;  // x22
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a0->field_338 > a3)
    {
        if (a0->field_8d0 == 1 && !(v3 = *(long long *)&a0->padding_310[8 * a3], !*(long long *)&a0->padding_310[8 * a3]))
            goto LABEL_99dea8;
        sub_c65224(a0);
    }
    else
    {
        v3 = sub_956ba0(a0, a2 & 0xffff);
        if (!v3)
            return v3;
LABEL_99dea8:
        v4 = sub_a5b7c4(v3, &v0);
        if (v4)
        {
            v5 = 786691;
            if (sub_c68d5c(a1, a2, 2) && sub_a6ec4c(a1, v0, v4, 2))
            {
                if (!a3)
                {
                    a0->field_308 = v3;
                    a0->field_4de = a2;
                }
                *(unsigned long *)&a0->padding_310[8 * a3] = v3;
                *(unsigned short *)&a0->padding_310[32 + 2 * a3] = a2;
                if (a3 >= a0->field_338)
                    a0->field_338 = a0->field_338 + 1;
                sub_a6c2e4(v0, "ssl/statem/extensions_clnt.c", 690);
                return 1;
            }
            v6 = 675;
        }
        else
        {
            v5 = 524304;
            v6 = 668;
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", v6, "add_key_share");
        sub_9a58a4(a0, 80, v5, 0);
        if (v3 != *(long long *)&a0->padding_310[8 * a3])
            sub_a5a4c8(v3);
        sub_a6c2e4(v0, "ssl/statem/extensions_clnt.c", 696);
    }
    return 0;
}
