/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995000..0x9952e4 (740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_995000_0 {
    unsigned long long field_0;
    char field_8;
    unsigned short field_9;
} st_995000_0;

extern char g_10002b0;

long long sub_995000(long long a0, void* a1, char *a2, unsigned int a3)
{
    long long v7;  // x22
    unsigned long long v8;  // x0
    unsigned long v17;  // x0
    long long v9;  // x26
    unsigned long long n;  // x23
    st_995000_0 *v11;  // x8
    unsigned long v12;  // x9
    long long v14;  // x0
    unsigned long v15;  // x0
    long long v16;  // x25
    long long v0;  // [bp-0xc8]
    unsigned long n1;  // [bp-0xc0]
    char v2;  // [bp-0xb5]
    char v3;  // [bp-0xb4]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = *(long long *)(a0 + 4152);
    v8 = sub_a50c70(v7);
    if ((int)v8 >= 1)
    {
        v9 = a0 + 0x1000;
        n1 = v8 & 0xffffffff;
        n = v8 * 48 / v8;
        if (!a3 && sub_a4fdf4(sub_a2d030(*(long long *)(a0 + 4128))) == 2 && sub_997000(v7))
        {
            ___memcpy_chk(&v3, a0 + 4208, n1, 75);
            _memcpy(&(&v3)[n1], "666666666666666666666666666666666666666666666666", n);
            v11 = &(&v3)[n + n1];
            v11->field_0 = *(long long *)v9;
            v11->field_8 = (int)a1[4];
            v12 = (short)a1[8];
            *(unsigned short *)&(&v11->field_8)[1] = (((((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            v14 = sub_a2d030(v7);
            *(char *)&v0 = 1;
            if ((int)sub_c6aa54(v14, a2, &n1, &v3, (long long)a1[40], (long long)a1[8], (long long)a1[16], a0 + 4208, n1, v0) > 0)
            {
                v17 = sub_999d2c(a0) != 0;
                if (*(long long *)&g_10002b0 == v4)
                    return v17;
                ___stack_chk_fail();
            }
        }
        else
        {
            v15 = sub_a3f728();
            if (v15)
            {
                v16 = v15;
                v2 = (int)a1[4];
                *a2 = (unsigned long long)((long long)a1[8]) >> 8;
                a2[1] = (long long)a1[8];
                if ((int)sub_a40520() >= 1 && (int)sub_a3fe10(v16, a0 + 4208, n1) >= 1 && (int)sub_a3fe10(v16, "666666666666666666666666666666666666666666666666", n) >= 1 && (int)sub_a3fe10(v16, v9, 8) >= 1 && (int)sub_a3fe10(v16, &v2, 1) >= 1 && (int)sub_a3fe10(v16, a2, 2) >= 1 && (int)sub_a3fe10(v16, (long long)a1[40], (long long)a1[8]) >= 1 && (int)sub_a3ff7c(v16, a2, 0) >= 1 && (int)sub_a40520(v16, v7) >= 1 && (int)sub_a3fe10(v16, a0 + 4208, n1) >= 1 && (int)sub_a3fe10(v16, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", n) >= 1 && (int)sub_a3fe10(v16, a2, n1) >= 1 && (int)sub_a3ff7c(v16, a2, &v3) > 0)
                {
                    sub_a3f73c(v16);
                    v17 = sub_999d2c(a0) != 0;
                    if (*(long long *)&g_10002b0 == v4)
                        return v17;
                    ___stack_chk_fail();
                }
                sub_a3f73c(v16);
            }
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
