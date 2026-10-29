/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa78b18..0xa78c78 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char sub_a78b18(long long a0, unsigned long long a1, char a2)
{
    long long *v18;  // x0
    long long *v19;  // x19
    long long v20;  // x0
    unsigned long long v21;  // 4112
    unsigned long long v22;  // x20
    char v23;  // x0
    unsigned long long v24;  // 4112
    char v0;  // [bp-0x130]
    char v1;  // [bp-0x120]
    char v2;  // [bp-0x110]
    unsigned long long v3;  // [bp-0x108]
    char v4;  // [bp-0x100]
    char v5;  // [bp-0xf0]
    char v6;  // [bp-0xe0]
    char v7;  // [bp-0xd0]
    char v8;  // [bp-0xc0]
    char v9;  // [bp-0xb0]
    char v10;  // [bp-0xa0]
    char v11;  // [bp-0x90]
    char v12;  // [bp-0x80]
    char v13;  // [bp-0x70]
    char v14;  // [bp-0x60]
    char v15;  // [bp-0x50]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v18 = sub_a6820c();
    if (v18)
    {
        v19 = v18;
        v15 = 0;
        v13 = 0;
        v14 = 0;
        v11 = 0;
        v12 = 0;
        v9 = 0;
        v10 = 0;
        v7 = 0;
        v8 = 0;
        v5 = 0;
        v6 = 0;
        v2 = 0;
        v4 = 0;
        v0 = 0;
        v1 = 0;
        if (!a2 && sub_a68024(a0))
            sub_a6afb8(64, 0);
        v3 = a1;
        if (sub_a7c198(v19[4]))
        {
            sub_ad6ae4(v19[1]);
            v20 = sub_ad66d4(v19[1], &v0);
            v21 = arm64g_calculate_condition(1, v20 & 0xffffffff, 1, 0);
            if (!(v21 & 1))
            {
                v22 = sub_ad69f8(v19[1], v20);
                sub_a7c1b4(v19[4]);
                v23 = v22;
                if (!v23)
                    return v23;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if (!(*(char *)(v23 + 208) & 1) || (v23 = v23, sub_a779ec()))
                {
                    v24 = arm64g_calculate_condition(0x11, /* unsupported instruction */, 1, 0);
                    if (v24 & 1)
                        return v23;
                }
                else
                {
                    sub_a78ccc(v23);
                }
            }
            else
            {
                sub_a7c1b4(v19[4]);
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
    }
    return 0;
}
