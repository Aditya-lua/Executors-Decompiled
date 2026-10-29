/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae019c..0xae04f0 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae019c_0 {
    unsigned int field_0;
} st_ae019c_0;

extern char g_10002b0;

unsigned long long sub_ae019c(unsigned long a0)
{
    unsigned long long v7;  // x20
    st_ae019c_0 **v8;  // x0
    unsigned long v17;  // x9
    unsigned long long v18;  // w9
    unsigned long long v19;  // x21
    unsigned long long v20;  // x9
    unsigned long v21;  // x22
    unsigned long long v22;  // x23
    unsigned long long v23;  // x24
    unsigned long v24;  // x25
    long long v25;  // x0
    unsigned long long v26;  // x8
    st_ae019c_0 **v9;  // x0
    char *v27;  // x8
    unsigned long long v28;  // w10
    unsigned long long v29;  // x0
    unsigned int v10;  // w9
    unsigned int v11;  // w11
    unsigned long long v12;  // w0
    unsigned long long v13;  // x8
    unsigned long long v14;  // x20
    unsigned long long idx;  // x0
    unsigned long long v16;  // x8
    char v0;  // [bp-0xa8]
    char v1;  // [bp-0x98]
    char v2;  // [bp-0x88]
    char v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (a0)
    {
        v7 = 0;
        while ((int)(sub_ad69e4(a0) - 1) > (int)v7)
        {
            v8 = sub_ad69f8(a0, v7);
            v9 = sub_ad69f8(a0, (unsigned int)v7 + 1);
            v10 = *(int *)*v8;
            if ((v10 & 0xfffffffe) != 2 || !(v11 = *(int *)*v9, (v11 & 0xfffffffe) == 2))
                goto LABEL_ae0254;
            v12 = (unsigned int)_memcmp();
            if (!v12)
                v13 = v10 - v11 & 0xffffffff;
            else
                v13 = v12;
            v7 = (unsigned int)v7 + 1;
            if (!(v13 >> 31 & 1))
            {
                if (*(long long *)&g_10002b0 == v4)
                    return 0;
                ___stack_chk_fail();
            }
        }
        if ((int)sub_ad69e4(a0) < 1)
            goto LABEL_ae0278;
        v14 = 0;
        while (1)
        {
            idx = sub_ad69f8(a0, v14);
            if (!idx)
            {
                if (*(long long *)&g_10002b0 == v4)
                    return idx;
                ___stack_chk_fail();
            }
            v16 = *(long long *)idx;
            if (!v16 || !*(long long *)(v16 + 8) || 2 > *(int *)v16)
            {
                v19 = 0;
                v20 = *(long long *)(idx + 8);
                if (!v20)
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            else
            {
                v17 = *(short *)*(long long *)(v16 + 8);
                v18 = (unsigned int)((v17 & 0xff00) >> 8) | (unsigned int)v17 * 0x100 & 0xff00ff00;
                if (v18 == 1)
                    v19 = 4;
                else
                    v19 = (v18 == 2) * 16;
                v20 = *(long long *)(idx + 8);
                if (!v20)
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            if (*(int *)v20)
                break;
LABEL_ae02b4:
            v14 = (unsigned int)v14 + 1;
            if ((int)sub_ad69e4(a0) <= (int)v14)
            {
                if (*(long long *)&g_10002b0 == v4)
                    return 1;
                ___stack_chk_fail();
            }
        }
        if (*(int *)v20 != 1 || (*(int *)v16 & 0xfffffffe) != 2)
        {
LABEL_ae0254:
            if (*(long long *)&g_10002b0 == v4)
                return 0;
            ___stack_chk_fail();
        }
        else
        {
            v21 = *(long long *)(v20 + 8);
            idx = sub_ad69e4(v21);
            if (!(unsigned int)idx)
            {
                if (*(long long *)&g_10002b0 == v4)
                    return idx;
                ___stack_chk_fail();
            }
            if ((int)sub_ad69e4(v21) >= 2)
            {
                v22 = 0;
                v23 = v19 & 0xffffffff;
            }
            else
            {
LABEL_ae045c:
                v29 = sub_ad69f8(v21, sub_ad69e4(v21) - 1);
                if (v29 && *(int *)v29 == 1)
                {
                    idx = sub_adff4c();
                    if (!(unsigned int)idx)
                    {
                        if (*(long long *)&g_10002b0 == v4)
                            return idx;
                        ___stack_chk_fail();
                    }
                    else if (0 < (int)_memcmp(&v3, &v2, v19 & 0xffffffff))
                    {
                        if (*(long long *)&g_10002b0 == v4)
                            return 0;
                        ___stack_chk_fail();
                    }
                    else if (!(sub_ae0540(&v3, &v2, v19) >> 31 & 1))
                    {
                        if (*(long long *)&g_10002b0 == v4)
                            return 0;
                        ___stack_chk_fail();
                    }
                }
                goto LABEL_ae02b4;
            }
            while (1)
            {
                v24 = sub_ad69f8(v21, v22);
                v22 = (unsigned int)v22 + 1;
                v25 = sub_ad69f8(v21, v22);
                idx = sub_adff4c(v24, &v3, &v2, v19);
                if (!(unsigned int)idx || !(idx = sub_adff4c(v25, &v1, &v0, v19), (unsigned int)idx))
                    break;
                if (!(_memcmp(&v3, &v1, v23) >> 31 & 1))
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
                if (0 < (int)_memcmp(&v3, &v2, v23))
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
                if (0 < (int)_memcmp(&v1, &v0, v23))
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
                v26 = v23;
                do
                {
                } while ((long long)v26 >= 1 && (v27 = &(&v1)[v26], v28 = *(v27 - 1), *(v27 - 1) = v28 - 1, v26 -= 1, !v28));
                if (!(_memcmp(&v2, &v1, v23) >> 31 & 1))
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
                if (*(int *)v24 == 1 && !(sub_ae0540(&v3, &v2, v19) >> 31 & 1))
                    goto LABEL_ae0254;
                if ((int)(sub_ad69e4(v21) - 1) <= (int)v22)
                    goto LABEL_ae045c;
            }
        }
    }
    else
    {
LABEL_ae0278:
        idx = 1;
    }
    if (*(long long *)&g_10002b0 == v4)
        return idx;
    ___stack_chk_fail();
}
