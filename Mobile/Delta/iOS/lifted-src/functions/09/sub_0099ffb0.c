/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99ffb0..0x9a008c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99ffb0_0 {
    struct st_99ffb0_1 *field_0;
    long long field_8;
} st_99ffb0_0;

typedef struct st_99ffb0_1 {
    unsigned short field_0;
} st_99ffb0_1;


long long sub_99ffb0(void* a0, st_99ffb0_0 *a1)
{
    unsigned long v2;  // x10
    long long v3;  // x20
    unsigned long v4;  // x21
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((unsigned long long)a1->field_8 >= 2)
    {
        v2 = *(short *)a1->field_0;
        v3 = (unsigned int)((v2 & 0xff00) >> 8) | (unsigned int)v2 * 0x100 & 0xff00ff00;
        if (a1->field_8 - 2 == v3)
        {
            v4 = a1->field_0 + 1;
            a1->field_0 = v4 + v3;
            a1->field_8 = 0;
            sub_a6c2e4((long long)a0[2848], "include/internal/packet.h", 454);
            *(uint128_t *)&a0[2848] = 0;
            if (!v3)
                return 1;
            v5 = sub_a6dac4(v4, v3, "include/internal/packet.h", 463);
            *(long long *)&a0[2848] = v5;
            if (v5)
            {
                *(long long *)&a0[2856] = v3;
                return 1;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 2050, "tls_parse_stoc_cookie");
    sub_9a58a4(a0, 50, 159, 0);
    return 0;
}
