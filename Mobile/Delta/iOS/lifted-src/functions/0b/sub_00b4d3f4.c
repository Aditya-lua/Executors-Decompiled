/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4d3f4..0xb4d580 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4d3f4_0 {
    char padding_0[28];
    char field_1c;
} st_b4d3f4_0;

extern char g_10002b0;

char sub_b4d3f4(st_b4d3f4_0 *a0, char a1)
{
    char v26;  // x0
    char v27;  // x0
    char v28;  // x22
    char *v0;  // [bp-0x198]
    char *v1;  // [bp-0x190]
    char v2;  // [bp-0x188]
    char v3;  // [bp-0x180]
    char v4;  // [bp-0x170]
    char v5;  // [bp-0x160]
    char v6;  // [bp-0x150]
    char v7;  // [bp-0x140]
    char v8;  // [bp-0x130]
    char v9;  // [bp-0x120]
    char v10;  // [bp-0x110]
    char v11;  // [bp-0x100]
    char v12;  // [bp-0xf0]
    char v13;  // [bp-0xe0]
    char v14;  // [bp-0xd0]
    char v15;  // [bp-0xc0]
    char v16;  // [bp-0xb0]
    char v17;  // [bp-0xa0]
    char v18;  // [bp-0x90]
    char v19;  // [bp-0x80]
    char v20;  // [bp-0x70]
    char v21;  // [bp-0x60]
    char v22;  // [bp-0x50]
    unsigned long v23;  // [bp-0x48]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v2 = 0;
    v26 = (char)a0;
    if (v26)
    {
        if (!a1 || !*(long long *)a1)
        {
LABEL_b4d540:
            v26 = 1;
        }
        else if (!sub_a6fbc4(a1, "nonce-type") || !(v26 = sub_a6ffcc(), !v26))
        {
            v27 = sub_a6fbc4(a1, "digest");
            if (v27)
            {
                v22 = 0;
                v20 = 0;
                v21 = 0;
                v18 = 0;
                v19 = 0;
                v16 = 0;
                v17 = 0;
                v14 = 0;
                v15 = 0;
                v12 = 0;
                v13 = 0;
                v10 = 0;
                v11 = 0;
                v8 = 0;
                v9 = 0;
                v6 = 0;
                v7 = 0;
                v4 = 0;
                v5 = 0;
                v3 = 0;
                v0 = &v3;
                v1 = &v19;
                v28 = sub_a6fbc4(a1, "properties");
                if (!sub_a71220(v27, &v1, 50) || v28 && !sub_a71220(v28, &v0, 0x100))
                    goto LABEL_b4d574;
                v26 = sub_b4dd58(a0, &v19, &v3);
                if (v26)
                    goto LABEL_b4d504;
            }
            else
            {
LABEL_b4d504:
                if (!sub_a6fbc4(a1, "digest-size"))
                    goto LABEL_b4d540;
                v26 = sub_a70ef8();
                if (v26)
                {
                    if (a0->field_1c >> 1 & 1 || v2 == *(long long *)&a0[12].padding_0[20])
                    {
                        *(unsigned long long *)&a0[12].padding_0[20] = v2;
                        goto LABEL_b4d540;
                    }
                    else
                    {
LABEL_b4d574:
                        v26 = 0;
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v23)
        return v26;
    ___stack_chk_fail();
}
